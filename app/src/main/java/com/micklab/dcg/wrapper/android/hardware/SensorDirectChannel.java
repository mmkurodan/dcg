// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class SensorDirectChannel {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SensorDirectChannel(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.SensorDirectChannel wrap(android.hardware.SensorDirectChannel real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.SensorDirectChannel(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.SensorDirectChannel getReal() {
        return (android.hardware.SensorDirectChannel) real;
    }

    public android.hardware.SensorDirectChannel unwrap() {
        return getReal();
    }

    public void close() {
        ((android.hardware.SensorDirectChannel) real).close();
    }

    public int configure(com.micklab.dcg.wrapper.android.hardware.Sensor arg0, int arg1) {
        return ((android.hardware.SensorDirectChannel) real).configure(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean isOpen() {
        return ((android.hardware.SensorDirectChannel) real).isOpen();
    }

    public static final int RATE_FAST = android.hardware.SensorDirectChannel.RATE_FAST;
    public static final int RATE_NORMAL = android.hardware.SensorDirectChannel.RATE_NORMAL;
    public static final int RATE_STOP = android.hardware.SensorDirectChannel.RATE_STOP;
    public static final int RATE_VERY_FAST = android.hardware.SensorDirectChannel.RATE_VERY_FAST;
    public static final int TYPE_HARDWARE_BUFFER = android.hardware.SensorDirectChannel.TYPE_HARDWARE_BUFFER;

}
