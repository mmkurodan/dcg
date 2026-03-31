// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.ranging;

public final class RangingDevice {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RangingDevice(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.ranging.RangingDevice wrap(android.ranging.RangingDevice real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.RangingDevice(real, (__DcgwBridgeToken) null);
    }

    public android.ranging.RangingDevice getReal() {
        return (android.ranging.RangingDevice) real;
    }

    public android.ranging.RangingDevice unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.ranging.RangingDevice) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.ranging.RangingDevice) real).equals(arg0);
    }

    public java.util.UUID getUuid() {
        return ((android.ranging.RangingDevice) real).getUuid();
    }

    public int hashCode() {
        return ((android.ranging.RangingDevice) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.ranging.RangingDevice) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.ranging.RangingDevice) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.ranging.RangingDevice.Builder wrap(android.ranging.RangingDevice.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.ranging.RangingDevice.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.ranging.RangingDevice.Builder getReal() {
            return (android.ranging.RangingDevice.Builder) real;
        }

        public android.ranging.RangingDevice.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.ranging.RangingDevice.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.ranging.RangingDevice build() {
            return com.micklab.dcg.wrapper.android.ranging.RangingDevice.wrap(((android.ranging.RangingDevice.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.ranging.RangingDevice.Builder setUuid(java.util.UUID arg0) {
            return com.micklab.dcg.wrapper.android.ranging.RangingDevice.Builder.wrap(((android.ranging.RangingDevice.Builder) real).setUuid(arg0));
        }

    }
}
