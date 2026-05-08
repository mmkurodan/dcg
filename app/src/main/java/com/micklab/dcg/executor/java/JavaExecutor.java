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
import com.micklab.dcg.output.DynamicOutputRuntime;
import com.micklab.dcg.util.DiagnosticFormatter;
import com.micklab.dcg.wrapper.net.Socket;

import org.eclipse.jdt.core.compiler.batch.BatchCompiler;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
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
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

import dalvik.system.InMemoryDexClassLoader;

public class JavaExecutor implements LanguageExecutor {
    private static final String TAG = "JavaExecutor";
    private static final String BUILD_OUTPUT_METHOD = "buildOutput";
    private static final String WORKSPACE_DIRECTORY = "dynamic-java";
    private static final String LOCAL_BOOT_JAR_DIRECTORY = "java-rt";
    private static final String BOOT_JAR_ASSET_DIRECTORY = "java-rt";
    private static final String LOCAL_WRAPPER_JAR_DIRECTORY = "java-wrapper";
    private static final String WRAPPER_JAR_ASSET_DIRECTORY = "java-wrapper";
    private static final String WRAPPER_CLASSPATH_JAR = "android-wrapper-classpath.jar";
    private static final String WRAPPER_ANDROID_CLASS_JAR_ENTRY_PREFIX = "com/micklab/dcg/wrapper/android/";
    private static final String WRAPPER_NET_CLASS_JAR_ENTRY_PREFIX = "com/micklab/dcg/wrapper/net/";
    private static final String WRAPPER_BITMAP_CLASS_JAR_ENTRY = WRAPPER_ANDROID_CLASS_JAR_ENTRY_PREFIX + "graphics/Bitmap.class";
    private static final String WRAPPER_BITMAP_CONFIG_CLASS_JAR_ENTRY = WRAPPER_ANDROID_CLASS_JAR_ENTRY_PREFIX + "graphics/Bitmap$Config.class";
    private static final String WRAPPER_SOCKET_CLASS_JAR_ENTRY = WRAPPER_NET_CLASS_JAR_ENTRY_PREFIX + "Socket.class";
    private static final String WRAPPER_SERVER_SOCKET_CLASS_JAR_ENTRY = WRAPPER_NET_CLASS_JAR_ENTRY_PREFIX + "ServerSocket.class";
    private static final String WRAPPER_VIRTUAL_NETWORK_CLASS_JAR_ENTRY = WRAPPER_NET_CLASS_JAR_ENTRY_PREFIX + "VirtualNetwork.class";
    private static final String WRAPPER_VIRTUAL_CHANNEL_CLASS_JAR_ENTRY = WRAPPER_NET_CLASS_JAR_ENTRY_PREFIX + "VirtualChannel.class";
    private static final String WRAPPER_VIRTUAL_SERVER_SOCKET_CLASS_JAR_ENTRY = WRAPPER_NET_CLASS_JAR_ENTRY_PREFIX + "VirtualServerSocket.class";
    private static final String CORE_OJ_JAR = "core-oj.jar";
    private static final String CORE_LIBART_JAR = "core-libart.jar";
    private static final int COPY_BUFFER_SIZE = 8192;
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
            + "plus staged core-oj.jar/core-libart.jar from app/src/main/assets/java-rt/ "
            + "(refreshable via fetch-java-rt-fallback.sh), "
            + "plus generated wrapper classpath asset app/src/main/assets/java-wrapper/android-wrapper-classpath.jar "
            + "(generated from project-root Android.jar/android.jar), "
            + "and the bundled D8 runtime. ECJ compiles against the wrapper classpath only. "
            + "The executor compiles through BatchCompiler with -proc:none, "
            + "so tool/apt stay bundled for compatibility while ECJ batch + the SourceVersion stub do the work.";
    private String bootJarSource = "unresolved";
    private String wrapperJarSource = "unresolved";

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
            AndroidBuildPropertyBridge.install();
            JavaExecutor executor = new JavaExecutor();
            executor.refreshBootJarsFromAssets(targetContext);
            executor.resolveBootClasspath(targetContext);
            executor.refreshWrapperClasspathFromAssets(targetContext);
            executor.resolveWrapperClasspath(targetContext);
        } catch (IOException | RuntimeException exception) {
            Log.w(TAG, "Startup staging of core runtime jars failed.", exception);
        } catch (LinkageError error) {
            Log.w(TAG, "Startup staging of core runtime jars hit a linkage failure.", error);
        }
    }

    public VirtualSocketBridge openVirtualSocketBridge(int virtualPort) throws IOException {
        return openVirtualSocketBridge("localhost", virtualPort);
    }

    public VirtualSocketBridge openVirtualSocketBridge(String host, int virtualPort) throws IOException {
        return new VirtualSocketBridge(new Socket(host, virtualPort));
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
        AndroidBuildPropertyBridge.install();
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
            return ExecutionResult.unsupported(
                    "Java executor requires Android 8.0+",
                    "ECJ can compile on earlier devices, but D8 + in-memory dex loading needs API 26 or higher.",
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
        JavaSourceParser.PreparedJavaSource preparedSource = null;
        JavaSourceParser.ParsedJavaSource parsedSource = null;
        File sourceFile = null;
        String bootClasspathDiagnostics = "";

        try {
            ensureDirectory(sourceRoot);
            ensureDirectory(classesDir);
            ensureDirectory(dexDir);

            preparedSource = JavaSourceParser.prepareForCompilation(snippet.getContent(), snippet.getTitle());
            parsedSource = preparedSource.getParsedSource();
            sourceFile = writeSourceFile(sourceRoot, parsedSource, preparedSource.getRewrittenSource());

            String bootClasspath = resolveBootClasspath(context);
            String wrapperClasspath = resolveWrapperClasspath(context);
            String compileClasspath = wrapperClasspath;
            CompilationOutcome compilation = compileSource(
                    sourceFile,
                    classesDir,
                    bootClasspath,
                    compileClasspath);
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
                                formatRewriteDetails(preparedSource),
                                formatBootClasspathDetails(bootClasspathDiagnostics)),
                        elapsedSince(startTime));
            }

            File dexFile = dexClasses(
                    classesDir,
                    dexDir,
                    resolveLibraryFiles(bootClasspath, wrapperClasspath));
            InvocationOutcome outcome = loadAndRun(
                    context,
                    dexFile,
                    parsedSource.getQualifiedClassName(),
                    preparedSource != null && preparedSource.isPseudoMainActivity());
            try {
                DynamicOutputRuntime.StructuredOutput structuredOutput =
                        DynamicOutputRuntime.extractStructuredOutput(outcome.dynamicClass, outcome.returnValueObject);
                return ExecutionResult.success(
                                "Java execution succeeded",
                                buildExecutionSummary(parsedSource, outcome, preparedSource),
                                mergeConsoleOutput(outcome.stdout, structuredOutput.getStdout()),
                                structuredOutput.getReturnValueText(),
                                mergeConsoleOutput(outcome.stderr, structuredOutput.getStderr()),
                                joinDetails(
                                        "Dex output: " + dexFile.getName(),
                                        formatRewriteDetails(preparedSource),
                                        formatBootClasspathDetails(bootClasspathDiagnostics)),
                                elapsedSince(startTime))
                        .withOutputItems(structuredOutput.getOutputItems())
                        .withOutputModelJson(structuredOutput.getOutputModelJson());
            } catch (DynamicOutputRuntime.InvocationFailureException exception) {
                Throwable rootCause = unwrap(exception.getCause());
                return ExecutionResult.runtimeError(
                        "Java execution failed",
                        exception.getEntrypoint() + " threw an exception.",
                        mergeConsoleOutput(outcome.stdout, exception.getStdout()),
                        combineError(
                                mergeConsoleOutput(outcome.stderr, exception.getStderr()),
                                DiagnosticFormatter.formatThrowable(rootCause)),
                        joinDetails(
                                buildRuntimeDetails(parsedSource, sourceFile, preparedSource),
                                formatBootClasspathDetails(bootClasspathDiagnostics)),
                        elapsedSince(startTime));
            }
        } catch (CapturedInvocationException exception) {
            Throwable rootCause = unwrap(exception.getCause());
            return ExecutionResult.runtimeError(
                    "Java execution failed",
                    exception.entrypoint + " threw an exception.",
                    exception.stdout,
                    combineError(exception.stderr, DiagnosticFormatter.formatThrowable(rootCause)),
                    joinDetails(
                            buildRuntimeDetails(parsedSource, sourceFile, preparedSource),
                            formatBootClasspathDetails(bootClasspathDiagnostics)),
                    elapsedSince(startTime));
        } catch (Throwable throwable) {
            Throwable rootCause = unwrap(throwable);
            if (rootCause instanceof IllegalArgumentException) {
                return ExecutionResult.compilationError(
                        "Java source is incomplete",
                        rootCause.getMessage(),
                        "Define a class, interface, or enum, then expose public static String run(), public static void main(String[] args), public static Object buildOutput(), or MainActivity-style onCreate().",
                        "Compiler: ECJ",
                        elapsedSince(startTime));
            }
            return ExecutionResult.runtimeError(
                    "Java execution failed",
                    "Compilation finished, but the generated code could not be loaded or executed.",
                    "",
                    DiagnosticFormatter.formatThrowable(rootCause),
                    joinDetails(
                            buildRuntimeDetails(parsedSource, sourceFile, preparedSource),
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

    private CompilationOutcome compileSource(
            File sourceFile,
            File classesDir,
            String resolvedBootClasspath,
            String resolvedClasspath) {
        String[] args = buildCompilerArguments(sourceFile, classesDir, resolvedBootClasspath, resolvedClasspath);
        String bootClasspathDiagnostics = buildBootClasspathDiagnostics(
                resolvedBootClasspath,
                resolvedClasspath,
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
        return buildCompilerArguments(sourceFile, classesDir, bootClasspath, null);
    }

    static String[] buildCompilerArguments(
            File sourceFile,
            File classesDir,
            String bootClasspath,
            String classpath) {
        List<String> arguments = new ArrayList<>();
        Collections.addAll(arguments,
                "-source", "1.8",
                "-target", "1.8",
                "-proc:none",
                "-encoding", "UTF-8",
                "-g",
                "-d", classesDir.getAbsolutePath());
        if (!isNullOrEmpty(classpath)) {
            arguments.addAll(Arrays.asList("-classpath", classpath));
        }
        if (!isNullOrEmpty(bootClasspath)) {
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
        return dexFile;
    }

    @TargetApi(Build.VERSION_CODES.O)
    private InvocationOutcome loadAndRun(
            Context context,
            File dexFile,
            String qualifiedClassName,
            boolean preferBuildOutput) throws Exception {
        byte[] dexBytes = Files.readAllBytes(dexFile.toPath());
        ByteBuffer dexBuffer = ByteBuffer.wrap(dexBytes);
        ClassLoader parent = context.getClassLoader();
        InMemoryDexClassLoader classLoader = new InMemoryDexClassLoader(dexBuffer, parent);
        Class<?> dynamicClass = classLoader.loadClass(qualifiedClassName);

        Method buildOutputMethod = findBuildOutputMethod(dynamicClass);
        if (preferBuildOutput && buildOutputMethod != null) {
            return new InvocationOutcome(
                    "public static Object " + BUILD_OUTPUT_METHOD + "()",
                    "",
                    "",
                    null,
                    dynamicClass);
        }

        Method runMethod = findRunMethod(dynamicClass);
        if (runMethod != null) {
            return invokeCapturingOutput(dynamicClass, runMethod, new Object[0], "public static run()");
        }

        Method mainMethod = findMainMethod(dynamicClass);
        if (mainMethod != null) {
            return invokeCapturingOutput(dynamicClass, mainMethod, new Object[]{new String[0]}, "public static void main(String[])");
        }

        if (buildOutputMethod != null) {
            return new InvocationOutcome(
                    "public static Object " + BUILD_OUTPUT_METHOD + "()",
                    "",
                    "",
                    null,
                    dynamicClass);
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

    private Method findBuildOutputMethod(Class<?> dynamicClass) {
        try {
            Method method = dynamicClass.getDeclaredMethod(BUILD_OUTPUT_METHOD);
            if (!Modifier.isStatic(method.getModifiers()) || method.getParameterTypes().length != 0) {
                return null;
            }
            method.setAccessible(true);
            return method;
        } catch (NoSuchMethodException ignored) {
            return null;
        }
    }

    private InvocationOutcome invokeCapturingOutput(Class<?> dynamicClass, Method method, Object[] arguments, String entrypoint) throws Exception {
        PrintStream originalOut = System.out;
        PrintStream originalErr = System.err;
        ByteArrayOutputStream stdoutCapture = new ByteArrayOutputStream();
        ByteArrayOutputStream stderrCapture = new ByteArrayOutputStream();
        Throwable failure = null;
        Object returnValue = null;

        try (PrintStream stdoutInterceptor = new PrintStream(stdoutCapture, true, StandardCharsets.UTF_8.name());
             PrintStream stderrInterceptor = new PrintStream(stderrCapture, true, StandardCharsets.UTF_8.name())) {
            AndroidBuildPropertyBridge.install();
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
                method.getReturnType() == Void.TYPE ? null : returnValue,
                dynamicClass);
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

        if (!tryStageBootJarsFromAssets(context, runtimeDirectory)) {
            throw new IOException("Bundled core runtime jars are unavailable in assets/" + BOOT_JAR_ASSET_DIRECTORY + ".");
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

    private boolean tryStageBootJarsFromAssets(Context context, File runtimeDirectory) {
        AssetManager assetManager = context.getAssets();
        try {
            copyBootJarFromAssets(assetManager, CORE_OJ_JAR, new File(runtimeDirectory, CORE_OJ_JAR));
            copyBootJarFromAssets(assetManager, CORE_LIBART_JAR, new File(runtimeDirectory, CORE_LIBART_JAR));
            bootJarSource = "assets-zip-roundtrip";
            return true;
        } catch (IOException exception) {
            Log.w(TAG, "Bundled asset boot jars are unavailable.", exception);
            return false;
        }
    }

    private void refreshBootJarsFromAssets(Context context) throws IOException {
        File runtimeDirectory = new File(context.getCodeCacheDir(), LOCAL_BOOT_JAR_DIRECTORY);
        ensureDirectory(runtimeDirectory);
        if (!tryStageBootJarsFromAssets(context, runtimeDirectory)) {
            throw new IOException("Failed to refresh boot jars from bundled assets.");
        }
    }

    private String resolveWrapperClasspath(Context context) throws IOException {
        File runtimeDirectory = new File(context.getCodeCacheDir(), LOCAL_WRAPPER_JAR_DIRECTORY);
        ensureDirectory(runtimeDirectory);
        File localWrapperJar = new File(runtimeDirectory, WRAPPER_CLASSPATH_JAR);
        if (isValidWrapperJar(localWrapperJar)) {
            if ("unresolved".equals(wrapperJarSource)) {
                wrapperJarSource = "local-cache";
            }
            return localWrapperJar.getAbsolutePath();
        }

        if (!tryStageWrapperJarFromAssets(context, runtimeDirectory)) {
            throw new IOException("Generated wrapper classpath asset is unavailable in assets/" + WRAPPER_JAR_ASSET_DIRECTORY + ".");
        }
        localWrapperJar = new File(runtimeDirectory, WRAPPER_CLASSPATH_JAR);
        if (!isValidWrapperJar(localWrapperJar)) {
            throw new IOException("Failed to stage generated wrapper classpath jar from assets.");
        }
        return localWrapperJar.getAbsolutePath();
    }

    private void refreshWrapperClasspathFromAssets(Context context) throws IOException {
        File runtimeDirectory = new File(context.getCodeCacheDir(), LOCAL_WRAPPER_JAR_DIRECTORY);
        ensureDirectory(runtimeDirectory);
        if (!tryStageWrapperJarFromAssets(context, runtimeDirectory)) {
            throw new IOException("Failed to refresh wrapper classpath from bundled assets.");
        }
    }

    private boolean isValidWrapperJar(File wrapperJar) {
        try {
            validateWrapperJar(wrapperJar);
            return true;
        } catch (IOException exception) {
            if (wrapperJar != null && wrapperJar.exists()) {
                Log.w(TAG, "Existing wrapper classpath jar is unusable and will be replaced.", exception);
            }
            return false;
        }
    }

    private boolean tryStageWrapperJarFromAssets(Context context, File runtimeDirectory) {
        AssetManager assetManager = context.getAssets();
        try {
            copyWrapperJarFromAssets(assetManager, WRAPPER_CLASSPATH_JAR, new File(runtimeDirectory, WRAPPER_CLASSPATH_JAR));
            wrapperJarSource = "assets";
            return true;
        } catch (IOException exception) {
            Log.w(TAG, "Bundled wrapper classpath jar is unavailable.", exception);
            return false;
        }
    }

    private void copyWrapperJarFromAssets(AssetManager assetManager, String jarName, File destinationJar) throws IOException {
        File parent = destinationJar.getParentFile();
        if (parent != null) {
            ensureDirectory(parent);
        }
        String assetPath = WRAPPER_JAR_ASSET_DIRECTORY + "/" + jarName;
        File stagedJar = new File(parent, jarName + ".asset");
        deleteQuietly(stagedJar);

        try (InputStream inputStream = assetManager.open(assetPath);
             OutputStream outputStream = new FileOutputStream(stagedJar)) {
            copyStream(inputStream, outputStream);
        }
        validateWrapperJar(stagedJar);
        promoteStagedFile(stagedJar, destinationJar);
    }

    private void validateWrapperJar(File wrapperJar) throws IOException {
        if (wrapperJar == null || !wrapperJar.isFile() || !wrapperJar.canRead() || wrapperJar.length() <= 0L) {
            throw new IOException("Unreadable wrapper classpath jar: " + (wrapperJar == null ? "null" : wrapperJar.getAbsolutePath()));
        }
        boolean foundWrapperClass = false;
        boolean foundBitmapWrapper = false;
        boolean foundBitmapConfigWrapper = false;
        boolean foundSocketWrapper = false;
        boolean foundServerSocketWrapper = false;
        boolean foundVirtualNetworkWrapper = false;
        boolean foundVirtualChannelWrapper = false;
        boolean foundVirtualServerSocketWrapper = false;
        try (ZipFile zipFile = new ZipFile(wrapperJar)) {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                String name = entry.getName();
                if (entry.isDirectory()) {
                    continue;
                }
                if ((name.startsWith(WRAPPER_ANDROID_CLASS_JAR_ENTRY_PREFIX)
                        || name.startsWith(WRAPPER_NET_CLASS_JAR_ENTRY_PREFIX))
                        && name.endsWith(".class")) {
                    foundWrapperClass = true;
                    if (WRAPPER_BITMAP_CLASS_JAR_ENTRY.equals(name)) {
                        foundBitmapWrapper = true;
                    } else if (WRAPPER_BITMAP_CONFIG_CLASS_JAR_ENTRY.equals(name)) {
                        foundBitmapConfigWrapper = true;
                    } else if (WRAPPER_SOCKET_CLASS_JAR_ENTRY.equals(name)) {
                        foundSocketWrapper = true;
                    } else if (WRAPPER_SERVER_SOCKET_CLASS_JAR_ENTRY.equals(name)) {
                        foundServerSocketWrapper = true;
                    } else if (WRAPPER_VIRTUAL_NETWORK_CLASS_JAR_ENTRY.equals(name)) {
                        foundVirtualNetworkWrapper = true;
                    } else if (WRAPPER_VIRTUAL_CHANNEL_CLASS_JAR_ENTRY.equals(name)) {
                        foundVirtualChannelWrapper = true;
                    } else if (WRAPPER_VIRTUAL_SERVER_SOCKET_CLASS_JAR_ENTRY.equals(name)) {
                        foundVirtualServerSocketWrapper = true;
                    }
                    if (foundBitmapWrapper
                            && foundBitmapConfigWrapper
                            && foundSocketWrapper
                            && foundServerSocketWrapper
                            && foundVirtualNetworkWrapper
                            && foundVirtualChannelWrapper
                            && foundVirtualServerSocketWrapper) {
                        break;
                    }
                }
            }
        }
        if (!foundWrapperClass) {
            throw new IOException("Wrapper classpath jar does not contain generated wrapper classes.");
        }
        if (!foundBitmapWrapper || !foundBitmapConfigWrapper) {
            throw new IOException("Wrapper classpath jar is missing required nested wrapper classes: "
                    + WRAPPER_BITMAP_CLASS_JAR_ENTRY + ", " + WRAPPER_BITMAP_CONFIG_CLASS_JAR_ENTRY + ".");
        }
        if (!foundSocketWrapper
                || !foundServerSocketWrapper
                || !foundVirtualNetworkWrapper
                || !foundVirtualChannelWrapper
                || !foundVirtualServerSocketWrapper) {
            throw new IOException("Wrapper classpath jar is missing required virtual network classes: "
                    + WRAPPER_SOCKET_CLASS_JAR_ENTRY + ", "
                    + WRAPPER_SERVER_SOCKET_CLASS_JAR_ENTRY + ", "
                    + WRAPPER_VIRTUAL_NETWORK_CLASS_JAR_ENTRY + ", "
                    + WRAPPER_VIRTUAL_CHANNEL_CLASS_JAR_ENTRY + ", "
                    + WRAPPER_VIRTUAL_SERVER_SOCKET_CLASS_JAR_ENTRY + ".");
        }
    }

    private void copyBootJarFromAssets(AssetManager assetManager, String jarName, File destinationJar) throws IOException {
        File parent = destinationJar.getParentFile();
        if (parent != null) {
            ensureDirectory(parent);
        }
        String assetPath = BOOT_JAR_ASSET_DIRECTORY + "/" + jarName;
        File rawAssetJar = new File(parent, jarName + ".asset");
        File roundTripJar = new File(parent, jarName + ".zipstage");
        deleteQuietly(rawAssetJar);
        deleteQuietly(roundTripJar);

        try (InputStream inputStream = assetManager.open(assetPath);
             OutputStream outputStream = new FileOutputStream(rawAssetJar)) {
            copyStream(inputStream, outputStream);
        }
        validateBootJar(rawAssetJar, jarName);
        copyBootJarViaZipRoundTrip(rawAssetJar, roundTripJar);
        validateBootJar(roundTripJar, jarName);
        promoteStagedFile(roundTripJar, destinationJar);
        deleteQuietly(rawAssetJar);
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
    private List<Path> resolveLibraryFiles(String... classpaths) {
        List<Path> libraryFiles = new ArrayList<>();
        if (classpaths == null || classpaths.length == 0) {
            return libraryFiles;
        }
        for (String classpath : classpaths) {
            if (TextUtils.isEmpty(classpath)) {
                continue;
            }
            String[] segments = classpath.split(File.pathSeparator);
            for (String segment : segments) {
                File candidate = new File(segment);
                if (candidate.isFile()) {
                    libraryFiles.add(candidate.toPath());
                }
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

    private String mergeConsoleOutput(String first, String second) {
        if (TextUtils.isEmpty(first)) {
            return second == null ? "" : second;
        }
        if (TextUtils.isEmpty(second)) {
            return first;
        }
        return first + "\n" + second;
    }

    private String buildBootClasspathDiagnostics(
            String resolvedBootClasspath,
            String resolvedClasspath,
            String[] args) {
        List<String> diagnostics = new ArrayList<>();
        diagnostics.add("Resolved bootClasspath = " + resolvedBootClasspath);
        diagnostics.add("Resolved classpath = " + resolvedClasspath);
        diagnostics.add("Boot jar source = " + bootJarSource);
        diagnostics.add("Wrapper jar source = " + wrapperJarSource);
        diagnostics.add("ECJ args = " + Arrays.toString(args));
        return TextUtils.join("\n", diagnostics);
    }

    private String formatBootClasspathDetails(String bootClasspathDiagnostics) {
        if (isNullOrEmpty(bootClasspathDiagnostics)) {
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

    private String buildRuntimeDetails(
            JavaSourceParser.ParsedJavaSource parsedSource,
            File sourceFile,
            JavaSourceParser.PreparedJavaSource preparedSource) {
        List<String> details = new ArrayList<>();
        if (parsedSource != null) {
            details.add("Class: " + parsedSource.getQualifiedClassName());
        }
        if (sourceFile != null) {
            details.add("Source: " + sourceFile.getName());
        }
        if (preparedSource != null && preparedSource.hadWrapperRewrites()) {
            details.add((preparedSource.isPseudoMainActivity()
                    ? "Pseudo MainActivity rewrites: "
                    : "Wrapper rewrites: ") + preparedSource.getRewriteCount());
        }
        details.add(BUNDLED_COMPILER_LAYOUT);
        return TextUtils.join("\n", details);
    }

    private String formatRewriteDetails(JavaSourceParser.PreparedJavaSource preparedSource) {
        if (preparedSource == null || !preparedSource.hadWrapperRewrites()) {
            return "";
        }
        if (preparedSource.isPseudoMainActivity()) {
            return "Pseudo MainActivity rewrites: " + preparedSource.getRewriteCount();
        }
        return "Wrapper rewrites: " + preparedSource.getRewriteCount();
    }

    private String buildExecutionSummary(
            JavaSourceParser.ParsedJavaSource parsedSource,
            InvocationOutcome outcome,
            JavaSourceParser.PreparedJavaSource preparedSource) {
        if (preparedSource != null && preparedSource.isPseudoMainActivity()) {
            return parsedSource.getQualifiedClassName()
                    + " executed as a pseudo MainActivity and rendered through OutputActivity.";
        }
        return parsedSource.getQualifiedClassName() + " executed successfully via " + outcome.entrypoint + ".";
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

    static String joinClasspaths(String... classpaths) {
        if (classpaths == null || classpaths.length == 0) {
            return "";
        }
        List<String> segments = new ArrayList<>();
        for (String classpath : classpaths) {
            if (isNullOrEmpty(classpath)) {
                continue;
            }
            String[] parts = classpath.split(File.pathSeparator);
            for (String part : parts) {
                if (!isNullOrEmpty(part)) {
                    segments.add(part);
                }
            }
        }
        return String.join(File.pathSeparator, segments);
    }

    private static boolean isNullOrEmpty(String value) {
        return value == null || value.length() == 0;
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
        private final Object returnValueObject;
        private final Class<?> dynamicClass;

        private InvocationOutcome(String entrypoint, String stdout, String stderr, Object returnValueObject, Class<?> dynamicClass) {
            this.entrypoint = entrypoint;
            this.stdout = stdout == null ? "" : stdout;
            this.stderr = stderr == null ? "" : stderr;
            this.returnValueObject = returnValueObject;
            this.dynamicClass = dynamicClass;
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

    public static final class VirtualSocketBridge implements Closeable {
        private final Socket socket;
        private final InputStream inputStream;
        private final OutputStream outputStream;

        private VirtualSocketBridge(Socket socket) throws IOException {
            if (socket == null) {
                throw new IllegalArgumentException("socket == null");
            }
            this.socket = socket;
            InputStream resolvedInputStream = null;
            OutputStream resolvedOutputStream = null;
            try {
                resolvedInputStream = socket.getInputStream();
                resolvedOutputStream = socket.getOutputStream();
            } catch (IOException exception) {
                try {
                    socket.close();
                } catch (IOException closeFailure) {
                    exception.addSuppressed(closeFailure);
                }
                throw exception;
            }
            this.inputStream = resolvedInputStream;
            this.outputStream = resolvedOutputStream;
        }

        public InputStream getInputStream() {
            return inputStream;
        }

        public OutputStream getOutputStream() {
            return outputStream;
        }

        public void shutdownOutput() throws IOException {
            outputStream.close();
        }

        @Override
        public void close() throws IOException {
            socket.close();
        }
    }
}
