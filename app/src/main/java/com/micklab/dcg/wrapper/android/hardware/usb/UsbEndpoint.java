// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.usb;

public final class UsbEndpoint {
    private final android.hardware.usb.UsbEndpoint real;

    public UsbEndpoint(android.hardware.usb.UsbEndpoint real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.usb.UsbEndpoint wrap(android.hardware.usb.UsbEndpoint real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.usb.UsbEndpoint(real);
    }

    public android.hardware.usb.UsbEndpoint unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getAddress() {
        return real.getAddress();
    }

    public int getAttributes() {
        return real.getAttributes();
    }

    public int getDirection() {
        return real.getDirection();
    }

    public int getEndpointNumber() {
        return real.getEndpointNumber();
    }

    public int getInterval() {
        return real.getInterval();
    }

    public int getMaxPacketSize() {
        return real.getMaxPacketSize();
    }

    public int getType() {
        return real.getType();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
