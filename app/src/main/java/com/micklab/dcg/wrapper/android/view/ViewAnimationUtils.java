// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ViewAnimationUtils {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ViewAnimationUtils(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ViewAnimationUtils wrap(android.view.ViewAnimationUtils real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewAnimationUtils(real, (__DcgwBridgeToken) null);
    }

    public android.view.ViewAnimationUtils getReal() {
        return (android.view.ViewAnimationUtils) real;
    }

    public android.view.ViewAnimationUtils unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.animation.Animator createCircularReveal(com.micklab.dcg.wrapper.android.view.View arg0, int arg1, int arg2, float arg3, float arg4) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(android.view.ViewAnimationUtils.createCircularReveal(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4));
    }

}
