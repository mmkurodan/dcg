// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.http;

public final class SslError {
    private final android.net.http.SslError real;

    public SslError(android.net.http.SslError real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.http.SslError wrap(android.net.http.SslError real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.SslError(real);
    }

    public android.net.http.SslError unwrap() {
        return real;
    }

    public SslError(int arg0, java.security.cert.X509Certificate arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.SslError#android.net.http.SslError(int,java.security.cert.X509Certificate)");
    }

    public SslError(int arg0, com.micklab.dcg.wrapper.android.net.http.SslCertificate arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.SslError#android.net.http.SslError(int,android.net.http.SslCertificate)");
    }

    public SslError(int arg0, java.security.cert.X509Certificate arg1, java.lang.String arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.SslError#android.net.http.SslError(int,java.security.cert.X509Certificate,java.lang.String)");
    }

    public SslError(int arg0, com.micklab.dcg.wrapper.android.net.http.SslCertificate arg1, java.lang.String arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.SslError#android.net.http.SslError(int,android.net.http.SslCertificate,java.lang.String)");
    }

    public boolean addError(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.SslError#addError(int)");
    }

    public com.micklab.dcg.wrapper.android.net.http.SslCertificate getCertificate() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.SslError#getCertificate()");
    }

    public int getPrimaryError() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.SslError#getPrimaryError()");
    }

    public java.lang.String getUrl() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.SslError#getUrl()");
    }

    public boolean hasError(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.SslError#hasError(int)");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.SslError#toString()");
    }


}
