// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class SensorEventListener2 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SensorEventListener2(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.SensorEventListener2 wrap(android.hardware.SensorEventListener2 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.SensorEventListener2(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.SensorEventListener2 getReal() {
        return (android.hardware.SensorEventListener2) real;
    }

    public android.hardware.SensorEventListener2 unwrap() {
        return getReal();
    }

    public void onFlushCompleted(com.micklab.dcg.wrapper.android.hardware.Sensor arg0) {
        ((android.hardware.SensorEventListener2) real).onFlushCompleted(arg0 == null ? null : arg0.getReal());
    }

}
