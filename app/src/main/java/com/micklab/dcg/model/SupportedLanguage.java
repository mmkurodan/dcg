package com.micklab.dcg.model;

import java.util.Locale;

public enum SupportedLanguage {
    JAVA("java", "Java", ".java", "text/x-java-source"),
    PYTHON("python", "Python", ".py", "text/x-python"),
    NODE("node", "Node.js", ".js", "application/javascript"),
    CPP_WASM("cpp-wasm", "C++ (WASM)", ".cpp", "text/x-c++src");

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
                        + "    public static String run() {\n"
                        + "        return \"Hello from dynamic Java!\";\n"
                        + "    }\n"
                        + "}\n";
            case PYTHON:
                return "# Python executor placeholder\n"
                        + "print(\"Python runtime is not wired yet.\")\n";
            case NODE:
                return "// Node.js executor placeholder\n"
                        + "console.log(\"Node.js runtime is not wired yet.\");\n";
            case CPP_WASM:
            default:
                return "// C++ (WASM) executor placeholder\n"
                        + "int main() {\n"
                        + "    return 0;\n"
                        + "}\n";
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
        if (lower.endsWith(".py")) {
            return PYTHON;
        }
        if (lower.endsWith(".js") || lower.endsWith(".mjs") || lower.endsWith(".cjs")) {
            return NODE;
        }
        if (lower.endsWith(".cpp") || lower.endsWith(".cc") || lower.endsWith(".cxx") || lower.endsWith(".wasm")) {
            return CPP_WASM;
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
