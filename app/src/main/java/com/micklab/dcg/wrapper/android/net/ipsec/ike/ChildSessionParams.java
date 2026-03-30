// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike;

public final class ChildSessionParams {
    private final android.net.ipsec.ike.ChildSessionParams real;

    public ChildSessionParams(android.net.ipsec.ike.ChildSessionParams real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSessionParams wrap(android.net.ipsec.ike.ChildSessionParams real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.ChildSessionParams(real);
    }

    public android.net.ipsec.ike.ChildSessionParams unwrap() {
        return real;
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
