// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class SensorEventListener2 {
    private final android.hardware.SensorEventListener2 real;

    public SensorEventListener2(android.hardware.SensorEventListener2 real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.SensorEventListener2 wrap(android.hardware.SensorEventListener2 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.SensorEventListener2(real);
    }

    public android.hardware.SensorEventListener2 unwrap() {
        return real;
    }

    public void onFlushCompleted(com.micklab.dcg.wrapper.android.hardware.Sensor arg0) {
        real.onFlushCompleted(arg0 == null ? null : arg0.unwrap());
    }

}
