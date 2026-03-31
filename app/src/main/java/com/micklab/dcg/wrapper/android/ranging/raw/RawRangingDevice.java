// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging.raw;

public final class RawRangingDevice {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RawRangingDevice(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.raw.RawRangingDevice wrap(android.ranging.raw.RawRangingDevice real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.raw.RawRangingDevice(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.raw.RawRangingDevice getReal() {
        return (android.ranging.raw.RawRangingDevice) real;
    }

    public android.ranging.raw.RawRangingDevice unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.ranging.raw.RawRangingDevice) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.ranging.ble.rssi.BleRssiRangingParams getBleRssiRangingParams() {
        return com.micklab.dcg.wrapper.android.ranging.ble.rssi.BleRssiRangingParams.wrap(((android.ranging.raw.RawRangingDevice) real).getBleRssiRangingParams());
    }

    public com.micklab.dcg.wrapper.android.ranging.ble.cs.BleCsRangingParams getCsRangingParams() {
        return com.micklab.dcg.wrapper.android.ranging.ble.cs.BleCsRangingParams.wrap(((android.ranging.raw.RawRangingDevice) real).getCsRangingParams());
    }

    public com.micklab.dcg.wrapper.android.ranging.RangingDevice getRangingDevice() {
        return com.micklab.dcg.wrapper.android.ranging.RangingDevice.wrap(((android.ranging.raw.RawRangingDevice) real).getRangingDevice());
    }

    public com.micklab.dcg.wrapper.android.ranging.wifi.rtt.RttRangingParams getRttRangingParams() {
        return com.micklab.dcg.wrapper.android.ranging.wifi.rtt.RttRangingParams.wrap(((android.ranging.raw.RawRangingDevice) real).getRttRangingParams());
    }

    public com.micklab.dcg.wrapper.android.ranging.uwb.UwbRangingParams getUwbRangingParams() {
        return com.micklab.dcg.wrapper.android.ranging.uwb.UwbRangingParams.wrap(((android.ranging.raw.RawRangingDevice) real).getUwbRangingParams());
    }

    public java.lang.String toString() {
        return ((android.ranging.raw.RawRangingDevice) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.ranging.raw.RawRangingDevice) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int UPDATE_RATE_FREQUENT = android.ranging.raw.RawRangingDevice.UPDATE_RATE_FREQUENT;
    public static final int UPDATE_RATE_INFREQUENT = android.ranging.raw.RawRangingDevice.UPDATE_RATE_INFREQUENT;
    public static final int UPDATE_RATE_NORMAL = android.ranging.raw.RawRangingDevice.UPDATE_RATE_NORMAL;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.ranging.raw.RawRangingDevice.Builder wrap(android.ranging.raw.RawRangingDevice.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.raw.RawRangingDevice.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.ranging.raw.RawRangingDevice.Builder getReal() {
            return (android.ranging.raw.RawRangingDevice.Builder) real;
        }

        public android.ranging.raw.RawRangingDevice.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.ranging.raw.RawRangingDevice.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.ranging.raw.RawRangingDevice build() {
            return com.micklab.dcg.wrapper.android.ranging.raw.RawRangingDevice.wrap(((android.ranging.raw.RawRangingDevice.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.ranging.raw.RawRangingDevice.Builder setBleRssiRangingParams(com.micklab.dcg.wrapper.android.ranging.ble.rssi.BleRssiRangingParams arg0) {
            return com.micklab.dcg.wrapper.android.ranging.raw.RawRangingDevice.Builder.wrap(((android.ranging.raw.RawRangingDevice.Builder) real).setBleRssiRangingParams(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.ranging.raw.RawRangingDevice.Builder setCsRangingParams(com.micklab.dcg.wrapper.android.ranging.ble.cs.BleCsRangingParams arg0) {
            return com.micklab.dcg.wrapper.android.ranging.raw.RawRangingDevice.Builder.wrap(((android.ranging.raw.RawRangingDevice.Builder) real).setCsRangingParams(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.ranging.raw.RawRangingDevice.Builder setRangingDevice(com.micklab.dcg.wrapper.android.ranging.RangingDevice arg0) {
            return com.micklab.dcg.wrapper.android.ranging.raw.RawRangingDevice.Builder.wrap(((android.ranging.raw.RawRangingDevice.Builder) real).setRangingDevice(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.ranging.raw.RawRangingDevice.Builder setRttRangingParams(com.micklab.dcg.wrapper.android.ranging.wifi.rtt.RttRangingParams arg0) {
            return com.micklab.dcg.wrapper.android.ranging.raw.RawRangingDevice.Builder.wrap(((android.ranging.raw.RawRangingDevice.Builder) real).setRttRangingParams(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.ranging.raw.RawRangingDevice.Builder setUwbRangingParams(com.micklab.dcg.wrapper.android.ranging.uwb.UwbRangingParams arg0) {
            return com.micklab.dcg.wrapper.android.ranging.raw.RawRangingDevice.Builder.wrap(((android.ranging.raw.RawRangingDevice.Builder) real).setUwbRangingParams(arg0 == null ? null : arg0.getReal()));
        }

    }
}
