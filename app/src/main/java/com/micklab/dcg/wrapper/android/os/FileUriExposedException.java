// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class FileUriExposedException {
    private final android.os.FileUriExposedException real;

    public FileUriExposedException(android.os.FileUriExposedException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.FileUriExposedException wrap(android.os.FileUriExposedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.FileUriExposedException(real);
    }

    public android.os.FileUriExposedException unwrap() {
        return real;
    }

    public FileUriExposedException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.FileUriExposedException#android.os.FileUriExposedException(java.lang.String)");
    }

}
