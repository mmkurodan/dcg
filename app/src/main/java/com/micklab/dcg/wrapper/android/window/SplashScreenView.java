// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.window;

public final class SplashScreenView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SplashScreenView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.window.SplashScreenView wrap(android.window.SplashScreenView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.window.SplashScreenView(real, (__DcgwBridgeToken) null);
    }

    public android.window.SplashScreenView getReal() {
        return (android.window.SplashScreenView) real;
    }

    public android.window.SplashScreenView unwrap() {
        return getReal();
    }

    public java.time.Duration getIconAnimationDuration() {
        return ((android.window.SplashScreenView) real).getIconAnimationDuration();
    }

    public java.time.Instant getIconAnimationStart() {
        return ((android.window.SplashScreenView) real).getIconAnimationStart();
    }

    public com.micklab.dcg.wrapper.android.view.View getIconView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.window.SplashScreenView) real).getIconView());
    }

    public void remove() {
        ((android.window.SplashScreenView) real).remove();
    }

    public void setAlpha(float arg0) {
        ((android.window.SplashScreenView) real).setAlpha(arg0);
    }

}
