// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class CameraConstrainedHighSpeedCaptureSession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CameraConstrainedHighSpeedCaptureSession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession wrap(android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession getReal() {
        return (android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession) real;
    }

    public android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession unwrap() {
        return getReal();
    }

}
