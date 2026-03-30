// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.tech;

public final class NfcBarcode {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NfcBarcode(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.NfcBarcode wrap(android.nfc.tech.NfcBarcode real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.tech.NfcBarcode(real, (__DcgwBridgeToken) null);
    }

    public android.nfc.tech.NfcBarcode getReal() {
        return (android.nfc.tech.NfcBarcode) real;
    }

    public android.nfc.tech.NfcBarcode unwrap() {
        return getReal();
    }

    public void close() throws java.io.IOException {
        ((android.nfc.tech.NfcBarcode) real).close();
    }

    public void connect() throws java.io.IOException {
        ((android.nfc.tech.NfcBarcode) real).connect();
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.NfcBarcode get(com.micklab.dcg.wrapper.android.nfc.Tag arg0) {
        return com.micklab.dcg.wrapper.android.nfc.tech.NfcBarcode.wrap(android.nfc.tech.NfcBarcode.get(arg0 == null ? null : arg0.getReal()));
    }

    public byte[] getBarcode() {
        return ((android.nfc.tech.NfcBarcode) real).getBarcode();
    }

    public com.micklab.dcg.wrapper.android.nfc.Tag getTag() {
        return com.micklab.dcg.wrapper.android.nfc.Tag.wrap(((android.nfc.tech.NfcBarcode) real).getTag());
    }

    public int getType() {
        return ((android.nfc.tech.NfcBarcode) real).getType();
    }

    public boolean isConnected() {
        return ((android.nfc.tech.NfcBarcode) real).isConnected();
    }

    public static final int TYPE_KOVIO = android.nfc.tech.NfcBarcode.TYPE_KOVIO;
    public static final int TYPE_UNKNOWN = android.nfc.tech.NfcBarcode.TYPE_UNKNOWN;

}
