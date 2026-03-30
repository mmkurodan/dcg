// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class SelectFormat {
    private final android.icu.text.SelectFormat real;

    public SelectFormat(android.icu.text.SelectFormat real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.SelectFormat wrap(android.icu.text.SelectFormat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.SelectFormat(real);
    }

    public android.icu.text.SelectFormat unwrap() {
        return real;
    }

    public SelectFormat(java.lang.String arg0) {
        this(new android.icu.text.SelectFormat(arg0));
    }

    public void applyPattern(java.lang.String arg0) {
        real.applyPattern(arg0);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String format(java.lang.String arg0) {
        return real.format(arg0);
    }

    public java.lang.StringBuffer format(java.lang.Object arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return real.format(arg0, arg1, arg2);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.Object parseObject(java.lang.String arg0, java.text.ParsePosition arg1) {
        return real.parseObject(arg0, arg1);
    }

    public java.lang.String toPattern() {
        return real.toPattern();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
