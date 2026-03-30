// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class CameraExtensionCharacteristics {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CameraExtensionCharacteristics(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionCharacteristics wrap(android.hardware.camera2.CameraExtensionCharacteristics real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionCharacteristics(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.CameraExtensionCharacteristics getReal() {
        return (android.hardware.camera2.CameraExtensionCharacteristics) real;
    }

    public android.hardware.camera2.CameraExtensionCharacteristics unwrap() {
        return getReal();
    }

    public boolean isCaptureProcessProgressAvailable(int arg0) {
        return ((android.hardware.camera2.CameraExtensionCharacteristics) real).isCaptureProcessProgressAvailable(arg0);
    }

    public boolean isPostviewAvailable(int arg0) {
        return ((android.hardware.camera2.CameraExtensionCharacteristics) real).isPostviewAvailable(arg0);
    }

    public static final int EXTENSION_AUTOMATIC = android.hardware.camera2.CameraExtensionCharacteristics.EXTENSION_AUTOMATIC;
    public static final int EXTENSION_BEAUTY = android.hardware.camera2.CameraExtensionCharacteristics.EXTENSION_BEAUTY;
    public static final int EXTENSION_BOKEH = android.hardware.camera2.CameraExtensionCharacteristics.EXTENSION_BOKEH;
    public static final int EXTENSION_FACE_RETOUCH = android.hardware.camera2.CameraExtensionCharacteristics.EXTENSION_FACE_RETOUCH;
    public static final int EXTENSION_HDR = android.hardware.camera2.CameraExtensionCharacteristics.EXTENSION_HDR;
    public static final int EXTENSION_NIGHT = android.hardware.camera2.CameraExtensionCharacteristics.EXTENSION_NIGHT;

}
