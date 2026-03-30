// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.companion;

public final class BluetoothDeviceFilter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothDeviceFilter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.companion.BluetoothDeviceFilter wrap(android.companion.BluetoothDeviceFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.companion.BluetoothDeviceFilter(real, (__DcgwBridgeToken) null);
    }

    public android.companion.BluetoothDeviceFilter getReal() {
        return (android.companion.BluetoothDeviceFilter) real;
    }

    public android.companion.BluetoothDeviceFilter unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.companion.BluetoothDeviceFilter) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.companion.BluetoothDeviceFilter) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.companion.BluetoothDeviceFilter) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.companion.BluetoothDeviceFilter) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.companion.BluetoothDeviceFilter) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.companion.BluetoothDeviceFilter.Builder wrap(android.companion.BluetoothDeviceFilter.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.companion.BluetoothDeviceFilter.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.companion.BluetoothDeviceFilter.Builder getReal() {
            return (android.companion.BluetoothDeviceFilter.Builder) real;
        }

        public android.companion.BluetoothDeviceFilter.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.companion.BluetoothDeviceFilter.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.companion.BluetoothDeviceFilter.Builder addServiceUuid(com.micklab.dcg.wrapper.android.os.ParcelUuid arg0, com.micklab.dcg.wrapper.android.os.ParcelUuid arg1) {
            return com.micklab.dcg.wrapper.android.companion.BluetoothDeviceFilter.Builder.wrap(((android.companion.BluetoothDeviceFilter.Builder) real).addServiceUuid(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.companion.BluetoothDeviceFilter build() {
            return com.micklab.dcg.wrapper.android.companion.BluetoothDeviceFilter.wrap(((android.companion.BluetoothDeviceFilter.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.companion.BluetoothDeviceFilter.Builder setAddress(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.companion.BluetoothDeviceFilter.Builder.wrap(((android.companion.BluetoothDeviceFilter.Builder) real).setAddress(arg0));
        }

        public com.micklab.dcg.wrapper.android.companion.BluetoothDeviceFilter.Builder setNamePattern(java.util.regex.Pattern arg0) {
            return com.micklab.dcg.wrapper.android.companion.BluetoothDeviceFilter.Builder.wrap(((android.companion.BluetoothDeviceFilter.Builder) real).setNamePattern(arg0));
        }

    }
}
