// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accounts;

public final class AccountsException {
    private final android.accounts.AccountsException real;

    public AccountsException(android.accounts.AccountsException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accounts.AccountsException wrap(android.accounts.AccountsException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accounts.AccountsException(real);
    }

    public android.accounts.AccountsException unwrap() {
        return real;
    }

    public AccountsException() {
        this(new android.accounts.AccountsException());
    }

    public AccountsException(java.lang.Throwable arg0) {
        this(new android.accounts.AccountsException(arg0));
    }

    public AccountsException(java.lang.String arg0) {
        this(new android.accounts.AccountsException(arg0));
    }

    public AccountsException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.accounts.AccountsException(arg0, arg1));
    }

}
