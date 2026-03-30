// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi.aware;

public final class SubscribeDiscoverySession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SubscribeDiscoverySession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.aware.SubscribeDiscoverySession wrap(android.net.wifi.aware.SubscribeDiscoverySession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.aware.SubscribeDiscoverySession(real, (__DcgwBridgeToken) null);
    }

    public android.net.wifi.aware.SubscribeDiscoverySession getReal() {
        return (android.net.wifi.aware.SubscribeDiscoverySession) real;
    }

    public android.net.wifi.aware.SubscribeDiscoverySession unwrap() {
        return getReal();
    }

    public void updateSubscribe(com.micklab.dcg.wrapper.android.net.wifi.aware.SubscribeConfig arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.SubscribeDiscoverySession#updateSubscribe(android.net.wifi.aware.SubscribeConfig)");
    }

}
