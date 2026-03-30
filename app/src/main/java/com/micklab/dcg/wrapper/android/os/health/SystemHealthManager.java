// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.health;

public final class SystemHealthManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SystemHealthManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.health.SystemHealthManager wrap(android.os.health.SystemHealthManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.health.SystemHealthManager(real, (__DcgwBridgeToken) null);
    }

    public android.os.health.SystemHealthManager getReal() {
        return (android.os.health.SystemHealthManager) real;
    }

    public android.os.health.SystemHealthManager unwrap() {
        return getReal();
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
