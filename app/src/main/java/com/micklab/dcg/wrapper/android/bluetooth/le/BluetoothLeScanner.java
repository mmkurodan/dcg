// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class BluetoothLeScanner {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothLeScanner(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.BluetoothLeScanner wrap(android.bluetooth.le.BluetoothLeScanner real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.BluetoothLeScanner(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.le.BluetoothLeScanner getReal() {
        return (android.bluetooth.le.BluetoothLeScanner) real;
    }

    public android.bluetooth.le.BluetoothLeScanner unwrap() {
        return getReal();
    }

    public void flushPendingScanResults(com.micklab.dcg.wrapper.android.bluetooth.le.ScanCallback arg0) {
        ((android.bluetooth.le.BluetoothLeScanner) real).flushPendingScanResults(arg0 == null ? null : arg0.getReal());
    }

    public void startScan(com.micklab.dcg.wrapper.android.bluetooth.le.ScanCallback arg0) {
        ((android.bluetooth.le.BluetoothLeScanner) real).startScan(arg0 == null ? null : arg0.getReal());
    }

    public void stopScan(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
        ((android.bluetooth.le.BluetoothLeScanner) real).stopScan(arg0 == null ? null : arg0.getReal());
    }

    public void stopScan(com.micklab.dcg.wrapper.android.bluetooth.le.ScanCallback arg0) {
        ((android.bluetooth.le.BluetoothLeScanner) real).stopScan(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String EXTRA_CALLBACK_TYPE = android.bluetooth.le.BluetoothLeScanner.EXTRA_CALLBACK_TYPE;
    public static final java.lang.String EXTRA_ERROR_CODE = android.bluetooth.le.BluetoothLeScanner.EXTRA_ERROR_CODE;
    public static final java.lang.String EXTRA_LIST_SCAN_RESULT = android.bluetooth.le.BluetoothLeScanner.EXTRA_LIST_SCAN_RESULT;

}
