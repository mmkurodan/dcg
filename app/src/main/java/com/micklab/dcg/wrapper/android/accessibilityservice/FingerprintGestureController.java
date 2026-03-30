// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accessibilityservice;

public final class FingerprintGestureController {
    private final android.accessibilityservice.FingerprintGestureController real;

    public FingerprintGestureController(android.accessibilityservice.FingerprintGestureController real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accessibilityservice.FingerprintGestureController wrap(android.accessibilityservice.FingerprintGestureController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.FingerprintGestureController(real);
    }

    public android.accessibilityservice.FingerprintGestureController unwrap() {
        return real;
    }

    public boolean isGestureDetectionAvailable() {
        return real.isGestureDetectionAvailable();
    }

    public void registerFingerprintGestureCallback(com.micklab.dcg.wrapper.android.accessibilityservice.FingerprintGestureController.FingerprintGestureCallback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.registerFingerprintGestureCallback(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void unregisterFingerprintGestureCallback(com.micklab.dcg.wrapper.android.accessibilityservice.FingerprintGestureController.FingerprintGestureCallback arg0) {
        real.unregisterFingerprintGestureCallback(arg0 == null ? null : arg0.unwrap());
    }

    public static final int FINGERPRINT_GESTURE_SWIPE_DOWN = android.accessibilityservice.FingerprintGestureController.FINGERPRINT_GESTURE_SWIPE_DOWN;
    public static final int FINGERPRINT_GESTURE_SWIPE_LEFT = android.accessibilityservice.FingerprintGestureController.FINGERPRINT_GESTURE_SWIPE_LEFT;
    public static final int FINGERPRINT_GESTURE_SWIPE_RIGHT = android.accessibilityservice.FingerprintGestureController.FINGERPRINT_GESTURE_SWIPE_RIGHT;
    public static final int FINGERPRINT_GESTURE_SWIPE_UP = android.accessibilityservice.FingerprintGestureController.FINGERPRINT_GESTURE_SWIPE_UP;

    public static final class FingerprintGestureCallback {
        private final android.accessibilityservice.FingerprintGestureController.FingerprintGestureCallback real;

        public FingerprintGestureCallback(android.accessibilityservice.FingerprintGestureController.FingerprintGestureCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.accessibilityservice.FingerprintGestureController.FingerprintGestureCallback wrap(android.accessibilityservice.FingerprintGestureController.FingerprintGestureCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.FingerprintGestureController.FingerprintGestureCallback(real);
        }

        public android.accessibilityservice.FingerprintGestureController.FingerprintGestureCallback unwrap() {
            return real;
        }

        public void onGestureDetected(int arg0) {
            real.onGestureDetected(arg0);
        }

        public void onGestureDetectionAvailabilityChanged(boolean arg0) {
            real.onGestureDetectionAvailabilityChanged(arg0);
        }

    }
}
