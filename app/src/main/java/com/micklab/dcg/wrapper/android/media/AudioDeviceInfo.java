// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioDeviceInfo {
    private final android.media.AudioDeviceInfo real;

    public AudioDeviceInfo(android.media.AudioDeviceInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioDeviceInfo wrap(android.media.AudioDeviceInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioDeviceInfo(real);
    }

    public android.media.AudioDeviceInfo unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getAddress() {
        return real.getAddress();
    }

    public int[] getChannelCounts() {
        return real.getChannelCounts();
    }

    public int[] getChannelIndexMasks() {
        return real.getChannelIndexMasks();
    }

    public int[] getChannelMasks() {
        return real.getChannelMasks();
    }

    public int[] getEncapsulationMetadataTypes() {
        return real.getEncapsulationMetadataTypes();
    }

    public int[] getEncapsulationModes() {
        return real.getEncapsulationModes();
    }

    public int[] getEncodings() {
        return real.getEncodings();
    }

    public int getId() {
        return real.getId();
    }

    public java.lang.CharSequence getProductName() {
        return real.getProductName();
    }

    public int[] getSampleRates() {
        return real.getSampleRates();
    }

    public int getType() {
        return real.getType();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isSink() {
        return real.isSink();
    }

    public boolean isSource() {
        return real.isSource();
    }

    public static final int TYPE_AUX_LINE = android.media.AudioDeviceInfo.TYPE_AUX_LINE;
    public static final int TYPE_BLE_BROADCAST = android.media.AudioDeviceInfo.TYPE_BLE_BROADCAST;
    public static final int TYPE_BLE_HEADSET = android.media.AudioDeviceInfo.TYPE_BLE_HEADSET;
    public static final int TYPE_BLE_SPEAKER = android.media.AudioDeviceInfo.TYPE_BLE_SPEAKER;
    public static final int TYPE_BLUETOOTH_A2DP = android.media.AudioDeviceInfo.TYPE_BLUETOOTH_A2DP;
    public static final int TYPE_BLUETOOTH_SCO = android.media.AudioDeviceInfo.TYPE_BLUETOOTH_SCO;
    public static final int TYPE_BUILTIN_EARPIECE = android.media.AudioDeviceInfo.TYPE_BUILTIN_EARPIECE;
    public static final int TYPE_BUILTIN_MIC = android.media.AudioDeviceInfo.TYPE_BUILTIN_MIC;
    public static final int TYPE_BUILTIN_SPEAKER = android.media.AudioDeviceInfo.TYPE_BUILTIN_SPEAKER;
    public static final int TYPE_BUILTIN_SPEAKER_SAFE = android.media.AudioDeviceInfo.TYPE_BUILTIN_SPEAKER_SAFE;
    public static final int TYPE_BUS = android.media.AudioDeviceInfo.TYPE_BUS;
    public static final int TYPE_DOCK = android.media.AudioDeviceInfo.TYPE_DOCK;
    public static final int TYPE_DOCK_ANALOG = android.media.AudioDeviceInfo.TYPE_DOCK_ANALOG;
    public static final int TYPE_FM = android.media.AudioDeviceInfo.TYPE_FM;
    public static final int TYPE_FM_TUNER = android.media.AudioDeviceInfo.TYPE_FM_TUNER;
    public static final int TYPE_HDMI = android.media.AudioDeviceInfo.TYPE_HDMI;
    public static final int TYPE_HDMI_ARC = android.media.AudioDeviceInfo.TYPE_HDMI_ARC;
    public static final int TYPE_HDMI_EARC = android.media.AudioDeviceInfo.TYPE_HDMI_EARC;
    public static final int TYPE_HEARING_AID = android.media.AudioDeviceInfo.TYPE_HEARING_AID;
    public static final int TYPE_IP = android.media.AudioDeviceInfo.TYPE_IP;
    public static final int TYPE_LINE_ANALOG = android.media.AudioDeviceInfo.TYPE_LINE_ANALOG;
    public static final int TYPE_LINE_DIGITAL = android.media.AudioDeviceInfo.TYPE_LINE_DIGITAL;
    public static final int TYPE_REMOTE_SUBMIX = android.media.AudioDeviceInfo.TYPE_REMOTE_SUBMIX;
    public static final int TYPE_TELEPHONY = android.media.AudioDeviceInfo.TYPE_TELEPHONY;
    public static final int TYPE_TV_TUNER = android.media.AudioDeviceInfo.TYPE_TV_TUNER;
    public static final int TYPE_UNKNOWN = android.media.AudioDeviceInfo.TYPE_UNKNOWN;
    public static final int TYPE_USB_ACCESSORY = android.media.AudioDeviceInfo.TYPE_USB_ACCESSORY;
    public static final int TYPE_USB_DEVICE = android.media.AudioDeviceInfo.TYPE_USB_DEVICE;
    public static final int TYPE_USB_HEADSET = android.media.AudioDeviceInfo.TYPE_USB_HEADSET;
    public static final int TYPE_WIRED_HEADPHONES = android.media.AudioDeviceInfo.TYPE_WIRED_HEADPHONES;
    public static final int TYPE_WIRED_HEADSET = android.media.AudioDeviceInfo.TYPE_WIRED_HEADSET;

}
