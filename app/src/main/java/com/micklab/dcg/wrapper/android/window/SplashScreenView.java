// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.window;

public final class SplashScreenView {
    private final android.window.SplashScreenView real;

    public SplashScreenView(android.window.SplashScreenView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.window.SplashScreenView wrap(android.window.SplashScreenView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.window.SplashScreenView(real);
    }

    public android.window.SplashScreenView unwrap() {
        return real;
    }

    public java.time.Duration getIconAnimationDuration() {
        return real.getIconAnimationDuration();
    }

    public java.time.Instant getIconAnimationStart() {
        return real.getIconAnimationStart();
    }

    public com.micklab.dcg.wrapper.android.view.View getIconView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getIconView());
    }

    public void remove() {
        real.remove();
    }

    public void setAlpha(float arg0) {
        real.setAlpha(arg0);
    }

}
