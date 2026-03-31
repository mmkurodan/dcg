// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging.oob;

public final class OobInitiatorRangingConfig {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OobInitiatorRangingConfig(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.oob.OobInitiatorRangingConfig wrap(android.ranging.oob.OobInitiatorRangingConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.oob.OobInitiatorRangingConfig(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.oob.OobInitiatorRangingConfig getReal() {
        return (android.ranging.oob.OobInitiatorRangingConfig) real;
    }

    public android.ranging.oob.OobInitiatorRangingConfig unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.ranging.oob.OobInitiatorRangingConfig) real).describeContents();
    }

    public java.time.Duration getFastestRangingInterval() {
        return ((android.ranging.oob.OobInitiatorRangingConfig) real).getFastestRangingInterval();
    }

    public int getRangingMode() {
        return ((android.ranging.oob.OobInitiatorRangingConfig) real).getRangingMode();
    }

    public int getSecurityLevel() {
        return ((android.ranging.oob.OobInitiatorRangingConfig) real).getSecurityLevel();
    }

    public java.time.Duration getSlowestRangingInterval() {
        return ((android.ranging.oob.OobInitiatorRangingConfig) real).getSlowestRangingInterval();
    }

    public java.lang.String toString() {
        return ((android.ranging.oob.OobInitiatorRangingConfig) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.ranging.oob.OobInitiatorRangingConfig) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int RANGING_MODE_AUTO = android.ranging.oob.OobInitiatorRangingConfig.RANGING_MODE_AUTO;
    public static final int RANGING_MODE_FUSED = android.ranging.oob.OobInitiatorRangingConfig.RANGING_MODE_FUSED;
    public static final int RANGING_MODE_HIGH_ACCURACY = android.ranging.oob.OobInitiatorRangingConfig.RANGING_MODE_HIGH_ACCURACY;
    public static final int RANGING_MODE_HIGH_ACCURACY_PREFERRED = android.ranging.oob.OobInitiatorRangingConfig.RANGING_MODE_HIGH_ACCURACY_PREFERRED;
    public static final int SECURITY_LEVEL_BASIC = android.ranging.oob.OobInitiatorRangingConfig.SECURITY_LEVEL_BASIC;
    public static final int SECURITY_LEVEL_SECURE = android.ranging.oob.OobInitiatorRangingConfig.SECURITY_LEVEL_SECURE;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.ranging.oob.OobInitiatorRangingConfig.Builder wrap(android.ranging.oob.OobInitiatorRangingConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.oob.OobInitiatorRangingConfig.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.ranging.oob.OobInitiatorRangingConfig.Builder getReal() {
            return (android.ranging.oob.OobInitiatorRangingConfig.Builder) real;
        }

        public android.ranging.oob.OobInitiatorRangingConfig.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.ranging.oob.OobInitiatorRangingConfig.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.ranging.oob.OobInitiatorRangingConfig.Builder addDeviceHandle(com.micklab.dcg.wrapper.android.ranging.oob.DeviceHandle arg0) {
            return com.micklab.dcg.wrapper.android.ranging.oob.OobInitiatorRangingConfig.Builder.wrap(((android.ranging.oob.OobInitiatorRangingConfig.Builder) real).addDeviceHandle(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.ranging.oob.OobInitiatorRangingConfig build() {
            return com.micklab.dcg.wrapper.android.ranging.oob.OobInitiatorRangingConfig.wrap(((android.ranging.oob.OobInitiatorRangingConfig.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.ranging.oob.OobInitiatorRangingConfig.Builder setFastestRangingInterval(java.time.Duration arg0) {
            return com.micklab.dcg.wrapper.android.ranging.oob.OobInitiatorRangingConfig.Builder.wrap(((android.ranging.oob.OobInitiatorRangingConfig.Builder) real).setFastestRangingInterval(arg0));
        }

        public com.micklab.dcg.wrapper.android.ranging.oob.OobInitiatorRangingConfig.Builder setRangingMode(int arg0) {
            return com.micklab.dcg.wrapper.android.ranging.oob.OobInitiatorRangingConfig.Builder.wrap(((android.ranging.oob.OobInitiatorRangingConfig.Builder) real).setRangingMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.ranging.oob.OobInitiatorRangingConfig.Builder setSecurityLevel(int arg0) {
            return com.micklab.dcg.wrapper.android.ranging.oob.OobInitiatorRangingConfig.Builder.wrap(((android.ranging.oob.OobInitiatorRangingConfig.Builder) real).setSecurityLevel(arg0));
        }

        public com.micklab.dcg.wrapper.android.ranging.oob.OobInitiatorRangingConfig.Builder setSlowestRangingInterval(java.time.Duration arg0) {
            return com.micklab.dcg.wrapper.android.ranging.oob.OobInitiatorRangingConfig.Builder.wrap(((android.ranging.oob.OobInitiatorRangingConfig.Builder) real).setSlowestRangingInterval(arg0));
        }

    }
}
