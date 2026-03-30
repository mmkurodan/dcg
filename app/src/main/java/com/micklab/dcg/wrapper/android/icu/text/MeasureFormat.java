// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class MeasureFormat {
    private final android.icu.text.MeasureFormat real;

    public MeasureFormat(android.icu.text.MeasureFormat real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.MeasureFormat wrap(android.icu.text.MeasureFormat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.MeasureFormat(real);
    }

    public android.icu.text.MeasureFormat unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.StringBuffer format(java.lang.Object arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return real.format(arg0, arg1, arg2);
    }

    public java.lang.StringBuilder formatMeasurePerUnit(com.micklab.dcg.wrapper.android.icu.util.Measure arg0, com.micklab.dcg.wrapper.android.icu.util.MeasureUnit arg1, java.lang.StringBuilder arg2, java.text.FieldPosition arg3) {
        return real.formatMeasurePerUnit(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
    }

    public java.lang.String formatMeasures(android.icu.util.Measure... arg0) {
        return real.formatMeasures(arg0);
    }

    public java.lang.StringBuilder formatMeasures(java.lang.StringBuilder arg0, java.text.FieldPosition arg1, android.icu.util.Measure... arg2) {
        return real.formatMeasures(arg0, arg1, arg2);
    }

    public static com.micklab.dcg.wrapper.android.icu.text.MeasureFormat getCurrencyFormat() {
        return com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.wrap(android.icu.text.MeasureFormat.getCurrencyFormat());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.MeasureFormat getCurrencyFormat(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.wrap(android.icu.text.MeasureFormat.getCurrencyFormat(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.MeasureFormat getCurrencyFormat(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.wrap(android.icu.text.MeasureFormat.getCurrencyFormat(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.MeasureFormat getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.wrap(android.icu.text.MeasureFormat.getInstance(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.MeasureFormat getInstance(java.util.Locale arg0, com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.wrap(android.icu.text.MeasureFormat.getInstance(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.MeasureFormat getInstance(java.util.Locale arg0, com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth arg1, com.micklab.dcg.wrapper.android.icu.text.NumberFormat arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.wrap(android.icu.text.MeasureFormat.getInstance(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.MeasureFormat getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth arg1, com.micklab.dcg.wrapper.android.icu.text.NumberFormat arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.wrap(android.icu.text.MeasureFormat.getInstance(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.util.ULocale getLocale() {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(real.getLocale());
    }

    public com.micklab.dcg.wrapper.android.icu.text.NumberFormat getNumberFormat() {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(real.getNumberFormat());
    }

    public java.lang.String getUnitDisplayName(com.micklab.dcg.wrapper.android.icu.util.MeasureUnit arg0) {
        return real.getUnitDisplayName(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth getWidth() {
        return com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth.wrap(real.getWidth());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public com.micklab.dcg.wrapper.android.icu.util.Measure parseObject(java.lang.String arg0, java.text.ParsePosition arg1) {
        return com.micklab.dcg.wrapper.android.icu.util.Measure.wrap(real.parseObject(arg0, arg1));
    }

    public static final class FormatWidth {
        private final android.icu.text.MeasureFormat.FormatWidth real;

        public FormatWidth(android.icu.text.MeasureFormat.FormatWidth real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth wrap(android.icu.text.MeasureFormat.FormatWidth real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth(real);
        }

        public android.icu.text.MeasureFormat.FormatWidth unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth.wrap(android.icu.text.MeasureFormat.FormatWidth.valueOf(arg0));
        }

        public static android.icu.text.MeasureFormat.FormatWidth[] values() {
            return android.icu.text.MeasureFormat.FormatWidth.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth NARROW = com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth.wrap(android.icu.text.MeasureFormat.FormatWidth.NARROW);
        public static final com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth NUMERIC = com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth.wrap(android.icu.text.MeasureFormat.FormatWidth.NUMERIC);
        public static final com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth SHORT = com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth.wrap(android.icu.text.MeasureFormat.FormatWidth.SHORT);
        public static final com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth WIDE = com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth.wrap(android.icu.text.MeasureFormat.FormatWidth.WIDE);

    }
}
