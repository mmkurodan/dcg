package javax.lang.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public enum SourceVersion {
    RELEASE_0,
    RELEASE_1,
    RELEASE_2,
    RELEASE_3,
    RELEASE_4,
    RELEASE_5,
    RELEASE_6,
    RELEASE_7,
    RELEASE_8,
    RELEASE_9,
    RELEASE_10,
    RELEASE_11,
    RELEASE_12,
    RELEASE_13,
    RELEASE_14,
    RELEASE_15,
    RELEASE_16,
    RELEASE_17;

    private static final Set<String> KEYWORDS = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(
            "abstract",
            "assert",
            "boolean",
            "break",
            "byte",
            "case",
            "catch",
            "char",
            "class",
            "const",
            "continue",
            "default",
            "do",
            "double",
            "else",
            "enum",
            "exports",
            "extends",
            "false",
            "final",
            "finally",
            "float",
            "for",
            "goto",
            "if",
            "implements",
            "import",
            "instanceof",
            "int",
            "interface",
            "long",
            "module",
            "native",
            "new",
            "null",
            "open",
            "opens",
            "package",
            "private",
            "protected",
            "provides",
            "public",
            "requires",
            "return",
            "sealed",
            "short",
            "static",
            "strictfp",
            "super",
            "switch",
            "synchronized",
            "this",
            "throw",
            "throws",
            "to",
            "transient",
            "transitive",
            "true",
            "try",
            "uses",
            "var",
            "void",
            "volatile",
            "while",
            "with",
            "yield",
            "_"
    )));

    public static SourceVersion latest() {
        return RELEASE_17;
    }

    public static SourceVersion latestSupported() {
        return latest();
    }

    public static boolean isIdentifier(CharSequence name) {
        if (name == null || name.length() == 0) {
            return false;
        }
        if (!Character.isJavaIdentifierStart(name.charAt(0))) {
            return false;
        }
        for (int index = 1; index < name.length(); index++) {
            if (!Character.isJavaIdentifierPart(name.charAt(index))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isName(CharSequence name) {
        if (name == null || name.length() == 0) {
            return false;
        }
        String[] parts = name.toString().split("\\.");
        for (String part : parts) {
            if (!isIdentifier(part) || isKeyword(part)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isKeyword(CharSequence name) {
        if (name == null) {
            return false;
        }
        return KEYWORDS.contains(name.toString());
    }

    public static boolean isKeyword(CharSequence name, SourceVersion sourceVersion) {
        return isKeyword(name);
    }
}
