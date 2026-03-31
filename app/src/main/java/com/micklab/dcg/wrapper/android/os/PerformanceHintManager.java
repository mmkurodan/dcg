// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class PerformanceHintManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PerformanceHintManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.PerformanceHintManager wrap(android.os.PerformanceHintManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.PerformanceHintManager(real, (__DcgwBridgeToken) null);
    }

    public android.os.PerformanceHintManager getReal() {
        return (android.os.PerformanceHintManager) real;
    }

    public android.os.PerformanceHintManager unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.PerformanceHintManager.Session createHintSession(int[] arg0, long arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PerformanceHintManager#createHintSession([I,long)");
    }

    public long getPreferredUpdateRateNanos() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PerformanceHintManager#getPreferredUpdateRateNanos()");
    }

    public static final class Session {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Session(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.PerformanceHintManager.Session wrap(android.os.PerformanceHintManager.Session real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.PerformanceHintManager.Session(real, (__DcgwBridgeToken) null);
        }

        public android.os.PerformanceHintManager.Session getReal() {
            return (android.os.PerformanceHintManager.Session) real;
        }

        public android.os.PerformanceHintManager.Session unwrap() {
            return getReal();
        }

        public void close() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PerformanceHintManager$Session#close()");
        }

        public void reportActualWorkDuration(long arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PerformanceHintManager$Session#reportActualWorkDuration(long)");
        }

        public void reportActualWorkDuration(com.micklab.dcg.wrapper.android.os.WorkDuration arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PerformanceHintManager$Session#reportActualWorkDuration(android.os.WorkDuration)");
        }

        public void setPreferPowerEfficiency(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PerformanceHintManager$Session#setPreferPowerEfficiency(boolean)");
        }

        public void setThreads(int[] arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PerformanceHintManager$Session#setThreads([I)");
        }

        public void updateTargetWorkDuration(long arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PerformanceHintManager$Session#updateTargetWorkDuration(long)");
        }

    }
}
