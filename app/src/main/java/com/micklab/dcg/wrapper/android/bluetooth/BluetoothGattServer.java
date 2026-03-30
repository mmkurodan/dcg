// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothGattServer {
    private final android.bluetooth.BluetoothGattServer real;

    public BluetoothGattServer(android.bluetooth.BluetoothGattServer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattServer wrap(android.bluetooth.BluetoothGattServer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattServer(real);
    }

    public android.bluetooth.BluetoothGattServer unwrap() {
        return real;
    }

    public boolean addService(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattService arg0) {
        return real.addService(arg0 == null ? null : arg0.unwrap());
    }

    public void cancelConnection(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        real.cancelConnection(arg0 == null ? null : arg0.unwrap());
    }

    public void clearServices() {
        real.clearServices();
    }

    public void close() {
        real.close();
    }

    public boolean connect(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, boolean arg1) {
        return real.connect(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public int getConnectionState(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        return real.getConnectionState(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattService getService(java.util.UUID arg0) {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattService.wrap(real.getService(arg0));
    }

    public boolean notifyCharacteristicChanged(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic arg1, boolean arg2) {
        return real.notifyCharacteristicChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public int notifyCharacteristicChanged(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic arg1, boolean arg2, byte[] arg3) {
        return real.notifyCharacteristicChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
    }

    public void readPhy(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        real.readPhy(arg0 == null ? null : arg0.unwrap());
    }

    public boolean removeService(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattService arg0) {
        return real.removeService(arg0 == null ? null : arg0.unwrap());
    }

    public boolean sendResponse(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        return real.sendResponse(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4);
    }

    public void setPreferredPhy(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, int arg1, int arg2, int arg3) {
        real.setPreferredPhy(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

}
