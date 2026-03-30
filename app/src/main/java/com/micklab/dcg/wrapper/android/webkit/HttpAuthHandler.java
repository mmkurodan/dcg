// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class HttpAuthHandler {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private HttpAuthHandler(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.HttpAuthHandler wrap(android.webkit.HttpAuthHandler real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.HttpAuthHandler(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.HttpAuthHandler getReal() {
        return (android.webkit.HttpAuthHandler) real;
    }

    public android.webkit.HttpAuthHandler unwrap() {
        return getReal();
    }

    public void cancel() {
        ((android.webkit.HttpAuthHandler) real).cancel();
    }

    public void proceed(java.lang.String arg0, java.lang.String arg1) {
        ((android.webkit.HttpAuthHandler) real).proceed(arg0, arg1);
    }

    public boolean useHttpAuthUsernamePassword() {
        return ((android.webkit.HttpAuthHandler) real).useHttpAuthUsernamePassword();
    }

}
