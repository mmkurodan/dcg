// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class MultiResolutionStreamInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MultiResolutionStreamInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.MultiResolutionStreamInfo wrap(android.hardware.camera2.params.MultiResolutionStreamInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.MultiResolutionStreamInfo(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.params.MultiResolutionStreamInfo getReal() {
        return (android.hardware.camera2.params.MultiResolutionStreamInfo) real;
    }

    public android.hardware.camera2.params.MultiResolutionStreamInfo unwrap() {
        return getReal();
    }

    public MultiResolutionStreamInfo(int arg0, int arg1, java.lang.String arg2) {
        this(new android.hardware.camera2.params.MultiResolutionStreamInfo(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.hardware.camera2.params.MultiResolutionStreamInfo) real).equals(arg0);
    }

    public int getHeight() {
        return ((android.hardware.camera2.params.MultiResolutionStreamInfo) real).getHeight();
    }

    public java.lang.String getPhysicalCameraId() {
        return ((android.hardware.camera2.params.MultiResolutionStreamInfo) real).getPhysicalCameraId();
    }

    public int getWidth() {
        return ((android.hardware.camera2.params.MultiResolutionStreamInfo) real).getWidth();
    }

    public int hashCode() {
        return ((android.hardware.camera2.params.MultiResolutionStreamInfo) real).hashCode();
    }

}
