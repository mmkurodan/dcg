// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi.rtt;

public final class RangingResultCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RangingResultCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.rtt.RangingResultCallback wrap(android.net.wifi.rtt.RangingResultCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.rtt.RangingResultCallback(real, (__DcgwBridgeToken) null);
    }

    public android.net.wifi.rtt.RangingResultCallback getReal() {
        return (android.net.wifi.rtt.RangingResultCallback) real;
    }

    public android.net.wifi.rtt.RangingResultCallback unwrap() {
        return getReal();
    }

    public void onRangingFailure(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.rtt.RangingResultCallback#onRangingFailure(int)");
    }


}
