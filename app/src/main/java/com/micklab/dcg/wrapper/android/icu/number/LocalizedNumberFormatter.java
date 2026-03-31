// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class LocalizedNumberFormatter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LocalizedNumberFormatter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.LocalizedNumberFormatter wrap(android.icu.number.LocalizedNumberFormatter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.LocalizedNumberFormatter(real, (__DcgwBridgeToken) null);
    }

    public android.icu.number.LocalizedNumberFormatter getReal() {
        return (android.icu.number.LocalizedNumberFormatter) real;
    }

    public android.icu.number.LocalizedNumberFormatter unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.icu.number.FormattedNumber format(long arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.FormattedNumber.wrap(((android.icu.number.LocalizedNumberFormatter) real).format(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.number.FormattedNumber format(java.lang.Number arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.FormattedNumber.wrap(((android.icu.number.LocalizedNumberFormatter) real).format(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.number.FormattedNumber format(double arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.FormattedNumber.wrap(((android.icu.number.LocalizedNumberFormatter) real).format(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.number.FormattedNumber format(com.micklab.dcg.wrapper.android.icu.util.Measure arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.FormattedNumber.wrap(((android.icu.number.LocalizedNumberFormatter) real).format(arg0 == null ? null : arg0.getReal()));
    }

    public java.text.Format toFormat() {
        return ((android.icu.number.LocalizedNumberFormatter) real).toFormat();
    }

    public com.micklab.dcg.wrapper.android.icu.number.UnlocalizedNumberFormatter withoutLocale() {
        return com.micklab.dcg.wrapper.android.icu.number.UnlocalizedNumberFormatter.wrap(((android.icu.number.LocalizedNumberFormatter) real).withoutLocale());
    }

}
