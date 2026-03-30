// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike;

public final class ChildSessionParams {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ChildSessionParams(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSessionParams wrap(android.net.ipsec.ike.ChildSessionParams real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSessionParams(real, (__DcgwBridgeToken) null);
    }

    public android.net.ipsec.ike.ChildSessionParams getReal() {
        return (android.net.ipsec.ike.ChildSessionParams) real;
    }

    public android.net.ipsec.ike.ChildSessionParams unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.ChildSessionParams#equals(java.lang.Object)");
    }

    public int getHardLifetimeSeconds() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.ChildSessionParams#getHardLifetimeSeconds()");
    }

    public int getSoftLifetimeSeconds() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.ChildSessionParams#getSoftLifetimeSeconds()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.ChildSessionParams#hashCode()");
    }

}
