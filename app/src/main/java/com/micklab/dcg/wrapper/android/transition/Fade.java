// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class Fade {
    private final android.transition.Fade real;

    public Fade(android.transition.Fade real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.Fade wrap(android.transition.Fade real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.Fade(real);
    }

    public android.transition.Fade unwrap() {
        return real;
    }

    public Fade() {
        this(new android.transition.Fade());
    }

    public Fade(int arg0) {
        this(new android.transition.Fade(arg0));
    }

    public Fade(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.transition.Fade(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void captureStartValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        real.captureStartValues(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.animation.Animator onAppear(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2, com.micklab.dcg.wrapper.android.transition.TransitionValues arg3) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(real.onAppear(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.animation.Animator onDisappear(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2, com.micklab.dcg.wrapper.android.transition.TransitionValues arg3) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(real.onDisappear(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public static final int IN = android.transition.Fade.IN;
    public static final int OUT = android.transition.Fade.OUT;

}
