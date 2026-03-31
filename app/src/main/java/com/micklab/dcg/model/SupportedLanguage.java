package com.micklab.dcg.model;

import java.util.Locale;

public enum SupportedLanguage {
    JAVA("java", "Java", ".java", "text/x-java-source"),
    KOTLIN("kotlin", "Kotlin", ".kt", "text/x-kotlin"),
    JAVASCRIPT("javascript", "JavaScript", ".js", "application/javascript");

    private final String id;
    private final String displayName;
    private final String extension;
    private final String mimeType;

    SupportedLanguage(String id, String displayName, String extension, String mimeType) {
        this.id = id;
        this.displayName = displayName;
        this.extension = extension;
        this.mimeType = mimeType;
    }

    public String getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getExtension() {
        return extension;
    }

    public String getMimeType() {
        return mimeType;
    }

    public boolean isImplementedToday() {
        return this == JAVA;
    }

    public String buildFileName(String baseName) {
        return sanitizeBaseName(baseName) + extension;
    }

    public String defaultTemplate(String baseName) {
        String safeName = sanitizeBaseName(baseName);
        switch (this) {
            case JAVA:
                String javaName = safeName.isEmpty() ? "HelloJava" : safeName;
                if (!Character.isJavaIdentifierStart(javaName.charAt(0))) {
                    javaName = "Snippet" + javaName;
                }
                return "public class " + javaName + " {\n"
                        + "    protected void onCreate(android.os.Bundle savedInstanceState) {\n"
                        + "        println(\"Hello from pseudo MainActivity!\");\n"
                        + "        addInput(\"name\", \"Your name\");\n"
                        + "        addButton(\"Greet\", \"greet\");\n"
                        + "    }\n\n"
                        + "    public static Object greet(java.util.Map<String, String> values) {\n"
                        + "        String name = values.get(\"name\");\n"
                        + "        return \"Hello, \" + (name == null || name.isEmpty() ? \"world\" : name) + \"!\";\n"
                        + "    }\n"
                        + "}\n";
            case KOTLIN:
                return "// Kotlin executor placeholder\n"
                        + "fun run(): String {\n"
                        + "    return \"Kotlin runtime is not wired yet.\"\n"
                        + "}\n";
            case JAVASCRIPT:
            default:
                return "// JavaScript executor placeholder\n"
                        + "console.log(\"JavaScript runtime is not wired yet.\");\n";
        }
    }

    public static SupportedLanguage fromId(String id) {
        if (id != null) {
            for (SupportedLanguage language : values()) {
                if (language.id.equalsIgnoreCase(id)) {
                    return language;
                }
            }
        }
        return JAVA;
    }

    public static SupportedLanguage fromFileName(String fileName) {
        if (fileName == null) {
            return JAVA;
        }
        String lower = fileName.toLowerCase(Locale.US);
        if (lower.endsWith(".kt") || lower.endsWith(".kts")) {
            return KOTLIN;
        }
        if (lower.endsWith(".js") || lower.endsWith(".mjs") || lower.endsWith(".cjs")) {
            return JAVASCRIPT;
        }
        return JAVA;
    }

    public static int spinnerPositionOf(SupportedLanguage language) {
        SupportedLanguage target = language == null ? JAVA : language;
        SupportedLanguage[] values = values();
        for (int index = 0; index < values.length; index++) {
            if (values[index] == target) {
                return index;
            }
        }
        return 0;
    }

    public static SupportedLanguage fromSpinnerPosition(int position) {
        SupportedLanguage[] values = values();
        if (position < 0 || position >= values.length) {
            return JAVA;
        }
        return values[position];
    }

    public static String[] displayNames() {
        SupportedLanguage[] values = values();
        String[] labels = new String[values.length];
        for (int index = 0; index < values.length; index++) {
            SupportedLanguage language = values[index];
            labels[index] = language.displayName + (language.isImplementedToday() ? "" : " (coming soon)");
        }
        return labels;
    }

    public static String stripExtension(String fileName) {
        if (fileName == null || fileName.trim().isEmpty()) {
            return "Snippet";
        }
        int lastDot = fileName.lastIndexOf('.');
        if (lastDot <= 0) {
            return fileName;
        }
        return fileName.substring(0, lastDot);
    }

    public static String sanitizeBaseName(String baseName) {
        if (baseName == null) {
            return "Snippet";
        }
        String cleaned = baseName.trim().replaceAll("[^A-Za-z0-9_]+", "_");
        cleaned = cleaned.replaceAll("_+", "_");
        cleaned = cleaned.replaceAll("^_+", "");
        cleaned = cleaned.replaceAll("_+$", "");
        return cleaned.isEmpty() ? "Snippet" : cleaned;
    }
}
