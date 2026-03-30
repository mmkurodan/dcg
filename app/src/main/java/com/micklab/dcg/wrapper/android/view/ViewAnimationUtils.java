// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ViewAnimationUtils {
    private final android.view.ViewAnimationUtils real;

    public ViewAnimationUtils(android.view.ViewAnimationUtils real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ViewAnimationUtils wrap(android.view.ViewAnimationUtils real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewAnimationUtils(real);
    }

    public android.view.ViewAnimationUtils unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.animation.Animator createCircularReveal(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, float arg3, float arg4) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(android.view.ViewAnimationUtils.createCircularReveal(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4));
    }

}
