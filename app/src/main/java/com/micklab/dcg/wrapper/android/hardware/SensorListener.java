// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class SensorListener {
    private final android.hardware.SensorListener real;

    public SensorListener(android.hardware.SensorListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.SensorListener wrap(android.hardware.SensorListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.SensorListener(real);
    }

    public android.hardware.SensorListener unwrap() {
        return real;
    }

    public void onAccuracyChanged(int arg0, int arg1) {
        real.onAccuracyChanged(arg0, arg1);
    }

    public void onSensorChanged(int arg0, float[] arg1) {
        real.onSensorChanged(arg0, arg1);
    }

}
