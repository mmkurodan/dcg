// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothCodecStatus {
    private final android.bluetooth.BluetoothCodecStatus real;

    public BluetoothCodecStatus(android.bluetooth.BluetoothCodecStatus real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecStatus wrap(android.bluetooth.BluetoothCodecStatus real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecStatus(real);
    }

    public android.bluetooth.BluetoothCodecStatus unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig getCodecConfig() {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig.wrap(real.getCodecConfig());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isCodecConfigSelectable(com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig arg0) {
        return real.isCodecConfigSelectable(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final java.lang.String EXTRA_CODEC_STATUS = android.bluetooth.BluetoothCodecStatus.EXTRA_CODEC_STATUS;

    public static final class Builder {
        private final android.bluetooth.BluetoothCodecStatus.Builder real;

        public Builder(android.bluetooth.BluetoothCodecStatus.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecStatus.Builder wrap(android.bluetooth.BluetoothCodecStatus.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecStatus.Builder(real);
        }

        public android.bluetooth.BluetoothCodecStatus.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.bluetooth.BluetoothCodecStatus.Builder());
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecStatus build() {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecStatus.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecStatus.Builder setCodecConfig(com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecStatus.Builder.wrap(real.setCodecConfig(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
