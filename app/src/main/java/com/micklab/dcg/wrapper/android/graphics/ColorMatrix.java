// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class ColorMatrix {
    private final android.graphics.ColorMatrix real;

    public ColorMatrix(android.graphics.ColorMatrix real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.ColorMatrix wrap(android.graphics.ColorMatrix real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ColorMatrix(real);
    }

    public android.graphics.ColorMatrix unwrap() {
        return real;
    }

    public ColorMatrix() {
        this(new android.graphics.ColorMatrix());
    }

    public ColorMatrix(com.micklab.dcg.wrapper.android.graphics.ColorMatrix arg0) {
        this(new android.graphics.ColorMatrix(arg0 == null ? null : arg0.unwrap()));
    }

    public ColorMatrix(float[] arg0) {
        this(new android.graphics.ColorMatrix(arg0));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public float[] getArray() {
        return real.getArray();
    }

    public void postConcat(com.micklab.dcg.wrapper.android.graphics.ColorMatrix arg0) {
        real.postConcat(arg0 == null ? null : arg0.unwrap());
    }

    public void preConcat(com.micklab.dcg.wrapper.android.graphics.ColorMatrix arg0) {
        real.preConcat(arg0 == null ? null : arg0.unwrap());
    }

    public void reset() {
        real.reset();
    }

    public void set(com.micklab.dcg.wrapper.android.graphics.ColorMatrix arg0) {
        real.set(arg0 == null ? null : arg0.unwrap());
    }

    public void set(float[] arg0) {
        real.set(arg0);
    }

    public void setConcat(com.micklab.dcg.wrapper.android.graphics.ColorMatrix arg0, com.micklab.dcg.wrapper.android.graphics.ColorMatrix arg1) {
        real.setConcat(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setRGB2YUV() {
        real.setRGB2YUV();
    }

    public void setRotate(int arg0, float arg1) {
        real.setRotate(arg0, arg1);
    }

    public void setSaturation(float arg0) {
        real.setSaturation(arg0);
    }

    public void setScale(float arg0, float arg1, float arg2, float arg3) {
        real.setScale(arg0, arg1, arg2, arg3);
    }

    public void setYUV2RGB() {
        real.setYUV2RGB();
    }

}
