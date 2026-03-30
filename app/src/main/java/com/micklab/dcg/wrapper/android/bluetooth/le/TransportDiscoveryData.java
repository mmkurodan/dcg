// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class TransportDiscoveryData {
    private final android.bluetooth.le.TransportDiscoveryData real;

    public TransportDiscoveryData(android.bluetooth.le.TransportDiscoveryData real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.TransportDiscoveryData wrap(android.bluetooth.le.TransportDiscoveryData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.TransportDiscoveryData(real);
    }

    public android.bluetooth.le.TransportDiscoveryData unwrap() {
        return real;
    }

    public TransportDiscoveryData(byte[] arg0) {
        this(new android.bluetooth.le.TransportDiscoveryData(arg0));
    }

    public TransportDiscoveryData(int arg0, java.util.List arg1) {
        this(new android.bluetooth.le.TransportDiscoveryData(arg0, arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getTransportDataType() {
        return real.getTransportDataType();
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

    public int totalBytes() {
        return real.totalBytes();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
