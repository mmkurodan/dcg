// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class AnimatorListenerAdapter {
    private final android.animation.AnimatorListenerAdapter real;

    public AnimatorListenerAdapter(android.animation.AnimatorListenerAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.AnimatorListenerAdapter wrap(android.animation.AnimatorListenerAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.AnimatorListenerAdapter(real);
    }

    public android.animation.AnimatorListenerAdapter unwrap() {
        return real;
    }

    public void onAnimationCancel(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
        real.onAnimationCancel(arg0 == null ? null : arg0.unwrap());
    }

    public void onAnimationEnd(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
        real.onAnimationEnd(arg0 == null ? null : arg0.unwrap());
    }

    public void onAnimationPause(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
        real.onAnimationPause(arg0 == null ? null : arg0.unwrap());
    }

    public void onAnimationRepeat(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
        real.onAnimationRepeat(arg0 == null ? null : arg0.unwrap());
    }

    public void onAnimationResume(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
        real.onAnimationResume(arg0 == null ? null : arg0.unwrap());
    }

    public void onAnimationStart(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
        real.onAnimationStart(arg0 == null ? null : arg0.unwrap());
    }

}
