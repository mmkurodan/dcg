// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.tech;

public final class NfcA {
    private final android.nfc.tech.NfcA real;

    public NfcA(android.nfc.tech.NfcA real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.NfcA wrap(android.nfc.tech.NfcA real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.tech.NfcA(real);
    }

    public android.nfc.tech.NfcA unwrap() {
        return real;
    }

    public void close() throws java.io.IOException {
        real.close();
    }

    public void connect() throws java.io.IOException {
        real.connect();
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.NfcA get(com.micklab.dcg.wrapper.android.nfc.Tag arg0) {
        return com.micklab.dcg.wrapper.android.nfc.tech.NfcA.wrap(android.nfc.tech.NfcA.get(arg0 == null ? null : arg0.unwrap()));
    }

    public byte[] getAtqa() {
        return real.getAtqa();
    }

    public int getMaxTransceiveLength() {
        return real.getMaxTransceiveLength();
    }

    public short getSak() {
        return real.getSak();
    }

    public com.micklab.dcg.wrapper.android.nfc.Tag getTag() {
        return com.micklab.dcg.wrapper.android.nfc.Tag.wrap(real.getTag());
    }

    public int getTimeout() {
        return real.getTimeout();
    }

    public boolean isConnected() {
        return real.isConnected();
    }

    public void setTimeout(int arg0) {
        real.setTimeout(arg0);
    }

    public byte[] transceive(byte[] arg0) throws java.io.IOException {
        return real.transceive(arg0);
    }

}
