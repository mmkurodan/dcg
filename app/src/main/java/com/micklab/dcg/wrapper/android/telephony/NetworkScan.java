// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class NetworkScan {
    private final android.telephony.NetworkScan real;

    public NetworkScan(android.telephony.NetworkScan real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.NetworkScan wrap(android.telephony.NetworkScan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.NetworkScan(real);
    }

    public android.telephony.NetworkScan unwrap() {
        return real;
    }

    public void stopScan() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.NetworkScan#stopScan()");
    }


}
