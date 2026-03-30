// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc;

public final class FormatException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FormatException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.FormatException wrap(android.nfc.FormatException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.FormatException(real, (__DcgwBridgeToken) null);
    }

    public android.nfc.FormatException getReal() {
        return (android.nfc.FormatException) real;
    }

    public android.nfc.FormatException unwrap() {
        return getReal();
    }

    public FormatException() {
        this(new android.nfc.FormatException(), (__DcgwBridgeToken) null);
    }

    public FormatException(java.lang.String arg0) {
        this(new android.nfc.FormatException(arg0), (__DcgwBridgeToken) null);
    }

    public FormatException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.nfc.FormatException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
