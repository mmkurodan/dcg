// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class PlaybackParams {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PlaybackParams(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.PlaybackParams wrap(android.media.PlaybackParams real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.PlaybackParams(real, (__DcgwBridgeToken) null);
    }

    public android.media.PlaybackParams getReal() {
        return (android.media.PlaybackParams) real;
    }

    public android.media.PlaybackParams unwrap() {
        return getReal();
    }

    public PlaybackParams() {
        this(new android.media.PlaybackParams(), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.media.PlaybackParams allowDefaults() {
        return com.micklab.dcg.wrapper.android.media.PlaybackParams.wrap(((android.media.PlaybackParams) real).allowDefaults());
    }

    public int describeContents() {
        return ((android.media.PlaybackParams) real).describeContents();
    }

    public int getAudioFallbackMode() {
        return ((android.media.PlaybackParams) real).getAudioFallbackMode();
    }

    public float getPitch() {
        return ((android.media.PlaybackParams) real).getPitch();
    }

    public float getSpeed() {
        return ((android.media.PlaybackParams) real).getSpeed();
    }

    public com.micklab.dcg.wrapper.android.media.PlaybackParams setAudioFallbackMode(int arg0) {
        return com.micklab.dcg.wrapper.android.media.PlaybackParams.wrap(((android.media.PlaybackParams) real).setAudioFallbackMode(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.PlaybackParams setPitch(float arg0) {
        return com.micklab.dcg.wrapper.android.media.PlaybackParams.wrap(((android.media.PlaybackParams) real).setPitch(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.PlaybackParams setSpeed(float arg0) {
        return com.micklab.dcg.wrapper.android.media.PlaybackParams.wrap(((android.media.PlaybackParams) real).setSpeed(arg0));
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.PlaybackParams) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int AUDIO_FALLBACK_MODE_DEFAULT = android.media.PlaybackParams.AUDIO_FALLBACK_MODE_DEFAULT;
    public static final int AUDIO_FALLBACK_MODE_FAIL = android.media.PlaybackParams.AUDIO_FALLBACK_MODE_FAIL;
    public static final int AUDIO_FALLBACK_MODE_MUTE = android.media.PlaybackParams.AUDIO_FALLBACK_MODE_MUTE;

}
