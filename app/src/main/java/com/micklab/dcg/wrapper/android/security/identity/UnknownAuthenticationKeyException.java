// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class UnknownAuthenticationKeyException {
    private final android.security.identity.UnknownAuthenticationKeyException real;

    public UnknownAuthenticationKeyException(android.security.identity.UnknownAuthenticationKeyException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.UnknownAuthenticationKeyException wrap(android.security.identity.UnknownAuthenticationKeyException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.UnknownAuthenticationKeyException(real);
    }

    public android.security.identity.UnknownAuthenticationKeyException unwrap() {
        return real;
    }

    public UnknownAuthenticationKeyException(java.lang.String arg0) {
        this(new android.security.identity.UnknownAuthenticationKeyException(arg0));
    }

    public UnknownAuthenticationKeyException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.identity.UnknownAuthenticationKeyException(arg0, arg1));
    }

}
