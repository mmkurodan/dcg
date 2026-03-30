// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class ParcelFormatException {
    private final android.os.ParcelFormatException real;

    public ParcelFormatException(android.os.ParcelFormatException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.ParcelFormatException wrap(android.os.ParcelFormatException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.ParcelFormatException(real);
    }

    public android.os.ParcelFormatException unwrap() {
        return real;
    }

    public ParcelFormatException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFormatException#android.os.ParcelFormatException()");
    }

    public ParcelFormatException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFormatException#android.os.ParcelFormatException(java.lang.String)");
    }

}
