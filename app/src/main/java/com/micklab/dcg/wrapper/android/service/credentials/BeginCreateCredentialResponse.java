// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class BeginCreateCredentialResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BeginCreateCredentialResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.BeginCreateCredentialResponse wrap(android.service.credentials.BeginCreateCredentialResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.BeginCreateCredentialResponse(real, (__DcgwBridgeToken) null);
    }

    public android.service.credentials.BeginCreateCredentialResponse getReal() {
        return (android.service.credentials.BeginCreateCredentialResponse) real;
    }

    public android.service.credentials.BeginCreateCredentialResponse unwrap() {
        return getReal();
    }

    public BeginCreateCredentialResponse() {
        this(new android.service.credentials.BeginCreateCredentialResponse(), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.credentials.BeginCreateCredentialResponse) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.service.credentials.RemoteEntry getRemoteCreateEntry() {
        return com.micklab.dcg.wrapper.android.service.credentials.RemoteEntry.wrap(((android.service.credentials.BeginCreateCredentialResponse) real).getRemoteCreateEntry());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.credentials.BeginCreateCredentialResponse) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.credentials.BeginCreateCredentialResponse.Builder wrap(android.service.credentials.BeginCreateCredentialResponse.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.BeginCreateCredentialResponse.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.service.credentials.BeginCreateCredentialResponse.Builder getReal() {
            return (android.service.credentials.BeginCreateCredentialResponse.Builder) real;
        }

        public android.service.credentials.BeginCreateCredentialResponse.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.service.credentials.BeginCreateCredentialResponse.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.credentials.BeginCreateCredentialResponse.Builder addCreateEntry(com.micklab.dcg.wrapper.android.service.credentials.CreateEntry arg0) {
            return com.micklab.dcg.wrapper.android.service.credentials.BeginCreateCredentialResponse.Builder.wrap(((android.service.credentials.BeginCreateCredentialResponse.Builder) real).addCreateEntry(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.service.credentials.BeginCreateCredentialResponse build() {
            return com.micklab.dcg.wrapper.android.service.credentials.BeginCreateCredentialResponse.wrap(((android.service.credentials.BeginCreateCredentialResponse.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.service.credentials.BeginCreateCredentialResponse.Builder setRemoteCreateEntry(com.micklab.dcg.wrapper.android.service.credentials.RemoteEntry arg0) {
            return com.micklab.dcg.wrapper.android.service.credentials.BeginCreateCredentialResponse.Builder.wrap(((android.service.credentials.BeginCreateCredentialResponse.Builder) real).setRemoteCreateEntry(arg0 == null ? null : arg0.getReal()));
        }

    }
}
