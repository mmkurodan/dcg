// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class IntegerWidth {
    private final android.icu.number.IntegerWidth real;

    public IntegerWidth(android.icu.number.IntegerWidth real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.IntegerWidth wrap(android.icu.number.IntegerWidth real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.IntegerWidth(real);
    }

    public android.icu.number.IntegerWidth unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.icu.number.IntegerWidth truncateAt(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.IntegerWidth.wrap(real.truncateAt(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.number.IntegerWidth zeroFillTo(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.number.IntegerWidth.wrap(android.icu.number.IntegerWidth.zeroFillTo(arg0));
    }

}
