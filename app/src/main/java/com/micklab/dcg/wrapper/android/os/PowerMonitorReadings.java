// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class PowerMonitorReadings {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PowerMonitorReadings(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.PowerMonitorReadings wrap(android.os.PowerMonitorReadings real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.PowerMonitorReadings(real, (__DcgwBridgeToken) null);
    }

    public android.os.PowerMonitorReadings getReal() {
        return (android.os.PowerMonitorReadings) real;
    }

    public android.os.PowerMonitorReadings unwrap() {
        return getReal();
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
