// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions;

public final class IkeProtocolException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IkeProtocolException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeProtocolException wrap(android.net.ipsec.ike.exceptions.IkeProtocolException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeProtocolException(real, (__DcgwBridgeToken) null);
    }

    public android.net.ipsec.ike.exceptions.IkeProtocolException getReal() {
        return (android.net.ipsec.ike.exceptions.IkeProtocolException) real;
    }

    public android.net.ipsec.ike.exceptions.IkeProtocolException unwrap() {
        return getReal();
    }

    public int getErrorType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.IkeProtocolException#getErrorType()");
    }


}
