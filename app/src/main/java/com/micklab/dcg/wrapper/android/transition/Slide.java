// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class Slide {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Slide(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.Slide wrap(android.transition.Slide real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.Slide(real, (__DcgwBridgeToken) null);
    }

    public android.transition.Slide getReal() {
        return (android.transition.Slide) real;
    }

    public android.transition.Slide unwrap() {
        return getReal();
    }

    public Slide() {
        this(new android.transition.Slide(), (__DcgwBridgeToken) null);
    }

    public Slide(int arg0) {
        this(new android.transition.Slide(arg0), (__DcgwBridgeToken) null);
    }

    public Slide(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.transition.Slide(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public void captureEndValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        ((android.transition.Slide) real).captureEndValues(arg0 == null ? null : arg0.getReal());
    }

    public void captureStartValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        ((android.transition.Slide) real).captureStartValues(arg0 == null ? null : arg0.getReal());
    }

    public int getSlideEdge() {
        return ((android.transition.Slide) real).getSlideEdge();
    }

    public com.micklab.dcg.wrapper.android.animation.Animator onAppear(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2, com.micklab.dcg.wrapper.android.transition.TransitionValues arg3) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(((android.transition.Slide) real).onAppear(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
    }

    public com.micklab.dcg.wrapper.android.animation.Animator onDisappear(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2, com.micklab.dcg.wrapper.android.transition.TransitionValues arg3) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(((android.transition.Slide) real).onDisappear(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
    }

    public void setSlideEdge(int arg0) {
        ((android.transition.Slide) real).setSlideEdge(arg0);
    }

}
