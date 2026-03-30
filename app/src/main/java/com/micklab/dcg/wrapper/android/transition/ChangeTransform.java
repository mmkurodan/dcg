// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class ChangeTransform {
    private final android.transition.ChangeTransform real;

    public ChangeTransform(android.transition.ChangeTransform real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.ChangeTransform wrap(android.transition.ChangeTransform real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.ChangeTransform(real);
    }

    public android.transition.ChangeTransform unwrap() {
        return real;
    }

    public ChangeTransform() {
        this(new android.transition.ChangeTransform());
    }

    public ChangeTransform(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.transition.ChangeTransform(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
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

    public boolean getReparent() {
        return real.getReparent();
    }

    public boolean getReparentWithOverlay() {
        return real.getReparentWithOverlay();
    }

    public java.lang.String[] getTransitionProperties() {
        return real.getTransitionProperties();
    }

    public void setReparent(boolean arg0) {
        real.setReparent(arg0);
    }

    public void setReparentWithOverlay(boolean arg0) {
        real.setReparentWithOverlay(arg0);
    }

}
