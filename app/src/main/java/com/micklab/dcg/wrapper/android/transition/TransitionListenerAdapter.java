// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class TransitionListenerAdapter {
    private final android.transition.TransitionListenerAdapter real;

    public TransitionListenerAdapter(android.transition.TransitionListenerAdapter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.TransitionListenerAdapter wrap(android.transition.TransitionListenerAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.TransitionListenerAdapter(real);
    }

    public android.transition.TransitionListenerAdapter unwrap() {
        return real;
    }

    public void onTransitionCancel(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        real.onTransitionCancel(arg0 == null ? null : arg0.unwrap());
    }

    public void onTransitionEnd(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        real.onTransitionEnd(arg0 == null ? null : arg0.unwrap());
    }

    public void onTransitionPause(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        real.onTransitionPause(arg0 == null ? null : arg0.unwrap());
    }

    public void onTransitionResume(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        real.onTransitionResume(arg0 == null ? null : arg0.unwrap());
    }

    public void onTransitionStart(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        real.onTransitionStart(arg0 == null ? null : arg0.unwrap());
    }

}
