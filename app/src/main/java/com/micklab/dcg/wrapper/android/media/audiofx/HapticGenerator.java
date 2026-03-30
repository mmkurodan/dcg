// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.audiofx;

public final class HapticGenerator {
    private final android.media.audiofx.HapticGenerator real;

    public HapticGenerator(android.media.audiofx.HapticGenerator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.HapticGenerator wrap(android.media.audiofx.HapticGenerator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.HapticGenerator(real);
    }

    public android.media.audiofx.HapticGenerator unwrap() {
        return real;
    }

    public void close() {
        real.close();
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.HapticGenerator create(int arg0) {
        return com.micklab.dcg.wrapper.android.media.audiofx.HapticGenerator.wrap(android.media.audiofx.HapticGenerator.create(arg0));
    }

    public static boolean isAvailable() {
        return android.media.audiofx.HapticGenerator.isAvailable();
    }

    public void release() {
        real.release();
    }

    public int setEnabled(boolean arg0) {
        return real.setEnabled(arg0);
    }

}
