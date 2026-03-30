// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class ParcelFormatException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ParcelFormatException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.ParcelFormatException wrap(android.os.ParcelFormatException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.ParcelFormatException(real, (__DcgwBridgeToken) null);
    }

    public android.os.ParcelFormatException getReal() {
        return (android.os.ParcelFormatException) real;
    }

    public android.os.ParcelFormatException unwrap() {
        return getReal();
    }

    public ParcelFormatException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFormatException#android.os.ParcelFormatException()");
    }

    public ParcelFormatException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.ParcelFormatException#android.os.ParcelFormatException(java.lang.String)");
    }

}
