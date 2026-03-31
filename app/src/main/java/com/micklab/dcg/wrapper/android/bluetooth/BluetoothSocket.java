// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothSocket {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothSocket(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocket wrap(android.bluetooth.BluetoothSocket real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocket(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothSocket getReal() {
        return (android.bluetooth.BluetoothSocket) real;
    }

    public android.bluetooth.BluetoothSocket unwrap() {
        return getReal();
    }

    public void close() throws java.io.IOException {
        ((android.bluetooth.BluetoothSocket) real).close();
    }

    public void connect() throws java.io.IOException {
        ((android.bluetooth.BluetoothSocket) real).connect();
    }

    public int getConnectionType() {
        return ((android.bluetooth.BluetoothSocket) real).getConnectionType();
    }

    public java.io.InputStream getInputStream() throws java.io.IOException {
        return ((android.bluetooth.BluetoothSocket) real).getInputStream();
    }

    public int getMaxReceivePacketSize() {
        return ((android.bluetooth.BluetoothSocket) real).getMaxReceivePacketSize();
    }

    public int getMaxTransmitPacketSize() {
        return ((android.bluetooth.BluetoothSocket) real).getMaxTransmitPacketSize();
    }

    public java.io.OutputStream getOutputStream() throws java.io.IOException {
        return ((android.bluetooth.BluetoothSocket) real).getOutputStream();
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice getRemoteDevice() {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice.wrap(((android.bluetooth.BluetoothSocket) real).getRemoteDevice());
    }

    public boolean isConnected() {
        return ((android.bluetooth.BluetoothSocket) real).isConnected();
    }

    public java.lang.String toString() {
        return ((android.bluetooth.BluetoothSocket) real).toString();
    }

    public static final int TYPE_L2CAP = android.bluetooth.BluetoothSocket.TYPE_L2CAP;
    public static final int TYPE_LE = android.bluetooth.BluetoothSocket.TYPE_LE;
    public static final int TYPE_RFCOMM = android.bluetooth.BluetoothSocket.TYPE_RFCOMM;
    public static final int TYPE_SCO = android.bluetooth.BluetoothSocket.TYPE_SCO;

}
