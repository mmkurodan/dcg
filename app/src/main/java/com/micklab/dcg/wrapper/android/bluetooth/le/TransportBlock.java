// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class TransportBlock {
    private final android.bluetooth.le.TransportBlock real;

    public TransportBlock(android.bluetooth.le.TransportBlock real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.TransportBlock wrap(android.bluetooth.le.TransportBlock real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.TransportBlock(real);
    }

    public android.bluetooth.le.TransportBlock unwrap() {
        return real;
    }

    public TransportBlock(int arg0, int arg1, int arg2, byte[] arg3) {
        this(new android.bluetooth.le.TransportBlock(arg0, arg1, arg2, arg3));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getOrgId() {
        return real.getOrgId();
    }

    public int getTdsFlags() {
        return real.getTdsFlags();
    }

    public byte[] getTransportData() {
        return real.getTransportData();
    }

    public int getTransportDataLength() {
        return real.getTransportDataLength();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public byte[] toByteArray() {
        return real.toByteArray();
    }

    public int totalBytes() {
        return real.totalBytes();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
