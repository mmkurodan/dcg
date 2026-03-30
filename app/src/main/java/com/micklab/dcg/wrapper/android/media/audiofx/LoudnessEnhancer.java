// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.audiofx;

public final class LoudnessEnhancer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LoudnessEnhancer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.LoudnessEnhancer wrap(android.media.audiofx.LoudnessEnhancer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.LoudnessEnhancer(real, (__DcgwBridgeToken) null);
    }

    public android.media.audiofx.LoudnessEnhancer getReal() {
        return (android.media.audiofx.LoudnessEnhancer) real;
    }

    public android.media.audiofx.LoudnessEnhancer unwrap() {
        return getReal();
    }

    public LoudnessEnhancer(int arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.RuntimeException, java.lang.UnsupportedOperationException {
        this(new android.media.audiofx.LoudnessEnhancer(arg0), (__DcgwBridgeToken) null);
    }

    public float getTargetGain() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return ((android.media.audiofx.LoudnessEnhancer) real).getTargetGain();
    }

    public void setTargetGain(int arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        ((android.media.audiofx.LoudnessEnhancer) real).setTargetGain(arg0);
    }

    public static final int PARAM_TARGET_GAIN_MB = android.media.audiofx.LoudnessEnhancer.PARAM_TARGET_GAIN_MB;

}
