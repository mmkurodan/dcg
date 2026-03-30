// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi.rtt;

public final class RangingResultCallback {
    private final android.net.wifi.rtt.RangingResultCallback real;

    public RangingResultCallback(android.net.wifi.rtt.RangingResultCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.rtt.RangingResultCallback wrap(android.net.wifi.rtt.RangingResultCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.rtt.RangingResultCallback(real);
    }

    public android.net.wifi.rtt.RangingResultCallback unwrap() {
        return real;
    }

    public void onRangingFailure(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.rtt.RangingResultCallback#onRangingFailure(int)");
    }


}
