// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.window;

public final class SplashScreen {
    private final android.window.SplashScreen real;

    public SplashScreen(android.window.SplashScreen real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.window.SplashScreen wrap(android.window.SplashScreen real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.window.SplashScreen(real);
    }

    public android.window.SplashScreen unwrap() {
        return real;
    }

    public void clearOnExitAnimationListener() {
        real.clearOnExitAnimationListener();
    }

    public void setOnExitAnimationListener(com.micklab.dcg.wrapper.android.window.SplashScreen.OnExitAnimationListener arg0) {
        real.setOnExitAnimationListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setSplashScreenTheme(int arg0) {
        real.setSplashScreenTheme(arg0);
    }

    public static final int SPLASH_SCREEN_STYLE_ICON = android.window.SplashScreen.SPLASH_SCREEN_STYLE_ICON;
    public static final int SPLASH_SCREEN_STYLE_SOLID_COLOR = android.window.SplashScreen.SPLASH_SCREEN_STYLE_SOLID_COLOR;

    public static final class OnExitAnimationListener {
        private final android.window.SplashScreen.OnExitAnimationListener real;

        public OnExitAnimationListener(android.window.SplashScreen.OnExitAnimationListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.window.SplashScreen.OnExitAnimationListener wrap(android.window.SplashScreen.OnExitAnimationListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.window.SplashScreen.OnExitAnimationListener(real);
        }

        public android.window.SplashScreen.OnExitAnimationListener unwrap() {
            return real;
        }

        public void onSplashScreenExit(com.micklab.dcg.wrapper.android.window.SplashScreenView arg0) {
            real.onSplashScreenExit(arg0 == null ? null : arg0.unwrap());
        }

    }
}
