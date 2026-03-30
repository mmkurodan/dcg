// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class ChangeImageTransform {
    private final android.transition.ChangeImageTransform real;

    public ChangeImageTransform(android.transition.ChangeImageTransform real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.ChangeImageTransform wrap(android.transition.ChangeImageTransform real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.ChangeImageTransform(real);
    }

    public android.transition.ChangeImageTransform unwrap() {
        return real;
    }

    public ChangeImageTransform() {
        this(new android.transition.ChangeImageTransform());
    }

    public ChangeImageTransform(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.transition.ChangeImageTransform(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
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
