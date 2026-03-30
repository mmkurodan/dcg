// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothProfile {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothProfile(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothProfile wrap(android.bluetooth.BluetoothProfile real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothProfile(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothProfile getReal() {
        return (android.bluetooth.BluetoothProfile) real;
    }

    public android.bluetooth.BluetoothProfile unwrap() {
        return getReal();
    }

    public int getConnectionState(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        return ((android.bluetooth.BluetoothProfile) real).getConnectionState(arg0 == null ? null : arg0.getReal());
    }

    public static final int A2DP = android.bluetooth.BluetoothProfile.A2DP;
    public static final int CSIP_SET_COORDINATOR = android.bluetooth.BluetoothProfile.CSIP_SET_COORDINATOR;
    public static final java.lang.String EXTRA_PREVIOUS_STATE = android.bluetooth.BluetoothProfile.EXTRA_PREVIOUS_STATE;
    public static final java.lang.String EXTRA_STATE = android.bluetooth.BluetoothProfile.EXTRA_STATE;
    public static final int GATT = android.bluetooth.BluetoothProfile.GATT;
    public static final int GATT_SERVER = android.bluetooth.BluetoothProfile.GATT_SERVER;
    public static final int HAP_CLIENT = android.bluetooth.BluetoothProfile.HAP_CLIENT;
    public static final int HEADSET = android.bluetooth.BluetoothProfile.HEADSET;
    public static final int HEALTH = android.bluetooth.BluetoothProfile.HEALTH;
    public static final int HEARING_AID = android.bluetooth.BluetoothProfile.HEARING_AID;
    public static final int HID_DEVICE = android.bluetooth.BluetoothProfile.HID_DEVICE;
    public static final int LE_AUDIO = android.bluetooth.BluetoothProfile.LE_AUDIO;
    public static final int SAP = android.bluetooth.BluetoothProfile.SAP;
    public static final int STATE_CONNECTED = android.bluetooth.BluetoothProfile.STATE_CONNECTED;
    public static final int STATE_CONNECTING = android.bluetooth.BluetoothProfile.STATE_CONNECTING;
    public static final int STATE_DISCONNECTED = android.bluetooth.BluetoothProfile.STATE_DISCONNECTED;
    public static final int STATE_DISCONNECTING = android.bluetooth.BluetoothProfile.STATE_DISCONNECTING;

    public static final class ServiceListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ServiceListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothProfile.ServiceListener wrap(android.bluetooth.BluetoothProfile.ServiceListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothProfile.ServiceListener(real, (__DcgwBridgeToken) null);
        }

        public android.bluetooth.BluetoothProfile.ServiceListener getReal() {
            return (android.bluetooth.BluetoothProfile.ServiceListener) real;
        }

        public android.bluetooth.BluetoothProfile.ServiceListener unwrap() {
            return getReal();
        }

        public void onServiceConnected(int arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothProfile arg1) {
            ((android.bluetooth.BluetoothProfile.ServiceListener) real).onServiceConnected(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void onServiceDisconnected(int arg0) {
            ((android.bluetooth.BluetoothProfile.ServiceListener) real).onServiceDisconnected(arg0);
        }

    }
}
