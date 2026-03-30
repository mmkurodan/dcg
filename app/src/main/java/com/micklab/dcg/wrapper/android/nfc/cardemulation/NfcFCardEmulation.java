// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.cardemulation;

public final class NfcFCardEmulation {
    private final android.nfc.cardemulation.NfcFCardEmulation real;

    public NfcFCardEmulation(android.nfc.cardemulation.NfcFCardEmulation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.cardemulation.NfcFCardEmulation wrap(android.nfc.cardemulation.NfcFCardEmulation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.cardemulation.NfcFCardEmulation(real);
    }

    public android.nfc.cardemulation.NfcFCardEmulation unwrap() {
        return real;
    }

    public boolean disableService(com.micklab.dcg.wrapper.android.app.Activity arg0) throws java.lang.RuntimeException {
        return real.disableService(arg0 == null ? null : arg0.unwrap());
    }

    public boolean enableService(com.micklab.dcg.wrapper.android.app.Activity arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1) throws java.lang.RuntimeException {
        return real.enableService(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static com.micklab.dcg.wrapper.android.nfc.cardemulation.NfcFCardEmulation getInstance(com.micklab.dcg.wrapper.android.nfc.NfcAdapter arg0) {
        return com.micklab.dcg.wrapper.android.nfc.cardemulation.NfcFCardEmulation.wrap(android.nfc.cardemulation.NfcFCardEmulation.getInstance(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.String getNfcid2ForService(com.micklab.dcg.wrapper.android.content.ComponentName arg0) throws java.lang.RuntimeException {
        return real.getNfcid2ForService(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String getSystemCodeForService(com.micklab.dcg.wrapper.android.content.ComponentName arg0) throws java.lang.RuntimeException {
        return real.getSystemCodeForService(arg0 == null ? null : arg0.unwrap());
    }

    public boolean registerSystemCodeForService(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) throws java.lang.RuntimeException {
        return real.registerSystemCodeForService(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean setNfcid2ForService(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) throws java.lang.RuntimeException {
        return real.setNfcid2ForService(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean unregisterSystemCodeForService(com.micklab.dcg.wrapper.android.content.ComponentName arg0) throws java.lang.RuntimeException {
        return real.unregisterSystemCodeForService(arg0 == null ? null : arg0.unwrap());
    }

}
