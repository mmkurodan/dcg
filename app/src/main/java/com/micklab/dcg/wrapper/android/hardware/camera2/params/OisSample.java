// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class OisSample {
    private final android.hardware.camera2.params.OisSample real;

    public OisSample(android.hardware.camera2.params.OisSample real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.OisSample wrap(android.hardware.camera2.params.OisSample real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.OisSample(real);
    }

    public android.hardware.camera2.params.OisSample unwrap() {
        return real;
    }

    public OisSample(long arg0, float arg1, float arg2) {
        this(new android.hardware.camera2.params.OisSample(arg0, arg1, arg2));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public long getTimestamp() {
        return real.getTimestamp();
    }

    public float getXshift() {
        return real.getXshift();
    }

    public float getYshift() {
        return real.getYshift();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
