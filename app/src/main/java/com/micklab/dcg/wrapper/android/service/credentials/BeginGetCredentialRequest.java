// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class BeginGetCredentialRequest {
    private final android.service.credentials.BeginGetCredentialRequest real;

    public BeginGetCredentialRequest(android.service.credentials.BeginGetCredentialRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialRequest wrap(android.service.credentials.BeginGetCredentialRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialRequest(real);
    }

    public android.service.credentials.BeginGetCredentialRequest unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo getCallingAppInfo() {
        return com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo.wrap(real.getCallingAppInfo());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.service.credentials.BeginGetCredentialRequest.Builder real;

        public Builder(android.service.credentials.BeginGetCredentialRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialRequest.Builder wrap(android.service.credentials.BeginGetCredentialRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialRequest.Builder(real);
        }

        public android.service.credentials.BeginGetCredentialRequest.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.service.credentials.BeginGetCredentialRequest.Builder());
        }

        public com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialRequest.Builder addBeginGetCredentialOption(com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialOption arg0) {
            return com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialRequest.Builder.wrap(real.addBeginGetCredentialOption(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialRequest build() {
            return com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialRequest.Builder setCallingAppInfo(com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo arg0) {
            return com.micklab.dcg.wrapper.android.service.credentials.BeginGetCredentialRequest.Builder.wrap(real.setCallingAppInfo(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
