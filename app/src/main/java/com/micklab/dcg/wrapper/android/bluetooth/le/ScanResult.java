// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class ScanResult {
    private final android.bluetooth.le.ScanResult real;

    public ScanResult(android.bluetooth.le.ScanResult real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.ScanResult wrap(android.bluetooth.le.ScanResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.ScanResult(real);
    }

    public android.bluetooth.le.ScanResult unwrap() {
        return real;
    }

    public ScanResult(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, com.micklab.dcg.wrapper.android.bluetooth.le.ScanRecord arg1, int arg2, long arg3) {
        this(new android.bluetooth.le.ScanResult(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public ScanResult(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, com.micklab.dcg.wrapper.android.bluetooth.le.ScanRecord arg8, long arg9) {
        this(new android.bluetooth.le.ScanResult(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 == null ? null : arg8.unwrap(), arg9));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getAdvertisingSid() {
        return real.getAdvertisingSid();
    }

    public int getDataStatus() {
        return real.getDataStatus();
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice getDevice() {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice.wrap(real.getDevice());
    }

    public int getPeriodicAdvertisingInterval() {
        return real.getPeriodicAdvertisingInterval();
    }

    public int getPrimaryPhy() {
        return real.getPrimaryPhy();
    }

    public int getRssi() {
        return real.getRssi();
    }

    public com.micklab.dcg.wrapper.android.bluetooth.le.ScanRecord getScanRecord() {
        return com.micklab.dcg.wrapper.android.bluetooth.le.ScanRecord.wrap(real.getScanRecord());
    }

    public int getSecondaryPhy() {
        return real.getSecondaryPhy();
    }

    public long getTimestampNanos() {
        return real.getTimestampNanos();
    }

    public int getTxPower() {
        return real.getTxPower();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isConnectable() {
        return real.isConnectable();
    }

    public boolean isLegacy() {
        return real.isLegacy();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int DATA_COMPLETE = android.bluetooth.le.ScanResult.DATA_COMPLETE;
    public static final int DATA_TRUNCATED = android.bluetooth.le.ScanResult.DATA_TRUNCATED;
    public static final int PERIODIC_INTERVAL_NOT_PRESENT = android.bluetooth.le.ScanResult.PERIODIC_INTERVAL_NOT_PRESENT;
    public static final int PHY_UNUSED = android.bluetooth.le.ScanResult.PHY_UNUSED;
    public static final int SID_NOT_PRESENT = android.bluetooth.le.ScanResult.SID_NOT_PRESENT;
    public static final int TX_POWER_NOT_PRESENT = android.bluetooth.le.ScanResult.TX_POWER_NOT_PRESENT;

}
