// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothGattServer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothGattServer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattServer wrap(android.bluetooth.BluetoothGattServer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattServer(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothGattServer getReal() {
        return (android.bluetooth.BluetoothGattServer) real;
    }

    public android.bluetooth.BluetoothGattServer unwrap() {
        return getReal();
    }

    public boolean addService(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattService arg0) {
        return ((android.bluetooth.BluetoothGattServer) real).addService(arg0 == null ? null : arg0.getReal());
    }

    public void cancelConnection(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        ((android.bluetooth.BluetoothGattServer) real).cancelConnection(arg0 == null ? null : arg0.getReal());
    }

    public void clearServices() {
        ((android.bluetooth.BluetoothGattServer) real).clearServices();
    }

    public void close() {
        ((android.bluetooth.BluetoothGattServer) real).close();
    }

    public boolean connect(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, boolean arg1) {
        return ((android.bluetooth.BluetoothGattServer) real).connect(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public int getConnectionState(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        return ((android.bluetooth.BluetoothGattServer) real).getConnectionState(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattService getService(java.util.UUID arg0) {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattService.wrap(((android.bluetooth.BluetoothGattServer) real).getService(arg0));
    }

    public boolean notifyCharacteristicChanged(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic arg1, boolean arg2) {
        return ((android.bluetooth.BluetoothGattServer) real).notifyCharacteristicChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public int notifyCharacteristicChanged(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic arg1, boolean arg2, byte[] arg3) {
        return ((android.bluetooth.BluetoothGattServer) real).notifyCharacteristicChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

    public void readPhy(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        ((android.bluetooth.BluetoothGattServer) real).readPhy(arg0 == null ? null : arg0.getReal());
    }

    public boolean removeService(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattService arg0) {
        return ((android.bluetooth.BluetoothGattServer) real).removeService(arg0 == null ? null : arg0.getReal());
    }

    public boolean sendResponse(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        return ((android.bluetooth.BluetoothGattServer) real).sendResponse(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4);
    }

    public void setPreferredPhy(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, int arg1, int arg2, int arg3) {
        ((android.bluetooth.BluetoothGattServer) real).setPreferredPhy(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

}
