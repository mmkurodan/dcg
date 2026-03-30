// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class NetworkCapabilities {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NetworkCapabilities(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.NetworkCapabilities wrap(android.net.NetworkCapabilities real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.NetworkCapabilities(real, (__DcgwBridgeToken) null);
    }

    public android.net.NetworkCapabilities getReal() {
        return (android.net.NetworkCapabilities) real;
    }

    public android.net.NetworkCapabilities unwrap() {
        return getReal();
    }

    public NetworkCapabilities() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkCapabilities#android.net.NetworkCapabilities()");
    }

    public NetworkCapabilities(com.micklab.dcg.wrapper.android.net.NetworkCapabilities arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkCapabilities#android.net.NetworkCapabilities(android.net.NetworkCapabilities)");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkCapabilities#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkCapabilities#equals(java.lang.Object)");
    }

    public int[] getCapabilities() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkCapabilities#getCapabilities()");
    }

    public int[] getEnterpriseIds() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkCapabilities#getEnterpriseIds()");
    }

    public int getLinkDownstreamBandwidthKbps() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkCapabilities#getLinkDownstreamBandwidthKbps()");
    }

    public int getLinkUpstreamBandwidthKbps() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkCapabilities#getLinkUpstreamBandwidthKbps()");
    }

    public com.micklab.dcg.wrapper.android.net.NetworkSpecifier getNetworkSpecifier() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkCapabilities#getNetworkSpecifier()");
    }

    public int getOwnerUid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkCapabilities#getOwnerUid()");
    }

    public int getSignalStrength() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkCapabilities#getSignalStrength()");
    }

    public com.micklab.dcg.wrapper.android.net.TransportInfo getTransportInfo() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkCapabilities#getTransportInfo()");
    }

    public boolean hasCapability(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkCapabilities#hasCapability(int)");
    }

    public boolean hasEnterpriseId(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkCapabilities#hasEnterpriseId(int)");
    }

    public boolean hasTransport(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkCapabilities#hasTransport(int)");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkCapabilities#hashCode()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkCapabilities#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.NetworkCapabilities#writeToParcel(android.os.Parcel,int)");
    }


}
