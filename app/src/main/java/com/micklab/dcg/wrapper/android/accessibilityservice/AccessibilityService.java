// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accessibilityservice;

public final class AccessibilityService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AccessibilityService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService wrap(android.accessibilityservice.AccessibilityService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService(real, (__DcgwBridgeToken) null);
    }

    public android.accessibilityservice.AccessibilityService getReal() {
        return (android.accessibilityservice.AccessibilityService) real;
    }

    public android.accessibilityservice.AccessibilityService unwrap() {
        return getReal();
    }

    public void attachAccessibilityOverlayToDisplay(int arg0, com.micklab.dcg.wrapper.android.view.SurfaceControl arg1) {
        ((android.accessibilityservice.AccessibilityService) real).attachAccessibilityOverlayToDisplay(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void attachAccessibilityOverlayToWindow(int arg0, com.micklab.dcg.wrapper.android.view.SurfaceControl arg1) {
        ((android.accessibilityservice.AccessibilityService) real).attachAccessibilityOverlayToWindow(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean clearCache() {
        return ((android.accessibilityservice.AccessibilityService) real).clearCache();
    }

    public boolean clearCachedSubtree(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg0) {
        return ((android.accessibilityservice.AccessibilityService) real).clearCachedSubtree(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.content.Context createDisplayContext(com.micklab.dcg.wrapper.android.view.Display arg0) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.accessibilityservice.AccessibilityService) real).createDisplayContext(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.content.Context createWindowContext(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.accessibilityservice.AccessibilityService) real).createWindowContext(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.content.Context createWindowContext(com.micklab.dcg.wrapper.android.view.Display arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.accessibilityservice.AccessibilityService) real).createWindowContext(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()));
    }

    public void disableSelf() {
        ((android.accessibilityservice.AccessibilityService) real).disableSelf();
    }

    public boolean dispatchGesture(com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription arg0, com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.GestureResultCallback arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) {
        return ((android.accessibilityservice.AccessibilityService) real).dispatchGesture(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo findFocus(int arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(((android.accessibilityservice.AccessibilityService) real).findFocus(arg0));
    }

    public com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityButtonController getAccessibilityButtonController() {
        return com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityButtonController.wrap(((android.accessibilityservice.AccessibilityService) real).getAccessibilityButtonController());
    }

    public com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityButtonController getAccessibilityButtonController(int arg0) {
        return com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityButtonController.wrap(((android.accessibilityservice.AccessibilityService) real).getAccessibilityButtonController(arg0));
    }

    public com.micklab.dcg.wrapper.android.accessibilityservice.BrailleDisplayController getBrailleDisplayController() {
        return com.micklab.dcg.wrapper.android.accessibilityservice.BrailleDisplayController.wrap(((android.accessibilityservice.AccessibilityService) real).getBrailleDisplayController());
    }

    public com.micklab.dcg.wrapper.android.accessibilityservice.FingerprintGestureController getFingerprintGestureController() {
        return com.micklab.dcg.wrapper.android.accessibilityservice.FingerprintGestureController.wrap(((android.accessibilityservice.AccessibilityService) real).getFingerprintGestureController());
    }

    public com.micklab.dcg.wrapper.android.accessibilityservice.InputMethod getInputMethod() {
        return com.micklab.dcg.wrapper.android.accessibilityservice.InputMethod.wrap(((android.accessibilityservice.AccessibilityService) real).getInputMethod());
    }

    public com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.MagnificationController getMagnificationController() {
        return com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.MagnificationController.wrap(((android.accessibilityservice.AccessibilityService) real).getMagnificationController());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getRootInActiveWindow() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(((android.accessibilityservice.AccessibilityService) real).getRootInActiveWindow());
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo getRootInActiveWindow(int arg0) {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.wrap(((android.accessibilityservice.AccessibilityService) real).getRootInActiveWindow(arg0));
    }

    public com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityServiceInfo getServiceInfo() {
        return com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityServiceInfo.wrap(((android.accessibilityservice.AccessibilityService) real).getServiceInfo());
    }

    public com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.SoftKeyboardController getSoftKeyboardController() {
        return com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.SoftKeyboardController.wrap(((android.accessibilityservice.AccessibilityService) real).getSoftKeyboardController());
    }

    public java.lang.Object getSystemService(java.lang.String arg0) {
        return ((android.accessibilityservice.AccessibilityService) real).getSystemService(arg0);
    }

    public com.micklab.dcg.wrapper.android.accessibilityservice.TouchInteractionController getTouchInteractionController(int arg0) {
        return com.micklab.dcg.wrapper.android.accessibilityservice.TouchInteractionController.wrap(((android.accessibilityservice.AccessibilityService) real).getTouchInteractionController(arg0));
    }

    public boolean isCacheEnabled() {
        return ((android.accessibilityservice.AccessibilityService) real).isCacheEnabled();
    }

    public boolean isNodeInCache(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo arg0) {
        return ((android.accessibilityservice.AccessibilityService) real).isNodeInCache(arg0 == null ? null : arg0.getReal());
    }

    public void onAccessibilityEvent(com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityEvent arg0) {
        ((android.accessibilityservice.AccessibilityService) real).onAccessibilityEvent(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.accessibilityservice.AccessibilityService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.accessibilityservice.InputMethod onCreateInputMethod() {
        return com.micklab.dcg.wrapper.android.accessibilityservice.InputMethod.wrap(((android.accessibilityservice.AccessibilityService) real).onCreateInputMethod());
    }

    public boolean onGesture(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityGestureEvent arg0) {
        return ((android.accessibilityservice.AccessibilityService) real).onGesture(arg0 == null ? null : arg0.getReal());
    }

    public void onInterrupt() {
        ((android.accessibilityservice.AccessibilityService) real).onInterrupt();
    }

    public void onMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        ((android.accessibilityservice.AccessibilityService) real).onMotionEvent(arg0 == null ? null : arg0.getReal());
    }

    public void onSystemActionsChanged() {
        ((android.accessibilityservice.AccessibilityService) real).onSystemActionsChanged();
    }

    public boolean performGlobalAction(int arg0) {
        return ((android.accessibilityservice.AccessibilityService) real).performGlobalAction(arg0);
    }

    public void setAccessibilityFocusAppearance(int arg0, int arg1) {
        ((android.accessibilityservice.AccessibilityService) real).setAccessibilityFocusAppearance(arg0, arg1);
    }

    public void setAnimationScale(float arg0) {
        ((android.accessibilityservice.AccessibilityService) real).setAnimationScale(arg0);
    }

    public boolean setCacheEnabled(boolean arg0) {
        return ((android.accessibilityservice.AccessibilityService) real).setCacheEnabled(arg0);
    }

    public void setGestureDetectionPassthroughRegion(int arg0, com.micklab.dcg.wrapper.android.graphics.Region arg1) {
        ((android.accessibilityservice.AccessibilityService) real).setGestureDetectionPassthroughRegion(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setServiceInfo(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityServiceInfo arg0) {
        ((android.accessibilityservice.AccessibilityService) real).setServiceInfo(arg0 == null ? null : arg0.getReal());
    }

    public void setTouchExplorationPassthroughRegion(int arg0, com.micklab.dcg.wrapper.android.graphics.Region arg1) {
        ((android.accessibilityservice.AccessibilityService) real).setTouchExplorationPassthroughRegion(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void takeScreenshot(int arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.TakeScreenshotCallback arg2) {
        ((android.accessibilityservice.AccessibilityService) real).takeScreenshot(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void takeScreenshotOfWindow(int arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.TakeScreenshotCallback arg2) {
        ((android.accessibilityservice.AccessibilityService) real).takeScreenshotOfWindow(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public static final int ERROR_TAKE_SCREENSHOT_INTERNAL_ERROR = android.accessibilityservice.AccessibilityService.ERROR_TAKE_SCREENSHOT_INTERNAL_ERROR;
    public static final int ERROR_TAKE_SCREENSHOT_INTERVAL_TIME_SHORT = android.accessibilityservice.AccessibilityService.ERROR_TAKE_SCREENSHOT_INTERVAL_TIME_SHORT;
    public static final int ERROR_TAKE_SCREENSHOT_INVALID_DISPLAY = android.accessibilityservice.AccessibilityService.ERROR_TAKE_SCREENSHOT_INVALID_DISPLAY;
    public static final int ERROR_TAKE_SCREENSHOT_INVALID_WINDOW = android.accessibilityservice.AccessibilityService.ERROR_TAKE_SCREENSHOT_INVALID_WINDOW;
    public static final int ERROR_TAKE_SCREENSHOT_NO_ACCESSIBILITY_ACCESS = android.accessibilityservice.AccessibilityService.ERROR_TAKE_SCREENSHOT_NO_ACCESSIBILITY_ACCESS;
    public static final int ERROR_TAKE_SCREENSHOT_SECURE_WINDOW = android.accessibilityservice.AccessibilityService.ERROR_TAKE_SCREENSHOT_SECURE_WINDOW;
    public static final int GESTURE_2_FINGER_DOUBLE_TAP = android.accessibilityservice.AccessibilityService.GESTURE_2_FINGER_DOUBLE_TAP;
    public static final int GESTURE_2_FINGER_DOUBLE_TAP_AND_HOLD = android.accessibilityservice.AccessibilityService.GESTURE_2_FINGER_DOUBLE_TAP_AND_HOLD;
    public static final int GESTURE_2_FINGER_SINGLE_TAP = android.accessibilityservice.AccessibilityService.GESTURE_2_FINGER_SINGLE_TAP;
    public static final int GESTURE_2_FINGER_SWIPE_DOWN = android.accessibilityservice.AccessibilityService.GESTURE_2_FINGER_SWIPE_DOWN;
    public static final int GESTURE_2_FINGER_SWIPE_LEFT = android.accessibilityservice.AccessibilityService.GESTURE_2_FINGER_SWIPE_LEFT;
    public static final int GESTURE_2_FINGER_SWIPE_RIGHT = android.accessibilityservice.AccessibilityService.GESTURE_2_FINGER_SWIPE_RIGHT;
    public static final int GESTURE_2_FINGER_SWIPE_UP = android.accessibilityservice.AccessibilityService.GESTURE_2_FINGER_SWIPE_UP;
    public static final int GESTURE_2_FINGER_TRIPLE_TAP = android.accessibilityservice.AccessibilityService.GESTURE_2_FINGER_TRIPLE_TAP;
    public static final int GESTURE_2_FINGER_TRIPLE_TAP_AND_HOLD = android.accessibilityservice.AccessibilityService.GESTURE_2_FINGER_TRIPLE_TAP_AND_HOLD;
    public static final int GESTURE_3_FINGER_DOUBLE_TAP = android.accessibilityservice.AccessibilityService.GESTURE_3_FINGER_DOUBLE_TAP;
    public static final int GESTURE_3_FINGER_DOUBLE_TAP_AND_HOLD = android.accessibilityservice.AccessibilityService.GESTURE_3_FINGER_DOUBLE_TAP_AND_HOLD;
    public static final int GESTURE_3_FINGER_SINGLE_TAP = android.accessibilityservice.AccessibilityService.GESTURE_3_FINGER_SINGLE_TAP;
    public static final int GESTURE_3_FINGER_SINGLE_TAP_AND_HOLD = android.accessibilityservice.AccessibilityService.GESTURE_3_FINGER_SINGLE_TAP_AND_HOLD;
    public static final int GESTURE_3_FINGER_SWIPE_DOWN = android.accessibilityservice.AccessibilityService.GESTURE_3_FINGER_SWIPE_DOWN;
    public static final int GESTURE_3_FINGER_SWIPE_LEFT = android.accessibilityservice.AccessibilityService.GESTURE_3_FINGER_SWIPE_LEFT;
    public static final int GESTURE_3_FINGER_SWIPE_RIGHT = android.accessibilityservice.AccessibilityService.GESTURE_3_FINGER_SWIPE_RIGHT;
    public static final int GESTURE_3_FINGER_SWIPE_UP = android.accessibilityservice.AccessibilityService.GESTURE_3_FINGER_SWIPE_UP;
    public static final int GESTURE_3_FINGER_TRIPLE_TAP = android.accessibilityservice.AccessibilityService.GESTURE_3_FINGER_TRIPLE_TAP;
    public static final int GESTURE_3_FINGER_TRIPLE_TAP_AND_HOLD = android.accessibilityservice.AccessibilityService.GESTURE_3_FINGER_TRIPLE_TAP_AND_HOLD;
    public static final int GESTURE_4_FINGER_DOUBLE_TAP = android.accessibilityservice.AccessibilityService.GESTURE_4_FINGER_DOUBLE_TAP;
    public static final int GESTURE_4_FINGER_DOUBLE_TAP_AND_HOLD = android.accessibilityservice.AccessibilityService.GESTURE_4_FINGER_DOUBLE_TAP_AND_HOLD;
    public static final int GESTURE_4_FINGER_SINGLE_TAP = android.accessibilityservice.AccessibilityService.GESTURE_4_FINGER_SINGLE_TAP;
    public static final int GESTURE_4_FINGER_SWIPE_DOWN = android.accessibilityservice.AccessibilityService.GESTURE_4_FINGER_SWIPE_DOWN;
    public static final int GESTURE_4_FINGER_SWIPE_LEFT = android.accessibilityservice.AccessibilityService.GESTURE_4_FINGER_SWIPE_LEFT;
    public static final int GESTURE_4_FINGER_SWIPE_RIGHT = android.accessibilityservice.AccessibilityService.GESTURE_4_FINGER_SWIPE_RIGHT;
    public static final int GESTURE_4_FINGER_SWIPE_UP = android.accessibilityservice.AccessibilityService.GESTURE_4_FINGER_SWIPE_UP;
    public static final int GESTURE_4_FINGER_TRIPLE_TAP = android.accessibilityservice.AccessibilityService.GESTURE_4_FINGER_TRIPLE_TAP;
    public static final int GESTURE_DOUBLE_TAP = android.accessibilityservice.AccessibilityService.GESTURE_DOUBLE_TAP;
    public static final int GESTURE_DOUBLE_TAP_AND_HOLD = android.accessibilityservice.AccessibilityService.GESTURE_DOUBLE_TAP_AND_HOLD;
    public static final int GESTURE_SWIPE_DOWN = android.accessibilityservice.AccessibilityService.GESTURE_SWIPE_DOWN;
    public static final int GESTURE_SWIPE_DOWN_AND_LEFT = android.accessibilityservice.AccessibilityService.GESTURE_SWIPE_DOWN_AND_LEFT;
    public static final int GESTURE_SWIPE_DOWN_AND_RIGHT = android.accessibilityservice.AccessibilityService.GESTURE_SWIPE_DOWN_AND_RIGHT;
    public static final int GESTURE_SWIPE_DOWN_AND_UP = android.accessibilityservice.AccessibilityService.GESTURE_SWIPE_DOWN_AND_UP;
    public static final int GESTURE_SWIPE_LEFT = android.accessibilityservice.AccessibilityService.GESTURE_SWIPE_LEFT;
    public static final int GESTURE_SWIPE_LEFT_AND_DOWN = android.accessibilityservice.AccessibilityService.GESTURE_SWIPE_LEFT_AND_DOWN;
    public static final int GESTURE_SWIPE_LEFT_AND_RIGHT = android.accessibilityservice.AccessibilityService.GESTURE_SWIPE_LEFT_AND_RIGHT;
    public static final int GESTURE_SWIPE_LEFT_AND_UP = android.accessibilityservice.AccessibilityService.GESTURE_SWIPE_LEFT_AND_UP;
    public static final int GESTURE_SWIPE_RIGHT = android.accessibilityservice.AccessibilityService.GESTURE_SWIPE_RIGHT;
    public static final int GESTURE_SWIPE_RIGHT_AND_DOWN = android.accessibilityservice.AccessibilityService.GESTURE_SWIPE_RIGHT_AND_DOWN;
    public static final int GESTURE_SWIPE_RIGHT_AND_LEFT = android.accessibilityservice.AccessibilityService.GESTURE_SWIPE_RIGHT_AND_LEFT;
    public static final int GESTURE_SWIPE_RIGHT_AND_UP = android.accessibilityservice.AccessibilityService.GESTURE_SWIPE_RIGHT_AND_UP;
    public static final int GESTURE_SWIPE_UP = android.accessibilityservice.AccessibilityService.GESTURE_SWIPE_UP;
    public static final int GESTURE_SWIPE_UP_AND_DOWN = android.accessibilityservice.AccessibilityService.GESTURE_SWIPE_UP_AND_DOWN;
    public static final int GESTURE_SWIPE_UP_AND_LEFT = android.accessibilityservice.AccessibilityService.GESTURE_SWIPE_UP_AND_LEFT;
    public static final int GESTURE_SWIPE_UP_AND_RIGHT = android.accessibilityservice.AccessibilityService.GESTURE_SWIPE_UP_AND_RIGHT;
    public static final int GESTURE_UNKNOWN = android.accessibilityservice.AccessibilityService.GESTURE_UNKNOWN;
    public static final int GLOBAL_ACTION_ACCESSIBILITY_ALL_APPS = android.accessibilityservice.AccessibilityService.GLOBAL_ACTION_ACCESSIBILITY_ALL_APPS;
    public static final int GLOBAL_ACTION_ACCESSIBILITY_BUTTON = android.accessibilityservice.AccessibilityService.GLOBAL_ACTION_ACCESSIBILITY_BUTTON;
    public static final int GLOBAL_ACTION_ACCESSIBILITY_BUTTON_CHOOSER = android.accessibilityservice.AccessibilityService.GLOBAL_ACTION_ACCESSIBILITY_BUTTON_CHOOSER;
    public static final int GLOBAL_ACTION_ACCESSIBILITY_SHORTCUT = android.accessibilityservice.AccessibilityService.GLOBAL_ACTION_ACCESSIBILITY_SHORTCUT;
    public static final int GLOBAL_ACTION_BACK = android.accessibilityservice.AccessibilityService.GLOBAL_ACTION_BACK;
    public static final int GLOBAL_ACTION_DISMISS_NOTIFICATION_SHADE = android.accessibilityservice.AccessibilityService.GLOBAL_ACTION_DISMISS_NOTIFICATION_SHADE;
    public static final int GLOBAL_ACTION_DPAD_CENTER = android.accessibilityservice.AccessibilityService.GLOBAL_ACTION_DPAD_CENTER;
    public static final int GLOBAL_ACTION_DPAD_DOWN = android.accessibilityservice.AccessibilityService.GLOBAL_ACTION_DPAD_DOWN;
    public static final int GLOBAL_ACTION_DPAD_LEFT = android.accessibilityservice.AccessibilityService.GLOBAL_ACTION_DPAD_LEFT;
    public static final int GLOBAL_ACTION_DPAD_RIGHT = android.accessibilityservice.AccessibilityService.GLOBAL_ACTION_DPAD_RIGHT;
    public static final int GLOBAL_ACTION_DPAD_UP = android.accessibilityservice.AccessibilityService.GLOBAL_ACTION_DPAD_UP;
    public static final int GLOBAL_ACTION_HOME = android.accessibilityservice.AccessibilityService.GLOBAL_ACTION_HOME;
    public static final int GLOBAL_ACTION_KEYCODE_HEADSETHOOK = android.accessibilityservice.AccessibilityService.GLOBAL_ACTION_KEYCODE_HEADSETHOOK;
    public static final int GLOBAL_ACTION_LOCK_SCREEN = android.accessibilityservice.AccessibilityService.GLOBAL_ACTION_LOCK_SCREEN;
    public static final int GLOBAL_ACTION_NOTIFICATIONS = android.accessibilityservice.AccessibilityService.GLOBAL_ACTION_NOTIFICATIONS;
    public static final int GLOBAL_ACTION_POWER_DIALOG = android.accessibilityservice.AccessibilityService.GLOBAL_ACTION_POWER_DIALOG;
    public static final int GLOBAL_ACTION_QUICK_SETTINGS = android.accessibilityservice.AccessibilityService.GLOBAL_ACTION_QUICK_SETTINGS;
    public static final int GLOBAL_ACTION_RECENTS = android.accessibilityservice.AccessibilityService.GLOBAL_ACTION_RECENTS;
    public static final int GLOBAL_ACTION_TAKE_SCREENSHOT = android.accessibilityservice.AccessibilityService.GLOBAL_ACTION_TAKE_SCREENSHOT;
    public static final int GLOBAL_ACTION_TOGGLE_SPLIT_SCREEN = android.accessibilityservice.AccessibilityService.GLOBAL_ACTION_TOGGLE_SPLIT_SCREEN;
    public static final java.lang.String SERVICE_INTERFACE = android.accessibilityservice.AccessibilityService.SERVICE_INTERFACE;
    public static final java.lang.String SERVICE_META_DATA = android.accessibilityservice.AccessibilityService.SERVICE_META_DATA;
    public static final int SHOW_MODE_AUTO = android.accessibilityservice.AccessibilityService.SHOW_MODE_AUTO;
    public static final int SHOW_MODE_HIDDEN = android.accessibilityservice.AccessibilityService.SHOW_MODE_HIDDEN;
    public static final int SHOW_MODE_IGNORE_HARD_KEYBOARD = android.accessibilityservice.AccessibilityService.SHOW_MODE_IGNORE_HARD_KEYBOARD;

    public static final class GestureResultCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private GestureResultCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.GestureResultCallback wrap(android.accessibilityservice.AccessibilityService.GestureResultCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.GestureResultCallback(real, (__DcgwBridgeToken) null);
        }

        public android.accessibilityservice.AccessibilityService.GestureResultCallback getReal() {
            return (android.accessibilityservice.AccessibilityService.GestureResultCallback) real;
        }

        public android.accessibilityservice.AccessibilityService.GestureResultCallback unwrap() {
            return getReal();
        }

        public void onCancelled(com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription arg0) {
            ((android.accessibilityservice.AccessibilityService.GestureResultCallback) real).onCancelled(arg0 == null ? null : arg0.getReal());
        }

        public void onCompleted(com.micklab.dcg.wrapper.android.accessibilityservice.GestureDescription arg0) {
            ((android.accessibilityservice.AccessibilityService.GestureResultCallback) real).onCompleted(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class MagnificationController {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MagnificationController(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.MagnificationController wrap(android.accessibilityservice.AccessibilityService.MagnificationController real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.MagnificationController(real, (__DcgwBridgeToken) null);
        }

        public android.accessibilityservice.AccessibilityService.MagnificationController getReal() {
            return (android.accessibilityservice.AccessibilityService.MagnificationController) real;
        }

        public android.accessibilityservice.AccessibilityService.MagnificationController unwrap() {
            return getReal();
        }

        public void addListener(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.MagnificationController.OnMagnificationChangedListener arg0) {
            ((android.accessibilityservice.AccessibilityService.MagnificationController) real).addListener(arg0 == null ? null : arg0.getReal());
        }

        public void addListener(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.MagnificationController.OnMagnificationChangedListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
            ((android.accessibilityservice.AccessibilityService.MagnificationController) real).addListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public float getCenterX() {
            return ((android.accessibilityservice.AccessibilityService.MagnificationController) real).getCenterX();
        }

        public float getCenterY() {
            return ((android.accessibilityservice.AccessibilityService.MagnificationController) real).getCenterY();
        }

        public com.micklab.dcg.wrapper.android.graphics.Region getCurrentMagnificationRegion() {
            return com.micklab.dcg.wrapper.android.graphics.Region.wrap(((android.accessibilityservice.AccessibilityService.MagnificationController) real).getCurrentMagnificationRegion());
        }

        public com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig getMagnificationConfig() {
            return com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig.wrap(((android.accessibilityservice.AccessibilityService.MagnificationController) real).getMagnificationConfig());
        }

        public com.micklab.dcg.wrapper.android.graphics.Region getMagnificationRegion() {
            return com.micklab.dcg.wrapper.android.graphics.Region.wrap(((android.accessibilityservice.AccessibilityService.MagnificationController) real).getMagnificationRegion());
        }

        public float getScale() {
            return ((android.accessibilityservice.AccessibilityService.MagnificationController) real).getScale();
        }

        public boolean removeListener(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.MagnificationController.OnMagnificationChangedListener arg0) {
            return ((android.accessibilityservice.AccessibilityService.MagnificationController) real).removeListener(arg0 == null ? null : arg0.getReal());
        }

        public boolean reset(boolean arg0) {
            return ((android.accessibilityservice.AccessibilityService.MagnificationController) real).reset(arg0);
        }

        public boolean resetCurrentMagnification(boolean arg0) {
            return ((android.accessibilityservice.AccessibilityService.MagnificationController) real).resetCurrentMagnification(arg0);
        }

        public boolean setCenter(float arg0, float arg1, boolean arg2) {
            return ((android.accessibilityservice.AccessibilityService.MagnificationController) real).setCenter(arg0, arg1, arg2);
        }

        public boolean setMagnificationConfig(com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig arg0, boolean arg1) {
            return ((android.accessibilityservice.AccessibilityService.MagnificationController) real).setMagnificationConfig(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public boolean setScale(float arg0, boolean arg1) {
            return ((android.accessibilityservice.AccessibilityService.MagnificationController) real).setScale(arg0, arg1);
        }

        public static final class OnMagnificationChangedListener {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private OnMagnificationChangedListener(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.MagnificationController.OnMagnificationChangedListener wrap(android.accessibilityservice.AccessibilityService.MagnificationController.OnMagnificationChangedListener real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.MagnificationController.OnMagnificationChangedListener(real, (__DcgwBridgeToken) null);
            }

            public android.accessibilityservice.AccessibilityService.MagnificationController.OnMagnificationChangedListener getReal() {
                return (android.accessibilityservice.AccessibilityService.MagnificationController.OnMagnificationChangedListener) real;
            }

            public android.accessibilityservice.AccessibilityService.MagnificationController.OnMagnificationChangedListener unwrap() {
                return getReal();
            }

            public void onMagnificationChanged(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.MagnificationController arg0, com.micklab.dcg.wrapper.android.graphics.Region arg1, com.micklab.dcg.wrapper.android.accessibilityservice.MagnificationConfig arg2) {
                ((android.accessibilityservice.AccessibilityService.MagnificationController.OnMagnificationChangedListener) real).onMagnificationChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
            }

            public void onMagnificationChanged(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.MagnificationController arg0, com.micklab.dcg.wrapper.android.graphics.Region arg1, float arg2, float arg3, float arg4) {
                ((android.accessibilityservice.AccessibilityService.MagnificationController.OnMagnificationChangedListener) real).onMagnificationChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4);
            }

        }
    }
    public static final class ScreenshotResult {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ScreenshotResult(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.ScreenshotResult wrap(android.accessibilityservice.AccessibilityService.ScreenshotResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.ScreenshotResult(real, (__DcgwBridgeToken) null);
        }

        public android.accessibilityservice.AccessibilityService.ScreenshotResult getReal() {
            return (android.accessibilityservice.AccessibilityService.ScreenshotResult) real;
        }

        public android.accessibilityservice.AccessibilityService.ScreenshotResult unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.graphics.ColorSpace getColorSpace() {
            return com.micklab.dcg.wrapper.android.graphics.ColorSpace.wrap(((android.accessibilityservice.AccessibilityService.ScreenshotResult) real).getColorSpace());
        }

        public com.micklab.dcg.wrapper.android.hardware.HardwareBuffer getHardwareBuffer() {
            return com.micklab.dcg.wrapper.android.hardware.HardwareBuffer.wrap(((android.accessibilityservice.AccessibilityService.ScreenshotResult) real).getHardwareBuffer());
        }

        public long getTimestamp() {
            return ((android.accessibilityservice.AccessibilityService.ScreenshotResult) real).getTimestamp();
        }

    }
    public static final class SoftKeyboardController {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SoftKeyboardController(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.SoftKeyboardController wrap(android.accessibilityservice.AccessibilityService.SoftKeyboardController real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.SoftKeyboardController(real, (__DcgwBridgeToken) null);
        }

        public android.accessibilityservice.AccessibilityService.SoftKeyboardController getReal() {
            return (android.accessibilityservice.AccessibilityService.SoftKeyboardController) real;
        }

        public android.accessibilityservice.AccessibilityService.SoftKeyboardController unwrap() {
            return getReal();
        }

        public void addOnShowModeChangedListener(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.SoftKeyboardController.OnShowModeChangedListener arg0) {
            ((android.accessibilityservice.AccessibilityService.SoftKeyboardController) real).addOnShowModeChangedListener(arg0 == null ? null : arg0.getReal());
        }

        public void addOnShowModeChangedListener(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.SoftKeyboardController.OnShowModeChangedListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
            ((android.accessibilityservice.AccessibilityService.SoftKeyboardController) real).addOnShowModeChangedListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public int getShowMode() {
            return ((android.accessibilityservice.AccessibilityService.SoftKeyboardController) real).getShowMode();
        }

        public boolean removeOnShowModeChangedListener(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.SoftKeyboardController.OnShowModeChangedListener arg0) {
            return ((android.accessibilityservice.AccessibilityService.SoftKeyboardController) real).removeOnShowModeChangedListener(arg0 == null ? null : arg0.getReal());
        }

        public int setInputMethodEnabled(java.lang.String arg0, boolean arg1) throws java.lang.SecurityException {
            return ((android.accessibilityservice.AccessibilityService.SoftKeyboardController) real).setInputMethodEnabled(arg0, arg1);
        }

        public boolean setShowMode(int arg0) {
            return ((android.accessibilityservice.AccessibilityService.SoftKeyboardController) real).setShowMode(arg0);
        }

        public boolean switchToInputMethod(java.lang.String arg0) {
            return ((android.accessibilityservice.AccessibilityService.SoftKeyboardController) real).switchToInputMethod(arg0);
        }

        public static final int ENABLE_IME_FAIL_BY_ADMIN = android.accessibilityservice.AccessibilityService.SoftKeyboardController.ENABLE_IME_FAIL_BY_ADMIN;
        public static final int ENABLE_IME_FAIL_UNKNOWN = android.accessibilityservice.AccessibilityService.SoftKeyboardController.ENABLE_IME_FAIL_UNKNOWN;
        public static final int ENABLE_IME_SUCCESS = android.accessibilityservice.AccessibilityService.SoftKeyboardController.ENABLE_IME_SUCCESS;

        public static final class OnShowModeChangedListener {
            private static final class __DcgwBridgeToken {
            }

            private final java.lang.Object real;

            private OnShowModeChangedListener(java.lang.Object real, __DcgwBridgeToken token) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.SoftKeyboardController.OnShowModeChangedListener wrap(android.accessibilityservice.AccessibilityService.SoftKeyboardController.OnShowModeChangedListener real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.SoftKeyboardController.OnShowModeChangedListener(real, (__DcgwBridgeToken) null);
            }

            public android.accessibilityservice.AccessibilityService.SoftKeyboardController.OnShowModeChangedListener getReal() {
                return (android.accessibilityservice.AccessibilityService.SoftKeyboardController.OnShowModeChangedListener) real;
            }

            public android.accessibilityservice.AccessibilityService.SoftKeyboardController.OnShowModeChangedListener unwrap() {
                return getReal();
            }

            public void onShowModeChanged(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.SoftKeyboardController arg0, int arg1) {
                ((android.accessibilityservice.AccessibilityService.SoftKeyboardController.OnShowModeChangedListener) real).onShowModeChanged(arg0 == null ? null : arg0.getReal(), arg1);
            }

        }
    }
    public static final class TakeScreenshotCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TakeScreenshotCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.TakeScreenshotCallback wrap(android.accessibilityservice.AccessibilityService.TakeScreenshotCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.TakeScreenshotCallback(real, (__DcgwBridgeToken) null);
        }

        public android.accessibilityservice.AccessibilityService.TakeScreenshotCallback getReal() {
            return (android.accessibilityservice.AccessibilityService.TakeScreenshotCallback) real;
        }

        public android.accessibilityservice.AccessibilityService.TakeScreenshotCallback unwrap() {
            return getReal();
        }

        public void onFailure(int arg0) {
            ((android.accessibilityservice.AccessibilityService.TakeScreenshotCallback) real).onFailure(arg0);
        }

        public void onSuccess(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityService.ScreenshotResult arg0) {
            ((android.accessibilityservice.AccessibilityService.TakeScreenshotCallback) real).onSuccess(arg0 == null ? null : arg0.getReal());
        }

    }
}
