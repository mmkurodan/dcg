// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class ChangeClipBounds {
    private final android.transition.ChangeClipBounds real;

    public ChangeClipBounds(android.transition.ChangeClipBounds real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.ChangeClipBounds wrap(android.transition.ChangeClipBounds real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.ChangeClipBounds(real);
    }

    public android.transition.ChangeClipBounds unwrap() {
        return real;
    }

    public ChangeClipBounds() {
        this(new android.transition.ChangeClipBounds());
    }

    public ChangeClipBounds(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.transition.ChangeClipBounds(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void captureEndValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        real.captureEndValues(arg0 == null ? null : arg0.unwrap());
    }

    public void captureStartValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        real.captureStartValues(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.animation.Animator createAnimator(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.transition.TransitionValues arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(real.createAnimator(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public java.lang.String[] getTransitionProperties() {
        return real.getTransitionProperties();
    }

}
