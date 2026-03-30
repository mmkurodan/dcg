// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class ChangeScroll {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ChangeScroll(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.ChangeScroll wrap(android.transition.ChangeScroll real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.ChangeScroll(real, (__DcgwBridgeToken) null);
    }

    public android.transition.ChangeScroll getReal() {
        return (android.transition.ChangeScroll) real;
    }

    public android.transition.ChangeScroll unwrap() {
        return getReal();
    }

    public ChangeScroll() {
        this(new android.transition.ChangeScroll(), (__DcgwBridgeToken) null);
    }

    public ChangeScroll(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.transition.ChangeScroll(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public void captureEndValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        ((android.transition.ChangeScroll) real).captureEndValues(arg0 == null ? null : arg0.getReal());
    }

    public void captureStartValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        ((android.transition.ChangeScroll) real).captureStartValues(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.animation.Animator createAnimator(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.transition.TransitionValues arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(((android.transition.ChangeScroll) real).createAnimator(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public java.lang.String[] getTransitionProperties() {
        return ((android.transition.ChangeScroll) real).getTransitionProperties();
    }

}
