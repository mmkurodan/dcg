// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.http;

public final class X509TrustManagerExtensions {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private X509TrustManagerExtensions(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.http.X509TrustManagerExtensions wrap(android.net.http.X509TrustManagerExtensions real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.X509TrustManagerExtensions(real, (__DcgwBridgeToken) null);
    }

    public android.net.http.X509TrustManagerExtensions getReal() {
        return (android.net.http.X509TrustManagerExtensions) real;
    }

    public android.net.http.X509TrustManagerExtensions unwrap() {
        return getReal();
    }

    public X509TrustManagerExtensions(javax.net.ssl.X509TrustManager arg0) throws java.lang.IllegalArgumentException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.X509TrustManagerExtensions#android.net.http.X509TrustManagerExtensions(javax.net.ssl.X509TrustManager)");
    }

    public boolean isSameTrustConfiguration(java.lang.String arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.X509TrustManagerExtensions#isSameTrustConfiguration(java.lang.String,java.lang.String)");
    }

    public boolean isUserAddedCertificate(java.security.cert.X509Certificate arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.X509TrustManagerExtensions#isUserAddedCertificate(java.security.cert.X509Certificate)");
    }

}
