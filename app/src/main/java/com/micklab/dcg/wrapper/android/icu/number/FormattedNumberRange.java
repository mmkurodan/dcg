// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class FormattedNumberRange {
    private final android.icu.number.FormattedNumberRange real;

    public FormattedNumberRange(android.icu.number.FormattedNumberRange real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.FormattedNumberRange wrap(android.icu.number.FormattedNumberRange real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.FormattedNumberRange(real);
    }

    public android.icu.number.FormattedNumberRange unwrap() {
        return real;
    }

    public char charAt(int arg0) {
        return real.charAt(arg0);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.math.BigDecimal getFirstBigDecimal() {
        return real.getFirstBigDecimal();
    }

    public com.micklab.dcg.wrapper.android.icu.number.NumberRangeFormatter.RangeIdentityResult getIdentityResult() {
        return com.micklab.dcg.wrapper.android.icu.number.NumberRangeFormatter.RangeIdentityResult.wrap(real.getIdentityResult());
    }

    public java.math.BigDecimal getSecondBigDecimal() {
        return real.getSecondBigDecimal();
    }

    public int hashCode() {
        return real.hashCode();
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

    public java.text.AttributedCharacterIterator toCharacterIterator() {
        return real.toCharacterIterator();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
