// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc;

public final class FormatException {
    private final android.nfc.FormatException real;

    public FormatException(android.nfc.FormatException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.FormatException wrap(android.nfc.FormatException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.FormatException(real);
    }

    public android.nfc.FormatException unwrap() {
        return real;
    }

    public FormatException() {
        this(new android.nfc.FormatException());
    }

    public FormatException(java.lang.String arg0) {
        this(new android.nfc.FormatException(arg0));
    }

    public FormatException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.nfc.FormatException(arg0, arg1));
    }

}
