// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.tech;

public final class NfcB {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NfcB(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.NfcB wrap(android.nfc.tech.NfcB real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.tech.NfcB(real, (__DcgwBridgeToken) null);
    }

    public android.nfc.tech.NfcB getReal() {
        return (android.nfc.tech.NfcB) real;
    }

    public android.nfc.tech.NfcB unwrap() {
        return getReal();
    }

    public void close() throws java.io.IOException {
        ((android.nfc.tech.NfcB) real).close();
    }

    public void connect() throws java.io.IOException {
        ((android.nfc.tech.NfcB) real).connect();
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.NfcB get(com.micklab.dcg.wrapper.android.nfc.Tag arg0) {
        return com.micklab.dcg.wrapper.android.nfc.tech.NfcB.wrap(android.nfc.tech.NfcB.get(arg0 == null ? null : arg0.getReal()));
    }

    public byte[] getApplicationData() {
        return ((android.nfc.tech.NfcB) real).getApplicationData();
    }

    public int getMaxTransceiveLength() {
        return ((android.nfc.tech.NfcB) real).getMaxTransceiveLength();
    }

    public byte[] getProtocolInfo() {
        return ((android.nfc.tech.NfcB) real).getProtocolInfo();
    }

    public com.micklab.dcg.wrapper.android.nfc.Tag getTag() {
        return com.micklab.dcg.wrapper.android.nfc.Tag.wrap(((android.nfc.tech.NfcB) real).getTag());
    }

    public boolean isConnected() {
        return ((android.nfc.tech.NfcB) real).isConnected();
    }

    public byte[] transceive(byte[] arg0) throws java.io.IOException {
        return ((android.nfc.tech.NfcB) real).transceive(arg0);
    }

}
