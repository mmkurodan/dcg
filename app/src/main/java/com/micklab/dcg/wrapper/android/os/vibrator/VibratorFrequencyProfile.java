// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.vibrator;

public final class VibratorFrequencyProfile {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VibratorFrequencyProfile(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.vibrator.VibratorFrequencyProfile wrap(android.os.vibrator.VibratorFrequencyProfile real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.vibrator.VibratorFrequencyProfile(real, (__DcgwBridgeToken) null);
    }

    public android.os.vibrator.VibratorFrequencyProfile getReal() {
        return (android.os.vibrator.VibratorFrequencyProfile) real;
    }

    public android.os.vibrator.VibratorFrequencyProfile unwrap() {
        return getReal();
    }

    public float getMaxFrequencyHz() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.vibrator.VibratorFrequencyProfile#getMaxFrequencyHz()");
    }

    public float getMaxOutputAccelerationGs() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.vibrator.VibratorFrequencyProfile#getMaxOutputAccelerationGs()");
    }

    public float getMinFrequencyHz() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.vibrator.VibratorFrequencyProfile#getMinFrequencyHz()");
    }

    public float getOutputAccelerationGs(float arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.vibrator.VibratorFrequencyProfile#getOutputAccelerationGs(float)");
    }

}
