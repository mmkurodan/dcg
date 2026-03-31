// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.display;

public final class DisplayManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DisplayManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.display.DisplayManager wrap(android.hardware.display.DisplayManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.display.DisplayManager(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.display.DisplayManager getReal() {
        return (android.hardware.display.DisplayManager) real;
    }

    public android.hardware.display.DisplayManager unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay createVirtualDisplay(com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig arg0) {
        return com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay.wrap(((android.hardware.display.DisplayManager) real).createVirtualDisplay(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay createVirtualDisplay(com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplayConfig arg0, com.micklab.dcg.wrapper.android.os.Handler arg1, com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay.Callback arg2) {
        return com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay.wrap(((android.hardware.display.DisplayManager) real).createVirtualDisplay(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay createVirtualDisplay(java.lang.String arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.view.Surface arg4, int arg5) {
        return com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay.wrap(((android.hardware.display.DisplayManager) real).createVirtualDisplay(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal(), arg5));
    }

    public com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay createVirtualDisplay(java.lang.String arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.view.Surface arg4, int arg5, com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay.Callback arg6, com.micklab.dcg.wrapper.android.os.Handler arg7) {
        return com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay.wrap(((android.hardware.display.DisplayManager) real).createVirtualDisplay(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.getReal(), arg5, arg6 == null ? null : arg6.getReal(), arg7 == null ? null : arg7.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.Display getDisplay(int arg0) {
        return com.micklab.dcg.wrapper.android.view.Display.wrap(((android.hardware.display.DisplayManager) real).getDisplay(arg0));
    }

    public android.view.Display[] getDisplays() {
        return ((android.hardware.display.DisplayManager) real).getDisplays();
    }

    public android.view.Display[] getDisplays(java.lang.String arg0) {
        return ((android.hardware.display.DisplayManager) real).getDisplays(arg0);
    }

    public com.micklab.dcg.wrapper.android.hardware.display.HdrConversionMode getHdrConversionMode() {
        return com.micklab.dcg.wrapper.android.hardware.display.HdrConversionMode.wrap(((android.hardware.display.DisplayManager) real).getHdrConversionMode());
    }

    public int getMatchContentFrameRateUserPreference() {
        return ((android.hardware.display.DisplayManager) real).getMatchContentFrameRateUserPreference();
    }

    public void registerDisplayListener(com.micklab.dcg.wrapper.android.hardware.display.DisplayManager.DisplayListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.hardware.display.DisplayManager) real).registerDisplayListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void registerDisplayListener(java.util.concurrent.Executor arg0, long arg1, com.micklab.dcg.wrapper.android.hardware.display.DisplayManager.DisplayListener arg2) {
        ((android.hardware.display.DisplayManager) real).registerDisplayListener(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void unregisterDisplayListener(com.micklab.dcg.wrapper.android.hardware.display.DisplayManager.DisplayListener arg0) {
        ((android.hardware.display.DisplayManager) real).unregisterDisplayListener(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String DISPLAY_CATEGORY_PRESENTATION = android.hardware.display.DisplayManager.DISPLAY_CATEGORY_PRESENTATION;
    public static final long EVENT_TYPE_DISPLAY_ADDED = android.hardware.display.DisplayManager.EVENT_TYPE_DISPLAY_ADDED;
    public static final long EVENT_TYPE_DISPLAY_CHANGED = android.hardware.display.DisplayManager.EVENT_TYPE_DISPLAY_CHANGED;
    public static final long EVENT_TYPE_DISPLAY_REFRESH_RATE = android.hardware.display.DisplayManager.EVENT_TYPE_DISPLAY_REFRESH_RATE;
    public static final long EVENT_TYPE_DISPLAY_REMOVED = android.hardware.display.DisplayManager.EVENT_TYPE_DISPLAY_REMOVED;
    public static final long EVENT_TYPE_DISPLAY_STATE = android.hardware.display.DisplayManager.EVENT_TYPE_DISPLAY_STATE;
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private DisplayListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.display.DisplayManager.DisplayListener wrap(android.hardware.display.DisplayManager.DisplayListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.display.DisplayManager.DisplayListener(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.display.DisplayManager.DisplayListener getReal() {
            return (android.hardware.display.DisplayManager.DisplayListener) real;
        }

        public android.hardware.display.DisplayManager.DisplayListener unwrap() {
            return getReal();
        }

        public void onDisplayAdded(int arg0) {
            ((android.hardware.display.DisplayManager.DisplayListener) real).onDisplayAdded(arg0);
        }

        public void onDisplayChanged(int arg0) {
            ((android.hardware.display.DisplayManager.DisplayListener) real).onDisplayChanged(arg0);
        }

        public void onDisplayRemoved(int arg0) {
            ((android.hardware.display.DisplayManager.DisplayListener) real).onDisplayRemoved(arg0);
        }

    }
}
