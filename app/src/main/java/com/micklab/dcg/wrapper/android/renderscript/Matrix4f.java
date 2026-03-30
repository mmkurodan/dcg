// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Matrix4f {
    private final android.renderscript.Matrix4f real;

    public Matrix4f(android.renderscript.Matrix4f real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Matrix4f wrap(android.renderscript.Matrix4f real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Matrix4f(real);
    }

    public android.renderscript.Matrix4f unwrap() {
        return real;
    }

    public Matrix4f() {
        this(new android.renderscript.Matrix4f());
    }

    public Matrix4f(float[] arg0) {
        this(new android.renderscript.Matrix4f(arg0));
    }

    public float get(int arg0, int arg1) {
        return real.get(arg0, arg1);
    }

    public float[] getArray() {
        return real.getArray();
    }

    public boolean inverse() {
        return real.inverse();
    }

    public boolean inverseTranspose() {
        return real.inverseTranspose();
    }

    public void load(com.micklab.dcg.wrapper.android.renderscript.Matrix4f arg0) {
        real.load(arg0 == null ? null : arg0.unwrap());
    }

    public void loadFrustum(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        real.loadFrustum(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void loadIdentity() {
        real.loadIdentity();
    }

    public void loadMultiply(com.micklab.dcg.wrapper.android.renderscript.Matrix4f arg0, com.micklab.dcg.wrapper.android.renderscript.Matrix4f arg1) {
        real.loadMultiply(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void loadOrtho(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        real.loadOrtho(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void loadOrthoWindow(int arg0, int arg1) {
        real.loadOrthoWindow(arg0, arg1);
    }

    public void loadPerspective(float arg0, float arg1, float arg2, float arg3) {
        real.loadPerspective(arg0, arg1, arg2, arg3);
    }

    public void loadProjectionNormalized(int arg0, int arg1) {
        real.loadProjectionNormalized(arg0, arg1);
    }

    public void loadRotate(float arg0, float arg1, float arg2, float arg3) {
        real.loadRotate(arg0, arg1, arg2, arg3);
    }

    public void loadScale(float arg0, float arg1, float arg2) {
        real.loadScale(arg0, arg1, arg2);
    }

    public void loadTranslate(float arg0, float arg1, float arg2) {
        real.loadTranslate(arg0, arg1, arg2);
    }

    public void multiply(com.micklab.dcg.wrapper.android.renderscript.Matrix4f arg0) {
        real.multiply(arg0 == null ? null : arg0.unwrap());
    }

    public void rotate(float arg0, float arg1, float arg2, float arg3) {
        real.rotate(arg0, arg1, arg2, arg3);
    }

    public void scale(float arg0, float arg1, float arg2) {
        real.scale(arg0, arg1, arg2);
    }

    public void set(int arg0, int arg1, float arg2) {
        real.set(arg0, arg1, arg2);
    }

    public void translate(float arg0, float arg1, float arg2) {
        real.translate(arg0, arg1, arg2);
    }

    public void transpose() {
        real.transpose();
    }

}
