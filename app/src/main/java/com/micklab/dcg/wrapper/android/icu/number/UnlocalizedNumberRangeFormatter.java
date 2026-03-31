// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class UnlocalizedNumberRangeFormatter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UnlocalizedNumberRangeFormatter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.UnlocalizedNumberRangeFormatter wrap(android.icu.number.UnlocalizedNumberRangeFormatter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.UnlocalizedNumberRangeFormatter(real, (__DcgwBridgeToken) null);
    }

    public android.icu.number.UnlocalizedNumberRangeFormatter getReal() {
        return (android.icu.number.UnlocalizedNumberRangeFormatter) real;
    }

    public android.icu.number.UnlocalizedNumberRangeFormatter unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.icu.number.LocalizedNumberRangeFormatter locale(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.LocalizedNumberRangeFormatter.wrap(((android.icu.number.UnlocalizedNumberRangeFormatter) real).locale(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.number.LocalizedNumberRangeFormatter locale(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.LocalizedNumberRangeFormatter.wrap(((android.icu.number.UnlocalizedNumberRangeFormatter) real).locale(arg0));
    }

}
