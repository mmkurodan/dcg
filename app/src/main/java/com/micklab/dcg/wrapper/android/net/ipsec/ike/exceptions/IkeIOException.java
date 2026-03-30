// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions;

public final class IkeIOException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IkeIOException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeIOException wrap(android.net.ipsec.ike.exceptions.IkeIOException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeIOException(real, (__DcgwBridgeToken) null);
    }

    public android.net.ipsec.ike.exceptions.IkeIOException getReal() {
        return (android.net.ipsec.ike.exceptions.IkeIOException) real;
    }

    public android.net.ipsec.ike.exceptions.IkeIOException unwrap() {
        return getReal();
    }

    public IkeIOException(java.io.IOException arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.IkeIOException#android.net.ipsec.ike.exceptions.IkeIOException(java.io.IOException)");
    }

    public java.io.IOException getCause() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.IkeIOException#getCause()");
    }

    public java.lang.Throwable initCause(java.lang.Throwable arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.IkeIOException#initCause(java.lang.Throwable)");
    }

}
