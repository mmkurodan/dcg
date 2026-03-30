// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi.aware;

public final class SubscribeDiscoverySession {
    private final android.net.wifi.aware.SubscribeDiscoverySession real;

    public SubscribeDiscoverySession(android.net.wifi.aware.SubscribeDiscoverySession real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.aware.SubscribeDiscoverySession wrap(android.net.wifi.aware.SubscribeDiscoverySession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.aware.SubscribeDiscoverySession(real);
    }

    public android.net.wifi.aware.SubscribeDiscoverySession unwrap() {
        return real;
    }

    public void updateSubscribe(com.micklab.dcg.wrapper.android.net.wifi.aware.SubscribeConfig arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.SubscribeDiscoverySession#updateSubscribe(android.net.wifi.aware.SubscribeConfig)");
    }

}
