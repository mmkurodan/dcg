// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Matrix44 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Matrix44(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Matrix44 wrap(android.graphics.Matrix44 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Matrix44(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.Matrix44 getReal() {
        return (android.graphics.Matrix44) real;
    }

    public android.graphics.Matrix44 unwrap() {
        return getReal();
    }

    public Matrix44() {
        this(new android.graphics.Matrix44(), (__DcgwBridgeToken) null);
    }

    public Matrix44(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        this(new android.graphics.Matrix44(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.graphics.Matrix44 concat(com.micklab.dcg.wrapper.android.graphics.Matrix44 arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Matrix44.wrap(((android.graphics.Matrix44) real).concat(arg0 == null ? null : arg0.getReal()));
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.graphics.Matrix44) real).equals(arg0);
    }

    public float get(int arg0, int arg1) {
        return ((android.graphics.Matrix44) real).get(arg0, arg1);
    }

    public void getValues(float[] arg0) {
        ((android.graphics.Matrix44) real).getValues(arg0);
    }

    public int hashCode() {
        return ((android.graphics.Matrix44) real).hashCode();
    }

    public boolean invert() {
        return ((android.graphics.Matrix44) real).invert();
    }

    public boolean isIdentity() {
        return ((android.graphics.Matrix44) real).isIdentity();
    }

    public float[] map(float arg0, float arg1, float arg2, float arg3) {
        return ((android.graphics.Matrix44) real).map(arg0, arg1, arg2, arg3);
    }

    public void map(float arg0, float arg1, float arg2, float arg3, float[] arg4) {
        ((android.graphics.Matrix44) real).map(arg0, arg1, arg2, arg3, arg4);
    }

    public void reset() {
        ((android.graphics.Matrix44) real).reset();
    }

    public com.micklab.dcg.wrapper.android.graphics.Matrix44 rotate(float arg0, float arg1, float arg2, float arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Matrix44.wrap(((android.graphics.Matrix44) real).rotate(arg0, arg1, arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.graphics.Matrix44 scale(float arg0, float arg1, float arg2) {
        return com.micklab.dcg.wrapper.android.graphics.Matrix44.wrap(((android.graphics.Matrix44) real).scale(arg0, arg1, arg2));
    }

    public void set(int arg0, int arg1, float arg2) {
        ((android.graphics.Matrix44) real).set(arg0, arg1, arg2);
    }

    public void setValues(float[] arg0) {
        ((android.graphics.Matrix44) real).setValues(arg0);
    }

    public java.lang.String toString() {
        return ((android.graphics.Matrix44) real).toString();
    }

    public com.micklab.dcg.wrapper.android.graphics.Matrix44 translate(float arg0, float arg1, float arg2) {
        return com.micklab.dcg.wrapper.android.graphics.Matrix44.wrap(((android.graphics.Matrix44) real).translate(arg0, arg1, arg2));
    }

}
