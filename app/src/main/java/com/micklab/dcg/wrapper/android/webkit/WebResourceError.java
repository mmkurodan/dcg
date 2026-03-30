// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebResourceError {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WebResourceError(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebResourceError wrap(android.webkit.WebResourceError real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebResourceError(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.WebResourceError getReal() {
        return (android.webkit.WebResourceError) real;
    }

    public android.webkit.WebResourceError unwrap() {
        return getReal();
    }

    public java.lang.CharSequence getDescription() {
        return ((android.webkit.WebResourceError) real).getDescription();
    }

    public int getErrorCode() {
        return ((android.webkit.WebResourceError) real).getErrorCode();
    }

}
