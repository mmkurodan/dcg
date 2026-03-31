// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.settings.preferences;

public final class SettingsPreferenceMetadata {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SettingsPreferenceMetadata(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata wrap(android.service.settings.preferences.SettingsPreferenceMetadata real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata(real, (__DcgwBridgeToken) null);
    }

    public android.service.settings.preferences.SettingsPreferenceMetadata getReal() {
        return (android.service.settings.preferences.SettingsPreferenceMetadata) real;
    }

    public android.service.settings.preferences.SettingsPreferenceMetadata unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.settings.preferences.SettingsPreferenceMetadata) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.service.settings.preferences.SettingsPreferenceMetadata) real).getExtras());
    }

    public java.lang.String getKey() {
        return ((android.service.settings.preferences.SettingsPreferenceMetadata) real).getKey();
    }

    public com.micklab.dcg.wrapper.android.content.Intent getLaunchIntent() {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.service.settings.preferences.SettingsPreferenceMetadata) real).getLaunchIntent());
    }

    public java.lang.String getScreenKey() {
        return ((android.service.settings.preferences.SettingsPreferenceMetadata) real).getScreenKey();
    }

    public java.lang.String getSummary() {
        return ((android.service.settings.preferences.SettingsPreferenceMetadata) real).getSummary();
    }

    public java.lang.String getTitle() {
        return ((android.service.settings.preferences.SettingsPreferenceMetadata) real).getTitle();
    }

    public int getWriteSensitivity() {
        return ((android.service.settings.preferences.SettingsPreferenceMetadata) real).getWriteSensitivity();
    }

    public boolean isAvailable() {
        return ((android.service.settings.preferences.SettingsPreferenceMetadata) real).isAvailable();
    }

    public boolean isEnabled() {
        return ((android.service.settings.preferences.SettingsPreferenceMetadata) real).isEnabled();
    }

    public boolean isRestricted() {
        return ((android.service.settings.preferences.SettingsPreferenceMetadata) real).isRestricted();
    }

    public boolean isWritable() {
        return ((android.service.settings.preferences.SettingsPreferenceMetadata) real).isWritable();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.settings.preferences.SettingsPreferenceMetadata) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int DEEPLINK_ONLY = android.service.settings.preferences.SettingsPreferenceMetadata.DEEPLINK_ONLY;
    public static final int EXPECT_POST_CONFIRMATION = android.service.settings.preferences.SettingsPreferenceMetadata.EXPECT_POST_CONFIRMATION;
    public static final int NO_DIRECT_ACCESS = android.service.settings.preferences.SettingsPreferenceMetadata.NO_DIRECT_ACCESS;
    public static final int NO_SENSITIVITY = android.service.settings.preferences.SettingsPreferenceMetadata.NO_SENSITIVITY;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata.Builder wrap(android.service.settings.preferences.SettingsPreferenceMetadata.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder getReal() {
            return (android.service.settings.preferences.SettingsPreferenceMetadata.Builder) real;
        }

        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0, java.lang.String arg1) {
            this(new android.service.settings.preferences.SettingsPreferenceMetadata.Builder(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata build() {
            return com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata.wrap(((android.service.settings.preferences.SettingsPreferenceMetadata.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata.Builder setAvailable(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata.Builder.wrap(((android.service.settings.preferences.SettingsPreferenceMetadata.Builder) real).setAvailable(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata.Builder setEnabled(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata.Builder.wrap(((android.service.settings.preferences.SettingsPreferenceMetadata.Builder) real).setEnabled(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata.Builder.wrap(((android.service.settings.preferences.SettingsPreferenceMetadata.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata.Builder setLaunchIntent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
            return com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata.Builder.wrap(((android.service.settings.preferences.SettingsPreferenceMetadata.Builder) real).setLaunchIntent(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata.Builder setRestricted(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata.Builder.wrap(((android.service.settings.preferences.SettingsPreferenceMetadata.Builder) real).setRestricted(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata.Builder setSummary(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata.Builder.wrap(((android.service.settings.preferences.SettingsPreferenceMetadata.Builder) real).setSummary(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata.Builder setTitle(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata.Builder.wrap(((android.service.settings.preferences.SettingsPreferenceMetadata.Builder) real).setTitle(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata.Builder setWritable(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata.Builder.wrap(((android.service.settings.preferences.SettingsPreferenceMetadata.Builder) real).setWritable(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata.Builder setWriteSensitivity(int arg0) {
            return com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata.Builder.wrap(((android.service.settings.preferences.SettingsPreferenceMetadata.Builder) real).setWriteSensitivity(arg0));
        }

    }
}
