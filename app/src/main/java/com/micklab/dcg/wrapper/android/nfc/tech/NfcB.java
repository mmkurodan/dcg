// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.tech;

public final class NfcB {
    private final android.nfc.tech.NfcB real;

    public NfcB(android.nfc.tech.NfcB real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.NfcB wrap(android.nfc.tech.NfcB real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.tech.NfcB(real);
    }

    public android.nfc.tech.NfcB unwrap() {
        return real;
    }

    public void close() throws java.io.IOException {
        real.close();
    }

    public void connect() throws java.io.IOException {
        real.connect();
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.NfcB get(com.micklab.dcg.wrapper.android.nfc.Tag arg0) {
        return com.micklab.dcg.wrapper.android.nfc.tech.NfcB.wrap(android.nfc.tech.NfcB.get(arg0 == null ? null : arg0.unwrap()));
    }

    public byte[] getApplicationData() {
        return real.getApplicationData();
    }

    public int getMaxTransceiveLength() {
        return real.getMaxTransceiveLength();
    }

    public byte[] getProtocolInfo() {
        return real.getProtocolInfo();
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
