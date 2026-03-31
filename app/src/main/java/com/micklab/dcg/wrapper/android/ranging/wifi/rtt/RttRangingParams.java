// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging.wifi.rtt;

public final class RttRangingParams {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RttRangingParams(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.wifi.rtt.RttRangingParams wrap(android.ranging.wifi.rtt.RttRangingParams real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.wifi.rtt.RttRangingParams(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.wifi.rtt.RttRangingParams getReal() {
        return (android.ranging.wifi.rtt.RttRangingParams) real;
    }

    public android.ranging.wifi.rtt.RttRangingParams unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.ranging.wifi.rtt.RttRangingParams) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.ranging.wifi.rtt.RttRangingParams) real).equals(arg0);
    }

    public byte[] getMatchFilter() {
        return ((android.ranging.wifi.rtt.RttRangingParams) real).getMatchFilter();
    }

    public int getRangingUpdateRate() {
        return ((android.ranging.wifi.rtt.RttRangingParams) real).getRangingUpdateRate();
    }

    public java.lang.String getServiceName() {
        return ((android.ranging.wifi.rtt.RttRangingParams) real).getServiceName();
    }

    public int hashCode() {
        return ((android.ranging.wifi.rtt.RttRangingParams) real).hashCode();
    }

    public boolean isPeriodicRangingHwFeatureEnabled() {
        return ((android.ranging.wifi.rtt.RttRangingParams) real).isPeriodicRangingHwFeatureEnabled();
    }

    public java.lang.String toString() {
        return ((android.ranging.wifi.rtt.RttRangingParams) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.ranging.wifi.rtt.RttRangingParams) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.ranging.wifi.rtt.RttRangingParams.Builder wrap(android.ranging.wifi.rtt.RttRangingParams.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.wifi.rtt.RttRangingParams.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.ranging.wifi.rtt.RttRangingParams.Builder getReal() {
            return (android.ranging.wifi.rtt.RttRangingParams.Builder) real;
        }

        public android.ranging.wifi.rtt.RttRangingParams.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0) {
            this(new android.ranging.wifi.rtt.RttRangingParams.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.ranging.wifi.rtt.RttRangingParams build() {
            return com.micklab.dcg.wrapper.android.ranging.wifi.rtt.RttRangingParams.wrap(((android.ranging.wifi.rtt.RttRangingParams.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.ranging.wifi.rtt.RttRangingParams.Builder setMatchFilter(byte[] arg0) {
            return com.micklab.dcg.wrapper.android.ranging.wifi.rtt.RttRangingParams.Builder.wrap(((android.ranging.wifi.rtt.RttRangingParams.Builder) real).setMatchFilter(arg0));
        }

        public com.micklab.dcg.wrapper.android.ranging.wifi.rtt.RttRangingParams.Builder setPeriodicRangingHwFeatureEnabled(boolean arg0) {
            return com.micklab.dcg.wrapper.android.ranging.wifi.rtt.RttRangingParams.Builder.wrap(((android.ranging.wifi.rtt.RttRangingParams.Builder) real).setPeriodicRangingHwFeatureEnabled(arg0));
        }

        public com.micklab.dcg.wrapper.android.ranging.wifi.rtt.RttRangingParams.Builder setRangingUpdateRate(int arg0) {
            return com.micklab.dcg.wrapper.android.ranging.wifi.rtt.RttRangingParams.Builder.wrap(((android.ranging.wifi.rtt.RttRangingParams.Builder) real).setRangingUpdateRate(arg0));
        }

    }
}
