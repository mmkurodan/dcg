// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class Scale {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Scale(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.Scale wrap(android.icu.number.Scale real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.Scale(real, (__DcgwBridgeToken) null);
    }

    public android.icu.number.Scale getReal() {
        return (android.icu.number.Scale) real;
    }

    public android.icu.number.Scale unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.icu.number.Scale byBigDecimal(java.math.BigDecimal arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.Scale.wrap(android.icu.number.Scale.byBigDecimal(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.number.Scale byDouble(double arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.Scale.wrap(android.icu.number.Scale.byDouble(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.number.Scale byDoubleAndPowerOfTen(double arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.number.Scale.wrap(android.icu.number.Scale.byDoubleAndPowerOfTen(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.icu.number.Scale none() {
        return com.micklab.dcg.wrapper.android.icu.number.Scale.wrap(android.icu.number.Scale.none());
    }

    public static com.micklab.dcg.wrapper.android.icu.number.Scale powerOfTen(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.Scale.wrap(android.icu.number.Scale.powerOfTen(arg0));
    }

}
