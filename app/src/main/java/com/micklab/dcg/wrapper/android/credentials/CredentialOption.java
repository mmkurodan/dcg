// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class CredentialOption {
    private final android.credentials.CredentialOption real;

    public CredentialOption(android.credentials.CredentialOption real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.CredentialOption wrap(android.credentials.CredentialOption real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.CredentialOption(real);
    }

    public android.credentials.CredentialOption unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getCandidateQueryData() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getCandidateQueryData());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getCredentialRetrievalData() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getCredentialRetrievalData());
    }

    public java.lang.String getType() {
        return real.getType();
    }

    public boolean isSystemProviderRequired() {
        return real.isSystemProviderRequired();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final java.lang.String SUPPORTED_ELEMENT_KEYS = android.credentials.CredentialOption.SUPPORTED_ELEMENT_KEYS;

    public static final class Builder {
        private final android.credentials.CredentialOption.Builder real;

        public Builder(android.credentials.CredentialOption.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.credentials.CredentialOption.Builder wrap(android.credentials.CredentialOption.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.CredentialOption.Builder(real);
        }

        public android.credentials.CredentialOption.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            this(new android.credentials.CredentialOption.Builder(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.credentials.CredentialOption.Builder addAllowedProvider(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
            return com.micklab.dcg.wrapper.android.credentials.CredentialOption.Builder.wrap(real.addAllowedProvider(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.credentials.CredentialOption build() {
            return com.micklab.dcg.wrapper.android.credentials.CredentialOption.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.credentials.CredentialOption.Builder setIsSystemProviderRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.credentials.CredentialOption.Builder.wrap(real.setIsSystemProviderRequired(arg0));
        }

    }
}
