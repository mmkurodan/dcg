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
    public void kotlinFileExtensionMapsToKotlin() {
        assertEquals(SupportedLanguage.KOTLIN, SupportedLanguage.fromFileName("script.kts"));
    }

    @Test
    public void javaScriptFileExtensionMapsToJavaScript() {
        assertEquals(SupportedLanguage.JAVASCRIPT, SupportedLanguage.fromFileName("script.js"));
    }

    @Test
    public void javaTemplateContainsRunMethod() {
        String template = SupportedLanguage.JAVA.defaultTemplate("HelloJava");
        assertTrue(template.contains("public static String run()"));
        assertTrue(template.contains("class HelloJava"));
    }
}
