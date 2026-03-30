// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class FormattedNumber {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FormattedNumber(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.FormattedNumber wrap(android.icu.number.FormattedNumber real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.FormattedNumber(real, (__DcgwBridgeToken) null);
    }

    public android.icu.number.FormattedNumber getReal() {
        return (android.icu.number.FormattedNumber) real;
    }

    public android.icu.number.FormattedNumber unwrap() {
        return getReal();
    }

    public char charAt(int arg0) {
        return ((android.icu.number.FormattedNumber) real).charAt(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass getNounClass() {
        return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass.wrap(((android.icu.number.FormattedNumber) real).getNounClass());
    }

    public com.micklab.dcg.wrapper.android.icu.util.MeasureUnit getOutputUnit() {
        return com.micklab.dcg.wrapper.android.icu.util.MeasureUnit.wrap(((android.icu.number.FormattedNumber) real).getOutputUnit());
    }

    public int length() {
        return ((android.icu.number.FormattedNumber) real).length();
    }

    public boolean nextPosition(com.micklab.dcg.wrapper.android.icu.text.ConstrainedFieldPosition arg0) {
        return ((android.icu.number.FormattedNumber) real).nextPosition(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.CharSequence subSequence(int arg0, int arg1) {
        return ((android.icu.number.FormattedNumber) real).subSequence(arg0, arg1);
    }

    public java.math.BigDecimal toBigDecimal() {
        return ((android.icu.number.FormattedNumber) real).toBigDecimal();
    }

    public java.text.AttributedCharacterIterator toCharacterIterator() {
        return ((android.icu.number.FormattedNumber) real).toCharacterIterator();
    }

    public java.lang.String toString() {
        return ((android.icu.number.FormattedNumber) real).toString();
    }

}
