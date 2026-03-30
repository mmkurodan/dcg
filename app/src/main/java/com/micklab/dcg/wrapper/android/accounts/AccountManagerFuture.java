// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accounts;

public final class AccountManagerFuture {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AccountManagerFuture(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accounts.AccountManagerFuture wrap(android.accounts.AccountManagerFuture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accounts.AccountManagerFuture(real, (__DcgwBridgeToken) null);
    }

    public android.accounts.AccountManagerFuture getReal() {
        return (android.accounts.AccountManagerFuture) real;
    }

    public android.accounts.AccountManagerFuture unwrap() {
        return getReal();
    }

    public boolean cancel(boolean arg0) {
        return ((android.accounts.AccountManagerFuture) real).cancel(arg0);
    }

    public java.lang.Object getResult() throws android.accounts.AuthenticatorException, java.io.IOException, android.accounts.OperationCanceledException {
        return ((android.accounts.AccountManagerFuture) real).getResult();
    }

    public java.lang.Object getResult(long arg0, java.util.concurrent.TimeUnit arg1) throws android.accounts.AuthenticatorException, java.io.IOException, android.accounts.OperationCanceledException {
        return ((android.accounts.AccountManagerFuture) real).getResult(arg0, arg1);
    }

    public boolean isCancelled() {
        return ((android.accounts.AccountManagerFuture) real).isCancelled();
    }

    public boolean isDone() {
        return ((android.accounts.AccountManagerFuture) real).isDone();
    }

}
