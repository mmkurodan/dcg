// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class TransitionSet {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TransitionSet(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.TransitionSet wrap(android.transition.TransitionSet real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.TransitionSet(real, (__DcgwBridgeToken) null);
    }

    public android.transition.TransitionSet getReal() {
        return (android.transition.TransitionSet) real;
    }

    public android.transition.TransitionSet unwrap() {
        return getReal();
    }

    public TransitionSet() {
        this(new android.transition.TransitionSet(), (__DcgwBridgeToken) null);
    }

    public TransitionSet(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.transition.TransitionSet(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet addListener(com.micklab.dcg.wrapper.android.transition.Transition.TransitionListener arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(((android.transition.TransitionSet) real).addListener(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet addTarget(com.micklab.dcg.wrapper.android.view.View arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(((android.transition.TransitionSet) real).addTarget(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet addTarget(int arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(((android.transition.TransitionSet) real).addTarget(arg0));
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet addTarget(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(((android.transition.TransitionSet) real).addTarget(arg0));
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet addTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(((android.transition.TransitionSet) real).addTransition(arg0 == null ? null : arg0.getReal()));
    }

    public void captureEndValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        ((android.transition.TransitionSet) real).captureEndValues(arg0 == null ? null : arg0.getReal());
    }

    public void captureStartValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        ((android.transition.TransitionSet) real).captureStartValues(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet clone() {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(((android.transition.TransitionSet) real).clone());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition excludeTarget(int arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.transition.TransitionSet) real).excludeTarget(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition excludeTarget(java.lang.String arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.transition.TransitionSet) real).excludeTarget(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition excludeTarget(com.micklab.dcg.wrapper.android.view.View arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.transition.TransitionSet) real).excludeTarget(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public int getOrdering() {
        return ((android.transition.TransitionSet) real).getOrdering();
    }

    public com.micklab.dcg.wrapper.android.transition.Transition getTransitionAt(int arg0) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.transition.TransitionSet) real).getTransitionAt(arg0));
    }

    public int getTransitionCount() {
        return ((android.transition.TransitionSet) real).getTransitionCount();
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet removeListener(com.micklab.dcg.wrapper.android.transition.Transition.TransitionListener arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(((android.transition.TransitionSet) real).removeListener(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet removeTarget(com.micklab.dcg.wrapper.android.view.View arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(((android.transition.TransitionSet) real).removeTarget(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet removeTarget(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(((android.transition.TransitionSet) real).removeTarget(arg0));
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet removeTarget(int arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(((android.transition.TransitionSet) real).removeTarget(arg0));
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet removeTransition(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(((android.transition.TransitionSet) real).removeTransition(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet setDuration(long arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(((android.transition.TransitionSet) real).setDuration(arg0));
    }

    public void setEpicenterCallback(com.micklab.dcg.wrapper.android.transition.Transition.EpicenterCallback arg0) {
        ((android.transition.TransitionSet) real).setEpicenterCallback(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet setInterpolator(com.micklab.dcg.wrapper.android.animation.TimeInterpolator arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(((android.transition.TransitionSet) real).setInterpolator(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet setOrdering(int arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(((android.transition.TransitionSet) real).setOrdering(arg0));
    }

    public void setPathMotion(com.micklab.dcg.wrapper.android.transition.PathMotion arg0) {
        ((android.transition.TransitionSet) real).setPathMotion(arg0 == null ? null : arg0.getReal());
    }

    public void setPropagation(com.micklab.dcg.wrapper.android.transition.TransitionPropagation arg0) {
        ((android.transition.TransitionSet) real).setPropagation(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionSet setStartDelay(long arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionSet.wrap(((android.transition.TransitionSet) real).setStartDelay(arg0));
    }

    public static final int ORDERING_SEQUENTIAL = android.transition.TransitionSet.ORDERING_SEQUENTIAL;
    public static final int ORDERING_TOGETHER = android.transition.TransitionSet.ORDERING_TOGETHER;

}
