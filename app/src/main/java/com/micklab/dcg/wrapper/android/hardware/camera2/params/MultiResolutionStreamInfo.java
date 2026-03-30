// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class MultiResolutionStreamInfo {
    private final android.hardware.camera2.params.MultiResolutionStreamInfo real;

    public MultiResolutionStreamInfo(android.hardware.camera2.params.MultiResolutionStreamInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.MultiResolutionStreamInfo wrap(android.hardware.camera2.params.MultiResolutionStreamInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.MultiResolutionStreamInfo(real);
    }

    public android.hardware.camera2.params.MultiResolutionStreamInfo unwrap() {
        return real;
    }

    public MultiResolutionStreamInfo(int arg0, int arg1, java.lang.String arg2) {
        this(new android.hardware.camera2.params.MultiResolutionStreamInfo(arg0, arg1, arg2));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getHeight() {
        return real.getHeight();
    }

    public java.lang.String getPhysicalCameraId() {
        return real.getPhysicalCameraId();
    }

    public int getWidth() {
        return real.getWidth();
    }

    public int hashCode() {
        return real.hashCode();
    }

}
