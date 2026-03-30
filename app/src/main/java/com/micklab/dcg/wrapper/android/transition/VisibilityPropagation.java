// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class VisibilityPropagation {
    private final android.transition.VisibilityPropagation real;

    public VisibilityPropagation(android.transition.VisibilityPropagation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.VisibilityPropagation wrap(android.transition.VisibilityPropagation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.VisibilityPropagation(real);
    }

    public android.transition.VisibilityPropagation unwrap() {
        return real;
    }

    public void captureValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        real.captureValues(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String[] getPropagationProperties() {
        return real.getPropagationProperties();
    }

    public int getViewVisibility(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        return real.getViewVisibility(arg0 == null ? null : arg0.unwrap());
    }

    public int getViewX(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        return real.getViewX(arg0 == null ? null : arg0.unwrap());
    }

    public int getViewY(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        return real.getViewY(arg0 == null ? null : arg0.unwrap());
    }

}
