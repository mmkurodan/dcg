// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Matrix2f {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Matrix2f(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Matrix2f wrap(android.renderscript.Matrix2f real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Matrix2f(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.Matrix2f getReal() {
        return (android.renderscript.Matrix2f) real;
    }

    public android.renderscript.Matrix2f unwrap() {
        return getReal();
    }

    public Matrix2f() {
        this(new android.renderscript.Matrix2f(), (__DcgwBridgeToken) null);
    }

    public Matrix2f(float[] arg0) {
        this(new android.renderscript.Matrix2f(arg0), (__DcgwBridgeToken) null);
    }

    public float get(int arg0, int arg1) {
        return ((android.renderscript.Matrix2f) real).get(arg0, arg1);
    }

    public float[] getArray() {
        return ((android.renderscript.Matrix2f) real).getArray();
    }

    public void load(com.micklab.dcg.wrapper.android.renderscript.Matrix2f arg0) {
        ((android.renderscript.Matrix2f) real).load(arg0 == null ? null : arg0.getReal());
    }

    public void loadIdentity() {
        ((android.renderscript.Matrix2f) real).loadIdentity();
    }

    public void loadMultiply(com.micklab.dcg.wrapper.android.renderscript.Matrix2f arg0, com.micklab.dcg.wrapper.android.renderscript.Matrix2f arg1) {
        ((android.renderscript.Matrix2f) real).loadMultiply(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void loadRotate(float arg0) {
        ((android.renderscript.Matrix2f) real).loadRotate(arg0);
    }

    public void loadScale(float arg0, float arg1) {
        ((android.renderscript.Matrix2f) real).loadScale(arg0, arg1);
    }

    public void multiply(com.micklab.dcg.wrapper.android.renderscript.Matrix2f arg0) {
        ((android.renderscript.Matrix2f) real).multiply(arg0 == null ? null : arg0.getReal());
    }

    public void rotate(float arg0) {
        ((android.renderscript.Matrix2f) real).rotate(arg0);
    }

    public void scale(float arg0, float arg1) {
        ((android.renderscript.Matrix2f) real).scale(arg0, arg1);
    }

    public void set(int arg0, int arg1, float arg2) {
        ((android.renderscript.Matrix2f) real).set(arg0, arg1, arg2);
    }

    public void transpose() {
        ((android.renderscript.Matrix2f) real).transpose();
    }

}
