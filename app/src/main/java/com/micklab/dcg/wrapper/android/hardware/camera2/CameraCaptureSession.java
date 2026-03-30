// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class CameraCaptureSession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CameraCaptureSession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession wrap(android.hardware.camera2.CameraCaptureSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.CameraCaptureSession getReal() {
        return (android.hardware.camera2.CameraCaptureSession) real;
    }

    public android.hardware.camera2.CameraCaptureSession unwrap() {
        return getReal();
    }

    public void abortCaptures() throws android.hardware.camera2.CameraAccessException {
        ((android.hardware.camera2.CameraCaptureSession) real).abortCaptures();
    }

    public int capture(com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession.CaptureCallback arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) throws android.hardware.camera2.CameraAccessException {
        return ((android.hardware.camera2.CameraCaptureSession) real).capture(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public int captureSingleRequest(com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession.CaptureCallback arg2) throws android.hardware.camera2.CameraAccessException {
        return ((android.hardware.camera2.CameraCaptureSession) real).captureSingleRequest(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void close() {
        ((android.hardware.camera2.CameraCaptureSession) real).close();
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice getDevice() {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice.wrap(((android.hardware.camera2.CameraCaptureSession) real).getDevice());
    }

    public com.micklab.dcg.wrapper.android.view.Surface getInputSurface() {
        return com.micklab.dcg.wrapper.android.view.Surface.wrap(((android.hardware.camera2.CameraCaptureSession) real).getInputSurface());
    }

    public boolean isReprocessable() {
        return ((android.hardware.camera2.CameraCaptureSession) real).isReprocessable();
    }

    public void prepare(com.micklab.dcg.wrapper.android.view.Surface arg0) throws android.hardware.camera2.CameraAccessException {
        ((android.hardware.camera2.CameraCaptureSession) real).prepare(arg0 == null ? null : arg0.getReal());
    }

    public int setRepeatingRequest(com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession.CaptureCallback arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) throws android.hardware.camera2.CameraAccessException {
        return ((android.hardware.camera2.CameraCaptureSession) real).setRepeatingRequest(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public int setSingleRepeatingRequest(com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession.CaptureCallback arg2) throws android.hardware.camera2.CameraAccessException {
        return ((android.hardware.camera2.CameraCaptureSession) real).setSingleRepeatingRequest(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void stopRepeating() throws android.hardware.camera2.CameraAccessException {
        ((android.hardware.camera2.CameraCaptureSession) real).stopRepeating();
    }

    public boolean supportsOfflineProcessing(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        return ((android.hardware.camera2.CameraCaptureSession) real).supportsOfflineProcessing(arg0 == null ? null : arg0.getReal());
    }

    public void updateOutputConfiguration(com.micklab.dcg.wrapper.android.hardware.camera2.params.OutputConfiguration arg0) throws android.hardware.camera2.CameraAccessException {
        ((android.hardware.camera2.CameraCaptureSession) real).updateOutputConfiguration(arg0 == null ? null : arg0.getReal());
    }

    public static final class CaptureCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CaptureCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession.CaptureCallback wrap(android.hardware.camera2.CameraCaptureSession.CaptureCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession.CaptureCallback(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.camera2.CameraCaptureSession.CaptureCallback getReal() {
            return (android.hardware.camera2.CameraCaptureSession.CaptureCallback) real;
        }

        public android.hardware.camera2.CameraCaptureSession.CaptureCallback unwrap() {
            return getReal();
        }

        public void onCaptureBufferLost(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg1, com.micklab.dcg.wrapper.android.view.Surface arg2, long arg3) {
            ((android.hardware.camera2.CameraCaptureSession.CaptureCallback) real).onCaptureBufferLost(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3);
        }

        public void onCaptureCompleted(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg1, com.micklab.dcg.wrapper.android.hardware.camera2.TotalCaptureResult arg2) {
            ((android.hardware.camera2.CameraCaptureSession.CaptureCallback) real).onCaptureCompleted(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
        }

        public void onCaptureFailed(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg1, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureFailure arg2) {
            ((android.hardware.camera2.CameraCaptureSession.CaptureCallback) real).onCaptureFailed(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
        }

        public void onCaptureProgressed(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg1, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureResult arg2) {
            ((android.hardware.camera2.CameraCaptureSession.CaptureCallback) real).onCaptureProgressed(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
        }

        public void onCaptureSequenceAborted(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0, int arg1) {
            ((android.hardware.camera2.CameraCaptureSession.CaptureCallback) real).onCaptureSequenceAborted(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onCaptureSequenceCompleted(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0, int arg1, long arg2) {
            ((android.hardware.camera2.CameraCaptureSession.CaptureCallback) real).onCaptureSequenceCompleted(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public void onCaptureStarted(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg1, long arg2, long arg3) {
            ((android.hardware.camera2.CameraCaptureSession.CaptureCallback) real).onCaptureStarted(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
        }

        public void onReadoutStarted(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg1, long arg2, long arg3) {
            ((android.hardware.camera2.CameraCaptureSession.CaptureCallback) real).onReadoutStarted(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
        }

    }
    public static final class StateCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private StateCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession.StateCallback wrap(android.hardware.camera2.CameraCaptureSession.StateCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession.StateCallback(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.camera2.CameraCaptureSession.StateCallback getReal() {
            return (android.hardware.camera2.CameraCaptureSession.StateCallback) real;
        }

        public android.hardware.camera2.CameraCaptureSession.StateCallback unwrap() {
            return getReal();
        }

        public void onActive(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0) {
            ((android.hardware.camera2.CameraCaptureSession.StateCallback) real).onActive(arg0 == null ? null : arg0.getReal());
        }

        public void onCaptureQueueEmpty(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0) {
            ((android.hardware.camera2.CameraCaptureSession.StateCallback) real).onCaptureQueueEmpty(arg0 == null ? null : arg0.getReal());
        }

        public void onClosed(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0) {
            ((android.hardware.camera2.CameraCaptureSession.StateCallback) real).onClosed(arg0 == null ? null : arg0.getReal());
        }

        public void onConfigureFailed(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0) {
            ((android.hardware.camera2.CameraCaptureSession.StateCallback) real).onConfigureFailed(arg0 == null ? null : arg0.getReal());
        }

        public void onConfigured(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0) {
            ((android.hardware.camera2.CameraCaptureSession.StateCallback) real).onConfigured(arg0 == null ? null : arg0.getReal());
        }

        public void onReady(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0) {
            ((android.hardware.camera2.CameraCaptureSession.StateCallback) real).onReady(arg0 == null ? null : arg0.getReal());
        }

        public void onSurfacePrepared(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0, com.micklab.dcg.wrapper.android.view.Surface arg1) {
            ((android.hardware.camera2.CameraCaptureSession.StateCallback) real).onSurfacePrepared(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
}
