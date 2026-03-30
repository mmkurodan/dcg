// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class SecureKeyImportUnavailableException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SecureKeyImportUnavailableException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.SecureKeyImportUnavailableException wrap(android.security.keystore.SecureKeyImportUnavailableException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.SecureKeyImportUnavailableException(real, (__DcgwBridgeToken) null);
    }

    public android.security.keystore.SecureKeyImportUnavailableException getReal() {
        return (android.security.keystore.SecureKeyImportUnavailableException) real;
    }

    public android.security.keystore.SecureKeyImportUnavailableException unwrap() {
        return getReal();
    }

    public SecureKeyImportUnavailableException() {
        this(new android.security.keystore.SecureKeyImportUnavailableException(), (__DcgwBridgeToken) null);
    }

    public SecureKeyImportUnavailableException(java.lang.Throwable arg0) {
        this(new android.security.keystore.SecureKeyImportUnavailableException(arg0), (__DcgwBridgeToken) null);
    }

    public SecureKeyImportUnavailableException(java.lang.String arg0) {
        this(new android.security.keystore.SecureKeyImportUnavailableException(arg0), (__DcgwBridgeToken) null);
    }

    public SecureKeyImportUnavailableException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.keystore.SecureKeyImportUnavailableException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
