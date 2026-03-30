// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions;

public final class IkeTimeoutException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IkeTimeoutException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeTimeoutException wrap(android.net.ipsec.ike.exceptions.IkeTimeoutException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeTimeoutException(real, (__DcgwBridgeToken) null);
    }

    public android.net.ipsec.ike.exceptions.IkeTimeoutException getReal() {
        return (android.net.ipsec.ike.exceptions.IkeTimeoutException) real;
    }

    public android.net.ipsec.ike.exceptions.IkeTimeoutException unwrap() {
        return getReal();
    }

    public IkeTimeoutException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.IkeTimeoutException#android.net.ipsec.ike.exceptions.IkeTimeoutException(java.lang.String)");
    }

}
