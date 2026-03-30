// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion;

public final class BluetoothLeDeviceFilter {
    private final android.companion.BluetoothLeDeviceFilter real;

    public BluetoothLeDeviceFilter(android.companion.BluetoothLeDeviceFilter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter wrap(android.companion.BluetoothLeDeviceFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter(real);
    }

    public android.companion.BluetoothLeDeviceFilter unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public static int getRenamePrefixLengthLimit() {
        return android.companion.BluetoothLeDeviceFilter.getRenamePrefixLengthLimit();
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
        private final android.companion.BluetoothLeDeviceFilter.Builder real;

        public Builder(android.companion.BluetoothLeDeviceFilter.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.Builder wrap(android.companion.BluetoothLeDeviceFilter.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.Builder(real);
        }

        public android.companion.BluetoothLeDeviceFilter.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.companion.BluetoothLeDeviceFilter.Builder());
        }

        public com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter build() {
            return com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.Builder setNamePattern(java.util.regex.Pattern arg0) {
            return com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.Builder.wrap(real.setNamePattern(arg0));
        }

        public com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.Builder setRawDataFilter(byte[] arg0, byte[] arg1) {
            return com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.Builder.wrap(real.setRawDataFilter(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.Builder setRenameFromBytes(java.lang.String arg0, java.lang.String arg1, int arg2, int arg3, java.nio.ByteOrder arg4) {
            return com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.Builder.wrap(real.setRenameFromBytes(arg0, arg1, arg2, arg3, arg4));
        }

        public com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.Builder setRenameFromName(java.lang.String arg0, java.lang.String arg1, int arg2, int arg3) {
            return com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.Builder.wrap(real.setRenameFromName(arg0, arg1, arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.Builder setScanFilter(com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter arg0) {
            return com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.Builder.wrap(real.setScanFilter(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
