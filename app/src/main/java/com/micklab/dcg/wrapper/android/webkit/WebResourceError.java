// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebResourceError {
    private final android.webkit.WebResourceError real;

    public WebResourceError(android.webkit.WebResourceError real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebResourceError wrap(android.webkit.WebResourceError real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebResourceError(real);
    }

    public android.webkit.WebResourceError unwrap() {
        return real;
    }

    public java.lang.CharSequence getDescription() {
        return real.getDescription();
    }

    public int getErrorCode() {
        return real.getErrorCode();
    }

}
