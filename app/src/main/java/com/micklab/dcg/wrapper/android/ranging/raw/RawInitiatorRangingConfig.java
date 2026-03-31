// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging.raw;

public final class RawInitiatorRangingConfig {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RawInitiatorRangingConfig(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.raw.RawInitiatorRangingConfig wrap(android.ranging.raw.RawInitiatorRangingConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.raw.RawInitiatorRangingConfig(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.raw.RawInitiatorRangingConfig getReal() {
        return (android.ranging.raw.RawInitiatorRangingConfig) real;
    }

    public android.ranging.raw.RawInitiatorRangingConfig unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.ranging.raw.RawInitiatorRangingConfig) real).describeContents();
    }

    public java.lang.String toString() {
        return ((android.ranging.raw.RawInitiatorRangingConfig) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.ranging.raw.RawInitiatorRangingConfig) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.ranging.raw.RawInitiatorRangingConfig.Builder wrap(android.ranging.raw.RawInitiatorRangingConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.raw.RawInitiatorRangingConfig.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.ranging.raw.RawInitiatorRangingConfig.Builder getReal() {
            return (android.ranging.raw.RawInitiatorRangingConfig.Builder) real;
        }

        public android.ranging.raw.RawInitiatorRangingConfig.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.ranging.raw.RawInitiatorRangingConfig.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.ranging.raw.RawInitiatorRangingConfig.Builder addRawRangingDevice(com.micklab.dcg.wrapper.android.ranging.raw.RawRangingDevice arg0) {
            return com.micklab.dcg.wrapper.android.ranging.raw.RawInitiatorRangingConfig.Builder.wrap(((android.ranging.raw.RawInitiatorRangingConfig.Builder) real).addRawRangingDevice(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.ranging.raw.RawInitiatorRangingConfig build() {
            return com.micklab.dcg.wrapper.android.ranging.raw.RawInitiatorRangingConfig.wrap(((android.ranging.raw.RawInitiatorRangingConfig.Builder) real).build());
        }

    }
}
