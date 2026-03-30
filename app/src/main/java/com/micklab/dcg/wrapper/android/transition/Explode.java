// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class Explode {
    private final android.transition.Explode real;

    public Explode(android.transition.Explode real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.Explode wrap(android.transition.Explode real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.Explode(real);
    }

    public android.transition.Explode unwrap() {
        return real;
    }

    public Explode() {
        this(new android.transition.Explode());
    }

    public Explode(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.transition.Explode(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void captureEndValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        real.captureEndValues(arg0 == null ? null : arg0.unwrap());
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

}
