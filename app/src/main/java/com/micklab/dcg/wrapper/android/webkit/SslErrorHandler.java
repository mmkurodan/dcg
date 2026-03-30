// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class SslErrorHandler {
    private final android.webkit.SslErrorHandler real;

    public SslErrorHandler(android.webkit.SslErrorHandler real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.SslErrorHandler wrap(android.webkit.SslErrorHandler real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.SslErrorHandler(real);
    }

    public android.webkit.SslErrorHandler unwrap() {
        return real;
    }

    public void cancel() {
        real.cancel();
    }

    public void proceed() {
        real.proceed();
    }

}
