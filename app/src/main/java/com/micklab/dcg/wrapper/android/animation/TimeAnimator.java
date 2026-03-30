// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class TimeAnimator {
    private final android.animation.TimeAnimator real;

    public TimeAnimator(android.animation.TimeAnimator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.TimeAnimator wrap(android.animation.TimeAnimator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.TimeAnimator(real);
    }

    public android.animation.TimeAnimator unwrap() {
        return real;
    }

    public TimeAnimator() {
        this(new android.animation.TimeAnimator());
    }

    public void setCurrentPlayTime(long arg0) {
        real.setCurrentPlayTime(arg0);
    }

    public void setTimeListener(com.micklab.dcg.wrapper.android.animation.TimeAnimator.TimeListener arg0) {
        real.setTimeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void start() {
        real.start();
    }

    public static final class TimeListener {
        private final android.animation.TimeAnimator.TimeListener real;

        public TimeListener(android.animation.TimeAnimator.TimeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.animation.TimeAnimator.TimeListener wrap(android.animation.TimeAnimator.TimeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.animation.TimeAnimator.TimeListener(real);
        }

        public android.animation.TimeAnimator.TimeListener unwrap() {
            return real;
        }

        public void onTimeUpdate(com.micklab.dcg.wrapper.android.animation.TimeAnimator arg0, long arg1, long arg2) {
            real.onTimeUpdate(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

    }
}
