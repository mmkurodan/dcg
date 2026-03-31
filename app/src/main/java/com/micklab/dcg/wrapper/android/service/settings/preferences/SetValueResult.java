// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.settings.preferences;

public final class SetValueResult {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SetValueResult(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.settings.preferences.SetValueResult wrap(android.service.settings.preferences.SetValueResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.settings.preferences.SetValueResult(real, (__DcgwBridgeToken) null);
    }

    public android.service.settings.preferences.SetValueResult getReal() {
        return (android.service.settings.preferences.SetValueResult) real;
    }

    public android.service.settings.preferences.SetValueResult unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.settings.preferences.SetValueResult) real).describeContents();
    }

    public int getResultCode() {
        return ((android.service.settings.preferences.SetValueResult) real).getResultCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.settings.preferences.SetValueResult) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int RESULT_DISABLED = android.service.settings.preferences.SetValueResult.RESULT_DISABLED;
    public static final int RESULT_DISALLOW = android.service.settings.preferences.SetValueResult.RESULT_DISALLOW;
    public static final int RESULT_INTERNAL_ERROR = android.service.settings.preferences.SetValueResult.RESULT_INTERNAL_ERROR;
    public static final int RESULT_INVALID_REQUEST = android.service.settings.preferences.SetValueResult.RESULT_INVALID_REQUEST;
    public static final int RESULT_OK = android.service.settings.preferences.SetValueResult.RESULT_OK;
    public static final int RESULT_REQUIRE_APP_PERMISSION = android.service.settings.preferences.SetValueResult.RESULT_REQUIRE_APP_PERMISSION;
    public static final int RESULT_REQUIRE_USER_CONSENT = android.service.settings.preferences.SetValueResult.RESULT_REQUIRE_USER_CONSENT;
    public static final int RESULT_RESTRICTED = android.service.settings.preferences.SetValueResult.RESULT_RESTRICTED;
    public static final int RESULT_UNAVAILABLE = android.service.settings.preferences.SetValueResult.RESULT_UNAVAILABLE;
    public static final int RESULT_UNSUPPORTED = android.service.settings.preferences.SetValueResult.RESULT_UNSUPPORTED;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.settings.preferences.SetValueResult.Builder wrap(android.service.settings.preferences.SetValueResult.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.settings.preferences.SetValueResult.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.service.settings.preferences.SetValueResult.Builder getReal() {
            return (android.service.settings.preferences.SetValueResult.Builder) real;
        }

        public android.service.settings.preferences.SetValueResult.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0) {
            this(new android.service.settings.preferences.SetValueResult.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.settings.preferences.SetValueResult build() {
            return com.micklab.dcg.wrapper.android.service.settings.preferences.SetValueResult.wrap(((android.service.settings.preferences.SetValueResult.Builder) real).build());
        }

    }
}
