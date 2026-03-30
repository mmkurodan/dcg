// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class TelephonyScanManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TelephonyScanManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.TelephonyScanManager wrap(android.telephony.TelephonyScanManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.TelephonyScanManager(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.TelephonyScanManager getReal() {
        return (android.telephony.TelephonyScanManager) real;
    }

    public android.telephony.TelephonyScanManager unwrap() {
        return getReal();
    }

    public TelephonyScanManager() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyScanManager#android.telephony.TelephonyScanManager()");
    }

    public static final class NetworkScanCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private NetworkScanCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.TelephonyScanManager.NetworkScanCallback wrap(android.telephony.TelephonyScanManager.NetworkScanCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.TelephonyScanManager.NetworkScanCallback(real, (__DcgwBridgeToken) null);
        }

        public android.telephony.TelephonyScanManager.NetworkScanCallback getReal() {
            return (android.telephony.TelephonyScanManager.NetworkScanCallback) real;
        }

        public android.telephony.TelephonyScanManager.NetworkScanCallback unwrap() {
            return getReal();
        }

        public void onComplete() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyScanManager$NetworkScanCallback#onComplete()");
        }

        public void onError(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyScanManager$NetworkScanCallback#onError(int)");
        }

    }
}
