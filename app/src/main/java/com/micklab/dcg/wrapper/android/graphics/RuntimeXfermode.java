// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class RuntimeXfermode {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RuntimeXfermode(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.RuntimeXfermode wrap(android.graphics.RuntimeXfermode real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.RuntimeXfermode(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.RuntimeXfermode getReal() {
        return (android.graphics.RuntimeXfermode) real;
    }

    public android.graphics.RuntimeXfermode unwrap() {
        return getReal();
    }

    public RuntimeXfermode(java.lang.String arg0) {
        this(new android.graphics.RuntimeXfermode(arg0), (__DcgwBridgeToken) null);
    }

    public void setColorUniform(java.lang.String arg0, long arg1) {
        ((android.graphics.RuntimeXfermode) real).setColorUniform(arg0, arg1);
    }

    public void setColorUniform(java.lang.String arg0, int arg1) {
        ((android.graphics.RuntimeXfermode) real).setColorUniform(arg0, arg1);
    }

    public void setColorUniform(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.Color arg1) {
        ((android.graphics.RuntimeXfermode) real).setColorUniform(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setFloatUniform(java.lang.String arg0, float[] arg1) {
        ((android.graphics.RuntimeXfermode) real).setFloatUniform(arg0, arg1);
    }

    public void setFloatUniform(java.lang.String arg0, float arg1) {
        ((android.graphics.RuntimeXfermode) real).setFloatUniform(arg0, arg1);
    }

    public void setFloatUniform(java.lang.String arg0, float arg1, float arg2) {
        ((android.graphics.RuntimeXfermode) real).setFloatUniform(arg0, arg1, arg2);
    }

    public void setFloatUniform(java.lang.String arg0, float arg1, float arg2, float arg3) {
        ((android.graphics.RuntimeXfermode) real).setFloatUniform(arg0, arg1, arg2, arg3);
    }

    public void setFloatUniform(java.lang.String arg0, float arg1, float arg2, float arg3, float arg4) {
        ((android.graphics.RuntimeXfermode) real).setFloatUniform(arg0, arg1, arg2, arg3, arg4);
    }

    public void setInputColorFilter(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.ColorFilter arg1) {
        ((android.graphics.RuntimeXfermode) real).setInputColorFilter(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setInputShader(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.Shader arg1) {
        ((android.graphics.RuntimeXfermode) real).setInputShader(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setInputXfermode(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.RuntimeXfermode arg1) {
        ((android.graphics.RuntimeXfermode) real).setInputXfermode(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setIntUniform(java.lang.String arg0, int[] arg1) {
        ((android.graphics.RuntimeXfermode) real).setIntUniform(arg0, arg1);
    }

    public void setIntUniform(java.lang.String arg0, int arg1) {
        ((android.graphics.RuntimeXfermode) real).setIntUniform(arg0, arg1);
    }

    public void setIntUniform(java.lang.String arg0, int arg1, int arg2) {
        ((android.graphics.RuntimeXfermode) real).setIntUniform(arg0, arg1, arg2);
    }

    public void setIntUniform(java.lang.String arg0, int arg1, int arg2, int arg3) {
        ((android.graphics.RuntimeXfermode) real).setIntUniform(arg0, arg1, arg2, arg3);
    }

    public void setIntUniform(java.lang.String arg0, int arg1, int arg2, int arg3, int arg4) {
        ((android.graphics.RuntimeXfermode) real).setIntUniform(arg0, arg1, arg2, arg3, arg4);
    }

}
