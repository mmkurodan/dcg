// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class ScientificNumberFormatter {
    private final android.icu.text.ScientificNumberFormatter real;

    public ScientificNumberFormatter(android.icu.text.ScientificNumberFormatter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.ScientificNumberFormatter wrap(android.icu.text.ScientificNumberFormatter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.ScientificNumberFormatter(real);
    }

    public android.icu.text.ScientificNumberFormatter unwrap() {
        return real;
    }

    public java.lang.String format(java.lang.Object arg0) {
        return real.format(arg0);
    }

    public static com.micklab.dcg.wrapper.android.icu.text.ScientificNumberFormatter getMarkupInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, java.lang.String arg1, java.lang.String arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.ScientificNumberFormatter.wrap(android.icu.text.ScientificNumberFormatter.getMarkupInstance(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.ScientificNumberFormatter getMarkupInstance(com.micklab.dcg.wrapper.android.icu.text.DecimalFormat arg0, java.lang.String arg1, java.lang.String arg2) {
        return com.micklab.dcg.wrapper.android.icu.text.ScientificNumberFormatter.wrap(android.icu.text.ScientificNumberFormatter.getMarkupInstance(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.ScientificNumberFormatter getSuperscriptInstance(com.micklab.dcg.wrapper.android.icu.text.DecimalFormat arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.ScientificNumberFormatter.wrap(android.icu.text.ScientificNumberFormatter.getSuperscriptInstance(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.ScientificNumberFormatter getSuperscriptInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.ScientificNumberFormatter.wrap(android.icu.text.ScientificNumberFormatter.getSuperscriptInstance(arg0 == null ? null : arg0.unwrap()));
    }

}
