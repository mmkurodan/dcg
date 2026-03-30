// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike;

public final class IkeSessionConnectionInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IkeSessionConnectionInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSessionConnectionInfo wrap(android.net.ipsec.ike.IkeSessionConnectionInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSessionConnectionInfo(real, (__DcgwBridgeToken) null);
    }

    public android.net.ipsec.ike.IkeSessionConnectionInfo getReal() {
        return (android.net.ipsec.ike.IkeSessionConnectionInfo) real;
    }

    public android.net.ipsec.ike.IkeSessionConnectionInfo unwrap() {
        return getReal();
    }

    public IkeSessionConnectionInfo(java.net.InetAddress arg0, java.net.InetAddress arg1, com.micklab.dcg.wrapper.android.net.Network arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSessionConnectionInfo#android.net.ipsec.ike.IkeSessionConnectionInfo(java.net.InetAddress,java.net.InetAddress,android.net.Network)");
    }

    public java.net.InetAddress getLocalAddress() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSessionConnectionInfo#getLocalAddress()");
    }

    public com.micklab.dcg.wrapper.android.net.Network getNetwork() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSessionConnectionInfo#getNetwork()");
    }

    public java.net.InetAddress getRemoteAddress() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSessionConnectionInfo#getRemoteAddress()");
    }

}
