// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.usb;

public final class UsbConfiguration {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UsbConfiguration(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.usb.UsbConfiguration wrap(android.hardware.usb.UsbConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.usb.UsbConfiguration(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.usb.UsbConfiguration getReal() {
        return (android.hardware.usb.UsbConfiguration) real;
    }

    public android.hardware.usb.UsbConfiguration unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.hardware.usb.UsbConfiguration) real).describeContents();
    }

    public int getId() {
        return ((android.hardware.usb.UsbConfiguration) real).getId();
    }

    public com.micklab.dcg.wrapper.android.hardware.usb.UsbInterface getInterface(int arg0) {
        return com.micklab.dcg.wrapper.android.hardware.usb.UsbInterface.wrap(((android.hardware.usb.UsbConfiguration) real).getInterface(arg0));
    }

    public int getInterfaceCount() {
        return ((android.hardware.usb.UsbConfiguration) real).getInterfaceCount();
    }

    public int getMaxPower() {
        return ((android.hardware.usb.UsbConfiguration) real).getMaxPower();
    }

    public java.lang.String getName() {
        return ((android.hardware.usb.UsbConfiguration) real).getName();
    }

    public boolean isRemoteWakeup() {
        return ((android.hardware.usb.UsbConfiguration) real).isRemoteWakeup();
    }

    public boolean isSelfPowered() {
        return ((android.hardware.usb.UsbConfiguration) real).isSelfPowered();
    }

    public java.lang.String toString() {
        return ((android.hardware.usb.UsbConfiguration) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.hardware.usb.UsbConfiguration) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
