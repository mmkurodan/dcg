// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class CameraManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CameraManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraManager wrap(android.hardware.camera2.CameraManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraManager(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.CameraManager getReal() {
        return (android.hardware.camera2.CameraManager) real;
    }

    public android.hardware.camera2.CameraManager unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CameraCharacteristics getCameraCharacteristics(java.lang.String arg0) throws android.hardware.camera2.CameraAccessException {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CameraCharacteristics.wrap(((android.hardware.camera2.CameraManager) real).getCameraCharacteristics(arg0));
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice.CameraDeviceSetup getCameraDeviceSetup(java.lang.String arg0) throws android.hardware.camera2.CameraAccessException {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice.CameraDeviceSetup.wrap(((android.hardware.camera2.CameraManager) real).getCameraDeviceSetup(arg0));
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionCharacteristics getCameraExtensionCharacteristics(java.lang.String arg0) throws android.hardware.camera2.CameraAccessException {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionCharacteristics.wrap(((android.hardware.camera2.CameraManager) real).getCameraExtensionCharacteristics(arg0));
    }

    public java.lang.String[] getCameraIdList() throws android.hardware.camera2.CameraAccessException {
        return ((android.hardware.camera2.CameraManager) real).getCameraIdList();
    }

    public int getTorchStrengthLevel(java.lang.String arg0) throws android.hardware.camera2.CameraAccessException {
        return ((android.hardware.camera2.CameraManager) real).getTorchStrengthLevel(arg0);
    }

    public boolean isCameraDeviceSetupSupported(java.lang.String arg0) throws android.hardware.camera2.CameraAccessException {
        return ((android.hardware.camera2.CameraManager) real).isCameraDeviceSetupSupported(arg0);
    }

    public void openCamera(java.lang.String arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice.StateCallback arg2) throws android.hardware.camera2.CameraAccessException {
        ((android.hardware.camera2.CameraManager) real).openCamera(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void openCamera(java.lang.String arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice.StateCallback arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) throws android.hardware.camera2.CameraAccessException {
        ((android.hardware.camera2.CameraManager) real).openCamera(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void registerAvailabilityCallback(com.micklab.dcg.wrapper.android.hardware.camera2.CameraManager.AvailabilityCallback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.hardware.camera2.CameraManager) real).registerAvailabilityCallback(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void registerAvailabilityCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CameraManager.AvailabilityCallback arg1) {
        ((android.hardware.camera2.CameraManager) real).registerAvailabilityCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void registerTorchCallback(com.micklab.dcg.wrapper.android.hardware.camera2.CameraManager.TorchCallback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.hardware.camera2.CameraManager) real).registerTorchCallback(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void registerTorchCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CameraManager.TorchCallback arg1) {
        ((android.hardware.camera2.CameraManager) real).registerTorchCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setTorchMode(java.lang.String arg0, boolean arg1) throws android.hardware.camera2.CameraAccessException {
        ((android.hardware.camera2.CameraManager) real).setTorchMode(arg0, arg1);
    }

    public void turnOnTorchWithStrengthLevel(java.lang.String arg0, int arg1) throws android.hardware.camera2.CameraAccessException {
        ((android.hardware.camera2.CameraManager) real).turnOnTorchWithStrengthLevel(arg0, arg1);
    }

    public void unregisterAvailabilityCallback(com.micklab.dcg.wrapper.android.hardware.camera2.CameraManager.AvailabilityCallback arg0) {
        ((android.hardware.camera2.CameraManager) real).unregisterAvailabilityCallback(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterTorchCallback(com.micklab.dcg.wrapper.android.hardware.camera2.CameraManager.TorchCallback arg0) {
        ((android.hardware.camera2.CameraManager) real).unregisterTorchCallback(arg0 == null ? null : arg0.getReal());
    }

    public static final class AvailabilityCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AvailabilityCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraManager.AvailabilityCallback wrap(android.hardware.camera2.CameraManager.AvailabilityCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraManager.AvailabilityCallback(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.camera2.CameraManager.AvailabilityCallback getReal() {
            return (android.hardware.camera2.CameraManager.AvailabilityCallback) real;
        }

        public android.hardware.camera2.CameraManager.AvailabilityCallback unwrap() {
            return getReal();
        }

        public void onCameraAccessPrioritiesChanged() {
            ((android.hardware.camera2.CameraManager.AvailabilityCallback) real).onCameraAccessPrioritiesChanged();
        }

        public void onCameraAvailable(java.lang.String arg0) {
            ((android.hardware.camera2.CameraManager.AvailabilityCallback) real).onCameraAvailable(arg0);
        }

        public void onCameraUnavailable(java.lang.String arg0) {
            ((android.hardware.camera2.CameraManager.AvailabilityCallback) real).onCameraUnavailable(arg0);
        }

        public void onPhysicalCameraAvailable(java.lang.String arg0, java.lang.String arg1) {
            ((android.hardware.camera2.CameraManager.AvailabilityCallback) real).onPhysicalCameraAvailable(arg0, arg1);
        }

        public void onPhysicalCameraUnavailable(java.lang.String arg0, java.lang.String arg1) {
            ((android.hardware.camera2.CameraManager.AvailabilityCallback) real).onPhysicalCameraUnavailable(arg0, arg1);
        }

    }
    public static final class TorchCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TorchCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraManager.TorchCallback wrap(android.hardware.camera2.CameraManager.TorchCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraManager.TorchCallback(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.camera2.CameraManager.TorchCallback getReal() {
            return (android.hardware.camera2.CameraManager.TorchCallback) real;
        }

        public android.hardware.camera2.CameraManager.TorchCallback unwrap() {
            return getReal();
        }

        public void onTorchModeChanged(java.lang.String arg0, boolean arg1) {
            ((android.hardware.camera2.CameraManager.TorchCallback) real).onTorchModeChanged(arg0, arg1);
        }

        public void onTorchModeUnavailable(java.lang.String arg0) {
            ((android.hardware.camera2.CameraManager.TorchCallback) real).onTorchModeUnavailable(arg0);
        }

        public void onTorchStrengthLevelChanged(java.lang.String arg0, int arg1) {
            ((android.hardware.camera2.CameraManager.TorchCallback) real).onTorchStrengthLevelChanged(arg0, arg1);
        }

    }
}
