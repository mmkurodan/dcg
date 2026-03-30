// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class SensorEventCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SensorEventCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.SensorEventCallback wrap(android.hardware.SensorEventCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.SensorEventCallback(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.SensorEventCallback getReal() {
        return (android.hardware.SensorEventCallback) real;
    }

    public android.hardware.SensorEventCallback unwrap() {
        return getReal();
    }

    public void onAccuracyChanged(com.micklab.dcg.wrapper.android.hardware.Sensor arg0, int arg1) {
        ((android.hardware.SensorEventCallback) real).onAccuracyChanged(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onFlushCompleted(com.micklab.dcg.wrapper.android.hardware.Sensor arg0) {
        ((android.hardware.SensorEventCallback) real).onFlushCompleted(arg0 == null ? null : arg0.getReal());
    }

    public void onSensorAdditionalInfo(com.micklab.dcg.wrapper.android.hardware.SensorAdditionalInfo arg0) {
        ((android.hardware.SensorEventCallback) real).onSensorAdditionalInfo(arg0 == null ? null : arg0.getReal());
    }

    public void onSensorChanged(com.micklab.dcg.wrapper.android.hardware.SensorEvent arg0) {
        ((android.hardware.SensorEventCallback) real).onSensorChanged(arg0 == null ? null : arg0.getReal());
    }

}
