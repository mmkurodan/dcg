// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.vcn;

public final class VcnManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VcnManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.vcn.VcnManager wrap(android.net.vcn.VcnManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.vcn.VcnManager(real, (__DcgwBridgeToken) null);
    }

    public android.net.vcn.VcnManager getReal() {
        return (android.net.vcn.VcnManager) real;
    }

    public android.net.vcn.VcnManager unwrap() {
        return getReal();
    }

    public void clearVcnConfig(com.micklab.dcg.wrapper.android.os.ParcelUuid arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.vcn.VcnManager#clearVcnConfig(android.os.ParcelUuid)");
    }

    public void registerVcnStatusCallback(com.micklab.dcg.wrapper.android.os.ParcelUuid arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.net.vcn.VcnManager.VcnStatusCallback arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.vcn.VcnManager#registerVcnStatusCallback(android.os.ParcelUuid,java.util.concurrent.Executor,android.net.vcn.VcnManager$VcnStatusCallback)");
    }

    public void setVcnConfig(com.micklab.dcg.wrapper.android.os.ParcelUuid arg0, com.micklab.dcg.wrapper.android.net.vcn.VcnConfig arg1) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.vcn.VcnManager#setVcnConfig(android.os.ParcelUuid,android.net.vcn.VcnConfig)");
    }

    public void unregisterVcnStatusCallback(com.micklab.dcg.wrapper.android.net.vcn.VcnManager.VcnStatusCallback arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.vcn.VcnManager#unregisterVcnStatusCallback(android.net.vcn.VcnManager$VcnStatusCallback)");
    }


    public static final class VcnStatusCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private VcnStatusCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.net.vcn.VcnManager.VcnStatusCallback wrap(android.net.vcn.VcnManager.VcnStatusCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.net.vcn.VcnManager.VcnStatusCallback(real, (__DcgwBridgeToken) null);
        }

        public android.net.vcn.VcnManager.VcnStatusCallback getReal() {
            return (android.net.vcn.VcnManager.VcnStatusCallback) real;
        }

        public android.net.vcn.VcnManager.VcnStatusCallback unwrap() {
            return getReal();
        }

        public void onGatewayConnectionError(java.lang.String arg0, int arg1, java.lang.Throwable arg2) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.vcn.VcnManager$VcnStatusCallback#onGatewayConnectionError(java.lang.String,int,java.lang.Throwable)");
        }

        public void onStatusChanged(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.vcn.VcnManager$VcnStatusCallback#onStatusChanged(int)");
        }

    }
}
