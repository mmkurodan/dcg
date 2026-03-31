// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging;

public final class SessionConfig {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SessionConfig(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.SessionConfig wrap(android.ranging.SessionConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.SessionConfig(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.SessionConfig getReal() {
        return (android.ranging.SessionConfig) real;
    }

    public android.ranging.SessionConfig unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.ranging.SessionConfig) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.ranging.SessionConfig) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.ranging.DataNotificationConfig getDataNotificationConfig() {
        return com.micklab.dcg.wrapper.android.ranging.DataNotificationConfig.wrap(((android.ranging.SessionConfig) real).getDataNotificationConfig());
    }

    public int getRangingMeasurementsLimit() {
        return ((android.ranging.SessionConfig) real).getRangingMeasurementsLimit();
    }

    public com.micklab.dcg.wrapper.android.ranging.SensorFusionParams getSensorFusionParams() {
        return com.micklab.dcg.wrapper.android.ranging.SensorFusionParams.wrap(((android.ranging.SessionConfig) real).getSensorFusionParams());
    }

    public int hashCode() {
        return ((android.ranging.SessionConfig) real).hashCode();
    }

    public boolean isAngleOfArrivalNeeded() {
        return ((android.ranging.SessionConfig) real).isAngleOfArrivalNeeded();
    }

    public java.lang.String toString() {
        return ((android.ranging.SessionConfig) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.ranging.SessionConfig) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.ranging.SessionConfig.Builder wrap(android.ranging.SessionConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.SessionConfig.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.ranging.SessionConfig.Builder getReal() {
            return (android.ranging.SessionConfig.Builder) real;
        }

        public android.ranging.SessionConfig.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.ranging.SessionConfig.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.ranging.SessionConfig build() {
            return com.micklab.dcg.wrapper.android.ranging.SessionConfig.wrap(((android.ranging.SessionConfig.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.ranging.SessionConfig.Builder setAngleOfArrivalNeeded(boolean arg0) {
            return com.micklab.dcg.wrapper.android.ranging.SessionConfig.Builder.wrap(((android.ranging.SessionConfig.Builder) real).setAngleOfArrivalNeeded(arg0));
        }

        public com.micklab.dcg.wrapper.android.ranging.SessionConfig.Builder setDataNotificationConfig(com.micklab.dcg.wrapper.android.ranging.DataNotificationConfig arg0) {
            return com.micklab.dcg.wrapper.android.ranging.SessionConfig.Builder.wrap(((android.ranging.SessionConfig.Builder) real).setDataNotificationConfig(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.ranging.SessionConfig.Builder setRangingMeasurementsLimit(int arg0) {
            return com.micklab.dcg.wrapper.android.ranging.SessionConfig.Builder.wrap(((android.ranging.SessionConfig.Builder) real).setRangingMeasurementsLimit(arg0));
        }

        public com.micklab.dcg.wrapper.android.ranging.SessionConfig.Builder setSensorFusionParams(com.micklab.dcg.wrapper.android.ranging.SensorFusionParams arg0) {
            return com.micklab.dcg.wrapper.android.ranging.SessionConfig.Builder.wrap(((android.ranging.SessionConfig.Builder) real).setSensorFusionParams(arg0 == null ? null : arg0.getReal()));
        }

    }
}
