// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class InputDevice {
    private final android.view.InputDevice real;

    public InputDevice(android.view.InputDevice real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.InputDevice wrap(android.view.InputDevice real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.InputDevice(real);
    }

    public android.view.InputDevice unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.hardware.BatteryState getBatteryState() {
        return com.micklab.dcg.wrapper.android.hardware.BatteryState.wrap(real.getBatteryState());
    }

    public int getControllerNumber() {
        return real.getControllerNumber();
    }

    public java.lang.String getDescriptor() {
        return real.getDescriptor();
    }

    public static com.micklab.dcg.wrapper.android.view.InputDevice getDevice(int arg0) {
        return com.micklab.dcg.wrapper.android.view.InputDevice.wrap(android.view.InputDevice.getDevice(arg0));
    }

    public static int[] getDeviceIds() {
        return android.view.InputDevice.getDeviceIds();
    }

    public int getId() {
        return real.getId();
    }

    public com.micklab.dcg.wrapper.android.view.KeyCharacterMap getKeyCharacterMap() {
        return com.micklab.dcg.wrapper.android.view.KeyCharacterMap.wrap(real.getKeyCharacterMap());
    }

    public int getKeyCodeForKeyLocation(int arg0) {
        return real.getKeyCodeForKeyLocation(arg0);
    }

    public int getKeyboardType() {
        return real.getKeyboardType();
    }

    public com.micklab.dcg.wrapper.android.hardware.lights.LightsManager getLightsManager() {
        return com.micklab.dcg.wrapper.android.hardware.lights.LightsManager.wrap(real.getLightsManager());
    }

    public com.micklab.dcg.wrapper.android.view.InputDevice.MotionRange getMotionRange(int arg0) {
        return com.micklab.dcg.wrapper.android.view.InputDevice.MotionRange.wrap(real.getMotionRange(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.InputDevice.MotionRange getMotionRange(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.view.InputDevice.MotionRange.wrap(real.getMotionRange(arg0, arg1));
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public int getProductId() {
        return real.getProductId();
    }

    public com.micklab.dcg.wrapper.android.hardware.SensorManager getSensorManager() {
        return com.micklab.dcg.wrapper.android.hardware.SensorManager.wrap(real.getSensorManager());
    }

    public int getSources() {
        return real.getSources();
    }

    public int getVendorId() {
        return real.getVendorId();
    }

    public com.micklab.dcg.wrapper.android.os.Vibrator getVibrator() {
        return com.micklab.dcg.wrapper.android.os.Vibrator.wrap(real.getVibrator());
    }

    public com.micklab.dcg.wrapper.android.os.VibratorManager getVibratorManager() {
        return com.micklab.dcg.wrapper.android.os.VibratorManager.wrap(real.getVibratorManager());
    }

    public boolean[] hasKeys(int... arg0) {
        return real.hasKeys(arg0);
    }

    public boolean hasMicrophone() {
        return real.hasMicrophone();
    }

    public boolean isEnabled() {
        return real.isEnabled();
    }

    public boolean isExternal() {
        return real.isExternal();
    }

    public boolean isVirtual() {
        return real.isVirtual();
    }

    public boolean supportsSource(int arg0) {
        return real.supportsSource(arg0);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int KEYBOARD_TYPE_ALPHABETIC = android.view.InputDevice.KEYBOARD_TYPE_ALPHABETIC;
    public static final int KEYBOARD_TYPE_NONE = android.view.InputDevice.KEYBOARD_TYPE_NONE;
    public static final int KEYBOARD_TYPE_NON_ALPHABETIC = android.view.InputDevice.KEYBOARD_TYPE_NON_ALPHABETIC;
    public static final int MOTION_RANGE_ORIENTATION = android.view.InputDevice.MOTION_RANGE_ORIENTATION;
    public static final int MOTION_RANGE_PRESSURE = android.view.InputDevice.MOTION_RANGE_PRESSURE;
    public static final int MOTION_RANGE_SIZE = android.view.InputDevice.MOTION_RANGE_SIZE;
    public static final int MOTION_RANGE_TOOL_MAJOR = android.view.InputDevice.MOTION_RANGE_TOOL_MAJOR;
    public static final int MOTION_RANGE_TOOL_MINOR = android.view.InputDevice.MOTION_RANGE_TOOL_MINOR;
    public static final int MOTION_RANGE_TOUCH_MAJOR = android.view.InputDevice.MOTION_RANGE_TOUCH_MAJOR;
    public static final int MOTION_RANGE_TOUCH_MINOR = android.view.InputDevice.MOTION_RANGE_TOUCH_MINOR;
    public static final int MOTION_RANGE_X = android.view.InputDevice.MOTION_RANGE_X;
    public static final int MOTION_RANGE_Y = android.view.InputDevice.MOTION_RANGE_Y;
    public static final int SOURCE_ANY = android.view.InputDevice.SOURCE_ANY;
    public static final int SOURCE_BLUETOOTH_STYLUS = android.view.InputDevice.SOURCE_BLUETOOTH_STYLUS;
    public static final int SOURCE_CLASS_BUTTON = android.view.InputDevice.SOURCE_CLASS_BUTTON;
    public static final int SOURCE_CLASS_JOYSTICK = android.view.InputDevice.SOURCE_CLASS_JOYSTICK;
    public static final int SOURCE_CLASS_MASK = android.view.InputDevice.SOURCE_CLASS_MASK;
    public static final int SOURCE_CLASS_NONE = android.view.InputDevice.SOURCE_CLASS_NONE;
    public static final int SOURCE_CLASS_POINTER = android.view.InputDevice.SOURCE_CLASS_POINTER;
    public static final int SOURCE_CLASS_POSITION = android.view.InputDevice.SOURCE_CLASS_POSITION;
    public static final int SOURCE_CLASS_TRACKBALL = android.view.InputDevice.SOURCE_CLASS_TRACKBALL;
    public static final int SOURCE_DPAD = android.view.InputDevice.SOURCE_DPAD;
    public static final int SOURCE_GAMEPAD = android.view.InputDevice.SOURCE_GAMEPAD;
    public static final int SOURCE_HDMI = android.view.InputDevice.SOURCE_HDMI;
    public static final int SOURCE_JOYSTICK = android.view.InputDevice.SOURCE_JOYSTICK;
    public static final int SOURCE_KEYBOARD = android.view.InputDevice.SOURCE_KEYBOARD;
    public static final int SOURCE_MOUSE = android.view.InputDevice.SOURCE_MOUSE;
    public static final int SOURCE_MOUSE_RELATIVE = android.view.InputDevice.SOURCE_MOUSE_RELATIVE;
    public static final int SOURCE_ROTARY_ENCODER = android.view.InputDevice.SOURCE_ROTARY_ENCODER;
    public static final int SOURCE_SENSOR = android.view.InputDevice.SOURCE_SENSOR;
    public static final int SOURCE_STYLUS = android.view.InputDevice.SOURCE_STYLUS;
    public static final int SOURCE_TOUCHPAD = android.view.InputDevice.SOURCE_TOUCHPAD;
    public static final int SOURCE_TOUCHSCREEN = android.view.InputDevice.SOURCE_TOUCHSCREEN;
    public static final int SOURCE_TOUCH_NAVIGATION = android.view.InputDevice.SOURCE_TOUCH_NAVIGATION;
    public static final int SOURCE_TRACKBALL = android.view.InputDevice.SOURCE_TRACKBALL;
    public static final int SOURCE_UNKNOWN = android.view.InputDevice.SOURCE_UNKNOWN;

    public static final class MotionRange {
        private final android.view.InputDevice.MotionRange real;

        public MotionRange(android.view.InputDevice.MotionRange real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.InputDevice.MotionRange wrap(android.view.InputDevice.MotionRange real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.InputDevice.MotionRange(real);
        }

        public android.view.InputDevice.MotionRange unwrap() {
            return real;
        }

        public int getAxis() {
            return real.getAxis();
        }

        public float getFlat() {
            return real.getFlat();
        }

        public float getFuzz() {
            return real.getFuzz();
        }

        public float getMax() {
            return real.getMax();
        }

        public float getMin() {
            return real.getMin();
        }

        public float getRange() {
            return real.getRange();
        }

        public float getResolution() {
            return real.getResolution();
        }

        public int getSource() {
            return real.getSource();
        }

        public boolean isFromSource(int arg0) {
            return real.isFromSource(arg0);
        }

    }
    public static final class ViewBehavior {
        private final android.view.InputDevice.ViewBehavior real;

        public ViewBehavior(android.view.InputDevice.ViewBehavior real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.InputDevice.ViewBehavior wrap(android.view.InputDevice.ViewBehavior real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.InputDevice.ViewBehavior(real);
        }

        public android.view.InputDevice.ViewBehavior unwrap() {
            return real;
        }

        public boolean shouldSmoothScroll(int arg0, int arg1) {
            return real.shouldSmoothScroll(arg0, arg1);
        }

    }
}
