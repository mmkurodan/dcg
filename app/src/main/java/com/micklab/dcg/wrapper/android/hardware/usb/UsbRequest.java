// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.usb;

public final class UsbRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UsbRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.usb.UsbRequest wrap(android.hardware.usb.UsbRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.usb.UsbRequest(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.usb.UsbRequest getReal() {
        return (android.hardware.usb.UsbRequest) real;
    }

    public android.hardware.usb.UsbRequest unwrap() {
        return getReal();
    }

    public UsbRequest() {
        this(new android.hardware.usb.UsbRequest(), (__DcgwBridgeToken) null);
    }

    public boolean cancel() {
        return ((android.hardware.usb.UsbRequest) real).cancel();
    }

    public void close() {
        ((android.hardware.usb.UsbRequest) real).close();
    }

    public java.lang.Object getClientData() {
        return ((android.hardware.usb.UsbRequest) real).getClientData();
    }

    public com.micklab.dcg.wrapper.android.hardware.usb.UsbEndpoint getEndpoint() {
        return com.micklab.dcg.wrapper.android.hardware.usb.UsbEndpoint.wrap(((android.hardware.usb.UsbRequest) real).getEndpoint());
    }

    public boolean initialize(com.micklab.dcg.wrapper.android.hardware.usb.UsbDeviceConnection arg0, com.micklab.dcg.wrapper.android.hardware.usb.UsbEndpoint arg1) {
        return ((android.hardware.usb.UsbRequest) real).initialize(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean queue(java.nio.ByteBuffer arg0) {
        return ((android.hardware.usb.UsbRequest) real).queue(arg0);
    }

    public boolean queue(java.nio.ByteBuffer arg0, int arg1) {
        return ((android.hardware.usb.UsbRequest) real).queue(arg0, arg1);
    }

    public void setClientData(java.lang.Object arg0) {
        ((android.hardware.usb.UsbRequest) real).setClientData(arg0);
    }

}
