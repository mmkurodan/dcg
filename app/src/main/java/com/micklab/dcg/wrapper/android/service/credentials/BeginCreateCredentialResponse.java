// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class BeginCreateCredentialResponse {
    private final android.service.credentials.BeginCreateCredentialResponse real;

    public BeginCreateCredentialResponse(android.service.credentials.BeginCreateCredentialResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.BeginCreateCredentialResponse wrap(android.service.credentials.BeginCreateCredentialResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.BeginCreateCredentialResponse(real);
    }

    public android.service.credentials.BeginCreateCredentialResponse unwrap() {
        return real;
    }

    public BeginCreateCredentialResponse() {
        this(new android.service.credentials.BeginCreateCredentialResponse());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.service.credentials.RemoteEntry getRemoteCreateEntry() {
        return com.micklab.dcg.wrapper.android.service.credentials.RemoteEntry.wrap(real.getRemoteCreateEntry());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Builder {
        private final android.service.credentials.BeginCreateCredentialResponse.Builder real;

        public Builder(android.service.credentials.BeginCreateCredentialResponse.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.credentials.BeginCreateCredentialResponse.Builder wrap(android.service.credentials.BeginCreateCredentialResponse.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.BeginCreateCredentialResponse.Builder(real);
        }

        public android.service.credentials.BeginCreateCredentialResponse.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.service.credentials.BeginCreateCredentialResponse.Builder());
        }

        public com.micklab.dcg.wrapper.android.service.credentials.BeginCreateCredentialResponse.Builder addCreateEntry(com.micklab.dcg.wrapper.android.service.credentials.CreateEntry arg0) {
            return com.micklab.dcg.wrapper.android.service.credentials.BeginCreateCredentialResponse.Builder.wrap(real.addCreateEntry(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.service.credentials.BeginCreateCredentialResponse build() {
            return com.micklab.dcg.wrapper.android.service.credentials.BeginCreateCredentialResponse.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.service.credentials.BeginCreateCredentialResponse.Builder setRemoteCreateEntry(com.micklab.dcg.wrapper.android.service.credentials.RemoteEntry arg0) {
            return com.micklab.dcg.wrapper.android.service.credentials.BeginCreateCredentialResponse.Builder.wrap(real.setRemoteCreateEntry(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
