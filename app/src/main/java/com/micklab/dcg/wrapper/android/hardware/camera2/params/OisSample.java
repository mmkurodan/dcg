// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class OisSample {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OisSample(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.OisSample wrap(android.hardware.camera2.params.OisSample real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.OisSample(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.params.OisSample getReal() {
        return (android.hardware.camera2.params.OisSample) real;
    }

    public android.hardware.camera2.params.OisSample unwrap() {
        return getReal();
    }

    public OisSample(long arg0, float arg1, float arg2) {
        this(new android.hardware.camera2.params.OisSample(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.hardware.camera2.params.OisSample) real).equals(arg0);
    }

    public long getTimestamp() {
        return ((android.hardware.camera2.params.OisSample) real).getTimestamp();
    }

    public float getXshift() {
        return ((android.hardware.camera2.params.OisSample) real).getXshift();
    }

    public float getYshift() {
        return ((android.hardware.camera2.params.OisSample) real).getYshift();
    }

    public int hashCode() {
        return ((android.hardware.camera2.params.OisSample) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.hardware.camera2.params.OisSample) real).toString();
    }

}
