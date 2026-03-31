// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.settings.preferences;

public final class MetadataResult {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MetadataResult(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.settings.preferences.MetadataResult wrap(android.service.settings.preferences.MetadataResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.settings.preferences.MetadataResult(real, (__DcgwBridgeToken) null);
    }

    public android.service.settings.preferences.MetadataResult getReal() {
        return (android.service.settings.preferences.MetadataResult) real;
    }

    public android.service.settings.preferences.MetadataResult unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.settings.preferences.MetadataResult) real).describeContents();
    }

    public int getResultCode() {
        return ((android.service.settings.preferences.MetadataResult) real).getResultCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.settings.preferences.MetadataResult) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int RESULT_INTERNAL_ERROR = android.service.settings.preferences.MetadataResult.RESULT_INTERNAL_ERROR;
    public static final int RESULT_OK = android.service.settings.preferences.MetadataResult.RESULT_OK;
    public static final int RESULT_UNSUPPORTED = android.service.settings.preferences.MetadataResult.RESULT_UNSUPPORTED;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.settings.preferences.MetadataResult.Builder wrap(android.service.settings.preferences.MetadataResult.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.settings.preferences.MetadataResult.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.service.settings.preferences.MetadataResult.Builder getReal() {
            return (android.service.settings.preferences.MetadataResult.Builder) real;
        }

        public android.service.settings.preferences.MetadataResult.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0) {
            this(new android.service.settings.preferences.MetadataResult.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.settings.preferences.MetadataResult build() {
            return com.micklab.dcg.wrapper.android.service.settings.preferences.MetadataResult.wrap(((android.service.settings.preferences.MetadataResult.Builder) real).build());
        }

    }
}
