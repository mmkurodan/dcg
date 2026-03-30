// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accounts;

public final class OnAccountsUpdateListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OnAccountsUpdateListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accounts.OnAccountsUpdateListener wrap(android.accounts.OnAccountsUpdateListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accounts.OnAccountsUpdateListener(real, (__DcgwBridgeToken) null);
    }

    public android.accounts.OnAccountsUpdateListener getReal() {
        return (android.accounts.OnAccountsUpdateListener) real;
    }

    public android.accounts.OnAccountsUpdateListener unwrap() {
        return getReal();
    }

    public void onAccountsUpdated(android.accounts.Account[] arg0) {
        ((android.accounts.OnAccountsUpdateListener) real).onAccountsUpdated(arg0);
    }

}
