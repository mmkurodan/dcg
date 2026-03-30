// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.devicelock;

public final class DeviceLockManager {
    private final android.devicelock.DeviceLockManager real;

    public DeviceLockManager(android.devicelock.DeviceLockManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.devicelock.DeviceLockManager wrap(android.devicelock.DeviceLockManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.devicelock.DeviceLockManager(real);
    }

    public android.devicelock.DeviceLockManager unwrap() {
        return real;
    }

    public static final int DEVICE_LOCK_ROLE_FINANCING = android.devicelock.DeviceLockManager.DEVICE_LOCK_ROLE_FINANCING;

}
