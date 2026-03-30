// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.tech;

public final class NfcA {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NfcA(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.NfcA wrap(android.nfc.tech.NfcA real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.tech.NfcA(real, (__DcgwBridgeToken) null);
    }

    public android.nfc.tech.NfcA getReal() {
        return (android.nfc.tech.NfcA) real;
    }

    public android.nfc.tech.NfcA unwrap() {
        return getReal();
    }

    public void close() throws java.io.IOException {
        ((android.nfc.tech.NfcA) real).close();
    }

    public void connect() throws java.io.IOException {
        ((android.nfc.tech.NfcA) real).connect();
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.NfcA get(com.micklab.dcg.wrapper.android.nfc.Tag arg0) {
        return com.micklab.dcg.wrapper.android.nfc.tech.NfcA.wrap(android.nfc.tech.NfcA.get(arg0 == null ? null : arg0.getReal()));
    }

    public byte[] getAtqa() {
        return ((android.nfc.tech.NfcA) real).getAtqa();
    }

    public int getMaxTransceiveLength() {
        return ((android.nfc.tech.NfcA) real).getMaxTransceiveLength();
    }

    public short getSak() {
        return ((android.nfc.tech.NfcA) real).getSak();
    }

    public com.micklab.dcg.wrapper.android.nfc.Tag getTag() {
        return com.micklab.dcg.wrapper.android.nfc.Tag.wrap(((android.nfc.tech.NfcA) real).getTag());
    }

    public int getTimeout() {
        return ((android.nfc.tech.NfcA) real).getTimeout();
    }

    public boolean isConnected() {
        return ((android.nfc.tech.NfcA) real).isConnected();
    }

    public void setTimeout(int arg0) {
        ((android.nfc.tech.NfcA) real).setTimeout(arg0);
    }

    public byte[] transceive(byte[] arg0) throws java.io.IOException {
        return ((android.nfc.tech.NfcA) real).transceive(arg0);
    }

}
