// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class SensorManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SensorManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.SensorManager wrap(android.hardware.SensorManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.SensorManager(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.SensorManager getReal() {
        return (android.hardware.SensorManager) real;
    }

    public android.hardware.SensorManager unwrap() {
        return getReal();
    }

    public boolean cancelTriggerSensor(com.micklab.dcg.wrapper.android.hardware.TriggerEventListener arg0, com.micklab.dcg.wrapper.android.hardware.Sensor arg1) {
        return ((android.hardware.SensorManager) real).cancelTriggerSensor(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.hardware.SensorDirectChannel createDirectChannel(com.micklab.dcg.wrapper.android.hardware.HardwareBuffer arg0) {
        return com.micklab.dcg.wrapper.android.hardware.SensorDirectChannel.wrap(((android.hardware.SensorManager) real).createDirectChannel(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.hardware.SensorDirectChannel createDirectChannel(com.micklab.dcg.wrapper.android.os.MemoryFile arg0) {
        return com.micklab.dcg.wrapper.android.hardware.SensorDirectChannel.wrap(((android.hardware.SensorManager) real).createDirectChannel(arg0 == null ? null : arg0.getReal()));
    }

    public boolean flush(com.micklab.dcg.wrapper.android.hardware.SensorEventListener arg0) {
        return ((android.hardware.SensorManager) real).flush(arg0 == null ? null : arg0.getReal());
    }

    public static float getAltitude(float arg0, float arg1) {
        return android.hardware.SensorManager.getAltitude(arg0, arg1);
    }

    public static void getAngleChange(float[] arg0, float[] arg1, float[] arg2) {
        android.hardware.SensorManager.getAngleChange(arg0, arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.hardware.Sensor getDefaultSensor(int arg0) {
        return com.micklab.dcg.wrapper.android.hardware.Sensor.wrap(((android.hardware.SensorManager) real).getDefaultSensor(arg0));
    }

    public com.micklab.dcg.wrapper.android.hardware.Sensor getDefaultSensor(int arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.hardware.Sensor.wrap(((android.hardware.SensorManager) real).getDefaultSensor(arg0, arg1));
    }

    public static float getInclination(float[] arg0) {
        return android.hardware.SensorManager.getInclination(arg0);
    }

    public static float[] getOrientation(float[] arg0, float[] arg1) {
        return android.hardware.SensorManager.getOrientation(arg0, arg1);
    }

    public static void getQuaternionFromVector(float[] arg0, float[] arg1) {
        android.hardware.SensorManager.getQuaternionFromVector(arg0, arg1);
    }

    public static boolean getRotationMatrix(float[] arg0, float[] arg1, float[] arg2, float[] arg3) {
        return android.hardware.SensorManager.getRotationMatrix(arg0, arg1, arg2, arg3);
    }

    public static void getRotationMatrixFromVector(float[] arg0, float[] arg1) {
        android.hardware.SensorManager.getRotationMatrixFromVector(arg0, arg1);
    }

    public int getSensors() {
        return ((android.hardware.SensorManager) real).getSensors();
    }

    public boolean isDynamicSensorDiscoverySupported() {
        return ((android.hardware.SensorManager) real).isDynamicSensorDiscoverySupported();
    }

    public void registerDynamicSensorCallback(com.micklab.dcg.wrapper.android.hardware.SensorManager.DynamicSensorCallback arg0) {
        ((android.hardware.SensorManager) real).registerDynamicSensorCallback(arg0 == null ? null : arg0.getReal());
    }

    public void registerDynamicSensorCallback(com.micklab.dcg.wrapper.android.hardware.SensorManager.DynamicSensorCallback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.hardware.SensorManager) real).registerDynamicSensorCallback(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean registerListener(com.micklab.dcg.wrapper.android.hardware.SensorListener arg0, int arg1) {
        return ((android.hardware.SensorManager) real).registerListener(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean registerListener(com.micklab.dcg.wrapper.android.hardware.SensorEventListener arg0, com.micklab.dcg.wrapper.android.hardware.Sensor arg1, int arg2) {
        return ((android.hardware.SensorManager) real).registerListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public boolean registerListener(com.micklab.dcg.wrapper.android.hardware.SensorListener arg0, int arg1, int arg2) {
        return ((android.hardware.SensorManager) real).registerListener(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public boolean registerListener(com.micklab.dcg.wrapper.android.hardware.SensorEventListener arg0, com.micklab.dcg.wrapper.android.hardware.Sensor arg1, int arg2, int arg3) {
        return ((android.hardware.SensorManager) real).registerListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

    public boolean registerListener(com.micklab.dcg.wrapper.android.hardware.SensorEventListener arg0, com.micklab.dcg.wrapper.android.hardware.Sensor arg1, int arg2, com.micklab.dcg.wrapper.android.os.Handler arg3) {
        return ((android.hardware.SensorManager) real).registerListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public boolean registerListener(com.micklab.dcg.wrapper.android.hardware.SensorEventListener arg0, com.micklab.dcg.wrapper.android.hardware.Sensor arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.os.Handler arg4) {
        return ((android.hardware.SensorManager) real).registerListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public static boolean remapCoordinateSystem(float[] arg0, int arg1, int arg2, float[] arg3) {
        return android.hardware.SensorManager.remapCoordinateSystem(arg0, arg1, arg2, arg3);
    }

    public boolean requestTriggerSensor(com.micklab.dcg.wrapper.android.hardware.TriggerEventListener arg0, com.micklab.dcg.wrapper.android.hardware.Sensor arg1) {
        return ((android.hardware.SensorManager) real).requestTriggerSensor(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void unregisterDynamicSensorCallback(com.micklab.dcg.wrapper.android.hardware.SensorManager.DynamicSensorCallback arg0) {
        ((android.hardware.SensorManager) real).unregisterDynamicSensorCallback(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterListener(com.micklab.dcg.wrapper.android.hardware.SensorEventListener arg0) {
        ((android.hardware.SensorManager) real).unregisterListener(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterListener(com.micklab.dcg.wrapper.android.hardware.SensorListener arg0) {
        ((android.hardware.SensorManager) real).unregisterListener(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterListener(com.micklab.dcg.wrapper.android.hardware.SensorListener arg0, int arg1) {
        ((android.hardware.SensorManager) real).unregisterListener(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void unregisterListener(com.micklab.dcg.wrapper.android.hardware.SensorEventListener arg0, com.micklab.dcg.wrapper.android.hardware.Sensor arg1) {
        ((android.hardware.SensorManager) real).unregisterListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public static final int AXIS_MINUS_X = android.hardware.SensorManager.AXIS_MINUS_X;
    public static final int AXIS_MINUS_Y = android.hardware.SensorManager.AXIS_MINUS_Y;
    public static final int AXIS_MINUS_Z = android.hardware.SensorManager.AXIS_MINUS_Z;
    public static final int AXIS_X = android.hardware.SensorManager.AXIS_X;
    public static final int AXIS_Y = android.hardware.SensorManager.AXIS_Y;
    public static final int AXIS_Z = android.hardware.SensorManager.AXIS_Z;
    public static final int DATA_X = android.hardware.SensorManager.DATA_X;
    public static final int DATA_Y = android.hardware.SensorManager.DATA_Y;
    public static final int DATA_Z = android.hardware.SensorManager.DATA_Z;
    public static final float GRAVITY_DEATH_STAR_I = android.hardware.SensorManager.GRAVITY_DEATH_STAR_I;
    public static final float GRAVITY_EARTH = android.hardware.SensorManager.GRAVITY_EARTH;
    public static final float GRAVITY_JUPITER = android.hardware.SensorManager.GRAVITY_JUPITER;
    public static final float GRAVITY_MARS = android.hardware.SensorManager.GRAVITY_MARS;
    public static final float GRAVITY_MERCURY = android.hardware.SensorManager.GRAVITY_MERCURY;
    public static final float GRAVITY_MOON = android.hardware.SensorManager.GRAVITY_MOON;
    public static final float GRAVITY_NEPTUNE = android.hardware.SensorManager.GRAVITY_NEPTUNE;
    public static final float GRAVITY_PLUTO = android.hardware.SensorManager.GRAVITY_PLUTO;
    public static final float GRAVITY_SATURN = android.hardware.SensorManager.GRAVITY_SATURN;
    public static final float GRAVITY_SUN = android.hardware.SensorManager.GRAVITY_SUN;
    public static final float GRAVITY_THE_ISLAND = android.hardware.SensorManager.GRAVITY_THE_ISLAND;
    public static final float GRAVITY_URANUS = android.hardware.SensorManager.GRAVITY_URANUS;
    public static final float GRAVITY_VENUS = android.hardware.SensorManager.GRAVITY_VENUS;
    public static final float LIGHT_CLOUDY = android.hardware.SensorManager.LIGHT_CLOUDY;
    public static final float LIGHT_FULLMOON = android.hardware.SensorManager.LIGHT_FULLMOON;
    public static final float LIGHT_NO_MOON = android.hardware.SensorManager.LIGHT_NO_MOON;
    public static final float LIGHT_OVERCAST = android.hardware.SensorManager.LIGHT_OVERCAST;
    public static final float LIGHT_SHADE = android.hardware.SensorManager.LIGHT_SHADE;
    public static final float LIGHT_SUNLIGHT = android.hardware.SensorManager.LIGHT_SUNLIGHT;
    public static final float LIGHT_SUNLIGHT_MAX = android.hardware.SensorManager.LIGHT_SUNLIGHT_MAX;
    public static final float LIGHT_SUNRISE = android.hardware.SensorManager.LIGHT_SUNRISE;
    public static final float MAGNETIC_FIELD_EARTH_MAX = android.hardware.SensorManager.MAGNETIC_FIELD_EARTH_MAX;
    public static final float MAGNETIC_FIELD_EARTH_MIN = android.hardware.SensorManager.MAGNETIC_FIELD_EARTH_MIN;
    public static final float PRESSURE_STANDARD_ATMOSPHERE = android.hardware.SensorManager.PRESSURE_STANDARD_ATMOSPHERE;
    public static final int RAW_DATA_INDEX = android.hardware.SensorManager.RAW_DATA_INDEX;
    public static final int RAW_DATA_X = android.hardware.SensorManager.RAW_DATA_X;
    public static final int RAW_DATA_Y = android.hardware.SensorManager.RAW_DATA_Y;
    public static final int RAW_DATA_Z = android.hardware.SensorManager.RAW_DATA_Z;
    public static final int SENSOR_ACCELEROMETER = android.hardware.SensorManager.SENSOR_ACCELEROMETER;
    public static final int SENSOR_ALL = android.hardware.SensorManager.SENSOR_ALL;
    public static final int SENSOR_DELAY_FASTEST = android.hardware.SensorManager.SENSOR_DELAY_FASTEST;
    public static final int SENSOR_DELAY_GAME = android.hardware.SensorManager.SENSOR_DELAY_GAME;
    public static final int SENSOR_DELAY_NORMAL = android.hardware.SensorManager.SENSOR_DELAY_NORMAL;
    public static final int SENSOR_DELAY_UI = android.hardware.SensorManager.SENSOR_DELAY_UI;
    public static final int SENSOR_LIGHT = android.hardware.SensorManager.SENSOR_LIGHT;
    public static final int SENSOR_MAGNETIC_FIELD = android.hardware.SensorManager.SENSOR_MAGNETIC_FIELD;
    public static final int SENSOR_MAX = android.hardware.SensorManager.SENSOR_MAX;
    public static final int SENSOR_MIN = android.hardware.SensorManager.SENSOR_MIN;
    public static final int SENSOR_ORIENTATION = android.hardware.SensorManager.SENSOR_ORIENTATION;
    public static final int SENSOR_ORIENTATION_RAW = android.hardware.SensorManager.SENSOR_ORIENTATION_RAW;
    public static final int SENSOR_PROXIMITY = android.hardware.SensorManager.SENSOR_PROXIMITY;
    public static final int SENSOR_STATUS_ACCURACY_HIGH = android.hardware.SensorManager.SENSOR_STATUS_ACCURACY_HIGH;
    public static final int SENSOR_STATUS_ACCURACY_LOW = android.hardware.SensorManager.SENSOR_STATUS_ACCURACY_LOW;
    public static final int SENSOR_STATUS_ACCURACY_MEDIUM = android.hardware.SensorManager.SENSOR_STATUS_ACCURACY_MEDIUM;
    public static final int SENSOR_STATUS_NO_CONTACT = android.hardware.SensorManager.SENSOR_STATUS_NO_CONTACT;
    public static final int SENSOR_STATUS_UNRELIABLE = android.hardware.SensorManager.SENSOR_STATUS_UNRELIABLE;
    public static final int SENSOR_TEMPERATURE = android.hardware.SensorManager.SENSOR_TEMPERATURE;
    public static final int SENSOR_TRICORDER = android.hardware.SensorManager.SENSOR_TRICORDER;
    public static final float STANDARD_GRAVITY = android.hardware.SensorManager.STANDARD_GRAVITY;

    public static final class DynamicSensorCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private DynamicSensorCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.SensorManager.DynamicSensorCallback wrap(android.hardware.SensorManager.DynamicSensorCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.SensorManager.DynamicSensorCallback(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.SensorManager.DynamicSensorCallback getReal() {
            return (android.hardware.SensorManager.DynamicSensorCallback) real;
        }

        public android.hardware.SensorManager.DynamicSensorCallback unwrap() {
            return getReal();
        }

        public void onDynamicSensorConnected(com.micklab.dcg.wrapper.android.hardware.Sensor arg0) {
            ((android.hardware.SensorManager.DynamicSensorCallback) real).onDynamicSensorConnected(arg0 == null ? null : arg0.getReal());
        }

        public void onDynamicSensorDisconnected(com.micklab.dcg.wrapper.android.hardware.Sensor arg0) {
            ((android.hardware.SensorManager.DynamicSensorCallback) real).onDynamicSensorDisconnected(arg0 == null ? null : arg0.getReal());
        }

    }
}
