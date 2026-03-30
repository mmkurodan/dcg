// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class RggbChannelVector {
    private final android.hardware.camera2.params.RggbChannelVector real;

    public RggbChannelVector(android.hardware.camera2.params.RggbChannelVector real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.RggbChannelVector wrap(android.hardware.camera2.params.RggbChannelVector real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.RggbChannelVector(real);
    }

    public android.hardware.camera2.params.RggbChannelVector unwrap() {
        return real;
    }

    public RggbChannelVector(float arg0, float arg1, float arg2, float arg3) {
        this(new android.hardware.camera2.params.RggbChannelVector(arg0, arg1, arg2, arg3));
    }

    public void copyTo(float[] arg0, int arg1) {
        real.copyTo(arg0, arg1);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public float getBlue() {
        return real.getBlue();
    }

    public float getComponent(int arg0) {
        return real.getComponent(arg0);
    }

    public float getGreenEven() {
        return real.getGreenEven();
    }

    public float getGreenOdd() {
        return real.getGreenOdd();
    }

    public float getRed() {
        return real.getRed();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final int BLUE = android.hardware.camera2.params.RggbChannelVector.BLUE;
    public static final int COUNT = android.hardware.camera2.params.RggbChannelVector.COUNT;
    public static final int GREEN_EVEN = android.hardware.camera2.params.RggbChannelVector.GREEN_EVEN;
    public static final int GREEN_ODD = android.hardware.camera2.params.RggbChannelVector.GREEN_ODD;
    public static final int RED = android.hardware.camera2.params.RggbChannelVector.RED;

}
