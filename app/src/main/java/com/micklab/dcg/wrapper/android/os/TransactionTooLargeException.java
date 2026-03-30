// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class TransactionTooLargeException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TransactionTooLargeException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.TransactionTooLargeException wrap(android.os.TransactionTooLargeException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.TransactionTooLargeException(real, (__DcgwBridgeToken) null);
    }

    public android.os.TransactionTooLargeException getReal() {
        return (android.os.TransactionTooLargeException) real;
    }

    public android.os.TransactionTooLargeException unwrap() {
        return getReal();
    }

    public TransactionTooLargeException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.TransactionTooLargeException#android.os.TransactionTooLargeException()");
    }

    public TransactionTooLargeException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.TransactionTooLargeException#android.os.TransactionTooLargeException(java.lang.String)");
    }

}
