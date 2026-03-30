// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioAttributes {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AudioAttributes(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioAttributes wrap(android.media.AudioAttributes real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioAttributes(real, (__DcgwBridgeToken) null);
    }

    public android.media.AudioAttributes getReal() {
        return (android.media.AudioAttributes) real;
    }

    public android.media.AudioAttributes unwrap() {
        return getReal();
    }

    public boolean areHapticChannelsMuted() {
        return ((android.media.AudioAttributes) real).areHapticChannelsMuted();
    }

    public int describeContents() {
        return ((android.media.AudioAttributes) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.AudioAttributes) real).equals(arg0);
    }

    public int getAllowedCapturePolicy() {
        return ((android.media.AudioAttributes) real).getAllowedCapturePolicy();
    }

    public int getContentType() {
        return ((android.media.AudioAttributes) real).getContentType();
    }

    public int getFlags() {
        return ((android.media.AudioAttributes) real).getFlags();
    }

    public int getSpatializationBehavior() {
        return ((android.media.AudioAttributes) real).getSpatializationBehavior();
    }

    public int getUsage() {
        return ((android.media.AudioAttributes) real).getUsage();
    }

    public int getVolumeControlStream() {
        return ((android.media.AudioAttributes) real).getVolumeControlStream();
    }

    public int hashCode() {
        return ((android.media.AudioAttributes) real).hashCode();
    }

    public boolean isContentSpatialized() {
        return ((android.media.AudioAttributes) real).isContentSpatialized();
    }

    public java.lang.String toString() {
        return ((android.media.AudioAttributes) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.AudioAttributes) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int ALLOW_CAPTURE_BY_ALL = android.media.AudioAttributes.ALLOW_CAPTURE_BY_ALL;
    public static final int ALLOW_CAPTURE_BY_NONE = android.media.AudioAttributes.ALLOW_CAPTURE_BY_NONE;
    public static final int ALLOW_CAPTURE_BY_SYSTEM = android.media.AudioAttributes.ALLOW_CAPTURE_BY_SYSTEM;
    public static final int CONTENT_TYPE_MOVIE = android.media.AudioAttributes.CONTENT_TYPE_MOVIE;
    public static final int CONTENT_TYPE_MUSIC = android.media.AudioAttributes.CONTENT_TYPE_MUSIC;
    public static final int CONTENT_TYPE_SONIFICATION = android.media.AudioAttributes.CONTENT_TYPE_SONIFICATION;
    public static final int CONTENT_TYPE_SPEECH = android.media.AudioAttributes.CONTENT_TYPE_SPEECH;
    public static final int CONTENT_TYPE_UNKNOWN = android.media.AudioAttributes.CONTENT_TYPE_UNKNOWN;
    public static final int FLAG_AUDIBILITY_ENFORCED = android.media.AudioAttributes.FLAG_AUDIBILITY_ENFORCED;
    public static final int FLAG_HW_AV_SYNC = android.media.AudioAttributes.FLAG_HW_AV_SYNC;
    public static final int FLAG_LOW_LATENCY = android.media.AudioAttributes.FLAG_LOW_LATENCY;
    public static final int SPATIALIZATION_BEHAVIOR_AUTO = android.media.AudioAttributes.SPATIALIZATION_BEHAVIOR_AUTO;
    public static final int SPATIALIZATION_BEHAVIOR_NEVER = android.media.AudioAttributes.SPATIALIZATION_BEHAVIOR_NEVER;
    public static final int USAGE_ALARM = android.media.AudioAttributes.USAGE_ALARM;
    public static final int USAGE_ASSISTANCE_ACCESSIBILITY = android.media.AudioAttributes.USAGE_ASSISTANCE_ACCESSIBILITY;
    public static final int USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = android.media.AudioAttributes.USAGE_ASSISTANCE_NAVIGATION_GUIDANCE;
    public static final int USAGE_ASSISTANCE_SONIFICATION = android.media.AudioAttributes.USAGE_ASSISTANCE_SONIFICATION;
    public static final int USAGE_ASSISTANT = android.media.AudioAttributes.USAGE_ASSISTANT;
    public static final int USAGE_GAME = android.media.AudioAttributes.USAGE_GAME;
    public static final int USAGE_MEDIA = android.media.AudioAttributes.USAGE_MEDIA;
    public static final int USAGE_NOTIFICATION = android.media.AudioAttributes.USAGE_NOTIFICATION;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_DELAYED = android.media.AudioAttributes.USAGE_NOTIFICATION_COMMUNICATION_DELAYED;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_INSTANT = android.media.AudioAttributes.USAGE_NOTIFICATION_COMMUNICATION_INSTANT;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_REQUEST = android.media.AudioAttributes.USAGE_NOTIFICATION_COMMUNICATION_REQUEST;
    public static final int USAGE_NOTIFICATION_EVENT = android.media.AudioAttributes.USAGE_NOTIFICATION_EVENT;
    public static final int USAGE_NOTIFICATION_RINGTONE = android.media.AudioAttributes.USAGE_NOTIFICATION_RINGTONE;
    public static final int USAGE_UNKNOWN = android.media.AudioAttributes.USAGE_UNKNOWN;
    public static final int USAGE_VOICE_COMMUNICATION = android.media.AudioAttributes.USAGE_VOICE_COMMUNICATION;
    public static final int USAGE_VOICE_COMMUNICATION_SIGNALLING = android.media.AudioAttributes.USAGE_VOICE_COMMUNICATION_SIGNALLING;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioAttributes.Builder wrap(android.media.AudioAttributes.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioAttributes.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.AudioAttributes.Builder getReal() {
            return (android.media.AudioAttributes.Builder) real;
        }

        public android.media.AudioAttributes.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.media.AudioAttributes.Builder(), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0) {
            this(new android.media.AudioAttributes.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.AudioAttributes build() {
            return com.micklab.dcg.wrapper.android.media.AudioAttributes.wrap(((android.media.AudioAttributes.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.media.AudioAttributes.Builder setAllowedCapturePolicy(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioAttributes.Builder.wrap(((android.media.AudioAttributes.Builder) real).setAllowedCapturePolicy(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioAttributes.Builder setContentType(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioAttributes.Builder.wrap(((android.media.AudioAttributes.Builder) real).setContentType(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioAttributes.Builder setFlags(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioAttributes.Builder.wrap(((android.media.AudioAttributes.Builder) real).setFlags(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioAttributes.Builder setHapticChannelsMuted(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioAttributes.Builder.wrap(((android.media.AudioAttributes.Builder) real).setHapticChannelsMuted(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioAttributes.Builder setIsContentSpatialized(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioAttributes.Builder.wrap(((android.media.AudioAttributes.Builder) real).setIsContentSpatialized(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioAttributes.Builder setLegacyStreamType(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioAttributes.Builder.wrap(((android.media.AudioAttributes.Builder) real).setLegacyStreamType(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioAttributes.Builder setSpatializationBehavior(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioAttributes.Builder.wrap(((android.media.AudioAttributes.Builder) real).setSpatializationBehavior(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioAttributes.Builder setUsage(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioAttributes.Builder.wrap(((android.media.AudioAttributes.Builder) real).setUsage(arg0));
        }

    }
}
