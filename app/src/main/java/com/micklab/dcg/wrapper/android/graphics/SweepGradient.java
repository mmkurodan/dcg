// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class SweepGradient {
    private final android.graphics.SweepGradient real;

    public SweepGradient(android.graphics.SweepGradient real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.SweepGradient wrap(android.graphics.SweepGradient real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.SweepGradient(real);
    }

    public android.graphics.SweepGradient unwrap() {
        return real;
    }

    public SweepGradient(float arg0, float arg1, long arg2, long arg3) {
        this(new android.graphics.SweepGradient(arg0, arg1, arg2, arg3));
    }

    public SweepGradient(float arg0, float arg1, int arg2, int arg3) {
        this(new android.graphics.SweepGradient(arg0, arg1, arg2, arg3));
    }

    public SweepGradient(float arg0, float arg1, long[] arg2, float[] arg3) {
        this(new android.graphics.SweepGradient(arg0, arg1, arg2, arg3));
    }

    public SweepGradient(float arg0, float arg1, int[] arg2, float[] arg3) {
        this(new android.graphics.SweepGradient(arg0, arg1, arg2, arg3));
    }

}
