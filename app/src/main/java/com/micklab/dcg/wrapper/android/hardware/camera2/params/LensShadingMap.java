// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class LensShadingMap {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LensShadingMap(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.LensShadingMap wrap(android.hardware.camera2.params.LensShadingMap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.LensShadingMap(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.params.LensShadingMap getReal() {
        return (android.hardware.camera2.params.LensShadingMap) real;
    }

    public android.hardware.camera2.params.LensShadingMap unwrap() {
        return getReal();
    }

    public void copyGainFactors(float[] arg0, int arg1) {
        ((android.hardware.camera2.params.LensShadingMap) real).copyGainFactors(arg0, arg1);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.hardware.camera2.params.LensShadingMap) real).equals(arg0);
    }

    public int getColumnCount() {
        return ((android.hardware.camera2.params.LensShadingMap) real).getColumnCount();
    }

    public float getGainFactor(int arg0, int arg1, int arg2) {
        return ((android.hardware.camera2.params.LensShadingMap) real).getGainFactor(arg0, arg1, arg2);
    }

    public int getGainFactorCount() {
        return ((android.hardware.camera2.params.LensShadingMap) real).getGainFactorCount();
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.params.RggbChannelVector getGainFactorVector(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.hardware.camera2.params.RggbChannelVector.wrap(((android.hardware.camera2.params.LensShadingMap) real).getGainFactorVector(arg0, arg1));
    }

    public int getRowCount() {
        return ((android.hardware.camera2.params.LensShadingMap) real).getRowCount();
    }

    public int hashCode() {
        return ((android.hardware.camera2.params.LensShadingMap) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.hardware.camera2.params.LensShadingMap) real).toString();
    }

    public static final float MINIMUM_GAIN_FACTOR = android.hardware.camera2.params.LensShadingMap.MINIMUM_GAIN_FACTOR;

}
