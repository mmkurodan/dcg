// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class PluralFormat {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PluralFormat(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.PluralFormat wrap(android.icu.text.PluralFormat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.PluralFormat(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.PluralFormat getReal() {
        return (android.icu.text.PluralFormat) real;
    }

    public android.icu.text.PluralFormat unwrap() {
        return getReal();
    }

    public PluralFormat() {
        this(new android.icu.text.PluralFormat(), (__DcgwBridgeToken) null);
    }

    public PluralFormat(java.lang.String arg0) {
        this(new android.icu.text.PluralFormat(arg0), (__DcgwBridgeToken) null);
    }

    public PluralFormat(java.util.Locale arg0) {
        this(new android.icu.text.PluralFormat(arg0), (__DcgwBridgeToken) null);
    }

    public PluralFormat(com.micklab.dcg.wrapper.android.icu.text.PluralRules arg0) {
        this(new android.icu.text.PluralFormat(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public PluralFormat(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        this(new android.icu.text.PluralFormat(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public PluralFormat(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, java.lang.String arg1) {
        this(new android.icu.text.PluralFormat(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public PluralFormat(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.text.PluralRules.PluralType arg1) {
        this(new android.icu.text.PluralFormat(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public PluralFormat(java.util.Locale arg0, com.micklab.dcg.wrapper.android.icu.text.PluralRules arg1) {
        this(new android.icu.text.PluralFormat(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public PluralFormat(java.util.Locale arg0, com.micklab.dcg.wrapper.android.icu.text.PluralRules.PluralType arg1) {
        this(new android.icu.text.PluralFormat(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public PluralFormat(com.micklab.dcg.wrapper.android.icu.text.PluralRules arg0, java.lang.String arg1) {
        this(new android.icu.text.PluralFormat(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public PluralFormat(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.text.PluralRules arg1) {
        this(new android.icu.text.PluralFormat(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public PluralFormat(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.text.PluralRules.PluralType arg1, java.lang.String arg2) {
        this(new android.icu.text.PluralFormat(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public PluralFormat(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.text.PluralRules arg1, java.lang.String arg2) {
        this(new android.icu.text.PluralFormat(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public void applyPattern(java.lang.String arg0) {
        ((android.icu.text.PluralFormat) real).applyPattern(arg0);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.text.PluralFormat) real).equals(arg0);
    }

    public boolean equals(com.micklab.dcg.wrapper.android.icu.text.PluralFormat arg0) {
        return ((android.icu.text.PluralFormat) real).equals(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String format(double arg0) {
        return ((android.icu.text.PluralFormat) real).format(arg0);
    }

    public java.lang.StringBuffer format(java.lang.Object arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return ((android.icu.text.PluralFormat) real).format(arg0, arg1, arg2);
    }

    public int hashCode() {
        return ((android.icu.text.PluralFormat) real).hashCode();
    }

    public java.lang.Number parse(java.lang.String arg0, java.text.ParsePosition arg1) {
        return ((android.icu.text.PluralFormat) real).parse(arg0, arg1);
    }

    public java.lang.Object parseObject(java.lang.String arg0, java.text.ParsePosition arg1) {
        return ((android.icu.text.PluralFormat) real).parseObject(arg0, arg1);
    }

    public void setNumberFormat(com.micklab.dcg.wrapper.android.icu.text.NumberFormat arg0) {
        ((android.icu.text.PluralFormat) real).setNumberFormat(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String toPattern() {
        return ((android.icu.text.PluralFormat) real).toPattern();
    }

    public java.lang.String toString() {
        return ((android.icu.text.PluralFormat) real).toString();
    }

}
