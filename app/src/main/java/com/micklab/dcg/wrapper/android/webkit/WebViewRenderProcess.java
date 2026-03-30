// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebViewRenderProcess {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WebViewRenderProcess(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebViewRenderProcess wrap(android.webkit.WebViewRenderProcess real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebViewRenderProcess(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.WebViewRenderProcess getReal() {
        return (android.webkit.WebViewRenderProcess) real;
    }

    public android.webkit.WebViewRenderProcess unwrap() {
        return getReal();
    }

    public boolean terminate() {
        return ((android.webkit.WebViewRenderProcess) real).terminate();
    }

}
