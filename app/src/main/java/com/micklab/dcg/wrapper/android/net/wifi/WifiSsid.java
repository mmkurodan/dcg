// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi;

public final class WifiSsid {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WifiSsid(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.WifiSsid wrap(android.net.wifi.WifiSsid real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.WifiSsid(real, (__DcgwBridgeToken) null);
    }

    public android.net.wifi.WifiSsid getReal() {
        return (android.net.wifi.WifiSsid) real;
    }

    public android.net.wifi.WifiSsid unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiSsid#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiSsid#equals(java.lang.Object)");
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.WifiSsid fromBytes(byte[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiSsid#fromBytes([B)");
    }

    public byte[] getBytes() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiSsid#getBytes()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiSsid#hashCode()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiSsid#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.WifiSsid#writeToParcel(android.os.Parcel,int)");
    }


}
