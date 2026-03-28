package com.micklab.dcg.executor.java;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;

import com.android.tools.r8.CompilationMode;
import com.android.tools.r8.D8;
import com.android.tools.r8.D8Command;
import com.android.tools.r8.OutputMode;
import com.micklab.dcg.executor.LanguageExecutor;
import com.micklab.dcg.model.ExecutionResult;
import com.micklab.dcg.model.SourceSnippet;
import com.micklab.dcg.model.SupportedLanguage;
import com.micklab.dcg.util.DiagnosticFormatter;

import org.eclipse.jdt.core.compiler.batch.BatchCompiler;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import dalvik.system.DexClassLoader;

public class JavaExecutor implements LanguageExecutor {
    private static final String WORKSPACE_DIRECTORY = "dynamic-java";
    private static final String[] FALLBACK_BOOT_JARS = new String[]{
            "/apex/com.android.art/javalib/core-oj.jar",
            "/apex/com.android.art/javalib/core-libart.jar",
            "/system/framework/core-oj.jar",
            "/system/framework/core-libart.jar",
            "/system/framework/framework.jar",
            "/system/framework/ext.jar"
    };

    @Override
    public SupportedLanguage getLanguage() {
        return SupportedLanguage.JAVA;
    }

    @Override
    public boolean isSupported() {
        return true;
    }

    @Override
    public ExecutionResult execute(Context context, SourceSnippet snippet) {
        long startTime = SystemClock.elapsedRealtime();
        if (snippet == null) {
            return ExecutionResult.runtimeError("Java execution failed", "No snippet was supplied.", "", -1L);
        }
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
            return ExecutionResult.unsupported(
                    "Java executor requires Android 8.0+",
                    "ECJ can compile on earlier devices, but the D8 path-based dex pipeline needs API 26 or higher.",
                    "Storage, editing, import, and export still work below API 26.");
        }

        File snippetRoot = new File(new File(context.getCodeCacheDir(), WORKSPACE_DIRECTORY), safeSnippetKey(snippet));
        File runRoot = new File(snippetRoot, String.valueOf(System.currentTimeMillis()));
        File sourceRoot = new File(runRoot, "src");
        File classesDir = new File(runRoot, "classes");
        File dexDir = new File(runRoot, "dex");
        File optimizedDir = new File(runRoot, "opt");

        try {
            ensureDirectory(sourceRoot);
            ensureDirectory(classesDir);
            ensureDirectory(dexDir);
            ensureDirectory(optimizedDir);

            JavaSourceParser.ParsedJavaSource parsedSource = JavaSourceParser.parse(snippet.getContent(), snippet.getTitle());
            File sourceFile = writeSourceFile(sourceRoot, parsedSource, snippet.getContent());

            CompilationOutcome compilation = compileSource(sourceFile, classesDir, resolveCompilerClasspath());
            if (!compilation.success) {
                return ExecutionResult.compilationError(
                        "Java compilation failed",
                        "ECJ reported one or more problems in " + parsedSource.getDisplayFileName() + ".",
                        DiagnosticFormatter.formatCompilerOutput(compilation.combinedOutput(), runRoot.getAbsolutePath(), sourceFile.getAbsolutePath(), parsedSource.getDisplayFileName()),
                        elapsedSince(startTime));
            }

            File dexBundle = dexClasses(classesDir, dexDir);
            String output = loadAndRun(context, dexBundle, parsedSource.getQualifiedClassName(), optimizedDir);
            String summary = TextUtils.isEmpty(output)
                    ? "Execution finished without console output."
                    : output.trim();
            return ExecutionResult.success(
                    "Java execution succeeded",
                    parsedSource.getQualifiedClassName(),
                    summary,
                    elapsedSince(startTime));
        } catch (Throwable throwable) {
            Throwable rootCause = unwrap(throwable);
            if (rootCause instanceof IllegalArgumentException) {
                return ExecutionResult.compilationError(
                        "Java source is incomplete",
                        rootCause.getMessage(),
                        "Define a class, interface, or enum, then expose public static String run() or public static void main(String[] args).",
                        elapsedSince(startTime));
            }
            return ExecutionResult.runtimeError(
                    "Java execution failed",
                    "Compilation finished, but the generated code could not be loaded or executed.",
                    DiagnosticFormatter.formatThrowable(rootCause),
                    elapsedSince(startTime));
        } finally {
            pruneOldRuns(snippetRoot, 3);
        }
    }

    private CompilationOutcome compileSource(File sourceFile, File classesDir, String classpath) {
        List<String> arguments = new ArrayList<>();
        Collections.addAll(arguments,
                "-1.8",
                "-encoding", "UTF-8",
                "-proc:none",
                "-g",
                "-d", classesDir.getAbsolutePath());
        if (!TextUtils.isEmpty(classpath)) {
            arguments.addAll(Arrays.asList("-classpath", classpath, "-bootclasspath", classpath));
        }
        arguments.add(sourceFile.getAbsolutePath());

        StringWriter stdout = new StringWriter();
        StringWriter stderr = new StringWriter();
        boolean success = BatchCompiler.compile(
                arguments.toArray(new String[0]),
                new PrintWriter(stdout),
                new PrintWriter(stderr),
                null);
        return new CompilationOutcome(success, stdout.toString(), stderr.toString());
    }

    @TargetApi(Build.VERSION_CODES.O)
    private File dexClasses(File classesDir, File dexDir) throws Exception {
        List<Path> programFiles = collectClassFiles(classesDir);
        if (programFiles.isEmpty()) {
            throw new IOException("ECJ did not emit any .class files.");
        }
        D8Command.Builder builder = D8Command.builder()
                .setMinApiLevel(24)
                .setMode(CompilationMode.DEBUG)
                .setOutput(dexDir.toPath(), OutputMode.DexIndexed);
        for (Path programFile : programFiles) {
            builder.addProgramFiles(programFile);
        }
        D8.run(builder.build());

        File dexFile = new File(dexDir, "classes.dex");
        if (!dexFile.isFile()) {
            throw new IOException("D8 finished without producing classes.dex.");
        }
        File bundle = new File(dexDir, "classes.jar");
        packageDex(bundle, dexFile);
        return bundle;
    }

    private String loadAndRun(Context context, File dexBundle, String qualifiedClassName, File optimizedDir) throws Exception {
        DexClassLoader classLoader = new DexClassLoader(
                dexBundle.getAbsolutePath(),
                optimizedDir.getAbsolutePath(),
                null,
                context.getClassLoader());
        Class<?> dynamicClass = classLoader.loadClass(qualifiedClassName);
        Method runMethod = findRunMethod(dynamicClass);
        if (runMethod != null) {
            Object result = runMethod.invoke(null);
            return result == null ? "" : String.valueOf(result);
        }

        Method mainMethod = findMainMethod(dynamicClass);
        if (mainMethod != null) {
            return invokeMainCapturingOutput(mainMethod);
        }
        throw new IllegalStateException(DiagnosticFormatter.formatEntrypointGuidance(qualifiedClassName));
    }

    private Method findRunMethod(Class<?> dynamicClass) {
        for (Method method : dynamicClass.getDeclaredMethods()) {
            if ("run".equals(method.getName())
                    && Modifier.isStatic(method.getModifiers())
                    && method.getParameterTypes().length == 0) {
                method.setAccessible(true);
                return method;
            }
        }
        return null;
    }

    private Method findMainMethod(Class<?> dynamicClass) {
        try {
            Method mainMethod = dynamicClass.getDeclaredMethod("main", String[].class);
            if (!Modifier.isStatic(mainMethod.getModifiers())) {
                return null;
            }
            mainMethod.setAccessible(true);
            return mainMethod;
        } catch (NoSuchMethodException ignored) {
            return null;
        }
    }

    private String invokeMainCapturingOutput(Method mainMethod) throws Exception {
        PrintStream originalOut = System.out;
        PrintStream originalErr = System.err;
        ByteArrayOutputStream capture = new ByteArrayOutputStream();
        try (PrintStream interceptor = new PrintStream(capture, true, StandardCharsets.UTF_8.name())) {
            System.setOut(interceptor);
            System.setErr(interceptor);
            mainMethod.invoke(null, (Object) new String[0]);
        } catch (InvocationTargetException exception) {
            Throwable target = exception.getTargetException();
            if (target instanceof Exception) {
                throw (Exception) target;
            }
            throw exception;
        } finally {
            System.setOut(originalOut);
            System.setErr(originalErr);
        }
        String output = capture.toString(StandardCharsets.UTF_8.name()).trim();
        return output.isEmpty() ? "Execution completed via main(String[])." : output;
    }

    @TargetApi(Build.VERSION_CODES.O)
    private List<Path> collectClassFiles(File directory) {
        List<Path> classFiles = new ArrayList<>();
        collectClassFilesRecursive(directory, classFiles);
        return classFiles;
    }

    @TargetApi(Build.VERSION_CODES.O)
    private void collectClassFilesRecursive(File directory, List<Path> classFiles) {
        File[] children = directory.listFiles();
        if (children == null) {
            return;
        }
        for (File child : children) {
            if (child.isDirectory()) {
                collectClassFilesRecursive(child, classFiles);
            } else if (child.getName().endsWith(".class")) {
                classFiles.add(child.toPath());
            }
        }
    }

    @TargetApi(Build.VERSION_CODES.O)
    private void packageDex(File bundle, File dexFile) throws IOException {
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(bundle))) {
            zipOutputStream.putNextEntry(new ZipEntry("classes.dex"));
            Files.copy(dexFile.toPath(), zipOutputStream);
            zipOutputStream.closeEntry();
        }
    }

    private File writeSourceFile(File sourceRoot, JavaSourceParser.ParsedJavaSource parsedSource, String source) throws IOException {
        File sourceFile = new File(sourceRoot, parsedSource.getRelativeSourcePath());
        File parent = sourceFile.getParentFile();
        if (parent != null) {
            ensureDirectory(parent);
        }
        try (FileOutputStream outputStream = new FileOutputStream(sourceFile)) {
            outputStream.write(source.getBytes(StandardCharsets.UTF_8));
        }
        return sourceFile;
    }

    private String resolveCompilerClasspath() throws IOException {
        LinkedHashSet<String> entries = new LinkedHashSet<>();
        addExistingPathEntries(entries, System.getenv("BOOTCLASSPATH"));
        addExistingPathEntries(entries, System.getenv("SYSTEMSERVERCLASSPATH"));
        for (String jar : FALLBACK_BOOT_JARS) {
            File candidate = new File(jar);
            if (candidate.isFile()) {
                entries.add(candidate.getAbsolutePath());
            }
        }
        if (entries.isEmpty()) {
            throw new IOException("No readable Android bootclasspath entries were found for ECJ.");
        }
        return TextUtils.join(File.pathSeparator, entries);
    }

    private void addExistingPathEntries(LinkedHashSet<String> entries, String pathList) {
        if (TextUtils.isEmpty(pathList)) {
            return;
        }
        String[] segments = pathList.split(File.pathSeparator);
        for (String segment : segments) {
            File candidate = new File(segment);
            if (candidate.isFile()) {
                entries.add(candidate.getAbsolutePath());
            }
        }
    }

    private void ensureDirectory(File directory) throws IOException {
        if (directory.isDirectory()) {
            return;
        }
        if (!directory.mkdirs() && !directory.isDirectory()) {
            throw new IOException("Failed to create directory: " + directory.getAbsolutePath());
        }
    }

    private void pruneOldRuns(File snippetRoot, int keepCount) {
        File[] runs = snippetRoot.listFiles();
        if (runs == null || runs.length <= keepCount) {
            return;
        }
        List<File> directories = new ArrayList<>(Arrays.asList(runs));
        Collections.sort(directories, new Comparator<File>() {
            @Override
            public int compare(File left, File right) {
                return right.getName().compareTo(left.getName());
            }
        });
        for (int index = keepCount; index < directories.size(); index++) {
            deleteRecursively(directories.get(index));
        }
    }

    private void deleteRecursively(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            File[] children = file.listFiles();
            if (children != null) {
                for (File child : children) {
                    deleteRecursively(child);
                }
            }
        }
        file.delete();
    }

    private Throwable unwrap(Throwable throwable) {
        Throwable current = throwable;
        while (current instanceof InvocationTargetException && ((InvocationTargetException) current).getTargetException() != null) {
            current = ((InvocationTargetException) current).getTargetException();
        }
        return current;
    }

    private long elapsedSince(long startTime) {
        return SystemClock.elapsedRealtime() - startTime;
    }

    private String safeSnippetKey(SourceSnippet snippet) {
        String base = snippet.getId();
        if (base == null || base.trim().isEmpty()) {
            base = snippet.getTitle();
        }
        return SupportedLanguage.sanitizeBaseName(base);
    }

    private static final class CompilationOutcome {
        private final boolean success;
        private final String stdout;
        private final String stderr;

        private CompilationOutcome(boolean success, String stdout, String stderr) {
            this.success = success;
            this.stdout = stdout == null ? "" : stdout;
            this.stderr = stderr == null ? "" : stderr;
        }

        private String combinedOutput() {
            if (stdout.isEmpty()) {
                return stderr;
            }
            if (stderr.isEmpty()) {
                return stdout;
            }
            return stdout + "\n" + stderr;
        }
    }
}
