// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class VpnService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VpnService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.VpnService wrap(android.net.VpnService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.VpnService(real, (__DcgwBridgeToken) null);
    }

    public android.net.VpnService getReal() {
        return (android.net.VpnService) real;
    }

    public android.net.VpnService unwrap() {
        return getReal();
    }

    public VpnService() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService#android.net.VpnService()");
    }

    public boolean isAlwaysOn() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService#isAlwaysOn()");
    }

    public boolean isLockdownEnabled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService#isLockdownEnabled()");
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService#onBind(android.content.Intent)");
    }

    public void onRevoke() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService#onRevoke()");
    }

    public static com.micklab.dcg.wrapper.android.content.Intent prepare(com.micklab.dcg.wrapper.android.content.Context arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService#prepare(android.content.Context)");
    }

    public boolean protect(java.net.Socket arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService#protect(java.net.Socket)");
    }

    public boolean protect(java.net.DatagramSocket arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService#protect(java.net.DatagramSocket)");
    }

    public boolean protect(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService#protect(int)");
    }

    public boolean setUnderlyingNetworks(android.net.Network[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.VpnService#setUnderlyingNetworks([Landroid.net.Network;)");
    }


}
