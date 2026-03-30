// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class SensorAdditionalInfo {
    private final android.hardware.SensorAdditionalInfo real;

    public SensorAdditionalInfo(android.hardware.SensorAdditionalInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.SensorAdditionalInfo wrap(android.hardware.SensorAdditionalInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.SensorAdditionalInfo(real);
    }

    public android.hardware.SensorAdditionalInfo unwrap() {
        return real;
    }

    public static final int TYPE_FRAME_BEGIN = android.hardware.SensorAdditionalInfo.TYPE_FRAME_BEGIN;
    public static final int TYPE_FRAME_END = android.hardware.SensorAdditionalInfo.TYPE_FRAME_END;
    public static final int TYPE_INTERNAL_TEMPERATURE = android.hardware.SensorAdditionalInfo.TYPE_INTERNAL_TEMPERATURE;
    public static final int TYPE_SAMPLING = android.hardware.SensorAdditionalInfo.TYPE_SAMPLING;
    public static final int TYPE_SENSOR_PLACEMENT = android.hardware.SensorAdditionalInfo.TYPE_SENSOR_PLACEMENT;
    public static final int TYPE_UNTRACKED_DELAY = android.hardware.SensorAdditionalInfo.TYPE_UNTRACKED_DELAY;
    public static final int TYPE_VEC3_CALIBRATION = android.hardware.SensorAdditionalInfo.TYPE_VEC3_CALIBRATION;

}
