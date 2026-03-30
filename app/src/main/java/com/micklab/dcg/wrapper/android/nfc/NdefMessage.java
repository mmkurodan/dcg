// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc;

public final class NdefMessage {
    private final android.nfc.NdefMessage real;

    public NdefMessage(android.nfc.NdefMessage real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.NdefMessage wrap(android.nfc.NdefMessage real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.NdefMessage(real);
    }

    public android.nfc.NdefMessage unwrap() {
        return real;
    }

    public NdefMessage(android.nfc.NdefRecord[] arg0) {
        this(new android.nfc.NdefMessage(arg0));
    }

    public NdefMessage(byte[] arg0) throws android.nfc.FormatException {
        this(new android.nfc.NdefMessage(arg0));
    }

    public NdefMessage(com.micklab.dcg.wrapper.android.nfc.NdefRecord arg0, android.nfc.NdefRecord... arg1) {
        this(new android.nfc.NdefMessage(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getByteArrayLength() {
        return real.getByteArrayLength();
    }

    public android.nfc.NdefRecord[] getRecords() {
        return real.getRecords();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public byte[] toByteArray() {
        return real.toByteArray();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
