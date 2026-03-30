// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class Animator {
    private final android.animation.Animator real;

    public Animator(android.animation.Animator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.Animator wrap(android.animation.Animator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.Animator(real);
    }

    public android.animation.Animator unwrap() {
        return real;
    }

    public void addListener(com.micklab.dcg.wrapper.android.animation.Animator.AnimatorListener arg0) {
        real.addListener(arg0 == null ? null : arg0.unwrap());
    }

    public void addPauseListener(com.micklab.dcg.wrapper.android.animation.Animator.AnimatorPauseListener arg0) {
        real.addPauseListener(arg0 == null ? null : arg0.unwrap());
    }

    public void cancel() {
        real.cancel();
    }

    public com.micklab.dcg.wrapper.android.animation.Animator clone() {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(real.clone());
    }

    public void end() {
        real.end();
    }

    public long getDuration() {
        return real.getDuration();
    }

    public com.micklab.dcg.wrapper.android.animation.TimeInterpolator getInterpolator() {
        return com.micklab.dcg.wrapper.android.animation.TimeInterpolator.wrap(real.getInterpolator());
    }

    public long getStartDelay() {
        return real.getStartDelay();
    }

    public long getTotalDuration() {
        return real.getTotalDuration();
    }

    public boolean isPaused() {
        return real.isPaused();
    }

    public boolean isRunning() {
        return real.isRunning();
    }

    public boolean isStarted() {
        return real.isStarted();
    }

    public void pause() {
        real.pause();
    }

    public void removeAllListeners() {
        real.removeAllListeners();
    }

    public void removeListener(com.micklab.dcg.wrapper.android.animation.Animator.AnimatorListener arg0) {
        real.removeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removePauseListener(com.micklab.dcg.wrapper.android.animation.Animator.AnimatorPauseListener arg0) {
        real.removePauseListener(arg0 == null ? null : arg0.unwrap());
    }

    public void resume() {
        real.resume();
    }

    public com.micklab.dcg.wrapper.android.animation.Animator setDuration(long arg0) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(real.setDuration(arg0));
    }

    public void setInterpolator(com.micklab.dcg.wrapper.android.animation.TimeInterpolator arg0) {
        real.setInterpolator(arg0 == null ? null : arg0.unwrap());
    }

    public void setStartDelay(long arg0) {
        real.setStartDelay(arg0);
    }

    public void setTarget(java.lang.Object arg0) {
        real.setTarget(arg0);
    }

    public void setupEndValues() {
        real.setupEndValues();
    }

    public void setupStartValues() {
        real.setupStartValues();
    }

    public void start() {
        real.start();
    }

    public static final long DURATION_INFINITE = android.animation.Animator.DURATION_INFINITE;

    public static final class AnimatorListener {
        private final android.animation.Animator.AnimatorListener real;

        public AnimatorListener(android.animation.Animator.AnimatorListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.animation.Animator.AnimatorListener wrap(android.animation.Animator.AnimatorListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.animation.Animator.AnimatorListener(real);
        }

        public android.animation.Animator.AnimatorListener unwrap() {
            return real;
        }

        public void onAnimationCancel(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
            real.onAnimationCancel(arg0 == null ? null : arg0.unwrap());
        }

        public void onAnimationEnd(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
            real.onAnimationEnd(arg0 == null ? null : arg0.unwrap());
        }

        public void onAnimationEnd(com.micklab.dcg.wrapper.android.animation.Animator arg0, boolean arg1) {
            real.onAnimationEnd(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void onAnimationRepeat(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
            real.onAnimationRepeat(arg0 == null ? null : arg0.unwrap());
        }

        public void onAnimationStart(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
            real.onAnimationStart(arg0 == null ? null : arg0.unwrap());
        }

        public void onAnimationStart(com.micklab.dcg.wrapper.android.animation.Animator arg0, boolean arg1) {
            real.onAnimationStart(arg0 == null ? null : arg0.unwrap(), arg1);
        }

    }
    public static final class AnimatorPauseListener {
        private final android.animation.Animator.AnimatorPauseListener real;

        public AnimatorPauseListener(android.animation.Animator.AnimatorPauseListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.animation.Animator.AnimatorPauseListener wrap(android.animation.Animator.AnimatorPauseListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.animation.Animator.AnimatorPauseListener(real);
        }

        public android.animation.Animator.AnimatorPauseListener unwrap() {
            return real;
        }

        public void onAnimationPause(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
            real.onAnimationPause(arg0 == null ? null : arg0.unwrap());
        }

        public void onAnimationResume(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
            real.onAnimationResume(arg0 == null ? null : arg0.unwrap());
        }

    }
}
