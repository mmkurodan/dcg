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
    public void javaTemplateContainsPseudoMainActivityScaffold() {
        String template = SupportedLanguage.JAVA.defaultTemplate("HelloJava");
        assertTrue(template.contains("protected void onCreate()"));
        assertTrue(template.contains("addButton(\"Greet\", \"greet\")"));
        assertTrue(template.contains("class HelloJava"));
        assertTrue(!template.contains("android.os.Bundle"));
    }
}
