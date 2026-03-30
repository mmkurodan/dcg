// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class OperationApplicationException {
    private final android.content.OperationApplicationException real;

    public OperationApplicationException(android.content.OperationApplicationException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.OperationApplicationException wrap(android.content.OperationApplicationException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.OperationApplicationException(real);
    }

    public android.content.OperationApplicationException unwrap() {
        return real;
    }

    public OperationApplicationException() {
        this(new android.content.OperationApplicationException());
    }

    public OperationApplicationException(int arg0) {
        this(new android.content.OperationApplicationException(arg0));
    }

    public OperationApplicationException(java.lang.Throwable arg0) {
        this(new android.content.OperationApplicationException(arg0));
    }

    public OperationApplicationException(java.lang.String arg0) {
        this(new android.content.OperationApplicationException(arg0));
    }

    public OperationApplicationException(java.lang.String arg0, int arg1) {
        this(new android.content.OperationApplicationException(arg0, arg1));
    }

    public OperationApplicationException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.content.OperationApplicationException(arg0, arg1));
    }

    public int getNumSuccessfulYieldPoints() {
        return real.getNumSuccessfulYieldPoints();
    }

}
