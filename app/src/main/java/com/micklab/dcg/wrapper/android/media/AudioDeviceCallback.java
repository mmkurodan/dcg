// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioDeviceCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AudioDeviceCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioDeviceCallback wrap(android.media.AudioDeviceCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioDeviceCallback(real, (__DcgwBridgeToken) null);
    }

    public android.media.AudioDeviceCallback getReal() {
        return (android.media.AudioDeviceCallback) real;
    }

    public android.media.AudioDeviceCallback unwrap() {
        return getReal();
    }

    public void onAudioDevicesAdded(android.media.AudioDeviceInfo[] arg0) {
        ((android.media.AudioDeviceCallback) real).onAudioDevicesAdded(arg0);
    }

    public void onAudioDevicesRemoved(android.media.AudioDeviceInfo[] arg0) {
        ((android.media.AudioDeviceCallback) real).onAudioDevicesRemoved(arg0);
    }

}
