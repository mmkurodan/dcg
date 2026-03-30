// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class SensorListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SensorListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.SensorListener wrap(android.hardware.SensorListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.SensorListener(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.SensorListener getReal() {
        return (android.hardware.SensorListener) real;
    }

    public android.hardware.SensorListener unwrap() {
        return getReal();
    }

    public void onAccuracyChanged(int arg0, int arg1) {
        ((android.hardware.SensorListener) real).onAccuracyChanged(arg0, arg1);
    }

    public void onSensorChanged(int arg0, float[] arg1) {
        ((android.hardware.SensorListener) real).onSensorChanged(arg0, arg1);
    }

}
