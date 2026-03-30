// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accounts;

public final class AccountManagerCallback {
    private final android.accounts.AccountManagerCallback real;

    public AccountManagerCallback(android.accounts.AccountManagerCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accounts.AccountManagerCallback wrap(android.accounts.AccountManagerCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accounts.AccountManagerCallback(real);
    }

    public android.accounts.AccountManagerCallback unwrap() {
        return real;
    }

}
