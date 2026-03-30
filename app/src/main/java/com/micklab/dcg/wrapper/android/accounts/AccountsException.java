// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accounts;

public final class AccountsException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AccountsException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accounts.AccountsException wrap(android.accounts.AccountsException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accounts.AccountsException(real, (__DcgwBridgeToken) null);
    }

    public android.accounts.AccountsException getReal() {
        return (android.accounts.AccountsException) real;
    }

    public android.accounts.AccountsException unwrap() {
        return getReal();
    }

    public AccountsException() {
        this(new android.accounts.AccountsException(), (__DcgwBridgeToken) null);
    }

    public AccountsException(java.lang.Throwable arg0) {
        this(new android.accounts.AccountsException(arg0), (__DcgwBridgeToken) null);
    }

    public AccountsException(java.lang.String arg0) {
        this(new android.accounts.AccountsException(arg0), (__DcgwBridgeToken) null);
    }

    public AccountsException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.accounts.AccountsException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
