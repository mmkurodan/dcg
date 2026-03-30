// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accounts;

public final class AuthenticatorException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AuthenticatorException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accounts.AuthenticatorException wrap(android.accounts.AuthenticatorException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accounts.AuthenticatorException(real, (__DcgwBridgeToken) null);
    }

    public android.accounts.AuthenticatorException getReal() {
        return (android.accounts.AuthenticatorException) real;
    }

    public android.accounts.AuthenticatorException unwrap() {
        return getReal();
    }

    public AuthenticatorException() {
        this(new android.accounts.AuthenticatorException(), (__DcgwBridgeToken) null);
    }

    public AuthenticatorException(java.lang.Throwable arg0) {
        this(new android.accounts.AuthenticatorException(arg0), (__DcgwBridgeToken) null);
    }

    public AuthenticatorException(java.lang.String arg0) {
        this(new android.accounts.AuthenticatorException(arg0), (__DcgwBridgeToken) null);
    }

    public AuthenticatorException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.accounts.AuthenticatorException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
