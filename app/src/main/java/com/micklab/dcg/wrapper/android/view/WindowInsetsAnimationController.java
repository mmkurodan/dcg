// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class WindowInsetsAnimationController {
    private final android.view.WindowInsetsAnimationController real;

    public WindowInsetsAnimationController(android.view.WindowInsetsAnimationController real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.WindowInsetsAnimationController wrap(android.view.WindowInsetsAnimationController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowInsetsAnimationController(real);
    }

    public android.view.WindowInsetsAnimationController unwrap() {
        return real;
    }

    public void finish(boolean arg0) {
        real.finish(arg0);
    }

    public float getCurrentAlpha() {
        return real.getCurrentAlpha();
    }

    public float getCurrentFraction() {
        return real.getCurrentFraction();
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getCurrentInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(real.getCurrentInsets());
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getHiddenStateInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(real.getHiddenStateInsets());
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getShownStateInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(real.getShownStateInsets());
    }

    public int getTypes() {
        return real.getTypes();
    }

    public boolean isCancelled() {
        return real.isCancelled();
    }

    public boolean isFinished() {
        return real.isFinished();
    }

    public boolean isReady() {
        return real.isReady();
    }

    public void setInsetsAndAlpha(com.micklab.dcg.wrapper.android.graphics.Insets arg0, float arg1, float arg2) {
        real.setInsetsAndAlpha(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

}
