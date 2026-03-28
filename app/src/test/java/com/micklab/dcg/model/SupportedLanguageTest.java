package com.micklab.dcg.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SupportedLanguageTest {
    @Test
    public void javaFileExtensionMapsToJava() {
        assertEquals(SupportedLanguage.JAVA, SupportedLanguage.fromFileName("HelloWorld.java"));
    }

    @Test
    public void pythonFileExtensionMapsToPython() {
        assertEquals(SupportedLanguage.PYTHON, SupportedLanguage.fromFileName("script.py"));
    }

    @Test
    public void javaTemplateContainsRunMethod() {
        String template = SupportedLanguage.JAVA.defaultTemplate("HelloJava");
        assertTrue(template.contains("public static String run()"));
        assertTrue(template.contains("class HelloJava"));
    }
}
