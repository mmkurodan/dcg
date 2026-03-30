// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class BatteryState {
    private final android.hardware.BatteryState real;

    public BatteryState(android.hardware.BatteryState real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.BatteryState wrap(android.hardware.BatteryState real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.BatteryState(real);
    }

    public android.hardware.BatteryState unwrap() {
        return real;
    }

    public float getCapacity() {
        return real.getCapacity();
    }

    public int getStatus() {
        return real.getStatus();
    }

    public boolean isPresent() {
        return real.isPresent();
    }

    public static final int STATUS_CHARGING = android.hardware.BatteryState.STATUS_CHARGING;
    public static final int STATUS_DISCHARGING = android.hardware.BatteryState.STATUS_DISCHARGING;
    public static final int STATUS_FULL = android.hardware.BatteryState.STATUS_FULL;
    public static final int STATUS_NOT_CHARGING = android.hardware.BatteryState.STATUS_NOT_CHARGING;
    public static final int STATUS_UNKNOWN = android.hardware.BatteryState.STATUS_UNKNOWN;

}
