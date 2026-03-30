// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class CaptureFailure {
    private final android.hardware.camera2.CaptureFailure real;

    public CaptureFailure(android.hardware.camera2.CaptureFailure real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.CaptureFailure wrap(android.hardware.camera2.CaptureFailure real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CaptureFailure(real);
    }

    public android.hardware.camera2.CaptureFailure unwrap() {
        return real;
    }

    public long getFrameNumber() {
        return real.getFrameNumber();
    }

    public java.lang.String getPhysicalCameraId() {
        return real.getPhysicalCameraId();
    }

    public int getReason() {
        return real.getReason();
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest getRequest() {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.wrap(real.getRequest());
    }

    public int getSequenceId() {
        return real.getSequenceId();
    }

    public boolean wasImageCaptured() {
        return real.wasImageCaptured();
    }

    public static final int REASON_ERROR = android.hardware.camera2.CaptureFailure.REASON_ERROR;
    public static final int REASON_FLUSHED = android.hardware.camera2.CaptureFailure.REASON_FLUSHED;

}
