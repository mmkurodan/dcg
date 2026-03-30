// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class MutableFloat {
    private final android.util.MutableFloat real;

    public MutableFloat(android.util.MutableFloat real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.MutableFloat wrap(android.util.MutableFloat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.MutableFloat(real);
    }

    public android.util.MutableFloat unwrap() {
        return real;
    }

    public MutableFloat(float arg0) {
        this(new android.util.MutableFloat(arg0));
    }


}
