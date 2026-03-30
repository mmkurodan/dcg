// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.tech;

public final class NfcV {
    private final android.nfc.tech.NfcV real;

    public NfcV(android.nfc.tech.NfcV real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.NfcV wrap(android.nfc.tech.NfcV real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.tech.NfcV(real);
    }

    public android.nfc.tech.NfcV unwrap() {
        return real;
    }

    public void close() throws java.io.IOException {
        real.close();
    }

    public void connect() throws java.io.IOException {
        real.connect();
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.NfcV get(com.micklab.dcg.wrapper.android.nfc.Tag arg0) {
        return com.micklab.dcg.wrapper.android.nfc.tech.NfcV.wrap(android.nfc.tech.NfcV.get(arg0 == null ? null : arg0.unwrap()));
    }

    public byte getDsfId() {
        return real.getDsfId();
    }

    public int getMaxTransceiveLength() {
        return real.getMaxTransceiveLength();
    }

    public byte getResponseFlags() {
        return real.getResponseFlags();
    }

    public com.micklab.dcg.wrapper.android.nfc.Tag getTag() {
        return com.micklab.dcg.wrapper.android.nfc.Tag.wrap(real.getTag());
    }

    public boolean isConnected() {
        return real.isConnected();
    }

    public byte[] transceive(byte[] arg0) throws java.io.IOException {
        return real.transceive(arg0);
    }

}
