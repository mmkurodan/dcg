// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.tech;

public final class NfcBarcode {
    private final android.nfc.tech.NfcBarcode real;

    public NfcBarcode(android.nfc.tech.NfcBarcode real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.NfcBarcode wrap(android.nfc.tech.NfcBarcode real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.tech.NfcBarcode(real);
    }

    public android.nfc.tech.NfcBarcode unwrap() {
        return real;
    }

    public void close() throws java.io.IOException {
        real.close();
    }

    public void connect() throws java.io.IOException {
        real.connect();
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.NfcBarcode get(com.micklab.dcg.wrapper.android.nfc.Tag arg0) {
        return com.micklab.dcg.wrapper.android.nfc.tech.NfcBarcode.wrap(android.nfc.tech.NfcBarcode.get(arg0 == null ? null : arg0.unwrap()));
    }

    public byte[] getBarcode() {
        return real.getBarcode();
    }

    public com.micklab.dcg.wrapper.android.nfc.Tag getTag() {
        return com.micklab.dcg.wrapper.android.nfc.Tag.wrap(real.getTag());
    }

    public int getType() {
        return real.getType();
    }

    public boolean isConnected() {
        return real.isConnected();
    }

    public static final int TYPE_KOVIO = android.nfc.tech.NfcBarcode.TYPE_KOVIO;
    public static final int TYPE_UNKNOWN = android.nfc.tech.NfcBarcode.TYPE_UNKNOWN;

}
