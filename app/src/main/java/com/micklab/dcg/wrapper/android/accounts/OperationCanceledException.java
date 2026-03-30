// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accounts;

public final class OperationCanceledException {
    private final android.accounts.OperationCanceledException real;

    public OperationCanceledException(android.accounts.OperationCanceledException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accounts.OperationCanceledException wrap(android.accounts.OperationCanceledException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accounts.OperationCanceledException(real);
    }

    public android.accounts.OperationCanceledException unwrap() {
        return real;
    }

    public OperationCanceledException() {
        this(new android.accounts.OperationCanceledException());
    }

    public OperationCanceledException(java.lang.Throwable arg0) {
        this(new android.accounts.OperationCanceledException(arg0));
    }

    public OperationCanceledException(java.lang.String arg0) {
        this(new android.accounts.OperationCanceledException(arg0));
    }

    public OperationCanceledException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.accounts.OperationCanceledException(arg0, arg1));
    }

}
