// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class SecureKeyImportUnavailableException {
    private final android.security.keystore.SecureKeyImportUnavailableException real;

    public SecureKeyImportUnavailableException(android.security.keystore.SecureKeyImportUnavailableException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.SecureKeyImportUnavailableException wrap(android.security.keystore.SecureKeyImportUnavailableException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.SecureKeyImportUnavailableException(real);
    }

    public android.security.keystore.SecureKeyImportUnavailableException unwrap() {
        return real;
    }

    public SecureKeyImportUnavailableException() {
        this(new android.security.keystore.SecureKeyImportUnavailableException());
    }

    public SecureKeyImportUnavailableException(java.lang.Throwable arg0) {
        this(new android.security.keystore.SecureKeyImportUnavailableException(arg0));
    }

    public SecureKeyImportUnavailableException(java.lang.String arg0) {
        this(new android.security.keystore.SecureKeyImportUnavailableException(arg0));
    }

    public SecureKeyImportUnavailableException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.keystore.SecureKeyImportUnavailableException(arg0, arg1));
    }

}
