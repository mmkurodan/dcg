// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class AnimatorListenerAdapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AnimatorListenerAdapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.AnimatorListenerAdapter wrap(android.animation.AnimatorListenerAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.AnimatorListenerAdapter(real, (__DcgwBridgeToken) null);
    }

    public android.animation.AnimatorListenerAdapter getReal() {
        return (android.animation.AnimatorListenerAdapter) real;
    }

    public android.animation.AnimatorListenerAdapter unwrap() {
        return getReal();
    }

    public void onAnimationCancel(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
        ((android.animation.AnimatorListenerAdapter) real).onAnimationCancel(arg0 == null ? null : arg0.getReal());
    }

    public void onAnimationEnd(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
        ((android.animation.AnimatorListenerAdapter) real).onAnimationEnd(arg0 == null ? null : arg0.getReal());
    }

    public void onAnimationPause(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
        ((android.animation.AnimatorListenerAdapter) real).onAnimationPause(arg0 == null ? null : arg0.getReal());
    }

    public void onAnimationRepeat(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
        ((android.animation.AnimatorListenerAdapter) real).onAnimationRepeat(arg0 == null ? null : arg0.getReal());
    }

    public void onAnimationResume(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
        ((android.animation.AnimatorListenerAdapter) real).onAnimationResume(arg0 == null ? null : arg0.getReal());
    }

    public void onAnimationStart(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
        ((android.animation.AnimatorListenerAdapter) real).onAnimationStart(arg0 == null ? null : arg0.getReal());
    }

}
