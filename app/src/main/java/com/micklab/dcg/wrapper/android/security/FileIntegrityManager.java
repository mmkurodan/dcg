// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class FileIntegrityManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FileIntegrityManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.FileIntegrityManager wrap(android.security.FileIntegrityManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.FileIntegrityManager(real, (__DcgwBridgeToken) null);
    }

    public android.security.FileIntegrityManager getReal() {
        return (android.security.FileIntegrityManager) real;
    }

    public android.security.FileIntegrityManager unwrap() {
        return getReal();
    }

    public boolean isApkVeritySupported() {
        return ((android.security.FileIntegrityManager) real).isApkVeritySupported();
    }

    public boolean isAppSourceCertificateTrusted(java.security.cert.X509Certificate arg0) throws java.security.cert.CertificateEncodingException {
        return ((android.security.FileIntegrityManager) real).isAppSourceCertificateTrusted(arg0);
    }

}
