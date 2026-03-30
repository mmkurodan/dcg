// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class SidePropagation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SidePropagation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.SidePropagation wrap(android.transition.SidePropagation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.SidePropagation(real, (__DcgwBridgeToken) null);
    }

    public android.transition.SidePropagation getReal() {
        return (android.transition.SidePropagation) real;
    }

    public android.transition.SidePropagation unwrap() {
        return getReal();
    }

    public SidePropagation() {
        this(new android.transition.SidePropagation(), (__DcgwBridgeToken) null);
    }

    public long getStartDelay(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.transition.Transition arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2, com.micklab.dcg.wrapper.android.transition.TransitionValues arg3) {
        return ((android.transition.SidePropagation) real).getStartDelay(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public void setPropagationSpeed(float arg0) {
        ((android.transition.SidePropagation) real).setPropagationSpeed(arg0);
    }

    public void setSide(int arg0) {
        ((android.transition.SidePropagation) real).setSide(arg0);
    }

}
