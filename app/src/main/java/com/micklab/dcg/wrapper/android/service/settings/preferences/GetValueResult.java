// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.settings.preferences;

public final class GetValueResult {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GetValueResult(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.settings.preferences.GetValueResult wrap(android.service.settings.preferences.GetValueResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.settings.preferences.GetValueResult(real, (__DcgwBridgeToken) null);
    }

    public android.service.settings.preferences.GetValueResult getReal() {
        return (android.service.settings.preferences.GetValueResult) real;
    }

    public android.service.settings.preferences.GetValueResult unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.settings.preferences.GetValueResult) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata getMetadata() {
        return com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata.wrap(((android.service.settings.preferences.GetValueResult) real).getMetadata());
    }

    public int getResultCode() {
        return ((android.service.settings.preferences.GetValueResult) real).getResultCode();
    }

    public com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceValue getValue() {
        return com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceValue.wrap(((android.service.settings.preferences.GetValueResult) real).getValue());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.settings.preferences.GetValueResult) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int RESULT_DISALLOW = android.service.settings.preferences.GetValueResult.RESULT_DISALLOW;
    public static final int RESULT_INTERNAL_ERROR = android.service.settings.preferences.GetValueResult.RESULT_INTERNAL_ERROR;
    public static final int RESULT_INVALID_REQUEST = android.service.settings.preferences.GetValueResult.RESULT_INVALID_REQUEST;
    public static final int RESULT_OK = android.service.settings.preferences.GetValueResult.RESULT_OK;
    public static final int RESULT_REQUIRE_APP_PERMISSION = android.service.settings.preferences.GetValueResult.RESULT_REQUIRE_APP_PERMISSION;
    public static final int RESULT_UNAVAILABLE = android.service.settings.preferences.GetValueResult.RESULT_UNAVAILABLE;
    public static final int RESULT_UNSUPPORTED = android.service.settings.preferences.GetValueResult.RESULT_UNSUPPORTED;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.settings.preferences.GetValueResult.Builder wrap(android.service.settings.preferences.GetValueResult.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.settings.preferences.GetValueResult.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.service.settings.preferences.GetValueResult.Builder getReal() {
            return (android.service.settings.preferences.GetValueResult.Builder) real;
        }

        public android.service.settings.preferences.GetValueResult.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0) {
            this(new android.service.settings.preferences.GetValueResult.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.settings.preferences.GetValueResult build() {
            return com.micklab.dcg.wrapper.android.service.settings.preferences.GetValueResult.wrap(((android.service.settings.preferences.GetValueResult.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.service.settings.preferences.GetValueResult.Builder setMetadata(com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceMetadata arg0) {
            return com.micklab.dcg.wrapper.android.service.settings.preferences.GetValueResult.Builder.wrap(((android.service.settings.preferences.GetValueResult.Builder) real).setMetadata(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.settings.preferences.GetValueResult.Builder setValue(com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceValue arg0) {
            return com.micklab.dcg.wrapper.android.service.settings.preferences.GetValueResult.Builder.wrap(((android.service.settings.preferences.GetValueResult.Builder) real).setValue(arg0 == null ? null : arg0.getReal()));
        }

    }
}
