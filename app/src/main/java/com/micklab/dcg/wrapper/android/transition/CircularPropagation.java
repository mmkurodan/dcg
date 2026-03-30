// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class CircularPropagation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CircularPropagation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.CircularPropagation wrap(android.transition.CircularPropagation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.CircularPropagation(real, (__DcgwBridgeToken) null);
    }

    public android.transition.CircularPropagation getReal() {
        return (android.transition.CircularPropagation) real;
    }

    public android.transition.CircularPropagation unwrap() {
        return getReal();
    }

    public CircularPropagation() {
        this(new android.transition.CircularPropagation(), (__DcgwBridgeToken) null);
    }

    public long getStartDelay(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.transition.Transition arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2, com.micklab.dcg.wrapper.android.transition.TransitionValues arg3) {
        return ((android.transition.CircularPropagation) real).getStartDelay(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public void setPropagationSpeed(float arg0) {
        ((android.transition.CircularPropagation) real).setPropagationSpeed(arg0);
    }

}
