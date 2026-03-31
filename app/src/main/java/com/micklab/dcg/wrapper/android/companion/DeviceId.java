// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion;

public final class DeviceId {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DeviceId(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.DeviceId wrap(android.companion.DeviceId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.DeviceId(real, (__DcgwBridgeToken) null);
    }

    public android.companion.DeviceId getReal() {
        return (android.companion.DeviceId) real;
    }

    public android.companion.DeviceId unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.companion.DeviceId) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.companion.DeviceId) real).equals(arg0);
    }

    public java.lang.String getCustomId() {
        return ((android.companion.DeviceId) real).getCustomId();
    }

    public com.micklab.dcg.wrapper.android.net.MacAddress getMacAddress() {
        return com.micklab.dcg.wrapper.android.net.MacAddress.wrap(((android.companion.DeviceId) real).getMacAddress());
    }

    public int hashCode() {
        return ((android.companion.DeviceId) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.companion.DeviceId) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.companion.DeviceId) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.companion.DeviceId.Builder wrap(android.companion.DeviceId.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.companion.DeviceId.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.companion.DeviceId.Builder getReal() {
            return (android.companion.DeviceId.Builder) real;
        }

        public android.companion.DeviceId.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.companion.DeviceId.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.companion.DeviceId build() {
            return com.micklab.dcg.wrapper.android.companion.DeviceId.wrap(((android.companion.DeviceId.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.companion.DeviceId.Builder setCustomId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.companion.DeviceId.Builder.wrap(((android.companion.DeviceId.Builder) real).setCustomId(arg0));
        }

        public com.micklab.dcg.wrapper.android.companion.DeviceId.Builder setMacAddress(com.micklab.dcg.wrapper.android.net.MacAddress arg0) {
            return com.micklab.dcg.wrapper.android.companion.DeviceId.Builder.wrap(((android.companion.DeviceId.Builder) real).setMacAddress(arg0 == null ? null : arg0.getReal()));
        }

    }
}
