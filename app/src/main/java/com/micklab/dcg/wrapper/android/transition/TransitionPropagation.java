// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class TransitionPropagation {
    private final android.transition.TransitionPropagation real;

    public TransitionPropagation(android.transition.TransitionPropagation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.TransitionPropagation wrap(android.transition.TransitionPropagation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.TransitionPropagation(real);
    }

    public android.transition.TransitionPropagation unwrap() {
        return real;
    }

    public void captureValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        real.captureValues(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String[] getPropagationProperties() {
        return real.getPropagationProperties();
    }

    public long getStartDelay(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.transition.Transition arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2, com.micklab.dcg.wrapper.android.transition.TransitionValues arg3) {
        return real.getStartDelay(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
    }

}
