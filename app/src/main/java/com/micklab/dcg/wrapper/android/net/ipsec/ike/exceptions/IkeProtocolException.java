// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions;

public final class IkeProtocolException {
    private final android.net.ipsec.ike.exceptions.IkeProtocolException real;

    public IkeProtocolException(android.net.ipsec.ike.exceptions.IkeProtocolException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeProtocolException wrap(android.net.ipsec.ike.exceptions.IkeProtocolException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeProtocolException(real);
    }

    public android.net.ipsec.ike.exceptions.IkeProtocolException unwrap() {
        return real;
    }

    public int getErrorType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.IkeProtocolException#getErrorType()");
    }


}
