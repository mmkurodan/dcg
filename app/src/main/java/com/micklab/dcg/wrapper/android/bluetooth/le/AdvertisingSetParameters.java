// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class AdvertisingSetParameters {
    private final android.bluetooth.le.AdvertisingSetParameters real;

    public AdvertisingSetParameters(android.bluetooth.le.AdvertisingSetParameters real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters wrap(android.bluetooth.le.AdvertisingSetParameters real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters(real);
    }

    public android.bluetooth.le.AdvertisingSetParameters unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getInterval() {
        return real.getInterval();
    }

    public int getPrimaryPhy() {
        return real.getPrimaryPhy();
    }

    public int getSecondaryPhy() {
        return real.getSecondaryPhy();
    }

    public int getTxPowerLevel() {
        return real.getTxPowerLevel();
    }

    public boolean includeTxPower() {
        return real.includeTxPower();
    }

    public boolean isAnonymous() {
        return real.isAnonymous();
    }

    public boolean isConnectable() {
        return real.isConnectable();
    }

    public boolean isDiscoverable() {
        return real.isDiscoverable();
    }

    public boolean isLegacy() {
        return real.isLegacy();
    }

    public boolean isScannable() {
        return real.isScannable();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int INTERVAL_HIGH = android.bluetooth.le.AdvertisingSetParameters.INTERVAL_HIGH;
    public static final int INTERVAL_LOW = android.bluetooth.le.AdvertisingSetParameters.INTERVAL_LOW;
    public static final int INTERVAL_MAX = android.bluetooth.le.AdvertisingSetParameters.INTERVAL_MAX;
    public static final int INTERVAL_MEDIUM = android.bluetooth.le.AdvertisingSetParameters.INTERVAL_MEDIUM;
    public static final int INTERVAL_MIN = android.bluetooth.le.AdvertisingSetParameters.INTERVAL_MIN;
    public static final int TX_POWER_HIGH = android.bluetooth.le.AdvertisingSetParameters.TX_POWER_HIGH;
    public static final int TX_POWER_LOW = android.bluetooth.le.AdvertisingSetParameters.TX_POWER_LOW;
    public static final int TX_POWER_MAX = android.bluetooth.le.AdvertisingSetParameters.TX_POWER_MAX;
    public static final int TX_POWER_MEDIUM = android.bluetooth.le.AdvertisingSetParameters.TX_POWER_MEDIUM;
    public static final int TX_POWER_MIN = android.bluetooth.le.AdvertisingSetParameters.TX_POWER_MIN;
    public static final int TX_POWER_ULTRA_LOW = android.bluetooth.le.AdvertisingSetParameters.TX_POWER_ULTRA_LOW;

    public static final class Builder {
        private final android.bluetooth.le.AdvertisingSetParameters.Builder real;

        public Builder(android.bluetooth.le.AdvertisingSetParameters.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder wrap(android.bluetooth.le.AdvertisingSetParameters.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder(real);
        }

        public android.bluetooth.le.AdvertisingSetParameters.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.bluetooth.le.AdvertisingSetParameters.Builder());
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters build() {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder setAnonymous(boolean arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder.wrap(real.setAnonymous(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder setConnectable(boolean arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder.wrap(real.setConnectable(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder setDiscoverable(boolean arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder.wrap(real.setDiscoverable(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder setIncludeTxPower(boolean arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder.wrap(real.setIncludeTxPower(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder setInterval(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder.wrap(real.setInterval(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder setLegacyMode(boolean arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder.wrap(real.setLegacyMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder setPrimaryPhy(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder.wrap(real.setPrimaryPhy(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder setScannable(boolean arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder.wrap(real.setScannable(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder setSecondaryPhy(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder.wrap(real.setSecondaryPhy(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder setTxPowerLevel(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder.wrap(real.setTxPowerLevel(arg0));
        }

    }
}
