// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class Vibrator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Vibrator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.Vibrator wrap(android.os.Vibrator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.Vibrator(real, (__DcgwBridgeToken) null);
    }

    public android.os.Vibrator getReal() {
        return (android.os.Vibrator) real;
    }

    public android.os.Vibrator unwrap() {
        return getReal();
    }

    public int areAllEffectsSupported(int... arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Vibrator#areAllEffectsSupported([I)");
    }

    public boolean areAllPrimitivesSupported(int... arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Vibrator#areAllPrimitivesSupported([I)");
    }

    public int[] areEffectsSupported(int... arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Vibrator#areEffectsSupported([I)");
    }

    public boolean areEnvelopeEffectsSupported() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Vibrator#areEnvelopeEffectsSupported()");
    }

    public boolean[] arePrimitivesSupported(int... arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Vibrator#arePrimitivesSupported([I)");
    }

    public void cancel() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Vibrator#cancel()");
    }

    public com.micklab.dcg.wrapper.android.os.vibrator.VibratorEnvelopeEffectInfo getEnvelopeEffectInfo() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Vibrator#getEnvelopeEffectInfo()");
    }

    public com.micklab.dcg.wrapper.android.os.vibrator.VibratorFrequencyProfile getFrequencyProfile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Vibrator#getFrequencyProfile()");
    }

    public int getId() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Vibrator#getId()");
    }

    public int[] getPrimitiveDurations(int... arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Vibrator#getPrimitiveDurations([I)");
    }

    public float getQFactor() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Vibrator#getQFactor()");
    }

    public float getResonantFrequency() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Vibrator#getResonantFrequency()");
    }

    public boolean hasAmplitudeControl() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Vibrator#hasAmplitudeControl()");
    }

    public boolean hasVibrator() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Vibrator#hasVibrator()");
    }

    public void vibrate(com.micklab.dcg.wrapper.android.os.VibrationEffect arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Vibrator#vibrate(android.os.VibrationEffect)");
    }

    public void vibrate(long arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Vibrator#vibrate(long)");
    }

    public void vibrate(long arg0, com.micklab.dcg.wrapper.android.media.AudioAttributes arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Vibrator#vibrate(long,android.media.AudioAttributes)");
    }

    public void vibrate(com.micklab.dcg.wrapper.android.os.VibrationEffect arg0, com.micklab.dcg.wrapper.android.media.AudioAttributes arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Vibrator#vibrate(android.os.VibrationEffect,android.media.AudioAttributes)");
    }

    public void vibrate(long[] arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Vibrator#vibrate([J,int)");
    }

    public void vibrate(com.micklab.dcg.wrapper.android.os.VibrationEffect arg0, com.micklab.dcg.wrapper.android.os.VibrationAttributes arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Vibrator#vibrate(android.os.VibrationEffect,android.os.VibrationAttributes)");
    }

    public void vibrate(long[] arg0, int arg1, com.micklab.dcg.wrapper.android.media.AudioAttributes arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Vibrator#vibrate([J,int,android.media.AudioAttributes)");
    }


}
