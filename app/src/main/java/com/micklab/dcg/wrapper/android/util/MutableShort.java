// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class MutableShort {
    private final android.util.MutableShort real;

    public MutableShort(android.util.MutableShort real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.MutableShort wrap(android.util.MutableShort real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.MutableShort(real);
    }

    public android.util.MutableShort unwrap() {
        return real;
    }

    public MutableShort(short arg0) {
        this(new android.util.MutableShort(arg0));
    }


}
