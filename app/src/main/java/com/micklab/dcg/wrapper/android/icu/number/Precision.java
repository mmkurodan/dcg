// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class Precision {
    private final android.icu.number.Precision real;

    public Precision(android.icu.number.Precision real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.Precision wrap(android.icu.number.Precision real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.Precision(real);
    }

    public android.icu.number.Precision unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.CurrencyPrecision currency(com.micklab.dcg.wrapper.android.icu.util.Currency.CurrencyUsage arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.CurrencyPrecision.wrap(android.icu.number.Precision.currency(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.number.FractionPrecision fixedFraction(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.FractionPrecision.wrap(android.icu.number.Precision.fixedFraction(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.number.Precision fixedSignificantDigits(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.Precision.wrap(android.icu.number.Precision.fixedSignificantDigits(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.number.Precision increment(java.math.BigDecimal arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.Precision.wrap(android.icu.number.Precision.increment(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.number.FractionPrecision integer() {
        return com.micklab.dcg.wrapper.android.icu.number.FractionPrecision.wrap(android.icu.number.Precision.integer());
    }

    public static com.micklab.dcg.wrapper.android.icu.number.FractionPrecision maxFraction(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.FractionPrecision.wrap(android.icu.number.Precision.maxFraction(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.number.Precision maxSignificantDigits(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.Precision.wrap(android.icu.number.Precision.maxSignificantDigits(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.number.FractionPrecision minFraction(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.FractionPrecision.wrap(android.icu.number.Precision.minFraction(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.number.FractionPrecision minMaxFraction(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.number.FractionPrecision.wrap(android.icu.number.Precision.minMaxFraction(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.icu.number.Precision minMaxSignificantDigits(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.number.Precision.wrap(android.icu.number.Precision.minMaxSignificantDigits(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.icu.number.Precision minSignificantDigits(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.Precision.wrap(android.icu.number.Precision.minSignificantDigits(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.number.Precision trailingZeroDisplay(com.micklab.dcg.wrapper.android.icu.number.NumberFormatter.TrailingZeroDisplay arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.Precision.wrap(real.trailingZeroDisplay(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.number.Precision unlimited() {
        return com.micklab.dcg.wrapper.android.icu.number.Precision.wrap(android.icu.number.Precision.unlimited());
    }

}
