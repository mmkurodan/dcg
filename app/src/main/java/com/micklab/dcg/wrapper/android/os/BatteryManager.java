// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class BatteryManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BatteryManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.BatteryManager wrap(android.os.BatteryManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.BatteryManager(real, (__DcgwBridgeToken) null);
    }

    public android.os.BatteryManager getReal() {
        return (android.os.BatteryManager) real;
    }

    public android.os.BatteryManager unwrap() {
        return getReal();
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
