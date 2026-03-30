// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.audiofx;

public final class NoiseSuppressor {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NoiseSuppressor(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.NoiseSuppressor wrap(android.media.audiofx.NoiseSuppressor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.NoiseSuppressor(real, (__DcgwBridgeToken) null);
    }

    public android.media.audiofx.NoiseSuppressor getReal() {
        return (android.media.audiofx.NoiseSuppressor) real;
    }

    public android.media.audiofx.NoiseSuppressor unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.NoiseSuppressor create(int arg0) {
        return com.micklab.dcg.wrapper.android.media.audiofx.NoiseSuppressor.wrap(android.media.audiofx.NoiseSuppressor.create(arg0));
    }

    public static boolean isAvailable() {
        return android.media.audiofx.NoiseSuppressor.isAvailable();
    }

}
