// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class VideoProfile {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VideoProfile(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.VideoProfile wrap(android.telecom.VideoProfile real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.VideoProfile(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.VideoProfile getReal() {
        return (android.telecom.VideoProfile) real;
    }

    public android.telecom.VideoProfile unwrap() {
        return getReal();
    }

    public VideoProfile(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telecom.VideoProfile#android.telecom.VideoProfile(int)");
    }

    public VideoProfile(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telecom.VideoProfile#android.telecom.VideoProfile(int,int)");
    }

    public int describeContents() {
        return ((android.telecom.VideoProfile) real).describeContents();
    }

    public int getQuality() {
        return ((android.telecom.VideoProfile) real).getQuality();
    }

    public int getVideoState() {
        return ((android.telecom.VideoProfile) real).getVideoState();
    }

    public static boolean isAudioOnly(int arg0) {
        return android.telecom.VideoProfile.isAudioOnly(arg0);
    }

    public static boolean isBidirectional(int arg0) {
        return android.telecom.VideoProfile.isBidirectional(arg0);
    }

    public static boolean isPaused(int arg0) {
        return android.telecom.VideoProfile.isPaused(arg0);
    }

    public static boolean isReceptionEnabled(int arg0) {
        return android.telecom.VideoProfile.isReceptionEnabled(arg0);
    }

    public static boolean isTransmissionEnabled(int arg0) {
        return android.telecom.VideoProfile.isTransmissionEnabled(arg0);
    }

    public static boolean isVideo(int arg0) {
        return android.telecom.VideoProfile.isVideo(arg0);
    }

    public java.lang.String toString() {
        return ((android.telecom.VideoProfile) real).toString();
    }

    public static java.lang.String videoStateToString(int arg0) {
        return android.telecom.VideoProfile.videoStateToString(arg0);
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.telecom.VideoProfile) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int QUALITY_DEFAULT = android.telecom.VideoProfile.QUALITY_DEFAULT;
    public static final int QUALITY_HIGH = android.telecom.VideoProfile.QUALITY_HIGH;
    public static final int QUALITY_LOW = android.telecom.VideoProfile.QUALITY_LOW;
    public static final int QUALITY_MEDIUM = android.telecom.VideoProfile.QUALITY_MEDIUM;
    public static final int STATE_AUDIO_ONLY = android.telecom.VideoProfile.STATE_AUDIO_ONLY;
    public static final int STATE_BIDIRECTIONAL = android.telecom.VideoProfile.STATE_BIDIRECTIONAL;
    public static final int STATE_PAUSED = android.telecom.VideoProfile.STATE_PAUSED;
    public static final int STATE_RX_ENABLED = android.telecom.VideoProfile.STATE_RX_ENABLED;
    public static final int STATE_TX_ENABLED = android.telecom.VideoProfile.STATE_TX_ENABLED;

    public static final class CameraCapabilities {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CameraCapabilities(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.telecom.VideoProfile.CameraCapabilities wrap(android.telecom.VideoProfile.CameraCapabilities real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.VideoProfile.CameraCapabilities(real, (__DcgwBridgeToken) null);
        }

        public android.telecom.VideoProfile.CameraCapabilities getReal() {
            return (android.telecom.VideoProfile.CameraCapabilities) real;
        }

        public android.telecom.VideoProfile.CameraCapabilities unwrap() {
            return getReal();
        }

        public CameraCapabilities(int arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telecom.VideoProfile$CameraCapabilities#android.telecom.VideoProfile$CameraCapabilities(int,int)");
        }

        public CameraCapabilities(int arg0, int arg1, boolean arg2, float arg3) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telecom.VideoProfile$CameraCapabilities#android.telecom.VideoProfile$CameraCapabilities(int,int,boolean,float)");
        }

        public int describeContents() {
            return ((android.telecom.VideoProfile.CameraCapabilities) real).describeContents();
        }

        public int getHeight() {
            return ((android.telecom.VideoProfile.CameraCapabilities) real).getHeight();
        }

        public float getMaxZoom() {
            return ((android.telecom.VideoProfile.CameraCapabilities) real).getMaxZoom();
        }

        public int getWidth() {
            return ((android.telecom.VideoProfile.CameraCapabilities) real).getWidth();
        }

        public boolean isZoomSupported() {
            return ((android.telecom.VideoProfile.CameraCapabilities) real).isZoomSupported();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.telecom.VideoProfile.CameraCapabilities) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
}
