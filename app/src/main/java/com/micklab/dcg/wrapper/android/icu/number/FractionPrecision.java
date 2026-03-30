// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class FractionPrecision {
    private final android.icu.number.FractionPrecision real;

    public FractionPrecision(android.icu.number.FractionPrecision real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.FractionPrecision wrap(android.icu.number.FractionPrecision real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.FractionPrecision(real);
    }

    public android.icu.number.FractionPrecision unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.icu.number.Precision withMaxDigits(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.Precision.wrap(real.withMaxDigits(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.number.Precision withMinDigits(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.Precision.wrap(real.withMinDigits(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.number.Precision withSignificantDigits(int arg0, int arg1, com.micklab.dcg.wrapper.android.icu.number.NumberFormatter.RoundingPriority arg2) {
        return com.micklab.dcg.wrapper.android.icu.number.Precision.wrap(real.withSignificantDigits(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

}
