// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accessibilityservice;

public final class FingerprintGestureController {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FingerprintGestureController(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accessibilityservice.FingerprintGestureController wrap(android.accessibilityservice.FingerprintGestureController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.FingerprintGestureController(real, (__DcgwBridgeToken) null);
    }

    public android.accessibilityservice.FingerprintGestureController getReal() {
        return (android.accessibilityservice.FingerprintGestureController) real;
    }

    public android.accessibilityservice.FingerprintGestureController unwrap() {
        return getReal();
    }

    public boolean isGestureDetectionAvailable() {
        return ((android.accessibilityservice.FingerprintGestureController) real).isGestureDetectionAvailable();
    }

    public void registerFingerprintGestureCallback(com.micklab.dcg.wrapper.android.accessibilityservice.FingerprintGestureController.FingerprintGestureCallback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.accessibilityservice.FingerprintGestureController) real).registerFingerprintGestureCallback(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void unregisterFingerprintGestureCallback(com.micklab.dcg.wrapper.android.accessibilityservice.FingerprintGestureController.FingerprintGestureCallback arg0) {
        ((android.accessibilityservice.FingerprintGestureController) real).unregisterFingerprintGestureCallback(arg0 == null ? null : arg0.getReal());
    }

    public static final int FINGERPRINT_GESTURE_SWIPE_DOWN = android.accessibilityservice.FingerprintGestureController.FINGERPRINT_GESTURE_SWIPE_DOWN;
    public static final int FINGERPRINT_GESTURE_SWIPE_LEFT = android.accessibilityservice.FingerprintGestureController.FINGERPRINT_GESTURE_SWIPE_LEFT;
    public static final int FINGERPRINT_GESTURE_SWIPE_RIGHT = android.accessibilityservice.FingerprintGestureController.FINGERPRINT_GESTURE_SWIPE_RIGHT;
    public static final int FINGERPRINT_GESTURE_SWIPE_UP = android.accessibilityservice.FingerprintGestureController.FINGERPRINT_GESTURE_SWIPE_UP;

    public static final class FingerprintGestureCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private FingerprintGestureCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.accessibilityservice.FingerprintGestureController.FingerprintGestureCallback wrap(android.accessibilityservice.FingerprintGestureController.FingerprintGestureCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.FingerprintGestureController.FingerprintGestureCallback(real, (__DcgwBridgeToken) null);
        }

        public android.accessibilityservice.FingerprintGestureController.FingerprintGestureCallback getReal() {
            return (android.accessibilityservice.FingerprintGestureController.FingerprintGestureCallback) real;
        }

        public android.accessibilityservice.FingerprintGestureController.FingerprintGestureCallback unwrap() {
            return getReal();
        }

        public void onGestureDetected(int arg0) {
            ((android.accessibilityservice.FingerprintGestureController.FingerprintGestureCallback) real).onGestureDetected(arg0);
        }

        public void onGestureDetectionAvailabilityChanged(boolean arg0) {
            ((android.accessibilityservice.FingerprintGestureController.FingerprintGestureCallback) real).onGestureDetectionAvailabilityChanged(arg0);
        }

    }
}
