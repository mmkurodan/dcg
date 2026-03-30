// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class NoAuthenticationKeyAvailableException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NoAuthenticationKeyAvailableException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.NoAuthenticationKeyAvailableException wrap(android.security.identity.NoAuthenticationKeyAvailableException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.NoAuthenticationKeyAvailableException(real, (__DcgwBridgeToken) null);
    }

    public android.security.identity.NoAuthenticationKeyAvailableException getReal() {
        return (android.security.identity.NoAuthenticationKeyAvailableException) real;
    }

    public android.security.identity.NoAuthenticationKeyAvailableException unwrap() {
        return getReal();
    }

    public NoAuthenticationKeyAvailableException(java.lang.String arg0) {
        this(new android.security.identity.NoAuthenticationKeyAvailableException(arg0), (__DcgwBridgeToken) null);
    }

    public NoAuthenticationKeyAvailableException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.identity.NoAuthenticationKeyAvailableException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
