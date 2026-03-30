// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.appsearch;

public final class BatchResultCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BatchResultCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.appsearch.BatchResultCallback wrap(android.app.appsearch.BatchResultCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.appsearch.BatchResultCallback(real, (__DcgwBridgeToken) null);
    }

    public android.app.appsearch.BatchResultCallback getReal() {
        return (android.app.appsearch.BatchResultCallback) real;
    }

    public android.app.appsearch.BatchResultCallback unwrap() {
        return getReal();
    }

    public void onSystemError(java.lang.Throwable arg0) {
        ((android.app.appsearch.BatchResultCallback) real).onSystemError(arg0);
    }

}
