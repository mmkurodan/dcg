// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebViewRenderProcess {
    private final android.webkit.WebViewRenderProcess real;

    public WebViewRenderProcess(android.webkit.WebViewRenderProcess real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebViewRenderProcess wrap(android.webkit.WebViewRenderProcess real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebViewRenderProcess(real);
    }

    public android.webkit.WebViewRenderProcess unwrap() {
        return real;
    }

    public boolean terminate() {
        return real.terminate();
    }

}
