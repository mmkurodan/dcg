// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.tech;

public final class NdefFormatable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NdefFormatable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.NdefFormatable wrap(android.nfc.tech.NdefFormatable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.tech.NdefFormatable(real, (__DcgwBridgeToken) null);
    }

    public android.nfc.tech.NdefFormatable getReal() {
        return (android.nfc.tech.NdefFormatable) real;
    }

    public android.nfc.tech.NdefFormatable unwrap() {
        return getReal();
    }

    public void close() throws java.io.IOException {
        ((android.nfc.tech.NdefFormatable) real).close();
    }

    public void connect() throws java.io.IOException {
        ((android.nfc.tech.NdefFormatable) real).connect();
    }

    public void format(com.micklab.dcg.wrapper.android.nfc.NdefMessage arg0) throws android.nfc.FormatException, java.io.IOException {
        ((android.nfc.tech.NdefFormatable) real).format(arg0 == null ? null : arg0.getReal());
    }

    public void formatReadOnly(com.micklab.dcg.wrapper.android.nfc.NdefMessage arg0) throws android.nfc.FormatException, java.io.IOException {
        ((android.nfc.tech.NdefFormatable) real).formatReadOnly(arg0 == null ? null : arg0.getReal());
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.NdefFormatable get(com.micklab.dcg.wrapper.android.nfc.Tag arg0) {
        return com.micklab.dcg.wrapper.android.nfc.tech.NdefFormatable.wrap(android.nfc.tech.NdefFormatable.get(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.nfc.Tag getTag() {
        return com.micklab.dcg.wrapper.android.nfc.Tag.wrap(((android.nfc.tech.NdefFormatable) real).getTag());
    }

    public boolean isConnected() {
        return ((android.nfc.tech.NdefFormatable) real).isConnected();
    }

}
