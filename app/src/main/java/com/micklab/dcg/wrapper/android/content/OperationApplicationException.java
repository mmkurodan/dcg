// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class OperationApplicationException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OperationApplicationException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.OperationApplicationException wrap(android.content.OperationApplicationException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.OperationApplicationException(real, (__DcgwBridgeToken) null);
    }

    public android.content.OperationApplicationException getReal() {
        return (android.content.OperationApplicationException) real;
    }

    public android.content.OperationApplicationException unwrap() {
        return getReal();
    }

    public OperationApplicationException() {
        this(new android.content.OperationApplicationException(), (__DcgwBridgeToken) null);
    }

    public OperationApplicationException(int arg0) {
        this(new android.content.OperationApplicationException(arg0), (__DcgwBridgeToken) null);
    }

    public OperationApplicationException(java.lang.Throwable arg0) {
        this(new android.content.OperationApplicationException(arg0), (__DcgwBridgeToken) null);
    }

    public OperationApplicationException(java.lang.String arg0) {
        this(new android.content.OperationApplicationException(arg0), (__DcgwBridgeToken) null);
    }

    public OperationApplicationException(java.lang.String arg0, int arg1) {
        this(new android.content.OperationApplicationException(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public OperationApplicationException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.content.OperationApplicationException(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int getNumSuccessfulYieldPoints() {
        return ((android.content.OperationApplicationException) real).getNumSuccessfulYieldPoints();
    }

}
