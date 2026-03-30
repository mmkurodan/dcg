// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi.aware;

public final class PublishDiscoverySession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PublishDiscoverySession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.aware.PublishDiscoverySession wrap(android.net.wifi.aware.PublishDiscoverySession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.aware.PublishDiscoverySession(real, (__DcgwBridgeToken) null);
    }

    public android.net.wifi.aware.PublishDiscoverySession getReal() {
        return (android.net.wifi.aware.PublishDiscoverySession) real;
    }

    public android.net.wifi.aware.PublishDiscoverySession unwrap() {
        return getReal();
    }

    public void updatePublish(com.micklab.dcg.wrapper.android.net.wifi.aware.PublishConfig arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.PublishDiscoverySession#updatePublish(android.net.wifi.aware.PublishConfig)");
    }

}
