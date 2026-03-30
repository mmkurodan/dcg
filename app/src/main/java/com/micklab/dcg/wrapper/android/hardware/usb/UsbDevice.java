// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.usb;

public final class UsbDevice {
    private final android.hardware.usb.UsbDevice real;

    public UsbDevice(android.hardware.usb.UsbDevice real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.usb.UsbDevice wrap(android.hardware.usb.UsbDevice real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.usb.UsbDevice(real);
    }

    public android.hardware.usb.UsbDevice unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.hardware.usb.UsbConfiguration getConfiguration(int arg0) {
        return com.micklab.dcg.wrapper.android.hardware.usb.UsbConfiguration.wrap(real.getConfiguration(arg0));
    }

    public int getConfigurationCount() {
        return real.getConfigurationCount();
    }

    public int getDeviceClass() {
        return real.getDeviceClass();
    }

    public int getDeviceId() {
        return real.getDeviceId();
    }

    public static int getDeviceId(java.lang.String arg0) {
        return android.hardware.usb.UsbDevice.getDeviceId(arg0);
    }

    public java.lang.String getDeviceName() {
        return real.getDeviceName();
    }

    public static java.lang.String getDeviceName(int arg0) {
        return android.hardware.usb.UsbDevice.getDeviceName(arg0);
    }

    public int getDeviceProtocol() {
        return real.getDeviceProtocol();
    }

    public int getDeviceSubclass() {
        return real.getDeviceSubclass();
    }

    public com.micklab.dcg.wrapper.android.hardware.usb.UsbInterface getInterface(int arg0) {
        return com.micklab.dcg.wrapper.android.hardware.usb.UsbInterface.wrap(real.getInterface(arg0));
    }

    public int getInterfaceCount() {
        return real.getInterfaceCount();
    }

    public java.lang.String getManufacturerName() {
        return real.getManufacturerName();
    }

    public int getProductId() {
        return real.getProductId();
    }

    public java.lang.String getProductName() {
        return real.getProductName();
    }

    public java.lang.String getSerialNumber() {
        return real.getSerialNumber();
    }

    public int getVendorId() {
        return real.getVendorId();
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
