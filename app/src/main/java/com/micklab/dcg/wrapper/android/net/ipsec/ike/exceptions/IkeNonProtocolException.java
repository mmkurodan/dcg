// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions;

public final class IkeNonProtocolException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IkeNonProtocolException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeNonProtocolException wrap(android.net.ipsec.ike.exceptions.IkeNonProtocolException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeNonProtocolException(real, (__DcgwBridgeToken) null);
    }

    public android.net.ipsec.ike.exceptions.IkeNonProtocolException getReal() {
        return (android.net.ipsec.ike.exceptions.IkeNonProtocolException) real;
    }

    public android.net.ipsec.ike.exceptions.IkeNonProtocolException unwrap() {
        return getReal();
    }

}
