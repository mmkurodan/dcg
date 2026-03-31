// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothSocketSettings {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothSocketSettings(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocketSettings wrap(android.bluetooth.BluetoothSocketSettings real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocketSettings(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothSocketSettings getReal() {
        return (android.bluetooth.BluetoothSocketSettings) real;
    }

    public android.bluetooth.BluetoothSocketSettings unwrap() {
        return getReal();
    }

    public int getL2capPsm() {
        return ((android.bluetooth.BluetoothSocketSettings) real).getL2capPsm();
    }

    public java.lang.String getRfcommServiceName() {
        return ((android.bluetooth.BluetoothSocketSettings) real).getRfcommServiceName();
    }

    public java.util.UUID getRfcommUuid() {
        return ((android.bluetooth.BluetoothSocketSettings) real).getRfcommUuid();
    }

    public int getSocketType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.bluetooth.BluetoothSocketSettings#getSocketType()");
    }

    public boolean isAuthenticationRequired() {
        return ((android.bluetooth.BluetoothSocketSettings) real).isAuthenticationRequired();
    }

    public boolean isEncryptionRequired() {
        return ((android.bluetooth.BluetoothSocketSettings) real).isEncryptionRequired();
    }

    public java.lang.String toString() {
        return ((android.bluetooth.BluetoothSocketSettings) real).toString();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocketSettings.Builder wrap(android.bluetooth.BluetoothSocketSettings.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocketSettings.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.bluetooth.BluetoothSocketSettings.Builder getReal() {
            return (android.bluetooth.BluetoothSocketSettings.Builder) real;
        }

        public android.bluetooth.BluetoothSocketSettings.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.bluetooth.BluetoothSocketSettings$Builder#android.bluetooth.BluetoothSocketSettings$Builder()");
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocketSettings build() {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocketSettings.wrap(((android.bluetooth.BluetoothSocketSettings.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocketSettings.Builder setAuthenticationRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocketSettings.Builder.wrap(((android.bluetooth.BluetoothSocketSettings.Builder) real).setAuthenticationRequired(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocketSettings.Builder setEncryptionRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocketSettings.Builder.wrap(((android.bluetooth.BluetoothSocketSettings.Builder) real).setEncryptionRequired(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocketSettings.Builder setL2capPsm(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocketSettings.Builder.wrap(((android.bluetooth.BluetoothSocketSettings.Builder) real).setL2capPsm(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocketSettings.Builder setRfcommServiceName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocketSettings.Builder.wrap(((android.bluetooth.BluetoothSocketSettings.Builder) real).setRfcommServiceName(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocketSettings.Builder setRfcommUuid(java.util.UUID arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocketSettings.Builder.wrap(((android.bluetooth.BluetoothSocketSettings.Builder) real).setRfcommUuid(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothSocketSettings.Builder setSocketType(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.bluetooth.BluetoothSocketSettings$Builder#setSocketType(int)");
        }

    }
}
