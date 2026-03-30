// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class SidePropagation {
    private final android.transition.SidePropagation real;

    public SidePropagation(android.transition.SidePropagation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.SidePropagation wrap(android.transition.SidePropagation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.SidePropagation(real);
    }

    public android.transition.SidePropagation unwrap() {
        return real;
    }

    public SidePropagation() {
        this(new android.transition.SidePropagation());
    }

    public long getStartDelay(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.transition.Transition arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2, com.micklab.dcg.wrapper.android.transition.TransitionValues arg3) {
        return real.getStartDelay(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
    }

    public void setPropagationSpeed(float arg0) {
        real.setPropagationSpeed(arg0);
    }

    public void setSide(int arg0) {
        real.setSide(arg0);
    }

}
