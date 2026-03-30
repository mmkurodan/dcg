// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class FileUriExposedException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FileUriExposedException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.FileUriExposedException wrap(android.os.FileUriExposedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.FileUriExposedException(real, (__DcgwBridgeToken) null);
    }

    public android.os.FileUriExposedException getReal() {
        return (android.os.FileUriExposedException) real;
    }

    public android.os.FileUriExposedException unwrap() {
        return getReal();
    }

    public FileUriExposedException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.FileUriExposedException#android.os.FileUriExposedException(java.lang.String)");
    }

}
