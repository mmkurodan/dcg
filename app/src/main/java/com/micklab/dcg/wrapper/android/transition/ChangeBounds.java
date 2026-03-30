// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class ChangeBounds {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ChangeBounds(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.ChangeBounds wrap(android.transition.ChangeBounds real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.ChangeBounds(real, (__DcgwBridgeToken) null);
    }

    public android.transition.ChangeBounds getReal() {
        return (android.transition.ChangeBounds) real;
    }

    public android.transition.ChangeBounds unwrap() {
        return getReal();
    }

    public ChangeBounds() {
        this(new android.transition.ChangeBounds(), (__DcgwBridgeToken) null);
    }

    public ChangeBounds(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.transition.ChangeBounds(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public void captureEndValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        ((android.transition.ChangeBounds) real).captureEndValues(arg0 == null ? null : arg0.getReal());
    }

    public void captureStartValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        ((android.transition.ChangeBounds) real).captureStartValues(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.animation.Animator createAnimator(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.transition.TransitionValues arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(((android.transition.ChangeBounds) real).createAnimator(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public boolean getResizeClip() {
        return ((android.transition.ChangeBounds) real).getResizeClip();
    }

    public java.lang.String[] getTransitionProperties() {
        return ((android.transition.ChangeBounds) real).getTransitionProperties();
    }

    public void setReparent(boolean arg0) {
        ((android.transition.ChangeBounds) real).setReparent(arg0);
    }

    public void setResizeClip(boolean arg0) {
        ((android.transition.ChangeBounds) real).setResizeClip(arg0);
    }

}
