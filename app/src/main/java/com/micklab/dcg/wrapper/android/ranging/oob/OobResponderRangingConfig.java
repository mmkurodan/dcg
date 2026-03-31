// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging.oob;

public final class OobResponderRangingConfig {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OobResponderRangingConfig(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.oob.OobResponderRangingConfig wrap(android.ranging.oob.OobResponderRangingConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.oob.OobResponderRangingConfig(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.oob.OobResponderRangingConfig getReal() {
        return (android.ranging.oob.OobResponderRangingConfig) real;
    }

    public android.ranging.oob.OobResponderRangingConfig unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.ranging.oob.OobResponderRangingConfig) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.ranging.oob.DeviceHandle getDeviceHandle() {
        return com.micklab.dcg.wrapper.android.ranging.oob.DeviceHandle.wrap(((android.ranging.oob.OobResponderRangingConfig) real).getDeviceHandle());
    }

    public java.lang.String toString() {
        return ((android.ranging.oob.OobResponderRangingConfig) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.ranging.oob.OobResponderRangingConfig) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.ranging.oob.OobResponderRangingConfig.Builder wrap(android.ranging.oob.OobResponderRangingConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.oob.OobResponderRangingConfig.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.ranging.oob.OobResponderRangingConfig.Builder getReal() {
            return (android.ranging.oob.OobResponderRangingConfig.Builder) real;
        }

        public android.ranging.oob.OobResponderRangingConfig.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.ranging.oob.DeviceHandle arg0) {
            this(new android.ranging.oob.OobResponderRangingConfig.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.ranging.oob.OobResponderRangingConfig build() {
            return com.micklab.dcg.wrapper.android.ranging.oob.OobResponderRangingConfig.wrap(((android.ranging.oob.OobResponderRangingConfig.Builder) real).build());
        }

    }
}
