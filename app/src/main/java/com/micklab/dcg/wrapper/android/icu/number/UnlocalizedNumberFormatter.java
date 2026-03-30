// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class UnlocalizedNumberFormatter {
    private final android.icu.number.UnlocalizedNumberFormatter real;

    public UnlocalizedNumberFormatter(android.icu.number.UnlocalizedNumberFormatter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.UnlocalizedNumberFormatter wrap(android.icu.number.UnlocalizedNumberFormatter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.UnlocalizedNumberFormatter(real);
    }

    public android.icu.number.UnlocalizedNumberFormatter unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.icu.number.LocalizedNumberFormatter locale(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.LocalizedNumberFormatter.wrap(real.locale(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.number.LocalizedNumberFormatter locale(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.LocalizedNumberFormatter.wrap(real.locale(arg0 == null ? null : arg0.unwrap()));
    }

}
