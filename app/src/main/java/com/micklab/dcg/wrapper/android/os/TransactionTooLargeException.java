// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class TransactionTooLargeException {
    private final android.os.TransactionTooLargeException real;

    public TransactionTooLargeException(android.os.TransactionTooLargeException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.TransactionTooLargeException wrap(android.os.TransactionTooLargeException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.TransactionTooLargeException(real);
    }

    public android.os.TransactionTooLargeException unwrap() {
        return real;
    }

    public TransactionTooLargeException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.TransactionTooLargeException#android.os.TransactionTooLargeException()");
    }

    public TransactionTooLargeException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.TransactionTooLargeException#android.os.TransactionTooLargeException(java.lang.String)");
    }

}
