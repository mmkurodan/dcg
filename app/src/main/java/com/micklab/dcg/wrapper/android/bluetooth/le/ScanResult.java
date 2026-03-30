// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class ScanResult {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScanResult(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.ScanResult wrap(android.bluetooth.le.ScanResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.ScanResult(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.le.ScanResult getReal() {
        return (android.bluetooth.le.ScanResult) real;
    }

    public android.bluetooth.le.ScanResult unwrap() {
        return getReal();
    }

    public ScanResult(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, com.micklab.dcg.wrapper.android.bluetooth.le.ScanRecord arg1, int arg2, long arg3) {
        this(new android.bluetooth.le.ScanResult(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public ScanResult(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, com.micklab.dcg.wrapper.android.bluetooth.le.ScanRecord arg8, long arg9) {
        this(new android.bluetooth.le.ScanResult(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 == null ? null : arg8.getReal(), arg9), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.bluetooth.le.ScanResult) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.bluetooth.le.ScanResult) real).equals(arg0);
    }

    public int getAdvertisingSid() {
        return ((android.bluetooth.le.ScanResult) real).getAdvertisingSid();
    }

    public int getDataStatus() {
        return ((android.bluetooth.le.ScanResult) real).getDataStatus();
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice getDevice() {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice.wrap(((android.bluetooth.le.ScanResult) real).getDevice());
    }

    public int getPeriodicAdvertisingInterval() {
        return ((android.bluetooth.le.ScanResult) real).getPeriodicAdvertisingInterval();
    }

    public int getPrimaryPhy() {
        return ((android.bluetooth.le.ScanResult) real).getPrimaryPhy();
    }

    public int getRssi() {
        return ((android.bluetooth.le.ScanResult) real).getRssi();
    }

    public com.micklab.dcg.wrapper.android.bluetooth.le.ScanRecord getScanRecord() {
        return com.micklab.dcg.wrapper.android.bluetooth.le.ScanRecord.wrap(((android.bluetooth.le.ScanResult) real).getScanRecord());
    }

    public int getSecondaryPhy() {
        return ((android.bluetooth.le.ScanResult) real).getSecondaryPhy();
    }

    public long getTimestampNanos() {
        return ((android.bluetooth.le.ScanResult) real).getTimestampNanos();
    }

    public int getTxPower() {
        return ((android.bluetooth.le.ScanResult) real).getTxPower();
    }

    public int hashCode() {
        return ((android.bluetooth.le.ScanResult) real).hashCode();
    }

    public boolean isConnectable() {
        return ((android.bluetooth.le.ScanResult) real).isConnectable();
    }

    public boolean isLegacy() {
        return ((android.bluetooth.le.ScanResult) real).isLegacy();
    }

    public java.lang.String toString() {
        return ((android.bluetooth.le.ScanResult) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.bluetooth.le.ScanResult) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int DATA_COMPLETE = android.bluetooth.le.ScanResult.DATA_COMPLETE;
    public static final int DATA_TRUNCATED = android.bluetooth.le.ScanResult.DATA_TRUNCATED;
    public static final int PERIODIC_INTERVAL_NOT_PRESENT = android.bluetooth.le.ScanResult.PERIODIC_INTERVAL_NOT_PRESENT;
    public static final int PHY_UNUSED = android.bluetooth.le.ScanResult.PHY_UNUSED;
    public static final int SID_NOT_PRESENT = android.bluetooth.le.ScanResult.SID_NOT_PRESENT;
    public static final int TX_POWER_NOT_PRESENT = android.bluetooth.le.ScanResult.TX_POWER_NOT_PRESENT;

}
