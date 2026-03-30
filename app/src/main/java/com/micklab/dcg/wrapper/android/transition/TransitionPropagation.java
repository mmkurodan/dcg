// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class TransitionPropagation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TransitionPropagation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.TransitionPropagation wrap(android.transition.TransitionPropagation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.TransitionPropagation(real, (__DcgwBridgeToken) null);
    }

    public android.transition.TransitionPropagation getReal() {
        return (android.transition.TransitionPropagation) real;
    }

    public android.transition.TransitionPropagation unwrap() {
        return getReal();
    }

    public void captureValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        ((android.transition.TransitionPropagation) real).captureValues(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String[] getPropagationProperties() {
        return ((android.transition.TransitionPropagation) real).getPropagationProperties();
    }

    public long getStartDelay(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.transition.Transition arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2, com.micklab.dcg.wrapper.android.transition.TransitionValues arg3) {
        return ((android.transition.TransitionPropagation) real).getStartDelay(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

}
