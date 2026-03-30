// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class HttpAuthHandler {
    private final android.webkit.HttpAuthHandler real;

    public HttpAuthHandler(android.webkit.HttpAuthHandler real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.HttpAuthHandler wrap(android.webkit.HttpAuthHandler real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.HttpAuthHandler(real);
    }

    public android.webkit.HttpAuthHandler unwrap() {
        return real;
    }

    public void cancel() {
        real.cancel();
    }

    public void proceed(java.lang.String arg0, java.lang.String arg1) {
        real.proceed(arg0, arg1);
    }

    public boolean useHttpAuthUsernamePassword() {
        return real.useHttpAuthUsernamePassword();
    }

}
