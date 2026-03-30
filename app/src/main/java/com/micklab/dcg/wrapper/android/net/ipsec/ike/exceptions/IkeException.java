// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions;

public final class IkeException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IkeException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeException wrap(android.net.ipsec.ike.exceptions.IkeException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeException(real, (__DcgwBridgeToken) null);
    }

    public android.net.ipsec.ike.exceptions.IkeException getReal() {
        return (android.net.ipsec.ike.exceptions.IkeException) real;
    }

    public android.net.ipsec.ike.exceptions.IkeException unwrap() {
        return getReal();
    }

}
