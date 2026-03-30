// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.tech;

public final class IsoDep {
    private final android.nfc.tech.IsoDep real;

    public IsoDep(android.nfc.tech.IsoDep real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.IsoDep wrap(android.nfc.tech.IsoDep real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.tech.IsoDep(real);
    }

    public android.nfc.tech.IsoDep unwrap() {
        return real;
    }

    public void close() throws java.io.IOException {
        real.close();
    }

    public void connect() throws java.io.IOException {
        real.connect();
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.IsoDep get(com.micklab.dcg.wrapper.android.nfc.Tag arg0) {
        return com.micklab.dcg.wrapper.android.nfc.tech.IsoDep.wrap(android.nfc.tech.IsoDep.get(arg0 == null ? null : arg0.unwrap()));
    }

    public byte[] getHiLayerResponse() {
        return real.getHiLayerResponse();
    }

    public byte[] getHistoricalBytes() {
        return real.getHistoricalBytes();
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

    public boolean isConnected() {
        return real.isConnected();
    }

    public boolean isExtendedLengthApduSupported() {
        return real.isExtendedLengthApduSupported();
    }

    public void setTimeout(int arg0) {
        real.setTimeout(arg0);
    }

    public byte[] transceive(byte[] arg0) throws java.io.IOException {
        return real.transceive(arg0);
    }

}
