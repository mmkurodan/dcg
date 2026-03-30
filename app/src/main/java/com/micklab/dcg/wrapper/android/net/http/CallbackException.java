// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.http;

public final class CallbackException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CallbackException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.http.CallbackException wrap(android.net.http.CallbackException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.CallbackException(real, (__DcgwBridgeToken) null);
    }

    public android.net.http.CallbackException getReal() {
        return (android.net.http.CallbackException) real;
    }

    public android.net.http.CallbackException unwrap() {
        return getReal();
    }

}
