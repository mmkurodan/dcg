// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accessibilityservice;

public final class AccessibilityButtonController {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AccessibilityButtonController(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityButtonController wrap(android.accessibilityservice.AccessibilityButtonController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityButtonController(real, (__DcgwBridgeToken) null);
    }

    public android.accessibilityservice.AccessibilityButtonController getReal() {
        return (android.accessibilityservice.AccessibilityButtonController) real;
    }

    public android.accessibilityservice.AccessibilityButtonController unwrap() {
        return getReal();
    }

    public boolean isAccessibilityButtonAvailable() {
        return ((android.accessibilityservice.AccessibilityButtonController) real).isAccessibilityButtonAvailable();
    }

    public void registerAccessibilityButtonCallback(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback arg0) {
        ((android.accessibilityservice.AccessibilityButtonController) real).registerAccessibilityButtonCallback(arg0 == null ? null : arg0.getReal());
    }

    public void registerAccessibilityButtonCallback(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.accessibilityservice.AccessibilityButtonController) real).registerAccessibilityButtonCallback(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void unregisterAccessibilityButtonCallback(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback arg0) {
        ((android.accessibilityservice.AccessibilityButtonController) real).unregisterAccessibilityButtonCallback(arg0 == null ? null : arg0.getReal());
    }

    public static final class AccessibilityButtonCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AccessibilityButtonCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback wrap(android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback(real, (__DcgwBridgeToken) null);
        }

        public android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback getReal() {
            return (android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback) real;
        }

        public android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback unwrap() {
            return getReal();
        }

        public void onAvailabilityChanged(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityButtonController arg0, boolean arg1) {
            ((android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback) real).onAvailabilityChanged(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onClicked(com.micklab.dcg.wrapper.android.accessibilityservice.AccessibilityButtonController arg0) {
            ((android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback) real).onClicked(arg0 == null ? null : arg0.getReal());
        }

    }
}
