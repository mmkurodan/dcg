// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.usb;

public final class UsbDevice {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UsbDevice(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.usb.UsbDevice wrap(android.hardware.usb.UsbDevice real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.usb.UsbDevice(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.usb.UsbDevice getReal() {
        return (android.hardware.usb.UsbDevice) real;
    }

    public android.hardware.usb.UsbDevice unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.hardware.usb.UsbDevice) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.hardware.usb.UsbDevice) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.hardware.usb.UsbConfiguration getConfiguration(int arg0) {
        return com.micklab.dcg.wrapper.android.hardware.usb.UsbConfiguration.wrap(((android.hardware.usb.UsbDevice) real).getConfiguration(arg0));
    }

    public int getConfigurationCount() {
        return ((android.hardware.usb.UsbDevice) real).getConfigurationCount();
    }

    public int getDeviceClass() {
        return ((android.hardware.usb.UsbDevice) real).getDeviceClass();
    }

    public int getDeviceId() {
        return ((android.hardware.usb.UsbDevice) real).getDeviceId();
    }

    public static int getDeviceId(java.lang.String arg0) {
        return android.hardware.usb.UsbDevice.getDeviceId(arg0);
    }

    public java.lang.String getDeviceName() {
        return ((android.hardware.usb.UsbDevice) real).getDeviceName();
    }

    public static java.lang.String getDeviceName(int arg0) {
        return android.hardware.usb.UsbDevice.getDeviceName(arg0);
    }

    public int getDeviceProtocol() {
        return ((android.hardware.usb.UsbDevice) real).getDeviceProtocol();
    }

    public int getDeviceSubclass() {
        return ((android.hardware.usb.UsbDevice) real).getDeviceSubclass();
    }

    public com.micklab.dcg.wrapper.android.hardware.usb.UsbInterface getInterface(int arg0) {
        return com.micklab.dcg.wrapper.android.hardware.usb.UsbInterface.wrap(((android.hardware.usb.UsbDevice) real).getInterface(arg0));
    }

    public int getInterfaceCount() {
        return ((android.hardware.usb.UsbDevice) real).getInterfaceCount();
    }

    public java.lang.String getManufacturerName() {
        return ((android.hardware.usb.UsbDevice) real).getManufacturerName();
    }

    public int getProductId() {
        return ((android.hardware.usb.UsbDevice) real).getProductId();
    }

    public java.lang.String getProductName() {
        return ((android.hardware.usb.UsbDevice) real).getProductName();
    }

    public java.lang.String getSerialNumber() {
        return ((android.hardware.usb.UsbDevice) real).getSerialNumber();
    }

    public int getVendorId() {
        return ((android.hardware.usb.UsbDevice) real).getVendorId();
    }

    public java.lang.String getVersion() {
        return ((android.hardware.usb.UsbDevice) real).getVersion();
    }

    public int hashCode() {
        return ((android.hardware.usb.UsbDevice) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.hardware.usb.UsbDevice) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.hardware.usb.UsbDevice) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
