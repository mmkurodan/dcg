// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class FractionPrecision {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FractionPrecision(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.FractionPrecision wrap(android.icu.number.FractionPrecision real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.FractionPrecision(real, (__DcgwBridgeToken) null);
    }

    public android.icu.number.FractionPrecision getReal() {
        return (android.icu.number.FractionPrecision) real;
    }

    public android.icu.number.FractionPrecision unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.icu.number.Precision withMaxDigits(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.Precision.wrap(((android.icu.number.FractionPrecision) real).withMaxDigits(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.number.Precision withMinDigits(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.Precision.wrap(((android.icu.number.FractionPrecision) real).withMinDigits(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.number.Precision withSignificantDigits(int arg0, int arg1, com.micklab.dcg.wrapper.android.icu.number.NumberFormatter.RoundingPriority arg2) {
        return com.micklab.dcg.wrapper.android.icu.number.Precision.wrap(((android.icu.number.FractionPrecision) real).withSignificantDigits(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

}
