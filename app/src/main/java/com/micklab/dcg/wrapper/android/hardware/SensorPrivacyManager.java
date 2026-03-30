// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class SensorPrivacyManager {
    private final android.hardware.SensorPrivacyManager real;

    public SensorPrivacyManager(android.hardware.SensorPrivacyManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.SensorPrivacyManager wrap(android.hardware.SensorPrivacyManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.SensorPrivacyManager(real);
    }

    public android.hardware.SensorPrivacyManager unwrap() {
        return real;
    }

    public boolean supportsSensorToggle(int arg0) {
        return real.supportsSensorToggle(arg0);
    }

    public boolean supportsSensorToggle(int arg0, int arg1) {
        return real.supportsSensorToggle(arg0, arg1);
    }

    public static final int TOGGLE_TYPE_HARDWARE = android.hardware.SensorPrivacyManager.TOGGLE_TYPE_HARDWARE;
    public static final int TOGGLE_TYPE_SOFTWARE = android.hardware.SensorPrivacyManager.TOGGLE_TYPE_SOFTWARE;

    public static final class Sensors {
        private final android.hardware.SensorPrivacyManager.Sensors real;

        public Sensors(android.hardware.SensorPrivacyManager.Sensors real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.SensorPrivacyManager.Sensors wrap(android.hardware.SensorPrivacyManager.Sensors real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.SensorPrivacyManager.Sensors(real);
        }

        public android.hardware.SensorPrivacyManager.Sensors unwrap() {
            return real;
        }

        public static final int CAMERA = android.hardware.SensorPrivacyManager.Sensors.CAMERA;
        public static final int MICROPHONE = android.hardware.SensorPrivacyManager.Sensors.MICROPHONE;

    }
}
