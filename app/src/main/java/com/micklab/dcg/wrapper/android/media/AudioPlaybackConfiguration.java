// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioPlaybackConfiguration {
    private final android.media.AudioPlaybackConfiguration real;

    public AudioPlaybackConfiguration(android.media.AudioPlaybackConfiguration real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioPlaybackConfiguration wrap(android.media.AudioPlaybackConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioPlaybackConfiguration(real);
    }

    public android.media.AudioPlaybackConfiguration unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.AudioAttributes getAudioAttributes() {
        return com.micklab.dcg.wrapper.android.media.AudioAttributes.wrap(real.getAudioAttributes());
    }

    public com.micklab.dcg.wrapper.android.media.AudioDeviceInfo getAudioDeviceInfo() {
        return com.micklab.dcg.wrapper.android.media.AudioDeviceInfo.wrap(real.getAudioDeviceInfo());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
