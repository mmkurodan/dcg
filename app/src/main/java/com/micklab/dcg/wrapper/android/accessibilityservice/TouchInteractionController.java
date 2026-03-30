// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accessibilityservice;

public final class TouchInteractionController {
    private final android.accessibilityservice.TouchInteractionController real;

    public TouchInteractionController(android.accessibilityservice.TouchInteractionController real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accessibilityservice.TouchInteractionController wrap(android.accessibilityservice.TouchInteractionController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.TouchInteractionController(real);
    }

    public android.accessibilityservice.TouchInteractionController unwrap() {
        return real;
    }

    public int getDisplayId() {
        return real.getDisplayId();
    }

    public int getMaxPointerCount() {
        return real.getMaxPointerCount();
    }

    public int getState() {
        return real.getState();
    }

    public void performClick() {
        real.performClick();
    }

    public void performLongClickAndStartDrag() {
        real.performLongClickAndStartDrag();
    }

    public void registerCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.accessibilityservice.TouchInteractionController.Callback arg1) {
        real.registerCallback(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void requestDelegating() {
        real.requestDelegating();
    }

    public void requestDragging(int arg0) {
        real.requestDragging(arg0);
    }

    public void requestTouchExploration() {
        real.requestTouchExploration();
    }

    public static java.lang.String stateToString(int arg0) {
        return android.accessibilityservice.TouchInteractionController.stateToString(arg0);
    }

    public void unregisterAllCallbacks() {
        real.unregisterAllCallbacks();
    }

    public boolean unregisterCallback(com.micklab.dcg.wrapper.android.accessibilityservice.TouchInteractionController.Callback arg0) {
        return real.unregisterCallback(arg0 == null ? null : arg0.unwrap());
    }

    public static final int STATE_CLEAR = android.accessibilityservice.TouchInteractionController.STATE_CLEAR;
    public static final int STATE_DELEGATING = android.accessibilityservice.TouchInteractionController.STATE_DELEGATING;
    public static final int STATE_DRAGGING = android.accessibilityservice.TouchInteractionController.STATE_DRAGGING;
    public static final int STATE_TOUCH_EXPLORING = android.accessibilityservice.TouchInteractionController.STATE_TOUCH_EXPLORING;
    public static final int STATE_TOUCH_INTERACTING = android.accessibilityservice.TouchInteractionController.STATE_TOUCH_INTERACTING;

    public static final class Callback {
        private final android.accessibilityservice.TouchInteractionController.Callback real;

        public Callback(android.accessibilityservice.TouchInteractionController.Callback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.accessibilityservice.TouchInteractionController.Callback wrap(android.accessibilityservice.TouchInteractionController.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.TouchInteractionController.Callback(real);
        }

        public android.accessibilityservice.TouchInteractionController.Callback unwrap() {
            return real;
        }

        public void onMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            real.onMotionEvent(arg0 == null ? null : arg0.unwrap());
        }

        public void onStateChanged(int arg0) {
            real.onStateChanged(arg0);
        }

    }
}
