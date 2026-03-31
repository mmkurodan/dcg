// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.settings.preferences;

public final class MetadataRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MetadataRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.settings.preferences.MetadataRequest wrap(android.service.settings.preferences.MetadataRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.settings.preferences.MetadataRequest(real, (__DcgwBridgeToken) null);
    }

    public android.service.settings.preferences.MetadataRequest getReal() {
        return (android.service.settings.preferences.MetadataRequest) real;
    }

    public android.service.settings.preferences.MetadataRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.settings.preferences.MetadataRequest) real).describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.settings.preferences.MetadataRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.settings.preferences.MetadataRequest.Builder wrap(android.service.settings.preferences.MetadataRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.settings.preferences.MetadataRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.service.settings.preferences.MetadataRequest.Builder getReal() {
            return (android.service.settings.preferences.MetadataRequest.Builder) real;
        }

        public android.service.settings.preferences.MetadataRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.service.settings.preferences.MetadataRequest.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.settings.preferences.MetadataRequest build() {
            return com.micklab.dcg.wrapper.android.service.settings.preferences.MetadataRequest.wrap(((android.service.settings.preferences.MetadataRequest.Builder) real).build());
        }

    }
}
