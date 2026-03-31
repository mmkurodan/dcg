// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothDevice {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothDevice(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice wrap(android.bluetooth.BluetoothDevice real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothDevice getReal() {
        return (android.bluetooth.BluetoothDevice) real;
    }

    public android.bluetooth.BluetoothDevice unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt connectGatt(com.micklab.dcg.wrapper.android.content.Context arg0, boolean arg1, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCallback arg2) {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt.wrap(((android.bluetooth.BluetoothDevice) real).connectGatt(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt connectGatt(com.micklab.dcg.wrapper.android.content.Context arg0, boolean arg1, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCallback arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt.wrap(((android.bluetooth.BluetoothDevice) real).connectGatt(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3));
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt connectGatt(com.micklab.dcg.wrapper.android.content.Context arg0, boolean arg1, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCallback arg2, int arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt.wrap(((android.bluetooth.BluetoothDevice) real).connectGatt(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4));
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt connectGatt(com.micklab.dcg.wrapper.android.content.Context arg0, boolean arg1, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCallback arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.os.Handler arg5) {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt.wrap(((android.bluetooth.BluetoothDevice) real).connectGatt(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4, arg5 == null ? null : arg5.getReal()));
    }

    public boolean createBond() {
        return ((android.bluetooth.BluetoothDevice) real).createBond();
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocket createInsecureL2capChannel(int arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocket.wrap(((android.bluetooth.BluetoothDevice) real).createInsecureL2capChannel(arg0));
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocket createInsecureRfcommSocketToServiceRecord(java.util.UUID arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.bluetooth.BluetoothDevice#createInsecureRfcommSocketToServiceRecord(java.util.UUID)");
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocket createL2capChannel(int arg0) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocket.wrap(((android.bluetooth.BluetoothDevice) real).createL2capChannel(arg0));
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocket createRfcommSocketToServiceRecord(java.util.UUID arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.bluetooth.BluetoothDevice#createRfcommSocketToServiceRecord(java.util.UUID)");
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocket createUsingSocketSettings(com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocketSettings arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.bluetooth.BluetoothDevice#createUsingSocketSettings(android.bluetooth.BluetoothSocketSettings)");
    }

    public int describeContents() {
        return ((android.bluetooth.BluetoothDevice) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.bluetooth.BluetoothDevice) real).equals(arg0);
    }

    public boolean fetchUuidsWithSdp() {
        return ((android.bluetooth.BluetoothDevice) real).fetchUuidsWithSdp();
    }

    public java.lang.String getAddress() {
        return ((android.bluetooth.BluetoothDevice) real).getAddress();
    }

    public int getAddressType() {
        return ((android.bluetooth.BluetoothDevice) real).getAddressType();
    }

    public java.lang.String getAlias() {
        return ((android.bluetooth.BluetoothDevice) real).getAlias();
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothClass getBluetoothClass() {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothClass.wrap(((android.bluetooth.BluetoothDevice) real).getBluetoothClass());
    }

    public int getBondState() {
        return ((android.bluetooth.BluetoothDevice) real).getBondState();
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice.BluetoothAddress getIdentityAddressWithType() {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice.BluetoothAddress.wrap(((android.bluetooth.BluetoothDevice) real).getIdentityAddressWithType());
    }

    public java.lang.String getName() {
        return ((android.bluetooth.BluetoothDevice) real).getName();
    }

    public int getType() {
        return ((android.bluetooth.BluetoothDevice) real).getType();
    }

    public android.os.ParcelUuid[] getUuids() {
        return ((android.bluetooth.BluetoothDevice) real).getUuids();
    }

    public int hashCode() {
        return ((android.bluetooth.BluetoothDevice) real).hashCode();
    }

    public int setAlias(java.lang.String arg0) {
        return ((android.bluetooth.BluetoothDevice) real).setAlias(arg0);
    }

    public boolean setPairingConfirmation(boolean arg0) {
        return ((android.bluetooth.BluetoothDevice) real).setPairingConfirmation(arg0);
    }

    public boolean setPin(byte[] arg0) {
        return ((android.bluetooth.BluetoothDevice) real).setPin(arg0);
    }

    public java.lang.String toString() {
        return ((android.bluetooth.BluetoothDevice) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.bluetooth.BluetoothDevice) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String ACTION_ACL_CONNECTED = android.bluetooth.BluetoothDevice.ACTION_ACL_CONNECTED;
    public static final java.lang.String ACTION_ACL_DISCONNECTED = android.bluetooth.BluetoothDevice.ACTION_ACL_DISCONNECTED;
    public static final java.lang.String ACTION_ACL_DISCONNECT_REQUESTED = android.bluetooth.BluetoothDevice.ACTION_ACL_DISCONNECT_REQUESTED;
    public static final java.lang.String ACTION_ALIAS_CHANGED = android.bluetooth.BluetoothDevice.ACTION_ALIAS_CHANGED;
    public static final java.lang.String ACTION_BOND_STATE_CHANGED = android.bluetooth.BluetoothDevice.ACTION_BOND_STATE_CHANGED;
    public static final java.lang.String ACTION_CLASS_CHANGED = android.bluetooth.BluetoothDevice.ACTION_CLASS_CHANGED;
    public static final java.lang.String ACTION_ENCRYPTION_CHANGE = android.bluetooth.BluetoothDevice.ACTION_ENCRYPTION_CHANGE;
    public static final java.lang.String ACTION_FOUND = android.bluetooth.BluetoothDevice.ACTION_FOUND;
    public static final java.lang.String ACTION_KEY_MISSING = android.bluetooth.BluetoothDevice.ACTION_KEY_MISSING;
    public static final java.lang.String ACTION_NAME_CHANGED = android.bluetooth.BluetoothDevice.ACTION_NAME_CHANGED;
    public static final java.lang.String ACTION_PAIRING_REQUEST = android.bluetooth.BluetoothDevice.ACTION_PAIRING_REQUEST;
    public static final java.lang.String ACTION_UUID = android.bluetooth.BluetoothDevice.ACTION_UUID;
    public static final int ADDRESS_TYPE_ANONYMOUS = android.bluetooth.BluetoothDevice.ADDRESS_TYPE_ANONYMOUS;
    public static final int ADDRESS_TYPE_PUBLIC = android.bluetooth.BluetoothDevice.ADDRESS_TYPE_PUBLIC;
    public static final int ADDRESS_TYPE_RANDOM = android.bluetooth.BluetoothDevice.ADDRESS_TYPE_RANDOM;
    public static final int ADDRESS_TYPE_UNKNOWN = android.bluetooth.BluetoothDevice.ADDRESS_TYPE_UNKNOWN;
    public static final int BOND_BONDED = android.bluetooth.BluetoothDevice.BOND_BONDED;
    public static final int BOND_BONDING = android.bluetooth.BluetoothDevice.BOND_BONDING;
    public static final int BOND_NONE = android.bluetooth.BluetoothDevice.BOND_NONE;
    public static final int DEVICE_TYPE_CLASSIC = android.bluetooth.BluetoothDevice.DEVICE_TYPE_CLASSIC;
    public static final int DEVICE_TYPE_DUAL = android.bluetooth.BluetoothDevice.DEVICE_TYPE_DUAL;
    public static final int DEVICE_TYPE_LE = android.bluetooth.BluetoothDevice.DEVICE_TYPE_LE;
    public static final int DEVICE_TYPE_UNKNOWN = android.bluetooth.BluetoothDevice.DEVICE_TYPE_UNKNOWN;
    public static final int ENCRYPTION_ALGORITHM_AES = android.bluetooth.BluetoothDevice.ENCRYPTION_ALGORITHM_AES;
    public static final int ENCRYPTION_ALGORITHM_E0 = android.bluetooth.BluetoothDevice.ENCRYPTION_ALGORITHM_E0;
    public static final int ENCRYPTION_ALGORITHM_NONE = android.bluetooth.BluetoothDevice.ENCRYPTION_ALGORITHM_NONE;
    public static final int ERROR = android.bluetooth.BluetoothDevice.ERROR;
    public static final java.lang.String EXTRA_BOND_STATE = android.bluetooth.BluetoothDevice.EXTRA_BOND_STATE;
    public static final java.lang.String EXTRA_CLASS = android.bluetooth.BluetoothDevice.EXTRA_CLASS;
    public static final java.lang.String EXTRA_DEVICE = android.bluetooth.BluetoothDevice.EXTRA_DEVICE;
    public static final java.lang.String EXTRA_ENCRYPTION_ALGORITHM = android.bluetooth.BluetoothDevice.EXTRA_ENCRYPTION_ALGORITHM;
    public static final java.lang.String EXTRA_ENCRYPTION_ENABLED = android.bluetooth.BluetoothDevice.EXTRA_ENCRYPTION_ENABLED;
    public static final java.lang.String EXTRA_ENCRYPTION_STATUS = android.bluetooth.BluetoothDevice.EXTRA_ENCRYPTION_STATUS;
    public static final java.lang.String EXTRA_IS_COORDINATED_SET_MEMBER = android.bluetooth.BluetoothDevice.EXTRA_IS_COORDINATED_SET_MEMBER;
    public static final java.lang.String EXTRA_KEY_SIZE = android.bluetooth.BluetoothDevice.EXTRA_KEY_SIZE;
    public static final java.lang.String EXTRA_NAME = android.bluetooth.BluetoothDevice.EXTRA_NAME;
    public static final java.lang.String EXTRA_PAIRING_KEY = android.bluetooth.BluetoothDevice.EXTRA_PAIRING_KEY;
    public static final java.lang.String EXTRA_PAIRING_VARIANT = android.bluetooth.BluetoothDevice.EXTRA_PAIRING_VARIANT;
    public static final java.lang.String EXTRA_PREVIOUS_BOND_STATE = android.bluetooth.BluetoothDevice.EXTRA_PREVIOUS_BOND_STATE;
    public static final java.lang.String EXTRA_RSSI = android.bluetooth.BluetoothDevice.EXTRA_RSSI;
    public static final java.lang.String EXTRA_TRANSPORT = android.bluetooth.BluetoothDevice.EXTRA_TRANSPORT;
    public static final java.lang.String EXTRA_UUID = android.bluetooth.BluetoothDevice.EXTRA_UUID;
    public static final int PAIRING_VARIANT_PASSKEY_CONFIRMATION = android.bluetooth.BluetoothDevice.PAIRING_VARIANT_PASSKEY_CONFIRMATION;
    public static final int PAIRING_VARIANT_PIN = android.bluetooth.BluetoothDevice.PAIRING_VARIANT_PIN;
    public static final int PHY_LE_1M = android.bluetooth.BluetoothDevice.PHY_LE_1M;
    public static final int PHY_LE_1M_MASK = android.bluetooth.BluetoothDevice.PHY_LE_1M_MASK;
    public static final int PHY_LE_2M = android.bluetooth.BluetoothDevice.PHY_LE_2M;
    public static final int PHY_LE_2M_MASK = android.bluetooth.BluetoothDevice.PHY_LE_2M_MASK;
    public static final int PHY_LE_CODED = android.bluetooth.BluetoothDevice.PHY_LE_CODED;
    public static final int PHY_LE_CODED_MASK = android.bluetooth.BluetoothDevice.PHY_LE_CODED_MASK;
    public static final int PHY_OPTION_NO_PREFERRED = android.bluetooth.BluetoothDevice.PHY_OPTION_NO_PREFERRED;
    public static final int PHY_OPTION_S2 = android.bluetooth.BluetoothDevice.PHY_OPTION_S2;
    public static final int PHY_OPTION_S8 = android.bluetooth.BluetoothDevice.PHY_OPTION_S8;
    public static final int TRANSPORT_AUTO = android.bluetooth.BluetoothDevice.TRANSPORT_AUTO;
    public static final int TRANSPORT_BREDR = android.bluetooth.BluetoothDevice.TRANSPORT_BREDR;
    public static final int TRANSPORT_LE = android.bluetooth.BluetoothDevice.TRANSPORT_LE;

    public static final class BluetoothAddress {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private BluetoothAddress(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice.BluetoothAddress wrap(android.bluetooth.BluetoothDevice.BluetoothAddress real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice.BluetoothAddress(real, (__DcgwBridgeToken) null);
        }

        public android.bluetooth.BluetoothDevice.BluetoothAddress getReal() {
            return (android.bluetooth.BluetoothDevice.BluetoothAddress) real;
        }

        public android.bluetooth.BluetoothDevice.BluetoothAddress unwrap() {
            return getReal();
        }

        public BluetoothAddress(java.lang.String arg0, int arg1) {
            this(new android.bluetooth.BluetoothDevice.BluetoothAddress(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public int describeContents() {
            return ((android.bluetooth.BluetoothDevice.BluetoothAddress) real).describeContents();
        }

        public java.lang.String getAddress() {
            return ((android.bluetooth.BluetoothDevice.BluetoothAddress) real).getAddress();
        }

        public int getAddressType() {
            return ((android.bluetooth.BluetoothDevice.BluetoothAddress) real).getAddressType();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.bluetooth.BluetoothDevice.BluetoothAddress) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
}
