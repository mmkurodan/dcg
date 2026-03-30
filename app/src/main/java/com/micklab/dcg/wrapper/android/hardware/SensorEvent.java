// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class SensorEvent {
    private final android.hardware.SensorEvent real;

    public SensorEvent(android.hardware.SensorEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.SensorEvent wrap(android.hardware.SensorEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.SensorEvent(real);
    }

    public android.hardware.SensorEvent unwrap() {
        return real;
    }


}
