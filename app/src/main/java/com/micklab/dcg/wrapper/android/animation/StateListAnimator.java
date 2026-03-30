// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class StateListAnimator {
    private final android.animation.StateListAnimator real;

    public StateListAnimator(android.animation.StateListAnimator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.StateListAnimator wrap(android.animation.StateListAnimator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.StateListAnimator(real);
    }

    public android.animation.StateListAnimator unwrap() {
        return real;
    }

    public StateListAnimator() {
        this(new android.animation.StateListAnimator());
    }

    public void addState(int[] arg0, com.micklab.dcg.wrapper.android.animation.Animator arg1) {
        real.addState(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.animation.StateListAnimator clone() {
        return com.micklab.dcg.wrapper.android.animation.StateListAnimator.wrap(real.clone());
    }

    public void jumpToCurrentState() {
        real.jumpToCurrentState();
    }

}
