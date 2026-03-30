// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion;

public final class AssociatedDevice {
    private final android.companion.AssociatedDevice real;

    public AssociatedDevice(android.companion.AssociatedDevice real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.AssociatedDevice wrap(android.companion.AssociatedDevice real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.AssociatedDevice(real);
    }

    public android.companion.AssociatedDevice unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.bluetooth.le.ScanResult getBleDevice() {
        return com.micklab.dcg.wrapper.android.bluetooth.le.ScanResult.wrap(real.getBleDevice());
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice getBluetoothDevice() {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice.wrap(real.getBluetoothDevice());
    }

    public com.micklab.dcg.wrapper.android.net.wifi.ScanResult getWifiDevice() {
        return com.micklab.dcg.wrapper.android.net.wifi.ScanResult.wrap(real.getWifiDevice());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
