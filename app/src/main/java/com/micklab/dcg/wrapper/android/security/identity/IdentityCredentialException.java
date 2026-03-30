// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class IdentityCredentialException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IdentityCredentialException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.IdentityCredentialException wrap(android.security.identity.IdentityCredentialException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.IdentityCredentialException(real, (__DcgwBridgeToken) null);
    }

    public android.security.identity.IdentityCredentialException getReal() {
        return (android.security.identity.IdentityCredentialException) real;
    }

    public android.security.identity.IdentityCredentialException unwrap() {
        return getReal();
    }

    public IdentityCredentialException(java.lang.String arg0) {
        this(new android.security.identity.IdentityCredentialException(arg0), (__DcgwBridgeToken) null);
    }

    public IdentityCredentialException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.identity.IdentityCredentialException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
