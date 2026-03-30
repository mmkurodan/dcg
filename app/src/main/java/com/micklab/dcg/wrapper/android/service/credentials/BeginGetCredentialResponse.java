// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class BeginGetCredentialResponse {
    private final android.service.credentials.BeginGetCredentialResponse real;

    public BeginGetCredentialResponse(android.service.credentials.BeginGetCredentialResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse wrap(android.service.credentials.BeginGetCredentialResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse(real);
    }

    public android.service.credentials.BeginGetCredentialResponse unwrap() {
        return real;
    }

    public BeginGetCredentialResponse() {
        this(new android.service.credentials.BeginGetCredentialResponse());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.service.credentials.RemoteEntry getRemoteCredentialEntry() {
        return com.micklab.dcg.wrapper.android.service.credentials.RemoteEntry.wrap(real.getRemoteCredentialEntry());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.service.credentials.BeginGetCredentialResponse.Builder real;

        public Builder(android.service.credentials.BeginGetCredentialResponse.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse.Builder wrap(android.service.credentials.BeginGetCredentialResponse.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse.Builder(real);
        }

        public android.service.credentials.BeginGetCredentialResponse.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.service.credentials.BeginGetCredentialResponse.Builder());
        }

        public com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse.Builder addAction(com.micklab.dcg.wrapper.android.service.credentials.Action arg0) {
            return com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse.Builder.wrap(real.addAction(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse.Builder addAuthenticationAction(com.micklab.dcg.wrapper.android.service.credentials.Action arg0) {
            return com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse.Builder.wrap(real.addAuthenticationAction(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse.Builder addCredentialEntry(com.micklab.dcg.wrapper.android.service.credentials.CredentialEntry arg0) {
            return com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse.Builder.wrap(real.addCredentialEntry(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse build() {
            return com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse.Builder setRemoteCredentialEntry(com.micklab.dcg.wrapper.android.service.credentials.RemoteEntry arg0) {
            return com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialResponse.Builder.wrap(real.setRemoteCredentialEntry(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
