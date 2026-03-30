// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class AdvertiseData {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdvertiseData(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData wrap(android.bluetooth.le.AdvertiseData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.le.AdvertiseData getReal() {
        return (android.bluetooth.le.AdvertiseData) real;
    }

    public android.bluetooth.le.AdvertiseData unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.bluetooth.le.AdvertiseData) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.bluetooth.le.AdvertiseData) real).equals(arg0);
    }

    public boolean getIncludeDeviceName() {
        return ((android.bluetooth.le.AdvertiseData) real).getIncludeDeviceName();
    }

    public boolean getIncludeTxPowerLevel() {
        return ((android.bluetooth.le.AdvertiseData) real).getIncludeTxPowerLevel();
    }

    public int hashCode() {
        return ((android.bluetooth.le.AdvertiseData) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.bluetooth.le.AdvertiseData) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.bluetooth.le.AdvertiseData) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder wrap(android.bluetooth.le.AdvertiseData.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.bluetooth.le.AdvertiseData.Builder getReal() {
            return (android.bluetooth.le.AdvertiseData.Builder) real;
        }

        public android.bluetooth.le.AdvertiseData.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.bluetooth.le.AdvertiseData.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder addManufacturerData(int arg0, byte[] arg1) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder.wrap(((android.bluetooth.le.AdvertiseData.Builder) real).addManufacturerData(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder addServiceData(com.micklab.dcg.wrapper.android.os.ParcelUuid arg0, byte[] arg1) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder.wrap(((android.bluetooth.le.AdvertiseData.Builder) real).addServiceData(arg0 == null ? null : arg0.getReal(), arg1));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder addServiceSolicitationUuid(com.micklab.dcg.wrapper.android.os.ParcelUuid arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder.wrap(((android.bluetooth.le.AdvertiseData.Builder) real).addServiceSolicitationUuid(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder addServiceUuid(com.micklab.dcg.wrapper.android.os.ParcelUuid arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder.wrap(((android.bluetooth.le.AdvertiseData.Builder) real).addServiceUuid(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder addTransportDiscoveryData(com.micklab.dcg.wrapper.android.bluetooth.le.TransportDiscoveryData arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder.wrap(((android.bluetooth.le.AdvertiseData.Builder) real).addTransportDiscoveryData(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData build() {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.wrap(((android.bluetooth.le.AdvertiseData.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder setIncludeDeviceName(boolean arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder.wrap(((android.bluetooth.le.AdvertiseData.Builder) real).setIncludeDeviceName(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder setIncludeTxPowerLevel(boolean arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder.wrap(((android.bluetooth.le.AdvertiseData.Builder) real).setIncludeTxPowerLevel(arg0));
        }

    }
}
