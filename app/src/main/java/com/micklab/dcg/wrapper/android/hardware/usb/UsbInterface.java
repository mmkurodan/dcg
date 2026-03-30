// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.usb;

public final class UsbInterface {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UsbInterface(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.usb.UsbInterface wrap(android.hardware.usb.UsbInterface real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.usb.UsbInterface(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.usb.UsbInterface getReal() {
        return (android.hardware.usb.UsbInterface) real;
    }

    public android.hardware.usb.UsbInterface unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.hardware.usb.UsbInterface) real).describeContents();
    }

    public int getAlternateSetting() {
        return ((android.hardware.usb.UsbInterface) real).getAlternateSetting();
    }

    public com.micklab.dcg.wrapper.android.hardware.usb.UsbEndpoint getEndpoint(int arg0) {
        return com.micklab.dcg.wrapper.android.hardware.usb.UsbEndpoint.wrap(((android.hardware.usb.UsbInterface) real).getEndpoint(arg0));
    }

    public int getEndpointCount() {
        return ((android.hardware.usb.UsbInterface) real).getEndpointCount();
    }

    public int getId() {
        return ((android.hardware.usb.UsbInterface) real).getId();
    }

    public int getInterfaceClass() {
        return ((android.hardware.usb.UsbInterface) real).getInterfaceClass();
    }

    public int getInterfaceProtocol() {
        return ((android.hardware.usb.UsbInterface) real).getInterfaceProtocol();
    }

    public int getInterfaceSubclass() {
        return ((android.hardware.usb.UsbInterface) real).getInterfaceSubclass();
    }

    public java.lang.String getName() {
        return ((android.hardware.usb.UsbInterface) real).getName();
    }

    public java.lang.String toString() {
        return ((android.hardware.usb.UsbInterface) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.hardware.usb.UsbInterface) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
