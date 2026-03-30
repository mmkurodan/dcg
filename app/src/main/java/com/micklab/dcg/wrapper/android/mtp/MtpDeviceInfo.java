// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.mtp;

public final class MtpDeviceInfo {
    private final android.mtp.MtpDeviceInfo real;

    public MtpDeviceInfo(android.mtp.MtpDeviceInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.mtp.MtpDeviceInfo wrap(android.mtp.MtpDeviceInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.mtp.MtpDeviceInfo(real);
    }

    public android.mtp.MtpDeviceInfo unwrap() {
        return real;
    }

    public int[] getEventsSupported() {
        return real.getEventsSupported();
    }

    public java.lang.String getManufacturer() {
        return real.getManufacturer();
    }

    public java.lang.String getModel() {
        return real.getModel();
    }

    public int[] getOperationsSupported() {
        return real.getOperationsSupported();
    }

    public java.lang.String getSerialNumber() {
        return real.getSerialNumber();
    }

    public java.lang.String getVersion() {
        return real.getVersion();
    }

    public boolean isEventSupported(int arg0) {
        return real.isEventSupported(arg0);
    }

    public boolean isOperationSupported(int arg0) {
        return real.isOperationSupported(arg0);
    }

}
