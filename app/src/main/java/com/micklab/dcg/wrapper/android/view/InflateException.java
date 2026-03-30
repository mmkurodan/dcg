// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class InflateException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InflateException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.InflateException wrap(android.view.InflateException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.InflateException(real, (__DcgwBridgeToken) null);
    }

    public android.view.InflateException getReal() {
        return (android.view.InflateException) real;
    }

    public android.view.InflateException unwrap() {
        return getReal();
    }

    public InflateException() {
        this(new android.view.InflateException(), (__DcgwBridgeToken) null);
    }

    public InflateException(java.lang.Throwable arg0) {
        this(new android.view.InflateException(arg0), (__DcgwBridgeToken) null);
    }

    public InflateException(java.lang.String arg0) {
        this(new android.view.InflateException(arg0), (__DcgwBridgeToken) null);
    }

    public InflateException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.view.InflateException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
