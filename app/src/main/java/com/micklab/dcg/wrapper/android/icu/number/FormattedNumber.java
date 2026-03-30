// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class FormattedNumber {
    private final android.icu.number.FormattedNumber real;

    public FormattedNumber(android.icu.number.FormattedNumber real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.FormattedNumber wrap(android.icu.number.FormattedNumber real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.FormattedNumber(real);
    }

    public android.icu.number.FormattedNumber unwrap() {
        return real;
    }

    public char charAt(int arg0) {
        return real.charAt(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass getNounClass() {
        return com.micklab.dcg.wrapper.android.icu.text.DisplayOptions.NounClass.wrap(real.getNounClass());
    }

    public com.micklab.dcg.wrapper.android.icu.util.MeasureUnit getOutputUnit() {
        return com.micklab.dcg.wrapper.android.icu.util.MeasureUnit.wrap(real.getOutputUnit());
    }

    public int length() {
        return real.length();
    }

    public boolean nextPosition(com.micklab.dcg.wrapper.android.icu.text.ConstrainedFieldPosition arg0) {
        return real.nextPosition(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.CharSequence subSequence(int arg0, int arg1) {
        return real.subSequence(arg0, arg1);
    }

    public java.math.BigDecimal toBigDecimal() {
        return real.toBigDecimal();
    }

    public java.text.AttributedCharacterIterator toCharacterIterator() {
        return real.toCharacterIterator();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
