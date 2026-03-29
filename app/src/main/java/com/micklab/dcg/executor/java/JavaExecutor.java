package com.micklab.dcg.executor.java;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;

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
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

import dalvik.system.DexClassLoader;

public class JavaExecutor implements LanguageExecutor {
    private static final String TAG = "JavaExecutor";
    private static final String WORKSPACE_DIRECTORY = "dynamic-java";
    private static final String LOCAL_BOOT_JAR_DIRECTORY = "java-rt";
    private static final String BOOT_JAR_ASSET_DIRECTORY = "java-rt";
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
    private static final int DOWNLOAD_TIMEOUT_MILLIS = 2500;
    private static final int COPY_BUFFER_SIZE = 8192;
    static final String[][] ONLINE_BOOT_JAR_ARCHIVES = new String[][]{
            {
                    "14.0.0_r2",
                    "https://repo1.maven.org/maven2/com/rover12421/android/hide/libcore/14.0.0_r2/libcore-14.0.0_r2.jar",
                    "https://repo1.maven.org/maven2/com/rover12421/android/hide/libart/14.0.0_r2/libart-14.0.0_r2.jar"
            },
            {
                    "13.0.0_r2",
                    "https://repo1.maven.org/maven2/com/rover12421/android/hide/libcore/13.0.0_r2/libcore-13.0.0_r2.jar",
                    "https://repo1.maven.org/maven2/com/rover12421/android/hide/libart/13.0.0_r2/libart-13.0.0_r2.jar"
            }
    };
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
            + "plus staged core-oj.jar/core-libart.jar from online archive, app/src/main/assets/java-rt/, "
            + "or APEX safe-copy fallback, "
            + "and the bundled D8 runtime. The executor compiles through BatchCompiler with -proc:none, "
            + "so tool/apt stay bundled for compatibility while ECJ batch + the SourceVersion stub do the work.";
    private String bootJarSource = "unresolved";

    @Override
    public SupportedLanguage getLanguage() {
        return SupportedLanguage.JAVA;
    }

    @Override
    public boolean isSupported() {
        return true;
    }

    public static void stageBootJarsOnStartup(Context context) {
        if (context == null) {
            return;
        }
        Context appContext = context.getApplicationContext();
        Context targetContext = appContext == null ? context : appContext;
        try {
            new JavaExecutor().resolveBootClasspath(targetContext);
        } catch (IOException | RuntimeException exception) {
            Log.w(TAG, "Startup staging of core runtime jars failed.", exception);
        } catch (LinkageError error) {
            Log.w(TAG, "Startup staging of core runtime jars hit a linkage failure.", error);
        }
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

            String bootClasspath = resolveBootClasspath(context);
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
        String[] args = buildCompilerArguments(sourceFile, classesDir, resolvedBootClasspath);
        String bootClasspathDiagnostics = buildBootClasspathDiagnostics(
                resolvedBootClasspath,
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
                "-source", "1.8",
                "-target", "1.8",
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

    private static final class BootJarArchive {
        private final String release;
        private final String coreOjUrl;
        private final String coreLibartUrl;

        private BootJarArchive(String release, String coreOjUrl, String coreLibartUrl) {
            this.release = release;
            this.coreOjUrl = coreOjUrl;
            this.coreLibartUrl = coreLibartUrl;
        }
    }

    private String resolveBootClasspath(Context context) throws IOException {
        File runtimeDirectory = new File(context.getCodeCacheDir(), LOCAL_BOOT_JAR_DIRECTORY);
        ensureDirectory(runtimeDirectory);
        File localCoreOjJar = new File(runtimeDirectory, CORE_OJ_JAR);
        File localCoreLibartJar = new File(runtimeDirectory, CORE_LIBART_JAR);

        if (areValidBootJars(localCoreOjJar, localCoreLibartJar)) {
            if ("unresolved".equals(bootJarSource)) {
                bootJarSource = "local-cache";
            }
            return localCoreOjJar.getAbsolutePath() + File.pathSeparator + localCoreLibartJar.getAbsolutePath();
        }

        if (!tryFetchBootJarsOnline(runtimeDirectory)) {
            if (!tryStageBootJarsFromAssets(context, runtimeDirectory)) {
                try {
                    stageBootJarsFromApex(runtimeDirectory);
                } catch (RuntimeException exception) {
                    throw new IOException("APEX boot jar staging failed unexpectedly.", exception);
                } catch (LinkageError error) {
                    throw new IOException("APEX boot jar staging failed due to runtime linkage.", error);
                }
            }
        }

        localCoreOjJar = new File(runtimeDirectory, CORE_OJ_JAR);
        localCoreLibartJar = new File(runtimeDirectory, CORE_LIBART_JAR);
        if (!areValidBootJars(localCoreOjJar, localCoreLibartJar)) {
            throw new IOException("Failed to stage local Android core runtime jars for ECJ.");
        }
        return localCoreOjJar.getAbsolutePath() + File.pathSeparator + localCoreLibartJar.getAbsolutePath();
    }

    private boolean areValidBootJars(File coreOjJar, File coreLibartJar) {
        try {
            validateBootJar(coreOjJar, CORE_OJ_JAR);
            validateBootJar(coreLibartJar, CORE_LIBART_JAR);
            return true;
        } catch (IOException exception) {
            if ((coreOjJar != null && coreOjJar.exists()) || (coreLibartJar != null && coreLibartJar.exists())) {
                Log.w(TAG, "Existing staged boot jars are unusable and will be replaced.", exception);
            }
            return false;
        }
    }

    private boolean tryFetchBootJarsOnline(File runtimeDirectory) {
        for (String[] archive : ONLINE_BOOT_JAR_ARCHIVES) {
            if (archive.length < 3) {
                continue;
            }
            BootJarArchive candidate = new BootJarArchive(archive[0], archive[1], archive[2]);
            File downloadedCoreOj = new File(runtimeDirectory, CORE_OJ_JAR + ".download");
            File downloadedCoreLibart = new File(runtimeDirectory, CORE_LIBART_JAR + ".download");
            try {
                // Try MCP-compatible online artifact URLs first, then fall back automatically.
                downloadFile(candidate.coreOjUrl, downloadedCoreOj);
                downloadFile(candidate.coreLibartUrl, downloadedCoreLibart);
                validateBootJar(downloadedCoreOj, CORE_OJ_JAR);
                validateBootJar(downloadedCoreLibart, CORE_LIBART_JAR);
                promoteStagedFile(downloadedCoreOj, new File(runtimeDirectory, CORE_OJ_JAR));
                promoteStagedFile(downloadedCoreLibart, new File(runtimeDirectory, CORE_LIBART_JAR));
                bootJarSource = "online-" + candidate.release;
                return true;
            } catch (IOException exception) {
                Log.w(TAG, "Online fetch of boot jars failed for " + candidate.release + ".", exception);
                deleteQuietly(downloadedCoreOj);
                deleteQuietly(downloadedCoreLibart);
            }
        }
        return false;
    }

    private void downloadFile(String urlText, File destination) throws IOException {
        File parent = destination.getParentFile();
        if (parent != null) {
            ensureDirectory(parent);
        }
        HttpURLConnection connection = (HttpURLConnection) new URL(urlText).openConnection();
        connection.setConnectTimeout(DOWNLOAD_TIMEOUT_MILLIS);
        connection.setReadTimeout(DOWNLOAD_TIMEOUT_MILLIS);
        connection.setInstanceFollowRedirects(true);
        connection.setRequestProperty("User-Agent", "dcg-javaexecutor/1.0");
        try {
            int responseCode = connection.getResponseCode();
            if (responseCode < HttpURLConnection.HTTP_OK || responseCode >= HttpURLConnection.HTTP_MULT_CHOICE) {
                throw new IOException("HTTP " + responseCode + " while downloading " + urlText);
            }
            try (InputStream inputStream = connection.getInputStream();
                 OutputStream outputStream = new FileOutputStream(destination)) {
                copyStream(inputStream, outputStream);
            }
        } finally {
            connection.disconnect();
        }
    }

    private boolean tryStageBootJarsFromAssets(Context context, File runtimeDirectory) {
        AssetManager assetManager = context.getAssets();
        try {
            copyBootJarFromAssets(assetManager, CORE_OJ_JAR, new File(runtimeDirectory, CORE_OJ_JAR));
            copyBootJarFromAssets(assetManager, CORE_LIBART_JAR, new File(runtimeDirectory, CORE_LIBART_JAR));
            bootJarSource = "assets";
            return true;
        } catch (IOException exception) {
            Log.w(TAG, "Bundled asset boot jars are unavailable.", exception);
            return false;
        }
    }

    private void copyBootJarFromAssets(AssetManager assetManager, String jarName, File destinationJar) throws IOException {
        String assetPath = BOOT_JAR_ASSET_DIRECTORY + "/" + jarName;
        File stagingJar = new File(destinationJar.getParentFile(), jarName + ".asset");
        try (InputStream inputStream = assetManager.open(assetPath);
             OutputStream outputStream = new FileOutputStream(stagingJar)) {
            copyStream(inputStream, outputStream);
        }
        validateBootJar(stagingJar, jarName);
        promoteStagedFile(stagingJar, destinationJar);
    }

    private void stageBootJarsFromApex(File runtimeDirectory) throws IOException {
        File coreOjSource = findCoreBootJarOnDevice(CORE_OJ_JAR);
        File coreLibartSource = findCoreBootJarOnDevice(CORE_LIBART_JAR);
        if (coreOjSource == null || coreLibartSource == null) {
            throw new IOException("Unable to locate Android core boot jars (core-oj.jar/core-libart.jar) for ECJ.");
        }
        copyBootJarToCodeCache(coreOjSource, runtimeDirectory);
        copyBootJarToCodeCache(coreLibartSource, runtimeDirectory);
        bootJarSource = "apex-safe-copy";
    }

    private File findCoreBootJarOnDevice(String jarName) {
        LinkedHashSet<String> entries = new LinkedHashSet<>();
        addReadableCandidates(entries, PREFERRED_APEX_BOOT_JARS);
        addReadableCandidates(entries, FALLBACK_BOOT_JARS);
        for (String directoryPath : CORE_BOOT_JAR_SEARCH_DIRECTORIES) {
            addReadablePath(entries, directoryPath + "/" + jarName);
        }
        for (String searchRoot : CORE_BOOT_JAR_SEARCH_ROOTS) {
            searchCoreBootJars(entries, new File(searchRoot), 0);
        }
        for (String path : entries) {
            File candidate = new File(path);
            if (jarName.equals(candidate.getName()) && candidate.isFile() && candidate.canRead()) {
                return candidate;
            }
        }
        return null;
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
        try {
            File candidate = new File(candidatePath);
            if (candidate.isFile() && candidate.canRead() && isCoreBootJarName(candidate.getName())) {
                entries.add(candidate.getAbsolutePath());
            }
        } catch (SecurityException exception) {
            Log.w(TAG, "Access denied while probing boot jar candidate: " + candidatePath, exception);
        }
    }

    private void searchCoreBootJars(LinkedHashSet<String> entries, File directory, int depth) {
        if (directory == null || depth > CORE_BOOT_JAR_SEARCH_DEPTH || !directory.isDirectory()) {
            return;
        }
        File[] children;
        try {
            children = directory.listFiles();
        } catch (SecurityException exception) {
            Log.w(TAG, "Access denied while traversing boot jar search root: " + directory.getAbsolutePath(), exception);
            return;
        }
        if (children == null) {
            return;
        }
        for (File child : children) {
            try {
                if (child.isDirectory()) {
                    searchCoreBootJars(entries, child, depth + 1);
                    continue;
                }
                if (child.isFile() && child.canRead() && isCoreBootJarName(child.getName())) {
                    entries.add(child.getAbsolutePath());
                }
            } catch (SecurityException exception) {
                Log.w(TAG, "Access denied while scanning boot jar candidate: " + child.getAbsolutePath(), exception);
            }
        }
    }

    @TargetApi(Build.VERSION_CODES.O)
    private File copyBootJarToCodeCache(File sourceJar, File runtimeDirectory) throws IOException {
        if (sourceJar == null || !sourceJar.isFile() || !sourceJar.canRead()) {
            throw new IOException("Unreadable boot jar: " + (sourceJar == null ? "null" : sourceJar.getAbsolutePath()));
        }
        File destinationJar = new File(runtimeDirectory, sourceJar.getName());
        boolean needsCopy = !destinationJar.isFile()
                || destinationJar.length() != sourceJar.length()
                || destinationJar.lastModified() != sourceJar.lastModified();
        if (!needsCopy) {
            validateBootJar(destinationJar, sourceJar.getName());
            return destinationJar;
        }

        File stagingJar = new File(runtimeDirectory, sourceJar.getName() + ".stage");
        deleteQuietly(stagingJar);
        IOException copyFailure = null;
        try {
            copyBootJarViaShell(sourceJar, stagingJar);
        } catch (IOException exception) {
            copyFailure = exception;
            Log.w(TAG, "Shell copy failed for " + sourceJar.getAbsolutePath() + ".", exception);
        }

        if (!stagingJar.isFile() || stagingJar.length() == 0L) {
            deleteQuietly(stagingJar);
            try {
                copyBootJarViaZipRoundTrip(sourceJar, stagingJar);
            } catch (IOException exception) {
                copyFailure = exception;
                Log.w(TAG, "Zip round-trip copy failed for " + sourceJar.getAbsolutePath() + ".", exception);
            }
        }

        if (!stagingJar.isFile() || !stagingJar.canRead()) {
            throw new IOException("Failed to stage boot jar into local cache: " + destinationJar.getAbsolutePath(), copyFailure);
        }
        validateBootJar(stagingJar, sourceJar.getName());
        promoteStagedFile(stagingJar, destinationJar);
        if (sourceJar.lastModified() > 0L) {
            destinationJar.setLastModified(sourceJar.lastModified());
        }
        if (!destinationJar.isFile() || !destinationJar.canRead()) {
            throw new IOException("Failed to copy boot jar into local cache: " + destinationJar.getAbsolutePath());
        }
        return destinationJar;
    }

    private boolean isCoreBootJarName(String fileName) {
        return CORE_OJ_JAR.equals(fileName) || CORE_LIBART_JAR.equals(fileName);
    }

    private void copyBootJarViaShell(File sourceJar, File destinationJar) throws IOException {
        Process process = Runtime.getRuntime().exec(new String[]{
                "cp",
                sourceJar.getAbsolutePath(),
                destinationJar.getAbsolutePath()
        });
        try {
            int exitCode = process.waitFor();
            if (exitCode != 0) {
                throw new IOException("cp returned exit code " + exitCode + " for " + sourceJar.getAbsolutePath());
            }
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            throw new IOException("Interrupted while copying boot jar with shell cp.", exception);
        }
    }

    private void copyBootJarViaZipRoundTrip(File sourceJar, File destinationJar) throws IOException {
        try (ZipFile zipFile = new ZipFile(sourceJar);
             ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(destinationJar))) {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry sourceEntry = entries.nextElement();
                ZipEntry destinationEntry = new ZipEntry(sourceEntry.getName());
                destinationEntry.setTime(sourceEntry.getTime());
                zipOutputStream.putNextEntry(destinationEntry);
                if (!sourceEntry.isDirectory()) {
                    try (InputStream inputStream = zipFile.getInputStream(sourceEntry)) {
                        copyStream(inputStream, zipOutputStream);
                    }
                }
                zipOutputStream.closeEntry();
            }
        }
    }

    private void validateBootJar(File jarFile, String jarName) throws IOException {
        if (jarFile == null || !jarFile.isFile() || !jarFile.canRead() || jarFile.length() <= 0L) {
            throw new IOException("Unreadable boot jar: " + (jarFile == null ? "null" : jarFile.getAbsolutePath()));
        }
        try (ZipFile zipFile = new ZipFile(jarFile)) {
            if (CORE_OJ_JAR.equals(jarName)) {
                if (zipFile.getEntry("java/lang/Object.class") == null
                        || zipFile.getEntry("java/lang/String.class") == null) {
                    throw new IOException("core-oj.jar is missing java.lang baseline classes.");
                }
                return;
            }
            if (CORE_LIBART_JAR.equals(jarName) && zipFile.getEntry("android/system/Os.class") == null) {
                throw new IOException("core-libart.jar is missing android.system.Os.");
            }
        }
    }

    @TargetApi(Build.VERSION_CODES.O)
    private void promoteStagedFile(File stagingFile, File destinationFile) throws IOException {
        if (stagingFile == null || !stagingFile.isFile()) {
            throw new IOException("Missing staged file: " + (stagingFile == null ? "null" : stagingFile.getAbsolutePath()));
        }
        if (destinationFile.isFile() && !destinationFile.delete()) {
            throw new IOException("Failed to replace destination file: " + destinationFile.getAbsolutePath());
        }
        if (stagingFile.renameTo(destinationFile)) {
            return;
        }
        try {
            Files.copy(stagingFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (RuntimeException exception) {
            throw new IOException("Failed to copy staged file into destination.", exception);
        } catch (LinkageError error) {
            throw new IOException("Failed to copy staged file due to runtime linkage.", error);
        }
        if (!stagingFile.delete()) {
            Log.w(TAG, "Could not delete staging file: " + stagingFile.getAbsolutePath());
        }
    }

    private void copyStream(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] buffer = new byte[COPY_BUFFER_SIZE];
        int readCount;
        while ((readCount = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, readCount);
        }
    }

    private void deleteQuietly(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (!file.delete()) {
            Log.w(TAG, "Could not delete temporary file: " + file.getAbsolutePath());
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
            String[] args) {
        List<String> diagnostics = new ArrayList<>();
        diagnostics.add("Resolved bootClasspath = " + resolvedBootClasspath);
        diagnostics.add("Boot jar source = " + bootJarSource);
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
