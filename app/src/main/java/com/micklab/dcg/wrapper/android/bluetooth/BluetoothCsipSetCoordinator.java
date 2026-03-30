// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothCsipSetCoordinator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothCsipSetCoordinator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothCsipSetCoordinator wrap(android.bluetooth.BluetoothCsipSetCoordinator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothCsipSetCoordinator(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothCsipSetCoordinator getReal() {
        return (android.bluetooth.BluetoothCsipSetCoordinator) real;
    }

    public android.bluetooth.BluetoothCsipSetCoordinator unwrap() {
        return getReal();
    }

    public void close() {
        ((android.bluetooth.BluetoothCsipSetCoordinator) real).close();
    }

    public int getConnectionState(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        return ((android.bluetooth.BluetoothCsipSetCoordinator) real).getConnectionState(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String ACTION_CSIS_CONNECTION_STATE_CHANGED = android.bluetooth.BluetoothCsipSetCoordinator.ACTION_CSIS_CONNECTION_STATE_CHANGED;

}
