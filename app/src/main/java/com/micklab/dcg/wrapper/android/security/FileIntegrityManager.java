// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class FileIntegrityManager {
    private final android.security.FileIntegrityManager real;

    public FileIntegrityManager(android.security.FileIntegrityManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.FileIntegrityManager wrap(android.security.FileIntegrityManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.FileIntegrityManager(real);
    }

    public android.security.FileIntegrityManager unwrap() {
        return real;
    }

    public boolean isApkVeritySupported() {
        return real.isApkVeritySupported();
    }

    public boolean isAppSourceCertificateTrusted(java.security.cert.X509Certificate arg0) throws java.security.cert.CertificateEncodingException {
        return real.isAppSourceCertificateTrusted(arg0);
    }

}
