// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class LensIntrinsicsSample {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LensIntrinsicsSample(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.LensIntrinsicsSample wrap(android.hardware.camera2.params.LensIntrinsicsSample real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.LensIntrinsicsSample(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.params.LensIntrinsicsSample getReal() {
        return (android.hardware.camera2.params.LensIntrinsicsSample) real;
    }

    public android.hardware.camera2.params.LensIntrinsicsSample unwrap() {
        return getReal();
    }

    public LensIntrinsicsSample(long arg0, float[] arg1) {
        this(new android.hardware.camera2.params.LensIntrinsicsSample(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.hardware.camera2.params.LensIntrinsicsSample) real).equals(arg0);
    }

    public float[] getLensIntrinsics() {
        return ((android.hardware.camera2.params.LensIntrinsicsSample) real).getLensIntrinsics();
    }

    public long getTimestampNanos() {
        return ((android.hardware.camera2.params.LensIntrinsicsSample) real).getTimestampNanos();
    }

    public int hashCode() {
        return ((android.hardware.camera2.params.LensIntrinsicsSample) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.hardware.camera2.params.LensIntrinsicsSample) real).toString();
    }

}
