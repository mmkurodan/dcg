// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging;

public final class RangingPreference {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RangingPreference(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.RangingPreference wrap(android.ranging.RangingPreference real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.RangingPreference(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.RangingPreference getReal() {
        return (android.ranging.RangingPreference) real;
    }

    public android.ranging.RangingPreference unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.ranging.RangingPreference) real).describeContents();
    }

    public int getDeviceRole() {
        return ((android.ranging.RangingPreference) real).getDeviceRole();
    }

    public com.micklab.dcg.wrapper.android.ranging.RangingConfig getRangingParams() {
        return com.micklab.dcg.wrapper.android.ranging.RangingConfig.wrap(((android.ranging.RangingPreference) real).getRangingParams());
    }

    public com.micklab.dcg.wrapper.android.ranging.SessionConfig getSessionConfig() {
        return com.micklab.dcg.wrapper.android.ranging.SessionConfig.wrap(((android.ranging.RangingPreference) real).getSessionConfig());
    }

    public java.lang.String toString() {
        return ((android.ranging.RangingPreference) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.ranging.RangingPreference) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int DEVICE_ROLE_INITIATOR = android.ranging.RangingPreference.DEVICE_ROLE_INITIATOR;
    public static final int DEVICE_ROLE_RESPONDER = android.ranging.RangingPreference.DEVICE_ROLE_RESPONDER;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.ranging.RangingPreference.Builder wrap(android.ranging.RangingPreference.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.RangingPreference.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.ranging.RangingPreference.Builder getReal() {
            return (android.ranging.RangingPreference.Builder) real;
        }

        public android.ranging.RangingPreference.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0, com.micklab.dcg.wrapper.android.ranging.RangingConfig arg1) {
            this(new android.ranging.RangingPreference.Builder(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.ranging.RangingPreference build() {
            return com.micklab.dcg.wrapper.android.ranging.RangingPreference.wrap(((android.ranging.RangingPreference.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.ranging.RangingPreference.Builder setSessionConfig(com.micklab.dcg.wrapper.android.ranging.SessionConfig arg0) {
            return com.micklab.dcg.wrapper.android.ranging.RangingPreference.Builder.wrap(((android.ranging.RangingPreference.Builder) real).setSessionConfig(arg0 == null ? null : arg0.getReal()));
        }

    }
}
