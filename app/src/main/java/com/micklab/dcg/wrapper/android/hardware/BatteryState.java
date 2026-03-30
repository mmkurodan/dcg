// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class BatteryState {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BatteryState(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.BatteryState wrap(android.hardware.BatteryState real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.BatteryState(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.BatteryState getReal() {
        return (android.hardware.BatteryState) real;
    }

    public android.hardware.BatteryState unwrap() {
        return getReal();
    }

    public float getCapacity() {
        return ((android.hardware.BatteryState) real).getCapacity();
    }

    public int getStatus() {
        return ((android.hardware.BatteryState) real).getStatus();
    }

    public boolean isPresent() {
        return ((android.hardware.BatteryState) real).isPresent();
    }

    public static final int STATUS_CHARGING = android.hardware.BatteryState.STATUS_CHARGING;
    public static final int STATUS_DISCHARGING = android.hardware.BatteryState.STATUS_DISCHARGING;
    public static final int STATUS_FULL = android.hardware.BatteryState.STATUS_FULL;
    public static final int STATUS_NOT_CHARGING = android.hardware.BatteryState.STATUS_NOT_CHARGING;
    public static final int STATUS_UNKNOWN = android.hardware.BatteryState.STATUS_UNKNOWN;

}
