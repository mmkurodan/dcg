// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accounts;

public final class OnAccountsUpdateListener {
    private final android.accounts.OnAccountsUpdateListener real;

    public OnAccountsUpdateListener(android.accounts.OnAccountsUpdateListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accounts.OnAccountsUpdateListener wrap(android.accounts.OnAccountsUpdateListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accounts.OnAccountsUpdateListener(real);
    }

    public android.accounts.OnAccountsUpdateListener unwrap() {
        return real;
    }

    public void onAccountsUpdated(android.accounts.Account[] arg0) {
        real.onAccountsUpdated(arg0);
    }

}
