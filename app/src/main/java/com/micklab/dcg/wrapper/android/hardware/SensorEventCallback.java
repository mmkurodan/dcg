// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class SensorEventCallback {
    private final android.hardware.SensorEventCallback real;

    public SensorEventCallback(android.hardware.SensorEventCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.SensorEventCallback wrap(android.hardware.SensorEventCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.SensorEventCallback(real);
    }

    public android.hardware.SensorEventCallback unwrap() {
        return real;
    }

    public void onAccuracyChanged(com.micklab.dcg.wrapper.android.hardware.Sensor arg0, int arg1) {
        real.onAccuracyChanged(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onFlushCompleted(com.micklab.dcg.wrapper.android.hardware.Sensor arg0) {
        real.onFlushCompleted(arg0 == null ? null : arg0.unwrap());
    }

    public void onSensorAdditionalInfo(com.micklab.dcg.wrapper.android.hardware.SensorAdditionalInfo arg0) {
        real.onSensorAdditionalInfo(arg0 == null ? null : arg0.unwrap());
    }

    public void onSensorChanged(com.micklab.dcg.wrapper.android.hardware.SensorEvent arg0) {
        real.onSensorChanged(arg0 == null ? null : arg0.unwrap());
    }

}
