// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class CameraDevice {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CameraDevice(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice wrap(android.hardware.camera2.CameraDevice real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.CameraDevice getReal() {
        return (android.hardware.camera2.CameraDevice) real;
    }

    public android.hardware.camera2.CameraDevice unwrap() {
        return getReal();
    }

    public void close() {
        ((android.hardware.camera2.CameraDevice) real).close();
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.Builder createCaptureRequest(int arg0) throws android.hardware.camera2.CameraAccessException {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.Builder.wrap(((android.hardware.camera2.CameraDevice) real).createCaptureRequest(arg0));
    }

    public void createCaptureSession(com.micklab.dcg.wrapper.android.hardware.camera2.params.SessionConfiguration arg0) throws android.hardware.camera2.CameraAccessException {
        ((android.hardware.camera2.CameraDevice) real).createCaptureSession(arg0 == null ? null : arg0.getReal());
    }

    public void createExtensionSession(com.micklab.dcg.wrapper.android.hardware.camera2.params.ExtensionSessionConfiguration arg0) throws android.hardware.camera2.CameraAccessException {
        ((android.hardware.camera2.CameraDevice) real).createExtensionSession(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.Builder createReprocessCaptureRequest(com.micklab.dcg.wrapper.android.hardware.camera2.TotalCaptureResult arg0) throws android.hardware.camera2.CameraAccessException {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.Builder.wrap(((android.hardware.camera2.CameraDevice) real).createReprocessCaptureRequest(arg0 == null ? null : arg0.getReal()));
    }

    public int getCameraAudioRestriction() throws android.hardware.camera2.CameraAccessException {
        return ((android.hardware.camera2.CameraDevice) real).getCameraAudioRestriction();
    }

    public java.lang.String getId() {
        return ((android.hardware.camera2.CameraDevice) real).getId();
    }

    public boolean isSessionConfigurationSupported(com.micklab.dcg.wrapper.android.hardware.camera2.params.SessionConfiguration arg0) throws android.hardware.camera2.CameraAccessException {
        return ((android.hardware.camera2.CameraDevice) real).isSessionConfigurationSupported(arg0 == null ? null : arg0.getReal());
    }

    public void setCameraAudioRestriction(int arg0) throws android.hardware.camera2.CameraAccessException {
        ((android.hardware.camera2.CameraDevice) real).setCameraAudioRestriction(arg0);
    }

    public static final int AUDIO_RESTRICTION_NONE = android.hardware.camera2.CameraDevice.AUDIO_RESTRICTION_NONE;
    public static final int AUDIO_RESTRICTION_VIBRATION = android.hardware.camera2.CameraDevice.AUDIO_RESTRICTION_VIBRATION;
    public static final int AUDIO_RESTRICTION_VIBRATION_SOUND = android.hardware.camera2.CameraDevice.AUDIO_RESTRICTION_VIBRATION_SOUND;
    public static final int TEMPLATE_MANUAL = android.hardware.camera2.CameraDevice.TEMPLATE_MANUAL;
    public static final int TEMPLATE_PREVIEW = android.hardware.camera2.CameraDevice.TEMPLATE_PREVIEW;
    public static final int TEMPLATE_RECORD = android.hardware.camera2.CameraDevice.TEMPLATE_RECORD;
    public static final int TEMPLATE_STILL_CAPTURE = android.hardware.camera2.CameraDevice.TEMPLATE_STILL_CAPTURE;
    public static final int TEMPLATE_VIDEO_SNAPSHOT = android.hardware.camera2.CameraDevice.TEMPLATE_VIDEO_SNAPSHOT;
    public static final int TEMPLATE_ZERO_SHUTTER_LAG = android.hardware.camera2.CameraDevice.TEMPLATE_ZERO_SHUTTER_LAG;

    public static final class CameraDeviceSetup {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CameraDeviceSetup(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice.CameraDeviceSetup wrap(android.hardware.camera2.CameraDevice.CameraDeviceSetup real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice.CameraDeviceSetup(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.camera2.CameraDevice.CameraDeviceSetup getReal() {
            return (android.hardware.camera2.CameraDevice.CameraDeviceSetup) real;
        }

        public android.hardware.camera2.CameraDevice.CameraDeviceSetup unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.Builder createCaptureRequest(int arg0) throws android.hardware.camera2.CameraAccessException {
            return com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.Builder.wrap(((android.hardware.camera2.CameraDevice.CameraDeviceSetup) real).createCaptureRequest(arg0));
        }

        public java.lang.String getId() {
            return ((android.hardware.camera2.CameraDevice.CameraDeviceSetup) real).getId();
        }

        public com.micklab.dcg.wrapper.android.hardware.camera2.CameraCharacteristics getSessionCharacteristics(com.micklab.dcg.wrapper.android.hardware.camera2.params.SessionConfiguration arg0) throws android.hardware.camera2.CameraAccessException {
            return com.micklab.dcg.wrapper.android.hardware.camera2.CameraCharacteristics.wrap(((android.hardware.camera2.CameraDevice.CameraDeviceSetup) real).getSessionCharacteristics(arg0 == null ? null : arg0.getReal()));
        }

        public boolean isSessionConfigurationSupported(com.micklab.dcg.wrapper.android.hardware.camera2.params.SessionConfiguration arg0) throws android.hardware.camera2.CameraAccessException {
            return ((android.hardware.camera2.CameraDevice.CameraDeviceSetup) real).isSessionConfigurationSupported(arg0 == null ? null : arg0.getReal());
        }

        public void openCamera(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice.StateCallback arg1) throws android.hardware.camera2.CameraAccessException {
            ((android.hardware.camera2.CameraDevice.CameraDeviceSetup) real).openCamera(arg0, arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class StateCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private StateCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice.StateCallback wrap(android.hardware.camera2.CameraDevice.StateCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice.StateCallback(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.camera2.CameraDevice.StateCallback getReal() {
            return (android.hardware.camera2.CameraDevice.StateCallback) real;
        }

        public android.hardware.camera2.CameraDevice.StateCallback unwrap() {
            return getReal();
        }

        public void onClosed(com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice arg0) {
            ((android.hardware.camera2.CameraDevice.StateCallback) real).onClosed(arg0 == null ? null : arg0.getReal());
        }

        public void onDisconnected(com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice arg0) {
            ((android.hardware.camera2.CameraDevice.StateCallback) real).onDisconnected(arg0 == null ? null : arg0.getReal());
        }

        public void onError(com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice arg0, int arg1) {
            ((android.hardware.camera2.CameraDevice.StateCallback) real).onError(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onOpened(com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice arg0) {
            ((android.hardware.camera2.CameraDevice.StateCallback) real).onOpened(arg0 == null ? null : arg0.getReal());
        }

        public static final int ERROR_CAMERA_DEVICE = android.hardware.camera2.CameraDevice.StateCallback.ERROR_CAMERA_DEVICE;
        public static final int ERROR_CAMERA_DISABLED = android.hardware.camera2.CameraDevice.StateCallback.ERROR_CAMERA_DISABLED;
        public static final int ERROR_CAMERA_IN_USE = android.hardware.camera2.CameraDevice.StateCallback.ERROR_CAMERA_IN_USE;
        public static final int ERROR_CAMERA_SERVICE = android.hardware.camera2.CameraDevice.StateCallback.ERROR_CAMERA_SERVICE;
        public static final int ERROR_MAX_CAMERAS_IN_USE = android.hardware.camera2.CameraDevice.StateCallback.ERROR_MAX_CAMERAS_IN_USE;

    }
}
