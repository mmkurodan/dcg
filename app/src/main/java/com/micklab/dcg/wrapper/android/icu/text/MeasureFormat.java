// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class MeasureFormat {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MeasureFormat(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.MeasureFormat wrap(android.icu.text.MeasureFormat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.MeasureFormat(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.MeasureFormat getReal() {
        return (android.icu.text.MeasureFormat) real;
    }

    public android.icu.text.MeasureFormat unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.text.MeasureFormat) real).equals(arg0);
    }

    public java.lang.StringBuffer format(java.lang.Object arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return ((android.icu.text.MeasureFormat) real).format(arg0, arg1, arg2);
    }

    public java.lang.StringBuilder formatMeasurePerUnit(com.micklab.dcg.wrapper.android.icu.util.Measure arg0, com.micklab.dcg.wrapper.android.icu.util.MeasureUnit arg1, java.lang.StringBuilder arg2, java.text.FieldPosition arg3) {
        return ((android.icu.text.MeasureFormat) real).formatMeasurePerUnit(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

    public java.lang.String formatMeasures(android.icu.util.Measure... arg0) {
        return ((android.icu.text.MeasureFormat) real).formatMeasures(arg0);
    }

    public java.lang.StringBuilder formatMeasures(java.lang.StringBuilder arg0, java.text.FieldPosition arg1, android.icu.util.Measure... arg2) {
        return ((android.icu.text.MeasureFormat) real).formatMeasures(arg0, arg1, arg2);
    }

    public static com.micklab.dcg.wrapper.android.icu.text.MeasureFormat getCurrencyFormat() {
        return com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.wrap(android.icu.text.MeasureFormat.getCurrencyFormat());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.MeasureFormat getCurrencyFormat(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.wrap(android.icu.text.MeasureFormat.getCurrencyFormat(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.MeasureFormat getCurrencyFormat(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.wrap(android.icu.text.MeasureFormat.getCurrencyFormat(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.MeasureFormat getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.wrap(android.icu.text.MeasureFormat.getInstance(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.MeasureFormat getInstance(java.util.Locale arg0, com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.wrap(android.icu.text.MeasureFormat.getInstance(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.MeasureFormat getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth arg1, com.micklab.dcg.wrapper.android.icu.text.NumberFormat arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.wrap(android.icu.text.MeasureFormat.getInstance(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.MeasureFormat getInstance(java.util.Locale arg0, com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth arg1, com.micklab.dcg.wrapper.android.icu.text.NumberFormat arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.wrap(android.icu.text.MeasureFormat.getInstance(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.util.ULocale getLocale() {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(((android.icu.text.MeasureFormat) real).getLocale());
    }

    public com.micklab.dcg.wrapper.android.icu.text.NumberFormat getNumberFormat() {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(((android.icu.text.MeasureFormat) real).getNumberFormat());
    }

    public java.lang.String getUnitDisplayName(com.micklab.dcg.wrapper.android.icu.util.MeasureUnit arg0) {
        return ((android.icu.text.MeasureFormat) real).getUnitDisplayName(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth getWidth() {
        return com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth.wrap(((android.icu.text.MeasureFormat) real).getWidth());
    }

    public int hashCode() {
        return ((android.icu.text.MeasureFormat) real).hashCode();
    }

    public com.micklab.dcg.wrapper.android.icu.util.Measure parseObject(java.lang.String arg0, java.text.ParsePosition arg1) {
        return com.micklab.dcg.wrapper.android.icu.util.Measure.wrap(((android.icu.text.MeasureFormat) real).parseObject(arg0, arg1));
    }

    public static final class FormatWidth {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FormatWidth(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth wrap(android.icu.text.MeasureFormat.FormatWidth real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.MeasureFormat.FormatWidth(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.MeasureFormat.FormatWidth getReal() {
            return (android.icu.text.MeasureFormat.FormatWidth) real;
        }

        public android.icu.text.MeasureFormat.FormatWidth unwrap() {
            return getReal();
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
