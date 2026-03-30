// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi.p2p.nsd;

public final class WifiP2pDnsSdServiceInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WifiP2pDnsSdServiceInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceInfo wrap(android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceInfo(real, (__DcgwBridgeToken) null);
    }

    public android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceInfo getReal() {
        return (android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceInfo) real;
    }

    public android.net.wifi.p2p.nsd.WifiP2pDnsSdServiceInfo unwrap() {
        return getReal();
    }

}
