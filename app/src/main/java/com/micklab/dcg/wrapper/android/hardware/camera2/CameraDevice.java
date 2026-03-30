// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class CameraDevice {
    private final android.hardware.camera2.CameraDevice real;

    public CameraDevice(android.hardware.camera2.CameraDevice real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice wrap(android.hardware.camera2.CameraDevice real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice(real);
    }

    public android.hardware.camera2.CameraDevice unwrap() {
        return real;
    }

    public void close() {
        real.close();
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.Builder createCaptureRequest(int arg0) throws android.hardware.camera2.CameraAccessException {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.Builder.wrap(real.createCaptureRequest(arg0));
    }

    public void createCaptureSession(com.micklab.dcg.wrapper.android.hardware.camera2.params.SessionConfiguration arg0) throws android.hardware.camera2.CameraAccessException {
        real.createCaptureSession(arg0 == null ? null : arg0.unwrap());
    }

    public void createExtensionSession(com.micklab.dcg.wrapper.android.hardware.camera2.params.ExtensionSessionConfiguration arg0) throws android.hardware.camera2.CameraAccessException {
        real.createExtensionSession(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.Builder createReprocessCaptureRequest(com.micklab.dcg.wrapper.android.hardware.camera2.TotalCaptureResult arg0) throws android.hardware.camera2.CameraAccessException {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.Builder.wrap(real.createReprocessCaptureRequest(arg0 == null ? null : arg0.unwrap()));
    }

    public int getCameraAudioRestriction() throws android.hardware.camera2.CameraAccessException {
        return real.getCameraAudioRestriction();
    }

    public java.lang.String getId() {
        return real.getId();
    }

    public boolean isSessionConfigurationSupported(com.micklab.dcg.wrapper.android.hardware.camera2.params.SessionConfiguration arg0) throws android.hardware.camera2.CameraAccessException {
        return real.isSessionConfigurationSupported(arg0 == null ? null : arg0.unwrap());
    }

    public void setCameraAudioRestriction(int arg0) throws android.hardware.camera2.CameraAccessException {
        real.setCameraAudioRestriction(arg0);
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
        private final android.hardware.camera2.CameraDevice.CameraDeviceSetup real;

        public CameraDeviceSetup(android.hardware.camera2.CameraDevice.CameraDeviceSetup real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice.CameraDeviceSetup wrap(android.hardware.camera2.CameraDevice.CameraDeviceSetup real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice.CameraDeviceSetup(real);
        }

        public android.hardware.camera2.CameraDevice.CameraDeviceSetup unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.Builder createCaptureRequest(int arg0) throws android.hardware.camera2.CameraAccessException {
            return com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest.Builder.wrap(real.createCaptureRequest(arg0));
        }

        public java.lang.String getId() {
            return real.getId();
        }

        public com.micklab.dcg.wrapper.android.hardware.camera2.CameraCharacteristics getSessionCharacteristics(com.micklab.dcg.wrapper.android.hardware.camera2.params.SessionConfiguration arg0) throws android.hardware.camera2.CameraAccessException {
            return com.micklab.dcg.wrapper.android.hardware.camera2.CameraCharacteristics.wrap(real.getSessionCharacteristics(arg0 == null ? null : arg0.unwrap()));
        }

        public boolean isSessionConfigurationSupported(com.micklab.dcg.wrapper.android.hardware.camera2.params.SessionConfiguration arg0) throws android.hardware.camera2.CameraAccessException {
            return real.isSessionConfigurationSupported(arg0 == null ? null : arg0.unwrap());
        }

        public void openCamera(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice.StateCallback arg1) throws android.hardware.camera2.CameraAccessException {
            real.openCamera(arg0, arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class StateCallback {
        private final android.hardware.camera2.CameraDevice.StateCallback real;

        public StateCallback(android.hardware.camera2.CameraDevice.StateCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice.StateCallback wrap(android.hardware.camera2.CameraDevice.StateCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice.StateCallback(real);
        }

        public android.hardware.camera2.CameraDevice.StateCallback unwrap() {
            return real;
        }

        public void onClosed(com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice arg0) {
            real.onClosed(arg0 == null ? null : arg0.unwrap());
        }

        public void onDisconnected(com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice arg0) {
            real.onDisconnected(arg0 == null ? null : arg0.unwrap());
        }

        public void onError(com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice arg0, int arg1) {
            real.onError(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void onOpened(com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice arg0) {
            real.onOpened(arg0 == null ? null : arg0.unwrap());
        }

        public static final int ERROR_CAMERA_DEVICE = android.hardware.camera2.CameraDevice.StateCallback.ERROR_CAMERA_DEVICE;
        public static final int ERROR_CAMERA_DISABLED = android.hardware.camera2.CameraDevice.StateCallback.ERROR_CAMERA_DISABLED;
        public static final int ERROR_CAMERA_IN_USE = android.hardware.camera2.CameraDevice.StateCallback.ERROR_CAMERA_IN_USE;
        public static final int ERROR_CAMERA_SERVICE = android.hardware.camera2.CameraDevice.StateCallback.ERROR_CAMERA_SERVICE;
        public static final int ERROR_MAX_CAMERAS_IN_USE = android.hardware.camera2.CameraDevice.StateCallback.ERROR_MAX_CAMERAS_IN_USE;

    }
}
