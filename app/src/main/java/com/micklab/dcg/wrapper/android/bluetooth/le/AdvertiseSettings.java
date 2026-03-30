// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class AdvertiseSettings {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdvertiseSettings(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings wrap(android.bluetooth.le.AdvertiseSettings real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.le.AdvertiseSettings getReal() {
        return (android.bluetooth.le.AdvertiseSettings) real;
    }

    public android.bluetooth.le.AdvertiseSettings unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.bluetooth.le.AdvertiseSettings) real).describeContents();
    }

    public int getMode() {
        return ((android.bluetooth.le.AdvertiseSettings) real).getMode();
    }

    public int getTimeout() {
        return ((android.bluetooth.le.AdvertiseSettings) real).getTimeout();
    }

    public int getTxPowerLevel() {
        return ((android.bluetooth.le.AdvertiseSettings) real).getTxPowerLevel();
    }

    public boolean isConnectable() {
        return ((android.bluetooth.le.AdvertiseSettings) real).isConnectable();
    }

    public boolean isDiscoverable() {
        return ((android.bluetooth.le.AdvertiseSettings) real).isDiscoverable();
    }

    public java.lang.String toString() {
        return ((android.bluetooth.le.AdvertiseSettings) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.bluetooth.le.AdvertiseSettings) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int ADVERTISE_MODE_BALANCED = android.bluetooth.le.AdvertiseSettings.ADVERTISE_MODE_BALANCED;
    public static final int ADVERTISE_MODE_LOW_LATENCY = android.bluetooth.le.AdvertiseSettings.ADVERTISE_MODE_LOW_LATENCY;
    public static final int ADVERTISE_MODE_LOW_POWER = android.bluetooth.le.AdvertiseSettings.ADVERTISE_MODE_LOW_POWER;
    public static final int ADVERTISE_TX_POWER_HIGH = android.bluetooth.le.AdvertiseSettings.ADVERTISE_TX_POWER_HIGH;
    public static final int ADVERTISE_TX_POWER_LOW = android.bluetooth.le.AdvertiseSettings.ADVERTISE_TX_POWER_LOW;
    public static final int ADVERTISE_TX_POWER_MEDIUM = android.bluetooth.le.AdvertiseSettings.ADVERTISE_TX_POWER_MEDIUM;
    public static final int ADVERTISE_TX_POWER_ULTRA_LOW = android.bluetooth.le.AdvertiseSettings.ADVERTISE_TX_POWER_ULTRA_LOW;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.Builder wrap(android.bluetooth.le.AdvertiseSettings.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.bluetooth.le.AdvertiseSettings.Builder getReal() {
            return (android.bluetooth.le.AdvertiseSettings.Builder) real;
        }

        public android.bluetooth.le.AdvertiseSettings.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.bluetooth.le.AdvertiseSettings.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings build() {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.wrap(((android.bluetooth.le.AdvertiseSettings.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.Builder setAdvertiseMode(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.Builder.wrap(((android.bluetooth.le.AdvertiseSettings.Builder) real).setAdvertiseMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.Builder setConnectable(boolean arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.Builder.wrap(((android.bluetooth.le.AdvertiseSettings.Builder) real).setConnectable(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.Builder setDiscoverable(boolean arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.Builder.wrap(((android.bluetooth.le.AdvertiseSettings.Builder) real).setDiscoverable(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.Builder setTimeout(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.Builder.wrap(((android.bluetooth.le.AdvertiseSettings.Builder) real).setTimeout(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.Builder setTxPowerLevel(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.Builder.wrap(((android.bluetooth.le.AdvertiseSettings.Builder) real).setTxPowerLevel(arg0));
        }

    }
}
