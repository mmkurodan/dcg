// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class ListFormatter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ListFormatter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.ListFormatter wrap(android.icu.text.ListFormatter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.ListFormatter(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.ListFormatter getReal() {
        return (android.icu.text.ListFormatter) real;
    }

    public android.icu.text.ListFormatter unwrap() {
        return getReal();
    }

    public java.lang.String format(java.lang.Object... arg0) {
        return ((android.icu.text.ListFormatter) real).format(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.ListFormatter.FormattedList formatToValue(java.lang.Object... arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.ListFormatter.FormattedList.wrap(((android.icu.text.ListFormatter) real).formatToValue(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.ListFormatter getInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.ListFormatter.wrap(android.icu.text.ListFormatter.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.ListFormatter getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.ListFormatter.wrap(android.icu.text.ListFormatter.getInstance(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.ListFormatter getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.ListFormatter.wrap(android.icu.text.ListFormatter.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.ListFormatter getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.text.ListFormatter.Type arg1, com.micklab.dcg.wrapper.android.icu.text.ListFormatter.Width arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.ListFormatter.wrap(android.icu.text.ListFormatter.getInstance(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.ListFormatter getInstance(java.util.Locale arg0, com.micklab.dcg.wrapper.android.icu.text.ListFormatter.Type arg1, com.micklab.dcg.wrapper.android.icu.text.ListFormatter.Width arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.ListFormatter.wrap(android.icu.text.ListFormatter.getInstance(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public java.lang.String getPatternForNumItems(int arg0) {
        return ((android.icu.text.ListFormatter) real).getPatternForNumItems(arg0);
    }

    public static final class FormattedList {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FormattedList(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.ListFormatter.FormattedList wrap(android.icu.text.ListFormatter.FormattedList real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.ListFormatter.FormattedList(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.ListFormatter.FormattedList getReal() {
            return (android.icu.text.ListFormatter.FormattedList) real;
        }

        public android.icu.text.ListFormatter.FormattedList unwrap() {
            return getReal();
        }

        public char charAt(int arg0) {
            return ((android.icu.text.ListFormatter.FormattedList) real).charAt(arg0);
        }

        public int length() {
            return ((android.icu.text.ListFormatter.FormattedList) real).length();
        }

        public boolean nextPosition(com.micklab.dcg.wrapper.android.icu.text.ConstrainedFieldPosition arg0) {
            return ((android.icu.text.ListFormatter.FormattedList) real).nextPosition(arg0 == null ? null : arg0.getReal());
        }

        public java.lang.CharSequence subSequence(int arg0, int arg1) {
            return ((android.icu.text.ListFormatter.FormattedList) real).subSequence(arg0, arg1);
        }

        public java.text.AttributedCharacterIterator toCharacterIterator() {
            return ((android.icu.text.ListFormatter.FormattedList) real).toCharacterIterator();
        }

        public java.lang.String toString() {
            return ((android.icu.text.ListFormatter.FormattedList) real).toString();
        }

    }
    public static final class Type {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Type(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.ListFormatter.Type wrap(android.icu.text.ListFormatter.Type real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.ListFormatter.Type(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.ListFormatter.Type getReal() {
            return (android.icu.text.ListFormatter.Type) real;
        }

        public android.icu.text.ListFormatter.Type unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.ListFormatter.Type valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.ListFormatter.Type.wrap(android.icu.text.ListFormatter.Type.valueOf(arg0));
        }

        public static android.icu.text.ListFormatter.Type[] values() {
            return android.icu.text.ListFormatter.Type.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.ListFormatter.Type AND = com.micklab.dcg.wrapper.android.icu.text.ListFormatter.Type.wrap(android.icu.text.ListFormatter.Type.AND);
        public static final com.micklab.dcg.wrapper.android.icu.text.ListFormatter.Type OR = com.micklab.dcg.wrapper.android.icu.text.ListFormatter.Type.wrap(android.icu.text.ListFormatter.Type.OR);
        public static final com.micklab.dcg.wrapper.android.icu.text.ListFormatter.Type UNITS = com.micklab.dcg.wrapper.android.icu.text.ListFormatter.Type.wrap(android.icu.text.ListFormatter.Type.UNITS);

    }
    public static final class Width {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Width(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.ListFormatter.Width wrap(android.icu.text.ListFormatter.Width real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.ListFormatter.Width(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.ListFormatter.Width getReal() {
            return (android.icu.text.ListFormatter.Width) real;
        }

        public android.icu.text.ListFormatter.Width unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.ListFormatter.Width valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.ListFormatter.Width.wrap(android.icu.text.ListFormatter.Width.valueOf(arg0));
        }

        public static android.icu.text.ListFormatter.Width[] values() {
            return android.icu.text.ListFormatter.Width.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.ListFormatter.Width NARROW = com.micklab.dcg.wrapper.android.icu.text.ListFormatter.Width.wrap(android.icu.text.ListFormatter.Width.NARROW);
        public static final com.micklab.dcg.wrapper.android.icu.text.ListFormatter.Width SHORT = com.micklab.dcg.wrapper.android.icu.text.ListFormatter.Width.wrap(android.icu.text.ListFormatter.Width.SHORT);
        public static final com.micklab.dcg.wrapper.android.icu.text.ListFormatter.Width WIDE = com.micklab.dcg.wrapper.android.icu.text.ListFormatter.Width.wrap(android.icu.text.ListFormatter.Width.WIDE);

    }
}
