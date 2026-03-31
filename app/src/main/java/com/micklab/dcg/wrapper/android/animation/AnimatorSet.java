// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class AnimatorSet {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AnimatorSet(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.AnimatorSet wrap(android.animation.AnimatorSet real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.AnimatorSet(real, (__DcgwBridgeToken) null);
    }

    public android.animation.AnimatorSet getReal() {
        return (android.animation.AnimatorSet) real;
    }

    public android.animation.AnimatorSet unwrap() {
        return getReal();
    }

    public AnimatorSet() {
        this(new android.animation.AnimatorSet(), (__DcgwBridgeToken) null);
    }

    public void cancel() {
        ((android.animation.AnimatorSet) real).cancel();
    }

    public com.micklab.dcg.wrapper.android.animation.AnimatorSet clone() {
        return com.micklab.dcg.wrapper.android.animation.AnimatorSet.wrap(((android.animation.AnimatorSet) real).clone());
    }

    public void end() {
        ((android.animation.AnimatorSet) real).end();
    }

    public long getCurrentPlayTime() {
        return ((android.animation.AnimatorSet) real).getCurrentPlayTime();
    }

    public long getDuration() {
        return ((android.animation.AnimatorSet) real).getDuration();
    }

    public com.micklab.dcg.wrapper.android.animation.TimeInterpolator getInterpolator() {
        return com.micklab.dcg.wrapper.android.animation.TimeInterpolator.wrap(((android.animation.AnimatorSet) real).getInterpolator());
    }

    public long getStartDelay() {
        return ((android.animation.AnimatorSet) real).getStartDelay();
    }

    public long getTotalDuration() {
        return ((android.animation.AnimatorSet) real).getTotalDuration();
    }

    public boolean isRunning() {
        return ((android.animation.AnimatorSet) real).isRunning();
    }

    public boolean isStarted() {
        return ((android.animation.AnimatorSet) real).isStarted();
    }

    public void pause() {
        ((android.animation.AnimatorSet) real).pause();
    }

    public com.micklab.dcg.wrapper.android.animation.AnimatorSet.Builder play(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
        return com.micklab.dcg.wrapper.android.animation.AnimatorSet.Builder.wrap(((android.animation.AnimatorSet) real).play(arg0 == null ? null : arg0.getReal()));
    }

    public void playSequentially(android.animation.Animator... arg0) {
        ((android.animation.AnimatorSet) real).playSequentially(arg0);
    }

    public void playTogether(android.animation.Animator... arg0) {
        ((android.animation.AnimatorSet) real).playTogether(arg0);
    }

    public void resume() {
        ((android.animation.AnimatorSet) real).resume();
    }

    public void reverse() {
        ((android.animation.AnimatorSet) real).reverse();
    }

    public void setCurrentPlayTime(long arg0) {
        ((android.animation.AnimatorSet) real).setCurrentPlayTime(arg0);
    }

    public com.micklab.dcg.wrapper.android.animation.AnimatorSet setDuration(long arg0) {
        return com.micklab.dcg.wrapper.android.animation.AnimatorSet.wrap(((android.animation.AnimatorSet) real).setDuration(arg0));
    }

    public void setInterpolator(com.micklab.dcg.wrapper.android.animation.TimeInterpolator arg0) {
        ((android.animation.AnimatorSet) real).setInterpolator(arg0 == null ? null : arg0.getReal());
    }

    public void setStartDelay(long arg0) {
        ((android.animation.AnimatorSet) real).setStartDelay(arg0);
    }

    public void setTarget(java.lang.Object arg0) {
        ((android.animation.AnimatorSet) real).setTarget(arg0);
    }

    public void setupEndValues() {
        ((android.animation.AnimatorSet) real).setupEndValues();
    }

    public void setupStartValues() {
        ((android.animation.AnimatorSet) real).setupStartValues();
    }

    public void start() {
        ((android.animation.AnimatorSet) real).start();
    }

    public java.lang.String toString() {
        return ((android.animation.AnimatorSet) real).toString();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.animation.AnimatorSet.Builder wrap(android.animation.AnimatorSet.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.animation.AnimatorSet.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.animation.AnimatorSet.Builder getReal() {
            return (android.animation.AnimatorSet.Builder) real;
        }

        public android.animation.AnimatorSet.Builder unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.animation.AnimatorSet.Builder after(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
            return com.micklab.dcg.wrapper.android.animation.AnimatorSet.Builder.wrap(((android.animation.AnimatorSet.Builder) real).after(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.animation.AnimatorSet.Builder after(long arg0) {
            return com.micklab.dcg.wrapper.android.animation.AnimatorSet.Builder.wrap(((android.animation.AnimatorSet.Builder) real).after(arg0));
        }

        public com.micklab.dcg.wrapper.android.animation.AnimatorSet.Builder before(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
            return com.micklab.dcg.wrapper.android.animation.AnimatorSet.Builder.wrap(((android.animation.AnimatorSet.Builder) real).before(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.animation.AnimatorSet.Builder with(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
            return com.micklab.dcg.wrapper.android.animation.AnimatorSet.Builder.wrap(((android.animation.AnimatorSet.Builder) real).with(arg0 == null ? null : arg0.getReal()));
        }


    }
}
