// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class MutableDouble {
    private final android.util.MutableDouble real;

    public MutableDouble(android.util.MutableDouble real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.MutableDouble wrap(android.util.MutableDouble real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.MutableDouble(real);
    }

    public android.util.MutableDouble unwrap() {
        return real;
    }

    public MutableDouble(double arg0) {
        this(new android.util.MutableDouble(arg0));
    }


}
