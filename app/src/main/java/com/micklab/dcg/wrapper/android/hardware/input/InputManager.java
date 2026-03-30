// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.input;

public final class InputManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InputManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.input.InputManager wrap(android.hardware.input.InputManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.input.InputManager(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.input.InputManager getReal() {
        return (android.hardware.input.InputManager) real;
    }

    public android.hardware.input.InputManager unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.hardware.input.HostUsiVersion getHostUsiVersion(com.micklab.dcg.wrapper.android.view.Display arg0) {
        return com.micklab.dcg.wrapper.android.hardware.input.HostUsiVersion.wrap(((android.hardware.input.InputManager) real).getHostUsiVersion(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.view.InputDevice getInputDevice(int arg0) {
        return com.micklab.dcg.wrapper.android.view.InputDevice.wrap(((android.hardware.input.InputManager) real).getInputDevice(arg0));
    }

    public int[] getInputDeviceIds() {
        return ((android.hardware.input.InputManager) real).getInputDeviceIds();
    }

    public com.micklab.dcg.wrapper.android.view.InputDevice.ViewBehavior getInputDeviceViewBehavior(int arg0) {
        return com.micklab.dcg.wrapper.android.view.InputDevice.ViewBehavior.wrap(((android.hardware.input.InputManager) real).getInputDeviceViewBehavior(arg0));
    }

    public float getMaximumObscuringOpacityForTouch() {
        return ((android.hardware.input.InputManager) real).getMaximumObscuringOpacityForTouch();
    }

    public boolean isStylusPointerIconEnabled() {
        return ((android.hardware.input.InputManager) real).isStylusPointerIconEnabled();
    }

    public void registerInputDeviceListener(com.micklab.dcg.wrapper.android.hardware.input.InputManager.InputDeviceListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.hardware.input.InputManager) real).registerInputDeviceListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void unregisterInputDeviceListener(com.micklab.dcg.wrapper.android.hardware.input.InputManager.InputDeviceListener arg0) {
        ((android.hardware.input.InputManager) real).unregisterInputDeviceListener(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.VerifiedInputEvent verifyInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
        return com.micklab.dcg.wrapper.android.view.VerifiedInputEvent.wrap(((android.hardware.input.InputManager) real).verifyInputEvent(arg0 == null ? null : arg0.getReal()));
    }

    public static final java.lang.String ACTION_QUERY_KEYBOARD_LAYOUTS = android.hardware.input.InputManager.ACTION_QUERY_KEYBOARD_LAYOUTS;
    public static final java.lang.String META_DATA_KEYBOARD_LAYOUTS = android.hardware.input.InputManager.META_DATA_KEYBOARD_LAYOUTS;

    public static final class InputDeviceListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private InputDeviceListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.input.InputManager.InputDeviceListener wrap(android.hardware.input.InputManager.InputDeviceListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.input.InputManager.InputDeviceListener(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.input.InputManager.InputDeviceListener getReal() {
            return (android.hardware.input.InputManager.InputDeviceListener) real;
        }

        public android.hardware.input.InputManager.InputDeviceListener unwrap() {
            return getReal();
        }

        public void onInputDeviceAdded(int arg0) {
            ((android.hardware.input.InputManager.InputDeviceListener) real).onInputDeviceAdded(arg0);
        }

        public void onInputDeviceChanged(int arg0) {
            ((android.hardware.input.InputManager.InputDeviceListener) real).onInputDeviceChanged(arg0);
        }

        public void onInputDeviceRemoved(int arg0) {
            ((android.hardware.input.InputManager.InputDeviceListener) real).onInputDeviceRemoved(arg0);
        }

    }
}
