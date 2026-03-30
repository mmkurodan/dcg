// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class CameraManager {
    private final android.hardware.camera2.CameraManager real;

    public CameraManager(android.hardware.camera2.CameraManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraManager wrap(android.hardware.camera2.CameraManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraManager(real);
    }

    public android.hardware.camera2.CameraManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CameraCharacteristics getCameraCharacteristics(java.lang.String arg0) throws android.hardware.camera2.CameraAccessException {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CameraCharacteristics.wrap(real.getCameraCharacteristics(arg0));
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice.CameraDeviceSetup getCameraDeviceSetup(java.lang.String arg0) throws android.hardware.camera2.CameraAccessException {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice.CameraDeviceSetup.wrap(real.getCameraDeviceSetup(arg0));
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionCharacteristics getCameraExtensionCharacteristics(java.lang.String arg0) throws android.hardware.camera2.CameraAccessException {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionCharacteristics.wrap(real.getCameraExtensionCharacteristics(arg0));
    }

    public java.lang.String[] getCameraIdList() throws android.hardware.camera2.CameraAccessException {
        return real.getCameraIdList();
    }

    public int getTorchStrengthLevel(java.lang.String arg0) throws android.hardware.camera2.CameraAccessException {
        return real.getTorchStrengthLevel(arg0);
    }

    public boolean isCameraDeviceSetupSupported(java.lang.String arg0) throws android.hardware.camera2.CameraAccessException {
        return real.isCameraDeviceSetupSupported(arg0);
    }

    public void openCamera(java.lang.String arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice.StateCallback arg2) throws android.hardware.camera2.CameraAccessException {
        real.openCamera(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void openCamera(java.lang.String arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice.StateCallback arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) throws android.hardware.camera2.CameraAccessException {
        real.openCamera(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void registerAvailabilityCallback(com.micklab.dcg.wrapper.android.hardware.camera2.CameraManager.AvailabilityCallback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.registerAvailabilityCallback(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void registerAvailabilityCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CameraManager.AvailabilityCallback arg1) {
        real.registerAvailabilityCallback(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void registerTorchCallback(com.micklab.dcg.wrapper.android.hardware.camera2.CameraManager.TorchCallback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.registerTorchCallback(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void registerTorchCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CameraManager.TorchCallback arg1) {
        real.registerTorchCallback(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setTorchMode(java.lang.String arg0, boolean arg1) throws android.hardware.camera2.CameraAccessException {
        real.setTorchMode(arg0, arg1);
    }

    public void turnOnTorchWithStrengthLevel(java.lang.String arg0, int arg1) throws android.hardware.camera2.CameraAccessException {
        real.turnOnTorchWithStrengthLevel(arg0, arg1);
    }

    public void unregisterAvailabilityCallback(com.micklab.dcg.wrapper.android.hardware.camera2.CameraManager.AvailabilityCallback arg0) {
        real.unregisterAvailabilityCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterTorchCallback(com.micklab.dcg.wrapper.android.hardware.camera2.CameraManager.TorchCallback arg0) {
        real.unregisterTorchCallback(arg0 == null ? null : arg0.unwrap());
    }

    public static final class AvailabilityCallback {
        private final android.hardware.camera2.CameraManager.AvailabilityCallback real;

        public AvailabilityCallback(android.hardware.camera2.CameraManager.AvailabilityCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraManager.AvailabilityCallback wrap(android.hardware.camera2.CameraManager.AvailabilityCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraManager.AvailabilityCallback(real);
        }

        public android.hardware.camera2.CameraManager.AvailabilityCallback unwrap() {
            return real;
        }

        public void onCameraAccessPrioritiesChanged() {
            real.onCameraAccessPrioritiesChanged();
        }

        public void onCameraAvailable(java.lang.String arg0) {
            real.onCameraAvailable(arg0);
        }

        public void onCameraUnavailable(java.lang.String arg0) {
            real.onCameraUnavailable(arg0);
        }

        public void onPhysicalCameraAvailable(java.lang.String arg0, java.lang.String arg1) {
            real.onPhysicalCameraAvailable(arg0, arg1);
        }

        public void onPhysicalCameraUnavailable(java.lang.String arg0, java.lang.String arg1) {
            real.onPhysicalCameraUnavailable(arg0, arg1);
        }

    }
    public static final class TorchCallback {
        private final android.hardware.camera2.CameraManager.TorchCallback real;

        public TorchCallback(android.hardware.camera2.CameraManager.TorchCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraManager.TorchCallback wrap(android.hardware.camera2.CameraManager.TorchCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraManager.TorchCallback(real);
        }

        public android.hardware.camera2.CameraManager.TorchCallback unwrap() {
            return real;
        }

        public void onTorchModeChanged(java.lang.String arg0, boolean arg1) {
            real.onTorchModeChanged(arg0, arg1);
        }

        public void onTorchModeUnavailable(java.lang.String arg0) {
            real.onTorchModeUnavailable(arg0);
        }

        public void onTorchStrengthLevelChanged(java.lang.String arg0, int arg1) {
            real.onTorchStrengthLevelChanged(arg0, arg1);
        }

    }
}
