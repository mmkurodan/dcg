// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class TelephonyScanManager {
    private final android.telephony.TelephonyScanManager real;

    public TelephonyScanManager(android.telephony.TelephonyScanManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.TelephonyScanManager wrap(android.telephony.TelephonyScanManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.TelephonyScanManager(real);
    }

    public android.telephony.TelephonyScanManager unwrap() {
        return real;
    }

    public TelephonyScanManager() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyScanManager#android.telephony.TelephonyScanManager()");
    }

    public static final class NetworkScanCallback {
        private final android.telephony.TelephonyScanManager.NetworkScanCallback real;

        public NetworkScanCallback(android.telephony.TelephonyScanManager.NetworkScanCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telephony.TelephonyScanManager.NetworkScanCallback wrap(android.telephony.TelephonyScanManager.NetworkScanCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.TelephonyScanManager.NetworkScanCallback(real);
        }

        public android.telephony.TelephonyScanManager.NetworkScanCallback unwrap() {
            return real;
        }

        public void onComplete() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyScanManager$NetworkScanCallback#onComplete()");
        }

        public void onError(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.TelephonyScanManager$NetworkScanCallback#onError(int)");
        }

    }
}
