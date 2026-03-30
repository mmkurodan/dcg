// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.http;

public final class QuicException {
    private final android.net.http.QuicException real;

    public QuicException(android.net.http.QuicException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.http.QuicException wrap(android.net.http.QuicException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.QuicException(real);
    }

    public android.net.http.QuicException unwrap() {
        return real;
    }

}
