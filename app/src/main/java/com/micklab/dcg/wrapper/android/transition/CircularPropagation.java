// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class CircularPropagation {
    private final android.transition.CircularPropagation real;

    public CircularPropagation(android.transition.CircularPropagation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.CircularPropagation wrap(android.transition.CircularPropagation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.CircularPropagation(real);
    }

    public android.transition.CircularPropagation unwrap() {
        return real;
    }

    public CircularPropagation() {
        this(new android.transition.CircularPropagation());
    }

    public long getStartDelay(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.transition.Transition arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2, com.micklab.dcg.wrapper.android.transition.TransitionValues arg3) {
        return real.getStartDelay(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
    }

    public void setPropagationSpeed(float arg0) {
        real.setPropagationSpeed(arg0);
    }

}
