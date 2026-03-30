// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class AdvertiseSettings {
    private final android.bluetooth.le.AdvertiseSettings real;

    public AdvertiseSettings(android.bluetooth.le.AdvertiseSettings real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings wrap(android.bluetooth.le.AdvertiseSettings real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings(real);
    }

    public android.bluetooth.le.AdvertiseSettings unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getMode() {
        return real.getMode();
    }

    public int getTimeout() {
        return real.getTimeout();
    }

    public int getTxPowerLevel() {
        return real.getTxPowerLevel();
    }

    public boolean isConnectable() {
        return real.isConnectable();
    }

    public boolean isDiscoverable() {
        return real.isDiscoverable();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int ADVERTISE_MODE_BALANCED = android.bluetooth.le.AdvertiseSettings.ADVERTISE_MODE_BALANCED;
    public static final int ADVERTISE_MODE_LOW_LATENCY = android.bluetooth.le.AdvertiseSettings.ADVERTISE_MODE_LOW_LATENCY;
    public static final int ADVERTISE_MODE_LOW_POWER = android.bluetooth.le.AdvertiseSettings.ADVERTISE_MODE_LOW_POWER;
    public static final int ADVERTISE_TX_POWER_HIGH = android.bluetooth.le.AdvertiseSettings.ADVERTISE_TX_POWER_HIGH;
    public static final int ADVERTISE_TX_POWER_LOW = android.bluetooth.le.AdvertiseSettings.ADVERTISE_TX_POWER_LOW;
    public static final int ADVERTISE_TX_POWER_MEDIUM = android.bluetooth.le.AdvertiseSettings.ADVERTISE_TX_POWER_MEDIUM;
    public static final int ADVERTISE_TX_POWER_ULTRA_LOW = android.bluetooth.le.AdvertiseSettings.ADVERTISE_TX_POWER_ULTRA_LOW;

    public static final class Builder {
        private final android.bluetooth.le.AdvertiseSettings.Builder real;

        public Builder(android.bluetooth.le.AdvertiseSettings.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.Builder wrap(android.bluetooth.le.AdvertiseSettings.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.Builder(real);
        }

        public android.bluetooth.le.AdvertiseSettings.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.bluetooth.le.AdvertiseSettings.Builder());
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings build() {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.Builder setAdvertiseMode(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.Builder.wrap(real.setAdvertiseMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.Builder setConnectable(boolean arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.Builder.wrap(real.setConnectable(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.Builder setDiscoverable(boolean arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.Builder.wrap(real.setDiscoverable(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.Builder setTimeout(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.Builder.wrap(real.setTimeout(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.Builder setTxPowerLevel(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings.Builder.wrap(real.setTxPowerLevel(arg0));
        }

    }
}
