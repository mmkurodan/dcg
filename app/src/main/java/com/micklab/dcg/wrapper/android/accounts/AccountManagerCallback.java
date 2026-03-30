// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accounts;

public final class AccountManagerCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AccountManagerCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accounts.AccountManagerCallback wrap(android.accounts.AccountManagerCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accounts.AccountManagerCallback(real, (__DcgwBridgeToken) null);
    }

    public android.accounts.AccountManagerCallback getReal() {
        return (android.accounts.AccountManagerCallback) real;
    }

    public android.accounts.AccountManagerCallback unwrap() {
        return getReal();
    }

}
