// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accounts;

public final class OperationCanceledException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OperationCanceledException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accounts.OperationCanceledException wrap(android.accounts.OperationCanceledException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accounts.OperationCanceledException(real, (__DcgwBridgeToken) null);
    }

    public android.accounts.OperationCanceledException getReal() {
        return (android.accounts.OperationCanceledException) real;
    }

    public android.accounts.OperationCanceledException unwrap() {
        return getReal();
    }

    public OperationCanceledException() {
        this(new android.accounts.OperationCanceledException(), (__DcgwBridgeToken) null);
    }

    public OperationCanceledException(java.lang.Throwable arg0) {
        this(new android.accounts.OperationCanceledException(arg0), (__DcgwBridgeToken) null);
    }

    public OperationCanceledException(java.lang.String arg0) {
        this(new android.accounts.OperationCanceledException(arg0), (__DcgwBridgeToken) null);
    }

    public OperationCanceledException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.accounts.OperationCanceledException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
