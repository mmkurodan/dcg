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
}
