// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class UnicodeSetSpanner {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UnicodeSetSpanner(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner wrap(android.icu.text.UnicodeSetSpanner real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.UnicodeSetSpanner getReal() {
        return (android.icu.text.UnicodeSetSpanner) real;
    }

    public android.icu.text.UnicodeSetSpanner unwrap() {
        return getReal();
    }

    public UnicodeSetSpanner(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        this(new android.icu.text.UnicodeSetSpanner(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public int countIn(java.lang.CharSequence arg0) {
        return ((android.icu.text.UnicodeSetSpanner) real).countIn(arg0);
    }

    public int countIn(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.CountMethod arg1) {
        return ((android.icu.text.UnicodeSetSpanner) real).countIn(arg0, arg1 == null ? null : arg1.getReal());
    }

    public int countIn(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.CountMethod arg1, com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition arg2) {
        return ((android.icu.text.UnicodeSetSpanner) real).countIn(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public java.lang.String deleteFrom(java.lang.CharSequence arg0) {
        return ((android.icu.text.UnicodeSetSpanner) real).deleteFrom(arg0);
    }

    public java.lang.String deleteFrom(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition arg1) {
        return ((android.icu.text.UnicodeSetSpanner) real).deleteFrom(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.text.UnicodeSetSpanner) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet getUnicodeSet() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.UnicodeSetSpanner) real).getUnicodeSet());
    }

    public int hashCode() {
        return ((android.icu.text.UnicodeSetSpanner) real).hashCode();
    }

    public java.lang.String replaceFrom(java.lang.CharSequence arg0, java.lang.CharSequence arg1) {
        return ((android.icu.text.UnicodeSetSpanner) real).replaceFrom(arg0, arg1);
    }

    public java.lang.String replaceFrom(java.lang.CharSequence arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.CountMethod arg2) {
        return ((android.icu.text.UnicodeSetSpanner) real).replaceFrom(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public java.lang.String replaceFrom(java.lang.CharSequence arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.CountMethod arg2, com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition arg3) {
        return ((android.icu.text.UnicodeSetSpanner) real).replaceFrom(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public java.lang.CharSequence trim(java.lang.CharSequence arg0) {
        return ((android.icu.text.UnicodeSetSpanner) real).trim(arg0);
    }

    public java.lang.CharSequence trim(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.TrimOption arg1) {
        return ((android.icu.text.UnicodeSetSpanner) real).trim(arg0, arg1 == null ? null : arg1.getReal());
    }

    public java.lang.CharSequence trim(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.TrimOption arg1, com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition arg2) {
        return ((android.icu.text.UnicodeSetSpanner) real).trim(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public static final class CountMethod {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CountMethod(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.CountMethod wrap(android.icu.text.UnicodeSetSpanner.CountMethod real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.CountMethod(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.UnicodeSetSpanner.CountMethod getReal() {
            return (android.icu.text.UnicodeSetSpanner.CountMethod) real;
        }

        public android.icu.text.UnicodeSetSpanner.CountMethod unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.CountMethod valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.CountMethod.wrap(android.icu.text.UnicodeSetSpanner.CountMethod.valueOf(arg0));
        }

        public static android.icu.text.UnicodeSetSpanner.CountMethod[] values() {
            return android.icu.text.UnicodeSetSpanner.CountMethod.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.CountMethod MIN_ELEMENTS = com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.CountMethod.wrap(android.icu.text.UnicodeSetSpanner.CountMethod.MIN_ELEMENTS);
        public static final com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.CountMethod WHOLE_SPAN = com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.CountMethod.wrap(android.icu.text.UnicodeSetSpanner.CountMethod.WHOLE_SPAN);

    }
    public static final class TrimOption {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TrimOption(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.TrimOption wrap(android.icu.text.UnicodeSetSpanner.TrimOption real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.TrimOption(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.UnicodeSetSpanner.TrimOption getReal() {
            return (android.icu.text.UnicodeSetSpanner.TrimOption) real;
        }

        public android.icu.text.UnicodeSetSpanner.TrimOption unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.TrimOption valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.TrimOption.wrap(android.icu.text.UnicodeSetSpanner.TrimOption.valueOf(arg0));
        }

        public static android.icu.text.UnicodeSetSpanner.TrimOption[] values() {
            return android.icu.text.UnicodeSetSpanner.TrimOption.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.TrimOption BOTH = com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.TrimOption.wrap(android.icu.text.UnicodeSetSpanner.TrimOption.BOTH);
        public static final com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.TrimOption LEADING = com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.TrimOption.wrap(android.icu.text.UnicodeSetSpanner.TrimOption.LEADING);
        public static final com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.TrimOption TRAILING = com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.TrimOption.wrap(android.icu.text.UnicodeSetSpanner.TrimOption.TRAILING);

    }
}
