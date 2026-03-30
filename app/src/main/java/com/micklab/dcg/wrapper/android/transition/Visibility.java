// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class Visibility {
    private final android.transition.Visibility real;

    public Visibility(android.transition.Visibility real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.Visibility wrap(android.transition.Visibility real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.Visibility(real);
    }

    public android.transition.Visibility unwrap() {
        return real;
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

    public int getMode() {
        return real.getMode();
    }

    public java.lang.String[] getTransitionProperties() {
        return real.getTransitionProperties();
    }

    public boolean isTransitionRequired(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0, com.micklab.dcg.wrapper.android.transition.TransitionValues arg1) {
        return real.isTransitionRequired(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean isVisible(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        return real.isVisible(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.animation.Animator onAppear(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2, com.micklab.dcg.wrapper.android.transition.TransitionValues arg3) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(real.onAppear(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.animation.Animator onAppear(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.transition.TransitionValues arg1, int arg2, com.micklab.dcg.wrapper.android.transition.TransitionValues arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(real.onAppear(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4));
    }

    public com.micklab.dcg.wrapper.android.animation.Animator onDisappear(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2, com.micklab.dcg.wrapper.android.transition.TransitionValues arg3) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(real.onDisappear(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.animation.Animator onDisappear(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.transition.TransitionValues arg1, int arg2, com.micklab.dcg.wrapper.android.transition.TransitionValues arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(real.onDisappear(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4));
    }

    public void setMode(int arg0) {
        real.setMode(arg0);
    }

    public static final int MODE_IN = android.transition.Visibility.MODE_IN;
    public static final int MODE_OUT = android.transition.Visibility.MODE_OUT;

}
