// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class PlaybackParams {
    private final android.media.PlaybackParams real;

    public PlaybackParams(android.media.PlaybackParams real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.PlaybackParams wrap(android.media.PlaybackParams real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.PlaybackParams(real);
    }

    public android.media.PlaybackParams unwrap() {
        return real;
    }

    public PlaybackParams() {
        this(new android.media.PlaybackParams());
    }

    public com.micklab.dcg.wrapper.android.media.PlaybackParams allowDefaults() {
        return com.micklab.dcg.wrapper.android.media.PlaybackParams.wrap(real.allowDefaults());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getAudioFallbackMode() {
        return real.getAudioFallbackMode();
    }

    public float getPitch() {
        return real.getPitch();
    }

    public float getSpeed() {
        return real.getSpeed();
    }

    public com.micklab.dcg.wrapper.android.media.PlaybackParams setAudioFallbackMode(int arg0) {
        return com.micklab.dcg.wrapper.android.media.PlaybackParams.wrap(real.setAudioFallbackMode(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.PlaybackParams setPitch(float arg0) {
        return com.micklab.dcg.wrapper.android.media.PlaybackParams.wrap(real.setPitch(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.PlaybackParams setSpeed(float arg0) {
        return com.micklab.dcg.wrapper.android.media.PlaybackParams.wrap(real.setSpeed(arg0));
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int AUDIO_FALLBACK_MODE_DEFAULT = android.media.PlaybackParams.AUDIO_FALLBACK_MODE_DEFAULT;
    public static final int AUDIO_FALLBACK_MODE_FAIL = android.media.PlaybackParams.AUDIO_FALLBACK_MODE_FAIL;
    public static final int AUDIO_FALLBACK_MODE_MUTE = android.media.PlaybackParams.AUDIO_FALLBACK_MODE_MUTE;

}
