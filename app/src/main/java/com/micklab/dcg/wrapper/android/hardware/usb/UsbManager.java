// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.usb;

public final class UsbManager {
    private final android.hardware.usb.UsbManager real;

    public UsbManager(android.hardware.usb.UsbManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.usb.UsbManager wrap(android.hardware.usb.UsbManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.usb.UsbManager(real);
    }

    public android.hardware.usb.UsbManager unwrap() {
        return real;
    }

    public android.hardware.usb.UsbAccessory[] getAccessoryList() {
        return real.getAccessoryList();
    }

    public boolean hasPermission(com.micklab.dcg.wrapper.android.hardware.usb.UsbDevice arg0) {
        return real.hasPermission(arg0 == null ? null : arg0.unwrap());
    }

    public boolean hasPermission(com.micklab.dcg.wrapper.android.hardware.usb.UsbAccessory arg0) {
        return real.hasPermission(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor openAccessory(com.micklab.dcg.wrapper.android.hardware.usb.UsbAccessory arg0) {
        return com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor.wrap(real.openAccessory(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.hardware.usb.UsbDeviceConnection openDevice(com.micklab.dcg.wrapper.android.hardware.usb.UsbDevice arg0) {
        return com.micklab.dcg.wrapper.android.hardware.usb.UsbDeviceConnection.wrap(real.openDevice(arg0 == null ? null : arg0.unwrap()));
    }

    public void requestPermission(com.micklab.dcg.wrapper.android.hardware.usb.UsbDevice arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
        real.requestPermission(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void requestPermission(com.micklab.dcg.wrapper.android.hardware.usb.UsbAccessory arg0, com.micklab.dcg.wrapper.android.app.PendingIntent arg1) {
        real.requestPermission(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static final java.lang.String ACTION_USB_ACCESSORY_ATTACHED = android.hardware.usb.UsbManager.ACTION_USB_ACCESSORY_ATTACHED;
    public static final java.lang.String ACTION_USB_ACCESSORY_DETACHED = android.hardware.usb.UsbManager.ACTION_USB_ACCESSORY_DETACHED;
    public static final java.lang.String ACTION_USB_DEVICE_ATTACHED = android.hardware.usb.UsbManager.ACTION_USB_DEVICE_ATTACHED;
    public static final java.lang.String ACTION_USB_DEVICE_DETACHED = android.hardware.usb.UsbManager.ACTION_USB_DEVICE_DETACHED;
    public static final java.lang.String EXTRA_ACCESSORY = android.hardware.usb.UsbManager.EXTRA_ACCESSORY;
    public static final java.lang.String EXTRA_DEVICE = android.hardware.usb.UsbManager.EXTRA_DEVICE;
    public static final java.lang.String EXTRA_PERMISSION_GRANTED = android.hardware.usb.UsbManager.EXTRA_PERMISSION_GRANTED;

}
