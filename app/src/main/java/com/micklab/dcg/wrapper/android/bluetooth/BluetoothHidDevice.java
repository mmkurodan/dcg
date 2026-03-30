// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothHidDevice {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothHidDevice(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothHidDevice wrap(android.bluetooth.BluetoothHidDevice real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothHidDevice(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothHidDevice getReal() {
        return (android.bluetooth.BluetoothHidDevice) real;
    }

    public android.bluetooth.BluetoothHidDevice unwrap() {
        return getReal();
    }

    public boolean connect(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        return ((android.bluetooth.BluetoothHidDevice) real).connect(arg0 == null ? null : arg0.getReal());
    }

    public boolean disconnect(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        return ((android.bluetooth.BluetoothHidDevice) real).disconnect(arg0 == null ? null : arg0.getReal());
    }

    public int getConnectionState(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        return ((android.bluetooth.BluetoothHidDevice) real).getConnectionState(arg0 == null ? null : arg0.getReal());
    }

    public boolean registerApp(com.micklab.dcg.wrapper.android.bluetooth.BluetoothHidDeviceAppSdpSettings arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothHidDeviceAppQosSettings arg1, com.micklab.dcg.wrapper.android.bluetooth.BluetoothHidDeviceAppQosSettings arg2, java.util.concurrent.Executor arg3, com.micklab.dcg.wrapper.android.bluetooth.BluetoothHidDevice.Callback arg4) {
        return ((android.bluetooth.BluetoothHidDevice) real).registerApp(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal());
    }

    public boolean replyReport(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, byte arg1, byte arg2, byte[] arg3) {
        return ((android.bluetooth.BluetoothHidDevice) real).replyReport(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public boolean reportError(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, byte arg1) {
        return ((android.bluetooth.BluetoothHidDevice) real).reportError(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean sendReport(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, int arg1, byte[] arg2) {
        return ((android.bluetooth.BluetoothHidDevice) real).sendReport(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public boolean unregisterApp() {
        return ((android.bluetooth.BluetoothHidDevice) real).unregisterApp();
    }

    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = android.bluetooth.BluetoothHidDevice.ACTION_CONNECTION_STATE_CHANGED;
    public static final byte ERROR_RSP_INVALID_PARAM = android.bluetooth.BluetoothHidDevice.ERROR_RSP_INVALID_PARAM;
    public static final byte ERROR_RSP_INVALID_RPT_ID = android.bluetooth.BluetoothHidDevice.ERROR_RSP_INVALID_RPT_ID;
    public static final byte ERROR_RSP_NOT_READY = android.bluetooth.BluetoothHidDevice.ERROR_RSP_NOT_READY;
    public static final byte ERROR_RSP_SUCCESS = android.bluetooth.BluetoothHidDevice.ERROR_RSP_SUCCESS;
    public static final byte ERROR_RSP_UNKNOWN = android.bluetooth.BluetoothHidDevice.ERROR_RSP_UNKNOWN;
    public static final byte ERROR_RSP_UNSUPPORTED_REQ = android.bluetooth.BluetoothHidDevice.ERROR_RSP_UNSUPPORTED_REQ;
    public static final byte PROTOCOL_BOOT_MODE = android.bluetooth.BluetoothHidDevice.PROTOCOL_BOOT_MODE;
    public static final byte PROTOCOL_REPORT_MODE = android.bluetooth.BluetoothHidDevice.PROTOCOL_REPORT_MODE;
    public static final byte REPORT_TYPE_FEATURE = android.bluetooth.BluetoothHidDevice.REPORT_TYPE_FEATURE;
    public static final byte REPORT_TYPE_INPUT = android.bluetooth.BluetoothHidDevice.REPORT_TYPE_INPUT;
    public static final byte REPORT_TYPE_OUTPUT = android.bluetooth.BluetoothHidDevice.REPORT_TYPE_OUTPUT;
    public static final byte SUBCLASS1_COMBO = android.bluetooth.BluetoothHidDevice.SUBCLASS1_COMBO;
    public static final byte SUBCLASS1_KEYBOARD = android.bluetooth.BluetoothHidDevice.SUBCLASS1_KEYBOARD;
    public static final byte SUBCLASS1_MOUSE = android.bluetooth.BluetoothHidDevice.SUBCLASS1_MOUSE;
    public static final byte SUBCLASS1_NONE = android.bluetooth.BluetoothHidDevice.SUBCLASS1_NONE;
    public static final byte SUBCLASS2_CARD_READER = android.bluetooth.BluetoothHidDevice.SUBCLASS2_CARD_READER;
    public static final byte SUBCLASS2_DIGITIZER_TABLET = android.bluetooth.BluetoothHidDevice.SUBCLASS2_DIGITIZER_TABLET;
    public static final byte SUBCLASS2_GAMEPAD = android.bluetooth.BluetoothHidDevice.SUBCLASS2_GAMEPAD;
    public static final byte SUBCLASS2_JOYSTICK = android.bluetooth.BluetoothHidDevice.SUBCLASS2_JOYSTICK;
    public static final byte SUBCLASS2_REMOTE_CONTROL = android.bluetooth.BluetoothHidDevice.SUBCLASS2_REMOTE_CONTROL;
    public static final byte SUBCLASS2_SENSING_DEVICE = android.bluetooth.BluetoothHidDevice.SUBCLASS2_SENSING_DEVICE;
    public static final byte SUBCLASS2_UNCATEGORIZED = android.bluetooth.BluetoothHidDevice.SUBCLASS2_UNCATEGORIZED;

    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothHidDevice.Callback wrap(android.bluetooth.BluetoothHidDevice.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothHidDevice.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.bluetooth.BluetoothHidDevice.Callback getReal() {
            return (android.bluetooth.BluetoothHidDevice.Callback) real;
        }

        public android.bluetooth.BluetoothHidDevice.Callback unwrap() {
            return getReal();
        }

        public void onAppStatusChanged(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, boolean arg1) {
            ((android.bluetooth.BluetoothHidDevice.Callback) real).onAppStatusChanged(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onConnectionStateChanged(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, int arg1) {
            ((android.bluetooth.BluetoothHidDevice.Callback) real).onConnectionStateChanged(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onGetReport(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, byte arg1, byte arg2, int arg3) {
            ((android.bluetooth.BluetoothHidDevice.Callback) real).onGetReport(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
        }

        public void onInterruptData(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, byte arg1, byte[] arg2) {
            ((android.bluetooth.BluetoothHidDevice.Callback) real).onInterruptData(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public void onSetProtocol(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, byte arg1) {
            ((android.bluetooth.BluetoothHidDevice.Callback) real).onSetProtocol(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onSetReport(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, byte arg1, byte arg2, byte[] arg3) {
            ((android.bluetooth.BluetoothHidDevice.Callback) real).onSetReport(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
        }

        public void onVirtualCableUnplug(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
            ((android.bluetooth.BluetoothHidDevice.Callback) real).onVirtualCableUnplug(arg0 == null ? null : arg0.getReal());
        }

    }
}
