// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.window;

public final class SplashScreen {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SplashScreen(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.window.SplashScreen wrap(android.window.SplashScreen real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.window.SplashScreen(real, (__DcgwBridgeToken) null);
    }

    public android.window.SplashScreen getReal() {
        return (android.window.SplashScreen) real;
    }

    public android.window.SplashScreen unwrap() {
        return getReal();
    }

    public void clearOnExitAnimationListener() {
        ((android.window.SplashScreen) real).clearOnExitAnimationListener();
    }

    public void setOnExitAnimationListener(com.micklab.dcg.wrapper.android.window.SplashScreen.OnExitAnimationListener arg0) {
        ((android.window.SplashScreen) real).setOnExitAnimationListener(arg0 == null ? null : arg0.getReal());
    }

    public void setSplashScreenTheme(int arg0) {
        ((android.window.SplashScreen) real).setSplashScreenTheme(arg0);
    }

    public static final int SPLASH_SCREEN_STYLE_ICON = android.window.SplashScreen.SPLASH_SCREEN_STYLE_ICON;
    public static final int SPLASH_SCREEN_STYLE_SOLID_COLOR = android.window.SplashScreen.SPLASH_SCREEN_STYLE_SOLID_COLOR;

    public static final class OnExitAnimationListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnExitAnimationListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.window.SplashScreen.OnExitAnimationListener wrap(android.window.SplashScreen.OnExitAnimationListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.window.SplashScreen.OnExitAnimationListener(real, (__DcgwBridgeToken) null);
        }

        public android.window.SplashScreen.OnExitAnimationListener getReal() {
            return (android.window.SplashScreen.OnExitAnimationListener) real;
        }

        public android.window.SplashScreen.OnExitAnimationListener unwrap() {
            return getReal();
        }

        public void onSplashScreenExit(com.micklab.dcg.wrapper.android.window.SplashScreenView arg0) {
            ((android.window.SplashScreen.OnExitAnimationListener) real).onSplashScreenExit(arg0 == null ? null : arg0.getReal());
        }

    }
}
