// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi.aware;

public final class DiscoverySessionCallback {
    private final android.net.wifi.aware.DiscoverySessionCallback real;

    public DiscoverySessionCallback(android.net.wifi.aware.DiscoverySessionCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.aware.DiscoverySessionCallback wrap(android.net.wifi.aware.DiscoverySessionCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.aware.DiscoverySessionCallback(real);
    }

    public android.net.wifi.aware.DiscoverySessionCallback unwrap() {
        return real;
    }

    public DiscoverySessionCallback() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySessionCallback#android.net.wifi.aware.DiscoverySessionCallback()");
    }

    public void onBootstrappingFailed(com.micklab.dcg.wrapper.android.net.wifi.aware.PeerHandle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySessionCallback#onBootstrappingFailed(android.net.wifi.aware.PeerHandle)");
    }

    public void onBootstrappingSucceeded(com.micklab.dcg.wrapper.android.net.wifi.aware.PeerHandle arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySessionCallback#onBootstrappingSucceeded(android.net.wifi.aware.PeerHandle,int)");
    }

    public void onMessageReceived(com.micklab.dcg.wrapper.android.net.wifi.aware.PeerHandle arg0, byte[] arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySessionCallback#onMessageReceived(android.net.wifi.aware.PeerHandle,[B)");
    }

    public void onMessageSendFailed(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySessionCallback#onMessageSendFailed(int)");
    }

    public void onMessageSendSucceeded(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySessionCallback#onMessageSendSucceeded(int)");
    }

    public void onPairingSetupFailed(com.micklab.dcg.wrapper.android.net.wifi.aware.PeerHandle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySessionCallback#onPairingSetupFailed(android.net.wifi.aware.PeerHandle)");
    }

    public void onPairingSetupRequestReceived(com.micklab.dcg.wrapper.android.net.wifi.aware.PeerHandle arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySessionCallback#onPairingSetupRequestReceived(android.net.wifi.aware.PeerHandle,int)");
    }

    public void onPairingSetupSucceeded(com.micklab.dcg.wrapper.android.net.wifi.aware.PeerHandle arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySessionCallback#onPairingSetupSucceeded(android.net.wifi.aware.PeerHandle,java.lang.String)");
    }

    public void onPairingVerificationFailed(com.micklab.dcg.wrapper.android.net.wifi.aware.PeerHandle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySessionCallback#onPairingVerificationFailed(android.net.wifi.aware.PeerHandle)");
    }

    public void onPairingVerificationSucceed(com.micklab.dcg.wrapper.android.net.wifi.aware.PeerHandle arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySessionCallback#onPairingVerificationSucceed(android.net.wifi.aware.PeerHandle,java.lang.String)");
    }

    public void onPublishStarted(com.micklab.dcg.wrapper.android.net.wifi.aware.PublishDiscoverySession arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySessionCallback#onPublishStarted(android.net.wifi.aware.PublishDiscoverySession)");
    }

    public void onServiceDiscovered(com.micklab.dcg.wrapper.android.net.wifi.aware.ServiceDiscoveryInfo arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySessionCallback#onServiceDiscovered(android.net.wifi.aware.ServiceDiscoveryInfo)");
    }

    public void onServiceDiscoveredWithinRange(com.micklab.dcg.wrapper.android.net.wifi.aware.ServiceDiscoveryInfo arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySessionCallback#onServiceDiscoveredWithinRange(android.net.wifi.aware.ServiceDiscoveryInfo,int)");
    }

    public void onServiceLost(com.micklab.dcg.wrapper.android.net.wifi.aware.PeerHandle arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySessionCallback#onServiceLost(android.net.wifi.aware.PeerHandle,int)");
    }

    public void onSessionConfigFailed() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySessionCallback#onSessionConfigFailed()");
    }

    public void onSessionConfigUpdated() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySessionCallback#onSessionConfigUpdated()");
    }

    public void onSessionTerminated() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySessionCallback#onSessionTerminated()");
    }

    public void onSubscribeStarted(com.micklab.dcg.wrapper.android.net.wifi.aware.SubscribeDiscoverySession arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.DiscoverySessionCallback#onSubscribeStarted(android.net.wifi.aware.SubscribeDiscoverySession)");
    }

}
