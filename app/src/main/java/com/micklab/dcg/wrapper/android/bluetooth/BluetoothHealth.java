// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothHealth {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothHealth(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothHealth wrap(android.bluetooth.BluetoothHealth real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothHealth(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothHealth getReal() {
        return (android.bluetooth.BluetoothHealth) real;
    }

    public android.bluetooth.BluetoothHealth unwrap() {
        return getReal();
    }

    public boolean connectChannelToSource(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothHealthAppConfiguration arg1) {
        return ((android.bluetooth.BluetoothHealth) real).connectChannelToSource(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean disconnectChannel(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothHealthAppConfiguration arg1, int arg2) {
        return ((android.bluetooth.BluetoothHealth) real).disconnectChannel(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public int getConnectionState(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        return ((android.bluetooth.BluetoothHealth) real).getConnectionState(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor getMainChannelFd(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothHealthAppConfiguration arg1) {
        return com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor.wrap(((android.bluetooth.BluetoothHealth) real).getMainChannelFd(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public boolean registerSinkAppConfiguration(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.bluetooth.BluetoothHealthCallback arg2) {
        return ((android.bluetooth.BluetoothHealth) real).registerSinkAppConfiguration(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public boolean unregisterAppConfiguration(com.micklab.dcg.wrapper.android.bluetooth.BluetoothHealthAppConfiguration arg0) {
        return ((android.bluetooth.BluetoothHealth) real).unregisterAppConfiguration(arg0 == null ? null : arg0.getReal());
    }

    public static final int APP_CONFIG_REGISTRATION_FAILURE = android.bluetooth.BluetoothHealth.APP_CONFIG_REGISTRATION_FAILURE;
    public static final int APP_CONFIG_REGISTRATION_SUCCESS = android.bluetooth.BluetoothHealth.APP_CONFIG_REGISTRATION_SUCCESS;
    public static final int APP_CONFIG_UNREGISTRATION_FAILURE = android.bluetooth.BluetoothHealth.APP_CONFIG_UNREGISTRATION_FAILURE;
    public static final int APP_CONFIG_UNREGISTRATION_SUCCESS = android.bluetooth.BluetoothHealth.APP_CONFIG_UNREGISTRATION_SUCCESS;
    public static final int CHANNEL_TYPE_RELIABLE = android.bluetooth.BluetoothHealth.CHANNEL_TYPE_RELIABLE;
    public static final int CHANNEL_TYPE_STREAMING = android.bluetooth.BluetoothHealth.CHANNEL_TYPE_STREAMING;
    public static final int SINK_ROLE = android.bluetooth.BluetoothHealth.SINK_ROLE;
    public static final int SOURCE_ROLE = android.bluetooth.BluetoothHealth.SOURCE_ROLE;
    public static final int STATE_CHANNEL_CONNECTED = android.bluetooth.BluetoothHealth.STATE_CHANNEL_CONNECTED;
    public static final int STATE_CHANNEL_CONNECTING = android.bluetooth.BluetoothHealth.STATE_CHANNEL_CONNECTING;
    public static final int STATE_CHANNEL_DISCONNECTED = android.bluetooth.BluetoothHealth.STATE_CHANNEL_DISCONNECTED;
    public static final int STATE_CHANNEL_DISCONNECTING = android.bluetooth.BluetoothHealth.STATE_CHANNEL_DISCONNECTING;

}
