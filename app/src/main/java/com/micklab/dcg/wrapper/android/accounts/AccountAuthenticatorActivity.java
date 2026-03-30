// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accounts;

public final class AccountAuthenticatorActivity {
    private final android.accounts.AccountAuthenticatorActivity real;

    public AccountAuthenticatorActivity(android.accounts.AccountAuthenticatorActivity real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorActivity wrap(android.accounts.AccountAuthenticatorActivity real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accounts.AccountAuthenticatorActivity(real);
    }

    public android.accounts.AccountAuthenticatorActivity unwrap() {
        return real;
    }

    public AccountAuthenticatorActivity() {
        this(new android.accounts.AccountAuthenticatorActivity());
    }

    public void finish() {
        real.finish();
    }

    public void setAccountAuthenticatorResult(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.setAccountAuthenticatorResult(arg0 == null ? null : arg0.unwrap());
    }

}
