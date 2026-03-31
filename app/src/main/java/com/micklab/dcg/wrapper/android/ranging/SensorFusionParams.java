// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging;

public final class SensorFusionParams {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SensorFusionParams(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.SensorFusionParams wrap(android.ranging.SensorFusionParams real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.SensorFusionParams(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.SensorFusionParams getReal() {
        return (android.ranging.SensorFusionParams) real;
    }

    public android.ranging.SensorFusionParams unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.ranging.SensorFusionParams) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.ranging.SensorFusionParams) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.ranging.SensorFusionParams) real).hashCode();
    }

    public boolean isSensorFusionEnabled() {
        return ((android.ranging.SensorFusionParams) real).isSensorFusionEnabled();
    }

    public java.lang.String toString() {
        return ((android.ranging.SensorFusionParams) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.ranging.SensorFusionParams) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.ranging.SensorFusionParams.Builder wrap(android.ranging.SensorFusionParams.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.SensorFusionParams.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.ranging.SensorFusionParams.Builder getReal() {
            return (android.ranging.SensorFusionParams.Builder) real;
        }

        public android.ranging.SensorFusionParams.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.ranging.SensorFusionParams.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.ranging.SensorFusionParams build() {
            return com.micklab.dcg.wrapper.android.ranging.SensorFusionParams.wrap(((android.ranging.SensorFusionParams.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.ranging.SensorFusionParams.Builder setSensorFusionEnabled(boolean arg0) {
            return com.micklab.dcg.wrapper.android.ranging.SensorFusionParams.Builder.wrap(((android.ranging.SensorFusionParams.Builder) real).setSensorFusionEnabled(arg0));
        }

    }
}
