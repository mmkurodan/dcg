// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.health;

public final class SystemHealthManager {
    private final android.os.health.SystemHealthManager real;

    public SystemHealthManager(android.os.health.SystemHealthManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.health.SystemHealthManager wrap(android.os.health.SystemHealthManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.health.SystemHealthManager(real);
    }

    public android.os.health.SystemHealthManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.os.health.HealthStats takeMyUidSnapshot() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.health.SystemHealthManager#takeMyUidSnapshot()");
    }

    public com.micklab.dcg.wrapper.android.os.health.HealthStats takeUidSnapshot(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.health.SystemHealthManager#takeUidSnapshot(int)");
    }

    public android.os.health.HealthStats[] takeUidSnapshots(int[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.health.SystemHealthManager#takeUidSnapshots([I)");
    }

}
