// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class FormattedNumberRange {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FormattedNumberRange(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.FormattedNumberRange wrap(android.icu.number.FormattedNumberRange real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.FormattedNumberRange(real, (__DcgwBridgeToken) null);
    }

    public android.icu.number.FormattedNumberRange getReal() {
        return (android.icu.number.FormattedNumberRange) real;
    }

    public android.icu.number.FormattedNumberRange unwrap() {
        return getReal();
    }

    public char charAt(int arg0) {
        return ((android.icu.number.FormattedNumberRange) real).charAt(arg0);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.number.FormattedNumberRange) real).equals(arg0);
    }

    public java.math.BigDecimal getFirstBigDecimal() {
        return ((android.icu.number.FormattedNumberRange) real).getFirstBigDecimal();
    }

    public com.micklab.dcg.wrapper.android.icu.number.NumberRangeFormatter.RangeIdentityResult getIdentityResult() {
        return com.micklab.dcg.wrapper.android.icu.number.NumberRangeFormatter.RangeIdentityResult.wrap(((android.icu.number.FormattedNumberRange) real).getIdentityResult());
    }

    public java.math.BigDecimal getSecondBigDecimal() {
        return ((android.icu.number.FormattedNumberRange) real).getSecondBigDecimal();
    }

    public int hashCode() {
        return ((android.icu.number.FormattedNumberRange) real).hashCode();
    }

    public int length() {
        return ((android.icu.number.FormattedNumberRange) real).length();
    }

    public boolean nextPosition(com.micklab.dcg.wrapper.android.icu.text.ConstrainedFieldPosition arg0) {
        return ((android.icu.number.FormattedNumberRange) real).nextPosition(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.CharSequence subSequence(int arg0, int arg1) {
        return ((android.icu.number.FormattedNumberRange) real).subSequence(arg0, arg1);
    }

    public java.text.AttributedCharacterIterator toCharacterIterator() {
        return ((android.icu.number.FormattedNumberRange) real).toCharacterIterator();
    }

    public java.lang.String toString() {
        return ((android.icu.number.FormattedNumberRange) real).toString();
    }

}
