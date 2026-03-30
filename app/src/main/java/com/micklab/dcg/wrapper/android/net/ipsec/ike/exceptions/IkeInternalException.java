// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions;

public final class IkeInternalException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IkeInternalException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeInternalException wrap(android.net.ipsec.ike.exceptions.IkeInternalException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeInternalException(real, (__DcgwBridgeToken) null);
    }

    public android.net.ipsec.ike.exceptions.IkeInternalException getReal() {
        return (android.net.ipsec.ike.exceptions.IkeInternalException) real;
    }

    public android.net.ipsec.ike.exceptions.IkeInternalException unwrap() {
        return getReal();
    }

    public IkeInternalException(java.lang.Throwable arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.IkeInternalException#android.net.ipsec.ike.exceptions.IkeInternalException(java.lang.Throwable)");
    }

    public IkeInternalException(java.lang.String arg0, java.lang.Throwable arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.IkeInternalException#android.net.ipsec.ike.exceptions.IkeInternalException(java.lang.String,java.lang.Throwable)");
    }

}
