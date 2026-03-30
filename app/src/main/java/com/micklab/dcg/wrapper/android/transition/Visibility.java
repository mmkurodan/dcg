// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class Visibility {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Visibility(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.Visibility wrap(android.transition.Visibility real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.Visibility(real, (__DcgwBridgeToken) null);
    }

    public android.transition.Visibility getReal() {
        return (android.transition.Visibility) real;
    }

    public android.transition.Visibility unwrap() {
        return getReal();
    }

    public void captureEndValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        ((android.transition.Visibility) real).captureEndValues(arg0 == null ? null : arg0.getReal());
    }

    public void captureStartValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        ((android.transition.Visibility) real).captureStartValues(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.animation.Animator createAnimator(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.transition.TransitionValues arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(((android.transition.Visibility) real).createAnimator(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public int getMode() {
        return ((android.transition.Visibility) real).getMode();
    }

    public java.lang.String[] getTransitionProperties() {
        return ((android.transition.Visibility) real).getTransitionProperties();
    }

    public boolean isTransitionRequired(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0, com.micklab.dcg.wrapper.android.transition.TransitionValues arg1) {
        return ((android.transition.Visibility) real).isTransitionRequired(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean isVisible(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        return ((android.transition.Visibility) real).isVisible(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.animation.Animator onAppear(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2, com.micklab.dcg.wrapper.android.transition.TransitionValues arg3) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(((android.transition.Visibility) real).onAppear(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
    }

    public com.micklab.dcg.wrapper.android.animation.Animator onAppear(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.transition.TransitionValues arg1, int arg2, com.micklab.dcg.wrapper.android.transition.TransitionValues arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(((android.transition.Visibility) real).onAppear(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4));
    }

    public com.micklab.dcg.wrapper.android.animation.Animator onDisappear(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2, com.micklab.dcg.wrapper.android.transition.TransitionValues arg3) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(((android.transition.Visibility) real).onDisappear(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
    }

    public com.micklab.dcg.wrapper.android.animation.Animator onDisappear(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.transition.TransitionValues arg1, int arg2, com.micklab.dcg.wrapper.android.transition.TransitionValues arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(((android.transition.Visibility) real).onDisappear(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4));
    }

    public void setMode(int arg0) {
        ((android.transition.Visibility) real).setMode(arg0);
    }

    public static final int MODE_IN = android.transition.Visibility.MODE_IN;
    public static final int MODE_OUT = android.transition.Visibility.MODE_OUT;

}
