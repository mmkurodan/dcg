// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class TransitionManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TransitionManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.TransitionManager wrap(android.transition.TransitionManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.TransitionManager(real, (__DcgwBridgeToken) null);
    }

    public android.transition.TransitionManager getReal() {
        return (android.transition.TransitionManager) real;
    }

    public android.transition.TransitionManager unwrap() {
        return getReal();
    }

    public TransitionManager() {
        this(new android.transition.TransitionManager(), (__DcgwBridgeToken) null);
    }

    public static void beginDelayedTransition(com.micklab.dcg.wrapper.android.view.ViewGroup arg0) {
        android.transition.TransitionManager.beginDelayedTransition(arg0 == null ? null : arg0.getReal());
    }

    public static void beginDelayedTransition(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.transition.Transition arg1) {
        android.transition.TransitionManager.beginDelayedTransition(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public static void endTransitions(com.micklab.dcg.wrapper.android.view.ViewGroup arg0) {
        android.transition.TransitionManager.endTransitions(arg0 == null ? null : arg0.getReal());
    }

    public static void go(com.micklab.dcg.wrapper.android.transition.Scene arg0) {
        android.transition.TransitionManager.go(arg0 == null ? null : arg0.getReal());
    }

    public static void go(com.micklab.dcg.wrapper.android.transition.Scene arg0, com.micklab.dcg.wrapper.android.transition.Transition arg1) {
        android.transition.TransitionManager.go(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setTransition(com.micklab.dcg.wrapper.android.transition.Scene arg0, com.micklab.dcg.wrapper.android.transition.Transition arg1) {
        ((android.transition.TransitionManager) real).setTransition(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setTransition(com.micklab.dcg.wrapper.android.transition.Scene arg0, com.micklab.dcg.wrapper.android.transition.Scene arg1, com.micklab.dcg.wrapper.android.transition.Transition arg2) {
        ((android.transition.TransitionManager) real).setTransition(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void transitionTo(com.micklab.dcg.wrapper.android.transition.Scene arg0) {
        ((android.transition.TransitionManager) real).transitionTo(arg0 == null ? null : arg0.getReal());
    }

}
