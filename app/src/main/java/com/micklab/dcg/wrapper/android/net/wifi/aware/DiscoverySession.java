// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi.aware;

public final class DiscoverySession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DiscoverySession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.aware.DiscoverySession wrap(android.net.wifi.aware.DiscoverySession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.aware.DiscoverySession(real, (__DcgwBridgeToken) null);
    }

    public android.net.wifi.aware.DiscoverySession getReal() {
        return (android.net.wifi.aware.DiscoverySession) real;
    }

    public android.net.wifi.aware.DiscoverySession unwrap() {
        return getReal();
    }

    public void acceptPairingRequest(int arg0, com.micklab.dcg.wrapper.android.net.wifi.aware.PeerHandle arg1, java.lang.String arg2, int arg3, java.lang.String arg4) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySession#acceptPairingRequest(int,android.net.wifi.aware.PeerHandle,java.lang.String,int,java.lang.String)");
    }

    public void close() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySession#close()");
    }

    public com.micklab.dcg.wrapper.android.net.NetworkSpecifier createNetworkSpecifierOpen(com.micklab.dcg.wrapper.android.net.wifi.aware.PeerHandle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySession#createNetworkSpecifierOpen(android.net.wifi.aware.PeerHandle)");
    }

    public com.micklab.dcg.wrapper.android.net.NetworkSpecifier createNetworkSpecifierPassphrase(com.micklab.dcg.wrapper.android.net.wifi.aware.PeerHandle arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySession#createNetworkSpecifierPassphrase(android.net.wifi.aware.PeerHandle,java.lang.String)");
    }

    public void initiateBootstrappingRequest(com.micklab.dcg.wrapper.android.net.wifi.aware.PeerHandle arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySession#initiateBootstrappingRequest(android.net.wifi.aware.PeerHandle,int)");
    }

    public void initiatePairingRequest(com.micklab.dcg.wrapper.android.net.wifi.aware.PeerHandle arg0, java.lang.String arg1, int arg2, java.lang.String arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySession#initiatePairingRequest(android.net.wifi.aware.PeerHandle,java.lang.String,int,java.lang.String)");
    }

    public void rejectPairingRequest(int arg0, com.micklab.dcg.wrapper.android.net.wifi.aware.PeerHandle arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySession#rejectPairingRequest(int,android.net.wifi.aware.PeerHandle)");
    }

    public void sendMessage(com.micklab.dcg.wrapper.android.net.wifi.aware.PeerHandle arg0, int arg1, byte[] arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySession#sendMessage(android.net.wifi.aware.PeerHandle,int,[B)");
    }

}
