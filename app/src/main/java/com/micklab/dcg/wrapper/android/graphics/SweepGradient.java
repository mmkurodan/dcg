// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class SweepGradient {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SweepGradient(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.SweepGradient wrap(android.graphics.SweepGradient real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.SweepGradient(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.SweepGradient getReal() {
        return (android.graphics.SweepGradient) real;
    }

    public android.graphics.SweepGradient unwrap() {
        return getReal();
    }

    public SweepGradient(float arg0, float arg1, long[] arg2, float[] arg3) {
        this(new android.graphics.SweepGradient(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public SweepGradient(float arg0, float arg1, long arg2, long arg3) {
        this(new android.graphics.SweepGradient(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public SweepGradient(float arg0, float arg1, int[] arg2, float[] arg3) {
        this(new android.graphics.SweepGradient(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public SweepGradient(float arg0, float arg1, int arg2, int arg3) {
        this(new android.graphics.SweepGradient(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

}
