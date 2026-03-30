// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch.exceptions;

public final class AppSearchException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AppSearchException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.exceptions.AppSearchException wrap(android.app.appsearch.exceptions.AppSearchException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.exceptions.AppSearchException(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.exceptions.AppSearchException getReal() {
        return (android.app.appsearch.exceptions.AppSearchException) real;
    }

    public android.app.appsearch.exceptions.AppSearchException unwrap() {
        return getReal();
    }

    public AppSearchException(int arg0) {
        this(new android.app.appsearch.exceptions.AppSearchException(arg0), (__DcgwBridgeToken) null);
    }

    public AppSearchException(int arg0, java.lang.String arg1) {
        this(new android.app.appsearch.exceptions.AppSearchException(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public AppSearchException(int arg0, java.lang.String arg1, java.lang.Throwable arg2) {
        this(new android.app.appsearch.exceptions.AppSearchException(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public int getResultCode() {
        return ((android.app.appsearch.exceptions.AppSearchException) real).getResultCode();
    }

}
