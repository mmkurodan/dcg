// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothServerSocket {
    private final android.bluetooth.BluetoothServerSocket real;

    public BluetoothServerSocket(android.bluetooth.BluetoothServerSocket real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothServerSocket wrap(android.bluetooth.BluetoothServerSocket real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothServerSocket(real);
    }

    public android.bluetooth.BluetoothServerSocket unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocket accept() throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocket.wrap(real.accept());
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocket accept(int arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocket.wrap(real.accept(arg0));
    }

    public void close() throws java.io.IOException {
        real.close();
    }

    public int getPsm() {
        return real.getPsm();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
