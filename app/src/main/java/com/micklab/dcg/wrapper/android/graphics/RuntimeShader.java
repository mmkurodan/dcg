// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class RuntimeShader {
    private final android.graphics.RuntimeShader real;

    public RuntimeShader(android.graphics.RuntimeShader real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.RuntimeShader wrap(android.graphics.RuntimeShader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.RuntimeShader(real);
    }

    public android.graphics.RuntimeShader unwrap() {
        return real;
    }

    public RuntimeShader(java.lang.String arg0) {
        this(new android.graphics.RuntimeShader(arg0));
    }

    public void setColorUniform(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.Color arg1) {
        real.setColorUniform(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setColorUniform(java.lang.String arg0, long arg1) {
        real.setColorUniform(arg0, arg1);
    }

    public void setColorUniform(java.lang.String arg0, int arg1) {
        real.setColorUniform(arg0, arg1);
    }

    public void setFloatUniform(java.lang.String arg0, float[] arg1) {
        real.setFloatUniform(arg0, arg1);
    }

    public void setFloatUniform(java.lang.String arg0, float arg1) {
        real.setFloatUniform(arg0, arg1);
    }

    public void setFloatUniform(java.lang.String arg0, float arg1, float arg2) {
        real.setFloatUniform(arg0, arg1, arg2);
    }

    public void setFloatUniform(java.lang.String arg0, float arg1, float arg2, float arg3) {
        real.setFloatUniform(arg0, arg1, arg2, arg3);
    }

    public void setFloatUniform(java.lang.String arg0, float arg1, float arg2, float arg3, float arg4) {
        real.setFloatUniform(arg0, arg1, arg2, arg3, arg4);
    }

    public void setInputBuffer(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.BitmapShader arg1) {
        real.setInputBuffer(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setInputShader(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.Shader arg1) {
        real.setInputShader(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setIntUniform(java.lang.String arg0, int[] arg1) {
        real.setIntUniform(arg0, arg1);
    }

    public void setIntUniform(java.lang.String arg0, int arg1) {
        real.setIntUniform(arg0, arg1);
    }

    public void setIntUniform(java.lang.String arg0, int arg1, int arg2) {
        real.setIntUniform(arg0, arg1, arg2);
    }

    public void setIntUniform(java.lang.String arg0, int arg1, int arg2, int arg3) {
        real.setIntUniform(arg0, arg1, arg2, arg3);
    }

    public void setIntUniform(java.lang.String arg0, int arg1, int arg2, int arg3, int arg4) {
        real.setIntUniform(arg0, arg1, arg2, arg3, arg4);
    }

}
