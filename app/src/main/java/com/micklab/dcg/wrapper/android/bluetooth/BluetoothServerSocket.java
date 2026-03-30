// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothServerSocket {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothServerSocket(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothServerSocket wrap(android.bluetooth.BluetoothServerSocket real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothServerSocket(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothServerSocket getReal() {
        return (android.bluetooth.BluetoothServerSocket) real;
    }

    public android.bluetooth.BluetoothServerSocket unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocket accept() throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocket.wrap(((android.bluetooth.BluetoothServerSocket) real).accept());
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocket accept(int arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocket.wrap(((android.bluetooth.BluetoothServerSocket) real).accept(arg0));
    }

    public void close() throws java.io.IOException {
        ((android.bluetooth.BluetoothServerSocket) real).close();
    }

    public int getPsm() {
        return ((android.bluetooth.BluetoothServerSocket) real).getPsm();
    }

    public java.lang.String toString() {
        return ((android.bluetooth.BluetoothServerSocket) real).toString();
    }

}
