// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc;

public final class AvailableNfcAntenna {
    private final android.nfc.AvailableNfcAntenna real;

    public AvailableNfcAntenna(android.nfc.AvailableNfcAntenna real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.AvailableNfcAntenna wrap(android.nfc.AvailableNfcAntenna real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.AvailableNfcAntenna(real);
    }

    public android.nfc.AvailableNfcAntenna unwrap() {
        return real;
    }

    public AvailableNfcAntenna(int arg0, int arg1) {
        this(new android.nfc.AvailableNfcAntenna(arg0, arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getLocationX() {
        return real.getLocationX();
    }

    public int getLocationY() {
        return real.getLocationY();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
