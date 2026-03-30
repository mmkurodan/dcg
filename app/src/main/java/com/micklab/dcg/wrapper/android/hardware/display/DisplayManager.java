// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.display;

public final class DisplayManager {
    private final android.hardware.display.DisplayManager real;

    public DisplayManager(android.hardware.display.DisplayManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.display.DisplayManager wrap(android.hardware.display.DisplayManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.display.DisplayManager(real);
    }

    public android.hardware.display.DisplayManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay createVirtualDisplay(com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig arg0) {
        return com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay.wrap(real.createVirtualDisplay(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay createVirtualDisplay(com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig arg0, com.micklab.dcg.wrapper.android.os.Handler arg1, com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay.Callback arg2) {
        return com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay.wrap(real.createVirtualDisplay(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay createVirtualDisplay(java.lang.String arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.view.Surface arg4, int arg5) {
        return com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay.wrap(real.createVirtualDisplay(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap(), arg5));
    }

    public com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay createVirtualDisplay(java.lang.String arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.view.Surface arg4, int arg5, com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay.Callback arg6, com.micklab.dcg.wrapper.android.os.Handler arg7) {
        return com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay.wrap(real.createVirtualDisplay(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap(), arg5, arg6 == null ? null : arg6.unwrap(), arg7 == null ? null : arg7.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.Display getDisplay(int arg0) {
        return com.micklab.dcg.wrapper.android.view.Display.wrap(real.getDisplay(arg0));
    }

    public android.view.Display[] getDisplays() {
        return real.getDisplays();
    }

    public android.view.Display[] getDisplays(java.lang.String arg0) {
        return real.getDisplays(arg0);
    }

    public com.micklab.dcg.wrapper.android.hardware.display.HdrConversionMode getHdrConversionMode() {
        return com.micklab.dcg.wrapper.android.hardware.display.HdrConversionMode.wrap(real.getHdrConversionMode());
    }

    public int getMatchContentFrameRateUserPreference() {
        return real.getMatchContentFrameRateUserPreference();
    }

    public void registerDisplayListener(com.micklab.dcg.wrapper.android.hardware.display.DisplayManager.DisplayListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.registerDisplayListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void unregisterDisplayListener(com.micklab.dcg.wrapper.android.hardware.display.DisplayManager.DisplayListener arg0) {
        real.unregisterDisplayListener(arg0 == null ? null : arg0.unwrap());
    }

    public static final java.lang.String DISPLAY_CATEGORY_PRESENTATION = android.hardware.display.DisplayManager.DISPLAY_CATEGORY_PRESENTATION;
    public static final int MATCH_CONTENT_FRAMERATE_ALWAYS = android.hardware.display.DisplayManager.MATCH_CONTENT_FRAMERATE_ALWAYS;
    public static final int MATCH_CONTENT_FRAMERATE_NEVER = android.hardware.display.DisplayManager.MATCH_CONTENT_FRAMERATE_NEVER;
    public static final int MATCH_CONTENT_FRAMERATE_SEAMLESSS_ONLY = android.hardware.display.DisplayManager.MATCH_CONTENT_FRAMERATE_SEAMLESSS_ONLY;
    public static final int MATCH_CONTENT_FRAMERATE_UNKNOWN = android.hardware.display.DisplayManager.MATCH_CONTENT_FRAMERATE_UNKNOWN;
    public static final int VIRTUAL_DISPLAY_FLAG_AUTO_MIRROR = android.hardware.display.DisplayManager.VIRTUAL_DISPLAY_FLAG_AUTO_MIRROR;
    public static final int VIRTUAL_DISPLAY_FLAG_OWN_CONTENT_ONLY = android.hardware.display.DisplayManager.VIRTUAL_DISPLAY_FLAG_OWN_CONTENT_ONLY;
    public static final int VIRTUAL_DISPLAY_FLAG_PRESENTATION = android.hardware.display.DisplayManager.VIRTUAL_DISPLAY_FLAG_PRESENTATION;
    public static final int VIRTUAL_DISPLAY_FLAG_PUBLIC = android.hardware.display.DisplayManager.VIRTUAL_DISPLAY_FLAG_PUBLIC;
    public static final int VIRTUAL_DISPLAY_FLAG_SECURE = android.hardware.display.DisplayManager.VIRTUAL_DISPLAY_FLAG_SECURE;

    public static final class DisplayListener {
        private final android.hardware.display.DisplayManager.DisplayListener real;

        public DisplayListener(android.hardware.display.DisplayManager.DisplayListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.display.DisplayManager.DisplayListener wrap(android.hardware.display.DisplayManager.DisplayListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.display.DisplayManager.DisplayListener(real);
        }

        public android.hardware.display.DisplayManager.DisplayListener unwrap() {
            return real;
        }

        public void onDisplayAdded(int arg0) {
            real.onDisplayAdded(arg0);
        }

        public void onDisplayChanged(int arg0) {
            real.onDisplayChanged(arg0);
        }

        public void onDisplayRemoved(int arg0) {
            real.onDisplayRemoved(arg0);
        }

    }
}
