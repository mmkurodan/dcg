// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2;

public final class CameraOfflineSession {
    private final android.hardware.camera2.CameraOfflineSession real;

    public CameraOfflineSession(android.hardware.camera2.CameraOfflineSession real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraOfflineSession wrap(android.hardware.camera2.CameraOfflineSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraOfflineSession(real);
    }

    public android.hardware.camera2.CameraOfflineSession unwrap() {
        return real;
    }

    public void close() {
        real.close();
    }

    public static final class CameraOfflineSessionCallback {
        private final android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback real;

        public CameraOfflineSessionCallback(android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback wrap(android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback(real);
        }

        public android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback unwrap() {
            return real;
        }

        public void onClosed(com.micklab.dcg.wrapper.android.hardware.camera2.CameraOfflineSession arg0) {
            real.onClosed(arg0 == null ? null : arg0.unwrap());
        }

        public void onError(com.micklab.dcg.wrapper.android.hardware.camera2.CameraOfflineSession arg0, int arg1) {
            real.onError(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void onIdle(com.micklab.dcg.wrapper.android.hardware.camera2.CameraOfflineSession arg0) {
            real.onIdle(arg0 == null ? null : arg0.unwrap());
        }

        public void onReady(com.micklab.dcg.wrapper.android.hardware.camera2.CameraOfflineSession arg0) {
            real.onReady(arg0 == null ? null : arg0.unwrap());
        }

        public void onSwitchFailed(com.micklab.dcg.wrapper.android.hardware.camera2.CameraOfflineSession arg0) {
            real.onSwitchFailed(arg0 == null ? null : arg0.unwrap());
        }

        public static final int STATUS_INTERNAL_ERROR = android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback.STATUS_INTERNAL_ERROR;

    }
}
