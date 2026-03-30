// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class LensShadingMap {
    private final android.hardware.camera2.params.LensShadingMap real;

    public LensShadingMap(android.hardware.camera2.params.LensShadingMap real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.LensShadingMap wrap(android.hardware.camera2.params.LensShadingMap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.LensShadingMap(real);
    }

    public android.hardware.camera2.params.LensShadingMap unwrap() {
        return real;
    }

    public void copyGainFactors(float[] arg0, int arg1) {
        real.copyGainFactors(arg0, arg1);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getColumnCount() {
        return real.getColumnCount();
    }

    public float getGainFactor(int arg0, int arg1, int arg2) {
        return real.getGainFactor(arg0, arg1, arg2);
    }

    public int getGainFactorCount() {
        return real.getGainFactorCount();
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.params.RggbChannelVector getGainFactorVector(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.hardware.camera2.params.RggbChannelVector.wrap(real.getGainFactorVector(arg0, arg1));
    }

    public int getRowCount() {
        return real.getRowCount();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final float MINIMUM_GAIN_FACTOR = android.hardware.camera2.params.LensShadingMap.MINIMUM_GAIN_FACTOR;

}
