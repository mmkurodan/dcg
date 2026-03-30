// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike;

public final class IkeSessionConnectionInfo {
    private final android.net.ipsec.ike.IkeSessionConnectionInfo real;

    public IkeSessionConnectionInfo(android.net.ipsec.ike.IkeSessionConnectionInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSessionConnectionInfo wrap(android.net.ipsec.ike.IkeSessionConnectionInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSessionConnectionInfo(real);
    }

    public android.net.ipsec.ike.IkeSessionConnectionInfo unwrap() {
        return real;
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
