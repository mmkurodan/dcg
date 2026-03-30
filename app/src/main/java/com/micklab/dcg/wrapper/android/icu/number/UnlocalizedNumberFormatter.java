// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class UnlocalizedNumberFormatter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UnlocalizedNumberFormatter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.UnlocalizedNumberFormatter wrap(android.icu.number.UnlocalizedNumberFormatter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.UnlocalizedNumberFormatter(real, (__DcgwBridgeToken) null);
    }

    public android.icu.number.UnlocalizedNumberFormatter getReal() {
        return (android.icu.number.UnlocalizedNumberFormatter) real;
    }

    public android.icu.number.UnlocalizedNumberFormatter unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.icu.number.LocalizedNumberFormatter locale(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.LocalizedNumberFormatter.wrap(((android.icu.number.UnlocalizedNumberFormatter) real).locale(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.number.LocalizedNumberFormatter locale(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.LocalizedNumberFormatter.wrap(((android.icu.number.UnlocalizedNumberFormatter) real).locale(arg0 == null ? null : arg0.getReal()));
    }

}
