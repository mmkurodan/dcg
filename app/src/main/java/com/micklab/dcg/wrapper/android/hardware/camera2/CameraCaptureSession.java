// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class CameraCaptureSession {
    private final android.hardware.camera2.CameraCaptureSession real;

    public CameraCaptureSession(android.hardware.camera2.CameraCaptureSession real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession wrap(android.hardware.camera2.CameraCaptureSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession(real);
    }

    public android.hardware.camera2.CameraCaptureSession unwrap() {
        return real;
    }

    public void abortCaptures() throws android.hardware.camera2.CameraAccessException {
        real.abortCaptures();
    }

    public int capture(com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession.CaptureCallback arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) throws android.hardware.camera2.CameraAccessException {
        return real.capture(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public int captureSingleRequest(com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession.CaptureCallback arg2) throws android.hardware.camera2.CameraAccessException {
        return real.captureSingleRequest(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void close() {
        real.close();
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice getDevice() {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice.wrap(real.getDevice());
    }

    public com.micklab.dcg.wrapper.android.view.Surface getInputSurface() {
        return com.micklab.dcg.wrapper.android.view.Surface.wrap(real.getInputSurface());
    }

    public boolean isReprocessable() {
        return real.isReprocessable();
    }

    public void prepare(com.micklab.dcg.wrapper.android.view.Surface arg0) throws android.hardware.camera2.CameraAccessException {
        real.prepare(arg0 == null ? null : arg0.unwrap());
    }

    public int setRepeatingRequest(com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession.CaptureCallback arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) throws android.hardware.camera2.CameraAccessException {
        return real.setRepeatingRequest(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public int setSingleRepeatingRequest(com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession.CaptureCallback arg2) throws android.hardware.camera2.CameraAccessException {
        return real.setSingleRepeatingRequest(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void stopRepeating() throws android.hardware.camera2.CameraAccessException {
        real.stopRepeating();
    }

    public boolean supportsOfflineProcessing(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        return real.supportsOfflineProcessing(arg0 == null ? null : arg0.unwrap());
    }

    public void updateOutputConfiguration(com.micklab.dcg.wrapper.android.hardware.camera2.params.OutputConfiguration arg0) throws android.hardware.camera2.CameraAccessException {
        real.updateOutputConfiguration(arg0 == null ? null : arg0.unwrap());
    }

    public static final class CaptureCallback {
        private final android.hardware.camera2.CameraCaptureSession.CaptureCallback real;

        public CaptureCallback(android.hardware.camera2.CameraCaptureSession.CaptureCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession.CaptureCallback wrap(android.hardware.camera2.CameraCaptureSession.CaptureCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession.CaptureCallback(real);
        }

        public android.hardware.camera2.CameraCaptureSession.CaptureCallback unwrap() {
            return real;
        }

        public void onCaptureBufferLost(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg1, com.micklab.dcg.wrapper.android.view.Surface arg2, long arg3) {
            real.onCaptureBufferLost(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3);
        }

        public void onCaptureCompleted(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg1, com.micklab.dcg.wrapper.android.hardware.camera2.TotalCaptureResult arg2) {
            real.onCaptureCompleted(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
        }

        public void onCaptureFailed(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg1, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureFailure arg2) {
            real.onCaptureFailed(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
        }

        public void onCaptureProgressed(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg1, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureResult arg2) {
            real.onCaptureProgressed(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
        }

        public void onCaptureSequenceAborted(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0, int arg1) {
            real.onCaptureSequenceAborted(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void onCaptureSequenceCompleted(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0, int arg1, long arg2) {
            real.onCaptureSequenceCompleted(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

        public void onCaptureStarted(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg1, long arg2, long arg3) {
            real.onCaptureStarted(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
        }

        public void onReadoutStarted(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg1, long arg2, long arg3) {
            real.onReadoutStarted(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
        }

    }
    public static final class StateCallback {
        private final android.hardware.camera2.CameraCaptureSession.StateCallback real;

        public StateCallback(android.hardware.camera2.CameraCaptureSession.StateCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession.StateCallback wrap(android.hardware.camera2.CameraCaptureSession.StateCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession.StateCallback(real);
        }

        public android.hardware.camera2.CameraCaptureSession.StateCallback unwrap() {
            return real;
        }

        public void onActive(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0) {
            real.onActive(arg0 == null ? null : arg0.unwrap());
        }

        public void onCaptureQueueEmpty(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0) {
            real.onCaptureQueueEmpty(arg0 == null ? null : arg0.unwrap());
        }

        public void onClosed(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0) {
            real.onClosed(arg0 == null ? null : arg0.unwrap());
        }

        public void onConfigureFailed(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0) {
            real.onConfigureFailed(arg0 == null ? null : arg0.unwrap());
        }

        public void onConfigured(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0) {
            real.onConfigured(arg0 == null ? null : arg0.unwrap());
        }

        public void onReady(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0) {
            real.onReady(arg0 == null ? null : arg0.unwrap());
        }

        public void onSurfacePrepared(com.micklab.dcg.wrapper.android.hardware.camera2.CameraCaptureSession arg0, com.micklab.dcg.wrapper.android.view.Surface arg1) {
            real.onSurfacePrepared(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
}
