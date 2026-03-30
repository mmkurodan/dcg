// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioRecordingMonitor {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AudioRecordingMonitor(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioRecordingMonitor wrap(android.media.AudioRecordingMonitor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioRecordingMonitor(real, (__DcgwBridgeToken) null);
    }

    public android.media.AudioRecordingMonitor getReal() {
        return (android.media.AudioRecordingMonitor) real;
    }

    public android.media.AudioRecordingMonitor unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.media.AudioRecordingConfiguration getActiveRecordingConfiguration() {
        return com.micklab.dcg.wrapper.android.media.AudioRecordingConfiguration.wrap(((android.media.AudioRecordingMonitor) real).getActiveRecordingConfiguration());
    }

    public void registerAudioRecordingCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.AudioManager.AudioRecordingCallback arg1) {
        ((android.media.AudioRecordingMonitor) real).registerAudioRecordingCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void unregisterAudioRecordingCallback(com.micklab.dcg.wrapper.android.media.AudioManager.AudioRecordingCallback arg0) {
        ((android.media.AudioRecordingMonitor) real).unregisterAudioRecordingCallback(arg0 == null ? null : arg0.getReal());
    }

}
