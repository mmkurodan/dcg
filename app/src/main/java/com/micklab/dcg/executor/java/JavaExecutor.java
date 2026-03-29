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
    private static final String APEX_ART_JAVALIB_DIRECTORY = "/apex/com.android.art/javalib";
    private static final String CORE_OJ_JAR = "core-oj.jar";
    private static final String CORE_LIBART_JAR = "core-libart.jar";
    private static final String OKHTTP_JAR = "okhttp.jar";
    private static final String CONSCRYPT_JAR = "conscrypt.jar";
    private static final String BOUNCYCASTLE_JAR = "bouncycastle.jar";
    private static final String[] PREFERRED_APEX_BOOT_JARS = new String[]{
            APEX_ART_JAVALIB_DIRECTORY + "/" + CORE_OJ_JAR,
            APEX_ART_JAVALIB_DIRECTORY + "/" + CORE_LIBART_JAR,
            APEX_ART_JAVALIB_DIRECTORY + "/" + OKHTTP_JAR,
            APEX_ART_JAVALIB_DIRECTORY + "/" + CONSCRYPT_JAR,
            APEX_ART_JAVALIB_DIRECTORY + "/" + BOUNCYCASTLE_JAR
    };
    private static final String[] FALLBACK_BOOT_JARS = new String[]{
            APEX_ART_JAVALIB_DIRECTORY + "/" + CORE_OJ_JAR,
            APEX_ART_JAVALIB_DIRECTORY + "/" + CORE_LIBART_JAR,
            APEX_ART_JAVALIB_DIRECTORY + "/" + OKHTTP_JAR,
            APEX_ART_JAVALIB_DIRECTORY + "/" + CONSCRYPT_JAR,
            APEX_ART_JAVALIB_DIRECTORY + "/" + BOUNCYCASTLE_JAR,
            "/apex/com.android.runtime/javalib/core-oj.jar",
            "/apex/com.android.runtime/javalib/core-libart.jar",
            "/system/framework/core-oj.jar",
            "/system/framework/core-libart.jar",
            "/system/framework/core.jar",
            "/system/framework/framework.jar",
            "/system/framework/ext.jar"
    };
    private static final String[] CORE_BOOT_JAR_SEARCH_DIRECTORIES = new String[]{
            APEX_ART_JAVALIB_DIRECTORY,
            "/apex/com.android.runtime/javalib",
            "/system/framework",
            "/system_ext/framework"
    };
    private static final String[] CORE_BOOT_JAR_SEARCH_ROOTS = new String[]{
            "/apex",
            "/system",
            "/system_ext"
    };
    private static final int CORE_BOOT_JAR_SEARCH_DEPTH = 5;
    // Android does not ship javax.tools, so only verify the ECJ batch path we actually use.
    private static final String[] REQUIRED_BATCH_RUNTIME_CLASSES = new String[]{
            "com.android.tools.r8.D8",
            "org.eclipse.jdt.core.compiler.batch.BatchCompiler",
            "javax.lang.model.SourceVersion"
    };
    private static final String BUNDLED_COMPILER_LAYOUT = "Expected the Android-compatible ECJ bundle "
            + "(app/libs/ecj-4.6.jar, app/libs/org.eclipse.jdt.core-3.12.0.jar, "
            + "app/libs/org.eclipse.jdt.compiler.tool-1.2.0.jar, "
            + "app/libs/org.eclipse.jdt.compiler.apt-1.2.100.jar, and app/libs/sourceversion-stub.jar) "
            + "plus the bundled D8 runtime. The executor compiles through BatchCompiler with -proc:none, "
            + "so tool/apt stay bundled for compatibility while ECJ batch + the SourceVersion stub do the work.";

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
            return ExecutionResult.runtimeError(
                    "Java execution failed",
                    "No snippet was supplied.",
                    "",
                    "Provide a Java snippet before running the executor.",
                    "",
                    -1L);
        }
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
            return ExecutionResult.unsupported(
                    "Java executor requires Android 8.0+",
                    "ECJ can compile on earlier devices, but the D8 path-based dex pipeline needs API 26 or higher.",
                    "Storage, editing, import, and export still work below API 26.");
        }

        CompilerRuntimeStatus compilerRuntimeStatus = verifyBatchCompilerRuntime();
        if (!compilerRuntimeStatus.ready) {
            return ExecutionResult.runtimeError(
                    "Compiler runtime incomplete",
                    "The bundled Java compiler could not be initialized on this device.",
                    "",
                    compilerRuntimeStatus.errorMessage,
                    BUNDLED_COMPILER_LAYOUT,
                    elapsedSince(startTime));
        }

        File snippetRoot = new File(new File(context.getCodeCacheDir(), WORKSPACE_DIRECTORY), safeSnippetKey(snippet));
        File runRoot = new File(snippetRoot, String.valueOf(System.currentTimeMillis()));
        File sourceRoot = new File(runRoot, "src");
        File classesDir = new File(runRoot, "classes");
        File dexDir = new File(runRoot, "dex");
        File optimizedDir = new File(runRoot, "opt");
        JavaSourceParser.ParsedJavaSource parsedSource = null;
        File sourceFile = null;
        String bootClasspathDiagnostics = "";

        try {
            ensureDirectory(sourceRoot);
            ensureDirectory(classesDir);
            ensureDirectory(dexDir);
            ensureDirectory(optimizedDir);

            parsedSource = JavaSourceParser.parse(snippet.getContent(), snippet.getTitle());
            sourceFile = writeSourceFile(sourceRoot, parsedSource, snippet.getContent());

            String bootClasspath = resolveBootClasspath();
            CompilationOutcome compilation = compileSource(sourceFile, classesDir, bootClasspath);
            bootClasspathDiagnostics = compilation.bootClasspathDiagnostics;
            if (!compilation.success) {
                return ExecutionResult.compilationError(
                        "Java compilation failed",
                        parsedSource.getDisplayFileName() + " did not compile.",
                        DiagnosticFormatter.formatCompilerOutput(
                                compilation.combinedOutput(),
                                runRoot.getAbsolutePath(),
                                sourceFile.getAbsolutePath(),
                                parsedSource.getDisplayFileName()),
                        joinDetails(
                                "Compiler: ECJ",
                                formatBootClasspathDetails(bootClasspathDiagnostics)),
                        elapsedSince(startTime));
            }

            File dexBundle = dexClasses(classesDir, dexDir, resolveLibraryFiles(bootClasspath));
            InvocationOutcome outcome = loadAndRun(context, dexBundle, parsedSource.getQualifiedClassName(), optimizedDir);
            return ExecutionResult.success(
                    "Java execution succeeded",
                    parsedSource.getQualifiedClassName() + " executed successfully via " + outcome.entrypoint + ".",
                    outcome.stdout,
                    outcome.returnValue,
                    outcome.stderr,
                    joinDetails(
                            "Dex bundle: " + dexBundle.getName(),
                            formatBootClasspathDetails(bootClasspathDiagnostics)),
                    elapsedSince(startTime));
        } catch (CapturedInvocationException exception) {
            Throwable rootCause = unwrap(exception.getCause());
            return ExecutionResult.runtimeError(
                    "Java execution failed",
                    exception.entrypoint + " threw an exception.",
                    exception.stdout,
                    combineError(exception.stderr, DiagnosticFormatter.formatThrowable(rootCause)),
                    joinDetails(
                            buildRuntimeDetails(parsedSource, sourceFile),
                            formatBootClasspathDetails(bootClasspathDiagnostics)),
                    elapsedSince(startTime));
        } catch (Throwable throwable) {
            Throwable rootCause = unwrap(throwable);
            if (rootCause instanceof IllegalArgumentException) {
                return ExecutionResult.compilationError(
                        "Java source is incomplete",
                        rootCause.getMessage(),
                        "Define a class, interface, or enum, then expose public static String run() or public static void main(String[] args).",
                        "Compiler: ECJ",
                        elapsedSince(startTime));
            }
            return ExecutionResult.runtimeError(
                    "Java execution failed",
                    "Compilation finished, but the generated code could not be loaded or executed.",
                    "",
                    DiagnosticFormatter.formatThrowable(rootCause),
                    joinDetails(
                            buildRuntimeDetails(parsedSource, sourceFile),
                            formatBootClasspathDetails(bootClasspathDiagnostics)),
                    elapsedSince(startTime));
        } finally {
            pruneOldRuns(snippetRoot, 3);
        }
    }

    private CompilerRuntimeStatus verifyBatchCompilerRuntime() {
        List<String> missingClasses = new ArrayList<>();
        ClassLoader classLoader = getClass().getClassLoader();
        for (String className : REQUIRED_BATCH_RUNTIME_CLASSES) {
            try {
                Class.forName(className, false, classLoader);
            } catch (ClassNotFoundException | NoClassDefFoundError exception) {
                missingClasses.add(className);
            }
        }
        if (missingClasses.isEmpty()) {
            return CompilerRuntimeStatus.ready();
        }
        return CompilerRuntimeStatus.missing("Missing runtime classes: " + TextUtils.join(", ", missingClasses));
    }

    private CompilationOutcome compileSource(File sourceFile, File classesDir, String resolvedBootClasspath) {
        String systemBootClasspath = System.getProperty("java.boot.class.path");
        String bootClasspath = systemBootClasspath;
        if (TextUtils.isEmpty(bootClasspath)) {
            bootClasspath = resolvedBootClasspath;
        }
        String[] args = buildCompilerArguments(sourceFile, classesDir, bootClasspath);
        String bootClasspathDiagnostics = buildBootClasspathDiagnostics(
                resolvedBootClasspath,
                systemBootClasspath,
                bootClasspath,
                args);
        StringWriter stdout = new StringWriter();
        StringWriter stderr = new StringWriter();
        boolean success = BatchCompiler.compile(
                args,
                new PrintWriter(stdout),
                new PrintWriter(stderr),
                null);
        return new CompilationOutcome(success, stdout.toString(), stderr.toString(), bootClasspathDiagnostics);
    }

    static String[] buildCompilerArguments(File sourceFile, File classesDir, String bootClasspath) {
        List<String> arguments = new ArrayList<>();
        Collections.addAll(arguments,
                "-1.8",
                "-encoding", "UTF-8",
                "-proc:none",
                "-g",
                "-d", classesDir.getAbsolutePath());
        if (!TextUtils.isEmpty(bootClasspath)) {
            arguments.addAll(Arrays.asList("-bootclasspath", bootClasspath));
        }
        arguments.add(sourceFile.getAbsolutePath());
        return arguments.toArray(new String[0]);
    }

    @TargetApi(Build.VERSION_CODES.O)
    private File dexClasses(File classesDir, File dexDir, List<Path> libraryFiles) throws Exception {
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
        for (Path libraryFile : libraryFiles) {
            builder.addLibraryFiles(libraryFile);
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

    private InvocationOutcome loadAndRun(Context context, File dexBundle, String qualifiedClassName, File optimizedDir) throws Exception {
        DexClassLoader classLoader = new DexClassLoader(
                dexBundle.getAbsolutePath(),
                optimizedDir.getAbsolutePath(),
                null,
                context.getClassLoader());
        Class<?> dynamicClass = classLoader.loadClass(qualifiedClassName);

        Method runMethod = findRunMethod(dynamicClass);
        if (runMethod != null) {
            return invokeCapturingOutput(runMethod, new Object[0], "public static run()");
        }

        Method mainMethod = findMainMethod(dynamicClass);
        if (mainMethod != null) {
            return invokeCapturingOutput(mainMethod, new Object[]{new String[0]}, "public static void main(String[])");
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

    private InvocationOutcome invokeCapturingOutput(Method method, Object[] arguments, String entrypoint) throws Exception {
        PrintStream originalOut = System.out;
        PrintStream originalErr = System.err;
        ByteArrayOutputStream stdoutCapture = new ByteArrayOutputStream();
        ByteArrayOutputStream stderrCapture = new ByteArrayOutputStream();
        Throwable failure = null;
        Object returnValue = null;

        try (PrintStream stdoutInterceptor = new PrintStream(stdoutCapture, true, StandardCharsets.UTF_8.name());
             PrintStream stderrInterceptor = new PrintStream(stderrCapture, true, StandardCharsets.UTF_8.name())) {
            System.setOut(stdoutInterceptor);
            System.setErr(stderrInterceptor);
            try {
                returnValue = method.invoke(null, arguments);
            } catch (InvocationTargetException exception) {
                failure = unwrap(exception.getTargetException());
            } catch (Throwable throwable) {
                failure = unwrap(throwable);
            }
        } finally {
            System.setOut(originalOut);
            System.setErr(originalErr);
        }

        String stdout = normalizeCapture(stdoutCapture);
        String stderr = normalizeCapture(stderrCapture);
        if (failure != null) {
            throw new CapturedInvocationException(entrypoint, stdout, stderr, failure);
        }
        return new InvocationOutcome(
                entrypoint,
                stdout,
                stderr,
                method.getReturnType() == Void.TYPE || returnValue == null ? "" : String.valueOf(returnValue));
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

    private String resolveBootClasspath() throws IOException {
        LinkedHashSet<String> entries = new LinkedHashSet<>();
        addExistingPathEntries(entries, System.getenv("BOOTCLASSPATH"));
        addExistingPathEntries(entries, System.getenv("SYSTEMSERVERCLASSPATH"));
        addExistingPathEntries(entries, System.getProperty("java.boot.class.path"));
        addExistingPathEntries(entries, System.getProperty("sun.boot.class.path"));
        // Android 10+ typically serves the core runtime jars from ART APEX.
        addReadableCandidates(entries, PREFERRED_APEX_BOOT_JARS);
        addReadableCandidates(entries, FALLBACK_BOOT_JARS);
        if (!containsCoreBootJar(entries)) {
            discoverCoreBootJars(entries);
        }
        if (entries.isEmpty()) {
            throw new IOException("Unable to resolve any readable bootclasspath entries for ECJ.");
        }
        if (!containsCoreBootJar(entries)) {
            throw new IOException("Unable to locate Android core boot jars (core-oj.jar/core-libart.jar) for ECJ.");
        }
        return TextUtils.join(File.pathSeparator, entries);
    }

    private void addReadableCandidates(LinkedHashSet<String> entries, String[] candidates) {
        for (String candidatePath : candidates) {
            addReadablePath(entries, candidatePath);
        }
    }

    private void addReadablePath(LinkedHashSet<String> entries, String candidatePath) {
        if (TextUtils.isEmpty(candidatePath)) {
            return;
        }
        File candidate = new File(candidatePath);
        if (candidate.isFile() && candidate.canRead()) {
            entries.add(candidate.getAbsolutePath());
        }
    }

    private boolean containsCoreBootJar(LinkedHashSet<String> entries) {
        for (String entry : entries) {
            if (isCoreBootJarName(new File(entry).getName())) {
                return true;
            }
        }
        return false;
    }

    private void discoverCoreBootJars(LinkedHashSet<String> entries) {
        for (String directoryPath : CORE_BOOT_JAR_SEARCH_DIRECTORIES) {
            addReadablePath(entries, directoryPath + "/" + CORE_OJ_JAR);
            addReadablePath(entries, directoryPath + "/" + CORE_LIBART_JAR);
            if (containsCoreBootJar(entries)) {
                return;
            }
        }
        for (String searchRoot : CORE_BOOT_JAR_SEARCH_ROOTS) {
            searchCoreBootJars(entries, new File(searchRoot), 0);
            if (containsCoreBootJar(entries)) {
                return;
            }
        }
    }

    private void searchCoreBootJars(LinkedHashSet<String> entries, File directory, int depth) {
        if (directory == null || depth > CORE_BOOT_JAR_SEARCH_DEPTH || !directory.isDirectory()) {
            return;
        }
        File[] children = directory.listFiles();
        if (children == null) {
            return;
        }
        for (File child : children) {
            if (containsCoreBootJar(entries)) {
                return;
            }
            if (child.isDirectory()) {
                searchCoreBootJars(entries, child, depth + 1);
                continue;
            }
            if (child.isFile() && child.canRead() && isCoreBootJarName(child.getName())) {
                entries.add(child.getAbsolutePath());
            }
        }
    }

    private boolean isCoreBootJarName(String fileName) {
        return CORE_OJ_JAR.equals(fileName) || CORE_LIBART_JAR.equals(fileName);
    }

    private void addExistingPathEntries(LinkedHashSet<String> entries, String pathList) {
        if (TextUtils.isEmpty(pathList)) {
            return;
        }
        String[] segments = pathList.split(File.pathSeparator);
        for (String segment : segments) {
            File candidate = new File(segment);
            if (candidate.isFile() && candidate.canRead()) {
                entries.add(candidate.getAbsolutePath());
            }
        }
    }

    @TargetApi(Build.VERSION_CODES.O)
    private List<Path> resolveLibraryFiles(String bootClasspath) {
        List<Path> libraryFiles = new ArrayList<>();
        if (TextUtils.isEmpty(bootClasspath)) {
            return libraryFiles;
        }
        String[] segments = bootClasspath.split(File.pathSeparator);
        for (String segment : segments) {
            File candidate = new File(segment);
            if (candidate.isFile()) {
                libraryFiles.add(candidate.toPath());
            }
        }
        return libraryFiles;
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

    private String normalizeCapture(ByteArrayOutputStream capture) throws IOException {
        String output = capture.toString(StandardCharsets.UTF_8.name()).replace("\r\n", "\n").trim();
        return output;
    }

    private String combineError(String stderr, String throwableText) {
        if (TextUtils.isEmpty(stderr)) {
            return throwableText;
        }
        if (TextUtils.isEmpty(throwableText)) {
            return stderr;
        }
        return stderr + "\n\n" + throwableText;
    }

    private String buildBootClasspathDiagnostics(
            String resolvedBootClasspath,
            String systemBootClasspath,
            String bootClasspath,
            String[] args) {
        List<String> diagnostics = new ArrayList<>();
        diagnostics.add("Resolved bootClasspath = " + resolvedBootClasspath);
        diagnostics.add("System bootclasspath = " + systemBootClasspath);
        diagnostics.add("Final bootClasspath used = " + bootClasspath);
        diagnostics.add("ECJ args = " + Arrays.toString(args));
        return TextUtils.join("\n", diagnostics);
    }

    private String formatBootClasspathDetails(String bootClasspathDiagnostics) {
        if (TextUtils.isEmpty(bootClasspathDiagnostics)) {
            return "";
        }
        return "ECJ bootclasspath diagnostics:\n" + bootClasspathDiagnostics;
    }

    private String joinDetails(String... sections) {
        List<String> nonEmptySections = new ArrayList<>();
        for (String section : sections) {
            if (!TextUtils.isEmpty(section)) {
                nonEmptySections.add(section);
            }
        }
        return TextUtils.join("\n\n", nonEmptySections);
    }

    private String buildRuntimeDetails(JavaSourceParser.ParsedJavaSource parsedSource, File sourceFile) {
        List<String> details = new ArrayList<>();
        if (parsedSource != null) {
            details.add("Class: " + parsedSource.getQualifiedClassName());
        }
        if (sourceFile != null) {
            details.add("Source: " + sourceFile.getName());
        }
        details.add(BUNDLED_COMPILER_LAYOUT);
        return TextUtils.join("\n", details);
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

    private static final class CompilerRuntimeStatus {
        private final boolean ready;
        private final String errorMessage;

        private CompilerRuntimeStatus(boolean ready, String errorMessage) {
            this.ready = ready;
            this.errorMessage = errorMessage == null ? "" : errorMessage;
        }

        private static CompilerRuntimeStatus ready() {
            return new CompilerRuntimeStatus(true, "");
        }

        private static CompilerRuntimeStatus missing(String errorMessage) {
            return new CompilerRuntimeStatus(false, errorMessage);
        }
    }

    private static final class InvocationOutcome {
        private final String entrypoint;
        private final String stdout;
        private final String stderr;
        private final String returnValue;

        private InvocationOutcome(String entrypoint, String stdout, String stderr, String returnValue) {
            this.entrypoint = entrypoint;
            this.stdout = stdout == null ? "" : stdout;
            this.stderr = stderr == null ? "" : stderr;
            this.returnValue = returnValue == null ? "" : returnValue;
        }
    }

    private static final class CapturedInvocationException extends Exception {
        private final String entrypoint;
        private final String stdout;
        private final String stderr;

        private CapturedInvocationException(String entrypoint, String stdout, String stderr, Throwable cause) {
            super(cause);
            this.entrypoint = entrypoint;
            this.stdout = stdout == null ? "" : stdout;
            this.stderr = stderr == null ? "" : stderr;
        }
    }

    private static final class CompilationOutcome {
        private final boolean success;
        private final String stdout;
        private final String stderr;
        private final String bootClasspathDiagnostics;

        private CompilationOutcome(boolean success, String stdout, String stderr, String bootClasspathDiagnostics) {
            this.success = success;
            this.stdout = stdout == null ? "" : stdout;
            this.stderr = stderr == null ? "" : stderr;
            this.bootClasspathDiagnostics = bootClasspathDiagnostics == null ? "" : bootClasspathDiagnostics;
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
