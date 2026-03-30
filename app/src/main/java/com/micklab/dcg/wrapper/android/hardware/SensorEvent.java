// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class SensorEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SensorEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.SensorEvent wrap(android.hardware.SensorEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.SensorEvent(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.SensorEvent getReal() {
        return (android.hardware.SensorEvent) real;
    }

    public android.hardware.SensorEvent unwrap() {
        return getReal();
    }


}
