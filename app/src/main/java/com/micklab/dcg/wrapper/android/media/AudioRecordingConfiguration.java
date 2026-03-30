// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioRecordingConfiguration {
    private final android.media.AudioRecordingConfiguration real;

    public AudioRecordingConfiguration(android.media.AudioRecordingConfiguration real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioRecordingConfiguration wrap(android.media.AudioRecordingConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioRecordingConfiguration(real);
    }

    public android.media.AudioRecordingConfiguration unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.AudioDeviceInfo getAudioDevice() {
        return com.micklab.dcg.wrapper.android.media.AudioDeviceInfo.wrap(real.getAudioDevice());
    }

    public int getAudioSource() {
        return real.getAudioSource();
    }

    public int getClientAudioSessionId() {
        return real.getClientAudioSessionId();
    }

    public int getClientAudioSource() {
        return real.getClientAudioSource();
    }

    public com.micklab.dcg.wrapper.android.media.AudioFormat getClientFormat() {
        return com.micklab.dcg.wrapper.android.media.AudioFormat.wrap(real.getClientFormat());
    }

    public com.micklab.dcg.wrapper.android.media.AudioFormat getFormat() {
        return com.micklab.dcg.wrapper.android.media.AudioFormat.wrap(real.getFormat());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isClientSilenced() {
        return real.isClientSilenced();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
