// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging.uwb;

public final class UwbAddress {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UwbAddress(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.uwb.UwbAddress wrap(android.ranging.uwb.UwbAddress real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.uwb.UwbAddress(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.uwb.UwbAddress getReal() {
        return (android.ranging.uwb.UwbAddress) real;
    }

    public android.ranging.uwb.UwbAddress unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.ranging.uwb.UwbAddress createRandomShortAddress() {
        return com.micklab.dcg.wrapper.android.ranging.uwb.UwbAddress.wrap(android.ranging.uwb.UwbAddress.createRandomShortAddress());
    }

    public int describeContents() {
        return ((android.ranging.uwb.UwbAddress) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.ranging.uwb.UwbAddress) real).equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.ranging.uwb.UwbAddress fromBytes(byte[] arg0) {
        return com.micklab.dcg.wrapper.android.ranging.uwb.UwbAddress.wrap(android.ranging.uwb.UwbAddress.fromBytes(arg0));
    }

    public byte[] getAddressBytes() {
        return ((android.ranging.uwb.UwbAddress) real).getAddressBytes();
    }

    public int hashCode() {
        return ((android.ranging.uwb.UwbAddress) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.ranging.uwb.UwbAddress) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.ranging.uwb.UwbAddress) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int EXTENDED_ADDRESS_BYTE_LENGTH = android.ranging.uwb.UwbAddress.EXTENDED_ADDRESS_BYTE_LENGTH;
    public static final int SHORT_ADDRESS_BYTE_LENGTH = android.ranging.uwb.UwbAddress.SHORT_ADDRESS_BYTE_LENGTH;

}
