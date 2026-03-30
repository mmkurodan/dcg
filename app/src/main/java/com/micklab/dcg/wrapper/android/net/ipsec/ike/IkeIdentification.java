// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike;

public final class IkeIdentification {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IkeIdentification(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeIdentification wrap(android.net.ipsec.ike.IkeIdentification real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeIdentification(real, (__DcgwBridgeToken) null);
    }

    public android.net.ipsec.ike.IkeIdentification getReal() {
        return (android.net.ipsec.ike.IkeIdentification) real;
    }

    public android.net.ipsec.ike.IkeIdentification unwrap() {
        return getReal();
    }

}
