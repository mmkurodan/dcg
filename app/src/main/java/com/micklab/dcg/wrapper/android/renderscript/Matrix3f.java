// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Matrix3f {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Matrix3f(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Matrix3f wrap(android.renderscript.Matrix3f real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Matrix3f(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.Matrix3f getReal() {
        return (android.renderscript.Matrix3f) real;
    }

    public android.renderscript.Matrix3f unwrap() {
        return getReal();
    }

    public Matrix3f() {
        this(new android.renderscript.Matrix3f(), (__DcgwBridgeToken) null);
    }

    public Matrix3f(float[] arg0) {
        this(new android.renderscript.Matrix3f(arg0), (__DcgwBridgeToken) null);
    }

    public float get(int arg0, int arg1) {
        return ((android.renderscript.Matrix3f) real).get(arg0, arg1);
    }

    public float[] getArray() {
        return ((android.renderscript.Matrix3f) real).getArray();
    }

    public void load(com.micklab.dcg.wrapper.android.renderscript.Matrix3f arg0) {
        ((android.renderscript.Matrix3f) real).load(arg0 == null ? null : arg0.getReal());
    }

    public void loadIdentity() {
        ((android.renderscript.Matrix3f) real).loadIdentity();
    }

    public void loadMultiply(com.micklab.dcg.wrapper.android.renderscript.Matrix3f arg0, com.micklab.dcg.wrapper.android.renderscript.Matrix3f arg1) {
        ((android.renderscript.Matrix3f) real).loadMultiply(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void loadRotate(float arg0) {
        ((android.renderscript.Matrix3f) real).loadRotate(arg0);
    }

    public void loadRotate(float arg0, float arg1, float arg2, float arg3) {
        ((android.renderscript.Matrix3f) real).loadRotate(arg0, arg1, arg2, arg3);
    }

    public void loadScale(float arg0, float arg1) {
        ((android.renderscript.Matrix3f) real).loadScale(arg0, arg1);
    }

    public void loadScale(float arg0, float arg1, float arg2) {
        ((android.renderscript.Matrix3f) real).loadScale(arg0, arg1, arg2);
    }

    public void loadTranslate(float arg0, float arg1) {
        ((android.renderscript.Matrix3f) real).loadTranslate(arg0, arg1);
    }

    public void multiply(com.micklab.dcg.wrapper.android.renderscript.Matrix3f arg0) {
        ((android.renderscript.Matrix3f) real).multiply(arg0 == null ? null : arg0.getReal());
    }

    public void rotate(float arg0) {
        ((android.renderscript.Matrix3f) real).rotate(arg0);
    }

    public void rotate(float arg0, float arg1, float arg2, float arg3) {
        ((android.renderscript.Matrix3f) real).rotate(arg0, arg1, arg2, arg3);
    }

    public void scale(float arg0, float arg1) {
        ((android.renderscript.Matrix3f) real).scale(arg0, arg1);
    }

    public void scale(float arg0, float arg1, float arg2) {
        ((android.renderscript.Matrix3f) real).scale(arg0, arg1, arg2);
    }

    public void set(int arg0, int arg1, float arg2) {
        ((android.renderscript.Matrix3f) real).set(arg0, arg1, arg2);
    }

    public void translate(float arg0, float arg1) {
        ((android.renderscript.Matrix3f) real).translate(arg0, arg1);
    }

    public void transpose() {
        ((android.renderscript.Matrix3f) real).transpose();
    }

}
