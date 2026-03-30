// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class ScanCallback {
    private final android.bluetooth.le.ScanCallback real;

    public ScanCallback(android.bluetooth.le.ScanCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.ScanCallback wrap(android.bluetooth.le.ScanCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.ScanCallback(real);
    }

    public android.bluetooth.le.ScanCallback unwrap() {
        return real;
    }

    public void onScanFailed(int arg0) {
        real.onScanFailed(arg0);
    }

    public void onScanResult(int arg0, com.micklab.dcg.wrapper.android.bluetooth.le.ScanResult arg1) {
        real.onScanResult(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static final int SCAN_FAILED_ALREADY_STARTED = android.bluetooth.le.ScanCallback.SCAN_FAILED_ALREADY_STARTED;
    public static final int SCAN_FAILED_APPLICATION_REGISTRATION_FAILED = android.bluetooth.le.ScanCallback.SCAN_FAILED_APPLICATION_REGISTRATION_FAILED;
    public static final int SCAN_FAILED_FEATURE_UNSUPPORTED = android.bluetooth.le.ScanCallback.SCAN_FAILED_FEATURE_UNSUPPORTED;
    public static final int SCAN_FAILED_INTERNAL_ERROR = android.bluetooth.le.ScanCallback.SCAN_FAILED_INTERNAL_ERROR;
    public static final int SCAN_FAILED_OUT_OF_HARDWARE_RESOURCES = android.bluetooth.le.ScanCallback.SCAN_FAILED_OUT_OF_HARDWARE_RESOURCES;
    public static final int SCAN_FAILED_SCANNING_TOO_FREQUENTLY = android.bluetooth.le.ScanCallback.SCAN_FAILED_SCANNING_TOO_FREQUENTLY;

}
