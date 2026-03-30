// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class ValueAnimator {
    private final android.animation.ValueAnimator real;

    public ValueAnimator(android.animation.ValueAnimator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.ValueAnimator wrap(android.animation.ValueAnimator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.ValueAnimator(real);
    }

    public android.animation.ValueAnimator unwrap() {
        return real;
    }

    public ValueAnimator() {
        this(new android.animation.ValueAnimator());
    }

    public void addUpdateListener(com.micklab.dcg.wrapper.android.animation.ValueAnimator.AnimatorUpdateListener arg0) {
        real.addUpdateListener(arg0 == null ? null : arg0.unwrap());
    }

    public static boolean areAnimatorsEnabled() {
        return android.animation.ValueAnimator.areAnimatorsEnabled();
    }

    public void cancel() {
        real.cancel();
    }

    public com.micklab.dcg.wrapper.android.animation.ValueAnimator clone() {
        return com.micklab.dcg.wrapper.android.animation.ValueAnimator.wrap(real.clone());
    }

    public void end() {
        real.end();
    }

    public float getAnimatedFraction() {
        return real.getAnimatedFraction();
    }

    public java.lang.Object getAnimatedValue() {
        return real.getAnimatedValue();
    }

    public java.lang.Object getAnimatedValue(java.lang.String arg0) {
        return real.getAnimatedValue(arg0);
    }

    public long getCurrentPlayTime() {
        return real.getCurrentPlayTime();
    }

    public long getDuration() {
        return real.getDuration();
    }

    public static float getDurationScale() {
        return android.animation.ValueAnimator.getDurationScale();
    }

    public static long getFrameDelay() {
        return android.animation.ValueAnimator.getFrameDelay();
    }

    public com.micklab.dcg.wrapper.android.animation.TimeInterpolator getInterpolator() {
        return com.micklab.dcg.wrapper.android.animation.TimeInterpolator.wrap(real.getInterpolator());
    }

    public int getRepeatCount() {
        return real.getRepeatCount();
    }

    public int getRepeatMode() {
        return real.getRepeatMode();
    }

    public long getStartDelay() {
        return real.getStartDelay();
    }

    public long getTotalDuration() {
        return real.getTotalDuration();
    }

    public android.animation.PropertyValuesHolder[] getValues() {
        return real.getValues();
    }

    public boolean isRunning() {
        return real.isRunning();
    }

    public boolean isStarted() {
        return real.isStarted();
    }

    public static com.micklab.dcg.wrapper.android.animation.ValueAnimator ofArgb(int... arg0) {
        return com.micklab.dcg.wrapper.android.animation.ValueAnimator.wrap(android.animation.ValueAnimator.ofArgb(arg0));
    }

    public static com.micklab.dcg.wrapper.android.animation.ValueAnimator ofFloat(float... arg0) {
        return com.micklab.dcg.wrapper.android.animation.ValueAnimator.wrap(android.animation.ValueAnimator.ofFloat(arg0));
    }

    public static com.micklab.dcg.wrapper.android.animation.ValueAnimator ofInt(int... arg0) {
        return com.micklab.dcg.wrapper.android.animation.ValueAnimator.wrap(android.animation.ValueAnimator.ofInt(arg0));
    }

    public static com.micklab.dcg.wrapper.android.animation.ValueAnimator ofPropertyValuesHolder(android.animation.PropertyValuesHolder... arg0) {
        return com.micklab.dcg.wrapper.android.animation.ValueAnimator.wrap(android.animation.ValueAnimator.ofPropertyValuesHolder(arg0));
    }

    public void pause() {
        real.pause();
    }

    public static boolean registerDurationScaleChangeListener(com.micklab.dcg.wrapper.android.animation.ValueAnimator.DurationScaleChangeListener arg0) {
        return android.animation.ValueAnimator.registerDurationScaleChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removeAllUpdateListeners() {
        real.removeAllUpdateListeners();
    }

    public void removeUpdateListener(com.micklab.dcg.wrapper.android.animation.ValueAnimator.AnimatorUpdateListener arg0) {
        real.removeUpdateListener(arg0 == null ? null : arg0.unwrap());
    }

    public void resume() {
        real.resume();
    }

    public void reverse() {
        real.reverse();
    }

    public void setCurrentFraction(float arg0) {
        real.setCurrentFraction(arg0);
    }

    public void setCurrentPlayTime(long arg0) {
        real.setCurrentPlayTime(arg0);
    }

    public com.micklab.dcg.wrapper.android.animation.ValueAnimator setDuration(long arg0) {
        return com.micklab.dcg.wrapper.android.animation.ValueAnimator.wrap(real.setDuration(arg0));
    }

    public void setFloatValues(float... arg0) {
        real.setFloatValues(arg0);
    }

    public static void setFrameDelay(long arg0) {
        android.animation.ValueAnimator.setFrameDelay(arg0);
    }

    public void setIntValues(int... arg0) {
        real.setIntValues(arg0);
    }

    public void setInterpolator(com.micklab.dcg.wrapper.android.animation.TimeInterpolator arg0) {
        real.setInterpolator(arg0 == null ? null : arg0.unwrap());
    }

    public void setObjectValues(java.lang.Object... arg0) {
        real.setObjectValues(arg0);
    }

    public void setRepeatCount(int arg0) {
        real.setRepeatCount(arg0);
    }

    public void setRepeatMode(int arg0) {
        real.setRepeatMode(arg0);
    }

    public void setStartDelay(long arg0) {
        real.setStartDelay(arg0);
    }

    public void setValues(android.animation.PropertyValuesHolder... arg0) {
        real.setValues(arg0);
    }

    public void start() {
        real.start();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static boolean unregisterDurationScaleChangeListener(com.micklab.dcg.wrapper.android.animation.ValueAnimator.DurationScaleChangeListener arg0) {
        return android.animation.ValueAnimator.unregisterDurationScaleChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public static final int INFINITE = android.animation.ValueAnimator.INFINITE;
    public static final int RESTART = android.animation.ValueAnimator.RESTART;
    public static final int REVERSE = android.animation.ValueAnimator.REVERSE;

    public static final class AnimatorUpdateListener {
        private final android.animation.ValueAnimator.AnimatorUpdateListener real;

        public AnimatorUpdateListener(android.animation.ValueAnimator.AnimatorUpdateListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.animation.ValueAnimator.AnimatorUpdateListener wrap(android.animation.ValueAnimator.AnimatorUpdateListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.animation.ValueAnimator.AnimatorUpdateListener(real);
        }

        public android.animation.ValueAnimator.AnimatorUpdateListener unwrap() {
            return real;
        }

        public void onAnimationUpdate(com.micklab.dcg.wrapper.android.animation.ValueAnimator arg0) {
            real.onAnimationUpdate(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class DurationScaleChangeListener {
        private final android.animation.ValueAnimator.DurationScaleChangeListener real;

        public DurationScaleChangeListener(android.animation.ValueAnimator.DurationScaleChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.animation.ValueAnimator.DurationScaleChangeListener wrap(android.animation.ValueAnimator.DurationScaleChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.animation.ValueAnimator.DurationScaleChangeListener(real);
        }

        public android.animation.ValueAnimator.DurationScaleChangeListener unwrap() {
            return real;
        }

        public void onChanged(float arg0) {
            real.onChanged(arg0);
        }

    }
}
