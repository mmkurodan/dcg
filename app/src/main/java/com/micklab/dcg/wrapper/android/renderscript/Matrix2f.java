// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Matrix2f {
    private final android.renderscript.Matrix2f real;

    public Matrix2f(android.renderscript.Matrix2f real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Matrix2f wrap(android.renderscript.Matrix2f real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Matrix2f(real);
    }

    public android.renderscript.Matrix2f unwrap() {
        return real;
    }

    public Matrix2f() {
        this(new android.renderscript.Matrix2f());
    }

    public Matrix2f(float[] arg0) {
        this(new android.renderscript.Matrix2f(arg0));
    }

    public float get(int arg0, int arg1) {
        return real.get(arg0, arg1);
    }

    public float[] getArray() {
        return real.getArray();
    }

    public void load(com.micklab.dcg.wrapper.android.renderscript.Matrix2f arg0) {
        real.load(arg0 == null ? null : arg0.unwrap());
    }

    public void loadIdentity() {
        real.loadIdentity();
    }

    public void loadMultiply(com.micklab.dcg.wrapper.android.renderscript.Matrix2f arg0, com.micklab.dcg.wrapper.android.renderscript.Matrix2f arg1) {
        real.loadMultiply(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void loadRotate(float arg0) {
        real.loadRotate(arg0);
    }

    public void loadScale(float arg0, float arg1) {
        real.loadScale(arg0, arg1);
    }

    public void multiply(com.micklab.dcg.wrapper.android.renderscript.Matrix2f arg0) {
        real.multiply(arg0 == null ? null : arg0.unwrap());
    }

    public void rotate(float arg0) {
        real.rotate(arg0);
    }

    public void scale(float arg0, float arg1) {
        real.scale(arg0, arg1);
    }

    public void set(int arg0, int arg1, float arg2) {
        real.set(arg0, arg1, arg2);
    }

    public void transpose() {
        real.transpose();
    }

}
