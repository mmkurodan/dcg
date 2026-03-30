// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike;

public final class IkeKeyIdIdentification {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IkeKeyIdIdentification(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeKeyIdIdentification wrap(android.net.ipsec.ike.IkeKeyIdIdentification real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeKeyIdIdentification(real, (__DcgwBridgeToken) null);
    }

    public android.net.ipsec.ike.IkeKeyIdIdentification getReal() {
        return (android.net.ipsec.ike.IkeKeyIdIdentification) real;
    }

    public android.net.ipsec.ike.IkeKeyIdIdentification unwrap() {
        return getReal();
    }

    public IkeKeyIdIdentification(byte[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeKeyIdIdentification#android.net.ipsec.ike.IkeKeyIdIdentification([B)");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeKeyIdIdentification#equals(java.lang.Object)");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeKeyIdIdentification#hashCode()");
    }


}
