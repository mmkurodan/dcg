// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.http;

public final class NetworkException {
    private final android.net.http.NetworkException real;

    public NetworkException(android.net.http.NetworkException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.http.NetworkException wrap(android.net.http.NetworkException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.NetworkException(real);
    }

    public android.net.http.NetworkException unwrap() {
        return real;
    }

    public int getErrorCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.NetworkException#getErrorCode()");
    }

    public boolean isImmediatelyRetryable() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.NetworkException#isImmediatelyRetryable()");
    }


}
