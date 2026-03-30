// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc;

public final class TagLostException {
    private final android.nfc.TagLostException real;

    public TagLostException(android.nfc.TagLostException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.TagLostException wrap(android.nfc.TagLostException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.TagLostException(real);
    }

    public android.nfc.TagLostException unwrap() {
        return real;
    }

    public TagLostException() {
        this(new android.nfc.TagLostException());
    }

    public TagLostException(java.lang.String arg0) {
        this(new android.nfc.TagLostException(arg0));
    }

}
