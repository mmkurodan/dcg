// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class ValueAnimator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ValueAnimator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.ValueAnimator wrap(android.animation.ValueAnimator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.ValueAnimator(real, (__DcgwBridgeToken) null);
    }

    public android.animation.ValueAnimator getReal() {
        return (android.animation.ValueAnimator) real;
    }

    public android.animation.ValueAnimator unwrap() {
        return getReal();
    }

    public ValueAnimator() {
        this(new android.animation.ValueAnimator(), (__DcgwBridgeToken) null);
    }

    public void addUpdateListener(com.micklab.dcg.wrapper.android.animation.ValueAnimator.AnimatorUpdateListener arg0) {
        ((android.animation.ValueAnimator) real).addUpdateListener(arg0 == null ? null : arg0.getReal());
    }

    public static boolean areAnimatorsEnabled() {
        return android.animation.ValueAnimator.areAnimatorsEnabled();
    }

    public void cancel() {
        ((android.animation.ValueAnimator) real).cancel();
    }

    public com.micklab.dcg.wrapper.android.animation.ValueAnimator clone() {
        return com.micklab.dcg.wrapper.android.animation.ValueAnimator.wrap(((android.animation.ValueAnimator) real).clone());
    }

    public void end() {
        ((android.animation.ValueAnimator) real).end();
    }

    public float getAnimatedFraction() {
        return ((android.animation.ValueAnimator) real).getAnimatedFraction();
    }

    public java.lang.Object getAnimatedValue() {
        return ((android.animation.ValueAnimator) real).getAnimatedValue();
    }

    public java.lang.Object getAnimatedValue(java.lang.String arg0) {
        return ((android.animation.ValueAnimator) real).getAnimatedValue(arg0);
    }

    public long getCurrentPlayTime() {
        return ((android.animation.ValueAnimator) real).getCurrentPlayTime();
    }

    public long getDuration() {
        return ((android.animation.ValueAnimator) real).getDuration();
    }

    public static float getDurationScale() {
        return android.animation.ValueAnimator.getDurationScale();
    }

    public static long getFrameDelay() {
        return android.animation.ValueAnimator.getFrameDelay();
    }

    public com.micklab.dcg.wrapper.android.animation.TimeInterpolator getInterpolator() {
        return com.micklab.dcg.wrapper.android.animation.TimeInterpolator.wrap(((android.animation.ValueAnimator) real).getInterpolator());
    }

    public int getRepeatCount() {
        return ((android.animation.ValueAnimator) real).getRepeatCount();
    }

    public int getRepeatMode() {
        return ((android.animation.ValueAnimator) real).getRepeatMode();
    }

    public long getStartDelay() {
        return ((android.animation.ValueAnimator) real).getStartDelay();
    }

    public long getTotalDuration() {
        return ((android.animation.ValueAnimator) real).getTotalDuration();
    }

    public android.animation.PropertyValuesHolder[] getValues() {
        return ((android.animation.ValueAnimator) real).getValues();
    }

    public boolean isRunning() {
        return ((android.animation.ValueAnimator) real).isRunning();
    }

    public boolean isStarted() {
        return ((android.animation.ValueAnimator) real).isStarted();
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
        ((android.animation.ValueAnimator) real).pause();
    }

    public static boolean registerDurationScaleChangeListener(com.micklab.dcg.wrapper.android.animation.ValueAnimator.DurationScaleChangeListener arg0) {
        return android.animation.ValueAnimator.registerDurationScaleChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void removeAllUpdateListeners() {
        ((android.animation.ValueAnimator) real).removeAllUpdateListeners();
    }

    public void removeUpdateListener(com.micklab.dcg.wrapper.android.animation.ValueAnimator.AnimatorUpdateListener arg0) {
        ((android.animation.ValueAnimator) real).removeUpdateListener(arg0 == null ? null : arg0.getReal());
    }

    public void resume() {
        ((android.animation.ValueAnimator) real).resume();
    }

    public void reverse() {
        ((android.animation.ValueAnimator) real).reverse();
    }

    public void setCurrentFraction(float arg0) {
        ((android.animation.ValueAnimator) real).setCurrentFraction(arg0);
    }

    public void setCurrentPlayTime(long arg0) {
        ((android.animation.ValueAnimator) real).setCurrentPlayTime(arg0);
    }

    public com.micklab.dcg.wrapper.android.animation.ValueAnimator setDuration(long arg0) {
        return com.micklab.dcg.wrapper.android.animation.ValueAnimator.wrap(((android.animation.ValueAnimator) real).setDuration(arg0));
    }

    public void setFloatValues(float... arg0) {
        ((android.animation.ValueAnimator) real).setFloatValues(arg0);
    }

    public static void setFrameDelay(long arg0) {
        android.animation.ValueAnimator.setFrameDelay(arg0);
    }

    public void setIntValues(int... arg0) {
        ((android.animation.ValueAnimator) real).setIntValues(arg0);
    }

    public void setInterpolator(com.micklab.dcg.wrapper.android.animation.TimeInterpolator arg0) {
        ((android.animation.ValueAnimator) real).setInterpolator(arg0 == null ? null : arg0.getReal());
    }

    public void setObjectValues(java.lang.Object... arg0) {
        ((android.animation.ValueAnimator) real).setObjectValues(arg0);
    }

    public void setRepeatCount(int arg0) {
        ((android.animation.ValueAnimator) real).setRepeatCount(arg0);
    }

    public void setRepeatMode(int arg0) {
        ((android.animation.ValueAnimator) real).setRepeatMode(arg0);
    }

    public void setStartDelay(long arg0) {
        ((android.animation.ValueAnimator) real).setStartDelay(arg0);
    }

    public void setValues(android.animation.PropertyValuesHolder... arg0) {
        ((android.animation.ValueAnimator) real).setValues(arg0);
    }

    public void start() {
        ((android.animation.ValueAnimator) real).start();
    }

    public java.lang.String toString() {
        return ((android.animation.ValueAnimator) real).toString();
    }

    public static boolean unregisterDurationScaleChangeListener(com.micklab.dcg.wrapper.android.animation.ValueAnimator.DurationScaleChangeListener arg0) {
        return android.animation.ValueAnimator.unregisterDurationScaleChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public static final int INFINITE = android.animation.ValueAnimator.INFINITE;
    public static final int RESTART = android.animation.ValueAnimator.RESTART;
    public static final int REVERSE = android.animation.ValueAnimator.REVERSE;

    public static final class AnimatorUpdateListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AnimatorUpdateListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.animation.ValueAnimator.AnimatorUpdateListener wrap(android.animation.ValueAnimator.AnimatorUpdateListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.animation.ValueAnimator.AnimatorUpdateListener(real, (__DcgwBridgeToken) null);
        }

        public android.animation.ValueAnimator.AnimatorUpdateListener getReal() {
            return (android.animation.ValueAnimator.AnimatorUpdateListener) real;
        }

        public android.animation.ValueAnimator.AnimatorUpdateListener unwrap() {
            return getReal();
        }

        public void onAnimationUpdate(com.micklab.dcg.wrapper.android.animation.ValueAnimator arg0) {
            ((android.animation.ValueAnimator.AnimatorUpdateListener) real).onAnimationUpdate(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class DurationScaleChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private DurationScaleChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.animation.ValueAnimator.DurationScaleChangeListener wrap(android.animation.ValueAnimator.DurationScaleChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.animation.ValueAnimator.DurationScaleChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.animation.ValueAnimator.DurationScaleChangeListener getReal() {
            return (android.animation.ValueAnimator.DurationScaleChangeListener) real;
        }

        public android.animation.ValueAnimator.DurationScaleChangeListener unwrap() {
            return getReal();
        }

        public void onChanged(float arg0) {
            ((android.animation.ValueAnimator.DurationScaleChangeListener) real).onChanged(arg0);
        }

    }
}
