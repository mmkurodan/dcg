// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class CreateCredentialRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CreateCredentialRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.CreateCredentialRequest wrap(android.credentials.CreateCredentialRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.CreateCredentialRequest(real, (__DcgwBridgeToken) null);
    }

    public android.credentials.CreateCredentialRequest getReal() {
        return (android.credentials.CreateCredentialRequest) real;
    }

    public android.credentials.CreateCredentialRequest unwrap() {
        return getReal();
    }

    public boolean alwaysSendAppInfoToProvider() {
        return ((android.credentials.CreateCredentialRequest) real).alwaysSendAppInfoToProvider();
    }

    public int describeContents() {
        return ((android.credentials.CreateCredentialRequest) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getCandidateQueryData() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.credentials.CreateCredentialRequest) real).getCandidateQueryData());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getCredentialData() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.credentials.CreateCredentialRequest) real).getCredentialData());
    }

    public java.lang.String getOrigin() {
        return ((android.credentials.CreateCredentialRequest) real).getOrigin();
    }

    public java.lang.String getType() {
        return ((android.credentials.CreateCredentialRequest) real).getType();
    }

    public boolean isSystemProviderRequired() {
        return ((android.credentials.CreateCredentialRequest) real).isSystemProviderRequired();
    }

    public java.lang.String toString() {
        return ((android.credentials.CreateCredentialRequest) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.credentials.CreateCredentialRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.credentials.CreateCredentialRequest.Builder wrap(android.credentials.CreateCredentialRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.CreateCredentialRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.credentials.CreateCredentialRequest.Builder getReal() {
            return (android.credentials.CreateCredentialRequest.Builder) real;
        }

        public android.credentials.CreateCredentialRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            this(new android.credentials.CreateCredentialRequest.Builder(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.credentials.CreateCredentialRequest build() {
            return com.micklab.dcg.wrapper.android.credentials.CreateCredentialRequest.wrap(((android.credentials.CreateCredentialRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.credentials.CreateCredentialRequest.Builder setAlwaysSendAppInfoToProvider(boolean arg0) {
            return com.micklab.dcg.wrapper.android.credentials.CreateCredentialRequest.Builder.wrap(((android.credentials.CreateCredentialRequest.Builder) real).setAlwaysSendAppInfoToProvider(arg0));
        }

        public com.micklab.dcg.wrapper.android.credentials.CreateCredentialRequest.Builder setIsSystemProviderRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.credentials.CreateCredentialRequest.Builder.wrap(((android.credentials.CreateCredentialRequest.Builder) real).setIsSystemProviderRequired(arg0));
        }

        public com.micklab.dcg.wrapper.android.credentials.CreateCredentialRequest.Builder setOrigin(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.credentials.CreateCredentialRequest.Builder.wrap(((android.credentials.CreateCredentialRequest.Builder) real).setOrigin(arg0));
        }

    }
}
