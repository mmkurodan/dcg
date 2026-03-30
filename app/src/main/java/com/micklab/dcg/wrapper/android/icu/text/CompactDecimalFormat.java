// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class CompactDecimalFormat {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CompactDecimalFormat(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat wrap(android.icu.text.CompactDecimalFormat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.CompactDecimalFormat getReal() {
        return (android.icu.text.CompactDecimalFormat) real;
    }

    public android.icu.text.CompactDecimalFormat unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat getInstance(java.util.Locale arg0, com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat.CompactStyle arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat.wrap(android.icu.text.CompactDecimalFormat.getInstance(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat.CompactStyle arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat.wrap(android.icu.text.CompactDecimalFormat.getInstance(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public java.lang.Number parse(java.lang.String arg0, java.text.ParsePosition arg1) {
        return ((android.icu.text.CompactDecimalFormat) real).parse(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.icu.util.CurrencyAmount parseCurrency(java.lang.CharSequence arg0, java.text.ParsePosition arg1) {
        return com.micklab.dcg.wrapper.android.icu.util.CurrencyAmount.wrap(((android.icu.text.CompactDecimalFormat) real).parseCurrency(arg0, arg1));
    }

    public static final class CompactStyle {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CompactStyle(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat.CompactStyle wrap(android.icu.text.CompactDecimalFormat.CompactStyle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat.CompactStyle(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.CompactDecimalFormat.CompactStyle getReal() {
            return (android.icu.text.CompactDecimalFormat.CompactStyle) real;
        }

        public android.icu.text.CompactDecimalFormat.CompactStyle unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat.CompactStyle valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat.CompactStyle.wrap(android.icu.text.CompactDecimalFormat.CompactStyle.valueOf(arg0));
        }

        public static android.icu.text.CompactDecimalFormat.CompactStyle[] values() {
            return android.icu.text.CompactDecimalFormat.CompactStyle.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat.CompactStyle LONG = com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat.CompactStyle.wrap(android.icu.text.CompactDecimalFormat.CompactStyle.LONG);
        public static final com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat.CompactStyle SHORT = com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat.CompactStyle.wrap(android.icu.text.CompactDecimalFormat.CompactStyle.SHORT);

    }
}
