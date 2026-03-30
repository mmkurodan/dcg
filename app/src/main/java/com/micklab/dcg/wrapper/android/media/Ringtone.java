// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class Ringtone {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Ringtone(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.Ringtone wrap(android.media.Ringtone real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.Ringtone(real, (__DcgwBridgeToken) null);
    }

    public android.media.Ringtone getReal() {
        return (android.media.Ringtone) real;
    }

    public android.media.Ringtone unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.media.AudioAttributes getAudioAttributes() {
        return com.micklab.dcg.wrapper.android.media.AudioAttributes.wrap(((android.media.Ringtone) real).getAudioAttributes());
    }

    public int getStreamType() {
        return ((android.media.Ringtone) real).getStreamType();
    }

    public java.lang.String getTitle(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return ((android.media.Ringtone) real).getTitle(arg0 == null ? null : arg0.getReal());
    }

    public float getVolume() {
        return ((android.media.Ringtone) real).getVolume();
    }

    public boolean isHapticGeneratorEnabled() {
        return ((android.media.Ringtone) real).isHapticGeneratorEnabled();
    }

    public boolean isLooping() {
        return ((android.media.Ringtone) real).isLooping();
    }

    public boolean isPlaying() {
        return ((android.media.Ringtone) real).isPlaying();
    }

    public void play() {
        ((android.media.Ringtone) real).play();
    }

    public void setAudioAttributes(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0) throws java.lang.IllegalArgumentException {
        ((android.media.Ringtone) real).setAudioAttributes(arg0 == null ? null : arg0.getReal());
    }

    public boolean setHapticGeneratorEnabled(boolean arg0) {
        return ((android.media.Ringtone) real).setHapticGeneratorEnabled(arg0);
    }

    public void setLooping(boolean arg0) {
        ((android.media.Ringtone) real).setLooping(arg0);
    }

    public void setStreamType(int arg0) {
        ((android.media.Ringtone) real).setStreamType(arg0);
    }

    public void setVolume(float arg0) {
        ((android.media.Ringtone) real).setVolume(arg0);
    }

    public void stop() {
        ((android.media.Ringtone) real).stop();
    }

}
