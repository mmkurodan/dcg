// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.http;

public final class UrlResponseInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UrlResponseInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.http.UrlResponseInfo wrap(android.net.http.UrlResponseInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.UrlResponseInfo(real, (__DcgwBridgeToken) null);
    }

    public android.net.http.UrlResponseInfo getReal() {
        return (android.net.http.UrlResponseInfo) real;
    }

    public android.net.http.UrlResponseInfo unwrap() {
        return getReal();
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
