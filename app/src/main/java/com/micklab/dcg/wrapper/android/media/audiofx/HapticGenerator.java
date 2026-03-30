// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.audiofx;

public final class HapticGenerator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private HapticGenerator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.HapticGenerator wrap(android.media.audiofx.HapticGenerator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.HapticGenerator(real, (__DcgwBridgeToken) null);
    }

    public android.media.audiofx.HapticGenerator getReal() {
        return (android.media.audiofx.HapticGenerator) real;
    }

    public android.media.audiofx.HapticGenerator unwrap() {
        return getReal();
    }

    public void close() {
        ((android.media.audiofx.HapticGenerator) real).close();
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.HapticGenerator create(int arg0) {
        return com.micklab.dcg.wrapper.android.media.audiofx.HapticGenerator.wrap(android.media.audiofx.HapticGenerator.create(arg0));
    }

    public static boolean isAvailable() {
        return android.media.audiofx.HapticGenerator.isAvailable();
    }

    public void release() {
        ((android.media.audiofx.HapticGenerator) real).release();
    }

    public int setEnabled(boolean arg0) {
        return ((android.media.audiofx.HapticGenerator) real).setEnabled(arg0);
    }

}
