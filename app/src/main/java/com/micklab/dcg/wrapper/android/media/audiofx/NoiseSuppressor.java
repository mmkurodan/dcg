// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.audiofx;

public final class NoiseSuppressor {
    private final android.media.audiofx.NoiseSuppressor real;

    public NoiseSuppressor(android.media.audiofx.NoiseSuppressor real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.NoiseSuppressor wrap(android.media.audiofx.NoiseSuppressor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.NoiseSuppressor(real);
    }

    public android.media.audiofx.NoiseSuppressor unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.NoiseSuppressor create(int arg0) {
        return com.micklab.dcg.wrapper.android.media.audiofx.NoiseSuppressor.wrap(android.media.audiofx.NoiseSuppressor.create(arg0));
    }

    public static boolean isAvailable() {
        return android.media.audiofx.NoiseSuppressor.isAvailable();
    }

}
