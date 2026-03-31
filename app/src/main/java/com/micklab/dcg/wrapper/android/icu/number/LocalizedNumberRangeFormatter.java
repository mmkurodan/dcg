// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class LocalizedNumberRangeFormatter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LocalizedNumberRangeFormatter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.LocalizedNumberRangeFormatter wrap(android.icu.number.LocalizedNumberRangeFormatter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.LocalizedNumberRangeFormatter(real, (__DcgwBridgeToken) null);
    }

    public android.icu.number.LocalizedNumberRangeFormatter getReal() {
        return (android.icu.number.LocalizedNumberRangeFormatter) real;
    }

    public android.icu.number.LocalizedNumberRangeFormatter unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.icu.number.FormattedNumberRange formatRange(java.lang.Number arg0, java.lang.Number arg1) {
        return com.micklab.dcg.wrapper.android.icu.number.FormattedNumberRange.wrap(((android.icu.number.LocalizedNumberRangeFormatter) real).formatRange(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.number.FormattedNumberRange formatRange(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.number.FormattedNumberRange.wrap(((android.icu.number.LocalizedNumberRangeFormatter) real).formatRange(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.number.FormattedNumberRange formatRange(double arg0, double arg1) {
        return com.micklab.dcg.wrapper.android.icu.number.FormattedNumberRange.wrap(((android.icu.number.LocalizedNumberRangeFormatter) real).formatRange(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.number.UnlocalizedNumberRangeFormatter withoutLocale() {
        return com.micklab.dcg.wrapper.android.icu.number.UnlocalizedNumberRangeFormatter.wrap(((android.icu.number.LocalizedNumberRangeFormatter) real).withoutLocale());
    }

}
