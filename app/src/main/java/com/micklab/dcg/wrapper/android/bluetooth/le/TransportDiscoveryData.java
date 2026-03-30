// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class TransportDiscoveryData {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TransportDiscoveryData(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.TransportDiscoveryData wrap(android.bluetooth.le.TransportDiscoveryData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.TransportDiscoveryData(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.le.TransportDiscoveryData getReal() {
        return (android.bluetooth.le.TransportDiscoveryData) real;
    }

    public android.bluetooth.le.TransportDiscoveryData unwrap() {
        return getReal();
    }

    public TransportDiscoveryData(byte[] arg0) {
        this(new android.bluetooth.le.TransportDiscoveryData(arg0), (__DcgwBridgeToken) null);
    }

    public TransportDiscoveryData(int arg0, java.util.List arg1) {
        this(new android.bluetooth.le.TransportDiscoveryData(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.bluetooth.le.TransportDiscoveryData) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.bluetooth.le.TransportDiscoveryData) real).equals(arg0);
    }

    public int getTransportDataType() {
        return ((android.bluetooth.le.TransportDiscoveryData) real).getTransportDataType();
    }

    public int hashCode() {
        return ((android.bluetooth.le.TransportDiscoveryData) real).hashCode();
    }

    public byte[] toByteArray() {
        return ((android.bluetooth.le.TransportDiscoveryData) real).toByteArray();
    }

    public java.lang.String toString() {
        return ((android.bluetooth.le.TransportDiscoveryData) real).toString();
    }

    public int totalBytes() {
        return ((android.bluetooth.le.TransportDiscoveryData) real).totalBytes();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.bluetooth.le.TransportDiscoveryData) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
