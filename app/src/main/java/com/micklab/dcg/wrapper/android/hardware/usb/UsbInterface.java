// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.usb;

public final class UsbInterface {
    private final android.hardware.usb.UsbInterface real;

    public UsbInterface(android.hardware.usb.UsbInterface real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.usb.UsbInterface wrap(android.hardware.usb.UsbInterface real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.usb.UsbInterface(real);
    }

    public android.hardware.usb.UsbInterface unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getAlternateSetting() {
        return real.getAlternateSetting();
    }

    public com.micklab.dcg.wrapper.android.hardware.usb.UsbEndpoint getEndpoint(int arg0) {
        return com.micklab.dcg.wrapper.android.hardware.usb.UsbEndpoint.wrap(real.getEndpoint(arg0));
    }

    public int getEndpointCount() {
        return real.getEndpointCount();
    }

    public int getId() {
        return real.getId();
    }

    public int getInterfaceClass() {
        return real.getInterfaceClass();
    }

    public int getInterfaceProtocol() {
        return real.getInterfaceProtocol();
    }

    public int getInterfaceSubclass() {
        return real.getInterfaceSubclass();
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
