// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class UiModeManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UiModeManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.UiModeManager wrap(android.app.UiModeManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.UiModeManager(real, (__DcgwBridgeToken) null);
    }

    public android.app.UiModeManager getReal() {
        return (android.app.UiModeManager) real;
    }

    public android.app.UiModeManager unwrap() {
        return getReal();
    }

    public void addContrastChangeListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.app.UiModeManager.ContrastChangeListener arg1) {
        ((android.app.UiModeManager) real).addContrastChangeListener(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void disableCarMode(int arg0) {
        ((android.app.UiModeManager) real).disableCarMode(arg0);
    }

    public void enableCarMode(int arg0) {
        ((android.app.UiModeManager) real).enableCarMode(arg0);
    }

    public float getContrast() {
        return ((android.app.UiModeManager) real).getContrast();
    }

    public int getCurrentModeType() {
        return ((android.app.UiModeManager) real).getCurrentModeType();
    }

    public java.time.LocalTime getCustomNightModeEnd() {
        return ((android.app.UiModeManager) real).getCustomNightModeEnd();
    }

    public java.time.LocalTime getCustomNightModeStart() {
        return ((android.app.UiModeManager) real).getCustomNightModeStart();
    }

    public int getNightMode() {
        return ((android.app.UiModeManager) real).getNightMode();
    }

    public void removeContrastChangeListener(com.micklab.dcg.wrapper.android.app.UiModeManager.ContrastChangeListener arg0) {
        ((android.app.UiModeManager) real).removeContrastChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void setApplicationNightMode(int arg0) {
        ((android.app.UiModeManager) real).setApplicationNightMode(arg0);
    }

    public void setCustomNightModeEnd(java.time.LocalTime arg0) {
        ((android.app.UiModeManager) real).setCustomNightModeEnd(arg0);
    }

    public void setCustomNightModeStart(java.time.LocalTime arg0) {
        ((android.app.UiModeManager) real).setCustomNightModeStart(arg0);
    }

    public void setNightMode(int arg0) {
        ((android.app.UiModeManager) real).setNightMode(arg0);
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ContrastChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.UiModeManager.ContrastChangeListener wrap(android.app.UiModeManager.ContrastChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.UiModeManager.ContrastChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.app.UiModeManager.ContrastChangeListener getReal() {
            return (android.app.UiModeManager.ContrastChangeListener) real;
        }

        public android.app.UiModeManager.ContrastChangeListener unwrap() {
            return getReal();
        }

        public void onContrastChanged(float arg0) {
            ((android.app.UiModeManager.ContrastChangeListener) real).onContrastChanged(arg0);
        }

    }
}
