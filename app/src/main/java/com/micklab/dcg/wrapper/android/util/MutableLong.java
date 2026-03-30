// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class MutableLong {
    private final android.util.MutableLong real;

    public MutableLong(android.util.MutableLong real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.MutableLong wrap(android.util.MutableLong real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.MutableLong(real);
    }

    public android.util.MutableLong unwrap() {
        return real;
    }

    public MutableLong(long arg0) {
        this(new android.util.MutableLong(arg0));
    }


}
