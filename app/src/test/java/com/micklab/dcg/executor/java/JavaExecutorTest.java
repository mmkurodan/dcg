package com.micklab.dcg.executor.java;

import org.junit.Test;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JavaExecutorTest {
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
    public void onlineBootJarArchivesPrioritizeRecentAndroidCompatibleBuilds() throws Exception {
        Field field = JavaExecutor.class.getDeclaredField("ONLINE_BOOT_JAR_ARCHIVES");
        field.setAccessible(true);

        String[][] archives = (String[][]) field.get(null);

        assertTrue(archives.length >= 2);
        assertEquals("14.0.0_r2", archives[0][0]);
        assertTrue(archives[0][1].contains("/libcore/14.0.0_r2/libcore-14.0.0_r2.jar"));
        assertTrue(archives[0][2].contains("/libart/14.0.0_r2/libart-14.0.0_r2.jar"));
        assertTrue(archives[1][0].startsWith("13."));
    }
}
