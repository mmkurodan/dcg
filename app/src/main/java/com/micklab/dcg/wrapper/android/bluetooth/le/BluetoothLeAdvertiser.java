// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class BluetoothLeAdvertiser {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothLeAdvertiser(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.BluetoothLeAdvertiser wrap(android.bluetooth.le.BluetoothLeAdvertiser real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.BluetoothLeAdvertiser(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.le.BluetoothLeAdvertiser getReal() {
        return (android.bluetooth.le.BluetoothLeAdvertiser) real;
    }

    public android.bluetooth.le.BluetoothLeAdvertiser unwrap() {
        return getReal();
    }

    public void startAdvertising(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings arg0, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg1, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseCallback arg2) {
        ((android.bluetooth.le.BluetoothLeAdvertiser) real).startAdvertising(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void startAdvertising(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings arg0, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg1, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg2, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseCallback arg3) {
        ((android.bluetooth.le.BluetoothLeAdvertiser) real).startAdvertising(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public void startAdvertisingSet(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters arg0, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg1, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg2, com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters arg3, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg4, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetCallback arg5) {
        ((android.bluetooth.le.BluetoothLeAdvertiser) real).startAdvertisingSet(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal());
    }

    public void startAdvertisingSet(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters arg0, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg1, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg2, com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters arg3, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg4, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetCallback arg5, com.micklab.dcg.wrapper.android.os.Handler arg6) {
        ((android.bluetooth.le.BluetoothLeAdvertiser) real).startAdvertisingSet(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal());
    }

    public void startAdvertisingSet(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters arg0, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg1, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg2, com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters arg3, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg4, int arg5, int arg6, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetCallback arg7) {
        ((android.bluetooth.le.BluetoothLeAdvertiser) real).startAdvertisingSet(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5, arg6, arg7 == null ? null : arg7.getReal());
    }

    public void startAdvertisingSet(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters arg0, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg1, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg2, com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters arg3, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg4, int arg5, int arg6, com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetCallback arg7, com.micklab.dcg.wrapper.android.os.Handler arg8) {
        ((android.bluetooth.le.BluetoothLeAdvertiser) real).startAdvertisingSet(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5, arg6, arg7 == null ? null : arg7.getReal(), arg8 == null ? null : arg8.getReal());
    }

    public void stopAdvertising(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseCallback arg0) {
        ((android.bluetooth.le.BluetoothLeAdvertiser) real).stopAdvertising(arg0 == null ? null : arg0.getReal());
    }

    public void stopAdvertisingSet(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetCallback arg0) {
        ((android.bluetooth.le.BluetoothLeAdvertiser) real).stopAdvertisingSet(arg0 == null ? null : arg0.getReal());
    }

}
