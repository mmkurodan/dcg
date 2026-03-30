// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.audiofx;

public final class AcousticEchoCanceler {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AcousticEchoCanceler(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.AcousticEchoCanceler wrap(android.media.audiofx.AcousticEchoCanceler real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.AcousticEchoCanceler(real, (__DcgwBridgeToken) null);
    }

    public android.media.audiofx.AcousticEchoCanceler getReal() {
        return (android.media.audiofx.AcousticEchoCanceler) real;
    }

    public android.media.audiofx.AcousticEchoCanceler unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.AcousticEchoCanceler create(int arg0) {
        return com.micklab.dcg.wrapper.android.media.audiofx.AcousticEchoCanceler.wrap(android.media.audiofx.AcousticEchoCanceler.create(arg0));
    }

    public static boolean isAvailable() {
        return android.media.audiofx.AcousticEchoCanceler.isAvailable();
    }

}
