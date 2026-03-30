// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class PowerMonitorReadings {
    private final android.os.PowerMonitorReadings real;

    public PowerMonitorReadings(android.os.PowerMonitorReadings real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.PowerMonitorReadings wrap(android.os.PowerMonitorReadings real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.PowerMonitorReadings(real);
    }

    public android.os.PowerMonitorReadings unwrap() {
        return real;
    }

    public long getConsumedEnergy(com.micklab.dcg.wrapper.android.os.PowerMonitor arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerMonitorReadings#getConsumedEnergy(android.os.PowerMonitor)");
    }

    public long getTimestampMillis(com.micklab.dcg.wrapper.android.os.PowerMonitor arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerMonitorReadings#getTimestampMillis(android.os.PowerMonitor)");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerMonitorReadings#toString()");
    }


}
