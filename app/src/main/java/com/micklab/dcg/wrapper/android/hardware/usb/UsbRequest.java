// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.usb;

public final class UsbRequest {
    private final android.hardware.usb.UsbRequest real;

    public UsbRequest(android.hardware.usb.UsbRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.usb.UsbRequest wrap(android.hardware.usb.UsbRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.usb.UsbRequest(real);
    }

    public android.hardware.usb.UsbRequest unwrap() {
        return real;
    }

    public UsbRequest() {
        this(new android.hardware.usb.UsbRequest());
    }

    public boolean cancel() {
        return real.cancel();
    }

    public void close() {
        real.close();
    }

    public java.lang.Object getClientData() {
        return real.getClientData();
    }

    public com.micklab.dcg.wrapper.android.hardware.usb.UsbEndpoint getEndpoint() {
        return com.micklab.dcg.wrapper.android.hardware.usb.UsbEndpoint.wrap(real.getEndpoint());
    }

    public boolean initialize(com.micklab.dcg.wrapper.android.hardware.usb.UsbDeviceConnection arg0, com.micklab.dcg.wrapper.android.hardware.usb.UsbEndpoint arg1) {
        return real.initialize(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean queue(java.nio.ByteBuffer arg0) {
        return real.queue(arg0);
    }

    public boolean queue(java.nio.ByteBuffer arg0, int arg1) {
        return real.queue(arg0, arg1);
    }

    public void setClientData(java.lang.Object arg0) {
        real.setClientData(arg0);
    }

}
