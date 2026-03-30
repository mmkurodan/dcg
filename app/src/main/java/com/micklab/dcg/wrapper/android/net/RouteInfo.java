// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class RouteInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RouteInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.RouteInfo wrap(android.net.RouteInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.RouteInfo(real, (__DcgwBridgeToken) null);
    }

    public android.net.RouteInfo getReal() {
        return (android.net.RouteInfo) real;
    }

    public android.net.RouteInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.RouteInfo#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.RouteInfo#equals(java.lang.Object)");
    }

    public com.micklab.dcg.wrapper.android.net.IpPrefix getDestination() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.RouteInfo#getDestination()");
    }

    public java.net.InetAddress getGateway() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.RouteInfo#getGateway()");
    }

    public java.lang.String getInterface() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.RouteInfo#getInterface()");
    }

    public int getType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.RouteInfo#getType()");
    }

    public boolean hasGateway() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.RouteInfo#hasGateway()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.RouteInfo#hashCode()");
    }

    public boolean isDefaultRoute() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.RouteInfo#isDefaultRoute()");
    }

    public boolean matches(java.net.InetAddress arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.RouteInfo#matches(java.net.InetAddress)");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.RouteInfo#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.RouteInfo#writeToParcel(android.os.Parcel,int)");
    }


}
