// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.audiofx;

public final class AcousticEchoCanceler {
    private final android.media.audiofx.AcousticEchoCanceler real;

    public AcousticEchoCanceler(android.media.audiofx.AcousticEchoCanceler real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.AcousticEchoCanceler wrap(android.media.audiofx.AcousticEchoCanceler real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.AcousticEchoCanceler(real);
    }

    public android.media.audiofx.AcousticEchoCanceler unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.AcousticEchoCanceler create(int arg0) {
        return com.micklab.dcg.wrapper.android.media.audiofx.AcousticEchoCanceler.wrap(android.media.audiofx.AcousticEchoCanceler.create(arg0));
    }

    public static boolean isAvailable() {
        return android.media.audiofx.AcousticEchoCanceler.isAvailable();
    }

}
