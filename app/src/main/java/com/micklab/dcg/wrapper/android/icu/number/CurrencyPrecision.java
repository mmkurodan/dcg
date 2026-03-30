// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class CurrencyPrecision {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CurrencyPrecision(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.CurrencyPrecision wrap(android.icu.number.CurrencyPrecision real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.CurrencyPrecision(real, (__DcgwBridgeToken) null);
    }

    public android.icu.number.CurrencyPrecision getReal() {
        return (android.icu.number.CurrencyPrecision) real;
    }

    public android.icu.number.CurrencyPrecision unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.icu.number.Precision withCurrency(com.micklab.dcg.wrapper.android.icu.util.Currency arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.Precision.wrap(((android.icu.number.CurrencyPrecision) real).withCurrency(arg0 == null ? null : arg0.getReal()));
    }

}
