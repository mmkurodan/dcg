// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class SensorDirectChannel {
    private final android.hardware.SensorDirectChannel real;

    public SensorDirectChannel(android.hardware.SensorDirectChannel real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.SensorDirectChannel wrap(android.hardware.SensorDirectChannel real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.SensorDirectChannel(real);
    }

    public android.hardware.SensorDirectChannel unwrap() {
        return real;
    }

    public void close() {
        real.close();
    }

    public int configure(com.micklab.dcg.wrapper.android.hardware.Sensor arg0, int arg1) {
        return real.configure(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean isOpen() {
        return real.isOpen();
    }

    public static final int RATE_FAST = android.hardware.SensorDirectChannel.RATE_FAST;
    public static final int RATE_NORMAL = android.hardware.SensorDirectChannel.RATE_NORMAL;
    public static final int RATE_STOP = android.hardware.SensorDirectChannel.RATE_STOP;
    public static final int RATE_VERY_FAST = android.hardware.SensorDirectChannel.RATE_VERY_FAST;
    public static final int TYPE_HARDWARE_BUFFER = android.hardware.SensorDirectChannel.TYPE_HARDWARE_BUFFER;

}
