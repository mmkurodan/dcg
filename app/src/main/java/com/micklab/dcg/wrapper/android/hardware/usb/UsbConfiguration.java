// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.usb;

public final class UsbConfiguration {
    private final android.hardware.usb.UsbConfiguration real;

    public UsbConfiguration(android.hardware.usb.UsbConfiguration real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.usb.UsbConfiguration wrap(android.hardware.usb.UsbConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.usb.UsbConfiguration(real);
    }

    public android.hardware.usb.UsbConfiguration unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getId() {
        return real.getId();
    }

    public com.micklab.dcg.wrapper.android.hardware.usb.UsbInterface getInterface(int arg0) {
        return com.micklab.dcg.wrapper.android.hardware.usb.UsbInterface.wrap(real.getInterface(arg0));
    }

    public int getInterfaceCount() {
        return real.getInterfaceCount();
    }

    public int getMaxPower() {
        return real.getMaxPower();
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public boolean isRemoteWakeup() {
        return real.isRemoteWakeup();
    }

    public boolean isSelfPowered() {
        return real.isSelfPowered();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
