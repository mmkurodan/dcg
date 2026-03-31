// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi.p2p;

public final class WifiP2pDirInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WifiP2pDirInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.p2p.WifiP2pDirInfo wrap(android.net.wifi.p2p.WifiP2pDirInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.p2p.WifiP2pDirInfo(real, (__DcgwBridgeToken) null);
    }

    public android.net.wifi.p2p.WifiP2pDirInfo getReal() {
        return (android.net.wifi.p2p.WifiP2pDirInfo) real;
    }

    public android.net.wifi.p2p.WifiP2pDirInfo unwrap() {
        return getReal();
    }

    public WifiP2pDirInfo(com.micklab.dcg.wrapper.android.net.MacAddress arg0, byte[] arg1, byte[] arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.p2p.WifiP2pDirInfo#android.net.wifi.p2p.WifiP2pDirInfo(android.net.MacAddress,[B,[B)");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.p2p.WifiP2pDirInfo#describeContents()");
    }

    public byte[] getDirTag() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.p2p.WifiP2pDirInfo#getDirTag()");
    }

    public com.micklab.dcg.wrapper.android.net.MacAddress getMacAddress() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.p2p.WifiP2pDirInfo#getMacAddress()");
    }

    public byte[] getNonce() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.p2p.WifiP2pDirInfo#getNonce()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.p2p.WifiP2pDirInfo#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.p2p.WifiP2pDirInfo#writeToParcel(android.os.Parcel,int)");
    }


}
