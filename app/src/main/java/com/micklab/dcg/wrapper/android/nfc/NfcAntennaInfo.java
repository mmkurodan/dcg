// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc;

public final class NfcAntennaInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NfcAntennaInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.NfcAntennaInfo wrap(android.nfc.NfcAntennaInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.NfcAntennaInfo(real, (__DcgwBridgeToken) null);
    }

    public android.nfc.NfcAntennaInfo getReal() {
        return (android.nfc.NfcAntennaInfo) real;
    }

    public android.nfc.NfcAntennaInfo unwrap() {
        return getReal();
    }

    public NfcAntennaInfo(int arg0, int arg1, boolean arg2, java.util.List arg3) {
        this(new android.nfc.NfcAntennaInfo(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.nfc.NfcAntennaInfo) real).describeContents();
    }

    public int getDeviceHeight() {
        return ((android.nfc.NfcAntennaInfo) real).getDeviceHeight();
    }

    public int getDeviceWidth() {
        return ((android.nfc.NfcAntennaInfo) real).getDeviceWidth();
    }

    public boolean isDeviceFoldable() {
        return ((android.nfc.NfcAntennaInfo) real).isDeviceFoldable();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.nfc.NfcAntennaInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
