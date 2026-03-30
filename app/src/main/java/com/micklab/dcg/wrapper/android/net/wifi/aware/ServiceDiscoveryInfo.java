// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi.aware;

public final class ServiceDiscoveryInfo {
    private final android.net.wifi.aware.ServiceDiscoveryInfo real;

    public ServiceDiscoveryInfo(android.net.wifi.aware.ServiceDiscoveryInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.aware.ServiceDiscoveryInfo wrap(android.net.wifi.aware.ServiceDiscoveryInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.aware.ServiceDiscoveryInfo(real);
    }

    public android.net.wifi.aware.ServiceDiscoveryInfo unwrap() {
        return real;
    }

    public java.lang.String getPairedAlias() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.ServiceDiscoveryInfo#getPairedAlias()");
    }

    public com.micklab.dcg.wrapper.android.net.wifi.aware.AwarePairingConfig getPairingConfig() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.ServiceDiscoveryInfo#getPairingConfig()");
    }

    public int getPeerCipherSuite() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.ServiceDiscoveryInfo#getPeerCipherSuite()");
    }

    public com.micklab.dcg.wrapper.android.net.wifi.aware.PeerHandle getPeerHandle() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.ServiceDiscoveryInfo#getPeerHandle()");
    }

    public byte[] getScid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.ServiceDiscoveryInfo#getScid()");
    }

    public byte[] getServiceSpecificInfo() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.ServiceDiscoveryInfo#getServiceSpecificInfo()");
    }

}
