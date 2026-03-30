// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accounts;

public final class AccountAuthenticatorActivity {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AccountAuthenticatorActivity(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorActivity wrap(android.accounts.AccountAuthenticatorActivity real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorActivity(real, (__DcgwBridgeToken) null);
    }

    public android.accounts.AccountAuthenticatorActivity getReal() {
        return (android.accounts.AccountAuthenticatorActivity) real;
    }

    public android.accounts.AccountAuthenticatorActivity unwrap() {
        return getReal();
    }

    public AccountAuthenticatorActivity() {
        this(new android.accounts.AccountAuthenticatorActivity(), (__DcgwBridgeToken) null);
    }

    public void finish() {
        ((android.accounts.AccountAuthenticatorActivity) real).finish();
    }

    public void setAccountAuthenticatorResult(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.accounts.AccountAuthenticatorActivity) real).setAccountAuthenticatorResult(arg0 == null ? null : arg0.getReal());
    }

}
