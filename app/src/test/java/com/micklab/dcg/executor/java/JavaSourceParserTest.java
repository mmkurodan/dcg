package com.micklab.dcg.executor.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JavaSourceParserTest {
    @Test
    public void parseBuildsQualifiedClassName() {
        String source = "package demo.app;\npublic class SampleRunner { }\n";
        JavaSourceParser.ParsedJavaSource parsed = JavaSourceParser.parse(source, "SampleRunner");
        assertEquals("demo.app.SampleRunner", parsed.getQualifiedClassName());
        assertEquals("demo/app/SampleRunner.java", parsed.getRelativeSourcePath());
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseRejectsMissingTypeDeclaration() {
        JavaSourceParser.parse("package demo;\n", "Missing");
    }

    @Test
    public void prepareForCompilationRewritesAndroidImportsAndQualifiedTypes() {
        String source = "import android.graphics.Bitmap;\n"
                + "public class HelloJava {\n"
                + "  public static String run() {\n"
                + "    android.graphics.Bitmap bmp = android.graphics.Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.ARGB_8888);\n"
                + "    return String.valueOf(bmp.getWidth());\n"
                + "  }\n"
                + "}\n";
        JavaSourceParser.PreparedJavaSource prepared = JavaSourceParser.prepareForCompilation(source, "HelloJava");
        String rewritten = prepared.getRewrittenSource();

        assertTrue(rewritten.contains("import com.micklab.dcg.wrapper.android.graphics.Bitmap;"));
        assertTrue(rewritten.contains("com.micklab.dcg.wrapper.android.graphics.Bitmap bmp"));
        assertTrue(rewritten.contains("com.micklab.dcg.wrapper.android.graphics.Bitmap.createBitmap"));
        assertTrue(prepared.hadAndroidReferences());
        assertTrue(prepared.getRewriteCount() > 0);
        assertEquals("HelloJava", prepared.getParsedSource().getQualifiedClassName());
    }

    @Test
    public void prepareForCompilationLeavesNonAndroidSourceUntouched() {
        String source = "public class HelloJava {\n"
                + "  public static String run() {\n"
                + "    return \"ok\";\n"
                + "  }\n"
                + "}\n";
        JavaSourceParser.PreparedJavaSource prepared = JavaSourceParser.prepareForCompilation(source, "HelloJava");
        assertEquals(source, prepared.getRewrittenSource());
        assertEquals(0, prepared.getRewriteCount());
    }
}
