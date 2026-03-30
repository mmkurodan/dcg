// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accessibilityservice;

public final class AccessibilityButtonController {
    private final android.accessibilityservice.AccessibilityButtonController real;

    public AccessibilityButtonController(android.accessibilityservice.AccessibilityButtonController real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityButtonController wrap(android.accessibilityservice.AccessibilityButtonController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityButtonController(real);
    }

    public android.accessibilityservice.AccessibilityButtonController unwrap() {
        return real;
    }

    public boolean isAccessibilityButtonAvailable() {
        return real.isAccessibilityButtonAvailable();
    }

    public void registerAccessibilityButtonCallback(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback arg0) {
        real.registerAccessibilityButtonCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void registerAccessibilityButtonCallback(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.registerAccessibilityButtonCallback(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void unregisterAccessibilityButtonCallback(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback arg0) {
        real.unregisterAccessibilityButtonCallback(arg0 == null ? null : arg0.unwrap());
    }

    public static final class AccessibilityButtonCallback {
        private final android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback real;

        public AccessibilityButtonCallback(android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback wrap(android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback(real);
        }

        public android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback unwrap() {
            return real;
        }

        public void onAvailabilityChanged(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityButtonController arg0, boolean arg1) {
            real.onAvailabilityChanged(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void onClicked(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityButtonController arg0) {
            real.onClicked(arg0 == null ? null : arg0.unwrap());
        }

    }
}
