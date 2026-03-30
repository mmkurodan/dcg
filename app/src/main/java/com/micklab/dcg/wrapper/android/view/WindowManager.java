// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class WindowManager {
    private final android.view.WindowManager real;

    public WindowManager(android.view.WindowManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.WindowManager wrap(android.view.WindowManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowManager(real);
    }

    public android.view.WindowManager unwrap() {
        return real;
    }

    public void addProposedRotationListener(java.util.concurrent.Executor arg0, java.util.function.IntConsumer arg1) {
        real.addProposedRotationListener(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.WindowMetrics getCurrentWindowMetrics() {
        return com.micklab.dcg.wrapper.android.view.WindowMetrics.wrap(real.getCurrentWindowMetrics());
    }

    public com.micklab.dcg.wrapper.android.view.Display getDefaultDisplay() {
        return com.micklab.dcg.wrapper.android.view.Display.wrap(real.getDefaultDisplay());
    }

    public com.micklab.dcg.wrapper.android.view.WindowMetrics getMaximumWindowMetrics() {
        return com.micklab.dcg.wrapper.android.view.WindowMetrics.wrap(real.getMaximumWindowMetrics());
    }

    public boolean isCrossWindowBlurEnabled() {
        return real.isCrossWindowBlurEnabled();
    }

    public com.micklab.dcg.wrapper.android.window.InputTransferToken registerBatchedSurfaceControlInputReceiver(com.micklab.dcg.wrapper.android.window.InputTransferToken arg0, com.micklab.dcg.wrapper.android.view.SurfaceControl arg1, com.micklab.dcg.wrapper.android.view.Choreographer arg2, com.micklab.dcg.wrapper.android.view.SurfaceControlInputReceiver arg3) {
        return com.micklab.dcg.wrapper.android.window.InputTransferToken.wrap(real.registerBatchedSurfaceControlInputReceiver(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.window.InputTransferToken registerUnbatchedSurfaceControlInputReceiver(com.micklab.dcg.wrapper.android.window.InputTransferToken arg0, com.micklab.dcg.wrapper.android.view.SurfaceControl arg1, com.micklab.dcg.wrapper.android.os.Looper arg2, com.micklab.dcg.wrapper.android.view.SurfaceControlInputReceiver arg3) {
        return com.micklab.dcg.wrapper.android.window.InputTransferToken.wrap(real.registerUnbatchedSurfaceControlInputReceiver(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public void removeProposedRotationListener(java.util.function.IntConsumer arg0) {
        real.removeProposedRotationListener(arg0);
    }

    public void removeViewImmediate(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.removeViewImmediate(arg0 == null ? null : arg0.unwrap());
    }

    public boolean transferTouchGesture(com.micklab.dcg.wrapper.android.window.InputTransferToken arg0, com.micklab.dcg.wrapper.android.window.InputTransferToken arg1) {
        return real.transferTouchGesture(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void unregisterSurfaceControlInputReceiver(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0) {
        real.unregisterSurfaceControlInputReceiver(arg0 == null ? null : arg0.unwrap());
    }

    public static final int COMPAT_SMALL_COVER_SCREEN_OPT_IN = android.view.WindowManager.COMPAT_SMALL_COVER_SCREEN_OPT_IN;
    public static final java.lang.String PROPERTY_ACTIVITY_EMBEDDING_ALLOW_SYSTEM_OVERRIDE = android.view.WindowManager.PROPERTY_ACTIVITY_EMBEDDING_ALLOW_SYSTEM_OVERRIDE;
    public static final java.lang.String PROPERTY_ACTIVITY_EMBEDDING_SPLITS_ENABLED = android.view.WindowManager.PROPERTY_ACTIVITY_EMBEDDING_SPLITS_ENABLED;
    public static final java.lang.String PROPERTY_CAMERA_COMPAT_ALLOW_FORCE_ROTATION = android.view.WindowManager.PROPERTY_CAMERA_COMPAT_ALLOW_FORCE_ROTATION;
    public static final java.lang.String PROPERTY_CAMERA_COMPAT_ALLOW_REFRESH = android.view.WindowManager.PROPERTY_CAMERA_COMPAT_ALLOW_REFRESH;
    public static final java.lang.String PROPERTY_CAMERA_COMPAT_ENABLE_REFRESH_VIA_PAUSE = android.view.WindowManager.PROPERTY_CAMERA_COMPAT_ENABLE_REFRESH_VIA_PAUSE;
    public static final java.lang.String PROPERTY_COMPAT_ALLOW_DISPLAY_ORIENTATION_OVERRIDE = android.view.WindowManager.PROPERTY_COMPAT_ALLOW_DISPLAY_ORIENTATION_OVERRIDE;
    public static final java.lang.String PROPERTY_COMPAT_ALLOW_IGNORING_ORIENTATION_REQUEST_WHEN_LOOP_DETECTED = android.view.WindowManager.PROPERTY_COMPAT_ALLOW_IGNORING_ORIENTATION_REQUEST_WHEN_LOOP_DETECTED;
    public static final java.lang.String PROPERTY_COMPAT_ALLOW_MIN_ASPECT_RATIO_OVERRIDE = android.view.WindowManager.PROPERTY_COMPAT_ALLOW_MIN_ASPECT_RATIO_OVERRIDE;
    public static final java.lang.String PROPERTY_COMPAT_ALLOW_ORIENTATION_OVERRIDE = android.view.WindowManager.PROPERTY_COMPAT_ALLOW_ORIENTATION_OVERRIDE;
    public static final java.lang.String PROPERTY_COMPAT_ALLOW_RESIZEABLE_ACTIVITY_OVERRIDES = android.view.WindowManager.PROPERTY_COMPAT_ALLOW_RESIZEABLE_ACTIVITY_OVERRIDES;
    public static final java.lang.String PROPERTY_COMPAT_ALLOW_SANDBOXING_VIEW_BOUNDS_APIS = android.view.WindowManager.PROPERTY_COMPAT_ALLOW_SANDBOXING_VIEW_BOUNDS_APIS;
    public static final java.lang.String PROPERTY_COMPAT_ALLOW_SMALL_COVER_SCREEN = android.view.WindowManager.PROPERTY_COMPAT_ALLOW_SMALL_COVER_SCREEN;
    public static final java.lang.String PROPERTY_COMPAT_ALLOW_USER_ASPECT_RATIO_FULLSCREEN_OVERRIDE = android.view.WindowManager.PROPERTY_COMPAT_ALLOW_USER_ASPECT_RATIO_FULLSCREEN_OVERRIDE;
    public static final java.lang.String PROPERTY_COMPAT_ALLOW_USER_ASPECT_RATIO_OVERRIDE = android.view.WindowManager.PROPERTY_COMPAT_ALLOW_USER_ASPECT_RATIO_OVERRIDE;
    public static final java.lang.String PROPERTY_COMPAT_ENABLE_FAKE_FOCUS = android.view.WindowManager.PROPERTY_COMPAT_ENABLE_FAKE_FOCUS;
    public static final java.lang.String PROPERTY_COMPAT_IGNORE_REQUESTED_ORIENTATION = android.view.WindowManager.PROPERTY_COMPAT_IGNORE_REQUESTED_ORIENTATION;
    public static final java.lang.String PROPERTY_SUPPORTS_MULTI_INSTANCE_SYSTEM_UI = android.view.WindowManager.PROPERTY_SUPPORTS_MULTI_INSTANCE_SYSTEM_UI;
    public static final int SCREEN_RECORDING_STATE_NOT_VISIBLE = android.view.WindowManager.SCREEN_RECORDING_STATE_NOT_VISIBLE;
    public static final int SCREEN_RECORDING_STATE_VISIBLE = android.view.WindowManager.SCREEN_RECORDING_STATE_VISIBLE;

    public static final class BadTokenException {
        private final android.view.WindowManager.BadTokenException real;

        public BadTokenException(android.view.WindowManager.BadTokenException real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.WindowManager.BadTokenException wrap(android.view.WindowManager.BadTokenException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowManager.BadTokenException(real);
        }

        public android.view.WindowManager.BadTokenException unwrap() {
            return real;
        }

        public BadTokenException() {
            this(new android.view.WindowManager.BadTokenException());
        }

        public BadTokenException(java.lang.String arg0) {
            this(new android.view.WindowManager.BadTokenException(arg0));
        }

    }
    public static final class InvalidDisplayException {
        private final android.view.WindowManager.InvalidDisplayException real;

        public InvalidDisplayException(android.view.WindowManager.InvalidDisplayException real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.WindowManager.InvalidDisplayException wrap(android.view.WindowManager.InvalidDisplayException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowManager.InvalidDisplayException(real);
        }

        public android.view.WindowManager.InvalidDisplayException unwrap() {
            return real;
        }

        public InvalidDisplayException() {
            this(new android.view.WindowManager.InvalidDisplayException());
        }

        public InvalidDisplayException(java.lang.String arg0) {
            this(new android.view.WindowManager.InvalidDisplayException(arg0));
        }

    }
    public static final class LayoutParams {
        private final android.view.WindowManager.LayoutParams real;

        public LayoutParams(android.view.WindowManager.LayoutParams real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.WindowManager.LayoutParams wrap(android.view.WindowManager.LayoutParams real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowManager.LayoutParams(real);
        }

        public android.view.WindowManager.LayoutParams unwrap() {
            return real;
        }

        public LayoutParams() {
            this(new android.view.WindowManager.LayoutParams());
        }

        public LayoutParams(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
            this(new android.view.WindowManager.LayoutParams(arg0 == null ? null : arg0.unwrap()));
        }

        public LayoutParams(int arg0) {
            this(new android.view.WindowManager.LayoutParams(arg0));
        }

        public LayoutParams(int arg0, int arg1) {
            this(new android.view.WindowManager.LayoutParams(arg0, arg1));
        }

        public LayoutParams(int arg0, int arg1, int arg2) {
            this(new android.view.WindowManager.LayoutParams(arg0, arg1, arg2));
        }

        public LayoutParams(int arg0, int arg1, int arg2, int arg3, int arg4) {
            this(new android.view.WindowManager.LayoutParams(arg0, arg1, arg2, arg3, arg4));
        }

        public LayoutParams(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
            this(new android.view.WindowManager.LayoutParams(arg0, arg1, arg2, arg3, arg4, arg5, arg6));
        }

        public boolean areWallpaperTouchEventsEnabled() {
            return real.areWallpaperTouchEventsEnabled();
        }

        public boolean canPlayMoveAnimation() {
            return real.canPlayMoveAnimation();
        }

        public int copyFrom(com.micklab.dcg.wrapper.android.view.WindowManager.LayoutParams arg0) {
            return real.copyFrom(arg0 == null ? null : arg0.unwrap());
        }

        public java.lang.String debug(java.lang.String arg0) {
            return real.debug(arg0);
        }

        public int describeContents() {
            return real.describeContents();
        }

        public int getBlurBehindRadius() {
            return real.getBlurBehindRadius();
        }

        public int getColorMode() {
            return real.getColorMode();
        }

        public float getDesiredHdrHeadroom() {
            return real.getDesiredHdrHeadroom();
        }

        public int getFitInsetsSides() {
            return real.getFitInsetsSides();
        }

        public int getFitInsetsTypes() {
            return real.getFitInsetsTypes();
        }

        public boolean getFrameRateBoostOnTouchEnabled() {
            return real.getFrameRateBoostOnTouchEnabled();
        }

        public java.lang.CharSequence getTitle() {
            return real.getTitle();
        }

        public boolean isFitInsetsIgnoringVisibility() {
            return real.isFitInsetsIgnoringVisibility();
        }

        public boolean isFrameRatePowerSavingsBalanced() {
            return real.isFrameRatePowerSavingsBalanced();
        }

        public boolean isHdrConversionEnabled() {
            return real.isHdrConversionEnabled();
        }

        public static boolean mayUseInputMethod(int arg0) {
            return android.view.WindowManager.LayoutParams.mayUseInputMethod(arg0);
        }

        public void setBlurBehindRadius(int arg0) {
            real.setBlurBehindRadius(arg0);
        }

        public void setCanPlayMoveAnimation(boolean arg0) {
            real.setCanPlayMoveAnimation(arg0);
        }

        public void setColorMode(int arg0) {
            real.setColorMode(arg0);
        }

        public void setDesiredHdrHeadroom(float arg0) {
            real.setDesiredHdrHeadroom(arg0);
        }

        public void setFitInsetsIgnoringVisibility(boolean arg0) {
            real.setFitInsetsIgnoringVisibility(arg0);
        }

        public void setFitInsetsSides(int arg0) {
            real.setFitInsetsSides(arg0);
        }

        public void setFitInsetsTypes(int arg0) {
            real.setFitInsetsTypes(arg0);
        }

        public void setFrameRateBoostOnTouchEnabled(boolean arg0) {
            real.setFrameRateBoostOnTouchEnabled(arg0);
        }

        public void setFrameRatePowerSavingsBalanced(boolean arg0) {
            real.setFrameRatePowerSavingsBalanced(arg0);
        }

        public void setHdrConversionEnabled(boolean arg0) {
            real.setHdrConversionEnabled(arg0);
        }

        public void setTitle(java.lang.CharSequence arg0) {
            real.setTitle(arg0);
        }

        public void setWallpaperTouchEventsEnabled(boolean arg0) {
            real.setWallpaperTouchEventsEnabled(arg0);
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public static final int ALPHA_CHANGED = android.view.WindowManager.LayoutParams.ALPHA_CHANGED;
        public static final int ANIMATION_CHANGED = android.view.WindowManager.LayoutParams.ANIMATION_CHANGED;
        public static final float BRIGHTNESS_OVERRIDE_FULL = android.view.WindowManager.LayoutParams.BRIGHTNESS_OVERRIDE_FULL;
        public static final float BRIGHTNESS_OVERRIDE_NONE = android.view.WindowManager.LayoutParams.BRIGHTNESS_OVERRIDE_NONE;
        public static final float BRIGHTNESS_OVERRIDE_OFF = android.view.WindowManager.LayoutParams.BRIGHTNESS_OVERRIDE_OFF;
        public static final int DIM_AMOUNT_CHANGED = android.view.WindowManager.LayoutParams.DIM_AMOUNT_CHANGED;
        public static final int DISPLAY_FLAG_DISABLE_HDR_CONVERSION = android.view.WindowManager.LayoutParams.DISPLAY_FLAG_DISABLE_HDR_CONVERSION;
        public static final int FIRST_APPLICATION_WINDOW = android.view.WindowManager.LayoutParams.FIRST_APPLICATION_WINDOW;
        public static final int FIRST_SUB_WINDOW = android.view.WindowManager.LayoutParams.FIRST_SUB_WINDOW;
        public static final int FIRST_SYSTEM_WINDOW = android.view.WindowManager.LayoutParams.FIRST_SYSTEM_WINDOW;
        public static final int FLAGS_CHANGED = android.view.WindowManager.LayoutParams.FLAGS_CHANGED;
        public static final int FLAG_ALLOW_LOCK_WHILE_SCREEN_ON = android.view.WindowManager.LayoutParams.FLAG_ALLOW_LOCK_WHILE_SCREEN_ON;
        public static final int FLAG_ALT_FOCUSABLE_IM = android.view.WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM;
        public static final int FLAG_BLUR_BEHIND = android.view.WindowManager.LayoutParams.FLAG_BLUR_BEHIND;
        public static final int FLAG_DIM_BEHIND = android.view.WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        public static final int FLAG_DISMISS_KEYGUARD = android.view.WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD;
        public static final int FLAG_DITHER = android.view.WindowManager.LayoutParams.FLAG_DITHER;
        public static final int FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS = android.view.WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS;
        public static final int FLAG_FORCE_NOT_FULLSCREEN = android.view.WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN;
        public static final int FLAG_FULLSCREEN = android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN;
        public static final int FLAG_HARDWARE_ACCELERATED = android.view.WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED;
        public static final int FLAG_IGNORE_CHEEK_PRESSES = android.view.WindowManager.LayoutParams.FLAG_IGNORE_CHEEK_PRESSES;
        public static final int FLAG_KEEP_SCREEN_ON = android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON;
        public static final int FLAG_LAYOUT_ATTACHED_IN_DECOR = android.view.WindowManager.LayoutParams.FLAG_LAYOUT_ATTACHED_IN_DECOR;
        public static final int FLAG_LAYOUT_INSET_DECOR = android.view.WindowManager.LayoutParams.FLAG_LAYOUT_INSET_DECOR;
        public static final int FLAG_LAYOUT_IN_OVERSCAN = android.view.WindowManager.LayoutParams.FLAG_LAYOUT_IN_OVERSCAN;
        public static final int FLAG_LAYOUT_IN_SCREEN = android.view.WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN;
        public static final int FLAG_LAYOUT_NO_LIMITS = android.view.WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS;
        public static final int FLAG_LOCAL_FOCUS_MODE = android.view.WindowManager.LayoutParams.FLAG_LOCAL_FOCUS_MODE;
        public static final int FLAG_NOT_FOCUSABLE = android.view.WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE;
        public static final int FLAG_NOT_TOUCHABLE = android.view.WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE;
        public static final int FLAG_NOT_TOUCH_MODAL = android.view.WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL;
        public static final int FLAG_SCALED = android.view.WindowManager.LayoutParams.FLAG_SCALED;
        public static final int FLAG_SECURE = android.view.WindowManager.LayoutParams.FLAG_SECURE;
        public static final int FLAG_SHOW_WALLPAPER = android.view.WindowManager.LayoutParams.FLAG_SHOW_WALLPAPER;
        public static final int FLAG_SHOW_WHEN_LOCKED = android.view.WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED;
        public static final int FLAG_SPLIT_TOUCH = android.view.WindowManager.LayoutParams.FLAG_SPLIT_TOUCH;
        public static final int FLAG_TOUCHABLE_WHEN_WAKING = android.view.WindowManager.LayoutParams.FLAG_TOUCHABLE_WHEN_WAKING;
        public static final int FLAG_TRANSLUCENT_NAVIGATION = android.view.WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION;
        public static final int FLAG_TRANSLUCENT_STATUS = android.view.WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
        public static final int FLAG_TURN_SCREEN_ON = android.view.WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON;
        public static final int FLAG_WATCH_OUTSIDE_TOUCH = android.view.WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH;
        public static final int FORMAT_CHANGED = android.view.WindowManager.LayoutParams.FORMAT_CHANGED;
        public static final int LAST_APPLICATION_WINDOW = android.view.WindowManager.LayoutParams.LAST_APPLICATION_WINDOW;
        public static final int LAST_SUB_WINDOW = android.view.WindowManager.LayoutParams.LAST_SUB_WINDOW;
        public static final int LAST_SYSTEM_WINDOW = android.view.WindowManager.LayoutParams.LAST_SYSTEM_WINDOW;
        public static final int LAYOUT_CHANGED = android.view.WindowManager.LayoutParams.LAYOUT_CHANGED;
        public static final int LAYOUT_IN_DISPLAY_CUTOUT_MODE_ALWAYS = android.view.WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_ALWAYS;
        public static final int LAYOUT_IN_DISPLAY_CUTOUT_MODE_DEFAULT = android.view.WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_DEFAULT;
        public static final int LAYOUT_IN_DISPLAY_CUTOUT_MODE_NEVER = android.view.WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_NEVER;
        public static final int LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES = android.view.WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;
        public static final int MEMORY_TYPE_CHANGED = android.view.WindowManager.LayoutParams.MEMORY_TYPE_CHANGED;
        public static final int MEMORY_TYPE_GPU = android.view.WindowManager.LayoutParams.MEMORY_TYPE_GPU;
        public static final int MEMORY_TYPE_HARDWARE = android.view.WindowManager.LayoutParams.MEMORY_TYPE_HARDWARE;
        public static final int MEMORY_TYPE_NORMAL = android.view.WindowManager.LayoutParams.MEMORY_TYPE_NORMAL;
        public static final int MEMORY_TYPE_PUSH_BUFFERS = android.view.WindowManager.LayoutParams.MEMORY_TYPE_PUSH_BUFFERS;
        public static final int ROTATION_ANIMATION_CHANGED = android.view.WindowManager.LayoutParams.ROTATION_ANIMATION_CHANGED;
        public static final int ROTATION_ANIMATION_CROSSFADE = android.view.WindowManager.LayoutParams.ROTATION_ANIMATION_CROSSFADE;
        public static final int ROTATION_ANIMATION_JUMPCUT = android.view.WindowManager.LayoutParams.ROTATION_ANIMATION_JUMPCUT;
        public static final int ROTATION_ANIMATION_ROTATE = android.view.WindowManager.LayoutParams.ROTATION_ANIMATION_ROTATE;
        public static final int ROTATION_ANIMATION_SEAMLESS = android.view.WindowManager.LayoutParams.ROTATION_ANIMATION_SEAMLESS;
        public static final int SCREEN_BRIGHTNESS_CHANGED = android.view.WindowManager.LayoutParams.SCREEN_BRIGHTNESS_CHANGED;
        public static final int SCREEN_ORIENTATION_CHANGED = android.view.WindowManager.LayoutParams.SCREEN_ORIENTATION_CHANGED;
        public static final int SOFT_INPUT_ADJUST_NOTHING = android.view.WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING;
        public static final int SOFT_INPUT_ADJUST_PAN = android.view.WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN;
        public static final int SOFT_INPUT_ADJUST_RESIZE = android.view.WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE;
        public static final int SOFT_INPUT_ADJUST_UNSPECIFIED = android.view.WindowManager.LayoutParams.SOFT_INPUT_ADJUST_UNSPECIFIED;
        public static final int SOFT_INPUT_IS_FORWARD_NAVIGATION = android.view.WindowManager.LayoutParams.SOFT_INPUT_IS_FORWARD_NAVIGATION;
        public static final int SOFT_INPUT_MASK_ADJUST = android.view.WindowManager.LayoutParams.SOFT_INPUT_MASK_ADJUST;
        public static final int SOFT_INPUT_MASK_STATE = android.view.WindowManager.LayoutParams.SOFT_INPUT_MASK_STATE;
        public static final int SOFT_INPUT_MODE_CHANGED = android.view.WindowManager.LayoutParams.SOFT_INPUT_MODE_CHANGED;
        public static final int SOFT_INPUT_STATE_ALWAYS_HIDDEN = android.view.WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN;
        public static final int SOFT_INPUT_STATE_ALWAYS_VISIBLE = android.view.WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE;
        public static final int SOFT_INPUT_STATE_HIDDEN = android.view.WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN;
        public static final int SOFT_INPUT_STATE_UNCHANGED = android.view.WindowManager.LayoutParams.SOFT_INPUT_STATE_UNCHANGED;
        public static final int SOFT_INPUT_STATE_UNSPECIFIED = android.view.WindowManager.LayoutParams.SOFT_INPUT_STATE_UNSPECIFIED;
        public static final int SOFT_INPUT_STATE_VISIBLE = android.view.WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE;
        public static final int TITLE_CHANGED = android.view.WindowManager.LayoutParams.TITLE_CHANGED;
        public static final int TYPE_ACCESSIBILITY_OVERLAY = android.view.WindowManager.LayoutParams.TYPE_ACCESSIBILITY_OVERLAY;
        public static final int TYPE_APPLICATION = android.view.WindowManager.LayoutParams.TYPE_APPLICATION;
        public static final int TYPE_APPLICATION_ATTACHED_DIALOG = android.view.WindowManager.LayoutParams.TYPE_APPLICATION_ATTACHED_DIALOG;
        public static final int TYPE_APPLICATION_MEDIA = android.view.WindowManager.LayoutParams.TYPE_APPLICATION_MEDIA;
        public static final int TYPE_APPLICATION_OVERLAY = android.view.WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
        public static final int TYPE_APPLICATION_PANEL = android.view.WindowManager.LayoutParams.TYPE_APPLICATION_PANEL;
        public static final int TYPE_APPLICATION_STARTING = android.view.WindowManager.LayoutParams.TYPE_APPLICATION_STARTING;
        public static final int TYPE_APPLICATION_SUB_PANEL = android.view.WindowManager.LayoutParams.TYPE_APPLICATION_SUB_PANEL;
        public static final int TYPE_BASE_APPLICATION = android.view.WindowManager.LayoutParams.TYPE_BASE_APPLICATION;
        public static final int TYPE_CHANGED = android.view.WindowManager.LayoutParams.TYPE_CHANGED;
        public static final int TYPE_DRAWN_APPLICATION = android.view.WindowManager.LayoutParams.TYPE_DRAWN_APPLICATION;
        public static final int TYPE_INPUT_METHOD = android.view.WindowManager.LayoutParams.TYPE_INPUT_METHOD;
        public static final int TYPE_INPUT_METHOD_DIALOG = android.view.WindowManager.LayoutParams.TYPE_INPUT_METHOD_DIALOG;
        public static final int TYPE_KEYGUARD_DIALOG = android.view.WindowManager.LayoutParams.TYPE_KEYGUARD_DIALOG;
        public static final int TYPE_PHONE = android.view.WindowManager.LayoutParams.TYPE_PHONE;
        public static final int TYPE_PRIORITY_PHONE = android.view.WindowManager.LayoutParams.TYPE_PRIORITY_PHONE;
        public static final int TYPE_PRIVATE_PRESENTATION = android.view.WindowManager.LayoutParams.TYPE_PRIVATE_PRESENTATION;
        public static final int TYPE_SEARCH_BAR = android.view.WindowManager.LayoutParams.TYPE_SEARCH_BAR;
        public static final int TYPE_STATUS_BAR = android.view.WindowManager.LayoutParams.TYPE_STATUS_BAR;
        public static final int TYPE_SYSTEM_ALERT = android.view.WindowManager.LayoutParams.TYPE_SYSTEM_ALERT;
        public static final int TYPE_SYSTEM_DIALOG = android.view.WindowManager.LayoutParams.TYPE_SYSTEM_DIALOG;
        public static final int TYPE_SYSTEM_ERROR = android.view.WindowManager.LayoutParams.TYPE_SYSTEM_ERROR;
        public static final int TYPE_SYSTEM_OVERLAY = android.view.WindowManager.LayoutParams.TYPE_SYSTEM_OVERLAY;
        public static final int TYPE_TOAST = android.view.WindowManager.LayoutParams.TYPE_TOAST;
        public static final int TYPE_WALLPAPER = android.view.WindowManager.LayoutParams.TYPE_WALLPAPER;

    }
}
