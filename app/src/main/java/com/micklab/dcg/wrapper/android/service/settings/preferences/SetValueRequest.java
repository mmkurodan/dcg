// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.settings.preferences;

public final class SetValueRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SetValueRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.settings.preferences.SetValueRequest wrap(android.service.settings.preferences.SetValueRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.settings.preferences.SetValueRequest(real, (__DcgwBridgeToken) null);
    }

    public android.service.settings.preferences.SetValueRequest getReal() {
        return (android.service.settings.preferences.SetValueRequest) real;
    }

    public android.service.settings.preferences.SetValueRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.settings.preferences.SetValueRequest) real).describeContents();
    }

    public java.lang.String getPreferenceKey() {
        return ((android.service.settings.preferences.SetValueRequest) real).getPreferenceKey();
    }

    public com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceValue getPreferenceValue() {
        return com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceValue.wrap(((android.service.settings.preferences.SetValueRequest) real).getPreferenceValue());
    }

    public java.lang.String getScreenKey() {
        return ((android.service.settings.preferences.SetValueRequest) real).getScreenKey();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.settings.preferences.SetValueRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.settings.preferences.SetValueRequest.Builder wrap(android.service.settings.preferences.SetValueRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.settings.preferences.SetValueRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.service.settings.preferences.SetValueRequest.Builder getReal() {
            return (android.service.settings.preferences.SetValueRequest.Builder) real;
        }

        public android.service.settings.preferences.SetValueRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceValue arg2) {
            this(new android.service.settings.preferences.SetValueRequest.Builder(arg0, arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.settings.preferences.SetValueRequest build() {
            return com.micklab.dcg.wrapper.android.service.settings.preferences.SetValueRequest.wrap(((android.service.settings.preferences.SetValueRequest.Builder) real).build());
        }

    }
}
