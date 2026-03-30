// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothGattCharacteristic {
    private final android.bluetooth.BluetoothGattCharacteristic real;

    public BluetoothGattCharacteristic(android.bluetooth.BluetoothGattCharacteristic real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic wrap(android.bluetooth.BluetoothGattCharacteristic real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic(real);
    }

    public android.bluetooth.BluetoothGattCharacteristic unwrap() {
        return real;
    }

    public BluetoothGattCharacteristic(java.util.UUID arg0, int arg1, int arg2) {
        this(new android.bluetooth.BluetoothGattCharacteristic(arg0, arg1, arg2));
    }

    public boolean addDescriptor(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattDescriptor arg0) {
        return real.addDescriptor(arg0 == null ? null : arg0.unwrap());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattDescriptor getDescriptor(java.util.UUID arg0) {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattDescriptor.wrap(real.getDescriptor(arg0));
    }

    public java.lang.Float getFloatValue(int arg0, int arg1) {
        return real.getFloatValue(arg0, arg1);
    }

    public int getInstanceId() {
        return real.getInstanceId();
    }

    public java.lang.Integer getIntValue(int arg0, int arg1) {
        return real.getIntValue(arg0, arg1);
    }

    public int getPermissions() {
        return real.getPermissions();
    }

    public int getProperties() {
        return real.getProperties();
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattService getService() {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattService.wrap(real.getService());
    }

    public java.lang.String getStringValue(int arg0) {
        return real.getStringValue(arg0);
    }

    public java.util.UUID getUuid() {
        return real.getUuid();
    }

    public byte[] getValue() {
        return real.getValue();
    }

    public int getWriteType() {
        return real.getWriteType();
    }

    public boolean setValue(byte[] arg0) {
        return real.setValue(arg0);
    }

    public boolean setValue(java.lang.String arg0) {
        return real.setValue(arg0);
    }

    public boolean setValue(int arg0, int arg1, int arg2) {
        return real.setValue(arg0, arg1, arg2);
    }

    public boolean setValue(int arg0, int arg1, int arg2, int arg3) {
        return real.setValue(arg0, arg1, arg2, arg3);
    }

    public void setWriteType(int arg0) {
        real.setWriteType(arg0);
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int FORMAT_FLOAT = android.bluetooth.BluetoothGattCharacteristic.FORMAT_FLOAT;
    public static final int FORMAT_SFLOAT = android.bluetooth.BluetoothGattCharacteristic.FORMAT_SFLOAT;
    public static final int FORMAT_SINT16 = android.bluetooth.BluetoothGattCharacteristic.FORMAT_SINT16;
    public static final int FORMAT_SINT32 = android.bluetooth.BluetoothGattCharacteristic.FORMAT_SINT32;
    public static final int FORMAT_SINT8 = android.bluetooth.BluetoothGattCharacteristic.FORMAT_SINT8;
    public static final int FORMAT_UINT16 = android.bluetooth.BluetoothGattCharacteristic.FORMAT_UINT16;
    public static final int FORMAT_UINT32 = android.bluetooth.BluetoothGattCharacteristic.FORMAT_UINT32;
    public static final int FORMAT_UINT8 = android.bluetooth.BluetoothGattCharacteristic.FORMAT_UINT8;
    public static final int PERMISSION_READ = android.bluetooth.BluetoothGattCharacteristic.PERMISSION_READ;
    public static final int PERMISSION_READ_ENCRYPTED = android.bluetooth.BluetoothGattCharacteristic.PERMISSION_READ_ENCRYPTED;
    public static final int PERMISSION_READ_ENCRYPTED_MITM = android.bluetooth.BluetoothGattCharacteristic.PERMISSION_READ_ENCRYPTED_MITM;
    public static final int PERMISSION_WRITE = android.bluetooth.BluetoothGattCharacteristic.PERMISSION_WRITE;
    public static final int PERMISSION_WRITE_ENCRYPTED = android.bluetooth.BluetoothGattCharacteristic.PERMISSION_WRITE_ENCRYPTED;
    public static final int PERMISSION_WRITE_ENCRYPTED_MITM = android.bluetooth.BluetoothGattCharacteristic.PERMISSION_WRITE_ENCRYPTED_MITM;
    public static final int PERMISSION_WRITE_SIGNED = android.bluetooth.BluetoothGattCharacteristic.PERMISSION_WRITE_SIGNED;
    public static final int PERMISSION_WRITE_SIGNED_MITM = android.bluetooth.BluetoothGattCharacteristic.PERMISSION_WRITE_SIGNED_MITM;
    public static final int PROPERTY_BROADCAST = android.bluetooth.BluetoothGattCharacteristic.PROPERTY_BROADCAST;
    public static final int PROPERTY_EXTENDED_PROPS = android.bluetooth.BluetoothGattCharacteristic.PROPERTY_EXTENDED_PROPS;
    public static final int PROPERTY_INDICATE = android.bluetooth.BluetoothGattCharacteristic.PROPERTY_INDICATE;
    public static final int PROPERTY_NOTIFY = android.bluetooth.BluetoothGattCharacteristic.PROPERTY_NOTIFY;
    public static final int PROPERTY_READ = android.bluetooth.BluetoothGattCharacteristic.PROPERTY_READ;
    public static final int PROPERTY_SIGNED_WRITE = android.bluetooth.BluetoothGattCharacteristic.PROPERTY_SIGNED_WRITE;
    public static final int PROPERTY_WRITE = android.bluetooth.BluetoothGattCharacteristic.PROPERTY_WRITE;
    public static final int PROPERTY_WRITE_NO_RESPONSE = android.bluetooth.BluetoothGattCharacteristic.PROPERTY_WRITE_NO_RESPONSE;
    public static final int WRITE_TYPE_DEFAULT = android.bluetooth.BluetoothGattCharacteristic.WRITE_TYPE_DEFAULT;
    public static final int WRITE_TYPE_NO_RESPONSE = android.bluetooth.BluetoothGattCharacteristic.WRITE_TYPE_NO_RESPONSE;
    public static final int WRITE_TYPE_SIGNED = android.bluetooth.BluetoothGattCharacteristic.WRITE_TYPE_SIGNED;

}
