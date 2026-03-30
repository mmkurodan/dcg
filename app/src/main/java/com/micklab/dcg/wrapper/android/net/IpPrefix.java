// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class IpPrefix {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IpPrefix(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.IpPrefix wrap(android.net.IpPrefix real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.IpPrefix(real, (__DcgwBridgeToken) null);
    }

    public android.net.IpPrefix getReal() {
        return (android.net.IpPrefix) real;
    }

    public android.net.IpPrefix unwrap() {
        return getReal();
    }

    public IpPrefix(java.net.InetAddress arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpPrefix#android.net.IpPrefix(java.net.InetAddress,int)");
    }

    public boolean contains(java.net.InetAddress arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpPrefix#contains(java.net.InetAddress)");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpPrefix#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpPrefix#equals(java.lang.Object)");
    }

    public java.net.InetAddress getAddress() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpPrefix#getAddress()");
    }

    public int getPrefixLength() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpPrefix#getPrefixLength()");
    }

    public byte[] getRawAddress() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpPrefix#getRawAddress()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpPrefix#hashCode()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpPrefix#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.IpPrefix#writeToParcel(android.os.Parcel,int)");
    }


}
