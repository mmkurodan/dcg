// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothHeadset {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothHeadset(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothHeadset wrap(android.bluetooth.BluetoothHeadset real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothHeadset(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothHeadset getReal() {
        return (android.bluetooth.BluetoothHeadset) real;
    }

    public android.bluetooth.BluetoothHeadset unwrap() {
        return getReal();
    }

    public int getConnectionState(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        return ((android.bluetooth.BluetoothHeadset) real).getConnectionState(arg0 == null ? null : arg0.getReal());
    }

    public boolean isAudioConnected(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        return ((android.bluetooth.BluetoothHeadset) real).isAudioConnected(arg0 == null ? null : arg0.getReal());
    }

    public boolean isNoiseReductionSupported(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        return ((android.bluetooth.BluetoothHeadset) real).isNoiseReductionSupported(arg0 == null ? null : arg0.getReal());
    }

    public boolean isVoiceRecognitionSupported(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        return ((android.bluetooth.BluetoothHeadset) real).isVoiceRecognitionSupported(arg0 == null ? null : arg0.getReal());
    }

    public boolean sendVendorSpecificResultCode(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, java.lang.String arg1, java.lang.String arg2) {
        return ((android.bluetooth.BluetoothHeadset) real).sendVendorSpecificResultCode(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public boolean startVoiceRecognition(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        return ((android.bluetooth.BluetoothHeadset) real).startVoiceRecognition(arg0 == null ? null : arg0.getReal());
    }

    public boolean stopVoiceRecognition(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        return ((android.bluetooth.BluetoothHeadset) real).stopVoiceRecognition(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String ACTION_AUDIO_STATE_CHANGED = android.bluetooth.BluetoothHeadset.ACTION_AUDIO_STATE_CHANGED;
    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = android.bluetooth.BluetoothHeadset.ACTION_CONNECTION_STATE_CHANGED;
    public static final java.lang.String ACTION_VENDOR_SPECIFIC_HEADSET_EVENT = android.bluetooth.BluetoothHeadset.ACTION_VENDOR_SPECIFIC_HEADSET_EVENT;
    public static final int AT_CMD_TYPE_ACTION = android.bluetooth.BluetoothHeadset.AT_CMD_TYPE_ACTION;
    public static final int AT_CMD_TYPE_BASIC = android.bluetooth.BluetoothHeadset.AT_CMD_TYPE_BASIC;
    public static final int AT_CMD_TYPE_READ = android.bluetooth.BluetoothHeadset.AT_CMD_TYPE_READ;
    public static final int AT_CMD_TYPE_SET = android.bluetooth.BluetoothHeadset.AT_CMD_TYPE_SET;
    public static final int AT_CMD_TYPE_TEST = android.bluetooth.BluetoothHeadset.AT_CMD_TYPE_TEST;
    public static final java.lang.String EXTRA_VENDOR_SPECIFIC_HEADSET_EVENT_ARGS = android.bluetooth.BluetoothHeadset.EXTRA_VENDOR_SPECIFIC_HEADSET_EVENT_ARGS;
    public static final java.lang.String EXTRA_VENDOR_SPECIFIC_HEADSET_EVENT_CMD = android.bluetooth.BluetoothHeadset.EXTRA_VENDOR_SPECIFIC_HEADSET_EVENT_CMD;
    public static final java.lang.String EXTRA_VENDOR_SPECIFIC_HEADSET_EVENT_CMD_TYPE = android.bluetooth.BluetoothHeadset.EXTRA_VENDOR_SPECIFIC_HEADSET_EVENT_CMD_TYPE;
    public static final int STATE_AUDIO_CONNECTED = android.bluetooth.BluetoothHeadset.STATE_AUDIO_CONNECTED;
    public static final int STATE_AUDIO_CONNECTING = android.bluetooth.BluetoothHeadset.STATE_AUDIO_CONNECTING;
    public static final int STATE_AUDIO_DISCONNECTED = android.bluetooth.BluetoothHeadset.STATE_AUDIO_DISCONNECTED;
    public static final java.lang.String VENDOR_RESULT_CODE_COMMAND_ANDROID = android.bluetooth.BluetoothHeadset.VENDOR_RESULT_CODE_COMMAND_ANDROID;
    public static final java.lang.String VENDOR_SPECIFIC_HEADSET_EVENT_COMPANY_ID_CATEGORY = android.bluetooth.BluetoothHeadset.VENDOR_SPECIFIC_HEADSET_EVENT_COMPANY_ID_CATEGORY;

}
