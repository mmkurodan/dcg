// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class HardwarePropertiesManager {
    private final android.os.HardwarePropertiesManager real;

    public HardwarePropertiesManager(android.os.HardwarePropertiesManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.HardwarePropertiesManager wrap(android.os.HardwarePropertiesManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.HardwarePropertiesManager(real);
    }

    public android.os.HardwarePropertiesManager unwrap() {
        return real;
    }

    public android.os.CpuUsageInfo[] getCpuUsages() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.HardwarePropertiesManager#getCpuUsages()");
    }

    public float[] getDeviceTemperatures(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.HardwarePropertiesManager#getDeviceTemperatures(int,int)");
    }

    public float[] getFanSpeeds() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.HardwarePropertiesManager#getFanSpeeds()");
    }


}
