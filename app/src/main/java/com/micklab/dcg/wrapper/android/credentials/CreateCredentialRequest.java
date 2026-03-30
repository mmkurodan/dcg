// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class CreateCredentialRequest {
    private final android.credentials.CreateCredentialRequest real;

    public CreateCredentialRequest(android.credentials.CreateCredentialRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.CreateCredentialRequest wrap(android.credentials.CreateCredentialRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.CreateCredentialRequest(real);
    }

    public android.credentials.CreateCredentialRequest unwrap() {
        return real;
    }

    public boolean alwaysSendAppInfoToProvider() {
        return real.alwaysSendAppInfoToProvider();
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getCandidateQueryData() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getCandidateQueryData());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getCredentialData() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getCredentialData());
    }

    public java.lang.String getOrigin() {
        return real.getOrigin();
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


    public static final class Builder {
        private final android.credentials.CreateCredentialRequest.Builder real;

        public Builder(android.credentials.CreateCredentialRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.credentials.CreateCredentialRequest.Builder wrap(android.credentials.CreateCredentialRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.CreateCredentialRequest.Builder(real);
        }

        public android.credentials.CreateCredentialRequest.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            this(new android.credentials.CreateCredentialRequest.Builder(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.credentials.CreateCredentialRequest build() {
            return com.micklab.dcg.wrapper.android.credentials.CreateCredentialRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.credentials.CreateCredentialRequest.Builder setAlwaysSendAppInfoToProvider(boolean arg0) {
            return com.micklab.dcg.wrapper.android.credentials.CreateCredentialRequest.Builder.wrap(real.setAlwaysSendAppInfoToProvider(arg0));
        }

        public com.micklab.dcg.wrapper.android.credentials.CreateCredentialRequest.Builder setIsSystemProviderRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.credentials.CreateCredentialRequest.Builder.wrap(real.setIsSystemProviderRequired(arg0));
        }

        public com.micklab.dcg.wrapper.android.credentials.CreateCredentialRequest.Builder setOrigin(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.credentials.CreateCredentialRequest.Builder.wrap(real.setOrigin(arg0));
        }

    }
}
