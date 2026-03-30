// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Mesh {
    private final android.graphics.Mesh real;

    public Mesh(android.graphics.Mesh real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Mesh wrap(android.graphics.Mesh real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Mesh(real);
    }

    public android.graphics.Mesh unwrap() {
        return real;
    }

    public Mesh(com.micklab.dcg.wrapper.android.graphics.MeshSpecification arg0, int arg1, java.nio.Buffer arg2, int arg3, com.micklab.dcg.wrapper.android.graphics.RectF arg4) {
        this(new android.graphics.Mesh(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap()));
    }

    public Mesh(com.micklab.dcg.wrapper.android.graphics.MeshSpecification arg0, int arg1, java.nio.Buffer arg2, int arg3, java.nio.ShortBuffer arg4, com.micklab.dcg.wrapper.android.graphics.RectF arg5) {
        this(new android.graphics.Mesh(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap()));
    }

    public void setColorUniform(java.lang.String arg0, long arg1) {
        real.setColorUniform(arg0, arg1);
    }

    public void setColorUniform(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.Color arg1) {
        real.setColorUniform(arg0, arg1 == null ? null : arg1.unwrap());
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

    public static final int TRIANGLES = android.graphics.Mesh.TRIANGLES;
    public static final int TRIANGLE_STRIP = android.graphics.Mesh.TRIANGLE_STRIP;

}
