// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class NoAuthenticationKeyAvailableException {
    private final android.security.identity.NoAuthenticationKeyAvailableException real;

    public NoAuthenticationKeyAvailableException(android.security.identity.NoAuthenticationKeyAvailableException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.NoAuthenticationKeyAvailableException wrap(android.security.identity.NoAuthenticationKeyAvailableException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.NoAuthenticationKeyAvailableException(real);
    }

    public android.security.identity.NoAuthenticationKeyAvailableException unwrap() {
        return real;
    }

    public NoAuthenticationKeyAvailableException(java.lang.String arg0) {
        this(new android.security.identity.NoAuthenticationKeyAvailableException(arg0));
    }

    public NoAuthenticationKeyAvailableException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.identity.NoAuthenticationKeyAvailableException(arg0, arg1));
    }

}
