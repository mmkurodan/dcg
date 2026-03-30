// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class IdentityCredentialException {
    private final android.security.identity.IdentityCredentialException real;

    public IdentityCredentialException(android.security.identity.IdentityCredentialException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.IdentityCredentialException wrap(android.security.identity.IdentityCredentialException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.IdentityCredentialException(real);
    }

    public android.security.identity.IdentityCredentialException unwrap() {
        return real;
    }

    public IdentityCredentialException(java.lang.String arg0) {
        this(new android.security.identity.IdentityCredentialException(arg0));
    }

    public IdentityCredentialException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.identity.IdentityCredentialException(arg0, arg1));
    }

}
