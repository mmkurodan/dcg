// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class ChangeBounds {
    private final android.transition.ChangeBounds real;

    public ChangeBounds(android.transition.ChangeBounds real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.ChangeBounds wrap(android.transition.ChangeBounds real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.ChangeBounds(real);
    }

    public android.transition.ChangeBounds unwrap() {
        return real;
    }

    public ChangeBounds() {
        this(new android.transition.ChangeBounds());
    }

    public ChangeBounds(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.transition.ChangeBounds(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
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

    public boolean getResizeClip() {
        return real.getResizeClip();
    }

    public java.lang.String[] getTransitionProperties() {
        return real.getTransitionProperties();
    }

    public void setReparent(boolean arg0) {
        real.setReparent(arg0);
    }

    public void setResizeClip(boolean arg0) {
        real.setResizeClip(arg0);
    }

}
