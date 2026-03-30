// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike;

public final class SaProposal {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SaProposal(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.SaProposal wrap(android.net.ipsec.ike.SaProposal real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.SaProposal(real, (__DcgwBridgeToken) null);
    }

    public android.net.ipsec.ike.SaProposal getReal() {
        return (android.net.ipsec.ike.SaProposal) real;
    }

    public android.net.ipsec.ike.SaProposal unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.SaProposal#equals(java.lang.Object)");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.SaProposal#hashCode()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.SaProposal#toString()");
    }


}
