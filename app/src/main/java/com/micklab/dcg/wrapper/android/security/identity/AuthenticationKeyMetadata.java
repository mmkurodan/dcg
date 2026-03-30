// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class AuthenticationKeyMetadata {
    private final android.security.identity.AuthenticationKeyMetadata real;

    public AuthenticationKeyMetadata(android.security.identity.AuthenticationKeyMetadata real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.AuthenticationKeyMetadata wrap(android.security.identity.AuthenticationKeyMetadata real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.AuthenticationKeyMetadata(real);
    }

    public android.security.identity.AuthenticationKeyMetadata unwrap() {
        return real;
    }

    public java.time.Instant getExpirationDate() {
        return real.getExpirationDate();
    }

    public int getUsageCount() {
        return real.getUsageCount();
    }

}
