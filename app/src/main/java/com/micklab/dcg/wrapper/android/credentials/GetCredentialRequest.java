// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class GetCredentialRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GetCredentialRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest wrap(android.credentials.GetCredentialRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest(real, (__DcgwBridgeToken) null);
    }

    public android.credentials.GetCredentialRequest getReal() {
        return (android.credentials.GetCredentialRequest) real;
    }

    public android.credentials.GetCredentialRequest unwrap() {
        return getReal();
    }

    public boolean alwaysSendAppInfoToProvider() {
        return ((android.credentials.GetCredentialRequest) real).alwaysSendAppInfoToProvider();
    }

    public int describeContents() {
        return ((android.credentials.GetCredentialRequest) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getData() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.credentials.GetCredentialRequest) real).getData());
    }

    public java.lang.String getOrigin() {
        return ((android.credentials.GetCredentialRequest) real).getOrigin();
    }

    public java.lang.String toString() {
        return ((android.credentials.GetCredentialRequest) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.credentials.GetCredentialRequest) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest.Builder wrap(android.credentials.GetCredentialRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.credentials.GetCredentialRequest.Builder getReal() {
            return (android.credentials.GetCredentialRequest.Builder) real;
        }

        public android.credentials.GetCredentialRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            this(new android.credentials.GetCredentialRequest.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest.Builder addCredentialOption(com.micklab.dcg.wrapper.android.credentials.CredentialOption arg0) {
            return com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest.Builder.wrap(((android.credentials.GetCredentialRequest.Builder) real).addCredentialOption(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest build() {
            return com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest.wrap(((android.credentials.GetCredentialRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest.Builder setAlwaysSendAppInfoToProvider(boolean arg0) {
            return com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest.Builder.wrap(((android.credentials.GetCredentialRequest.Builder) real).setAlwaysSendAppInfoToProvider(arg0));
        }

        public com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest.Builder setOrigin(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest.Builder.wrap(((android.credentials.GetCredentialRequest.Builder) real).setOrigin(arg0));
        }

    }
}
