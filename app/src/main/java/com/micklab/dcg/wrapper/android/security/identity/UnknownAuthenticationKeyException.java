// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class UnknownAuthenticationKeyException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UnknownAuthenticationKeyException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.UnknownAuthenticationKeyException wrap(android.security.identity.UnknownAuthenticationKeyException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.UnknownAuthenticationKeyException(real, (__DcgwBridgeToken) null);
    }

    public android.security.identity.UnknownAuthenticationKeyException getReal() {
        return (android.security.identity.UnknownAuthenticationKeyException) real;
    }

    public android.security.identity.UnknownAuthenticationKeyException unwrap() {
        return getReal();
    }

    public UnknownAuthenticationKeyException(java.lang.String arg0) {
        this(new android.security.identity.UnknownAuthenticationKeyException(arg0), (__DcgwBridgeToken) null);
    }

    public UnknownAuthenticationKeyException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.identity.UnknownAuthenticationKeyException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
