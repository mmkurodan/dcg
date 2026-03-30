// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.http;

public final class HttpException {
    private final android.net.http.HttpException real;

    public HttpException(android.net.http.HttpException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.http.HttpException wrap(android.net.http.HttpException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.HttpException(real);
    }

    public android.net.http.HttpException unwrap() {
        return real;
    }

    public HttpException(java.lang.String arg0, java.lang.Throwable arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpException#android.net.http.HttpException(java.lang.String,java.lang.Throwable)");
    }

}
