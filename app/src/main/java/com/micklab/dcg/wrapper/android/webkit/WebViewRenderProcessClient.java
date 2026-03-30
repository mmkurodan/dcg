// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebViewRenderProcessClient {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WebViewRenderProcessClient(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebViewRenderProcessClient wrap(android.webkit.WebViewRenderProcessClient real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebViewRenderProcessClient(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.WebViewRenderProcessClient getReal() {
        return (android.webkit.WebViewRenderProcessClient) real;
    }

    public android.webkit.WebViewRenderProcessClient unwrap() {
        return getReal();
    }

    public void onRenderProcessResponsive(com.micklab.dcg.wrapper.android.webkit.WebView arg0, com.micklab.dcg.wrapper.android.webkit.WebViewRenderProcess arg1) {
        ((android.webkit.WebViewRenderProcessClient) real).onRenderProcessResponsive(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onRenderProcessUnresponsive(com.micklab.dcg.wrapper.android.webkit.WebView arg0, com.micklab.dcg.wrapper.android.webkit.WebViewRenderProcess arg1) {
        ((android.webkit.WebViewRenderProcessClient) real).onRenderProcessUnresponsive(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

}
