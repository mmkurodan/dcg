// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion;

public final class BluetoothLeDeviceFilter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothLeDeviceFilter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter wrap(android.companion.BluetoothLeDeviceFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter(real, (__DcgwBridgeToken) null);
    }

    public android.companion.BluetoothLeDeviceFilter getReal() {
        return (android.companion.BluetoothLeDeviceFilter) real;
    }

    public android.companion.BluetoothLeDeviceFilter unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.companion.BluetoothLeDeviceFilter) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.companion.BluetoothLeDeviceFilter) real).equals(arg0);
    }

    public static int getRenamePrefixLengthLimit() {
        return android.companion.BluetoothLeDeviceFilter.getRenamePrefixLengthLimit();
    }

    public int hashCode() {
        return ((android.companion.BluetoothLeDeviceFilter) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.companion.BluetoothLeDeviceFilter) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.companion.BluetoothLeDeviceFilter) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.Builder wrap(android.companion.BluetoothLeDeviceFilter.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.companion.BluetoothLeDeviceFilter.Builder getReal() {
            return (android.companion.BluetoothLeDeviceFilter.Builder) real;
        }

        public android.companion.BluetoothLeDeviceFilter.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.companion.BluetoothLeDeviceFilter.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter build() {
            return com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.wrap(((android.companion.BluetoothLeDeviceFilter.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.Builder setNamePattern(java.util.regex.Pattern arg0) {
            return com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.Builder.wrap(((android.companion.BluetoothLeDeviceFilter.Builder) real).setNamePattern(arg0));
        }

        public com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.Builder setRawDataFilter(byte[] arg0, byte[] arg1) {
            return com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.Builder.wrap(((android.companion.BluetoothLeDeviceFilter.Builder) real).setRawDataFilter(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.Builder setRenameFromBytes(java.lang.String arg0, java.lang.String arg1, int arg2, int arg3, java.nio.ByteOrder arg4) {
            return com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.Builder.wrap(((android.companion.BluetoothLeDeviceFilter.Builder) real).setRenameFromBytes(arg0, arg1, arg2, arg3, arg4));
        }

        public com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.Builder setRenameFromName(java.lang.String arg0, java.lang.String arg1, int arg2, int arg3) {
            return com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.Builder.wrap(((android.companion.BluetoothLeDeviceFilter.Builder) real).setRenameFromName(arg0, arg1, arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.Builder setScanFilter(com.micklab.dcg.wrapper.android.bluetooth.le.ScanFilter arg0) {
            return com.micklab.dcg.wrapper.android.companion.BluetoothLeDeviceFilter.Builder.wrap(((android.companion.BluetoothLeDeviceFilter.Builder) real).setScanFilter(arg0 == null ? null : arg0.getReal()));
        }

    }
}
