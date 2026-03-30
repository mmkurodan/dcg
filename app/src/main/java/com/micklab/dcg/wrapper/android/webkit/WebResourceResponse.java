// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebResourceResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WebResourceResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebResourceResponse wrap(android.webkit.WebResourceResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebResourceResponse(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.WebResourceResponse getReal() {
        return (android.webkit.WebResourceResponse) real;
    }

    public android.webkit.WebResourceResponse unwrap() {
        return getReal();
    }

    public WebResourceResponse(java.lang.String arg0, java.lang.String arg1, java.io.InputStream arg2) {
        this(new android.webkit.WebResourceResponse(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public WebResourceResponse(java.lang.String arg0, java.lang.String arg1, int arg2, java.lang.String arg3, java.util.Map arg4, java.io.InputStream arg5) {
        this(new android.webkit.WebResourceResponse(arg0, arg1, arg2, arg3, arg4, arg5), (__DcgwBridgeToken) null);
    }

    public java.io.InputStream getData() {
        return ((android.webkit.WebResourceResponse) real).getData();
    }

    public java.lang.String getEncoding() {
        return ((android.webkit.WebResourceResponse) real).getEncoding();
    }

    public java.lang.String getMimeType() {
        return ((android.webkit.WebResourceResponse) real).getMimeType();
    }

    public java.lang.String getReasonPhrase() {
        return ((android.webkit.WebResourceResponse) real).getReasonPhrase();
    }

    public int getStatusCode() {
        return ((android.webkit.WebResourceResponse) real).getStatusCode();
    }

    public void setData(java.io.InputStream arg0) {
        ((android.webkit.WebResourceResponse) real).setData(arg0);
    }

    public void setEncoding(java.lang.String arg0) {
        ((android.webkit.WebResourceResponse) real).setEncoding(arg0);
    }

    public void setMimeType(java.lang.String arg0) {
        ((android.webkit.WebResourceResponse) real).setMimeType(arg0);
    }

    public void setStatusCodeAndReasonPhrase(int arg0, java.lang.String arg1) {
        ((android.webkit.WebResourceResponse) real).setStatusCodeAndReasonPhrase(arg0, arg1);
    }

}
