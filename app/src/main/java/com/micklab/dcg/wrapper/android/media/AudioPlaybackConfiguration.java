// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioPlaybackConfiguration {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AudioPlaybackConfiguration(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioPlaybackConfiguration wrap(android.media.AudioPlaybackConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioPlaybackConfiguration(real, (__DcgwBridgeToken) null);
    }

    public android.media.AudioPlaybackConfiguration getReal() {
        return (android.media.AudioPlaybackConfiguration) real;
    }

    public android.media.AudioPlaybackConfiguration unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.media.AudioPlaybackConfiguration) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.AudioPlaybackConfiguration) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.AudioAttributes getAudioAttributes() {
        return com.micklab.dcg.wrapper.android.media.AudioAttributes.wrap(((android.media.AudioPlaybackConfiguration) real).getAudioAttributes());
    }

    public com.micklab.dcg.wrapper.android.media.AudioDeviceInfo getAudioDeviceInfo() {
        return com.micklab.dcg.wrapper.android.media.AudioDeviceInfo.wrap(((android.media.AudioPlaybackConfiguration) real).getAudioDeviceInfo());
    }

    public int hashCode() {
        return ((android.media.AudioPlaybackConfiguration) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.media.AudioPlaybackConfiguration) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.AudioPlaybackConfiguration) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
