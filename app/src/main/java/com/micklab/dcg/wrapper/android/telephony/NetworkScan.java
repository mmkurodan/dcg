// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class NetworkScan {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NetworkScan(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.NetworkScan wrap(android.telephony.NetworkScan real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.NetworkScan(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.NetworkScan getReal() {
        return (android.telephony.NetworkScan) real;
    }

    public android.telephony.NetworkScan unwrap() {
        return getReal();
    }

    public void stopScan() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.NetworkScan#stopScan()");
    }


}
