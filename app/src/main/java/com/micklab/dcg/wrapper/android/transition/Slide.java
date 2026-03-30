// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class Slide {
    private final android.transition.Slide real;

    public Slide(android.transition.Slide real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.Slide wrap(android.transition.Slide real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.Slide(real);
    }

    public android.transition.Slide unwrap() {
        return real;
    }

    public Slide() {
        this(new android.transition.Slide());
    }

    public Slide(int arg0) {
        this(new android.transition.Slide(arg0));
    }

    public Slide(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.transition.Slide(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void captureEndValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        real.captureEndValues(arg0 == null ? null : arg0.unwrap());
    }

    public void captureStartValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        real.captureStartValues(arg0 == null ? null : arg0.unwrap());
    }

    public int getSlideEdge() {
        return real.getSlideEdge();
    }

    public com.micklab.dcg.wrapper.android.animation.Animator onAppear(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2, com.micklab.dcg.wrapper.android.transition.TransitionValues arg3) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(real.onAppear(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.animation.Animator onDisappear(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2, com.micklab.dcg.wrapper.android.transition.TransitionValues arg3) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(real.onDisappear(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public void setSlideEdge(int arg0) {
        real.setSlideEdge(arg0);
    }

}
