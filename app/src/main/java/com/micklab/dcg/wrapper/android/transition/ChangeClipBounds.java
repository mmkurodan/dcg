// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class ChangeClipBounds {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ChangeClipBounds(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.ChangeClipBounds wrap(android.transition.ChangeClipBounds real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.ChangeClipBounds(real, (__DcgwBridgeToken) null);
    }

    public android.transition.ChangeClipBounds getReal() {
        return (android.transition.ChangeClipBounds) real;
    }

    public android.transition.ChangeClipBounds unwrap() {
        return getReal();
    }

    public ChangeClipBounds() {
        this(new android.transition.ChangeClipBounds(), (__DcgwBridgeToken) null);
    }

    public ChangeClipBounds(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.transition.ChangeClipBounds(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public void captureEndValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        ((android.transition.ChangeClipBounds) real).captureEndValues(arg0 == null ? null : arg0.getReal());
    }

    public void captureStartValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        ((android.transition.ChangeClipBounds) real).captureStartValues(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.animation.Animator createAnimator(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.transition.TransitionValues arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(((android.transition.ChangeClipBounds) real).createAnimator(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public java.lang.String[] getTransitionProperties() {
        return ((android.transition.ChangeClipBounds) real).getTransitionProperties();
    }

}
