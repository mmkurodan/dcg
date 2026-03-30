// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class IntegerWidth {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IntegerWidth(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.IntegerWidth wrap(android.icu.number.IntegerWidth real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.IntegerWidth(real, (__DcgwBridgeToken) null);
    }

    public android.icu.number.IntegerWidth getReal() {
        return (android.icu.number.IntegerWidth) real;
    }

    public android.icu.number.IntegerWidth unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.icu.number.IntegerWidth truncateAt(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.IntegerWidth.wrap(((android.icu.number.IntegerWidth) real).truncateAt(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.number.IntegerWidth zeroFillTo(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.IntegerWidth.wrap(android.icu.number.IntegerWidth.zeroFillTo(arg0));
    }

}
