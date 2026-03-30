// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.audiofx;

public final class AutomaticGainControl {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AutomaticGainControl(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.AutomaticGainControl wrap(android.media.audiofx.AutomaticGainControl real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.AutomaticGainControl(real, (__DcgwBridgeToken) null);
    }

    public android.media.audiofx.AutomaticGainControl getReal() {
        return (android.media.audiofx.AutomaticGainControl) real;
    }

    public android.media.audiofx.AutomaticGainControl unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.AutomaticGainControl create(int arg0) {
        return com.micklab.dcg.wrapper.android.media.audiofx.AutomaticGainControl.wrap(android.media.audiofx.AutomaticGainControl.create(arg0));
    }

    public static boolean isAvailable() {
        return android.media.audiofx.AutomaticGainControl.isAvailable();
    }

}
