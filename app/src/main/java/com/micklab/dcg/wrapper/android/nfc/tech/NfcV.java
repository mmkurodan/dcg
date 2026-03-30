// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.tech;

public final class NfcV {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NfcV(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.NfcV wrap(android.nfc.tech.NfcV real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.tech.NfcV(real, (__DcgwBridgeToken) null);
    }

    public android.nfc.tech.NfcV getReal() {
        return (android.nfc.tech.NfcV) real;
    }

    public android.nfc.tech.NfcV unwrap() {
        return getReal();
    }

    public void close() throws java.io.IOException {
        ((android.nfc.tech.NfcV) real).close();
    }

    public void connect() throws java.io.IOException {
        ((android.nfc.tech.NfcV) real).connect();
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.NfcV get(com.micklab.dcg.wrapper.android.nfc.Tag arg0) {
        return com.micklab.dcg.wrapper.android.nfc.tech.NfcV.wrap(android.nfc.tech.NfcV.get(arg0 == null ? null : arg0.getReal()));
    }

    public byte getDsfId() {
        return ((android.nfc.tech.NfcV) real).getDsfId();
    }

    public int getMaxTransceiveLength() {
        return ((android.nfc.tech.NfcV) real).getMaxTransceiveLength();
    }

    public byte getResponseFlags() {
        return ((android.nfc.tech.NfcV) real).getResponseFlags();
    }

    public com.micklab.dcg.wrapper.android.nfc.Tag getTag() {
        return com.micklab.dcg.wrapper.android.nfc.Tag.wrap(((android.nfc.tech.NfcV) real).getTag());
    }

    public boolean isConnected() {
        return ((android.nfc.tech.NfcV) real).isConnected();
    }

    public byte[] transceive(byte[] arg0) throws java.io.IOException {
        return ((android.nfc.tech.NfcV) real).transceive(arg0);
    }

}
