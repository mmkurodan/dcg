// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc;

public final class NdefMessage {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NdefMessage(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.NdefMessage wrap(android.nfc.NdefMessage real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.NdefMessage(real, (__DcgwBridgeToken) null);
    }

    public android.nfc.NdefMessage getReal() {
        return (android.nfc.NdefMessage) real;
    }

    public android.nfc.NdefMessage unwrap() {
        return getReal();
    }

    public NdefMessage(byte[] arg0) throws android.nfc.FormatException {
        this(new android.nfc.NdefMessage(arg0), (__DcgwBridgeToken) null);
    }

    public NdefMessage(android.nfc.NdefRecord[] arg0) {
        this(new android.nfc.NdefMessage(arg0), (__DcgwBridgeToken) null);
    }

    public NdefMessage(com.micklab.dcg.wrapper.android.nfc.NdefRecord arg0, android.nfc.NdefRecord... arg1) {
        this(new android.nfc.NdefMessage(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.nfc.NdefMessage) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.nfc.NdefMessage) real).equals(arg0);
    }

    public int getByteArrayLength() {
        return ((android.nfc.NdefMessage) real).getByteArrayLength();
    }

    public android.nfc.NdefRecord[] getRecords() {
        return ((android.nfc.NdefMessage) real).getRecords();
    }

    public int hashCode() {
        return ((android.nfc.NdefMessage) real).hashCode();
    }

    public byte[] toByteArray() {
        return ((android.nfc.NdefMessage) real).toByteArray();
    }

    public java.lang.String toString() {
        return ((android.nfc.NdefMessage) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.nfc.NdefMessage) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
