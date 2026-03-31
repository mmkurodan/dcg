// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging.raw;

public final class RawResponderRangingConfig {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RawResponderRangingConfig(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.raw.RawResponderRangingConfig wrap(android.ranging.raw.RawResponderRangingConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.raw.RawResponderRangingConfig(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.raw.RawResponderRangingConfig getReal() {
        return (android.ranging.raw.RawResponderRangingConfig) real;
    }

    public android.ranging.raw.RawResponderRangingConfig unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.ranging.raw.RawResponderRangingConfig) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.ranging.raw.RawRangingDevice getRawRangingDevice() {
        return com.micklab.dcg.wrapper.android.ranging.raw.RawRangingDevice.wrap(((android.ranging.raw.RawResponderRangingConfig) real).getRawRangingDevice());
    }

    public java.lang.String toString() {
        return ((android.ranging.raw.RawResponderRangingConfig) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.ranging.raw.RawResponderRangingConfig) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.ranging.raw.RawResponderRangingConfig.Builder wrap(android.ranging.raw.RawResponderRangingConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.raw.RawResponderRangingConfig.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.ranging.raw.RawResponderRangingConfig.Builder getReal() {
            return (android.ranging.raw.RawResponderRangingConfig.Builder) real;
        }

        public android.ranging.raw.RawResponderRangingConfig.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.ranging.raw.RawResponderRangingConfig.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.ranging.raw.RawResponderRangingConfig build() {
            return com.micklab.dcg.wrapper.android.ranging.raw.RawResponderRangingConfig.wrap(((android.ranging.raw.RawResponderRangingConfig.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.ranging.raw.RawResponderRangingConfig.Builder setRawRangingDevice(com.micklab.dcg.wrapper.android.ranging.raw.RawRangingDevice arg0) {
            return com.micklab.dcg.wrapper.android.ranging.raw.RawResponderRangingConfig.Builder.wrap(((android.ranging.raw.RawResponderRangingConfig.Builder) real).setRawRangingDevice(arg0 == null ? null : arg0.getReal()));
        }

    }
}
