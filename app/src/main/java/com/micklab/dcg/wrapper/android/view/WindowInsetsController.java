// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class WindowInsetsController {
    private final android.view.WindowInsetsController real;

    public WindowInsetsController(android.view.WindowInsetsController real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.WindowInsetsController wrap(android.view.WindowInsetsController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowInsetsController(real);
    }

    public android.view.WindowInsetsController unwrap() {
        return real;
    }

    public void addOnControllableInsetsChangedListener(com.micklab.dcg.wrapper.android.view.WindowInsetsController.OnControllableInsetsChangedListener arg0) {
        real.addOnControllableInsetsChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void controlWindowInsetsAnimation(int arg0, long arg1, com.micklab.dcg.wrapper.android.view.animation.Interpolator arg2, com.micklab.dcg.wrapper.android.os.CancellationSignal arg3, com.micklab.dcg.wrapper.android.view.WindowInsetsAnimationControlListener arg4) {
        real.controlWindowInsetsAnimation(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap());
    }

    public int getSystemBarsAppearance() {
        return real.getSystemBarsAppearance();
    }

    public int getSystemBarsBehavior() {
        return real.getSystemBarsBehavior();
    }

    public void hide(int arg0) {
        real.hide(arg0);
    }

    public void removeOnControllableInsetsChangedListener(com.micklab.dcg.wrapper.android.view.WindowInsetsController.OnControllableInsetsChangedListener arg0) {
        real.removeOnControllableInsetsChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setSystemBarsAppearance(int arg0, int arg1) {
        real.setSystemBarsAppearance(arg0, arg1);
    }

    public void setSystemBarsBehavior(int arg0) {
        real.setSystemBarsBehavior(arg0);
    }

    public void show(int arg0) {
        real.show(arg0);
    }

    public static final int APPEARANCE_LIGHT_CAPTION_BARS = android.view.WindowInsetsController.APPEARANCE_LIGHT_CAPTION_BARS;
    public static final int APPEARANCE_LIGHT_NAVIGATION_BARS = android.view.WindowInsetsController.APPEARANCE_LIGHT_NAVIGATION_BARS;
    public static final int APPEARANCE_LIGHT_STATUS_BARS = android.view.WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS;
    public static final int APPEARANCE_TRANSPARENT_CAPTION_BAR_BACKGROUND = android.view.WindowInsetsController.APPEARANCE_TRANSPARENT_CAPTION_BAR_BACKGROUND;
    public static final int BEHAVIOR_DEFAULT = android.view.WindowInsetsController.BEHAVIOR_DEFAULT;
    public static final int BEHAVIOR_SHOW_BARS_BY_SWIPE = android.view.WindowInsetsController.BEHAVIOR_SHOW_BARS_BY_SWIPE;
    public static final int BEHAVIOR_SHOW_BARS_BY_TOUCH = android.view.WindowInsetsController.BEHAVIOR_SHOW_BARS_BY_TOUCH;
    public static final int BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE = android.view.WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE;

    public static final class OnControllableInsetsChangedListener {
        private final android.view.WindowInsetsController.OnControllableInsetsChangedListener real;

        public OnControllableInsetsChangedListener(android.view.WindowInsetsController.OnControllableInsetsChangedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.WindowInsetsController.OnControllableInsetsChangedListener wrap(android.view.WindowInsetsController.OnControllableInsetsChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowInsetsController.OnControllableInsetsChangedListener(real);
        }

        public android.view.WindowInsetsController.OnControllableInsetsChangedListener unwrap() {
            return real;
        }

        public void onControllableInsetsChanged(com.micklab.dcg.wrapper.android.view.WindowInsetsController arg0, int arg1) {
            real.onControllableInsetsChanged(arg0 == null ? null : arg0.unwrap(), arg1);
        }

    }
}
