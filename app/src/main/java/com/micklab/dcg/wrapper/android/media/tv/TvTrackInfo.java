// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TvTrackInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TvTrackInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo wrap(android.media.tv.TvTrackInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.TvTrackInfo getReal() {
        return (android.media.tv.TvTrackInfo) real;
    }

    public android.media.tv.TvTrackInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.media.tv.TvTrackInfo) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.tv.TvTrackInfo) real).equals(arg0);
    }

    public int getAudioChannelCount() {
        return ((android.media.tv.TvTrackInfo) real).getAudioChannelCount();
    }

    public int getAudioSampleRate() {
        return ((android.media.tv.TvTrackInfo) real).getAudioSampleRate();
    }

    public java.lang.CharSequence getDescription() {
        return ((android.media.tv.TvTrackInfo) real).getDescription();
    }

    public java.lang.String getEncoding() {
        return ((android.media.tv.TvTrackInfo) real).getEncoding();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtra() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.media.tv.TvTrackInfo) real).getExtra());
    }

    public java.lang.String getId() {
        return ((android.media.tv.TvTrackInfo) real).getId();
    }

    public java.lang.String getLanguage() {
        return ((android.media.tv.TvTrackInfo) real).getLanguage();
    }

    public int getType() {
        return ((android.media.tv.TvTrackInfo) real).getType();
    }

    public byte getVideoActiveFormatDescription() {
        return ((android.media.tv.TvTrackInfo) real).getVideoActiveFormatDescription();
    }

    public float getVideoFrameRate() {
        return ((android.media.tv.TvTrackInfo) real).getVideoFrameRate();
    }

    public int getVideoHeight() {
        return ((android.media.tv.TvTrackInfo) real).getVideoHeight();
    }

    public float getVideoPixelAspectRatio() {
        return ((android.media.tv.TvTrackInfo) real).getVideoPixelAspectRatio();
    }

    public int getVideoWidth() {
        return ((android.media.tv.TvTrackInfo) real).getVideoWidth();
    }

    public int hashCode() {
        return ((android.media.tv.TvTrackInfo) real).hashCode();
    }

    public boolean isAudioDescription() {
        return ((android.media.tv.TvTrackInfo) real).isAudioDescription();
    }

    public boolean isEncrypted() {
        return ((android.media.tv.TvTrackInfo) real).isEncrypted();
    }

    public boolean isHardOfHearing() {
        return ((android.media.tv.TvTrackInfo) real).isHardOfHearing();
    }

    public boolean isSpokenSubtitle() {
        return ((android.media.tv.TvTrackInfo) real).isSpokenSubtitle();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.TvTrackInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int TYPE_AUDIO = android.media.tv.TvTrackInfo.TYPE_AUDIO;
    public static final int TYPE_SUBTITLE = android.media.tv.TvTrackInfo.TYPE_SUBTITLE;
    public static final int TYPE_VIDEO = android.media.tv.TvTrackInfo.TYPE_VIDEO;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder wrap(android.media.tv.TvTrackInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.tv.TvTrackInfo.Builder getReal() {
            return (android.media.tv.TvTrackInfo.Builder) real;
        }

        public android.media.tv.TvTrackInfo.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0, java.lang.String arg1) {
            this(new android.media.tv.TvTrackInfo.Builder(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo build() {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.wrap(((android.media.tv.TvTrackInfo.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setAudioChannelCount(int arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(((android.media.tv.TvTrackInfo.Builder) real).setAudioChannelCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setAudioDescription(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(((android.media.tv.TvTrackInfo.Builder) real).setAudioDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setAudioSampleRate(int arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(((android.media.tv.TvTrackInfo.Builder) real).setAudioSampleRate(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setDescription(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(((android.media.tv.TvTrackInfo.Builder) real).setDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setEncoding(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(((android.media.tv.TvTrackInfo.Builder) real).setEncoding(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setEncrypted(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(((android.media.tv.TvTrackInfo.Builder) real).setEncrypted(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setExtra(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(((android.media.tv.TvTrackInfo.Builder) real).setExtra(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setHardOfHearing(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(((android.media.tv.TvTrackInfo.Builder) real).setHardOfHearing(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setLanguage(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(((android.media.tv.TvTrackInfo.Builder) real).setLanguage(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setSpokenSubtitle(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(((android.media.tv.TvTrackInfo.Builder) real).setSpokenSubtitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setVideoActiveFormatDescription(byte arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(((android.media.tv.TvTrackInfo.Builder) real).setVideoActiveFormatDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setVideoFrameRate(float arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(((android.media.tv.TvTrackInfo.Builder) real).setVideoFrameRate(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setVideoHeight(int arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(((android.media.tv.TvTrackInfo.Builder) real).setVideoHeight(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setVideoPixelAspectRatio(float arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(((android.media.tv.TvTrackInfo.Builder) real).setVideoPixelAspectRatio(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setVideoWidth(int arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(((android.media.tv.TvTrackInfo.Builder) real).setVideoWidth(arg0));
        }

    }
}
