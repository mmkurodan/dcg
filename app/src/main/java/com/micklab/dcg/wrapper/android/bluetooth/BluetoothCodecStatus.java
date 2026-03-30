// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothCodecStatus {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothCodecStatus(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecStatus wrap(android.bluetooth.BluetoothCodecStatus real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecStatus(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothCodecStatus getReal() {
        return (android.bluetooth.BluetoothCodecStatus) real;
    }

    public android.bluetooth.BluetoothCodecStatus unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.bluetooth.BluetoothCodecStatus) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.bluetooth.BluetoothCodecStatus) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig getCodecConfig() {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig.wrap(((android.bluetooth.BluetoothCodecStatus) real).getCodecConfig());
    }

    public int hashCode() {
        return ((android.bluetooth.BluetoothCodecStatus) real).hashCode();
    }

    public boolean isCodecConfigSelectable(com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig arg0) {
        return ((android.bluetooth.BluetoothCodecStatus) real).isCodecConfigSelectable(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String toString() {
        return ((android.bluetooth.BluetoothCodecStatus) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.bluetooth.BluetoothCodecStatus) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String EXTRA_CODEC_STATUS = android.bluetooth.BluetoothCodecStatus.EXTRA_CODEC_STATUS;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecStatus.Builder wrap(android.bluetooth.BluetoothCodecStatus.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecStatus.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.bluetooth.BluetoothCodecStatus.Builder getReal() {
            return (android.bluetooth.BluetoothCodecStatus.Builder) real;
        }

        public android.bluetooth.BluetoothCodecStatus.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.bluetooth.BluetoothCodecStatus.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecStatus build() {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecStatus.wrap(((android.bluetooth.BluetoothCodecStatus.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecStatus.Builder setCodecConfig(com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecStatus.Builder.wrap(((android.bluetooth.BluetoothCodecStatus.Builder) real).setCodecConfig(arg0 == null ? null : arg0.getReal()));
        }

    }
}
