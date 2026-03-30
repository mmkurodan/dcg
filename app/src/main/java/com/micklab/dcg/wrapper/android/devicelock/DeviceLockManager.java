// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.devicelock;

public final class DeviceLockManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DeviceLockManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.devicelock.DeviceLockManager wrap(android.devicelock.DeviceLockManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.devicelock.DeviceLockManager(real, (__DcgwBridgeToken) null);
    }

    public android.devicelock.DeviceLockManager getReal() {
        return (android.devicelock.DeviceLockManager) real;
    }

    public android.devicelock.DeviceLockManager unwrap() {
        return getReal();
    }

    public static final int DEVICE_LOCK_ROLE_FINANCING = android.devicelock.DeviceLockManager.DEVICE_LOCK_ROLE_FINANCING;

}
