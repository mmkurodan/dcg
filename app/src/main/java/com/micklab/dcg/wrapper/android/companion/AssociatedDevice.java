// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion;

public final class AssociatedDevice {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AssociatedDevice(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.AssociatedDevice wrap(android.companion.AssociatedDevice real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.AssociatedDevice(real, (__DcgwBridgeToken) null);
    }

    public android.companion.AssociatedDevice getReal() {
        return (android.companion.AssociatedDevice) real;
    }

    public android.companion.AssociatedDevice unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.companion.AssociatedDevice) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.companion.AssociatedDevice) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.bluetooth.le.ScanResult getBleDevice() {
        return com.micklab.dcg.wrapper.android.bluetooth.le.ScanResult.wrap(((android.companion.AssociatedDevice) real).getBleDevice());
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice getBluetoothDevice() {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice.wrap(((android.companion.AssociatedDevice) real).getBluetoothDevice());
    }

    public com.micklab.dcg.wrapper.android.net.wifi.ScanResult getWifiDevice() {
        return com.micklab.dcg.wrapper.android.net.wifi.ScanResult.wrap(((android.companion.AssociatedDevice) real).getWifiDevice());
    }

    public int hashCode() {
        return ((android.companion.AssociatedDevice) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.companion.AssociatedDevice) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.companion.AssociatedDevice) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
