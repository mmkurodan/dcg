// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi.aware;

public final class WifiAwareSession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WifiAwareSession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.aware.WifiAwareSession wrap(android.net.wifi.aware.WifiAwareSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.aware.WifiAwareSession(real, (__DcgwBridgeToken) null);
    }

    public android.net.wifi.aware.WifiAwareSession getReal() {
        return (android.net.wifi.aware.WifiAwareSession) real;
    }

    public android.net.wifi.aware.WifiAwareSession unwrap() {
        return getReal();
    }

    public void close() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareSession#close()");
    }

    public com.micklab.dcg.wrapper.android.net.NetworkSpecifier createNetworkSpecifierOpen(int arg0, byte[] arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareSession#createNetworkSpecifierOpen(int,[B)");
    }

    public com.micklab.dcg.wrapper.android.net.NetworkSpecifier createNetworkSpecifierPassphrase(int arg0, byte[] arg1, java.lang.String arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareSession#createNetworkSpecifierPassphrase(int,[B,java.lang.String)");
    }

    public void publish(com.micklab.dcg.wrapper.android.net.wifi.aware.PublishConfig arg0, com.micklab.dcg.wrapper.android.net.wifi.aware.DiscoverySessionCallback arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareSession#publish(android.net.wifi.aware.PublishConfig,android.net.wifi.aware.DiscoverySessionCallback,android.os.Handler)");
    }

    public void subscribe(com.micklab.dcg.wrapper.android.net.wifi.aware.SubscribeConfig arg0, com.micklab.dcg.wrapper.android.net.wifi.aware.DiscoverySessionCallback arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.WifiAwareSession#subscribe(android.net.wifi.aware.SubscribeConfig,android.net.wifi.aware.DiscoverySessionCallback,android.os.Handler)");
    }

}
