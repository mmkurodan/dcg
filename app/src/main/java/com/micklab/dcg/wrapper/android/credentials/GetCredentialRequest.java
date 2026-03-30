// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class GetCredentialRequest {
    private final android.credentials.GetCredentialRequest real;

    public GetCredentialRequest(android.credentials.GetCredentialRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest wrap(android.credentials.GetCredentialRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest(real);
    }

    public android.credentials.GetCredentialRequest unwrap() {
        return real;
    }

    public boolean alwaysSendAppInfoToProvider() {
        return real.alwaysSendAppInfoToProvider();
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getData() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getData());
    }

    public java.lang.String getOrigin() {
        return real.getOrigin();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.credentials.GetCredentialRequest.Builder real;

        public Builder(android.credentials.GetCredentialRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest.Builder wrap(android.credentials.GetCredentialRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest.Builder(real);
        }

        public android.credentials.GetCredentialRequest.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            this(new android.credentials.GetCredentialRequest.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest.Builder addCredentialOption(com.micklab.dcg.wrapper.android.credentials.CredentialOption arg0) {
            return com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest.Builder.wrap(real.addCredentialOption(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest build() {
            return com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest.Builder setAlwaysSendAppInfoToProvider(boolean arg0) {
            return com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest.Builder.wrap(real.setAlwaysSendAppInfoToProvider(arg0));
        }

        public com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest.Builder setOrigin(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.credentials.GetCredentialRequest.Builder.wrap(real.setOrigin(arg0));
        }

    }
}
