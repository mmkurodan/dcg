// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.input;

public final class InputManager {
    private final android.hardware.input.InputManager real;

    public InputManager(android.hardware.input.InputManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.input.InputManager wrap(android.hardware.input.InputManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.input.InputManager(real);
    }

    public android.hardware.input.InputManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.hardware.input.HostUsiVersion getHostUsiVersion(com.micklab.dcg.wrapper.android.view.Display arg0) {
        return com.micklab.dcg.wrapper.android.hardware.input.HostUsiVersion.wrap(real.getHostUsiVersion(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.InputDevice getInputDevice(int arg0) {
        return com.micklab.dcg.wrapper.android.view.InputDevice.wrap(real.getInputDevice(arg0));
    }

    public int[] getInputDeviceIds() {
        return real.getInputDeviceIds();
    }

    public com.micklab.dcg.wrapper.android.view.InputDevice.ViewBehavior getInputDeviceViewBehavior(int arg0) {
        return com.micklab.dcg.wrapper.android.view.InputDevice.ViewBehavior.wrap(real.getInputDeviceViewBehavior(arg0));
    }

    public float getMaximumObscuringOpacityForTouch() {
        return real.getMaximumObscuringOpacityForTouch();
    }

    public boolean isStylusPointerIconEnabled() {
        return real.isStylusPointerIconEnabled();
    }

    public void registerInputDeviceListener(com.micklab.dcg.wrapper.android.hardware.input.InputManager.InputDeviceListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.registerInputDeviceListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void unregisterInputDeviceListener(com.micklab.dcg.wrapper.android.hardware.input.InputManager.InputDeviceListener arg0) {
        real.unregisterInputDeviceListener(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.VerifiedInputEvent verifyInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
        return com.micklab.dcg.wrapper.android.view.VerifiedInputEvent.wrap(real.verifyInputEvent(arg0 == null ? null : arg0.unwrap()));
    }

    public static final java.lang.String ACTION_QUERY_KEYBOARD_LAYOUTS = android.hardware.input.InputManager.ACTION_QUERY_KEYBOARD_LAYOUTS;
    public static final java.lang.String META_DATA_KEYBOARD_LAYOUTS = android.hardware.input.InputManager.META_DATA_KEYBOARD_LAYOUTS;

    public static final class InputDeviceListener {
        private final android.hardware.input.InputManager.InputDeviceListener real;

        public InputDeviceListener(android.hardware.input.InputManager.InputDeviceListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.input.InputManager.InputDeviceListener wrap(android.hardware.input.InputManager.InputDeviceListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.input.InputManager.InputDeviceListener(real);
        }

        public android.hardware.input.InputManager.InputDeviceListener unwrap() {
            return real;
        }

        public void onInputDeviceAdded(int arg0) {
            real.onInputDeviceAdded(arg0);
        }

        public void onInputDeviceChanged(int arg0) {
            real.onInputDeviceChanged(arg0);
        }

        public void onInputDeviceRemoved(int arg0) {
            real.onInputDeviceRemoved(arg0);
        }

    }
}
