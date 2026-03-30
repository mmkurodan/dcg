// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.tech;

public final class Ndef {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Ndef(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.Ndef wrap(android.nfc.tech.Ndef real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.tech.Ndef(real, (__DcgwBridgeToken) null);
    }

    public android.nfc.tech.Ndef getReal() {
        return (android.nfc.tech.Ndef) real;
    }

    public android.nfc.tech.Ndef unwrap() {
        return getReal();
    }

    public boolean canMakeReadOnly() {
        return ((android.nfc.tech.Ndef) real).canMakeReadOnly();
    }

    public void close() throws java.io.IOException {
        ((android.nfc.tech.Ndef) real).close();
    }

    public void connect() throws java.io.IOException {
        ((android.nfc.tech.Ndef) real).connect();
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.Ndef get(com.micklab.dcg.wrapper.android.nfc.Tag arg0) {
        return com.micklab.dcg.wrapper.android.nfc.tech.Ndef.wrap(android.nfc.tech.Ndef.get(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.nfc.NdefMessage getCachedNdefMessage() {
        return com.micklab.dcg.wrapper.android.nfc.NdefMessage.wrap(((android.nfc.tech.Ndef) real).getCachedNdefMessage());
    }

    public int getMaxSize() {
        return ((android.nfc.tech.Ndef) real).getMaxSize();
    }

    public com.micklab.dcg.wrapper.android.nfc.NdefMessage getNdefMessage() throws android.nfc.FormatException, java.io.IOException {
        return com.micklab.dcg.wrapper.android.nfc.NdefMessage.wrap(((android.nfc.tech.Ndef) real).getNdefMessage());
    }

    public com.micklab.dcg.wrapper.android.nfc.Tag getTag() {
        return com.micklab.dcg.wrapper.android.nfc.Tag.wrap(((android.nfc.tech.Ndef) real).getTag());
    }

    public java.lang.String getType() {
        return ((android.nfc.tech.Ndef) real).getType();
    }

    public boolean isConnected() {
        return ((android.nfc.tech.Ndef) real).isConnected();
    }

    public boolean isWritable() {
        return ((android.nfc.tech.Ndef) real).isWritable();
    }

    public boolean makeReadOnly() throws java.io.IOException {
        return ((android.nfc.tech.Ndef) real).makeReadOnly();
    }

    public void writeNdefMessage(com.micklab.dcg.wrapper.android.nfc.NdefMessage arg0) throws android.nfc.FormatException, java.io.IOException {
        ((android.nfc.tech.Ndef) real).writeNdefMessage(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String MIFARE_CLASSIC = android.nfc.tech.Ndef.MIFARE_CLASSIC;
    public static final java.lang.String NFC_FORUM_TYPE_1 = android.nfc.tech.Ndef.NFC_FORUM_TYPE_1;
    public static final java.lang.String NFC_FORUM_TYPE_2 = android.nfc.tech.Ndef.NFC_FORUM_TYPE_2;
    public static final java.lang.String NFC_FORUM_TYPE_3 = android.nfc.tech.Ndef.NFC_FORUM_TYPE_3;
    public static final java.lang.String NFC_FORUM_TYPE_4 = android.nfc.tech.Ndef.NFC_FORUM_TYPE_4;

}
