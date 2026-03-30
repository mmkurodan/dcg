// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.tech;

public final class Ndef {
    private final android.nfc.tech.Ndef real;

    public Ndef(android.nfc.tech.Ndef real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.Ndef wrap(android.nfc.tech.Ndef real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.tech.Ndef(real);
    }

    public android.nfc.tech.Ndef unwrap() {
        return real;
    }

    public boolean canMakeReadOnly() {
        return real.canMakeReadOnly();
    }

    public void close() throws java.io.IOException {
        real.close();
    }

    public void connect() throws java.io.IOException {
        real.connect();
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.Ndef get(com.micklab.dcg.wrapper.android.nfc.Tag arg0) {
        return com.micklab.dcg.wrapper.android.nfc.tech.Ndef.wrap(android.nfc.tech.Ndef.get(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.nfc.NdefMessage getCachedNdefMessage() {
        return com.micklab.dcg.wrapper.android.nfc.NdefMessage.wrap(real.getCachedNdefMessage());
    }

    public int getMaxSize() {
        return real.getMaxSize();
    }

    public com.micklab.dcg.wrapper.android.nfc.NdefMessage getNdefMessage() throws android.nfc.FormatException, java.io.IOException {
        return com.micklab.dcg.wrapper.android.nfc.NdefMessage.wrap(real.getNdefMessage());
    }

    public com.micklab.dcg.wrapper.android.nfc.Tag getTag() {
        return com.micklab.dcg.wrapper.android.nfc.Tag.wrap(real.getTag());
    }

    public java.lang.String getType() {
        return real.getType();
    }

    public boolean isConnected() {
        return real.isConnected();
    }

    public boolean isWritable() {
        return real.isWritable();
    }

    public boolean makeReadOnly() throws java.io.IOException {
        return real.makeReadOnly();
    }

    public void writeNdefMessage(com.micklab.dcg.wrapper.android.nfc.NdefMessage arg0) throws android.nfc.FormatException, java.io.IOException {
        real.writeNdefMessage(arg0 == null ? null : arg0.unwrap());
    }

    public static final java.lang.String MIFARE_CLASSIC = android.nfc.tech.Ndef.MIFARE_CLASSIC;
    public static final java.lang.String NFC_FORUM_TYPE_1 = android.nfc.tech.Ndef.NFC_FORUM_TYPE_1;
    public static final java.lang.String NFC_FORUM_TYPE_2 = android.nfc.tech.Ndef.NFC_FORUM_TYPE_2;
    public static final java.lang.String NFC_FORUM_TYPE_3 = android.nfc.tech.Ndef.NFC_FORUM_TYPE_3;
    public static final java.lang.String NFC_FORUM_TYPE_4 = android.nfc.tech.Ndef.NFC_FORUM_TYPE_4;

}
