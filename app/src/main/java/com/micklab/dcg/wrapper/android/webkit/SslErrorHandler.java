// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class SslErrorHandler {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SslErrorHandler(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.SslErrorHandler wrap(android.webkit.SslErrorHandler real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.SslErrorHandler(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.SslErrorHandler getReal() {
        return (android.webkit.SslErrorHandler) real;
    }

    public android.webkit.SslErrorHandler unwrap() {
        return getReal();
    }

    public void cancel() {
        ((android.webkit.SslErrorHandler) real).cancel();
    }

    public void proceed() {
        ((android.webkit.SslErrorHandler) real).proceed();
    }

}
