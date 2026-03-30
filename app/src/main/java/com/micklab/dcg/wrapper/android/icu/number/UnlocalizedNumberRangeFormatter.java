// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class UnlocalizedNumberRangeFormatter {
    private final android.icu.number.UnlocalizedNumberRangeFormatter real;

    public UnlocalizedNumberRangeFormatter(android.icu.number.UnlocalizedNumberRangeFormatter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.UnlocalizedNumberRangeFormatter wrap(android.icu.number.UnlocalizedNumberRangeFormatter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.UnlocalizedNumberRangeFormatter(real);
    }

    public android.icu.number.UnlocalizedNumberRangeFormatter unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.icu.number.LocalizedNumberRangeFormatter locale(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.LocalizedNumberRangeFormatter.wrap(real.locale(arg0));
    }

    public com.micklab.dcg.wrapper.android.icu.number.LocalizedNumberRangeFormatter locale(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.LocalizedNumberRangeFormatter.wrap(real.locale(arg0 == null ? null : arg0.unwrap()));
    }

}
