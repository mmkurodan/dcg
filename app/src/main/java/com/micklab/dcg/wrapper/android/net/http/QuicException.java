// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.http;

public final class QuicException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private QuicException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.http.QuicException wrap(android.net.http.QuicException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.QuicException(real, (__DcgwBridgeToken) null);
    }

    public android.net.http.QuicException getReal() {
        return (android.net.http.QuicException) real;
    }

    public android.net.http.QuicException unwrap() {
        return getReal();
    }

}
