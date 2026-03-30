// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class TransportBlock {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TransportBlock(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.TransportBlock wrap(android.bluetooth.le.TransportBlock real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.TransportBlock(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.le.TransportBlock getReal() {
        return (android.bluetooth.le.TransportBlock) real;
    }

    public android.bluetooth.le.TransportBlock unwrap() {
        return getReal();
    }

    public TransportBlock(int arg0, int arg1, int arg2, byte[] arg3) {
        this(new android.bluetooth.le.TransportBlock(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.bluetooth.le.TransportBlock) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.bluetooth.le.TransportBlock) real).equals(arg0);
    }

    public int getOrgId() {
        return ((android.bluetooth.le.TransportBlock) real).getOrgId();
    }

    public int getTdsFlags() {
        return ((android.bluetooth.le.TransportBlock) real).getTdsFlags();
    }

    public byte[] getTransportData() {
        return ((android.bluetooth.le.TransportBlock) real).getTransportData();
    }

    public int getTransportDataLength() {
        return ((android.bluetooth.le.TransportBlock) real).getTransportDataLength();
    }

    public int hashCode() {
        return ((android.bluetooth.le.TransportBlock) real).hashCode();
    }

    public byte[] toByteArray() {
        return ((android.bluetooth.le.TransportBlock) real).toByteArray();
    }

    public int totalBytes() {
        return ((android.bluetooth.le.TransportBlock) real).totalBytes();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.bluetooth.le.TransportBlock) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
