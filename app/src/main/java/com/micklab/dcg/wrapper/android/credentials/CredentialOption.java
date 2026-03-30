// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class CredentialOption {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CredentialOption(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.CredentialOption wrap(android.credentials.CredentialOption real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.CredentialOption(real, (__DcgwBridgeToken) null);
    }

    public android.credentials.CredentialOption getReal() {
        return (android.credentials.CredentialOption) real;
    }

    public android.credentials.CredentialOption unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.credentials.CredentialOption) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getCandidateQueryData() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.credentials.CredentialOption) real).getCandidateQueryData());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getCredentialRetrievalData() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.credentials.CredentialOption) real).getCredentialRetrievalData());
    }

    public java.lang.String getType() {
        return ((android.credentials.CredentialOption) real).getType();
    }

    public boolean isSystemProviderRequired() {
        return ((android.credentials.CredentialOption) real).isSystemProviderRequired();
    }

    public java.lang.String toString() {
        return ((android.credentials.CredentialOption) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.credentials.CredentialOption) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String SUPPORTED_ELEMENT_KEYS = android.credentials.CredentialOption.SUPPORTED_ELEMENT_KEYS;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.credentials.CredentialOption.Builder wrap(android.credentials.CredentialOption.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.CredentialOption.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.credentials.CredentialOption.Builder getReal() {
            return (android.credentials.CredentialOption.Builder) real;
        }

        public android.credentials.CredentialOption.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            this(new android.credentials.CredentialOption.Builder(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.credentials.CredentialOption.Builder addAllowedProvider(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
            return com.micklab.dcg.wrapper.android.credentials.CredentialOption.Builder.wrap(((android.credentials.CredentialOption.Builder) real).addAllowedProvider(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.credentials.CredentialOption build() {
            return com.micklab.dcg.wrapper.android.credentials.CredentialOption.wrap(((android.credentials.CredentialOption.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.credentials.CredentialOption.Builder setIsSystemProviderRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.credentials.CredentialOption.Builder.wrap(((android.credentials.CredentialOption.Builder) real).setIsSystemProviderRequired(arg0));
        }

    }
}
