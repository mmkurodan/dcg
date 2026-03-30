// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class RggbChannelVector {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RggbChannelVector(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.RggbChannelVector wrap(android.hardware.camera2.params.RggbChannelVector real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.RggbChannelVector(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.params.RggbChannelVector getReal() {
        return (android.hardware.camera2.params.RggbChannelVector) real;
    }

    public android.hardware.camera2.params.RggbChannelVector unwrap() {
        return getReal();
    }

    public RggbChannelVector(float arg0, float arg1, float arg2, float arg3) {
        this(new android.hardware.camera2.params.RggbChannelVector(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void copyTo(float[] arg0, int arg1) {
        ((android.hardware.camera2.params.RggbChannelVector) real).copyTo(arg0, arg1);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.hardware.camera2.params.RggbChannelVector) real).equals(arg0);
    }

    public float getBlue() {
        return ((android.hardware.camera2.params.RggbChannelVector) real).getBlue();
    }

    public float getComponent(int arg0) {
        return ((android.hardware.camera2.params.RggbChannelVector) real).getComponent(arg0);
    }

    public float getGreenEven() {
        return ((android.hardware.camera2.params.RggbChannelVector) real).getGreenEven();
    }

    public float getGreenOdd() {
        return ((android.hardware.camera2.params.RggbChannelVector) real).getGreenOdd();
    }

    public float getRed() {
        return ((android.hardware.camera2.params.RggbChannelVector) real).getRed();
    }

    public int hashCode() {
        return ((android.hardware.camera2.params.RggbChannelVector) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.hardware.camera2.params.RggbChannelVector) real).toString();
    }

    public static final int BLUE = android.hardware.camera2.params.RggbChannelVector.BLUE;
    public static final int COUNT = android.hardware.camera2.params.RggbChannelVector.COUNT;
    public static final int GREEN_EVEN = android.hardware.camera2.params.RggbChannelVector.GREEN_EVEN;
    public static final int GREEN_ODD = android.hardware.camera2.params.RggbChannelVector.GREEN_ODD;
    public static final int RED = android.hardware.camera2.params.RggbChannelVector.RED;

}
