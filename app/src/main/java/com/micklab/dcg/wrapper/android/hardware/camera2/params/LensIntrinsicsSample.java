// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class LensIntrinsicsSample {
    private final android.hardware.camera2.params.LensIntrinsicsSample real;

    public LensIntrinsicsSample(android.hardware.camera2.params.LensIntrinsicsSample real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.LensIntrinsicsSample wrap(android.hardware.camera2.params.LensIntrinsicsSample real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.LensIntrinsicsSample(real);
    }

    public android.hardware.camera2.params.LensIntrinsicsSample unwrap() {
        return real;
    }

    public LensIntrinsicsSample(long arg0, float[] arg1) {
        this(new android.hardware.camera2.params.LensIntrinsicsSample(arg0, arg1));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public float[] getLensIntrinsics() {
        return real.getLensIntrinsics();
    }

    public long getTimestampNanos() {
        return real.getTimestampNanos();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
