// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MicrophoneDirection {
    private final android.media.MicrophoneDirection real;

    public MicrophoneDirection(android.media.MicrophoneDirection real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MicrophoneDirection wrap(android.media.MicrophoneDirection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MicrophoneDirection(real);
    }

    public android.media.MicrophoneDirection unwrap() {
        return real;
    }

    public boolean setPreferredMicrophoneDirection(int arg0) {
        return real.setPreferredMicrophoneDirection(arg0);
    }

    public boolean setPreferredMicrophoneFieldDimension(float arg0) {
        return real.setPreferredMicrophoneFieldDimension(arg0);
    }

    public static final int MIC_DIRECTION_AWAY_FROM_USER = android.media.MicrophoneDirection.MIC_DIRECTION_AWAY_FROM_USER;
    public static final int MIC_DIRECTION_EXTERNAL = android.media.MicrophoneDirection.MIC_DIRECTION_EXTERNAL;
    public static final int MIC_DIRECTION_TOWARDS_USER = android.media.MicrophoneDirection.MIC_DIRECTION_TOWARDS_USER;
    public static final int MIC_DIRECTION_UNSPECIFIED = android.media.MicrophoneDirection.MIC_DIRECTION_UNSPECIFIED;

}
