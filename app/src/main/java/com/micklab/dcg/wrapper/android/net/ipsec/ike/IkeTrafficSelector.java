// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike;

public final class IkeTrafficSelector {
    private final android.net.ipsec.ike.IkeTrafficSelector real;

    public IkeTrafficSelector(android.net.ipsec.ike.IkeTrafficSelector real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeTrafficSelector wrap(android.net.ipsec.ike.IkeTrafficSelector real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeTrafficSelector(real);
    }

    public android.net.ipsec.ike.IkeTrafficSelector unwrap() {
        return real;
    }

    public IkeTrafficSelector(int arg0, int arg1, java.net.InetAddress arg2, java.net.InetAddress arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeTrafficSelector#android.net.ipsec.ike.IkeTrafficSelector(int,int,java.net.InetAddress,java.net.InetAddress)");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeTrafficSelector#equals(java.lang.Object)");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeTrafficSelector#hashCode()");
    }


}
