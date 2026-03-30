// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accounts;

public final class AccountManagerFuture {
    private final android.accounts.AccountManagerFuture real;

    public AccountManagerFuture(android.accounts.AccountManagerFuture real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accounts.AccountManagerFuture wrap(android.accounts.AccountManagerFuture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accounts.AccountManagerFuture(real);
    }

    public android.accounts.AccountManagerFuture unwrap() {
        return real;
    }

    public boolean cancel(boolean arg0) {
        return real.cancel(arg0);
    }

    public java.lang.Object getResult() throws android.accounts.AuthenticatorException, java.io.IOException, android.accounts.OperationCanceledException {
        return real.getResult();
    }

    public java.lang.Object getResult(long arg0, java.util.concurrent.TimeUnit arg1) throws android.accounts.AuthenticatorException, java.io.IOException, android.accounts.OperationCanceledException {
        return real.getResult(arg0, arg1);
    }

    public boolean isCancelled() {
        return real.isCancelled();
    }

    public boolean isDone() {
        return real.isDone();
    }

}
