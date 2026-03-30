// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebViewRenderProcessClient {
    private final android.webkit.WebViewRenderProcessClient real;

    public WebViewRenderProcessClient(android.webkit.WebViewRenderProcessClient real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebViewRenderProcessClient wrap(android.webkit.WebViewRenderProcessClient real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebViewRenderProcessClient(real);
    }

    public android.webkit.WebViewRenderProcessClient unwrap() {
        return real;
    }

    public void onRenderProcessResponsive(com.micklab.dcg.wrapper.android.webkit.WebView arg0, com.micklab.dcg.wrapper.android.webkit.WebViewRenderProcess arg1) {
        real.onRenderProcessResponsive(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onRenderProcessUnresponsive(com.micklab.dcg.wrapper.android.webkit.WebView arg0, com.micklab.dcg.wrapper.android.webkit.WebViewRenderProcess arg1) {
        real.onRenderProcessUnresponsive(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

}
