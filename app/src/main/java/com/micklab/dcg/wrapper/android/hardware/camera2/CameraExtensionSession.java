// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class CameraExtensionSession {
    private final android.hardware.camera2.CameraExtensionSession real;

    public CameraExtensionSession(android.hardware.camera2.CameraExtensionSession real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession wrap(android.hardware.camera2.CameraExtensionSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession(real);
    }

    public android.hardware.camera2.CameraExtensionSession unwrap() {
        return real;
    }

    public int capture(com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback arg2) throws android.hardware.camera2.CameraAccessException {
        return real.capture(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void close() throws android.hardware.camera2.CameraAccessException {
        real.close();
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice getDevice() {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice.wrap(real.getDevice());
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.StillCaptureLatency getRealtimeStillCaptureLatency() throws android.hardware.camera2.CameraAccessException {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.StillCaptureLatency.wrap(real.getRealtimeStillCaptureLatency());
    }

    public int setRepeatingRequest(com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback arg2) throws android.hardware.camera2.CameraAccessException {
        return real.setRepeatingRequest(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void stopRepeating() throws android.hardware.camera2.CameraAccessException {
        real.stopRepeating();
    }

    public static final class ExtensionCaptureCallback {
        private final android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback real;

        public ExtensionCaptureCallback(android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback wrap(android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback(real);
        }

        public android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback unwrap() {
            return real;
        }

        public void onCaptureFailed(com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg1) {
            real.onCaptureFailed(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onCaptureFailed(com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg1, int arg2) {
            real.onCaptureFailed(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
        }

        public void onCaptureProcessProgressed(com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg1, int arg2) {
            real.onCaptureProcessProgressed(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
        }

        public void onCaptureProcessStarted(com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg1) {
            real.onCaptureProcessStarted(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onCaptureResultAvailable(com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg1, com.micklab.dcg.wrapper.android.hardware.camera2.TotalCaptureResult arg2) {
            real.onCaptureResultAvailable(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
        }

        public void onCaptureSequenceAborted(com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession arg0, int arg1) {
            real.onCaptureSequenceAborted(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void onCaptureSequenceCompleted(com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession arg0, int arg1) {
            real.onCaptureSequenceCompleted(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void onCaptureStarted(com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg1, long arg2) {
            real.onCaptureStarted(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
        }

    }
    public static final class StateCallback {
        private final android.hardware.camera2.CameraExtensionSession.StateCallback real;

        public StateCallback(android.hardware.camera2.CameraExtensionSession.StateCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.StateCallback wrap(android.hardware.camera2.CameraExtensionSession.StateCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.StateCallback(real);
        }

        public android.hardware.camera2.CameraExtensionSession.StateCallback unwrap() {
            return real;
        }

        public void onClosed(com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession arg0) {
            real.onClosed(arg0 == null ? null : arg0.unwrap());
        }

        public void onConfigureFailed(com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession arg0) {
            real.onConfigureFailed(arg0 == null ? null : arg0.unwrap());
        }

        public void onConfigured(com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession arg0) {
            real.onConfigured(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class StillCaptureLatency {
        private final android.hardware.camera2.CameraExtensionSession.StillCaptureLatency real;

        public StillCaptureLatency(android.hardware.camera2.CameraExtensionSession.StillCaptureLatency real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.StillCaptureLatency wrap(android.hardware.camera2.CameraExtensionSession.StillCaptureLatency real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.StillCaptureLatency(real);
        }

        public android.hardware.camera2.CameraExtensionSession.StillCaptureLatency unwrap() {
            return real;
        }

        public StillCaptureLatency(long arg0, long arg1) {
            this(new android.hardware.camera2.CameraExtensionSession.StillCaptureLatency(arg0, arg1));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public long getCaptureLatency() {
            return real.getCaptureLatency();
        }

        public long getProcessingLatency() {
            return real.getProcessingLatency();
        }

        public int hashCode() {
            return real.hashCode();
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
}
