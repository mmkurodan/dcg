// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accounts;

public final class AuthenticatorException {
    private final android.accounts.AuthenticatorException real;

    public AuthenticatorException(android.accounts.AuthenticatorException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accounts.AuthenticatorException wrap(android.accounts.AuthenticatorException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accounts.AuthenticatorException(real);
    }

    public android.accounts.AuthenticatorException unwrap() {
        return real;
    }

    public AuthenticatorException() {
        this(new android.accounts.AuthenticatorException());
    }

    public AuthenticatorException(java.lang.Throwable arg0) {
        this(new android.accounts.AuthenticatorException(arg0));
    }

    public AuthenticatorException(java.lang.String arg0) {
        this(new android.accounts.AuthenticatorException(arg0));
    }

    public AuthenticatorException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.accounts.AuthenticatorException(arg0, arg1));
    }

}
