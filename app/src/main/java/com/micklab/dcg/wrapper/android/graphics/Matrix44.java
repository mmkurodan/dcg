// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Matrix44 {
    private final android.graphics.Matrix44 real;

    public Matrix44(android.graphics.Matrix44 real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Matrix44 wrap(android.graphics.Matrix44 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Matrix44(real);
    }

    public android.graphics.Matrix44 unwrap() {
        return real;
    }

    public Matrix44() {
        this(new android.graphics.Matrix44());
    }

    public Matrix44(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        this(new android.graphics.Matrix44(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.graphics.Matrix44 concat(com.micklab.dcg.wrapper.android.graphics.Matrix44 arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Matrix44.wrap(real.concat(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public float get(int arg0, int arg1) {
        return real.get(arg0, arg1);
    }

    public void getValues(float[] arg0) {
        real.getValues(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean invert() {
        return real.invert();
    }

    public boolean isIdentity() {
        return real.isIdentity();
    }

    public float[] map(float arg0, float arg1, float arg2, float arg3) {
        return real.map(arg0, arg1, arg2, arg3);
    }

    public void map(float arg0, float arg1, float arg2, float arg3, float[] arg4) {
        real.map(arg0, arg1, arg2, arg3, arg4);
    }

    public void reset() {
        real.reset();
    }

    public com.micklab.dcg.wrapper.android.graphics.Matrix44 rotate(float arg0, float arg1, float arg2, float arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Matrix44.wrap(real.rotate(arg0, arg1, arg2, arg3));
    }

    public com.micklab.dcg.wrapper.android.graphics.Matrix44 scale(float arg0, float arg1, float arg2) {
        return com.micklab.dcg.wrapper.android.graphics.Matrix44.wrap(real.scale(arg0, arg1, arg2));
    }

    public void set(int arg0, int arg1, float arg2) {
        real.set(arg0, arg1, arg2);
    }

    public void setValues(float[] arg0) {
        real.setValues(arg0);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public com.micklab.dcg.wrapper.android.graphics.Matrix44 translate(float arg0, float arg1, float arg2) {
        return com.micklab.dcg.wrapper.android.graphics.Matrix44.wrap(real.translate(arg0, arg1, arg2));
    }

}
