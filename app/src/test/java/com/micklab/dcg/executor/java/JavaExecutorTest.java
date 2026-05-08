package com.micklab.dcg.executor.java;

import org.junit.Test;

import java.io.File;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipFile;

import com.micklab.dcg.wrapper.net.ServerSocket;
import com.micklab.dcg.wrapper.android.os.Bundle;
import com.micklab.dcg.wrapper.pseudo.PseudoMainActivity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class JavaExecutorTest {
    private static final AtomicInteger NEXT_VIRTUAL_PORT = new AtomicInteger(18180);

    @Test
    public void runtimeVerificationChecksBatchCompilerPathOnly() throws Exception {
        Field field = JavaExecutor.class.getDeclaredField("REQUIRED_BATCH_RUNTIME_CLASSES");
        field.setAccessible(true);

        String[] classes = (String[]) field.get(null);
        List<String> requiredClasses = Arrays.asList(classes);

        assertTrue(requiredClasses.contains("com.android.tools.r8.D8"));
        assertTrue(requiredClasses.contains("org.eclipse.jdt.core.compiler.batch.BatchCompiler"));
        assertTrue(requiredClasses.contains("javax.lang.model.SourceVersion"));
        assertFalse(requiredClasses.contains("org.eclipse.jdt.internal.compiler.tool.EclipseCompiler"));
        assertFalse(requiredClasses.contains("org.eclipse.jdt.internal.compiler.apt.dispatch.BatchAnnotationProcessorManager"));
    }

    @Test
    public void bundledCompilerLayoutMentionsAndroidCompatibleBundle() throws Exception {
        Field field = JavaExecutor.class.getDeclaredField("BUNDLED_COMPILER_LAYOUT");
        field.setAccessible(true);

        String layout = (String) field.get(null);

        assertTrue(layout.contains("ecj-4.6.jar"));
        assertTrue(layout.contains("org.eclipse.jdt.core-3.12.0.jar"));
        assertTrue(layout.contains("org.eclipse.jdt.compiler.tool-1.2.0.jar"));
        assertTrue(layout.contains("org.eclipse.jdt.compiler.apt-1.2.100.jar"));
        assertTrue(layout.contains("sourceversion-stub.jar"));
        assertTrue(layout.contains("app/src/main/assets/java-rt/"));
        assertTrue(layout.contains("project-root Android.jar/android.jar"));
        assertTrue(layout.contains("app/src/main/assets/java-wrapper/android-wrapper-classpath.jar"));
        assertTrue(layout.contains("fetch-java-rt-fallback.sh"));
    }

    @Test
    public void compilerArgumentsUseResolvedBootClasspath() {
        String expectedBootClasspath = "/data/user/0/com.micklab.dcg/code_cache/java-rt/core-oj.jar"
                + File.pathSeparator
                + "/data/user/0/com.micklab.dcg/code_cache/java-rt/core-libart.jar";

        List<String> arguments = Arrays.asList(JavaExecutor.buildCompilerArguments(
                new File("/tmp/HelloJava.java"),
                new File("/tmp/classes"),
                expectedBootClasspath));

        int classpathIndex = arguments.indexOf("-classpath");
        int bootClasspathIndex = arguments.indexOf("-bootclasspath");

        assertEquals(-1, classpathIndex);
        assertTrue(bootClasspathIndex >= 0);
        assertEquals(expectedBootClasspath, arguments.get(bootClasspathIndex + 1));
    }

    @Test
    public void compilerArgumentsIncludeWrapperClasspathWhenProvided() {
        String bootClasspath = "/tmp/core-oj.jar" + File.pathSeparator + "/tmp/core-libart.jar";
        String wrapperClasspath = "/tmp/android-wrapper-classpath.jar";
        List<String> arguments = Arrays.asList(JavaExecutor.buildCompilerArguments(
                new File("/tmp/HelloJava.java"),
                new File("/tmp/classes"),
                bootClasspath,
                wrapperClasspath));

        int classpathIndex = arguments.indexOf("-classpath");
        int bootClasspathIndex = arguments.indexOf("-bootclasspath");

        assertTrue(classpathIndex >= 0);
        assertEquals(wrapperClasspath, arguments.get(classpathIndex + 1));
        assertTrue(bootClasspathIndex > classpathIndex);
        assertEquals(bootClasspath, arguments.get(bootClasspathIndex + 1));
    }

    @Test
    public void compilerArgumentsIncludeRequiredEcjOptionsOrder() {
        List<String> arguments = Arrays.asList(JavaExecutor.buildCompilerArguments(
                new File("/tmp/HelloJava.java"),
                new File("/tmp/classes"),
                "/tmp/core-oj.jar" + File.pathSeparator + "/tmp/core-libart.jar"));

        int sourceIndex = arguments.indexOf("-source");
        int targetIndex = arguments.indexOf("-target");
        int procIndex = arguments.indexOf("-proc:none");
        int encodingIndex = arguments.indexOf("-encoding");
        int debugIndex = arguments.indexOf("-g");

        assertTrue(sourceIndex >= 0);
        assertEquals("1.8", arguments.get(sourceIndex + 1));
        assertTrue(targetIndex > sourceIndex);
        assertEquals("1.8", arguments.get(targetIndex + 1));
        assertTrue(procIndex > targetIndex);
        assertTrue(encodingIndex > procIndex);
        assertEquals("UTF-8", arguments.get(encodingIndex + 1));
        assertTrue(debugIndex > encodingIndex);
    }

    @Test
    public void wrapperJarValidationRequiresBitmapAndNestedConfigClasses() throws Exception {
        Field bitmapField = JavaExecutor.class.getDeclaredField("WRAPPER_BITMAP_CLASS_JAR_ENTRY");
        bitmapField.setAccessible(true);
        String bitmapEntry = (String) bitmapField.get(null);

        Field bitmapConfigField = JavaExecutor.class.getDeclaredField("WRAPPER_BITMAP_CONFIG_CLASS_JAR_ENTRY");
        bitmapConfigField.setAccessible(true);
        String bitmapConfigEntry = (String) bitmapConfigField.get(null);

        assertEquals("com/micklab/dcg/wrapper/android/graphics/Bitmap.class", bitmapEntry);
        assertEquals("com/micklab/dcg/wrapper/android/graphics/Bitmap$Config.class", bitmapConfigEntry);
    }

    @Test
    public void stagedWrapperAssetContainsBitmapNestedClasses() throws Exception {
        File wrapperJar = new File("src/main/assets/java-wrapper/android-wrapper-classpath.jar");
        assertTrue(wrapperJar.isFile());

        try (ZipFile zipFile = new ZipFile(wrapperJar)) {
            assertNotNull(zipFile.getEntry("com/micklab/dcg/wrapper/android/graphics/Bitmap.class"));
            assertNotNull(zipFile.getEntry("com/micklab/dcg/wrapper/android/graphics/Bitmap$Config.class"));
            assertNotNull(zipFile.getEntry("com/micklab/dcg/wrapper/android/graphics/Bitmap$CompressFormat.class"));
        }
    }

    @Test
    public void stagedWrapperAssetContainsBuildWrapperClasses() throws Exception {
        File wrapperJar = new File("src/main/assets/java-wrapper/android-wrapper-classpath.jar");
        assertTrue(wrapperJar.isFile());

        try (ZipFile zipFile = new ZipFile(wrapperJar)) {
            assertNotNull(zipFile.getEntry("com/micklab/dcg/wrapper/android/os/Build.class"));
            assertNotNull(zipFile.getEntry("com/micklab/dcg/wrapper/android/os/Build$VERSION.class"));
        }
    }

    @Test
    public void stagedWrapperAssetContainsVirtualNetworkClasses() throws Exception {
        File wrapperJar = new File("src/main/assets/java-wrapper/android-wrapper-classpath.jar");
        assertTrue(wrapperJar.isFile());

        try (ZipFile zipFile = new ZipFile(wrapperJar)) {
            assertNotNull(zipFile.getEntry("com/micklab/dcg/wrapper/net/Socket.class"));
            assertNotNull(zipFile.getEntry("com/micklab/dcg/wrapper/net/ServerSocket.class"));
            assertNotNull(zipFile.getEntry("com/micklab/dcg/wrapper/net/VirtualNetwork.class"));
            assertNotNull(zipFile.getEntry("com/micklab/dcg/wrapper/net/VirtualChannel.class"));
            assertNotNull(zipFile.getEntry("com/micklab/dcg/wrapper/net/VirtualServerSocket.class"));
        }
    }

    @Test
    public void virtualSocketBridgeConnectsToVirtualServerSocket() throws Exception {
        int port = NEXT_VIRTUAL_PORT.incrementAndGet();
        ServerSocket serverSocket = new ServerSocket(port);
        JavaExecutor executor = new JavaExecutor();
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        CountDownLatch serverAccepted = new CountDownLatch(1);
        try {
            Future<String> serverFuture = threadPool.submit(() -> {
                com.micklab.dcg.wrapper.net.Socket accepted = serverSocket.accept();
                serverAccepted.countDown();
                try {
                    byte[] buffer = new byte[4];
                    int read = accepted.getInputStream().read(buffer);
                    accepted.getOutputStream().write("pong".getBytes(StandardCharsets.UTF_8));
                    accepted.getOutputStream().flush();
                    return new String(buffer, 0, read, StandardCharsets.UTF_8);
                } finally {
                    accepted.close();
                    serverSocket.close();
                }
            });

            Future<String> clientFuture = threadPool.submit(() -> {
                try (JavaExecutor.VirtualSocketBridge bridge = executor.openVirtualSocketBridge(port)) {
                    bridge.getOutputStream().write("ping".getBytes(StandardCharsets.UTF_8));
                    bridge.getOutputStream().flush();

                    byte[] response = new byte[4];
                    int read = bridge.getInputStream().read(response);
                    return new String(response, 0, read, StandardCharsets.UTF_8);
                }
            });

            assertTrue(serverAccepted.await(5, TimeUnit.SECONDS));
            assertEquals("ping", serverFuture.get(5, TimeUnit.SECONDS));
            assertEquals("pong", clientFuture.get(5, TimeUnit.SECONDS));
        } finally {
            threadPool.shutdownNow();
        }
    }

    @Test
    public void joinClasspathsConcatenatesNonEmptySegmentsInOrder() {
        String merged = JavaExecutor.joinClasspaths(
                "/tmp/a.jar",
                "",
                null,
                "/tmp/b.jar" + File.pathSeparator + "/tmp/c.jar");
        assertEquals(
                "/tmp/a.jar" + File.pathSeparator + "/tmp/b.jar" + File.pathSeparator + "/tmp/c.jar",
                merged);
    }

    @Test
    public void buildOutputMethodCountsAsSupportedEntrypoint() {
        String guidance = com.micklab.dcg.util.DiagnosticFormatter.formatEntrypointGuidance("demo.MainActivity");
        assertTrue(guidance.contains("build"));
        assertTrue(guidance.contains("MainActivity-style onCreate()"));
    }

    @Test
    public void pseudoMainActivityBundleCallbackDelegatesToNoArgOverride() {
        NoArgPseudoActivity activity = new NoArgPseudoActivity();

        activity.trigger();

        assertTrue(activity.invoked);
    }

    public static final class NoArgPseudoActivity extends PseudoMainActivity {
        private boolean invoked;

        @Override
        protected void onCreate() {
            invoked = true;
        }

        void trigger() {
            onCreate((Bundle) null);
        }
    }
}
