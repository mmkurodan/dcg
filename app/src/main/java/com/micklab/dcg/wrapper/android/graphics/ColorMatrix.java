// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class ColorMatrix {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ColorMatrix(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.ColorMatrix wrap(android.graphics.ColorMatrix real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ColorMatrix(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.ColorMatrix getReal() {
        return (android.graphics.ColorMatrix) real;
    }

    public android.graphics.ColorMatrix unwrap() {
        return getReal();
    }

    public ColorMatrix() {
        this(new android.graphics.ColorMatrix(), (__DcgwBridgeToken) null);
    }

    public ColorMatrix(com.micklab.dcg.wrapper.android.graphics.ColorMatrix arg0) {
        this(new android.graphics.ColorMatrix(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ColorMatrix(float[] arg0) {
        this(new android.graphics.ColorMatrix(arg0), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.graphics.ColorMatrix) real).equals(arg0);
    }

    public float[] getArray() {
        return ((android.graphics.ColorMatrix) real).getArray();
    }

    public void postConcat(com.micklab.dcg.wrapper.android.graphics.ColorMatrix arg0) {
        ((android.graphics.ColorMatrix) real).postConcat(arg0 == null ? null : arg0.getReal());
    }

    public void preConcat(com.micklab.dcg.wrapper.android.graphics.ColorMatrix arg0) {
        ((android.graphics.ColorMatrix) real).preConcat(arg0 == null ? null : arg0.getReal());
    }

    public void reset() {
        ((android.graphics.ColorMatrix) real).reset();
    }

    public void set(com.micklab.dcg.wrapper.android.graphics.ColorMatrix arg0) {
        ((android.graphics.ColorMatrix) real).set(arg0 == null ? null : arg0.getReal());
    }

    public void set(float[] arg0) {
        ((android.graphics.ColorMatrix) real).set(arg0);
    }

    public void setConcat(com.micklab.dcg.wrapper.android.graphics.ColorMatrix arg0, com.micklab.dcg.wrapper.android.graphics.ColorMatrix arg1) {
        ((android.graphics.ColorMatrix) real).setConcat(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setRGB2YUV() {
        ((android.graphics.ColorMatrix) real).setRGB2YUV();
    }

    public void setRotate(int arg0, float arg1) {
        ((android.graphics.ColorMatrix) real).setRotate(arg0, arg1);
    }

    public void setSaturation(float arg0) {
        ((android.graphics.ColorMatrix) real).setSaturation(arg0);
    }

    public void setScale(float arg0, float arg1, float arg2, float arg3) {
        ((android.graphics.ColorMatrix) real).setScale(arg0, arg1, arg2, arg3);
    }

    public void setYUV2RGB() {
        ((android.graphics.ColorMatrix) real).setYUV2RGB();
    }

}
