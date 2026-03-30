// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TvInputInfo {
    private final android.media.tv.TvInputInfo real;

    public TvInputInfo(android.media.tv.TvInputInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TvInputInfo wrap(android.media.tv.TvInputInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvInputInfo(real);
    }

    public android.media.tv.TvInputInfo unwrap() {
        return real;
    }

    public boolean canPauseRecording() {
        return real.canPauseRecording();
    }

    public boolean canRecord() {
        return real.canRecord();
    }

    public com.micklab.dcg.wrapper.android.content.Intent createSettingsIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.createSettingsIntent());
    }

    public com.micklab.dcg.wrapper.android.content.Intent createSetupIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.createSetupIntent());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public java.lang.String getId() {
        return real.getId();
    }

    public java.lang.String getParentId() {
        return real.getParentId();
    }

    public com.micklab.dcg.wrapper.android.content.pm.ServiceInfo getServiceInfo() {
        return com.micklab.dcg.wrapper.android.content.pm.ServiceInfo.wrap(real.getServiceInfo());
    }

    public int getTunerCount() {
        return real.getTunerCount();
    }

    public int getType() {
        return real.getType();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isHidden(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return real.isHidden(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isPassthroughInput() {
        return real.isPassthroughInput();
    }

    public java.lang.CharSequence loadCustomLabel(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return real.loadCustomLabel(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable loadIcon(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.loadIcon(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.CharSequence loadLabel(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return real.loadLabel(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final java.lang.String EXTRA_INPUT_ID = android.media.tv.TvInputInfo.EXTRA_INPUT_ID;
    public static final int TYPE_COMPONENT = android.media.tv.TvInputInfo.TYPE_COMPONENT;
    public static final int TYPE_COMPOSITE = android.media.tv.TvInputInfo.TYPE_COMPOSITE;
    public static final int TYPE_DISPLAY_PORT = android.media.tv.TvInputInfo.TYPE_DISPLAY_PORT;
    public static final int TYPE_DVI = android.media.tv.TvInputInfo.TYPE_DVI;
    public static final int TYPE_HDMI = android.media.tv.TvInputInfo.TYPE_HDMI;
    public static final int TYPE_OTHER = android.media.tv.TvInputInfo.TYPE_OTHER;
    public static final int TYPE_SCART = android.media.tv.TvInputInfo.TYPE_SCART;
    public static final int TYPE_SVIDEO = android.media.tv.TvInputInfo.TYPE_SVIDEO;
    public static final int TYPE_TUNER = android.media.tv.TvInputInfo.TYPE_TUNER;
    public static final int TYPE_VGA = android.media.tv.TvInputInfo.TYPE_VGA;

    public static final class Builder {
        private final android.media.tv.TvInputInfo.Builder real;

        public Builder(android.media.tv.TvInputInfo.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TvInputInfo.Builder wrap(android.media.tv.TvInputInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvInputInfo.Builder(real);
        }

        public android.media.tv.TvInputInfo.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1) {
            this(new android.media.tv.TvInputInfo.Builder(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvInputInfo build() {
            return com.micklab.dcg.wrapper.android.media.tv.TvInputInfo.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvInputInfo.Builder setCanPauseRecording(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvInputInfo.Builder.wrap(real.setCanPauseRecording(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvInputInfo.Builder setCanRecord(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvInputInfo.Builder.wrap(real.setCanRecord(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvInputInfo.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvInputInfo.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvInputInfo.Builder setTunerCount(int arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvInputInfo.Builder.wrap(real.setTunerCount(arg0));
        }

    }
}
