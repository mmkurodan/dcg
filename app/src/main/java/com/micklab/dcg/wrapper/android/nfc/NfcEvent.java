// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc;

public final class NfcEvent {
    private final android.nfc.NfcEvent real;

    public NfcEvent(android.nfc.NfcEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.NfcEvent wrap(android.nfc.NfcEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.NfcEvent(real);
    }

    public android.nfc.NfcEvent unwrap() {
        return real;
    }


}
