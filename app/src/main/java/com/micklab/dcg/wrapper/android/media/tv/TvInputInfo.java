// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TvInputInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TvInputInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TvInputInfo wrap(android.media.tv.TvInputInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvInputInfo(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.TvInputInfo getReal() {
        return (android.media.tv.TvInputInfo) real;
    }

    public android.media.tv.TvInputInfo unwrap() {
        return getReal();
    }

    public boolean canPauseRecording() {
        return ((android.media.tv.TvInputInfo) real).canPauseRecording();
    }

    public boolean canRecord() {
        return ((android.media.tv.TvInputInfo) real).canRecord();
    }

    public com.micklab.dcg.wrapper.android.content.Intent createSettingsIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.media.tv.TvInputInfo) real).createSettingsIntent());
    }

    public com.micklab.dcg.wrapper.android.content.Intent createSetupIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.media.tv.TvInputInfo) real).createSetupIntent());
    }

    public int describeContents() {
        return ((android.media.tv.TvInputInfo) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.tv.TvInputInfo) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.media.tv.TvInputInfo) real).getExtras());
    }

    public java.lang.String getId() {
        return ((android.media.tv.TvInputInfo) real).getId();
    }

    public java.lang.String getParentId() {
        return ((android.media.tv.TvInputInfo) real).getParentId();
    }

    public com.micklab.dcg.wrapper.android.content.pm.ServiceInfo getServiceInfo() {
        return com.micklab.dcg.wrapper.android.content.pm.ServiceInfo.wrap(((android.media.tv.TvInputInfo) real).getServiceInfo());
    }

    public int getTunerCount() {
        return ((android.media.tv.TvInputInfo) real).getTunerCount();
    }

    public int getType() {
        return ((android.media.tv.TvInputInfo) real).getType();
    }

    public int hashCode() {
        return ((android.media.tv.TvInputInfo) real).hashCode();
    }

    public boolean isHidden(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return ((android.media.tv.TvInputInfo) real).isHidden(arg0 == null ? null : arg0.getReal());
    }

    public boolean isPassthroughInput() {
        return ((android.media.tv.TvInputInfo) real).isPassthroughInput();
    }

    public java.lang.CharSequence loadCustomLabel(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return ((android.media.tv.TvInputInfo) real).loadCustomLabel(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable loadIcon(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.media.tv.TvInputInfo) real).loadIcon(arg0 == null ? null : arg0.getReal()));
    }

    public java.lang.CharSequence loadLabel(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return ((android.media.tv.TvInputInfo) real).loadLabel(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String toString() {
        return ((android.media.tv.TvInputInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.TvInputInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TvInputInfo.Builder wrap(android.media.tv.TvInputInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvInputInfo.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.tv.TvInputInfo.Builder getReal() {
            return (android.media.tv.TvInputInfo.Builder) real;
        }

        public android.media.tv.TvInputInfo.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1) {
            this(new android.media.tv.TvInputInfo.Builder(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvInputInfo build() {
            return com.micklab.dcg.wrapper.android.media.tv.TvInputInfo.wrap(((android.media.tv.TvInputInfo.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvInputInfo.Builder setCanPauseRecording(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvInputInfo.Builder.wrap(((android.media.tv.TvInputInfo.Builder) real).setCanPauseRecording(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvInputInfo.Builder setCanRecord(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvInputInfo.Builder.wrap(((android.media.tv.TvInputInfo.Builder) real).setCanRecord(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvInputInfo.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvInputInfo.Builder.wrap(((android.media.tv.TvInputInfo.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.tv.TvInputInfo.Builder setTunerCount(int arg0) {
            return com.micklab.dcg.wrapper.android.media.tv.TvInputInfo.Builder.wrap(((android.media.tv.TvInputInfo.Builder) real).setTunerCount(arg0));
        }

    }
}
