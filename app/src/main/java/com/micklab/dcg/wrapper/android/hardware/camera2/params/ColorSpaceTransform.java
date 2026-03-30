// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class ColorSpaceTransform {
    private final android.hardware.camera2.params.ColorSpaceTransform real;

    public ColorSpaceTransform(android.hardware.camera2.params.ColorSpaceTransform real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.ColorSpaceTransform wrap(android.hardware.camera2.params.ColorSpaceTransform real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.ColorSpaceTransform(real);
    }

    public android.hardware.camera2.params.ColorSpaceTransform unwrap() {
        return real;
    }

    public ColorSpaceTransform(android.util.Rational[] arg0) {
        this(new android.hardware.camera2.params.ColorSpaceTransform(arg0));
    }

    public ColorSpaceTransform(int[] arg0) {
        this(new android.hardware.camera2.params.ColorSpaceTransform(arg0));
    }

    public void copyElements(int[] arg0, int arg1) {
        real.copyElements(arg0, arg1);
    }

    public void copyElements(android.util.Rational[] arg0, int arg1) {
        real.copyElements(arg0, arg1);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.util.Rational getElement(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.util.Rational.wrap(real.getElement(arg0, arg1));
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
