package com.micklab.dcg.executor.java;

import com.micklab.dcg.model.SupportedLanguage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class JavaSourceParser {
    private static final Pattern PACKAGE_PATTERN = Pattern.compile("(?m)^\\s*package\\s+([A-Za-z_][A-Za-z0-9_\\.]*)\\s*;");
    private static final Pattern TYPE_PATTERN = Pattern.compile("(?m)^\\s*(?:public\\s+)?(?:final\\s+|abstract\\s+)?(?:class|interface|enum)\\s+([A-Za-z_][A-Za-z0-9_]*)");

    private JavaSourceParser() {
    }

    public static ParsedJavaSource parse(String source, String fallbackTitle) {
        String packageName = detectPackageName(source);
        String className = tryDetectPrimaryTypeName(source);
        if (className == null || className.trim().isEmpty()) {
            throw new IllegalArgumentException("The Java source must declare a class, interface, or enum before it can be compiled.");
        }
        return new ParsedJavaSource(packageName, className, fallbackTitle);
    }

    public static String tryDetectPrimaryTypeName(String source) {
        if (source == null) {
            return null;
        }
        Matcher matcher = TYPE_PATTERN.matcher(source);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    private static String detectPackageName(String source) {
        if (source == null) {
            return "";
        }
        Matcher matcher = PACKAGE_PATTERN.matcher(source);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }

    public static final class ParsedJavaSource {
        private final String packageName;
        private final String className;
        private final String fallbackTitle;

        ParsedJavaSource(String packageName, String className, String fallbackTitle) {
            this.packageName = packageName == null ? "" : packageName;
            this.className = className;
            this.fallbackTitle = fallbackTitle == null ? "Snippet" : fallbackTitle;
        }

        public String getQualifiedClassName() {
            return packageName.isEmpty() ? className : packageName + "." + className;
        }

        public String getDisplayFileName() {
            return className + SupportedLanguage.JAVA.getExtension();
        }

        public String getRelativeSourcePath() {
            String fileName = getDisplayFileName();
            if (packageName.isEmpty()) {
                return fileName;
            }
            return packageName.replace('.', '/') + "/" + fileName;
        }

        public String getFallbackTitle() {
            return fallbackTitle;
        }
    }
}
