// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class VibratorManager {
    private final android.os.VibratorManager real;

    public VibratorManager(android.os.VibratorManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.VibratorManager wrap(android.os.VibratorManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.VibratorManager(real);
    }

    public android.os.VibratorManager unwrap() {
        return real;
    }

    public void cancel() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.VibratorManager#cancel()");
    }

    public com.micklab.dcg.wrapper.android.os.Vibrator getDefaultVibrator() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.VibratorManager#getDefaultVibrator()");
    }

    public com.micklab.dcg.wrapper.android.os.Vibrator getVibrator(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.VibratorManager#getVibrator(int)");
    }

    public int[] getVibratorIds() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.VibratorManager#getVibratorIds()");
    }

    public void vibrate(com.micklab.dcg.wrapper.android.os.CombinedVibration arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.VibratorManager#vibrate(android.os.CombinedVibration)");
    }

    public void vibrate(com.micklab.dcg.wrapper.android.os.CombinedVibration arg0, com.micklab.dcg.wrapper.android.os.VibrationAttributes arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.VibratorManager#vibrate(android.os.CombinedVibration,android.os.VibrationAttributes)");
    }

}
