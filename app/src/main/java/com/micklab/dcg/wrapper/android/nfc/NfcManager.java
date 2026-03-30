// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc;

public final class NfcManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NfcManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.NfcManager wrap(android.nfc.NfcManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.NfcManager(real, (__DcgwBridgeToken) null);
    }

    public android.nfc.NfcManager getReal() {
        return (android.nfc.NfcManager) real;
    }

    public android.nfc.NfcManager unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.nfc.NfcAdapter getDefaultAdapter() {
        return com.micklab.dcg.wrapper.android.nfc.NfcAdapter.wrap(((android.nfc.NfcManager) real).getDefaultAdapter());
    }

}
