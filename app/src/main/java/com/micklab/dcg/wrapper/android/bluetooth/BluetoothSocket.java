// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothSocket {
    private final android.bluetooth.BluetoothSocket real;

    public BluetoothSocket(android.bluetooth.BluetoothSocket real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocket wrap(android.bluetooth.BluetoothSocket real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocket(real);
    }

    public android.bluetooth.BluetoothSocket unwrap() {
        return real;
    }

    public void close() throws java.io.IOException {
        real.close();
    }

    public void connect() throws java.io.IOException {
        real.connect();
    }

    public int getConnectionType() {
        return real.getConnectionType();
    }

    public java.io.InputStream getInputStream() throws java.io.IOException {
        return real.getInputStream();
    }

    public int getMaxReceivePacketSize() {
        return real.getMaxReceivePacketSize();
    }

    public int getMaxTransmitPacketSize() {
        return real.getMaxTransmitPacketSize();
    }

    public java.io.OutputStream getOutputStream() throws java.io.IOException {
        return real.getOutputStream();
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice getRemoteDevice() {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice.wrap(real.getRemoteDevice());
    }

    public boolean isConnected() {
        return real.isConnected();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final int TYPE_L2CAP = android.bluetooth.BluetoothSocket.TYPE_L2CAP;
    public static final int TYPE_RFCOMM = android.bluetooth.BluetoothSocket.TYPE_RFCOMM;
    public static final int TYPE_SCO = android.bluetooth.BluetoothSocket.TYPE_SCO;

}
