// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class StateListAnimator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StateListAnimator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.StateListAnimator wrap(android.animation.StateListAnimator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.StateListAnimator(real, (__DcgwBridgeToken) null);
    }

    public android.animation.StateListAnimator getReal() {
        return (android.animation.StateListAnimator) real;
    }

    public android.animation.StateListAnimator unwrap() {
        return getReal();
    }

    public StateListAnimator() {
        this(new android.animation.StateListAnimator(), (__DcgwBridgeToken) null);
    }

    public void addState(int[] arg0, com.micklab.dcg.wrapper.android.animation.Animator arg1) {
        ((android.animation.StateListAnimator) real).addState(arg0, arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.animation.StateListAnimator clone() {
        return com.micklab.dcg.wrapper.android.animation.StateListAnimator.wrap(((android.animation.StateListAnimator) real).clone());
    }

    public void jumpToCurrentState() {
        ((android.animation.StateListAnimator) real).jumpToCurrentState();
    }

}
