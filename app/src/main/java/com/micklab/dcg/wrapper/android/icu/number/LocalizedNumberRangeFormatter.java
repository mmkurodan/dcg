// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class LocalizedNumberRangeFormatter {
    private final android.icu.number.LocalizedNumberRangeFormatter real;

    public LocalizedNumberRangeFormatter(android.icu.number.LocalizedNumberRangeFormatter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.LocalizedNumberRangeFormatter wrap(android.icu.number.LocalizedNumberRangeFormatter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.LocalizedNumberRangeFormatter(real);
    }

    public android.icu.number.LocalizedNumberRangeFormatter unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.icu.number.FormattedNumberRange formatRange(java.lang.Number arg0, java.lang.Number arg1) {
        return com.micklab.dcg.wrapper.android.icu.number.FormattedNumberRange.wrap(real.formatRange(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.number.FormattedNumberRange formatRange(double arg0, double arg1) {
        return com.micklab.dcg.wrapper.android.icu.number.FormattedNumberRange.wrap(real.formatRange(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.icu.number.FormattedNumberRange formatRange(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.number.FormattedNumberRange.wrap(real.formatRange(arg0, arg1));
    }

}
