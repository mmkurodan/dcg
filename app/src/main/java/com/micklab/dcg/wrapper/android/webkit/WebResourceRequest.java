// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebResourceRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WebResourceRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebResourceRequest wrap(android.webkit.WebResourceRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebResourceRequest(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.WebResourceRequest getReal() {
        return (android.webkit.WebResourceRequest) real;
    }

    public android.webkit.WebResourceRequest unwrap() {
        return getReal();
    }

    public java.lang.String getMethod() {
        return ((android.webkit.WebResourceRequest) real).getMethod();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getUrl() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.webkit.WebResourceRequest) real).getUrl());
    }

    public boolean hasGesture() {
        return ((android.webkit.WebResourceRequest) real).hasGesture();
    }

    public boolean isForMainFrame() {
        return ((android.webkit.WebResourceRequest) real).isForMainFrame();
    }

    public boolean isRedirect() {
        return ((android.webkit.WebResourceRequest) real).isRedirect();
    }

}
