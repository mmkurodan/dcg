// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.http;

public final class CallbackException {
    private final android.net.http.CallbackException real;

    public CallbackException(android.net.http.CallbackException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.http.CallbackException wrap(android.net.http.CallbackException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.CallbackException(real);
    }

    public android.net.http.CallbackException unwrap() {
        return real;
    }

}
