// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class CurrencyAmount {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CurrencyAmount(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.CurrencyAmount wrap(android.icu.util.CurrencyAmount real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.CurrencyAmount(real, (__DcgwBridgeToken) null);
    }

    public android.icu.util.CurrencyAmount getReal() {
        return (android.icu.util.CurrencyAmount) real;
    }

    public android.icu.util.CurrencyAmount unwrap() {
        return getReal();
    }

    public CurrencyAmount(double arg0, java.util.Currency arg1) {
        this(new android.icu.util.CurrencyAmount(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public CurrencyAmount(java.lang.Number arg0, java.util.Currency arg1) {
        this(new android.icu.util.CurrencyAmount(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public CurrencyAmount(double arg0, com.micklab.dcg.wrapper.android.icu.util.Currency arg1) {
        this(new android.icu.util.CurrencyAmount(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public CurrencyAmount(java.lang.Number arg0, com.micklab.dcg.wrapper.android.icu.util.Currency arg1) {
        this(new android.icu.util.CurrencyAmount(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.icu.util.Currency getCurrency() {
        return com.micklab.dcg.wrapper.android.icu.util.Currency.wrap(((android.icu.util.CurrencyAmount) real).getCurrency());
    }

}
