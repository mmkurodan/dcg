// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class LinkAddress {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LinkAddress(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.LinkAddress wrap(android.net.LinkAddress real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.LinkAddress(real, (__DcgwBridgeToken) null);
    }

    public android.net.LinkAddress getReal() {
        return (android.net.LinkAddress) real;
    }

    public android.net.LinkAddress unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LinkAddress#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LinkAddress#equals(java.lang.Object)");
    }

    public java.net.InetAddress getAddress() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LinkAddress#getAddress()");
    }

    public int getFlags() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LinkAddress#getFlags()");
    }

    public int getPrefixLength() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LinkAddress#getPrefixLength()");
    }

    public int getScope() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LinkAddress#getScope()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LinkAddress#hashCode()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LinkAddress#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LinkAddress#writeToParcel(android.os.Parcel,int)");
    }


}
