// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class AdvertiseData {
    private final android.bluetooth.le.AdvertiseData real;

    public AdvertiseData(android.bluetooth.le.AdvertiseData real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData wrap(android.bluetooth.le.AdvertiseData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData(real);
    }

    public android.bluetooth.le.AdvertiseData unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public boolean getIncludeDeviceName() {
        return real.getIncludeDeviceName();
    }

    public boolean getIncludeTxPowerLevel() {
        return real.getIncludeTxPowerLevel();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.bluetooth.le.AdvertiseData.Builder real;

        public Builder(android.bluetooth.le.AdvertiseData.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder wrap(android.bluetooth.le.AdvertiseData.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder(real);
        }

        public android.bluetooth.le.AdvertiseData.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.bluetooth.le.AdvertiseData.Builder());
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder addManufacturerData(int arg0, byte[] arg1) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder.wrap(real.addManufacturerData(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder addServiceData(com.micklab.dcg.wrapper.android.os.ParcelUuid arg0, byte[] arg1) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder.wrap(real.addServiceData(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder addServiceSolicitationUuid(com.micklab.dcg.wrapper.android.os.ParcelUuid arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder.wrap(real.addServiceSolicitationUuid(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder addServiceUuid(com.micklab.dcg.wrapper.android.os.ParcelUuid arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder.wrap(real.addServiceUuid(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder addTransportDiscoveryData(com.micklab.dcg.wrapper.android.bluetooth.le.TransportDiscoveryData arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder.wrap(real.addTransportDiscoveryData(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData build() {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder setIncludeDeviceName(boolean arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder.wrap(real.setIncludeDeviceName(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder setIncludeTxPowerLevel(boolean arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData.Builder.wrap(real.setIncludeTxPowerLevel(arg0));
        }

    }
}
