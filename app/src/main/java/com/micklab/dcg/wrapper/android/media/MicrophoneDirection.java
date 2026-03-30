// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MicrophoneDirection {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MicrophoneDirection(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MicrophoneDirection wrap(android.media.MicrophoneDirection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MicrophoneDirection(real, (__DcgwBridgeToken) null);
    }

    public android.media.MicrophoneDirection getReal() {
        return (android.media.MicrophoneDirection) real;
    }

    public android.media.MicrophoneDirection unwrap() {
        return getReal();
    }

    public boolean setPreferredMicrophoneDirection(int arg0) {
        return ((android.media.MicrophoneDirection) real).setPreferredMicrophoneDirection(arg0);
    }

    public boolean setPreferredMicrophoneFieldDimension(float arg0) {
        return ((android.media.MicrophoneDirection) real).setPreferredMicrophoneFieldDimension(arg0);
    }

    public static final int MIC_DIRECTION_AWAY_FROM_USER = android.media.MicrophoneDirection.MIC_DIRECTION_AWAY_FROM_USER;
    public static final int MIC_DIRECTION_EXTERNAL = android.media.MicrophoneDirection.MIC_DIRECTION_EXTERNAL;
    public static final int MIC_DIRECTION_TOWARDS_USER = android.media.MicrophoneDirection.MIC_DIRECTION_TOWARDS_USER;
    public static final int MIC_DIRECTION_UNSPECIFIED = android.media.MicrophoneDirection.MIC_DIRECTION_UNSPECIFIED;

}
