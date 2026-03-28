package com.micklab.dcg.executor.java;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

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
}
