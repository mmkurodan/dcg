// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class TransitionManager {
    private final android.transition.TransitionManager real;

    public TransitionManager(android.transition.TransitionManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.TransitionManager wrap(android.transition.TransitionManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.TransitionManager(real);
    }

    public android.transition.TransitionManager unwrap() {
        return real;
    }

    public TransitionManager() {
        this(new android.transition.TransitionManager());
    }

    public static void beginDelayedTransition(com.micklab.dcg.wrapper.android.view.ViewGroup arg0) {
        android.transition.TransitionManager.beginDelayedTransition(arg0 == null ? null : arg0.unwrap());
    }

    public static void beginDelayedTransition(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.transition.Transition arg1) {
        android.transition.TransitionManager.beginDelayedTransition(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static void endTransitions(com.micklab.dcg.wrapper.android.view.ViewGroup arg0) {
        android.transition.TransitionManager.endTransitions(arg0 == null ? null : arg0.unwrap());
    }

    public static void go(com.micklab.dcg.wrapper.android.transition.Scene arg0) {
        android.transition.TransitionManager.go(arg0 == null ? null : arg0.unwrap());
    }

    public static void go(com.micklab.dcg.wrapper.android.transition.Scene arg0, com.micklab.dcg.wrapper.android.transition.Transition arg1) {
        android.transition.TransitionManager.go(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setTransition(com.micklab.dcg.wrapper.android.transition.Scene arg0, com.micklab.dcg.wrapper.android.transition.Transition arg1) {
        real.setTransition(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setTransition(com.micklab.dcg.wrapper.android.transition.Scene arg0, com.micklab.dcg.wrapper.android.transition.Scene arg1, com.micklab.dcg.wrapper.android.transition.Transition arg2) {
        real.setTransition(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void transitionTo(com.micklab.dcg.wrapper.android.transition.Scene arg0) {
        real.transitionTo(arg0 == null ? null : arg0.unwrap());
    }

}
