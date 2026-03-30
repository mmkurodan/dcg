// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion;

public final class BluetoothDeviceFilter {
    private final android.companion.BluetoothDeviceFilter real;

    public BluetoothDeviceFilter(android.companion.BluetoothDeviceFilter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.BluetoothDeviceFilter wrap(android.companion.BluetoothDeviceFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.BluetoothDeviceFilter(real);
    }

    public android.companion.BluetoothDeviceFilter unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
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
        private final android.companion.BluetoothDeviceFilter.Builder real;

        public Builder(android.companion.BluetoothDeviceFilter.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.companion.BluetoothDeviceFilter.Builder wrap(android.companion.BluetoothDeviceFilter.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.companion.BluetoothDeviceFilter.Builder(real);
        }

        public android.companion.BluetoothDeviceFilter.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.companion.BluetoothDeviceFilter.Builder());
        }

        public com.micklab.dcg.wrapper.android.companion.BluetoothDeviceFilter.Builder addServiceUuid(com.micklab.dcg.wrapper.android.os.ParcelUuid arg0, com.micklab.dcg.wrapper.android.os.ParcelUuid arg1) {
            return com.micklab.dcg.wrapper.android.companion.BluetoothDeviceFilter.Builder.wrap(real.addServiceUuid(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.companion.BluetoothDeviceFilter build() {
            return com.micklab.dcg.wrapper.android.companion.BluetoothDeviceFilter.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.companion.BluetoothDeviceFilter.Builder setAddress(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.companion.BluetoothDeviceFilter.Builder.wrap(real.setAddress(arg0));
        }

        public com.micklab.dcg.wrapper.android.companion.BluetoothDeviceFilter.Builder setNamePattern(java.util.regex.Pattern arg0) {
            return com.micklab.dcg.wrapper.android.companion.BluetoothDeviceFilter.Builder.wrap(real.setNamePattern(arg0));
        }

    }
}
