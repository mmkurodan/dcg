// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class ChangeTransform {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ChangeTransform(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.ChangeTransform wrap(android.transition.ChangeTransform real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.ChangeTransform(real, (__DcgwBridgeToken) null);
    }

    public android.transition.ChangeTransform getReal() {
        return (android.transition.ChangeTransform) real;
    }

    public android.transition.ChangeTransform unwrap() {
        return getReal();
    }

    public ChangeTransform() {
        this(new android.transition.ChangeTransform(), (__DcgwBridgeToken) null);
    }

    public ChangeTransform(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.transition.ChangeTransform(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public void captureEndValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        ((android.transition.ChangeTransform) real).captureEndValues(arg0 == null ? null : arg0.getReal());
    }

    public void captureStartValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        ((android.transition.ChangeTransform) real).captureStartValues(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.animation.Animator createAnimator(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.transition.TransitionValues arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(((android.transition.ChangeTransform) real).createAnimator(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public boolean getReparent() {
        return ((android.transition.ChangeTransform) real).getReparent();
    }

    public boolean getReparentWithOverlay() {
        return ((android.transition.ChangeTransform) real).getReparentWithOverlay();
    }

    public java.lang.String[] getTransitionProperties() {
        return ((android.transition.ChangeTransform) real).getTransitionProperties();
    }

    public void setReparent(boolean arg0) {
        ((android.transition.ChangeTransform) real).setReparent(arg0);
    }

    public void setReparentWithOverlay(boolean arg0) {
        ((android.transition.ChangeTransform) real).setReparentWithOverlay(arg0);
    }

}
