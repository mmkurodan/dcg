// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioRecordingConfiguration {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AudioRecordingConfiguration(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioRecordingConfiguration wrap(android.media.AudioRecordingConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioRecordingConfiguration(real, (__DcgwBridgeToken) null);
    }

    public android.media.AudioRecordingConfiguration getReal() {
        return (android.media.AudioRecordingConfiguration) real;
    }

    public android.media.AudioRecordingConfiguration unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.media.AudioRecordingConfiguration) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.AudioRecordingConfiguration) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.AudioDeviceInfo getAudioDevice() {
        return com.micklab.dcg.wrapper.android.media.AudioDeviceInfo.wrap(((android.media.AudioRecordingConfiguration) real).getAudioDevice());
    }

    public int getAudioSource() {
        return ((android.media.AudioRecordingConfiguration) real).getAudioSource();
    }

    public int getClientAudioSessionId() {
        return ((android.media.AudioRecordingConfiguration) real).getClientAudioSessionId();
    }

    public int getClientAudioSource() {
        return ((android.media.AudioRecordingConfiguration) real).getClientAudioSource();
    }

    public com.micklab.dcg.wrapper.android.media.AudioFormat getClientFormat() {
        return com.micklab.dcg.wrapper.android.media.AudioFormat.wrap(((android.media.AudioRecordingConfiguration) real).getClientFormat());
    }

    public com.micklab.dcg.wrapper.android.media.AudioFormat getFormat() {
        return com.micklab.dcg.wrapper.android.media.AudioFormat.wrap(((android.media.AudioRecordingConfiguration) real).getFormat());
    }

    public int hashCode() {
        return ((android.media.AudioRecordingConfiguration) real).hashCode();
    }

    public boolean isClientSilenced() {
        return ((android.media.AudioRecordingConfiguration) real).isClientSilenced();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.AudioRecordingConfiguration) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
