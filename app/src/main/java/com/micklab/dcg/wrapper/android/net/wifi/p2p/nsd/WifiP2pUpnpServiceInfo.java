// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi.p2p.nsd;

public final class WifiP2pUpnpServiceInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WifiP2pUpnpServiceInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.p2p.nsd.WifiP2pUpnpServiceInfo wrap(android.net.wifi.p2p.nsd.WifiP2pUpnpServiceInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.p2p.nsd.WifiP2pUpnpServiceInfo(real, (__DcgwBridgeToken) null);
    }

    public android.net.wifi.p2p.nsd.WifiP2pUpnpServiceInfo getReal() {
        return (android.net.wifi.p2p.nsd.WifiP2pUpnpServiceInfo) real;
    }

    public android.net.wifi.p2p.nsd.WifiP2pUpnpServiceInfo unwrap() {
        return getReal();
    }

}
