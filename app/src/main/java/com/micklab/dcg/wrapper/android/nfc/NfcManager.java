// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc;

public final class NfcManager {
    private final android.nfc.NfcManager real;

    public NfcManager(android.nfc.NfcManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.NfcManager wrap(android.nfc.NfcManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.NfcManager(real);
    }

    public android.nfc.NfcManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.nfc.NfcAdapter getDefaultAdapter() {
        return com.micklab.dcg.wrapper.android.nfc.NfcAdapter.wrap(real.getDefaultAdapter());
    }

}
