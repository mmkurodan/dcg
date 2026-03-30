// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.http;

public final class UrlResponseInfo {
    private final android.net.http.UrlResponseInfo real;

    public UrlResponseInfo(android.net.http.UrlResponseInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.http.UrlResponseInfo wrap(android.net.http.UrlResponseInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.UrlResponseInfo(real);
    }

    public android.net.http.UrlResponseInfo unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.net.http.HeaderBlock getHeaders() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlResponseInfo#getHeaders()");
    }

    public int getHttpStatusCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlResponseInfo#getHttpStatusCode()");
    }

    public java.lang.String getHttpStatusText() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlResponseInfo#getHttpStatusText()");
    }

    public java.lang.String getNegotiatedProtocol() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlResponseInfo#getNegotiatedProtocol()");
    }

    public long getReceivedByteCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlResponseInfo#getReceivedByteCount()");
    }

    public java.lang.String getUrl() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlResponseInfo#getUrl()");
    }

    public boolean wasCached() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.UrlResponseInfo#wasCached()");
    }

}
