// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi.aware;

public final class PublishDiscoverySession {
    private final android.net.wifi.aware.PublishDiscoverySession real;

    public PublishDiscoverySession(android.net.wifi.aware.PublishDiscoverySession real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.aware.PublishDiscoverySession wrap(android.net.wifi.aware.PublishDiscoverySession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.aware.PublishDiscoverySession(real);
    }

    public android.net.wifi.aware.PublishDiscoverySession unwrap() {
        return real;
    }

    public void updatePublish(com.micklab.dcg.wrapper.android.net.wifi.aware.PublishConfig arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.PublishDiscoverySession#updatePublish(android.net.wifi.aware.PublishConfig)");
    }

}
