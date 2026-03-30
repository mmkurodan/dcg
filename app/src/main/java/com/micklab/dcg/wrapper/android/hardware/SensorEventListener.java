// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class SensorEventListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SensorEventListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.SensorEventListener wrap(android.hardware.SensorEventListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.SensorEventListener(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.SensorEventListener getReal() {
        return (android.hardware.SensorEventListener) real;
    }

    public android.hardware.SensorEventListener unwrap() {
        return getReal();
    }

    public void onAccuracyChanged(com.micklab.dcg.wrapper.android.hardware.Sensor arg0, int arg1) {
        ((android.hardware.SensorEventListener) real).onAccuracyChanged(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onSensorChanged(com.micklab.dcg.wrapper.android.hardware.SensorEvent arg0) {
        ((android.hardware.SensorEventListener) real).onSensorChanged(arg0 == null ? null : arg0.getReal());
    }

}
