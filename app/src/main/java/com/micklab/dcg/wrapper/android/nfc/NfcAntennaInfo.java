// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc;

public final class NfcAntennaInfo {
    private final android.nfc.NfcAntennaInfo real;

    public NfcAntennaInfo(android.nfc.NfcAntennaInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.NfcAntennaInfo wrap(android.nfc.NfcAntennaInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.NfcAntennaInfo(real);
    }

    public android.nfc.NfcAntennaInfo unwrap() {
        return real;
    }

    public NfcAntennaInfo(int arg0, int arg1, boolean arg2, java.util.List arg3) {
        this(new android.nfc.NfcAntennaInfo(arg0, arg1, arg2, arg3));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getDeviceHeight() {
        return real.getDeviceHeight();
    }

    public int getDeviceWidth() {
        return real.getDeviceWidth();
    }

    public boolean isDeviceFoldable() {
        return real.isDeviceFoldable();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
