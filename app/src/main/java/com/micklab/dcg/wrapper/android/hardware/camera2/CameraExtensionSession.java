// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class CameraExtensionSession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CameraExtensionSession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession wrap(android.hardware.camera2.CameraExtensionSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.CameraExtensionSession getReal() {
        return (android.hardware.camera2.CameraExtensionSession) real;
    }

    public android.hardware.camera2.CameraExtensionSession unwrap() {
        return getReal();
    }

    public int capture(com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback arg2) throws android.hardware.camera2.CameraAccessException {
        return ((android.hardware.camera2.CameraExtensionSession) real).capture(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void close() throws android.hardware.camera2.CameraAccessException {
        ((android.hardware.camera2.CameraExtensionSession) real).close();
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice getDevice() {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CameraDevice.wrap(((android.hardware.camera2.CameraExtensionSession) real).getDevice());
    }

    public com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.StillCaptureLatency getRealtimeStillCaptureLatency() throws android.hardware.camera2.CameraAccessException {
        return com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.StillCaptureLatency.wrap(((android.hardware.camera2.CameraExtensionSession) real).getRealtimeStillCaptureLatency());
    }

    public int setRepeatingRequest(com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback arg2) throws android.hardware.camera2.CameraAccessException {
        return ((android.hardware.camera2.CameraExtensionSession) real).setRepeatingRequest(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void stopRepeating() throws android.hardware.camera2.CameraAccessException {
        ((android.hardware.camera2.CameraExtensionSession) real).stopRepeating();
    }

    public static final class ExtensionCaptureCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ExtensionCaptureCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback wrap(android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback getReal() {
            return (android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback) real;
        }

        public android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback unwrap() {
            return getReal();
        }

        public void onCaptureFailed(com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg1) {
            ((android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback) real).onCaptureFailed(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onCaptureFailed(com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg1, int arg2) {
            ((android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback) real).onCaptureFailed(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
        }

        public void onCaptureProcessProgressed(com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg1, int arg2) {
            ((android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback) real).onCaptureProcessProgressed(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
        }

        public void onCaptureProcessStarted(com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg1) {
            ((android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback) real).onCaptureProcessStarted(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onCaptureResultAvailable(com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg1, com.micklab.dcg.wrapper.android.hardware.camera2.TotalCaptureResult arg2) {
            ((android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback) real).onCaptureResultAvailable(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
        }

        public void onCaptureSequenceAborted(com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession arg0, int arg1) {
            ((android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback) real).onCaptureSequenceAborted(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onCaptureSequenceCompleted(com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession arg0, int arg1) {
            ((android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback) real).onCaptureSequenceCompleted(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onCaptureStarted(com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession arg0, com.micklab.dcg.wrapper.android.hardware.camera2.CaptureRequest arg1, long arg2) {
            ((android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback) real).onCaptureStarted(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
        }

    }
    public static final class StateCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private StateCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.StateCallback wrap(android.hardware.camera2.CameraExtensionSession.StateCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.StateCallback(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.camera2.CameraExtensionSession.StateCallback getReal() {
            return (android.hardware.camera2.CameraExtensionSession.StateCallback) real;
        }

        public android.hardware.camera2.CameraExtensionSession.StateCallback unwrap() {
            return getReal();
        }

        public void onClosed(com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession arg0) {
            ((android.hardware.camera2.CameraExtensionSession.StateCallback) real).onClosed(arg0 == null ? null : arg0.getReal());
        }

        public void onConfigureFailed(com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession arg0) {
            ((android.hardware.camera2.CameraExtensionSession.StateCallback) real).onConfigureFailed(arg0 == null ? null : arg0.getReal());
        }

        public void onConfigured(com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession arg0) {
            ((android.hardware.camera2.CameraExtensionSession.StateCallback) real).onConfigured(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class StillCaptureLatency {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private StillCaptureLatency(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.StillCaptureLatency wrap(android.hardware.camera2.CameraExtensionSession.StillCaptureLatency real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraExtensionSession.StillCaptureLatency(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.camera2.CameraExtensionSession.StillCaptureLatency getReal() {
            return (android.hardware.camera2.CameraExtensionSession.StillCaptureLatency) real;
        }

        public android.hardware.camera2.CameraExtensionSession.StillCaptureLatency unwrap() {
            return getReal();
        }

        public StillCaptureLatency(long arg0, long arg1) {
            this(new android.hardware.camera2.CameraExtensionSession.StillCaptureLatency(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.hardware.camera2.CameraExtensionSession.StillCaptureLatency) real).equals(arg0);
        }

        public long getCaptureLatency() {
            return ((android.hardware.camera2.CameraExtensionSession.StillCaptureLatency) real).getCaptureLatency();
        }

        public long getProcessingLatency() {
            return ((android.hardware.camera2.CameraExtensionSession.StillCaptureLatency) real).getProcessingLatency();
        }

        public int hashCode() {
            return ((android.hardware.camera2.CameraExtensionSession.StillCaptureLatency) real).hashCode();
        }

        public java.lang.String toString() {
            return ((android.hardware.camera2.CameraExtensionSession.StillCaptureLatency) real).toString();
        }

    }
}
