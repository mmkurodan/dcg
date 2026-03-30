// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TvTrackInfo {
    private final android.media.tv.TvTrackInfo real;

    public TvTrackInfo(android.media.tv.TvTrackInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo wrap(android.media.tv.TvTrackInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo(real);
    }

    public android.media.tv.TvTrackInfo unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getAudioChannelCount() {
        return real.getAudioChannelCount();
    }

    public int getAudioSampleRate() {
        return real.getAudioSampleRate();
    }

    public java.lang.CharSequence getDescription() {
        return real.getDescription();
    }

    public java.lang.String getEncoding() {
        return real.getEncoding();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtra() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtra());
    }

    public java.lang.String getId() {
        return real.getId();
    }

    public java.lang.String getLanguage() {
        return real.getLanguage();
    }

    public int getType() {
        return real.getType();
    }

    public byte getVideoActiveFormatDescription() {
        return real.getVideoActiveFormatDescription();
    }

    public float getVideoFrameRate() {
        return real.getVideoFrameRate();
    }

    public int getVideoHeight() {
        return real.getVideoHeight();
    }

    public float getVideoPixelAspectRatio() {
        return real.getVideoPixelAspectRatio();
    }

    public int getVideoWidth() {
        return real.getVideoWidth();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isAudioDescription() {
        return real.isAudioDescription();
    }

    public boolean isEncrypted() {
        return real.isEncrypted();
    }

    public boolean isHardOfHearing() {
        return real.isHardOfHearing();
    }

    public boolean isSpokenSubtitle() {
        return real.isSpokenSubtitle();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int TYPE_AUDIO = android.media.tv.TvTrackInfo.TYPE_AUDIO;
    public static final int TYPE_SUBTITLE = android.media.tv.TvTrackInfo.TYPE_SUBTITLE;
    public static final int TYPE_VIDEO = android.media.tv.TvTrackInfo.TYPE_VIDEO;

    public static final class Builder {
        private final android.media.tv.TvTrackInfo.Builder real;

        public Builder(android.media.tv.TvTrackInfo.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder wrap(android.media.tv.TvTrackInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder(real);
        }

        public android.media.tv.TvTrackInfo.Builder unwrap() {
            return real;
        }

        public Builder(int arg0, java.lang.String arg1) {
            this(new android.media.tv.TvTrackInfo.Builder(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo build() {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setAudioChannelCount(int arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(real.setAudioChannelCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setAudioDescription(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(real.setAudioDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setAudioSampleRate(int arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(real.setAudioSampleRate(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setDescription(java.lang.CharSequence arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(real.setDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setEncoding(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(real.setEncoding(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setEncrypted(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(real.setEncrypted(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setExtra(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(real.setExtra(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setHardOfHearing(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(real.setHardOfHearing(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setLanguage(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(real.setLanguage(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setSpokenSubtitle(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(real.setSpokenSubtitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setVideoActiveFormatDescription(byte arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(real.setVideoActiveFormatDescription(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setVideoFrameRate(float arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(real.setVideoFrameRate(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setVideoHeight(int arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(real.setVideoHeight(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setVideoPixelAspectRatio(float arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(real.setVideoPixelAspectRatio(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder setVideoWidth(int arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvTrackInfo.Builder.wrap(real.setVideoWidth(arg0));
        }

    }
}
