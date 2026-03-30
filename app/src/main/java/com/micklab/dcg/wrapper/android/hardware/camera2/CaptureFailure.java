// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class CaptureFailure {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CaptureFailure(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.CaptureFailure wrap(android.hardware.camera2.CaptureFailure real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CaptureFailure(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.CaptureFailure getReal() {
        return (android.hardware.camera2.CaptureFailure) real;
    }

    public android.hardware.camera2.CaptureFailure unwrap() {
        return getReal();
    }

    public long getFrameNumber() {
        return ((android.hardware.camera2.CaptureFailure) real).getFrameNumber();
    }

    public java.lang.String getPhysicalCameraId() {
        return ((android.hardware.camera2.CaptureFailure) real).getPhysicalCameraId();
    }

    public int getReason() {
        return ((android.hardware.camera2.CaptureFailure) real).getReason();
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest getRequest() {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.wrap(((android.hardware.camera2.CaptureFailure) real).getRequest());
    }

    public int getSequenceId() {
        return ((android.hardware.camera2.CaptureFailure) real).getSequenceId();
    }

    public boolean wasImageCaptured() {
        return ((android.hardware.camera2.CaptureFailure) real).wasImageCaptured();
    }

    public static final int REASON_ERROR = android.hardware.camera2.CaptureFailure.REASON_ERROR;
    public static final int REASON_FLUSHED = android.hardware.camera2.CaptureFailure.REASON_FLUSHED;

}
