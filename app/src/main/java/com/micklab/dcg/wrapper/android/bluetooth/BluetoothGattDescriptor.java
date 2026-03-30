// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothGattDescriptor {
    private final android.bluetooth.BluetoothGattDescriptor real;

    public BluetoothGattDescriptor(android.bluetooth.BluetoothGattDescriptor real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattDescriptor wrap(android.bluetooth.BluetoothGattDescriptor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattDescriptor(real);
    }

    public android.bluetooth.BluetoothGattDescriptor unwrap() {
        return real;
    }

    public BluetoothGattDescriptor(java.util.UUID arg0, int arg1) {
        this(new android.bluetooth.BluetoothGattDescriptor(arg0, arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic getCharacteristic() {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic.wrap(real.getCharacteristic());
    }

    public int getPermissions() {
        return real.getPermissions();
    }

    public java.util.UUID getUuid() {
        return real.getUuid();
    }

    public byte[] getValue() {
        return real.getValue();
    }

    public boolean setValue(byte[] arg0) {
        return real.setValue(arg0);
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final byte[] DISABLE_NOTIFICATION_VALUE = android.bluetooth.BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
    public static final byte[] ENABLE_INDICATION_VALUE = android.bluetooth.BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
    public static final byte[] ENABLE_NOTIFICATION_VALUE = android.bluetooth.BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
    public static final int PERMISSION_READ = android.bluetooth.BluetoothGattDescriptor.PERMISSION_READ;
    public static final int PERMISSION_READ_ENCRYPTED = android.bluetooth.BluetoothGattDescriptor.PERMISSION_READ_ENCRYPTED;
    public static final int PERMISSION_READ_ENCRYPTED_MITM = android.bluetooth.BluetoothGattDescriptor.PERMISSION_READ_ENCRYPTED_MITM;
    public static final int PERMISSION_WRITE = android.bluetooth.BluetoothGattDescriptor.PERMISSION_WRITE;
    public static final int PERMISSION_WRITE_ENCRYPTED = android.bluetooth.BluetoothGattDescriptor.PERMISSION_WRITE_ENCRYPTED;
    public static final int PERMISSION_WRITE_ENCRYPTED_MITM = android.bluetooth.BluetoothGattDescriptor.PERMISSION_WRITE_ENCRYPTED_MITM;
    public static final int PERMISSION_WRITE_SIGNED = android.bluetooth.BluetoothGattDescriptor.PERMISSION_WRITE_SIGNED;
    public static final int PERMISSION_WRITE_SIGNED_MITM = android.bluetooth.BluetoothGattDescriptor.PERMISSION_WRITE_SIGNED_MITM;

}
