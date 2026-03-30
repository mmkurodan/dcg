// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class VisibilityPropagation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VisibilityPropagation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.VisibilityPropagation wrap(android.transition.VisibilityPropagation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.VisibilityPropagation(real, (__DcgwBridgeToken) null);
    }

    public android.transition.VisibilityPropagation getReal() {
        return (android.transition.VisibilityPropagation) real;
    }

    public android.transition.VisibilityPropagation unwrap() {
        return getReal();
    }

    public void captureValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        ((android.transition.VisibilityPropagation) real).captureValues(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String[] getPropagationProperties() {
        return ((android.transition.VisibilityPropagation) real).getPropagationProperties();
    }

    public int getViewVisibility(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        return ((android.transition.VisibilityPropagation) real).getViewVisibility(arg0 == null ? null : arg0.getReal());
    }

    public int getViewX(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        return ((android.transition.VisibilityPropagation) real).getViewX(arg0 == null ? null : arg0.getReal());
    }

    public int getViewY(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        return ((android.transition.VisibilityPropagation) real).getViewY(arg0 == null ? null : arg0.getReal());
    }

}
