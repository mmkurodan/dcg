// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.tech;

public final class MifareUltralight {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MifareUltralight(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.MifareUltralight wrap(android.nfc.tech.MifareUltralight real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.tech.MifareUltralight(real, (__DcgwBridgeToken) null);
    }

    public android.nfc.tech.MifareUltralight getReal() {
        return (android.nfc.tech.MifareUltralight) real;
    }

    public android.nfc.tech.MifareUltralight unwrap() {
        return getReal();
    }

    public void close() throws java.io.IOException {
        ((android.nfc.tech.MifareUltralight) real).close();
    }

    public void connect() throws java.io.IOException {
        ((android.nfc.tech.MifareUltralight) real).connect();
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.MifareUltralight get(com.micklab.dcg.wrapper.android.nfc.Tag arg0) {
        return com.micklab.dcg.wrapper.android.nfc.tech.MifareUltralight.wrap(android.nfc.tech.MifareUltralight.get(arg0 == null ? null : arg0.getReal()));
    }

    public int getMaxTransceiveLength() {
        return ((android.nfc.tech.MifareUltralight) real).getMaxTransceiveLength();
    }

    public com.micklab.dcg.wrapper.android.nfc.Tag getTag() {
        return com.micklab.dcg.wrapper.android.nfc.Tag.wrap(((android.nfc.tech.MifareUltralight) real).getTag());
    }

    public int getTimeout() {
        return ((android.nfc.tech.MifareUltralight) real).getTimeout();
    }

    public int getType() {
        return ((android.nfc.tech.MifareUltralight) real).getType();
    }

    public boolean isConnected() {
        return ((android.nfc.tech.MifareUltralight) real).isConnected();
    }

    public byte[] readPages(int arg0) throws java.io.IOException {
        return ((android.nfc.tech.MifareUltralight) real).readPages(arg0);
    }

    public void setTimeout(int arg0) {
        ((android.nfc.tech.MifareUltralight) real).setTimeout(arg0);
    }

    public byte[] transceive(byte[] arg0) throws java.io.IOException {
        return ((android.nfc.tech.MifareUltralight) real).transceive(arg0);
    }

    public void writePage(int arg0, byte[] arg1) throws java.io.IOException {
        ((android.nfc.tech.MifareUltralight) real).writePage(arg0, arg1);
    }

    public static final int PAGE_SIZE = android.nfc.tech.MifareUltralight.PAGE_SIZE;
    public static final int TYPE_ULTRALIGHT = android.nfc.tech.MifareUltralight.TYPE_ULTRALIGHT;
    public static final int TYPE_ULTRALIGHT_C = android.nfc.tech.MifareUltralight.TYPE_ULTRALIGHT_C;
    public static final int TYPE_UNKNOWN = android.nfc.tech.MifareUltralight.TYPE_UNKNOWN;

}
