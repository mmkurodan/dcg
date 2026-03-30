// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.tech;

public final class MifareUltralight {
    private final android.nfc.tech.MifareUltralight real;

    public MifareUltralight(android.nfc.tech.MifareUltralight real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.MifareUltralight wrap(android.nfc.tech.MifareUltralight real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.tech.MifareUltralight(real);
    }

    public android.nfc.tech.MifareUltralight unwrap() {
        return real;
    }

    public void close() throws java.io.IOException {
        real.close();
    }

    public void connect() throws java.io.IOException {
        real.connect();
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.MifareUltralight get(com.micklab.dcg.wrapper.android.nfc.Tag arg0) {
        return com.micklab.dcg.wrapper.android.nfc.tech.MifareUltralight.wrap(android.nfc.tech.MifareUltralight.get(arg0 == null ? null : arg0.unwrap()));
    }

    public int getMaxTransceiveLength() {
        return real.getMaxTransceiveLength();
    }

    public com.micklab.dcg.wrapper.android.nfc.Tag getTag() {
        return com.micklab.dcg.wrapper.android.nfc.Tag.wrap(real.getTag());
    }

    public int getTimeout() {
        return real.getTimeout();
    }

    public int getType() {
        return real.getType();
    }

    public boolean isConnected() {
        return real.isConnected();
    }

    public byte[] readPages(int arg0) throws java.io.IOException {
        return real.readPages(arg0);
    }

    public void setTimeout(int arg0) {
        real.setTimeout(arg0);
    }

    public byte[] transceive(byte[] arg0) throws java.io.IOException {
        return real.transceive(arg0);
    }

    public void writePage(int arg0, byte[] arg1) throws java.io.IOException {
        real.writePage(arg0, arg1);
    }

    public static final int PAGE_SIZE = android.nfc.tech.MifareUltralight.PAGE_SIZE;
    public static final int TYPE_ULTRALIGHT = android.nfc.tech.MifareUltralight.TYPE_ULTRALIGHT;
    public static final int TYPE_ULTRALIGHT_C = android.nfc.tech.MifareUltralight.TYPE_ULTRALIGHT_C;
    public static final int TYPE_UNKNOWN = android.nfc.tech.MifareUltralight.TYPE_UNKNOWN;

}
