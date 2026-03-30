// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class DhcpInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DhcpInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.DhcpInfo wrap(android.net.DhcpInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.DhcpInfo(real, (__DcgwBridgeToken) null);
    }

    public android.net.DhcpInfo getReal() {
        return (android.net.DhcpInfo) real;
    }

    public android.net.DhcpInfo unwrap() {
        return getReal();
    }

    public DhcpInfo() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.DhcpInfo#android.net.DhcpInfo()");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.DhcpInfo#describeContents()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.DhcpInfo#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.DhcpInfo#writeToParcel(android.os.Parcel,int)");
    }


}
