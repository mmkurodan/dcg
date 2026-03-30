// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class BeginGetCredentialRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BeginGetCredentialRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialRequest wrap(android.service.credentials.BeginGetCredentialRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialRequest(real, (__DcgwBridgeToken) null);
    }

    public android.service.credentials.BeginGetCredentialRequest getReal() {
        return (android.service.credentials.BeginGetCredentialRequest) real;
    }

    public android.service.credentials.BeginGetCredentialRequest unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.credentials.BeginGetCredentialRequest) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo getCallingAppInfo() {
        return com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo.wrap(((android.service.credentials.BeginGetCredentialRequest) real).getCallingAppInfo());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.credentials.BeginGetCredentialRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialRequest.Builder wrap(android.service.credentials.BeginGetCredentialRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.service.credentials.BeginGetCredentialRequest.Builder getReal() {
            return (android.service.credentials.BeginGetCredentialRequest.Builder) real;
        }

        public android.service.credentials.BeginGetCredentialRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.service.credentials.BeginGetCredentialRequest.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialRequest.Builder addBeginGetCredentialOption(com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialOption arg0) {
            return com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialRequest.Builder.wrap(((android.service.credentials.BeginGetCredentialRequest.Builder) real).addBeginGetCredentialOption(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialRequest build() {
            return com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialRequest.wrap(((android.service.credentials.BeginGetCredentialRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialRequest.Builder setCallingAppInfo(com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo arg0) {
            return com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialRequest.Builder.wrap(((android.service.credentials.BeginGetCredentialRequest.Builder) real).setCallingAppInfo(arg0 == null ? null : arg0.getReal()));
        }

    }
}
