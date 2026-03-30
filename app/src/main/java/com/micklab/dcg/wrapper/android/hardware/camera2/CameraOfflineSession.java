// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class CameraOfflineSession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CameraOfflineSession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraOfflineSession wrap(android.hardware.camera2.CameraOfflineSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraOfflineSession(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.CameraOfflineSession getReal() {
        return (android.hardware.camera2.CameraOfflineSession) real;
    }

    public android.hardware.camera2.CameraOfflineSession unwrap() {
        return getReal();
    }

    public void close() {
        ((android.hardware.camera2.CameraOfflineSession) real).close();
    }

    public static final class CameraOfflineSessionCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CameraOfflineSessionCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback wrap(android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback getReal() {
            return (android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback) real;
        }

        public android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback unwrap() {
            return getReal();
        }

        public void onClosed(com.micklab.dcg.wrapper.android.hardware.camera2.CameraOfflineSession arg0) {
            ((android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback) real).onClosed(arg0 == null ? null : arg0.getReal());
        }

        public void onError(com.micklab.dcg.wrapper.android.hardware.camera2.CameraOfflineSession arg0, int arg1) {
            ((android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback) real).onError(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onIdle(com.micklab.dcg.wrapper.android.hardware.camera2.CameraOfflineSession arg0) {
            ((android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback) real).onIdle(arg0 == null ? null : arg0.getReal());
        }

        public void onReady(com.micklab.dcg.wrapper.android.hardware.camera2.CameraOfflineSession arg0) {
            ((android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback) real).onReady(arg0 == null ? null : arg0.getReal());
        }

        public void onSwitchFailed(com.micklab.dcg.wrapper.android.hardware.camera2.CameraOfflineSession arg0) {
            ((android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback) real).onSwitchFailed(arg0 == null ? null : arg0.getReal());
        }

        public static final int STATUS_INTERNAL_ERROR = android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback.STATUS_INTERNAL_ERROR;

    }
}
