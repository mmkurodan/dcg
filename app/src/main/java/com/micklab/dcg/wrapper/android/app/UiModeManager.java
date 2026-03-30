// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class UiModeManager {
    private final android.app.UiModeManager real;

    public UiModeManager(android.app.UiModeManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.UiModeManager wrap(android.app.UiModeManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.UiModeManager(real);
    }

    public android.app.UiModeManager unwrap() {
        return real;
    }

    public void addContrastChangeListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.app.UiModeManager.ContrastChangeListener arg1) {
        real.addContrastChangeListener(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void disableCarMode(int arg0) {
        real.disableCarMode(arg0);
    }

    public void enableCarMode(int arg0) {
        real.enableCarMode(arg0);
    }

    public float getContrast() {
        return real.getContrast();
    }

    public int getCurrentModeType() {
        return real.getCurrentModeType();
    }

    public java.time.LocalTime getCustomNightModeEnd() {
        return real.getCustomNightModeEnd();
    }

    public java.time.LocalTime getCustomNightModeStart() {
        return real.getCustomNightModeStart();
    }

    public int getNightMode() {
        return real.getNightMode();
    }

    public void removeContrastChangeListener(com.micklab.dcg.wrapper.android.app.UiModeManager.ContrastChangeListener arg0) {
        real.removeContrastChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setApplicationNightMode(int arg0) {
        real.setApplicationNightMode(arg0);
    }

    public void setCustomNightModeEnd(java.time.LocalTime arg0) {
        real.setCustomNightModeEnd(arg0);
    }

    public void setCustomNightModeStart(java.time.LocalTime arg0) {
        real.setCustomNightModeStart(arg0);
    }

    public void setNightMode(int arg0) {
        real.setNightMode(arg0);
    }

    public static final java.lang.String ACTION_ENTER_CAR_MODE = android.app.UiModeManager.ACTION_ENTER_CAR_MODE;
    public static final java.lang.String ACTION_ENTER_DESK_MODE = android.app.UiModeManager.ACTION_ENTER_DESK_MODE;
    public static final java.lang.String ACTION_EXIT_CAR_MODE = android.app.UiModeManager.ACTION_EXIT_CAR_MODE;
    public static final java.lang.String ACTION_EXIT_DESK_MODE = android.app.UiModeManager.ACTION_EXIT_DESK_MODE;
    public static final int DISABLE_CAR_MODE_GO_HOME = android.app.UiModeManager.DISABLE_CAR_MODE_GO_HOME;
    public static final int ENABLE_CAR_MODE_ALLOW_SLEEP = android.app.UiModeManager.ENABLE_CAR_MODE_ALLOW_SLEEP;
    public static final int ENABLE_CAR_MODE_GO_CAR_HOME = android.app.UiModeManager.ENABLE_CAR_MODE_GO_CAR_HOME;
    public static final int MODE_NIGHT_AUTO = android.app.UiModeManager.MODE_NIGHT_AUTO;
    public static final int MODE_NIGHT_CUSTOM = android.app.UiModeManager.MODE_NIGHT_CUSTOM;
    public static final int MODE_NIGHT_NO = android.app.UiModeManager.MODE_NIGHT_NO;
    public static final int MODE_NIGHT_YES = android.app.UiModeManager.MODE_NIGHT_YES;

    public static final class ContrastChangeListener {
        private final android.app.UiModeManager.ContrastChangeListener real;

        public ContrastChangeListener(android.app.UiModeManager.ContrastChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.UiModeManager.ContrastChangeListener wrap(android.app.UiModeManager.ContrastChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.UiModeManager.ContrastChangeListener(real);
        }

        public android.app.UiModeManager.ContrastChangeListener unwrap() {
            return real;
        }

        public void onContrastChanged(float arg0) {
            real.onContrastChanged(arg0);
        }

    }
}
