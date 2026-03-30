// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class TimeAnimator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TimeAnimator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.TimeAnimator wrap(android.animation.TimeAnimator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.TimeAnimator(real, (__DcgwBridgeToken) null);
    }

    public android.animation.TimeAnimator getReal() {
        return (android.animation.TimeAnimator) real;
    }

    public android.animation.TimeAnimator unwrap() {
        return getReal();
    }

    public TimeAnimator() {
        this(new android.animation.TimeAnimator(), (__DcgwBridgeToken) null);
    }

    public void setCurrentPlayTime(long arg0) {
        ((android.animation.TimeAnimator) real).setCurrentPlayTime(arg0);
    }

    public void setTimeListener(com.micklab.dcg.wrapper.android.animation.TimeAnimator.TimeListener arg0) {
        ((android.animation.TimeAnimator) real).setTimeListener(arg0 == null ? null : arg0.getReal());
    }

    public void start() {
        ((android.animation.TimeAnimator) real).start();
    }

    public static final class TimeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TimeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.animation.TimeAnimator.TimeListener wrap(android.animation.TimeAnimator.TimeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.animation.TimeAnimator.TimeListener(real, (__DcgwBridgeToken) null);
        }

        public android.animation.TimeAnimator.TimeListener getReal() {
            return (android.animation.TimeAnimator.TimeListener) real;
        }

        public android.animation.TimeAnimator.TimeListener unwrap() {
            return getReal();
        }

        public void onTimeUpdate(com.micklab.dcg.wrapper.android.animation.TimeAnimator arg0, long arg1, long arg2) {
            ((android.animation.TimeAnimator.TimeListener) real).onTimeUpdate(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

    }
}
