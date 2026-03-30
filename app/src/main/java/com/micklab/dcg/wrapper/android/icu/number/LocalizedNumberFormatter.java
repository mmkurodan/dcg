// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class LocalizedNumberFormatter {
    private final android.icu.number.LocalizedNumberFormatter real;

    public LocalizedNumberFormatter(android.icu.number.LocalizedNumberFormatter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.LocalizedNumberFormatter wrap(android.icu.number.LocalizedNumberFormatter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.LocalizedNumberFormatter(real);
    }

    public android.icu.number.LocalizedNumberFormatter unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.icu.number.FormattedNumber format(com.micklab.dcg.wrapper.android.icu.util.Measure arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.FormattedNumber.wrap(real.format(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.number.FormattedNumber format(java.lang.Number arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.FormattedNumber.wrap(real.format(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.number.FormattedNumber format(double arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.FormattedNumber.wrap(real.format(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.number.FormattedNumber format(long arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.FormattedNumber.wrap(real.format(arg0));
    }

    public java.text.Format toFormat() {
        return real.toFormat();
    }

}
