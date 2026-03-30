// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class SensorPrivacyManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SensorPrivacyManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.SensorPrivacyManager wrap(android.hardware.SensorPrivacyManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.SensorPrivacyManager(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.SensorPrivacyManager getReal() {
        return (android.hardware.SensorPrivacyManager) real;
    }

    public android.hardware.SensorPrivacyManager unwrap() {
        return getReal();
    }

    public boolean supportsSensorToggle(int arg0) {
        return ((android.hardware.SensorPrivacyManager) real).supportsSensorToggle(arg0);
    }

    public boolean supportsSensorToggle(int arg0, int arg1) {
        return ((android.hardware.SensorPrivacyManager) real).supportsSensorToggle(arg0, arg1);
    }

    public static final int TOGGLE_TYPE_HARDWARE = android.hardware.SensorPrivacyManager.TOGGLE_TYPE_HARDWARE;
    public static final int TOGGLE_TYPE_SOFTWARE = android.hardware.SensorPrivacyManager.TOGGLE_TYPE_SOFTWARE;

    public static final class Sensors {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Sensors(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.SensorPrivacyManager.Sensors wrap(android.hardware.SensorPrivacyManager.Sensors real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.SensorPrivacyManager.Sensors(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.SensorPrivacyManager.Sensors getReal() {
            return (android.hardware.SensorPrivacyManager.Sensors) real;
        }

        public android.hardware.SensorPrivacyManager.Sensors unwrap() {
            return getReal();
        }

        public static final int CAMERA = android.hardware.SensorPrivacyManager.Sensors.CAMERA;
        public static final int MICROPHONE = android.hardware.SensorPrivacyManager.Sensors.MICROPHONE;

    }
}
