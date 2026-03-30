// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.mtp;

public final class MtpDevice {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MtpDevice(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.mtp.MtpDevice wrap(android.mtp.MtpDevice real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.mtp.MtpDevice(real, (__DcgwBridgeToken) null);
    }

    public android.mtp.MtpDevice getReal() {
        return (android.mtp.MtpDevice) real;
    }

    public android.mtp.MtpDevice unwrap() {
        return getReal();
    }

    public MtpDevice(com.micklab.dcg.wrapper.android.hardware.usb.UsbDevice arg0) {
        this(new android.mtp.MtpDevice(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public void close() {
        ((android.mtp.MtpDevice) real).close();
    }

    public boolean deleteObject(int arg0) {
        return ((android.mtp.MtpDevice) real).deleteObject(arg0);
    }

    public int getDeviceId() {
        return ((android.mtp.MtpDevice) real).getDeviceId();
    }

    public com.micklab.dcg.wrapper.android.mtp.MtpDeviceInfo getDeviceInfo() {
        return com.micklab.dcg.wrapper.android.mtp.MtpDeviceInfo.wrap(((android.mtp.MtpDevice) real).getDeviceInfo());
    }

    public java.lang.String getDeviceName() {
        return ((android.mtp.MtpDevice) real).getDeviceName();
    }

    public byte[] getObject(int arg0, int arg1) {
        return ((android.mtp.MtpDevice) real).getObject(arg0, arg1);
    }

    public int[] getObjectHandles(int arg0, int arg1, int arg2) {
        return ((android.mtp.MtpDevice) real).getObjectHandles(arg0, arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo getObjectInfo(int arg0) {
        return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.wrap(((android.mtp.MtpDevice) real).getObjectInfo(arg0));
    }

    public long getParent(int arg0) {
        return ((android.mtp.MtpDevice) real).getParent(arg0);
    }

    public long getPartialObject(int arg0, long arg1, long arg2, byte[] arg3) throws java.io.IOException {
        return ((android.mtp.MtpDevice) real).getPartialObject(arg0, arg1, arg2, arg3);
    }

    public long getPartialObject64(int arg0, long arg1, long arg2, byte[] arg3) throws java.io.IOException {
        return ((android.mtp.MtpDevice) real).getPartialObject64(arg0, arg1, arg2, arg3);
    }

    public long getStorageId(int arg0) {
        return ((android.mtp.MtpDevice) real).getStorageId(arg0);
    }

    public int[] getStorageIds() {
        return ((android.mtp.MtpDevice) real).getStorageIds();
    }

    public com.micklab.dcg.wrapper.android.mtp.MtpStorageInfo getStorageInfo(int arg0) {
        return com.micklab.dcg.wrapper.android.mtp.MtpStorageInfo.wrap(((android.mtp.MtpDevice) real).getStorageInfo(arg0));
    }

    public byte[] getThumbnail(int arg0) {
        return ((android.mtp.MtpDevice) real).getThumbnail(arg0);
    }

    public boolean importFile(int arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.mtp.MtpDevice#importFile(int,java.lang.String)");
    }

    public boolean importFile(int arg0, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.mtp.MtpDevice#importFile(int,android.os.ParcelFileDescriptor)");
    }

    public boolean open(com.micklab.dcg.wrapper.android.hardware.usb.UsbDeviceConnection arg0) {
        return ((android.mtp.MtpDevice) real).open(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.mtp.MtpEvent readEvent(com.micklab.dcg.wrapper.android.os.CancellationSignal arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.mtp.MtpEvent.wrap(((android.mtp.MtpDevice) real).readEvent(arg0 == null ? null : arg0.getReal()));
    }

    public boolean sendObject(int arg0, long arg1, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg2) {
        return ((android.mtp.MtpDevice) real).sendObject(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo sendObjectInfo(com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo arg0) {
        return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.wrap(((android.mtp.MtpDevice) real).sendObjectInfo(arg0 == null ? null : arg0.getReal()));
    }

    public java.lang.String toString() {
        return ((android.mtp.MtpDevice) real).toString();
    }

}
