// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class BeginGetCredentialResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BeginGetCredentialResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse wrap(android.service.credentials.BeginGetCredentialResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse(real, (__DcgwBridgeToken) null);
    }

    public android.service.credentials.BeginGetCredentialResponse getReal() {
        return (android.service.credentials.BeginGetCredentialResponse) real;
    }

    public android.service.credentials.BeginGetCredentialResponse unwrap() {
        return getReal();
    }

    public BeginGetCredentialResponse() {
        this(new android.service.credentials.BeginGetCredentialResponse(), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.credentials.BeginGetCredentialResponse) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.service.credentials.RemoteEntry getRemoteCredentialEntry() {
        return com.micklab.dcg.wrapper.android.service.credentials.RemoteEntry.wrap(((android.service.credentials.BeginGetCredentialResponse) real).getRemoteCredentialEntry());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.credentials.BeginGetCredentialResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse.Builder wrap(android.service.credentials.BeginGetCredentialResponse.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.service.credentials.BeginGetCredentialResponse.Builder getReal() {
            return (android.service.credentials.BeginGetCredentialResponse.Builder) real;
        }

        public android.service.credentials.BeginGetCredentialResponse.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.service.credentials.BeginGetCredentialResponse.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse.Builder addAction(com.micklab.dcg.wrapper.android.service.credentials.Action arg0) {
            return com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse.Builder.wrap(((android.service.credentials.BeginGetCredentialResponse.Builder) real).addAction(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse.Builder addAuthenticationAction(com.micklab.dcg.wrapper.android.service.credentials.Action arg0) {
            return com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse.Builder.wrap(((android.service.credentials.BeginGetCredentialResponse.Builder) real).addAuthenticationAction(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse.Builder addCredentialEntry(com.micklab.dcg.wrapper.android.service.credentials.CredentialEntry arg0) {
            return com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse.Builder.wrap(((android.service.credentials.BeginGetCredentialResponse.Builder) real).addCredentialEntry(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse build() {
            return com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse.wrap(((android.service.credentials.BeginGetCredentialResponse.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse.Builder setRemoteCredentialEntry(com.micklab.dcg.wrapper.android.service.credentials.RemoteEntry arg0) {
            return com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse.Builder.wrap(((android.service.credentials.BeginGetCredentialResponse.Builder) real).setRemoteCredentialEntry(arg0 == null ? null : arg0.getReal()));
        }

    }
}
