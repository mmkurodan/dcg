// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class Ringtone {
    private final android.media.Ringtone real;

    public Ringtone(android.media.Ringtone real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.Ringtone wrap(android.media.Ringtone real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.Ringtone(real);
    }

    public android.media.Ringtone unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.media.AudioAttributes getAudioAttributes() {
        return com.micklab.dcg.wrapper.android.media.AudioAttributes.wrap(real.getAudioAttributes());
    }

    public int getStreamType() {
        return real.getStreamType();
    }

    public java.lang.String getTitle(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return real.getTitle(arg0 == null ? null : arg0.unwrap());
    }

    public float getVolume() {
        return real.getVolume();
    }

    public boolean isHapticGeneratorEnabled() {
        return real.isHapticGeneratorEnabled();
    }

    public boolean isLooping() {
        return real.isLooping();
    }

    public boolean isPlaying() {
        return real.isPlaying();
    }

    public void play() {
        real.play();
    }

    public void setAudioAttributes(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0) throws java.lang.IllegalArgumentException {
        real.setAudioAttributes(arg0 == null ? null : arg0.unwrap());
    }

    public boolean setHapticGeneratorEnabled(boolean arg0) {
        return real.setHapticGeneratorEnabled(arg0);
    }

    public void setLooping(boolean arg0) {
        real.setLooping(arg0);
    }

    public void setStreamType(int arg0) {
        real.setStreamType(arg0);
    }

    public void setVolume(float arg0) {
        real.setVolume(arg0);
    }

    public void stop() {
        real.stop();
    }

}
