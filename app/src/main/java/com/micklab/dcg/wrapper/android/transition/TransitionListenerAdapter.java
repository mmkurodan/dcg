// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class TransitionListenerAdapter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TransitionListenerAdapter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.TransitionListenerAdapter wrap(android.transition.TransitionListenerAdapter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.TransitionListenerAdapter(real, (__DcgwBridgeToken) null);
    }

    public android.transition.TransitionListenerAdapter getReal() {
        return (android.transition.TransitionListenerAdapter) real;
    }

    public android.transition.TransitionListenerAdapter unwrap() {
        return getReal();
    }

    public void onTransitionCancel(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        ((android.transition.TransitionListenerAdapter) real).onTransitionCancel(arg0 == null ? null : arg0.getReal());
    }

    public void onTransitionEnd(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        ((android.transition.TransitionListenerAdapter) real).onTransitionEnd(arg0 == null ? null : arg0.getReal());
    }

    public void onTransitionPause(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        ((android.transition.TransitionListenerAdapter) real).onTransitionPause(arg0 == null ? null : arg0.getReal());
    }

    public void onTransitionResume(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        ((android.transition.TransitionListenerAdapter) real).onTransitionResume(arg0 == null ? null : arg0.getReal());
    }

    public void onTransitionStart(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
        ((android.transition.TransitionListenerAdapter) real).onTransitionStart(arg0 == null ? null : arg0.getReal());
    }

}
