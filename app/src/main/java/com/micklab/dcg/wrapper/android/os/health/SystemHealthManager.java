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

    public float getCpuHeadroom(com.micklab.dcg.wrapper.android.os.CpuHeadroomParams arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.health.SystemHealthManager#getCpuHeadroom(android.os.CpuHeadroomParams)");
    }

    public long getCpuHeadroomMinIntervalMillis() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.health.SystemHealthManager#getCpuHeadroomMinIntervalMillis()");
    }

    public float getGpuHeadroom(com.micklab.dcg.wrapper.android.os.GpuHeadroomParams arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.health.SystemHealthManager#getGpuHeadroom(android.os.GpuHeadroomParams)");
    }

    public long getGpuHeadroomMinIntervalMillis() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.health.SystemHealthManager#getGpuHeadroomMinIntervalMillis()");
    }

    public int getMaxCpuHeadroomTidsSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.health.SystemHealthManager#getMaxCpuHeadroomTidsSize()");
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
