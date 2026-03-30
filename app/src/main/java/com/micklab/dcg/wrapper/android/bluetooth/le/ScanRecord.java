// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class ScanRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScanRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.ScanRecord wrap(android.bluetooth.le.ScanRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.ScanRecord(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.le.ScanRecord getReal() {
        return (android.bluetooth.le.ScanRecord) real;
    }

    public android.bluetooth.le.ScanRecord unwrap() {
        return getReal();
    }

    public int getAdvertiseFlags() {
        return ((android.bluetooth.le.ScanRecord) real).getAdvertiseFlags();
    }

    public byte[] getBytes() {
        return ((android.bluetooth.le.ScanRecord) real).getBytes();
    }

    public java.lang.String getDeviceName() {
        return ((android.bluetooth.le.ScanRecord) real).getDeviceName();
    }

    public byte[] getManufacturerSpecificData(int arg0) {
        return ((android.bluetooth.le.ScanRecord) real).getManufacturerSpecificData(arg0);
    }

    public byte[] getServiceData(com.micklab.dcg.wrapper.android.os.ParcelUuid arg0) {
        return ((android.bluetooth.le.ScanRecord) real).getServiceData(arg0 == null ? null : arg0.getReal());
    }

    public int getTxPowerLevel() {
        return ((android.bluetooth.le.ScanRecord) real).getTxPowerLevel();
    }

    public java.lang.String toString() {
        return ((android.bluetooth.le.ScanRecord) real).toString();
    }

    public static final int DATA_TYPE_3D_INFORMATION_DATA = android.bluetooth.le.ScanRecord.DATA_TYPE_3D_INFORMATION_DATA;
    public static final int DATA_TYPE_ADVERTISING_INTERVAL = android.bluetooth.le.ScanRecord.DATA_TYPE_ADVERTISING_INTERVAL;
    public static final int DATA_TYPE_ADVERTISING_INTERVAL_LONG = android.bluetooth.le.ScanRecord.DATA_TYPE_ADVERTISING_INTERVAL_LONG;
    public static final int DATA_TYPE_APPEARANCE = android.bluetooth.le.ScanRecord.DATA_TYPE_APPEARANCE;
    public static final int DATA_TYPE_BIG_INFO = android.bluetooth.le.ScanRecord.DATA_TYPE_BIG_INFO;
    public static final int DATA_TYPE_BROADCAST_CODE = android.bluetooth.le.ScanRecord.DATA_TYPE_BROADCAST_CODE;
    public static final int DATA_TYPE_CHANNEL_MAP_UPDATE_INDICATION = android.bluetooth.le.ScanRecord.DATA_TYPE_CHANNEL_MAP_UPDATE_INDICATION;
    public static final int DATA_TYPE_CLASS_OF_DEVICE = android.bluetooth.le.ScanRecord.DATA_TYPE_CLASS_OF_DEVICE;
    public static final int DATA_TYPE_DEVICE_ID = android.bluetooth.le.ScanRecord.DATA_TYPE_DEVICE_ID;
    public static final int DATA_TYPE_FLAGS = android.bluetooth.le.ScanRecord.DATA_TYPE_FLAGS;
    public static final int DATA_TYPE_INDOOR_POSITIONING = android.bluetooth.le.ScanRecord.DATA_TYPE_INDOOR_POSITIONING;
    public static final int DATA_TYPE_LE_BLUETOOTH_DEVICE_ADDRESS = android.bluetooth.le.ScanRecord.DATA_TYPE_LE_BLUETOOTH_DEVICE_ADDRESS;
    public static final int DATA_TYPE_LE_ROLE = android.bluetooth.le.ScanRecord.DATA_TYPE_LE_ROLE;
    public static final int DATA_TYPE_LE_SECURE_CONNECTIONS_CONFIRMATION_VALUE = android.bluetooth.le.ScanRecord.DATA_TYPE_LE_SECURE_CONNECTIONS_CONFIRMATION_VALUE;
    public static final int DATA_TYPE_LE_SECURE_CONNECTIONS_RANDOM_VALUE = android.bluetooth.le.ScanRecord.DATA_TYPE_LE_SECURE_CONNECTIONS_RANDOM_VALUE;
    public static final int DATA_TYPE_LE_SUPPORTED_FEATURES = android.bluetooth.le.ScanRecord.DATA_TYPE_LE_SUPPORTED_FEATURES;
    public static final int DATA_TYPE_LOCAL_NAME_COMPLETE = android.bluetooth.le.ScanRecord.DATA_TYPE_LOCAL_NAME_COMPLETE;
    public static final int DATA_TYPE_LOCAL_NAME_SHORT = android.bluetooth.le.ScanRecord.DATA_TYPE_LOCAL_NAME_SHORT;
    public static final int DATA_TYPE_MANUFACTURER_SPECIFIC_DATA = android.bluetooth.le.ScanRecord.DATA_TYPE_MANUFACTURER_SPECIFIC_DATA;
    public static final int DATA_TYPE_MESH_BEACON = android.bluetooth.le.ScanRecord.DATA_TYPE_MESH_BEACON;
    public static final int DATA_TYPE_MESH_MESSAGE = android.bluetooth.le.ScanRecord.DATA_TYPE_MESH_MESSAGE;
    public static final int DATA_TYPE_NONE = android.bluetooth.le.ScanRecord.DATA_TYPE_NONE;
    public static final int DATA_TYPE_PB_ADV = android.bluetooth.le.ScanRecord.DATA_TYPE_PB_ADV;
    public static final int DATA_TYPE_PUBLIC_TARGET_ADDRESS = android.bluetooth.le.ScanRecord.DATA_TYPE_PUBLIC_TARGET_ADDRESS;
    public static final int DATA_TYPE_RANDOM_TARGET_ADDRESS = android.bluetooth.le.ScanRecord.DATA_TYPE_RANDOM_TARGET_ADDRESS;
    public static final int DATA_TYPE_RESOLVABLE_SET_IDENTIFIER = android.bluetooth.le.ScanRecord.DATA_TYPE_RESOLVABLE_SET_IDENTIFIER;
    public static final int DATA_TYPE_SECURITY_MANAGER_OUT_OF_BAND_FLAGS = android.bluetooth.le.ScanRecord.DATA_TYPE_SECURITY_MANAGER_OUT_OF_BAND_FLAGS;
    public static final int DATA_TYPE_SERVICE_DATA_128_BIT = android.bluetooth.le.ScanRecord.DATA_TYPE_SERVICE_DATA_128_BIT;
    public static final int DATA_TYPE_SERVICE_DATA_16_BIT = android.bluetooth.le.ScanRecord.DATA_TYPE_SERVICE_DATA_16_BIT;
    public static final int DATA_TYPE_SERVICE_DATA_32_BIT = android.bluetooth.le.ScanRecord.DATA_TYPE_SERVICE_DATA_32_BIT;
    public static final int DATA_TYPE_SERVICE_SOLICITATION_UUIDS_128_BIT = android.bluetooth.le.ScanRecord.DATA_TYPE_SERVICE_SOLICITATION_UUIDS_128_BIT;
    public static final int DATA_TYPE_SERVICE_SOLICITATION_UUIDS_16_BIT = android.bluetooth.le.ScanRecord.DATA_TYPE_SERVICE_SOLICITATION_UUIDS_16_BIT;
    public static final int DATA_TYPE_SERVICE_SOLICITATION_UUIDS_32_BIT = android.bluetooth.le.ScanRecord.DATA_TYPE_SERVICE_SOLICITATION_UUIDS_32_BIT;
    public static final int DATA_TYPE_SERVICE_UUIDS_128_BIT_COMPLETE = android.bluetooth.le.ScanRecord.DATA_TYPE_SERVICE_UUIDS_128_BIT_COMPLETE;
    public static final int DATA_TYPE_SERVICE_UUIDS_128_BIT_PARTIAL = android.bluetooth.le.ScanRecord.DATA_TYPE_SERVICE_UUIDS_128_BIT_PARTIAL;
    public static final int DATA_TYPE_SERVICE_UUIDS_16_BIT_COMPLETE = android.bluetooth.le.ScanRecord.DATA_TYPE_SERVICE_UUIDS_16_BIT_COMPLETE;
    public static final int DATA_TYPE_SERVICE_UUIDS_16_BIT_PARTIAL = android.bluetooth.le.ScanRecord.DATA_TYPE_SERVICE_UUIDS_16_BIT_PARTIAL;
    public static final int DATA_TYPE_SERVICE_UUIDS_32_BIT_COMPLETE = android.bluetooth.le.ScanRecord.DATA_TYPE_SERVICE_UUIDS_32_BIT_COMPLETE;
    public static final int DATA_TYPE_SERVICE_UUIDS_32_BIT_PARTIAL = android.bluetooth.le.ScanRecord.DATA_TYPE_SERVICE_UUIDS_32_BIT_PARTIAL;
    public static final int DATA_TYPE_SIMPLE_PAIRING_HASH_C = android.bluetooth.le.ScanRecord.DATA_TYPE_SIMPLE_PAIRING_HASH_C;
    public static final int DATA_TYPE_SIMPLE_PAIRING_HASH_C_256 = android.bluetooth.le.ScanRecord.DATA_TYPE_SIMPLE_PAIRING_HASH_C_256;
    public static final int DATA_TYPE_SIMPLE_PAIRING_RANDOMIZER_R = android.bluetooth.le.ScanRecord.DATA_TYPE_SIMPLE_PAIRING_RANDOMIZER_R;
    public static final int DATA_TYPE_SIMPLE_PAIRING_RANDOMIZER_R_256 = android.bluetooth.le.ScanRecord.DATA_TYPE_SIMPLE_PAIRING_RANDOMIZER_R_256;
    public static final int DATA_TYPE_SLAVE_CONNECTION_INTERVAL_RANGE = android.bluetooth.le.ScanRecord.DATA_TYPE_SLAVE_CONNECTION_INTERVAL_RANGE;
    public static final int DATA_TYPE_TRANSPORT_DISCOVERY_DATA = android.bluetooth.le.ScanRecord.DATA_TYPE_TRANSPORT_DISCOVERY_DATA;
    public static final int DATA_TYPE_TX_POWER_LEVEL = android.bluetooth.le.ScanRecord.DATA_TYPE_TX_POWER_LEVEL;
    public static final int DATA_TYPE_URI = android.bluetooth.le.ScanRecord.DATA_TYPE_URI;

}
