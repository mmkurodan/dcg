// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class CameraAccessException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CameraAccessException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraAccessException wrap(android.hardware.camera2.CameraAccessException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraAccessException(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.CameraAccessException getReal() {
        return (android.hardware.camera2.CameraAccessException) real;
    }

    public android.hardware.camera2.CameraAccessException unwrap() {
        return getReal();
    }

    public CameraAccessException(int arg0) {
        this(new android.hardware.camera2.CameraAccessException(arg0), (__DcgwBridgeToken) null);
    }

    public CameraAccessException(int arg0, java.lang.Throwable arg1) {
        this(new android.hardware.camera2.CameraAccessException(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public CameraAccessException(int arg0, java.lang.String arg1) {
        this(new android.hardware.camera2.CameraAccessException(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public CameraAccessException(int arg0, java.lang.String arg1, java.lang.Throwable arg2) {
        this(new android.hardware.camera2.CameraAccessException(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public int getReason() {
        return ((android.hardware.camera2.CameraAccessException) real).getReason();
    }

    public static final int CAMERA_DISABLED = android.hardware.camera2.CameraAccessException.CAMERA_DISABLED;
    public static final int CAMERA_DISCONNECTED = android.hardware.camera2.CameraAccessException.CAMERA_DISCONNECTED;
    public static final int CAMERA_ERROR = android.hardware.camera2.CameraAccessException.CAMERA_ERROR;
    public static final int CAMERA_IN_USE = android.hardware.camera2.CameraAccessException.CAMERA_IN_USE;
    public static final int MAX_CAMERAS_IN_USE = android.hardware.camera2.CameraAccessException.MAX_CAMERAS_IN_USE;

}
