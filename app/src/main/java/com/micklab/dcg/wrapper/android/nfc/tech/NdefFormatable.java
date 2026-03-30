// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.tech;

public final class NdefFormatable {
    private final android.nfc.tech.NdefFormatable real;

    public NdefFormatable(android.nfc.tech.NdefFormatable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.NdefFormatable wrap(android.nfc.tech.NdefFormatable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.tech.NdefFormatable(real);
    }

    public android.nfc.tech.NdefFormatable unwrap() {
        return real;
    }

    public void close() throws java.io.IOException {
        real.close();
    }

    public void connect() throws java.io.IOException {
        real.connect();
    }

    public void format(com.micklab.dcg.wrapper.android.nfc.NdefMessage arg0) throws android.nfc.FormatException, java.io.IOException {
        real.format(arg0 == null ? null : arg0.unwrap());
    }

    public void formatReadOnly(com.micklab.dcg.wrapper.android.nfc.NdefMessage arg0) throws android.nfc.FormatException, java.io.IOException {
        real.formatReadOnly(arg0 == null ? null : arg0.unwrap());
    }

    public static com.micklab.dcg.wrapper.android.nfc.tech.NdefFormatable get(com.micklab.dcg.wrapper.android.nfc.Tag arg0) {
        return com.micklab.dcg.wrapper.android.nfc.tech.NdefFormatable.wrap(android.nfc.tech.NdefFormatable.get(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.nfc.Tag getTag() {
        return com.micklab.dcg.wrapper.android.nfc.Tag.wrap(real.getTag());
    }

    public boolean isConnected() {
        return real.isConnected();
    }

}
