// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.usb;

public final class UsbAccessory {
    private final android.hardware.usb.UsbAccessory real;

    public UsbAccessory(android.hardware.usb.UsbAccessory real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.usb.UsbAccessory wrap(android.hardware.usb.UsbAccessory real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.usb.UsbAccessory(real);
    }

    public android.hardware.usb.UsbAccessory unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getDescription() {
        return real.getDescription();
    }

    public java.lang.String getManufacturer() {
        return real.getManufacturer();
    }

    public java.lang.String getModel() {
        return real.getModel();
    }

    public java.lang.String getSerial() {
        return real.getSerial();
    }

    public java.lang.String getUri() {
        return real.getUri();
    }

    public java.lang.String getVersion() {
        return real.getVersion();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
