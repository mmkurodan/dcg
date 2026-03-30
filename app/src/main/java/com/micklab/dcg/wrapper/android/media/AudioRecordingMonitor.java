// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioRecordingMonitor {
    private final android.media.AudioRecordingMonitor real;

    public AudioRecordingMonitor(android.media.AudioRecordingMonitor real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioRecordingMonitor wrap(android.media.AudioRecordingMonitor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioRecordingMonitor(real);
    }

    public android.media.AudioRecordingMonitor unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.media.AudioRecordingConfiguration getActiveRecordingConfiguration() {
        return com.micklab.dcg.wrapper.android.media.AudioRecordingConfiguration.wrap(real.getActiveRecordingConfiguration());
    }

    public void registerAudioRecordingCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.AudioManager.AudioRecordingCallback arg1) {
        real.registerAudioRecordingCallback(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void unregisterAudioRecordingCallback(com.micklab.dcg.wrapper.android.media.AudioManager.AudioRecordingCallback arg0) {
        real.unregisterAudioRecordingCallback(arg0 == null ? null : arg0.unwrap());
    }

}
