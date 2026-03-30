// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.audiofx;

public final class LoudnessEnhancer {
    private final android.media.audiofx.LoudnessEnhancer real;

    public LoudnessEnhancer(android.media.audiofx.LoudnessEnhancer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.LoudnessEnhancer wrap(android.media.audiofx.LoudnessEnhancer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.LoudnessEnhancer(real);
    }

    public android.media.audiofx.LoudnessEnhancer unwrap() {
        return real;
    }

    public LoudnessEnhancer(int arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.RuntimeException, java.lang.UnsupportedOperationException {
        this(new android.media.audiofx.LoudnessEnhancer(arg0));
    }

    public float getTargetGain() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return real.getTargetGain();
    }

    public void setTargetGain(int arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        real.setTargetGain(arg0);
    }

    public static final int PARAM_TARGET_GAIN_MB = android.media.audiofx.LoudnessEnhancer.PARAM_TARGET_GAIN_MB;

}
