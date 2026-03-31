// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging;

public final class RangingSession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RangingSession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.RangingSession wrap(android.ranging.RangingSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.RangingSession(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.RangingSession getReal() {
        return (android.ranging.RangingSession) real;
    }

    public android.ranging.RangingSession unwrap() {
        return getReal();
    }

    public void addDeviceToRangingSession(com.micklab.dcg.wrapper.android.ranging.RangingConfig arg0) {
        ((android.ranging.RangingSession) real).addDeviceToRangingSession(arg0 == null ? null : arg0.getReal());
    }

    public void close() {
        ((android.ranging.RangingSession) real).close();
    }

    public void reconfigureRangingInterval(int arg0) {
        ((android.ranging.RangingSession) real).reconfigureRangingInterval(arg0);
    }

    public void removeDeviceFromRangingSession(com.micklab.dcg.wrapper.android.ranging.RangingDevice arg0) {
        ((android.ranging.RangingSession) real).removeDeviceFromRangingSession(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.os.CancellationSignal start(com.micklab.dcg.wrapper.android.ranging.RangingPreference arg0) {
        return com.micklab.dcg.wrapper.android.os.CancellationSignal.wrap(((android.ranging.RangingSession) real).start(arg0 == null ? null : arg0.getReal()));
    }

    public void stop() {
        ((android.ranging.RangingSession) real).stop();
    }

    public java.lang.String toString() {
        return ((android.ranging.RangingSession) real).toString();
    }

    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.ranging.RangingSession.Callback wrap(android.ranging.RangingSession.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.RangingSession.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.ranging.RangingSession.Callback getReal() {
            return (android.ranging.RangingSession.Callback) real;
        }

        public android.ranging.RangingSession.Callback unwrap() {
            return getReal();
        }

        public void onClosed(int arg0) {
            ((android.ranging.RangingSession.Callback) real).onClosed(arg0);
        }

        public void onOpenFailed(int arg0) {
            ((android.ranging.RangingSession.Callback) real).onOpenFailed(arg0);
        }

        public void onOpened() {
            ((android.ranging.RangingSession.Callback) real).onOpened();
        }

        public void onResults(com.micklab.dcg.wrapper.android.ranging.RangingDevice arg0, com.micklab.dcg.wrapper.android.ranging.RangingData arg1) {
            ((android.ranging.RangingSession.Callback) real).onResults(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onStarted(com.micklab.dcg.wrapper.android.ranging.RangingDevice arg0, int arg1) {
            ((android.ranging.RangingSession.Callback) real).onStarted(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onStopped(com.micklab.dcg.wrapper.android.ranging.RangingDevice arg0, int arg1) {
            ((android.ranging.RangingSession.Callback) real).onStopped(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static final int REASON_LOCAL_REQUEST = android.ranging.RangingSession.Callback.REASON_LOCAL_REQUEST;
        public static final int REASON_NO_PEERS_FOUND = android.ranging.RangingSession.Callback.REASON_NO_PEERS_FOUND;
        public static final int REASON_REMOTE_REQUEST = android.ranging.RangingSession.Callback.REASON_REMOTE_REQUEST;
        public static final int REASON_SYSTEM_POLICY = android.ranging.RangingSession.Callback.REASON_SYSTEM_POLICY;
        public static final int REASON_UNKNOWN = android.ranging.RangingSession.Callback.REASON_UNKNOWN;
        public static final int REASON_UNSUPPORTED = android.ranging.RangingSession.Callback.REASON_UNSUPPORTED;

    }
}
