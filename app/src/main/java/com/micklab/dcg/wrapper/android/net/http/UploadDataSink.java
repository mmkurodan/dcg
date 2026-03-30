// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.http;

public final class UploadDataSink {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UploadDataSink(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.http.UploadDataSink wrap(android.net.http.UploadDataSink real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.UploadDataSink(real, (__DcgwBridgeToken) null);
    }

    public android.net.http.UploadDataSink getReal() {
        return (android.net.http.UploadDataSink) real;
    }

    public android.net.http.UploadDataSink unwrap() {
        return getReal();
    }

    public void onReadError(java.lang.Exception arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UploadDataSink#onReadError(java.lang.Exception)");
    }

    public void onReadSucceeded(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UploadDataSink#onReadSucceeded(boolean)");
    }

    public void onRewindError(java.lang.Exception arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UploadDataSink#onRewindError(java.lang.Exception)");
    }

    public void onRewindSucceeded() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UploadDataSink#onRewindSucceeded()");
    }

}
