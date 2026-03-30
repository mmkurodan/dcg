// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class BugreportManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BugreportManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.BugreportManager wrap(android.os.BugreportManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.BugreportManager(real, (__DcgwBridgeToken) null);
    }

    public android.os.BugreportManager getReal() {
        return (android.os.BugreportManager) real;
    }

    public android.os.BugreportManager unwrap() {
        return getReal();
    }

    public void cancelBugreport() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.BugreportManager#cancelBugreport()");
    }

    public void startConnectivityBugreport(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.os.BugreportManager.BugreportCallback arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.BugreportManager#startConnectivityBugreport(android.os.ParcelFileDescriptor,java.util.concurrent.Executor,android.os.BugreportManager$BugreportCallback)");
    }

    public static final class BugreportCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private BugreportCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.BugreportManager.BugreportCallback wrap(android.os.BugreportManager.BugreportCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.BugreportManager.BugreportCallback(real, (__DcgwBridgeToken) null);
        }

        public android.os.BugreportManager.BugreportCallback getReal() {
            return (android.os.BugreportManager.BugreportCallback) real;
        }

        public android.os.BugreportManager.BugreportCallback unwrap() {
            return getReal();
        }

        public void onEarlyReportFinished() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.BugreportManager$BugreportCallback#onEarlyReportFinished()");
        }

        public void onError(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.BugreportManager$BugreportCallback#onError(int)");
        }

        public void onFinished() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.BugreportManager$BugreportCallback#onFinished()");
        }

        public void onProgress(float arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.BugreportManager$BugreportCallback#onProgress(float)");
        }


    }
}
