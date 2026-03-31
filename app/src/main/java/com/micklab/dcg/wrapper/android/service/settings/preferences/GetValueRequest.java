// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.settings.preferences;

public final class GetValueRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GetValueRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.settings.preferences.GetValueRequest wrap(android.service.settings.preferences.GetValueRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.settings.preferences.GetValueRequest(real, (__DcgwBridgeToken) null);
    }

    public android.service.settings.preferences.GetValueRequest getReal() {
        return (android.service.settings.preferences.GetValueRequest) real;
    }

    public android.service.settings.preferences.GetValueRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.settings.preferences.GetValueRequest) real).describeContents();
    }

    public java.lang.String getPreferenceKey() {
        return ((android.service.settings.preferences.GetValueRequest) real).getPreferenceKey();
    }

    public java.lang.String getScreenKey() {
        return ((android.service.settings.preferences.GetValueRequest) real).getScreenKey();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.settings.preferences.GetValueRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.settings.preferences.GetValueRequest.Builder wrap(android.service.settings.preferences.GetValueRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.settings.preferences.GetValueRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.service.settings.preferences.GetValueRequest.Builder getReal() {
            return (android.service.settings.preferences.GetValueRequest.Builder) real;
        }

        public android.service.settings.preferences.GetValueRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0, java.lang.String arg1) {
            this(new android.service.settings.preferences.GetValueRequest.Builder(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.settings.preferences.GetValueRequest build() {
            return com.micklab.dcg.wrapper.android.service.settings.preferences.GetValueRequest.wrap(((android.service.settings.preferences.GetValueRequest.Builder) real).build());
        }

    }
}
