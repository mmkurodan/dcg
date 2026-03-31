// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class PowerManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PowerManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.PowerManager wrap(android.os.PowerManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.PowerManager(real, (__DcgwBridgeToken) null);
    }

    public android.os.PowerManager getReal() {
        return (android.os.PowerManager) real;
    }

    public android.os.PowerManager unwrap() {
        return getReal();
    }

    public void addThermalHeadroomListener(com.micklab.dcg.wrapper.android.os.PowerManager.OnThermalHeadroomChangedListener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#addThermalHeadroomListener(android.os.PowerManager$OnThermalHeadroomChangedListener)");
    }

    public void addThermalHeadroomListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.os.PowerManager.OnThermalHeadroomChangedListener arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#addThermalHeadroomListener(java.util.concurrent.Executor,android.os.PowerManager$OnThermalHeadroomChangedListener)");
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

    public void removeThermalHeadroomListener(com.micklab.dcg.wrapper.android.os.PowerManager.OnThermalHeadroomChangedListener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#removeThermalHeadroomListener(android.os.PowerManager$OnThermalHeadroomChangedListener)");
    }

    public void removeThermalStatusListener(com.micklab.dcg.wrapper.android.os.PowerManager.OnThermalStatusChangedListener arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager#removeThermalStatusListener(android.os.PowerManager$OnThermalStatusChangedListener)");
    }


    public static final class OnThermalHeadroomChangedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnThermalHeadroomChangedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.PowerManager.OnThermalHeadroomChangedListener wrap(android.os.PowerManager.OnThermalHeadroomChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.PowerManager.OnThermalHeadroomChangedListener(real, (__DcgwBridgeToken) null);
        }

        public android.os.PowerManager.OnThermalHeadroomChangedListener getReal() {
            return (android.os.PowerManager.OnThermalHeadroomChangedListener) real;
        }

        public android.os.PowerManager.OnThermalHeadroomChangedListener unwrap() {
            return getReal();
        }

    }
    public static final class OnThermalStatusChangedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnThermalStatusChangedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.PowerManager.OnThermalStatusChangedListener wrap(android.os.PowerManager.OnThermalStatusChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.PowerManager.OnThermalStatusChangedListener(real, (__DcgwBridgeToken) null);
        }

        public android.os.PowerManager.OnThermalStatusChangedListener getReal() {
            return (android.os.PowerManager.OnThermalStatusChangedListener) real;
        }

        public android.os.PowerManager.OnThermalStatusChangedListener unwrap() {
            return getReal();
        }

        public void onThermalStatusChanged(int arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager$OnThermalStatusChangedListener#onThermalStatusChanged(int)");
        }

    }
    public static final class WakeLockStateListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private WakeLockStateListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.os.PowerManager.WakeLockStateListener wrap(android.os.PowerManager.WakeLockStateListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.os.PowerManager.WakeLockStateListener(real, (__DcgwBridgeToken) null);
        }

        public android.os.PowerManager.WakeLockStateListener getReal() {
            return (android.os.PowerManager.WakeLockStateListener) real;
        }

        public android.os.PowerManager.WakeLockStateListener unwrap() {
            return getReal();
        }

        public void onStateChanged(boolean arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.PowerManager$WakeLockStateListener#onStateChanged(boolean)");
        }

    }
}
