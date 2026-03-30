// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.audiofx;

public final class AutomaticGainControl {
    private final android.media.audiofx.AutomaticGainControl real;

    public AutomaticGainControl(android.media.audiofx.AutomaticGainControl real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.AutomaticGainControl wrap(android.media.audiofx.AutomaticGainControl real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.AutomaticGainControl(real);
    }

    public android.media.audiofx.AutomaticGainControl unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.AutomaticGainControl create(int arg0) {
        return com.micklab.dcg.wrapper.android.media.audiofx.AutomaticGainControl.wrap(android.media.audiofx.AutomaticGainControl.create(arg0));
    }

    public static boolean isAvailable() {
        return android.media.audiofx.AutomaticGainControl.isAvailable();
    }

}
