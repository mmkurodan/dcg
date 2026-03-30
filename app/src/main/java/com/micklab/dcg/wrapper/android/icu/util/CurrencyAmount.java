// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class CurrencyAmount {
    private final android.icu.util.CurrencyAmount real;

    public CurrencyAmount(android.icu.util.CurrencyAmount real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.CurrencyAmount wrap(android.icu.util.CurrencyAmount real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.CurrencyAmount(real);
    }

    public android.icu.util.CurrencyAmount unwrap() {
        return real;
    }

    public CurrencyAmount(double arg0, java.util.Currency arg1) {
        this(new android.icu.util.CurrencyAmount(arg0, arg1));
    }

    public CurrencyAmount(java.lang.Number arg0, java.util.Currency arg1) {
        this(new android.icu.util.CurrencyAmount(arg0, arg1));
    }

    public CurrencyAmount(double arg0, com.micklab.dcg.wrapper.android.icu.util.Currency arg1) {
        this(new android.icu.util.CurrencyAmount(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public CurrencyAmount(java.lang.Number arg0, com.micklab.dcg.wrapper.android.icu.util.Currency arg1) {
        this(new android.icu.util.CurrencyAmount(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.util.Currency getCurrency() {
        return com.micklab.dcg.wrapper.android.icu.util.Currency.wrap(real.getCurrency());
    }

}
