// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class LinearGradient {
    private final android.graphics.LinearGradient real;

    public LinearGradient(android.graphics.LinearGradient real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.LinearGradient wrap(android.graphics.LinearGradient real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.LinearGradient(real);
    }

    public android.graphics.LinearGradient unwrap() {
        return real;
    }

    public LinearGradient(float arg0, float arg1, float arg2, float arg3, long arg4, long arg5, com.micklab.dcg.wrapper.android.graphics.Shader.TileMode arg6) {
        this(new android.graphics.LinearGradient(arg0, arg1, arg2, arg3, arg4, arg5, arg6 == null ? null : arg6.unwrap()));
    }

    public LinearGradient(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, com.micklab.dcg.wrapper.android.graphics.Shader.TileMode arg6) {
        this(new android.graphics.LinearGradient(arg0, arg1, arg2, arg3, arg4, arg5, arg6 == null ? null : arg6.unwrap()));
    }

    public LinearGradient(float arg0, float arg1, float arg2, float arg3, long[] arg4, float[] arg5, com.micklab.dcg.wrapper.android.graphics.Shader.TileMode arg6) {
        this(new android.graphics.LinearGradient(arg0, arg1, arg2, arg3, arg4, arg5, arg6 == null ? null : arg6.unwrap()));
    }

    public LinearGradient(float arg0, float arg1, float arg2, float arg3, int[] arg4, float[] arg5, com.micklab.dcg.wrapper.android.graphics.Shader.TileMode arg6) {
        this(new android.graphics.LinearGradient(arg0, arg1, arg2, arg3, arg4, arg5, arg6 == null ? null : arg6.unwrap()));
    }

}
