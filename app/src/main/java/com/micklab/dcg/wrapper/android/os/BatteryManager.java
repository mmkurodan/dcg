// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class BatteryManager {
    private final android.os.BatteryManager real;

    public BatteryManager(android.os.BatteryManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.BatteryManager wrap(android.os.BatteryManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.BatteryManager(real);
    }

    public android.os.BatteryManager unwrap() {
        return real;
    }

    public long computeChargeTimeRemaining() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.BatteryManager#computeChargeTimeRemaining()");
    }

    public int getIntProperty(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.BatteryManager#getIntProperty(int)");
    }

    public long getLongProperty(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.BatteryManager#getLongProperty(int)");
    }

    public java.lang.String getStringProperty(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.BatteryManager#getStringProperty(int)");
    }

    public boolean isCharging() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.BatteryManager#isCharging()");
    }


}
