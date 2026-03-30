// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothSocketException {
    private final android.bluetooth.BluetoothSocketException real;

    public BluetoothSocketException(android.bluetooth.BluetoothSocketException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocketException wrap(android.bluetooth.BluetoothSocketException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocketException(real);
    }

    public android.bluetooth.BluetoothSocketException unwrap() {
        return real;
    }

    public BluetoothSocketException(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.bluetooth.BluetoothSocketException#android.bluetooth.BluetoothSocketException(int)");
    }

    public BluetoothSocketException(int arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.bluetooth.BluetoothSocketException#android.bluetooth.BluetoothSocketException(int,java.lang.String)");
    }

    public int getErrorCode() {
        return real.getErrorCode();
    }

    public static final int BLUETOOTH_OFF_FAILURE = android.bluetooth.BluetoothSocketException.BLUETOOTH_OFF_FAILURE;
    public static final int L2CAP_ACL_FAILURE = android.bluetooth.BluetoothSocketException.L2CAP_ACL_FAILURE;
    public static final int L2CAP_CLIENT_SECURITY_FAILURE = android.bluetooth.BluetoothSocketException.L2CAP_CLIENT_SECURITY_FAILURE;
    public static final int L2CAP_INSUFFICIENT_AUTHENTICATION = android.bluetooth.BluetoothSocketException.L2CAP_INSUFFICIENT_AUTHENTICATION;
    public static final int L2CAP_INSUFFICIENT_AUTHORIZATION = android.bluetooth.BluetoothSocketException.L2CAP_INSUFFICIENT_AUTHORIZATION;
    public static final int L2CAP_INSUFFICIENT_ENCRYPTION = android.bluetooth.BluetoothSocketException.L2CAP_INSUFFICIENT_ENCRYPTION;
    public static final int L2CAP_INSUFFICIENT_ENCRYPT_KEY_SIZE = android.bluetooth.BluetoothSocketException.L2CAP_INSUFFICIENT_ENCRYPT_KEY_SIZE;
    public static final int L2CAP_INVALID_PARAMETERS = android.bluetooth.BluetoothSocketException.L2CAP_INVALID_PARAMETERS;
    public static final int L2CAP_INVALID_SOURCE_CID = android.bluetooth.BluetoothSocketException.L2CAP_INVALID_SOURCE_CID;
    public static final int L2CAP_NO_PSM_AVAILABLE = android.bluetooth.BluetoothSocketException.L2CAP_NO_PSM_AVAILABLE;
    public static final int L2CAP_NO_RESOURCES = android.bluetooth.BluetoothSocketException.L2CAP_NO_RESOURCES;
    public static final int L2CAP_SOURCE_CID_ALREADY_ALLOCATED = android.bluetooth.BluetoothSocketException.L2CAP_SOURCE_CID_ALREADY_ALLOCATED;
    public static final int L2CAP_TIMEOUT = android.bluetooth.BluetoothSocketException.L2CAP_TIMEOUT;
    public static final int L2CAP_UNACCEPTABLE_PARAMETERS = android.bluetooth.BluetoothSocketException.L2CAP_UNACCEPTABLE_PARAMETERS;
    public static final int L2CAP_UNKNOWN = android.bluetooth.BluetoothSocketException.L2CAP_UNKNOWN;
    public static final int NULL_DEVICE = android.bluetooth.BluetoothSocketException.NULL_DEVICE;
    public static final int RPC_FAILURE = android.bluetooth.BluetoothSocketException.RPC_FAILURE;
    public static final int UNSPECIFIED = android.bluetooth.BluetoothSocketException.UNSPECIFIED;

}
