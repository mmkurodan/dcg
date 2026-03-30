// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.mtp;

public final class MtpDevice {
    private final android.mtp.MtpDevice real;

    public MtpDevice(android.mtp.MtpDevice real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.mtp.MtpDevice wrap(android.mtp.MtpDevice real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.mtp.MtpDevice(real);
    }

    public android.mtp.MtpDevice unwrap() {
        return real;
    }

    public MtpDevice(com.micklab.dcg.wrapper.android.hardware.usb.UsbDevice arg0) {
        this(new android.mtp.MtpDevice(arg0 == null ? null : arg0.unwrap()));
    }

    public void close() {
        real.close();
    }

    public boolean deleteObject(int arg0) {
        return real.deleteObject(arg0);
    }

    public int getDeviceId() {
        return real.getDeviceId();
    }

    public com.micklab.dcg.wrapper.android.mtp.MtpDeviceInfo getDeviceInfo() {
        return com.micklab.dcg.wrapper.android.mtp.MtpDeviceInfo.wrap(real.getDeviceInfo());
    }

    public java.lang.String getDeviceName() {
        return real.getDeviceName();
    }

    public byte[] getObject(int arg0, int arg1) {
        return real.getObject(arg0, arg1);
    }

    public int[] getObjectHandles(int arg0, int arg1, int arg2) {
        return real.getObjectHandles(arg0, arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo getObjectInfo(int arg0) {
        return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.wrap(real.getObjectInfo(arg0));
    }

    public long getParent(int arg0) {
        return real.getParent(arg0);
    }

    public long getPartialObject(int arg0, long arg1, long arg2, byte[] arg3) throws java.io.IOException {
        return real.getPartialObject(arg0, arg1, arg2, arg3);
    }

    public long getPartialObject64(int arg0, long arg1, long arg2, byte[] arg3) throws java.io.IOException {
        return real.getPartialObject64(arg0, arg1, arg2, arg3);
    }

    public long getStorageId(int arg0) {
        return real.getStorageId(arg0);
    }

    public int[] getStorageIds() {
        return real.getStorageIds();
    }

    public com.micklab.dcg.wrapper.android.mtp.MtpStorageInfo getStorageInfo(int arg0) {
        return com.micklab.dcg.wrapper.android.mtp.MtpStorageInfo.wrap(real.getStorageInfo(arg0));
    }

    public byte[] getThumbnail(int arg0) {
        return real.getThumbnail(arg0);
    }

    public boolean importFile(int arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.mtp.MtpDevice#importFile(int,java.lang.String)");
    }

    public boolean importFile(int arg0, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.mtp.MtpDevice#importFile(int,android.os.ParcelFileDescriptor)");
    }

    public boolean open(com.micklab.dcg.wrapper.android.hardware.usb.UsbDeviceConnection arg0) {
        return real.open(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.mtp.MtpEvent readEvent(com.micklab.dcg.wrapper.android.os.CancellationSignal arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.mtp.MtpEvent.wrap(real.readEvent(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean sendObject(int arg0, long arg1, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg2) {
        return real.sendObject(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo sendObjectInfo(com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo arg0) {
        return com.micklab.dcg.wrapper.android.mtp.MtpObjectInfo.wrap(real.sendObjectInfo(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
