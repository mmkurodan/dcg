// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class MutableInt {
    private final android.util.MutableInt real;

    public MutableInt(android.util.MutableInt real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.MutableInt wrap(android.util.MutableInt real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.MutableInt(real);
    }

    public android.util.MutableInt unwrap() {
        return real;
    }

    public MutableInt(int arg0) {
        this(new android.util.MutableInt(arg0));
    }


}
