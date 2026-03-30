// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class AdvertisingSetParameters {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdvertisingSetParameters(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters wrap(android.bluetooth.le.AdvertisingSetParameters real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.le.AdvertisingSetParameters getReal() {
        return (android.bluetooth.le.AdvertisingSetParameters) real;
    }

    public android.bluetooth.le.AdvertisingSetParameters unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.bluetooth.le.AdvertisingSetParameters) real).describeContents();
    }

    public int getInterval() {
        return ((android.bluetooth.le.AdvertisingSetParameters) real).getInterval();
    }

    public int getPrimaryPhy() {
        return ((android.bluetooth.le.AdvertisingSetParameters) real).getPrimaryPhy();
    }

    public int getSecondaryPhy() {
        return ((android.bluetooth.le.AdvertisingSetParameters) real).getSecondaryPhy();
    }

    public int getTxPowerLevel() {
        return ((android.bluetooth.le.AdvertisingSetParameters) real).getTxPowerLevel();
    }

    public boolean includeTxPower() {
        return ((android.bluetooth.le.AdvertisingSetParameters) real).includeTxPower();
    }

    public boolean isAnonymous() {
        return ((android.bluetooth.le.AdvertisingSetParameters) real).isAnonymous();
    }

    public boolean isConnectable() {
        return ((android.bluetooth.le.AdvertisingSetParameters) real).isConnectable();
    }

    public boolean isDiscoverable() {
        return ((android.bluetooth.le.AdvertisingSetParameters) real).isDiscoverable();
    }

    public boolean isLegacy() {
        return ((android.bluetooth.le.AdvertisingSetParameters) real).isLegacy();
    }

    public boolean isScannable() {
        return ((android.bluetooth.le.AdvertisingSetParameters) real).isScannable();
    }

    public java.lang.String toString() {
        return ((android.bluetooth.le.AdvertisingSetParameters) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.bluetooth.le.AdvertisingSetParameters) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder wrap(android.bluetooth.le.AdvertisingSetParameters.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.bluetooth.le.AdvertisingSetParameters.Builder getReal() {
            return (android.bluetooth.le.AdvertisingSetParameters.Builder) real;
        }

        public android.bluetooth.le.AdvertisingSetParameters.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.bluetooth.le.AdvertisingSetParameters.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters build() {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.wrap(((android.bluetooth.le.AdvertisingSetParameters.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder setAnonymous(boolean arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder.wrap(((android.bluetooth.le.AdvertisingSetParameters.Builder) real).setAnonymous(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder setConnectable(boolean arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder.wrap(((android.bluetooth.le.AdvertisingSetParameters.Builder) real).setConnectable(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder setDiscoverable(boolean arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder.wrap(((android.bluetooth.le.AdvertisingSetParameters.Builder) real).setDiscoverable(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder setIncludeTxPower(boolean arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder.wrap(((android.bluetooth.le.AdvertisingSetParameters.Builder) real).setIncludeTxPower(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder setInterval(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder.wrap(((android.bluetooth.le.AdvertisingSetParameters.Builder) real).setInterval(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder setLegacyMode(boolean arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder.wrap(((android.bluetooth.le.AdvertisingSetParameters.Builder) real).setLegacyMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder setPrimaryPhy(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder.wrap(((android.bluetooth.le.AdvertisingSetParameters.Builder) real).setPrimaryPhy(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder setScannable(boolean arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder.wrap(((android.bluetooth.le.AdvertisingSetParameters.Builder) real).setScannable(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder setSecondaryPhy(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder.wrap(((android.bluetooth.le.AdvertisingSetParameters.Builder) real).setSecondaryPhy(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder setTxPowerLevel(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters.Builder.wrap(((android.bluetooth.le.AdvertisingSetParameters.Builder) real).setTxPowerLevel(arg0));
        }

    }
}
