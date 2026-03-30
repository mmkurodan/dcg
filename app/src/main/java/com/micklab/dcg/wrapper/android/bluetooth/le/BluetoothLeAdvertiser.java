// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class BluetoothLeAdvertiser {
    private final android.bluetooth.le.BluetoothLeAdvertiser real;

    public BluetoothLeAdvertiser(android.bluetooth.le.BluetoothLeAdvertiser real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.BluetoothLeAdvertiser wrap(android.bluetooth.le.BluetoothLeAdvertiser real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.BluetoothLeAdvertiser(real);
    }

    public android.bluetooth.le.BluetoothLeAdvertiser unwrap() {
        return real;
    }

    public void startAdvertising(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings arg0, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg1, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseCallback arg2) {
        real.startAdvertising(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void startAdvertising(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings arg0, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg1, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg2, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseCallback arg3) {
        real.startAdvertising(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
    }

    public void startAdvertisingSet(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters arg0, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg1, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg2, com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters arg3, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg4, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetCallback arg5) {
        real.startAdvertisingSet(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap());
    }

    public void startAdvertisingSet(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters arg0, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg1, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg2, com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters arg3, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg4, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetCallback arg5, com.micklab.dcg.wrapper.android.os.Handler arg6) {
        real.startAdvertisingSet(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap());
    }

    public void startAdvertisingSet(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters arg0, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg1, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg2, com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters arg3, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg4, int arg5, int arg6, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetCallback arg7) {
        real.startAdvertisingSet(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5, arg6, arg7 == null ? null : arg7.unwrap());
    }

    public void startAdvertisingSet(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters arg0, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg1, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg2, com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters arg3, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg4, int arg5, int arg6, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetCallback arg7, com.micklab.dcg.wrapper.android.os.Handler arg8) {
        real.startAdvertisingSet(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5, arg6, arg7 == null ? null : arg7.unwrap(), arg8 == null ? null : arg8.unwrap());
    }

    public void stopAdvertising(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseCallback arg0) {
        real.stopAdvertising(arg0 == null ? null : arg0.unwrap());
    }

    public void stopAdvertisingSet(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetCallback arg0) {
        real.stopAdvertisingSet(arg0 == null ? null : arg0.unwrap());
    }

}
