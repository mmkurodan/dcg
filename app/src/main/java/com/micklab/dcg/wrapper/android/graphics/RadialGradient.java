// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class RadialGradient {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RadialGradient(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.RadialGradient wrap(android.graphics.RadialGradient real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.RadialGradient(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.RadialGradient getReal() {
        return (android.graphics.RadialGradient) real;
    }

    public android.graphics.RadialGradient unwrap() {
        return getReal();
    }

    public RadialGradient(float arg0, float arg1, float arg2, long arg3, long arg4, com.micklab.dcg.wrapper.android.graphics.Shader.TileMode arg5) {
        this(new android.graphics.RadialGradient(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal()), (__DcgwBridgeToken) null);
    }

    public RadialGradient(float arg0, float arg1, float arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.graphics.Shader.TileMode arg5) {
        this(new android.graphics.RadialGradient(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal()), (__DcgwBridgeToken) null);
    }

    public RadialGradient(float arg0, float arg1, float arg2, long[] arg3, float[] arg4, com.micklab.dcg.wrapper.android.graphics.Shader.TileMode arg5) {
        this(new android.graphics.RadialGradient(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal()), (__DcgwBridgeToken) null);
    }

    public RadialGradient(float arg0, float arg1, float arg2, int[] arg3, float[] arg4, com.micklab.dcg.wrapper.android.graphics.Shader.TileMode arg5) {
        this(new android.graphics.RadialGradient(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal()), (__DcgwBridgeToken) null);
    }

    public RadialGradient(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, long[] arg6, float[] arg7, com.micklab.dcg.wrapper.android.graphics.Shader.TileMode arg8) {
        this(new android.graphics.RadialGradient(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 == null ? null : arg8.getReal()), (__DcgwBridgeToken) null);
    }

}
