// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class TransitionSet {
    private final android.transition.TransitionSet real;

    public TransitionSet(android.transition.TransitionSet real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.TransitionSet wrap(android.transition.TransitionSet real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.TransitionSet(real);
    }

    public android.transition.TransitionSet unwrap() {
        return real;
    }

    public TransitionSet() {
        this(new android.transition.TransitionSet());
    }

    public TransitionSet(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.transition.TransitionSet(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet addListener(com.micklab.dcg.wrapper.android.transition.Transition.TransitionListener arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(real.addListener(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet addTarget(com.micklab.dcg.wrapper.android.view.View arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(real.addTarget(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet addTarget(int arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(real.addTarget(arg0));
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet addTarget(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(real.addTarget(arg0));
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet addTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(real.addTransition(arg0 == null ? null : arg0.unwrap()));
    }

    public void captureEndValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        real.captureEndValues(arg0 == null ? null : arg0.unwrap());
    }

    public void captureStartValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        real.captureStartValues(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet clone() {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(real.clone());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition excludeTarget(int arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.excludeTarget(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition excludeTarget(java.lang.String arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.excludeTarget(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition excludeTarget(com.micklab.dcg.wrapper.android.view.View arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.excludeTarget(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public int getOrdering() {
        return real.getOrdering();
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getTransitionAt(int arg0) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.getTransitionAt(arg0));
    }

    public int getTransitionCount() {
        return real.getTransitionCount();
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet removeListener(com.micklab.dcg.wrapper.android.transition.Transition.TransitionListener arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(real.removeListener(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet removeTarget(com.micklab.dcg.wrapper.android.view.View arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(real.removeTarget(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet removeTarget(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(real.removeTarget(arg0));
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet removeTarget(int arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(real.removeTarget(arg0));
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet removeTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(real.removeTransition(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet setDuration(long arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(real.setDuration(arg0));
    }

    public void setEpicenterCallback(com.micklab.dcg.wrapper.android.transition.Transition.EpicenterCallback arg0) {
        real.setEpicenterCallback(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet setInterpolator(com.micklab.dcg.wrapper.android.animation.TimeInterpolator arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(real.setInterpolator(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet setOrdering(int arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(real.setOrdering(arg0));
    }

    public void setPathMotion(com.micklab.dcg.wrapper.android.transition.PathMotion arg0) {
        real.setPathMotion(arg0 == null ? null : arg0.unwrap());
    }

    public void setPropagation(com.micklab.dcg.wrapper.android.transition.TransitionPropagation arg0) {
        real.setPropagation(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet setStartDelay(long arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(real.setStartDelay(arg0));
    }

    public static final int ORDERING_SEQUENTIAL = android.transition.TransitionSet.ORDERING_SEQUENTIAL;
    public static final int ORDERING_TOGETHER = android.transition.TransitionSet.ORDERING_TOGETHER;

}
