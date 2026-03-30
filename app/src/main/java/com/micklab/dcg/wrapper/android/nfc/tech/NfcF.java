// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.tech;

public final class NfcF {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NfcF(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.NfcF wrap(android.nfc.tech.NfcF real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.tech.NfcF(real, (__DcgwBridgeToken) null);
    }

    public android.nfc.tech.NfcF getReal() {
        return (android.nfc.tech.NfcF) real;
    }

    public android.nfc.tech.NfcF unwrap() {
        return getReal();
    }

    public void close() throws java.io.IOException {
        ((android.nfc.tech.NfcF) real).close();
    }

    public void connect() throws java.io.IOException {
        ((android.nfc.tech.NfcF) real).connect();
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.NfcF get(com.micklab.dcg.wrapper.android.nfc.Tag arg0) {
        return com.micklab.dcg.wrapper.android.nfc.tech.NfcF.wrap(android.nfc.tech.NfcF.get(arg0 == null ? null : arg0.getReal()));
    }

    public byte[] getManufacturer() {
        return ((android.nfc.tech.NfcF) real).getManufacturer();
    }

    public int getMaxTransceiveLength() {
        return ((android.nfc.tech.NfcF) real).getMaxTransceiveLength();
    }

    public byte[] getSystemCode() {
        return ((android.nfc.tech.NfcF) real).getSystemCode();
    }

    public com.micklab.dcg.wrapper.android.nfc.Tag getTag() {
        return com.micklab.dcg.wrapper.android.nfc.Tag.wrap(((android.nfc.tech.NfcF) real).getTag());
    }

    public int getTimeout() {
        return ((android.nfc.tech.NfcF) real).getTimeout();
    }

    public boolean isConnected() {
        return ((android.nfc.tech.NfcF) real).isConnected();
    }

    public void setTimeout(int arg0) {
        ((android.nfc.tech.NfcF) real).setTimeout(arg0);
    }

    public byte[] transceive(byte[] arg0) throws java.io.IOException {
        return ((android.nfc.tech.NfcF) real).transceive(arg0);
    }

}
