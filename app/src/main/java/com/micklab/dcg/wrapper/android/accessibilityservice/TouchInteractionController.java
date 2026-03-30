// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accessibilityservice;

public final class TouchInteractionController {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TouchInteractionController(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accessibilityservice.TouchInteractionController wrap(android.accessibilityservice.TouchInteractionController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.TouchInteractionController(real, (__DcgwBridgeToken) null);
    }

    public android.accessibilityservice.TouchInteractionController getReal() {
        return (android.accessibilityservice.TouchInteractionController) real;
    }

    public android.accessibilityservice.TouchInteractionController unwrap() {
        return getReal();
    }

    public int getDisplayId() {
        return ((android.accessibilityservice.TouchInteractionController) real).getDisplayId();
    }

    public int getMaxPointerCount() {
        return ((android.accessibilityservice.TouchInteractionController) real).getMaxPointerCount();
    }

    public int getState() {
        return ((android.accessibilityservice.TouchInteractionController) real).getState();
    }

    public void performClick() {
        ((android.accessibilityservice.TouchInteractionController) real).performClick();
    }

    public void performLongClickAndStartDrag() {
        ((android.accessibilityservice.TouchInteractionController) real).performLongClickAndStartDrag();
    }

    public void registerCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.accessibilityservice.TouchInteractionController.Callback arg1) {
        ((android.accessibilityservice.TouchInteractionController) real).registerCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void requestDelegating() {
        ((android.accessibilityservice.TouchInteractionController) real).requestDelegating();
    }

    public void requestDragging(int arg0) {
        ((android.accessibilityservice.TouchInteractionController) real).requestDragging(arg0);
    }

    public void requestTouchExploration() {
        ((android.accessibilityservice.TouchInteractionController) real).requestTouchExploration();
    }

    public static java.lang.String stateToString(int arg0) {
        return android.accessibilityservice.TouchInteractionController.stateToString(arg0);
    }

    public void unregisterAllCallbacks() {
        ((android.accessibilityservice.TouchInteractionController) real).unregisterAllCallbacks();
    }

    public boolean unregisterCallback(com.micklab.dcg.wrapper.android.accessibilityservice.TouchInteractionController.Callback arg0) {
        return ((android.accessibilityservice.TouchInteractionController) real).unregisterCallback(arg0 == null ? null : arg0.getReal());
    }

    public static final int STATE_CLEAR = android.accessibilityservice.TouchInteractionController.STATE_CLEAR;
    public static final int STATE_DELEGATING = android.accessibilityservice.TouchInteractionController.STATE_DELEGATING;
    public static final int STATE_DRAGGING = android.accessibilityservice.TouchInteractionController.STATE_DRAGGING;
    public static final int STATE_TOUCH_EXPLORING = android.accessibilityservice.TouchInteractionController.STATE_TOUCH_EXPLORING;
    public static final int STATE_TOUCH_INTERACTING = android.accessibilityservice.TouchInteractionController.STATE_TOUCH_INTERACTING;

    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.accessibilityservice.TouchInteractionController.Callback wrap(android.accessibilityservice.TouchInteractionController.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.TouchInteractionController.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.accessibilityservice.TouchInteractionController.Callback getReal() {
            return (android.accessibilityservice.TouchInteractionController.Callback) real;
        }

        public android.accessibilityservice.TouchInteractionController.Callback unwrap() {
            return getReal();
        }

        public void onMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            ((android.accessibilityservice.TouchInteractionController.Callback) real).onMotionEvent(arg0 == null ? null : arg0.getReal());
        }

        public void onStateChanged(int arg0) {
            ((android.accessibilityservice.TouchInteractionController.Callback) real).onStateChanged(arg0);
        }

    }
}
