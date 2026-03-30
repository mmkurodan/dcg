// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothStatusCodes {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothStatusCodes(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothStatusCodes wrap(android.bluetooth.BluetoothStatusCodes real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothStatusCodes(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothStatusCodes getReal() {
        return (android.bluetooth.BluetoothStatusCodes) real;
    }

    public android.bluetooth.BluetoothStatusCodes unwrap() {
        return getReal();
    }

    public static final int ERROR_BLUETOOTH_NOT_ALLOWED = android.bluetooth.BluetoothStatusCodes.ERROR_BLUETOOTH_NOT_ALLOWED;
    public static final int ERROR_BLUETOOTH_NOT_ENABLED = android.bluetooth.BluetoothStatusCodes.ERROR_BLUETOOTH_NOT_ENABLED;
    public static final int ERROR_DEVICE_NOT_BONDED = android.bluetooth.BluetoothStatusCodes.ERROR_DEVICE_NOT_BONDED;
    public static final int ERROR_GATT_WRITE_NOT_ALLOWED = android.bluetooth.BluetoothStatusCodes.ERROR_GATT_WRITE_NOT_ALLOWED;
    public static final int ERROR_GATT_WRITE_REQUEST_BUSY = android.bluetooth.BluetoothStatusCodes.ERROR_GATT_WRITE_REQUEST_BUSY;
    public static final int ERROR_MISSING_BLUETOOTH_CONNECT_PERMISSION = android.bluetooth.BluetoothStatusCodes.ERROR_MISSING_BLUETOOTH_CONNECT_PERMISSION;
    public static final int ERROR_UNKNOWN = android.bluetooth.BluetoothStatusCodes.ERROR_UNKNOWN;
    public static final int FEATURE_NOT_CONFIGURED = android.bluetooth.BluetoothStatusCodes.FEATURE_NOT_CONFIGURED;
    public static final int FEATURE_NOT_SUPPORTED = android.bluetooth.BluetoothStatusCodes.FEATURE_NOT_SUPPORTED;
    public static final int FEATURE_SUPPORTED = android.bluetooth.BluetoothStatusCodes.FEATURE_SUPPORTED;
    public static final int SUCCESS = android.bluetooth.BluetoothStatusCodes.SUCCESS;

}
