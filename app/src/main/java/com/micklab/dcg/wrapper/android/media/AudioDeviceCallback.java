// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioDeviceCallback {
    private final android.media.AudioDeviceCallback real;

    public AudioDeviceCallback(android.media.AudioDeviceCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioDeviceCallback wrap(android.media.AudioDeviceCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioDeviceCallback(real);
    }

    public android.media.AudioDeviceCallback unwrap() {
        return real;
    }

    public void onAudioDevicesAdded(android.media.AudioDeviceInfo[] arg0) {
        real.onAudioDevicesAdded(arg0);
    }

    public void onAudioDevicesRemoved(android.media.AudioDeviceInfo[] arg0) {
        real.onAudioDevicesRemoved(arg0);
    }

}
