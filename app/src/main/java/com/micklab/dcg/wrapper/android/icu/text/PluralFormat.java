// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class PluralFormat {
    private final android.icu.text.PluralFormat real;

    public PluralFormat(android.icu.text.PluralFormat real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.PluralFormat wrap(android.icu.text.PluralFormat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.PluralFormat(real);
    }

    public android.icu.text.PluralFormat unwrap() {
        return real;
    }

    public PluralFormat() {
        this(new android.icu.text.PluralFormat());
    }

    public PluralFormat(java.lang.String arg0) {
        this(new android.icu.text.PluralFormat(arg0));
    }

    public PluralFormat(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        this(new android.icu.text.PluralFormat(arg0 == null ? null : arg0.unwrap()));
    }

    public PluralFormat(java.util.Locale arg0) {
        this(new android.icu.text.PluralFormat(arg0));
    }

    public PluralFormat(com.micklab.dcg.wrapper.android.icu.text.PluralRules arg0) {
        this(new android.icu.text.PluralFormat(arg0 == null ? null : arg0.unwrap()));
    }

    public PluralFormat(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, java.lang.String arg1) {
        this(new android.icu.text.PluralFormat(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public PluralFormat(java.util.Locale arg0, com.micklab.dcg.wrapper.android.icu.text.PluralRules.PluralType arg1) {
        this(new android.icu.text.PluralFormat(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public PluralFormat(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.text.PluralRules.PluralType arg1) {
        this(new android.icu.text.PluralFormat(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public PluralFormat(com.micklab.dcg.wrapper.android.icu.text.PluralRules arg0, java.lang.String arg1) {
        this(new android.icu.text.PluralFormat(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public PluralFormat(java.util.Locale arg0, com.micklab.dcg.wrapper.android.icu.text.PluralRules arg1) {
        this(new android.icu.text.PluralFormat(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public PluralFormat(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.text.PluralRules arg1) {
        this(new android.icu.text.PluralFormat(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public PluralFormat(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.text.PluralRules arg1, java.lang.String arg2) {
        this(new android.icu.text.PluralFormat(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public PluralFormat(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.text.PluralRules.PluralType arg1, java.lang.String arg2) {
        this(new android.icu.text.PluralFormat(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public void applyPattern(java.lang.String arg0) {
        real.applyPattern(arg0);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public boolean equals(com.micklab.dcg.wrapper.android.icu.text.PluralFormat arg0) {
        return real.equals(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String format(double arg0) {
        return real.format(arg0);
    }

    public java.lang.StringBuffer format(java.lang.Object arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return real.format(arg0, arg1, arg2);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.Number parse(java.lang.String arg0, java.text.ParsePosition arg1) {
        return real.parse(arg0, arg1);
    }

    public java.lang.Object parseObject(java.lang.String arg0, java.text.ParsePosition arg1) {
        return real.parseObject(arg0, arg1);
    }

    public void setNumberFormat(com.micklab.dcg.wrapper.android.icu.text.NumberFormat arg0) {
        real.setNumberFormat(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String toPattern() {
        return real.toPattern();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
