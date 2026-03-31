// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging.ble.rssi;

public final class BleRssiRangingParams {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BleRssiRangingParams(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.ble.rssi.BleRssiRangingParams wrap(android.ranging.ble.rssi.BleRssiRangingParams real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.ble.rssi.BleRssiRangingParams(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.ble.rssi.BleRssiRangingParams getReal() {
        return (android.ranging.ble.rssi.BleRssiRangingParams) real;
    }

    public android.ranging.ble.rssi.BleRssiRangingParams unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.ranging.ble.rssi.BleRssiRangingParams) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.ranging.ble.rssi.BleRssiRangingParams) real).equals(arg0);
    }

    public java.lang.String getPeerBluetoothAddress() {
        return ((android.ranging.ble.rssi.BleRssiRangingParams) real).getPeerBluetoothAddress();
    }

    public int getRangingUpdateRate() {
        return ((android.ranging.ble.rssi.BleRssiRangingParams) real).getRangingUpdateRate();
    }

    public int hashCode() {
        return ((android.ranging.ble.rssi.BleRssiRangingParams) real).hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.ranging.ble.rssi.BleRssiRangingParams) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.ranging.ble.rssi.BleRssiRangingParams.Builder wrap(android.ranging.ble.rssi.BleRssiRangingParams.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.ble.rssi.BleRssiRangingParams.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.ranging.ble.rssi.BleRssiRangingParams.Builder getReal() {
            return (android.ranging.ble.rssi.BleRssiRangingParams.Builder) real;
        }

        public android.ranging.ble.rssi.BleRssiRangingParams.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0) {
            this(new android.ranging.ble.rssi.BleRssiRangingParams.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.ranging.ble.rssi.BleRssiRangingParams build() {
            return com.micklab.dcg.wrapper.android.ranging.ble.rssi.BleRssiRangingParams.wrap(((android.ranging.ble.rssi.BleRssiRangingParams.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.ranging.ble.rssi.BleRssiRangingParams.Builder setRangingUpdateRate(int arg0) {
            return com.micklab.dcg.wrapper.android.ranging.ble.rssi.BleRssiRangingParams.Builder.wrap(((android.ranging.ble.rssi.BleRssiRangingParams.Builder) real).setRangingUpdateRate(arg0));
        }

    }
}
