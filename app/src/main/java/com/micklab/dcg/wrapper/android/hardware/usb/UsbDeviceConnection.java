// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.usb;

public final class UsbDeviceConnection {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UsbDeviceConnection(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.usb.UsbDeviceConnection wrap(android.hardware.usb.UsbDeviceConnection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.usb.UsbDeviceConnection(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.usb.UsbDeviceConnection getReal() {
        return (android.hardware.usb.UsbDeviceConnection) real;
    }

    public android.hardware.usb.UsbDeviceConnection unwrap() {
        return getReal();
    }

    public int bulkTransfer(com.micklab.dcg.wrapper.android.hardware.usb.UsbEndpoint arg0, byte[] arg1, int arg2, int arg3) {
        return ((android.hardware.usb.UsbDeviceConnection) real).bulkTransfer(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public int bulkTransfer(com.micklab.dcg.wrapper.android.hardware.usb.UsbEndpoint arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        return ((android.hardware.usb.UsbDeviceConnection) real).bulkTransfer(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4);
    }

    public boolean claimInterface(com.micklab.dcg.wrapper.android.hardware.usb.UsbInterface arg0, boolean arg1) {
        return ((android.hardware.usb.UsbDeviceConnection) real).claimInterface(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void close() {
        ((android.hardware.usb.UsbDeviceConnection) real).close();
    }

    public int controlTransfer(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        return ((android.hardware.usb.UsbDeviceConnection) real).controlTransfer(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public int controlTransfer(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7) {
        return ((android.hardware.usb.UsbDeviceConnection) real).controlTransfer(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public int getFileDescriptor() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.hardware.usb.UsbDeviceConnection#getFileDescriptor()");
    }

    public byte[] getRawDescriptors() {
        return ((android.hardware.usb.UsbDeviceConnection) real).getRawDescriptors();
    }

    public java.lang.String getSerial() {
        return ((android.hardware.usb.UsbDeviceConnection) real).getSerial();
    }

    public boolean releaseInterface(com.micklab.dcg.wrapper.android.hardware.usb.UsbInterface arg0) {
        return ((android.hardware.usb.UsbDeviceConnection) real).releaseInterface(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.hardware.usb.UsbRequest requestWait() {
        return com.micklab.dcg.wrapper.android.hardware.usb.UsbRequest.wrap(((android.hardware.usb.UsbDeviceConnection) real).requestWait());
    }

    public com.micklab.dcg.wrapper.android.hardware.usb.UsbRequest requestWait(long arg0) throws java.util.concurrent.TimeoutException {
        return com.micklab.dcg.wrapper.android.hardware.usb.UsbRequest.wrap(((android.hardware.usb.UsbDeviceConnection) real).requestWait(arg0));
    }

    public boolean setConfiguration(com.micklab.dcg.wrapper.android.hardware.usb.UsbConfiguration arg0) {
        return ((android.hardware.usb.UsbDeviceConnection) real).setConfiguration(arg0 == null ? null : arg0.getReal());
    }

    public boolean setInterface(com.micklab.dcg.wrapper.android.hardware.usb.UsbInterface arg0) {
        return ((android.hardware.usb.UsbDeviceConnection) real).setInterface(arg0 == null ? null : arg0.getReal());
    }

}
