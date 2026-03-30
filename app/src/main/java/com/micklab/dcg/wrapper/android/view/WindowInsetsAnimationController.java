// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class WindowInsetsAnimationController {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WindowInsetsAnimationController(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.WindowInsetsAnimationController wrap(android.view.WindowInsetsAnimationController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowInsetsAnimationController(real, (__DcgwBridgeToken) null);
    }

    public android.view.WindowInsetsAnimationController getReal() {
        return (android.view.WindowInsetsAnimationController) real;
    }

    public android.view.WindowInsetsAnimationController unwrap() {
        return getReal();
    }

    public void finish(boolean arg0) {
        ((android.view.WindowInsetsAnimationController) real).finish(arg0);
    }

    public float getCurrentAlpha() {
        return ((android.view.WindowInsetsAnimationController) real).getCurrentAlpha();
    }

    public float getCurrentFraction() {
        return ((android.view.WindowInsetsAnimationController) real).getCurrentFraction();
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getCurrentInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(((android.view.WindowInsetsAnimationController) real).getCurrentInsets());
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getHiddenStateInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(((android.view.WindowInsetsAnimationController) real).getHiddenStateInsets());
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getShownStateInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(((android.view.WindowInsetsAnimationController) real).getShownStateInsets());
    }

    public int getTypes() {
        return ((android.view.WindowInsetsAnimationController) real).getTypes();
    }

    public boolean isCancelled() {
        return ((android.view.WindowInsetsAnimationController) real).isCancelled();
    }

    public boolean isFinished() {
        return ((android.view.WindowInsetsAnimationController) real).isFinished();
    }

    public boolean isReady() {
        return ((android.view.WindowInsetsAnimationController) real).isReady();
    }

    public void setInsetsAndAlpha(com.micklab.dcg.wrapper.android.graphics.Insets arg0, float arg1, float arg2) {
        ((android.view.WindowInsetsAnimationController) real).setInsetsAndAlpha(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

}
