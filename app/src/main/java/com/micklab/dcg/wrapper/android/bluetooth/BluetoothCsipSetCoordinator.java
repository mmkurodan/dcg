// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothCsipSetCoordinator {
    private final android.bluetooth.BluetoothCsipSetCoordinator real;

    public BluetoothCsipSetCoordinator(android.bluetooth.BluetoothCsipSetCoordinator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothCsipSetCoordinator wrap(android.bluetooth.BluetoothCsipSetCoordinator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothCsipSetCoordinator(real);
    }

    public android.bluetooth.BluetoothCsipSetCoordinator unwrap() {
        return real;
    }

    public void close() {
        real.close();
    }

    public int getConnectionState(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        return real.getConnectionState(arg0 == null ? null : arg0.unwrap());
    }

    public static final java.lang.String ACTION_CSIS_CONNECTION_STATE_CHANGED = android.bluetooth.BluetoothCsipSetCoordinator.ACTION_CSIS_CONNECTION_STATE_CHANGED;

}
