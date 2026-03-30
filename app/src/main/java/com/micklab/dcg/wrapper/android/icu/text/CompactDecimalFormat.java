// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class CompactDecimalFormat {
    private final android.icu.text.CompactDecimalFormat real;

    public CompactDecimalFormat(android.icu.text.CompactDecimalFormat real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat wrap(android.icu.text.CompactDecimalFormat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat(real);
    }

    public android.icu.text.CompactDecimalFormat unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat getInstance(java.util.Locale arg0, com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat.CompactStyle arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat.wrap(android.icu.text.CompactDecimalFormat.getInstance(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat.CompactStyle arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat.wrap(android.icu.text.CompactDecimalFormat.getInstance(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public java.lang.Number parse(java.lang.String arg0, java.text.ParsePosition arg1) {
        return real.parse(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.icu.util.CurrencyAmount parseCurrency(java.lang.CharSequence arg0, java.text.ParsePosition arg1) {
        return com.micklab.dcg.wrapper.android.icu.util.CurrencyAmount.wrap(real.parseCurrency(arg0, arg1));
    }

    public static final class CompactStyle {
        private final android.icu.text.CompactDecimalFormat.CompactStyle real;

        public CompactStyle(android.icu.text.CompactDecimalFormat.CompactStyle real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat.CompactStyle wrap(android.icu.text.CompactDecimalFormat.CompactStyle real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.CompactDecimalFormat.CompactStyle(real);
        }

        public android.icu.text.CompactDecimalFormat.CompactStyle unwrap() {
            return real;
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
