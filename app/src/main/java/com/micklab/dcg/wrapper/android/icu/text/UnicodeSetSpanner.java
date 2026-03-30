// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class UnicodeSetSpanner {
    private final android.icu.text.UnicodeSetSpanner real;

    public UnicodeSetSpanner(android.icu.text.UnicodeSetSpanner real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner wrap(android.icu.text.UnicodeSetSpanner real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner(real);
    }

    public android.icu.text.UnicodeSetSpanner unwrap() {
        return real;
    }

    public UnicodeSetSpanner(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        this(new android.icu.text.UnicodeSetSpanner(arg0 == null ? null : arg0.unwrap()));
    }

    public int countIn(java.lang.CharSequence arg0) {
        return real.countIn(arg0);
    }

    public int countIn(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.CountMethod arg1) {
        return real.countIn(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public int countIn(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.CountMethod arg1, com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition arg2) {
        return real.countIn(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public java.lang.String deleteFrom(java.lang.CharSequence arg0) {
        return real.deleteFrom(arg0);
    }

    public java.lang.String deleteFrom(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition arg1) {
        return real.deleteFrom(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet getUnicodeSet() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.getUnicodeSet());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String replaceFrom(java.lang.CharSequence arg0, java.lang.CharSequence arg1) {
        return real.replaceFrom(arg0, arg1);
    }

    public java.lang.String replaceFrom(java.lang.CharSequence arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.CountMethod arg2) {
        return real.replaceFrom(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public java.lang.String replaceFrom(java.lang.CharSequence arg0, java.lang.CharSequence arg1, com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.CountMethod arg2, com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition arg3) {
        return real.replaceFrom(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
    }

    public java.lang.CharSequence trim(java.lang.CharSequence arg0) {
        return real.trim(arg0);
    }

    public java.lang.CharSequence trim(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.TrimOption arg1) {
        return real.trim(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public java.lang.CharSequence trim(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.TrimOption arg1, com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.SpanCondition arg2) {
        return real.trim(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public static final class CountMethod {
        private final android.icu.text.UnicodeSetSpanner.CountMethod real;

        public CountMethod(android.icu.text.UnicodeSetSpanner.CountMethod real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.CountMethod wrap(android.icu.text.UnicodeSetSpanner.CountMethod real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.CountMethod(real);
        }

        public android.icu.text.UnicodeSetSpanner.CountMethod unwrap() {
            return real;
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
        private final android.icu.text.UnicodeSetSpanner.TrimOption real;

        public TrimOption(android.icu.text.UnicodeSetSpanner.TrimOption real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.TrimOption wrap(android.icu.text.UnicodeSetSpanner.TrimOption real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.UnicodeSetSpanner.TrimOption(real);
        }

        public android.icu.text.UnicodeSetSpanner.TrimOption unwrap() {
            return real;
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
