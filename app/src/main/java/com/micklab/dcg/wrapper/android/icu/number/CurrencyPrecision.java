// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class CurrencyPrecision {
    private final android.icu.number.CurrencyPrecision real;

    public CurrencyPrecision(android.icu.number.CurrencyPrecision real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.CurrencyPrecision wrap(android.icu.number.CurrencyPrecision real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.CurrencyPrecision(real);
    }

    public android.icu.number.CurrencyPrecision unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.icu.number.Precision withCurrency(com.micklab.dcg.wrapper.android.icu.util.Currency arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.Precision.wrap(real.withCurrency(arg0 == null ? null : arg0.unwrap()));
    }

}
