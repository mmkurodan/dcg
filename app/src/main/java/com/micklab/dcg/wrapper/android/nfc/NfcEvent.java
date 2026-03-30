// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc;

public final class NfcEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NfcEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.NfcEvent wrap(android.nfc.NfcEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.NfcEvent(real, (__DcgwBridgeToken) null);
    }

    public android.nfc.NfcEvent getReal() {
        return (android.nfc.NfcEvent) real;
    }

    public android.nfc.NfcEvent unwrap() {
        return getReal();
    }


}
