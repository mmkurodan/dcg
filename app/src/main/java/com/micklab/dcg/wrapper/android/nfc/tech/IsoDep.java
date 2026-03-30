// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.tech;

public final class IsoDep {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IsoDep(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.IsoDep wrap(android.nfc.tech.IsoDep real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.tech.IsoDep(real, (__DcgwBridgeToken) null);
    }

    public android.nfc.tech.IsoDep getReal() {
        return (android.nfc.tech.IsoDep) real;
    }

    public android.nfc.tech.IsoDep unwrap() {
        return getReal();
    }

    public void close() throws java.io.IOException {
        ((android.nfc.tech.IsoDep) real).close();
    }

    public void connect() throws java.io.IOException {
        ((android.nfc.tech.IsoDep) real).connect();
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.IsoDep get(com.micklab.dcg.wrapper.android.nfc.Tag arg0) {
        return com.micklab.dcg.wrapper.android.nfc.tech.IsoDep.wrap(android.nfc.tech.IsoDep.get(arg0 == null ? null : arg0.getReal()));
    }

    public byte[] getHiLayerResponse() {
        return ((android.nfc.tech.IsoDep) real).getHiLayerResponse();
    }

    public byte[] getHistoricalBytes() {
        return ((android.nfc.tech.IsoDep) real).getHistoricalBytes();
    }

    public int getMaxTransceiveLength() {
        return ((android.nfc.tech.IsoDep) real).getMaxTransceiveLength();
    }

    public com.micklab.dcg.wrapper.android.nfc.Tag getTag() {
        return com.micklab.dcg.wrapper.android.nfc.Tag.wrap(((android.nfc.tech.IsoDep) real).getTag());
    }

    public int getTimeout() {
        return ((android.nfc.tech.IsoDep) real).getTimeout();
    }

    public boolean isConnected() {
        return ((android.nfc.tech.IsoDep) real).isConnected();
    }

    public boolean isExtendedLengthApduSupported() {
        return ((android.nfc.tech.IsoDep) real).isExtendedLengthApduSupported();
    }

    public void setTimeout(int arg0) {
        ((android.nfc.tech.IsoDep) real).setTimeout(arg0);
    }

    public byte[] transceive(byte[] arg0) throws java.io.IOException {
        return ((android.nfc.tech.IsoDep) real).transceive(arg0);
    }

}
