// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class ColorSpaceTransform {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ColorSpaceTransform(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.ColorSpaceTransform wrap(android.hardware.camera2.params.ColorSpaceTransform real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.ColorSpaceTransform(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.params.ColorSpaceTransform getReal() {
        return (android.hardware.camera2.params.ColorSpaceTransform) real;
    }

    public android.hardware.camera2.params.ColorSpaceTransform unwrap() {
        return getReal();
    }

    public ColorSpaceTransform(android.util.Rational[] arg0) {
        this(new android.hardware.camera2.params.ColorSpaceTransform(arg0), (__DcgwBridgeToken) null);
    }

    public ColorSpaceTransform(int[] arg0) {
        this(new android.hardware.camera2.params.ColorSpaceTransform(arg0), (__DcgwBridgeToken) null);
    }

    public void copyElements(int[] arg0, int arg1) {
        ((android.hardware.camera2.params.ColorSpaceTransform) real).copyElements(arg0, arg1);
    }

    public void copyElements(android.util.Rational[] arg0, int arg1) {
        ((android.hardware.camera2.params.ColorSpaceTransform) real).copyElements(arg0, arg1);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.hardware.camera2.params.ColorSpaceTransform) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.util.Rational getElement(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.util.Rational.wrap(((android.hardware.camera2.params.ColorSpaceTransform) real).getElement(arg0, arg1));
    }

    public int hashCode() {
        return ((android.hardware.camera2.params.ColorSpaceTransform) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.hardware.camera2.params.ColorSpaceTransform) real).toString();
    }

}
