// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.mtp;

public final class MtpDeviceInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MtpDeviceInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.mtp.MtpDeviceInfo wrap(android.mtp.MtpDeviceInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.mtp.MtpDeviceInfo(real, (__DcgwBridgeToken) null);
    }

    public android.mtp.MtpDeviceInfo getReal() {
        return (android.mtp.MtpDeviceInfo) real;
    }

    public android.mtp.MtpDeviceInfo unwrap() {
        return getReal();
    }

    public int[] getEventsSupported() {
        return ((android.mtp.MtpDeviceInfo) real).getEventsSupported();
    }

    public java.lang.String getManufacturer() {
        return ((android.mtp.MtpDeviceInfo) real).getManufacturer();
    }

    public java.lang.String getModel() {
        return ((android.mtp.MtpDeviceInfo) real).getModel();
    }

    public int[] getOperationsSupported() {
        return ((android.mtp.MtpDeviceInfo) real).getOperationsSupported();
    }

    public java.lang.String getSerialNumber() {
        return ((android.mtp.MtpDeviceInfo) real).getSerialNumber();
    }

    public java.lang.String getVersion() {
        return ((android.mtp.MtpDeviceInfo) real).getVersion();
    }

    public boolean isEventSupported(int arg0) {
        return ((android.mtp.MtpDeviceInfo) real).isEventSupported(arg0);
    }

    public boolean isOperationSupported(int arg0) {
        return ((android.mtp.MtpDeviceInfo) real).isOperationSupported(arg0);
    }

}
