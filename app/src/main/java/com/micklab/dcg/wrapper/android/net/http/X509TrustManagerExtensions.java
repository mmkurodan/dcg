// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.http;

public final class X509TrustManagerExtensions {
    private final android.net.http.X509TrustManagerExtensions real;

    public X509TrustManagerExtensions(android.net.http.X509TrustManagerExtensions real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.http.X509TrustManagerExtensions wrap(android.net.http.X509TrustManagerExtensions real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.X509TrustManagerExtensions(real);
    }

    public android.net.http.X509TrustManagerExtensions unwrap() {
        return real;
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
