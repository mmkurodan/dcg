// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebResourceRequest {
    private final android.webkit.WebResourceRequest real;

    public WebResourceRequest(android.webkit.WebResourceRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebResourceRequest wrap(android.webkit.WebResourceRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebResourceRequest(real);
    }

    public android.webkit.WebResourceRequest unwrap() {
        return real;
    }

    public java.lang.String getMethod() {
        return real.getMethod();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getUrl() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(real.getUrl());
    }

    public boolean hasGesture() {
        return real.hasGesture();
    }

    public boolean isForMainFrame() {
        return real.isForMainFrame();
    }

    public boolean isRedirect() {
        return real.isRedirect();
    }

}
