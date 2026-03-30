// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class AuthenticationKeyMetadata {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AuthenticationKeyMetadata(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.AuthenticationKeyMetadata wrap(android.security.identity.AuthenticationKeyMetadata real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.AuthenticationKeyMetadata(real, (__DcgwBridgeToken) null);
    }

    public android.security.identity.AuthenticationKeyMetadata getReal() {
        return (android.security.identity.AuthenticationKeyMetadata) real;
    }

    public android.security.identity.AuthenticationKeyMetadata unwrap() {
        return getReal();
    }

    public java.time.Instant getExpirationDate() {
        return ((android.security.identity.AuthenticationKeyMetadata) real).getExpirationDate();
    }

    public int getUsageCount() {
        return ((android.security.identity.AuthenticationKeyMetadata) real).getUsageCount();
    }

}
