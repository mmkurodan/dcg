// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class Fade {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Fade(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.Fade wrap(android.transition.Fade real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.Fade(real, (__DcgwBridgeToken) null);
    }

    public android.transition.Fade getReal() {
        return (android.transition.Fade) real;
    }

    public android.transition.Fade unwrap() {
        return getReal();
    }

    public Fade() {
        this(new android.transition.Fade(), (__DcgwBridgeToken) null);
    }

    public Fade(int arg0) {
        this(new android.transition.Fade(arg0), (__DcgwBridgeToken) null);
    }

    public Fade(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.transition.Fade(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public void captureStartValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        ((android.transition.Fade) real).captureStartValues(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.animation.Animator onAppear(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2, com.micklab.dcg.wrapper.android.transition.TransitionValues arg3) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(((android.transition.Fade) real).onAppear(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
    }

    public com.micklab.dcg.wrapper.android.animation.Animator onDisappear(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2, com.micklab.dcg.wrapper.android.transition.TransitionValues arg3) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(((android.transition.Fade) real).onDisappear(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
    }

    public static final int IN = android.transition.Fade.IN;
    public static final int OUT = android.transition.Fade.OUT;

}
