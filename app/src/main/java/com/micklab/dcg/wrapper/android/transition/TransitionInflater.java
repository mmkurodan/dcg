// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class TransitionInflater {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TransitionInflater(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.TransitionInflater wrap(android.transition.TransitionInflater real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.TransitionInflater(real, (__DcgwBridgeToken) null);
    }

    public android.transition.TransitionInflater getReal() {
        return (android.transition.TransitionInflater) real;
    }

    public android.transition.TransitionInflater unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.transition.TransitionInflater from(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.transition.TransitionInflater.wrap(android.transition.TransitionInflater.from(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition inflateTransition(int arg0) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.transition.TransitionInflater) real).inflateTransition(arg0));
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionManager inflateTransitionManager(int arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1) {
        return com.micklab.dcg.wrapper.android.transition.TransitionManager.wrap(((android.transition.TransitionInflater) real).inflateTransitionManager(arg0, arg1 == null ? null : arg1.getReal()));
    }

}
