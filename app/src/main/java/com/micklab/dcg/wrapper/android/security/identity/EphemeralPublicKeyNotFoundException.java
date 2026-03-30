// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class EphemeralPublicKeyNotFoundException {
    private final android.security.identity.EphemeralPublicKeyNotFoundException real;

    public EphemeralPublicKeyNotFoundException(android.security.identity.EphemeralPublicKeyNotFoundException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.EphemeralPublicKeyNotFoundException wrap(android.security.identity.EphemeralPublicKeyNotFoundException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.EphemeralPublicKeyNotFoundException(real);
    }

    public android.security.identity.EphemeralPublicKeyNotFoundException unwrap() {
        return real;
    }

    public EphemeralPublicKeyNotFoundException(java.lang.String arg0) {
        this(new android.security.identity.EphemeralPublicKeyNotFoundException(arg0));
    }

    public EphemeralPublicKeyNotFoundException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.identity.EphemeralPublicKeyNotFoundException(arg0, arg1));
    }

}
