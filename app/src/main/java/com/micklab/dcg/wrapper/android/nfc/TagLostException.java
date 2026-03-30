// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc;

public final class TagLostException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TagLostException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.TagLostException wrap(android.nfc.TagLostException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.TagLostException(real, (__DcgwBridgeToken) null);
    }

    public android.nfc.TagLostException getReal() {
        return (android.nfc.TagLostException) real;
    }

    public android.nfc.TagLostException unwrap() {
        return getReal();
    }

    public TagLostException() {
        this(new android.nfc.TagLostException(), (__DcgwBridgeToken) null);
    }

    public TagLostException(java.lang.String arg0) {
        this(new android.nfc.TagLostException(arg0), (__DcgwBridgeToken) null);
    }

}
