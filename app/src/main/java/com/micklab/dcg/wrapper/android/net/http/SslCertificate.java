// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.http;

public final class SslCertificate {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SslCertificate(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.http.SslCertificate wrap(android.net.http.SslCertificate real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.SslCertificate(real, (__DcgwBridgeToken) null);
    }

    public android.net.http.SslCertificate getReal() {
        return (android.net.http.SslCertificate) real;
    }

    public android.net.http.SslCertificate unwrap() {
        return getReal();
    }

    public SslCertificate(java.security.cert.X509Certificate arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.SslCertificate#android.net.http.SslCertificate(java.security.cert.X509Certificate)");
    }

    public SslCertificate(java.lang.String arg0, java.lang.String arg1, java.util.Date arg2, java.util.Date arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.SslCertificate#android.net.http.SslCertificate(java.lang.String,java.lang.String,java.util.Date,java.util.Date)");
    }

    public SslCertificate(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.SslCertificate#android.net.http.SslCertificate(java.lang.String,java.lang.String,java.lang.String,java.lang.String)");
    }

    public android.net.http.SslCertificate.DName getIssuedBy() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.SslCertificate#getIssuedBy()");
    }

    public android.net.http.SslCertificate.DName getIssuedTo() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.SslCertificate#getIssuedTo()");
    }

    public java.lang.String getValidNotAfter() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.SslCertificate#getValidNotAfter()");
    }

    public java.util.Date getValidNotAfterDate() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.SslCertificate#getValidNotAfterDate()");
    }

    public java.lang.String getValidNotBefore() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.SslCertificate#getValidNotBefore()");
    }

    public java.util.Date getValidNotBeforeDate() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.SslCertificate#getValidNotBeforeDate()");
    }

    public java.security.cert.X509Certificate getX509Certificate() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.SslCertificate#getX509Certificate()");
    }

    public static com.micklab.dcg.wrapper.android.net.http.SslCertificate restoreState(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.SslCertificate#restoreState(android.os.Bundle)");
    }

    public static com.micklab.dcg.wrapper.android.os.Bundle saveState(com.micklab.dcg.wrapper.android.net.http.SslCertificate arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.SslCertificate#saveState(android.net.http.SslCertificate)");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.SslCertificate#toString()");
    }

}
