// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class SelectFormat {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SelectFormat(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.SelectFormat wrap(android.icu.text.SelectFormat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.SelectFormat(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.SelectFormat getReal() {
        return (android.icu.text.SelectFormat) real;
    }

    public android.icu.text.SelectFormat unwrap() {
        return getReal();
    }

    public SelectFormat(java.lang.String arg0) {
        this(new android.icu.text.SelectFormat(arg0), (__DcgwBridgeToken) null);
    }

    public void applyPattern(java.lang.String arg0) {
        ((android.icu.text.SelectFormat) real).applyPattern(arg0);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.text.SelectFormat) real).equals(arg0);
    }

    public java.lang.String format(java.lang.String arg0) {
        return ((android.icu.text.SelectFormat) real).format(arg0);
    }

    public java.lang.StringBuffer format(java.lang.Object arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return ((android.icu.text.SelectFormat) real).format(arg0, arg1, arg2);
    }

    public int hashCode() {
        return ((android.icu.text.SelectFormat) real).hashCode();
    }

    public java.lang.Object parseObject(java.lang.String arg0, java.text.ParsePosition arg1) {
        return ((android.icu.text.SelectFormat) real).parseObject(arg0, arg1);
    }

    public java.lang.String toPattern() {
        return ((android.icu.text.SelectFormat) real).toPattern();
    }

    public java.lang.String toString() {
        return ((android.icu.text.SelectFormat) real).toString();
    }

}
