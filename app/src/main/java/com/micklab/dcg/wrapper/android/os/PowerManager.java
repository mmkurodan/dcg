// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class PowerManager {
    private final android.os.PowerManager real;

    public PowerManager(android.os.PowerManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.PowerManager wrap(android.os.PowerManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.PowerManager(real);
    }

    public android.os.PowerManager unwrap() {
        return real;
    }

    public void addThermalStatusListener(com.micklab.dcg.wrapper.android.os.PowerManager.OnThermalStatusChangedListener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#addThermalStatusListener(android.os.PowerManager$OnThermalStatusChangedListener)");
    }

    public void addThermalStatusListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.os.PowerManager.OnThermalStatusChangedListener arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#addThermalStatusListener(java.util.concurrent.Executor,android.os.PowerManager$OnThermalStatusChangedListener)");
    }

    public java.time.Duration getBatteryDischargePrediction() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#getBatteryDischargePrediction()");
    }

    public int getCurrentThermalStatus() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#getCurrentThermalStatus()");
    }

    public int getLocationPowerSaveMode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#getLocationPowerSaveMode()");
    }

    public float getThermalHeadroom(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#getThermalHeadroom(int)");
    }

    public boolean isAllowedInLowPowerStandby(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#isAllowedInLowPowerStandby(java.lang.String)");
    }

    public boolean isAllowedInLowPowerStandby(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#isAllowedInLowPowerStandby(int)");
    }

    public boolean isBatteryDischargePredictionPersonalized() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#isBatteryDischargePredictionPersonalized()");
    }

    public boolean isDeviceIdleMode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#isDeviceIdleMode()");
    }

    public boolean isDeviceLightIdleMode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#isDeviceLightIdleMode()");
    }

    public boolean isExemptFromLowPowerStandby() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#isExemptFromLowPowerStandby()");
    }

    public boolean isIgnoringBatteryOptimizations(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#isIgnoringBatteryOptimizations(java.lang.String)");
    }

    public boolean isInteractive() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#isInteractive()");
    }

    public boolean isLowPowerStandbyEnabled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#isLowPowerStandbyEnabled()");
    }

    public boolean isPowerSaveMode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#isPowerSaveMode()");
    }

    public boolean isRebootingUserspaceSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#isRebootingUserspaceSupported()");
    }

    public boolean isScreenOn() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#isScreenOn()");
    }

    public boolean isSustainedPerformanceModeSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#isSustainedPerformanceModeSupported()");
    }

    public boolean isWakeLockLevelSupported(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#isWakeLockLevelSupported(int)");
    }

    public android.os.PowerManager.WakeLock newWakeLock(int arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#newWakeLock(int,java.lang.String)");
    }

    public void reboot(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#reboot(java.lang.String)");
    }

    public void removeThermalStatusListener(com.micklab.dcg.wrapper.android.os.PowerManager.OnThermalStatusChangedListener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#removeThermalStatusListener(android.os.PowerManager$OnThermalStatusChangedListener)");
    }


    public static final class OnThermalStatusChangedListener {
        private final android.os.PowerManager.OnThermalStatusChangedListener real;

        public OnThermalStatusChangedListener(android.os.PowerManager.OnThermalStatusChangedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.PowerManager.OnThermalStatusChangedListener wrap(android.os.PowerManager.OnThermalStatusChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.PowerManager.OnThermalStatusChangedListener(real);
        }

        public android.os.PowerManager.OnThermalStatusChangedListener unwrap() {
            return real;
        }

        public void onThermalStatusChanged(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager$OnThermalStatusChangedListener#onThermalStatusChanged(int)");
        }

    }
    public static final class WakeLockStateListener {
        private final android.os.PowerManager.WakeLockStateListener real;

        public WakeLockStateListener(android.os.PowerManager.WakeLockStateListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.PowerManager.WakeLockStateListener wrap(android.os.PowerManager.WakeLockStateListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.PowerManager.WakeLockStateListener(real);
        }

        public android.os.PowerManager.WakeLockStateListener unwrap() {
            return real;
        }

        public void onStateChanged(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager$WakeLockStateListener#onStateChanged(boolean)");
        }

    }
}
