// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi.rtt;

public final class WifiRttManager {
    private final android.net.wifi.rtt.WifiRttManager real;

    public WifiRttManager(android.net.wifi.rtt.WifiRttManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.rtt.WifiRttManager wrap(android.net.wifi.rtt.WifiRttManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.rtt.WifiRttManager(real);
    }

    public android.net.wifi.rtt.WifiRttManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getRttCharacteristics() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.rtt.WifiRttManager#getRttCharacteristics()");
    }

    public boolean isAvailable() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.rtt.WifiRttManager#isAvailable()");
    }

    public void startRanging(com.micklab.dcg.wrapper.android.net.wifi.rtt.RangingRequest arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.net.wifi.rtt.RangingResultCallback arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.rtt.WifiRttManager#startRanging(android.net.wifi.rtt.RangingRequest,java.util.concurrent.Executor,android.net.wifi.rtt.RangingResultCallback)");
    }


}
