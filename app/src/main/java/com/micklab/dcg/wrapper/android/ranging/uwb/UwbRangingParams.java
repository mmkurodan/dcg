// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging.uwb;

public final class UwbRangingParams {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UwbRangingParams(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.uwb.UwbRangingParams wrap(android.ranging.uwb.UwbRangingParams real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.uwb.UwbRangingParams(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.uwb.UwbRangingParams getReal() {
        return (android.ranging.uwb.UwbRangingParams) real;
    }

    public android.ranging.uwb.UwbRangingParams unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.ranging.uwb.UwbRangingParams) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.ranging.uwb.UwbRangingParams) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.ranging.uwb.UwbComplexChannel getComplexChannel() {
        return com.micklab.dcg.wrapper.android.ranging.uwb.UwbComplexChannel.wrap(((android.ranging.uwb.UwbRangingParams) real).getComplexChannel());
    }

    public int getConfigId() {
        return ((android.ranging.uwb.UwbRangingParams) real).getConfigId();
    }

    public com.micklab.dcg.wrapper.android.ranging.uwb.UwbAddress getDeviceAddress() {
        return com.micklab.dcg.wrapper.android.ranging.uwb.UwbAddress.wrap(((android.ranging.uwb.UwbRangingParams) real).getDeviceAddress());
    }

    public com.micklab.dcg.wrapper.android.ranging.uwb.UwbAddress getPeerAddress() {
        return com.micklab.dcg.wrapper.android.ranging.uwb.UwbAddress.wrap(((android.ranging.uwb.UwbRangingParams) real).getPeerAddress());
    }

    public int getRangingUpdateRate() {
        return ((android.ranging.uwb.UwbRangingParams) real).getRangingUpdateRate();
    }

    public int getSessionId() {
        return ((android.ranging.uwb.UwbRangingParams) real).getSessionId();
    }

    public byte[] getSessionKeyInfo() {
        return ((android.ranging.uwb.UwbRangingParams) real).getSessionKeyInfo();
    }

    public int getSlotDuration() {
        return ((android.ranging.uwb.UwbRangingParams) real).getSlotDuration();
    }

    public int getSubSessionId() {
        return ((android.ranging.uwb.UwbRangingParams) real).getSubSessionId();
    }

    public byte[] getSubSessionKeyInfo() {
        return ((android.ranging.uwb.UwbRangingParams) real).getSubSessionKeyInfo();
    }

    public int hashCode() {
        return ((android.ranging.uwb.UwbRangingParams) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.ranging.uwb.UwbRangingParams) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.ranging.uwb.UwbRangingParams) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int CONFIG_MULTICAST_DS_TWR = android.ranging.uwb.UwbRangingParams.CONFIG_MULTICAST_DS_TWR;
    public static final int CONFIG_PROVISIONED_INDIVIDUAL_MULTICAST_DS_TWR = android.ranging.uwb.UwbRangingParams.CONFIG_PROVISIONED_INDIVIDUAL_MULTICAST_DS_TWR;
    public static final int CONFIG_PROVISIONED_MULTICAST_DS_TWR = android.ranging.uwb.UwbRangingParams.CONFIG_PROVISIONED_MULTICAST_DS_TWR;
    public static final int CONFIG_PROVISIONED_UNICAST_DS_TWR = android.ranging.uwb.UwbRangingParams.CONFIG_PROVISIONED_UNICAST_DS_TWR;
    public static final int CONFIG_PROVISIONED_UNICAST_DS_TWR_VERY_FAST = android.ranging.uwb.UwbRangingParams.CONFIG_PROVISIONED_UNICAST_DS_TWR_VERY_FAST;
    public static final int CONFIG_UNICAST_DS_TWR = android.ranging.uwb.UwbRangingParams.CONFIG_UNICAST_DS_TWR;
    public static final int DURATION_1_MS = android.ranging.uwb.UwbRangingParams.DURATION_1_MS;
    public static final int DURATION_2_MS = android.ranging.uwb.UwbRangingParams.DURATION_2_MS;
    public static final int SUB_SESSION_UNDEFINED = android.ranging.uwb.UwbRangingParams.SUB_SESSION_UNDEFINED;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.ranging.uwb.UwbRangingParams.Builder wrap(android.ranging.uwb.UwbRangingParams.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.uwb.UwbRangingParams.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.ranging.uwb.UwbRangingParams.Builder getReal() {
            return (android.ranging.uwb.UwbRangingParams.Builder) real;
        }

        public android.ranging.uwb.UwbRangingParams.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0, int arg1, com.micklab.dcg.wrapper.android.ranging.uwb.UwbAddress arg2, com.micklab.dcg.wrapper.android.ranging.uwb.UwbAddress arg3) {
            this(new android.ranging.uwb.UwbRangingParams.Builder(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.ranging.uwb.UwbRangingParams build() {
            return com.micklab.dcg.wrapper.android.ranging.uwb.UwbRangingParams.wrap(((android.ranging.uwb.UwbRangingParams.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.ranging.uwb.UwbRangingParams.Builder setComplexChannel(com.micklab.dcg.wrapper.android.ranging.uwb.UwbComplexChannel arg0) {
            return com.micklab.dcg.wrapper.android.ranging.uwb.UwbRangingParams.Builder.wrap(((android.ranging.uwb.UwbRangingParams.Builder) real).setComplexChannel(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.ranging.uwb.UwbRangingParams.Builder setRangingUpdateRate(int arg0) {
            return com.micklab.dcg.wrapper.android.ranging.uwb.UwbRangingParams.Builder.wrap(((android.ranging.uwb.UwbRangingParams.Builder) real).setRangingUpdateRate(arg0));
        }

        public com.micklab.dcg.wrapper.android.ranging.uwb.UwbRangingParams.Builder setSessionKeyInfo(byte[] arg0) {
            return com.micklab.dcg.wrapper.android.ranging.uwb.UwbRangingParams.Builder.wrap(((android.ranging.uwb.UwbRangingParams.Builder) real).setSessionKeyInfo(arg0));
        }

        public com.micklab.dcg.wrapper.android.ranging.uwb.UwbRangingParams.Builder setSlotDuration(int arg0) {
            return com.micklab.dcg.wrapper.android.ranging.uwb.UwbRangingParams.Builder.wrap(((android.ranging.uwb.UwbRangingParams.Builder) real).setSlotDuration(arg0));
        }

        public com.micklab.dcg.wrapper.android.ranging.uwb.UwbRangingParams.Builder setSubSessionId(int arg0) {
            return com.micklab.dcg.wrapper.android.ranging.uwb.UwbRangingParams.Builder.wrap(((android.ranging.uwb.UwbRangingParams.Builder) real).setSubSessionId(arg0));
        }

        public com.micklab.dcg.wrapper.android.ranging.uwb.UwbRangingParams.Builder setSubSessionKeyInfo(byte[] arg0) {
            return com.micklab.dcg.wrapper.android.ranging.uwb.UwbRangingParams.Builder.wrap(((android.ranging.uwb.UwbRangingParams.Builder) real).setSubSessionKeyInfo(arg0));
        }

    }
}
