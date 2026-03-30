// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class Animator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Animator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.Animator wrap(android.animation.Animator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.Animator(real, (__DcgwBridgeToken) null);
    }

    public android.animation.Animator getReal() {
        return (android.animation.Animator) real;
    }

    public android.animation.Animator unwrap() {
        return getReal();
    }

    public void addListener(com.micklab.dcg.wrapper.android.animation.Animator.AnimatorListener arg0) {
        ((android.animation.Animator) real).addListener(arg0 == null ? null : arg0.getReal());
    }

    public void addPauseListener(com.micklab.dcg.wrapper.android.animation.Animator.AnimatorPauseListener arg0) {
        ((android.animation.Animator) real).addPauseListener(arg0 == null ? null : arg0.getReal());
    }

    public void cancel() {
        ((android.animation.Animator) real).cancel();
    }

    public com.micklab.dcg.wrapper.android.animation.Animator clone() {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(((android.animation.Animator) real).clone());
    }

    public void end() {
        ((android.animation.Animator) real).end();
    }

    public long getDuration() {
        return ((android.animation.Animator) real).getDuration();
    }

    public com.micklab.dcg.wrapper.android.animation.TimeInterpolator getInterpolator() {
        return com.micklab.dcg.wrapper.android.animation.TimeInterpolator.wrap(((android.animation.Animator) real).getInterpolator());
    }

    public long getStartDelay() {
        return ((android.animation.Animator) real).getStartDelay();
    }

    public long getTotalDuration() {
        return ((android.animation.Animator) real).getTotalDuration();
    }

    public boolean isPaused() {
        return ((android.animation.Animator) real).isPaused();
    }

    public boolean isRunning() {
        return ((android.animation.Animator) real).isRunning();
    }

    public boolean isStarted() {
        return ((android.animation.Animator) real).isStarted();
    }

    public void pause() {
        ((android.animation.Animator) real).pause();
    }

    public void removeAllListeners() {
        ((android.animation.Animator) real).removeAllListeners();
    }

    public void removeListener(com.micklab.dcg.wrapper.android.animation.Animator.AnimatorListener arg0) {
        ((android.animation.Animator) real).removeListener(arg0 == null ? null : arg0.getReal());
    }

    public void removePauseListener(com.micklab.dcg.wrapper.android.animation.Animator.AnimatorPauseListener arg0) {
        ((android.animation.Animator) real).removePauseListener(arg0 == null ? null : arg0.getReal());
    }

    public void resume() {
        ((android.animation.Animator) real).resume();
    }

    public com.micklab.dcg.wrapper.android.animation.Animator setDuration(long arg0) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(((android.animation.Animator) real).setDuration(arg0));
    }

    public void setInterpolator(com.micklab.dcg.wrapper.android.animation.TimeInterpolator arg0) {
        ((android.animation.Animator) real).setInterpolator(arg0 == null ? null : arg0.getReal());
    }

    public void setStartDelay(long arg0) {
        ((android.animation.Animator) real).setStartDelay(arg0);
    }

    public void setTarget(java.lang.Object arg0) {
        ((android.animation.Animator) real).setTarget(arg0);
    }

    public void setupEndValues() {
        ((android.animation.Animator) real).setupEndValues();
    }

    public void setupStartValues() {
        ((android.animation.Animator) real).setupStartValues();
    }

    public void start() {
        ((android.animation.Animator) real).start();
    }

    public static final long DURATION_INFINITE = android.animation.Animator.DURATION_INFINITE;

    public static final class AnimatorListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AnimatorListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.animation.Animator.AnimatorListener wrap(android.animation.Animator.AnimatorListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.animation.Animator.AnimatorListener(real, (__DcgwBridgeToken) null);
        }

        public android.animation.Animator.AnimatorListener getReal() {
            return (android.animation.Animator.AnimatorListener) real;
        }

        public android.animation.Animator.AnimatorListener unwrap() {
            return getReal();
        }

        public void onAnimationCancel(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
            ((android.animation.Animator.AnimatorListener) real).onAnimationCancel(arg0 == null ? null : arg0.getReal());
        }

        public void onAnimationEnd(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
            ((android.animation.Animator.AnimatorListener) real).onAnimationEnd(arg0 == null ? null : arg0.getReal());
        }

        public void onAnimationEnd(com.micklab.dcg.wrapper.android.animation.Animator arg0, boolean arg1) {
            ((android.animation.Animator.AnimatorListener) real).onAnimationEnd(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onAnimationRepeat(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
            ((android.animation.Animator.AnimatorListener) real).onAnimationRepeat(arg0 == null ? null : arg0.getReal());
        }

        public void onAnimationStart(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
            ((android.animation.Animator.AnimatorListener) real).onAnimationStart(arg0 == null ? null : arg0.getReal());
        }

        public void onAnimationStart(com.micklab.dcg.wrapper.android.animation.Animator arg0, boolean arg1) {
            ((android.animation.Animator.AnimatorListener) real).onAnimationStart(arg0 == null ? null : arg0.getReal(), arg1);
        }

    }
    public static final class AnimatorPauseListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AnimatorPauseListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.animation.Animator.AnimatorPauseListener wrap(android.animation.Animator.AnimatorPauseListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.animation.Animator.AnimatorPauseListener(real, (__DcgwBridgeToken) null);
        }

        public android.animation.Animator.AnimatorPauseListener getReal() {
            return (android.animation.Animator.AnimatorPauseListener) real;
        }

        public android.animation.Animator.AnimatorPauseListener unwrap() {
            return getReal();
        }

        public void onAnimationPause(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
            ((android.animation.Animator.AnimatorPauseListener) real).onAnimationPause(arg0 == null ? null : arg0.getReal());
        }

        public void onAnimationResume(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
            ((android.animation.Animator.AnimatorPauseListener) real).onAnimationResume(arg0 == null ? null : arg0.getReal());
        }

    }
}
