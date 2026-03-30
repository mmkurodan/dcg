// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class SyncParams {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SyncParams(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.SyncParams wrap(android.media.SyncParams real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.SyncParams(real, (__DcgwBridgeToken) null);
    }

    public android.media.SyncParams getReal() {
        return (android.media.SyncParams) real;
    }

    public android.media.SyncParams unwrap() {
        return getReal();
    }

    public SyncParams() {
        this(new android.media.SyncParams(), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.media.SyncParams allowDefaults() {
        return com.micklab.dcg.wrapper.android.media.SyncParams.wrap(((android.media.SyncParams) real).allowDefaults());
    }

    public int getAudioAdjustMode() {
        return ((android.media.SyncParams) real).getAudioAdjustMode();
    }

    public float getFrameRate() {
        return ((android.media.SyncParams) real).getFrameRate();
    }

    public int getSyncSource() {
        return ((android.media.SyncParams) real).getSyncSource();
    }

    public float getTolerance() {
        return ((android.media.SyncParams) real).getTolerance();
    }

    public com.micklab.dcg.wrapper.android.media.SyncParams setAudioAdjustMode(int arg0) {
        return com.micklab.dcg.wrapper.android.media.SyncParams.wrap(((android.media.SyncParams) real).setAudioAdjustMode(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.SyncParams setFrameRate(float arg0) {
        return com.micklab.dcg.wrapper.android.media.SyncParams.wrap(((android.media.SyncParams) real).setFrameRate(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.SyncParams setSyncSource(int arg0) {
        return com.micklab.dcg.wrapper.android.media.SyncParams.wrap(((android.media.SyncParams) real).setSyncSource(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.SyncParams setTolerance(float arg0) {
        return com.micklab.dcg.wrapper.android.media.SyncParams.wrap(((android.media.SyncParams) real).setTolerance(arg0));
    }

    public static final int AUDIO_ADJUST_MODE_DEFAULT = android.media.SyncParams.AUDIO_ADJUST_MODE_DEFAULT;
    public static final int AUDIO_ADJUST_MODE_RESAMPLE = android.media.SyncParams.AUDIO_ADJUST_MODE_RESAMPLE;
    public static final int AUDIO_ADJUST_MODE_STRETCH = android.media.SyncParams.AUDIO_ADJUST_MODE_STRETCH;
    public static final int SYNC_SOURCE_AUDIO = android.media.SyncParams.SYNC_SOURCE_AUDIO;
    public static final int SYNC_SOURCE_DEFAULT = android.media.SyncParams.SYNC_SOURCE_DEFAULT;
    public static final int SYNC_SOURCE_SYSTEM_CLOCK = android.media.SyncParams.SYNC_SOURCE_SYSTEM_CLOCK;
    public static final int SYNC_SOURCE_VSYNC = android.media.SyncParams.SYNC_SOURCE_VSYNC;

}
