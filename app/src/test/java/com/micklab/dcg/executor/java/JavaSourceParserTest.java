package com.micklab.dcg.executor.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
