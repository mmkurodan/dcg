// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc;

public final class AvailableNfcAntenna {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AvailableNfcAntenna(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.AvailableNfcAntenna wrap(android.nfc.AvailableNfcAntenna real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.AvailableNfcAntenna(real, (__DcgwBridgeToken) null);
    }

    public android.nfc.AvailableNfcAntenna getReal() {
        return (android.nfc.AvailableNfcAntenna) real;
    }

    public android.nfc.AvailableNfcAntenna unwrap() {
        return getReal();
    }

    public AvailableNfcAntenna(int arg0, int arg1) {
        this(new android.nfc.AvailableNfcAntenna(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.nfc.AvailableNfcAntenna) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.nfc.AvailableNfcAntenna) real).equals(arg0);
    }

    public int getLocationX() {
        return ((android.nfc.AvailableNfcAntenna) real).getLocationX();
    }

    public int getLocationY() {
        return ((android.nfc.AvailableNfcAntenna) real).getLocationY();
    }

    public int hashCode() {
        return ((android.nfc.AvailableNfcAntenna) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.nfc.AvailableNfcAntenna) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.nfc.AvailableNfcAntenna) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
