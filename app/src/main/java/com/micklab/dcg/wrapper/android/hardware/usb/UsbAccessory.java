// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.usb;

public final class UsbAccessory {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UsbAccessory(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.usb.UsbAccessory wrap(android.hardware.usb.UsbAccessory real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.usb.UsbAccessory(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.usb.UsbAccessory getReal() {
        return (android.hardware.usb.UsbAccessory) real;
    }

    public android.hardware.usb.UsbAccessory unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.hardware.usb.UsbAccessory) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.hardware.usb.UsbAccessory) real).equals(arg0);
    }

    public java.lang.String getDescription() {
        return ((android.hardware.usb.UsbAccessory) real).getDescription();
    }

    public java.lang.String getManufacturer() {
        return ((android.hardware.usb.UsbAccessory) real).getManufacturer();
    }

    public java.lang.String getModel() {
        return ((android.hardware.usb.UsbAccessory) real).getModel();
    }

    public java.lang.String getSerial() {
        return ((android.hardware.usb.UsbAccessory) real).getSerial();
    }

    public java.lang.String getUri() {
        return ((android.hardware.usb.UsbAccessory) real).getUri();
    }

    public java.lang.String getVersion() {
        return ((android.hardware.usb.UsbAccessory) real).getVersion();
    }

    public int hashCode() {
        return ((android.hardware.usb.UsbAccessory) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.hardware.usb.UsbAccessory) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.hardware.usb.UsbAccessory) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
