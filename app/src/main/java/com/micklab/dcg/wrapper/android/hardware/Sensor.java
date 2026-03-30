// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class Sensor {
    private final android.hardware.Sensor real;

    public Sensor(android.hardware.Sensor real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.Sensor wrap(android.hardware.Sensor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.Sensor(real);
    }

    public android.hardware.Sensor unwrap() {
        return real;
    }

    public int getFifoMaxEventCount() {
        return real.getFifoMaxEventCount();
    }

    public int getFifoReservedEventCount() {
        return real.getFifoReservedEventCount();
    }

    public int getHighestDirectReportRateLevel() {
        return real.getHighestDirectReportRateLevel();
    }

    public int getId() {
        return real.getId();
    }

    public int getMaxDelay() {
        return real.getMaxDelay();
    }

    public float getMaximumRange() {
        return real.getMaximumRange();
    }

    public int getMinDelay() {
        return real.getMinDelay();
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public float getPower() {
        return real.getPower();
    }

    public int getReportingMode() {
        return real.getReportingMode();
    }

    public float getResolution() {
        return real.getResolution();
    }

    public java.lang.String getStringType() {
        return real.getStringType();
    }

    public int getType() {
        return real.getType();
    }

    public java.lang.String getVendor() {
        return real.getVendor();
    }

    public int getVersion() {
        return real.getVersion();
    }

    public boolean isAdditionalInfoSupported() {
        return real.isAdditionalInfoSupported();
    }

    public boolean isDirectChannelTypeSupported(int arg0) {
        return real.isDirectChannelTypeSupported(arg0);
    }

    public boolean isDynamicSensor() {
        return real.isDynamicSensor();
    }

    public boolean isWakeUpSensor() {
        return real.isWakeUpSensor();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final int REPORTING_MODE_CONTINUOUS = android.hardware.Sensor.REPORTING_MODE_CONTINUOUS;
    public static final int REPORTING_MODE_ONE_SHOT = android.hardware.Sensor.REPORTING_MODE_ONE_SHOT;
    public static final int REPORTING_MODE_ON_CHANGE = android.hardware.Sensor.REPORTING_MODE_ON_CHANGE;
    public static final int REPORTING_MODE_SPECIAL_TRIGGER = android.hardware.Sensor.REPORTING_MODE_SPECIAL_TRIGGER;
    public static final java.lang.String STRING_TYPE_ACCELEROMETER = android.hardware.Sensor.STRING_TYPE_ACCELEROMETER;
    public static final java.lang.String STRING_TYPE_ACCELEROMETER_LIMITED_AXES = android.hardware.Sensor.STRING_TYPE_ACCELEROMETER_LIMITED_AXES;
    public static final java.lang.String STRING_TYPE_ACCELEROMETER_LIMITED_AXES_UNCALIBRATED = android.hardware.Sensor.STRING_TYPE_ACCELEROMETER_LIMITED_AXES_UNCALIBRATED;
    public static final java.lang.String STRING_TYPE_ACCELEROMETER_UNCALIBRATED = android.hardware.Sensor.STRING_TYPE_ACCELEROMETER_UNCALIBRATED;
    public static final java.lang.String STRING_TYPE_AMBIENT_TEMPERATURE = android.hardware.Sensor.STRING_TYPE_AMBIENT_TEMPERATURE;
    public static final java.lang.String STRING_TYPE_GAME_ROTATION_VECTOR = android.hardware.Sensor.STRING_TYPE_GAME_ROTATION_VECTOR;
    public static final java.lang.String STRING_TYPE_GEOMAGNETIC_ROTATION_VECTOR = android.hardware.Sensor.STRING_TYPE_GEOMAGNETIC_ROTATION_VECTOR;
    public static final java.lang.String STRING_TYPE_GRAVITY = android.hardware.Sensor.STRING_TYPE_GRAVITY;
    public static final java.lang.String STRING_TYPE_GYROSCOPE = android.hardware.Sensor.STRING_TYPE_GYROSCOPE;
    public static final java.lang.String STRING_TYPE_GYROSCOPE_LIMITED_AXES = android.hardware.Sensor.STRING_TYPE_GYROSCOPE_LIMITED_AXES;
    public static final java.lang.String STRING_TYPE_GYROSCOPE_LIMITED_AXES_UNCALIBRATED = android.hardware.Sensor.STRING_TYPE_GYROSCOPE_LIMITED_AXES_UNCALIBRATED;
    public static final java.lang.String STRING_TYPE_GYROSCOPE_UNCALIBRATED = android.hardware.Sensor.STRING_TYPE_GYROSCOPE_UNCALIBRATED;
    public static final java.lang.String STRING_TYPE_HEADING = android.hardware.Sensor.STRING_TYPE_HEADING;
    public static final java.lang.String STRING_TYPE_HEAD_TRACKER = android.hardware.Sensor.STRING_TYPE_HEAD_TRACKER;
    public static final java.lang.String STRING_TYPE_HEART_BEAT = android.hardware.Sensor.STRING_TYPE_HEART_BEAT;
    public static final java.lang.String STRING_TYPE_HEART_RATE = android.hardware.Sensor.STRING_TYPE_HEART_RATE;
    public static final java.lang.String STRING_TYPE_HINGE_ANGLE = android.hardware.Sensor.STRING_TYPE_HINGE_ANGLE;
    public static final java.lang.String STRING_TYPE_LIGHT = android.hardware.Sensor.STRING_TYPE_LIGHT;
    public static final java.lang.String STRING_TYPE_LINEAR_ACCELERATION = android.hardware.Sensor.STRING_TYPE_LINEAR_ACCELERATION;
    public static final java.lang.String STRING_TYPE_LOW_LATENCY_OFFBODY_DETECT = android.hardware.Sensor.STRING_TYPE_LOW_LATENCY_OFFBODY_DETECT;
    public static final java.lang.String STRING_TYPE_MAGNETIC_FIELD = android.hardware.Sensor.STRING_TYPE_MAGNETIC_FIELD;
    public static final java.lang.String STRING_TYPE_MAGNETIC_FIELD_UNCALIBRATED = android.hardware.Sensor.STRING_TYPE_MAGNETIC_FIELD_UNCALIBRATED;
    public static final java.lang.String STRING_TYPE_MOTION_DETECT = android.hardware.Sensor.STRING_TYPE_MOTION_DETECT;
    public static final java.lang.String STRING_TYPE_ORIENTATION = android.hardware.Sensor.STRING_TYPE_ORIENTATION;
    public static final java.lang.String STRING_TYPE_POSE_6DOF = android.hardware.Sensor.STRING_TYPE_POSE_6DOF;
    public static final java.lang.String STRING_TYPE_PRESSURE = android.hardware.Sensor.STRING_TYPE_PRESSURE;
    public static final java.lang.String STRING_TYPE_PROXIMITY = android.hardware.Sensor.STRING_TYPE_PROXIMITY;
    public static final java.lang.String STRING_TYPE_RELATIVE_HUMIDITY = android.hardware.Sensor.STRING_TYPE_RELATIVE_HUMIDITY;
    public static final java.lang.String STRING_TYPE_ROTATION_VECTOR = android.hardware.Sensor.STRING_TYPE_ROTATION_VECTOR;
    public static final java.lang.String STRING_TYPE_SIGNIFICANT_MOTION = android.hardware.Sensor.STRING_TYPE_SIGNIFICANT_MOTION;
    public static final java.lang.String STRING_TYPE_STATIONARY_DETECT = android.hardware.Sensor.STRING_TYPE_STATIONARY_DETECT;
    public static final java.lang.String STRING_TYPE_STEP_COUNTER = android.hardware.Sensor.STRING_TYPE_STEP_COUNTER;
    public static final java.lang.String STRING_TYPE_STEP_DETECTOR = android.hardware.Sensor.STRING_TYPE_STEP_DETECTOR;
    public static final java.lang.String STRING_TYPE_TEMPERATURE = android.hardware.Sensor.STRING_TYPE_TEMPERATURE;
    public static final int TYPE_ACCELEROMETER = android.hardware.Sensor.TYPE_ACCELEROMETER;
    public static final int TYPE_ACCELEROMETER_LIMITED_AXES = android.hardware.Sensor.TYPE_ACCELEROMETER_LIMITED_AXES;
    public static final int TYPE_ACCELEROMETER_LIMITED_AXES_UNCALIBRATED = android.hardware.Sensor.TYPE_ACCELEROMETER_LIMITED_AXES_UNCALIBRATED;
    public static final int TYPE_ACCELEROMETER_UNCALIBRATED = android.hardware.Sensor.TYPE_ACCELEROMETER_UNCALIBRATED;
    public static final int TYPE_ALL = android.hardware.Sensor.TYPE_ALL;
    public static final int TYPE_AMBIENT_TEMPERATURE = android.hardware.Sensor.TYPE_AMBIENT_TEMPERATURE;
    public static final int TYPE_DEVICE_PRIVATE_BASE = android.hardware.Sensor.TYPE_DEVICE_PRIVATE_BASE;
    public static final int TYPE_GAME_ROTATION_VECTOR = android.hardware.Sensor.TYPE_GAME_ROTATION_VECTOR;
    public static final int TYPE_GEOMAGNETIC_ROTATION_VECTOR = android.hardware.Sensor.TYPE_GEOMAGNETIC_ROTATION_VECTOR;
    public static final int TYPE_GRAVITY = android.hardware.Sensor.TYPE_GRAVITY;
    public static final int TYPE_GYROSCOPE = android.hardware.Sensor.TYPE_GYROSCOPE;
    public static final int TYPE_GYROSCOPE_LIMITED_AXES = android.hardware.Sensor.TYPE_GYROSCOPE_LIMITED_AXES;
    public static final int TYPE_GYROSCOPE_LIMITED_AXES_UNCALIBRATED = android.hardware.Sensor.TYPE_GYROSCOPE_LIMITED_AXES_UNCALIBRATED;
    public static final int TYPE_GYROSCOPE_UNCALIBRATED = android.hardware.Sensor.TYPE_GYROSCOPE_UNCALIBRATED;
    public static final int TYPE_HEADING = android.hardware.Sensor.TYPE_HEADING;
    public static final int TYPE_HEAD_TRACKER = android.hardware.Sensor.TYPE_HEAD_TRACKER;
    public static final int TYPE_HEART_BEAT = android.hardware.Sensor.TYPE_HEART_BEAT;
    public static final int TYPE_HEART_RATE = android.hardware.Sensor.TYPE_HEART_RATE;
    public static final int TYPE_HINGE_ANGLE = android.hardware.Sensor.TYPE_HINGE_ANGLE;
    public static final int TYPE_LIGHT = android.hardware.Sensor.TYPE_LIGHT;
    public static final int TYPE_LINEAR_ACCELERATION = android.hardware.Sensor.TYPE_LINEAR_ACCELERATION;
    public static final int TYPE_LOW_LATENCY_OFFBODY_DETECT = android.hardware.Sensor.TYPE_LOW_LATENCY_OFFBODY_DETECT;
    public static final int TYPE_MAGNETIC_FIELD = android.hardware.Sensor.TYPE_MAGNETIC_FIELD;
    public static final int TYPE_MAGNETIC_FIELD_UNCALIBRATED = android.hardware.Sensor.TYPE_MAGNETIC_FIELD_UNCALIBRATED;
    public static final int TYPE_MOTION_DETECT = android.hardware.Sensor.TYPE_MOTION_DETECT;
    public static final int TYPE_ORIENTATION = android.hardware.Sensor.TYPE_ORIENTATION;
    public static final int TYPE_POSE_6DOF = android.hardware.Sensor.TYPE_POSE_6DOF;
    public static final int TYPE_PRESSURE = android.hardware.Sensor.TYPE_PRESSURE;
    public static final int TYPE_PROXIMITY = android.hardware.Sensor.TYPE_PROXIMITY;
    public static final int TYPE_RELATIVE_HUMIDITY = android.hardware.Sensor.TYPE_RELATIVE_HUMIDITY;
    public static final int TYPE_ROTATION_VECTOR = android.hardware.Sensor.TYPE_ROTATION_VECTOR;
    public static final int TYPE_SIGNIFICANT_MOTION = android.hardware.Sensor.TYPE_SIGNIFICANT_MOTION;
    public static final int TYPE_STATIONARY_DETECT = android.hardware.Sensor.TYPE_STATIONARY_DETECT;
    public static final int TYPE_STEP_COUNTER = android.hardware.Sensor.TYPE_STEP_COUNTER;
    public static final int TYPE_STEP_DETECTOR = android.hardware.Sensor.TYPE_STEP_DETECTOR;
    public static final int TYPE_TEMPERATURE = android.hardware.Sensor.TYPE_TEMPERATURE;

}
