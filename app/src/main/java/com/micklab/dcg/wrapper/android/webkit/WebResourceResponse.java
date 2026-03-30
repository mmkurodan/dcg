// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class WebResourceResponse {
    private final android.webkit.WebResourceResponse real;

    public WebResourceResponse(android.webkit.WebResourceResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.WebResourceResponse wrap(android.webkit.WebResourceResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.WebResourceResponse(real);
    }

    public android.webkit.WebResourceResponse unwrap() {
        return real;
    }

    public WebResourceResponse(java.lang.String arg0, java.lang.String arg1, java.io.InputStream arg2) {
        this(new android.webkit.WebResourceResponse(arg0, arg1, arg2));
    }

    public WebResourceResponse(java.lang.String arg0, java.lang.String arg1, int arg2, java.lang.String arg3, java.util.Map arg4, java.io.InputStream arg5) {
        this(new android.webkit.WebResourceResponse(arg0, arg1, arg2, arg3, arg4, arg5));
    }

    public java.io.InputStream getData() {
        return real.getData();
    }

    public java.lang.String getEncoding() {
        return real.getEncoding();
    }

    public java.lang.String getMimeType() {
        return real.getMimeType();
    }

    public java.lang.String getReasonPhrase() {
        return real.getReasonPhrase();
    }

    public int getStatusCode() {
        return real.getStatusCode();
    }

    public void setData(java.io.InputStream arg0) {
        real.setData(arg0);
    }

    public void setEncoding(java.lang.String arg0) {
        real.setEncoding(arg0);
    }

    public void setMimeType(java.lang.String arg0) {
        real.setMimeType(arg0);
    }

    public void setStatusCodeAndReasonPhrase(int arg0, java.lang.String arg1) {
        real.setStatusCodeAndReasonPhrase(arg0, arg1);
    }

}
