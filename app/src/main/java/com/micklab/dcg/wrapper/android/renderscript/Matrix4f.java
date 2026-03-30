// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Matrix4f {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Matrix4f(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Matrix4f wrap(android.renderscript.Matrix4f real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Matrix4f(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.Matrix4f getReal() {
        return (android.renderscript.Matrix4f) real;
    }

    public android.renderscript.Matrix4f unwrap() {
        return getReal();
    }

    public Matrix4f() {
        this(new android.renderscript.Matrix4f(), (__DcgwBridgeToken) null);
    }

    public Matrix4f(float[] arg0) {
        this(new android.renderscript.Matrix4f(arg0), (__DcgwBridgeToken) null);
    }

    public float get(int arg0, int arg1) {
        return ((android.renderscript.Matrix4f) real).get(arg0, arg1);
    }

    public float[] getArray() {
        return ((android.renderscript.Matrix4f) real).getArray();
    }

    public boolean inverse() {
        return ((android.renderscript.Matrix4f) real).inverse();
    }

    public boolean inverseTranspose() {
        return ((android.renderscript.Matrix4f) real).inverseTranspose();
    }

    public void load(com.micklab.dcg.wrapper.android.renderscript.Matrix4f arg0) {
        ((android.renderscript.Matrix4f) real).load(arg0 == null ? null : arg0.getReal());
    }

    public void loadFrustum(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ((android.renderscript.Matrix4f) real).loadFrustum(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void loadIdentity() {
        ((android.renderscript.Matrix4f) real).loadIdentity();
    }

    public void loadMultiply(com.micklab.dcg.wrapper.android.renderscript.Matrix4f arg0, com.micklab.dcg.wrapper.android.renderscript.Matrix4f arg1) {
        ((android.renderscript.Matrix4f) real).loadMultiply(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void loadOrtho(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ((android.renderscript.Matrix4f) real).loadOrtho(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void loadOrthoWindow(int arg0, int arg1) {
        ((android.renderscript.Matrix4f) real).loadOrthoWindow(arg0, arg1);
    }

    public void loadPerspective(float arg0, float arg1, float arg2, float arg3) {
        ((android.renderscript.Matrix4f) real).loadPerspective(arg0, arg1, arg2, arg3);
    }

    public void loadProjectionNormalized(int arg0, int arg1) {
        ((android.renderscript.Matrix4f) real).loadProjectionNormalized(arg0, arg1);
    }

    public void loadRotate(float arg0, float arg1, float arg2, float arg3) {
        ((android.renderscript.Matrix4f) real).loadRotate(arg0, arg1, arg2, arg3);
    }

    public void loadScale(float arg0, float arg1, float arg2) {
        ((android.renderscript.Matrix4f) real).loadScale(arg0, arg1, arg2);
    }

    public void loadTranslate(float arg0, float arg1, float arg2) {
        ((android.renderscript.Matrix4f) real).loadTranslate(arg0, arg1, arg2);
    }

    public void multiply(com.micklab.dcg.wrapper.android.renderscript.Matrix4f arg0) {
        ((android.renderscript.Matrix4f) real).multiply(arg0 == null ? null : arg0.getReal());
    }

    public void rotate(float arg0, float arg1, float arg2, float arg3) {
        ((android.renderscript.Matrix4f) real).rotate(arg0, arg1, arg2, arg3);
    }

    public void scale(float arg0, float arg1, float arg2) {
        ((android.renderscript.Matrix4f) real).scale(arg0, arg1, arg2);
    }

    public void set(int arg0, int arg1, float arg2) {
        ((android.renderscript.Matrix4f) real).set(arg0, arg1, arg2);
    }

    public void translate(float arg0, float arg1, float arg2) {
        ((android.renderscript.Matrix4f) real).translate(arg0, arg1, arg2);
    }

    public void transpose() {
        ((android.renderscript.Matrix4f) real).transpose();
    }

}
