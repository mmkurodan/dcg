// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class CredentialDataRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CredentialDataRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest wrap(android.security.identity.CredentialDataRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest(real, (__DcgwBridgeToken) null);
    }

    public android.security.identity.CredentialDataRequest getReal() {
        return (android.security.identity.CredentialDataRequest) real;
    }

    public android.security.identity.CredentialDataRequest unwrap() {
        return getReal();
    }

    public byte[] getReaderSignature() {
        return ((android.security.identity.CredentialDataRequest) real).getReaderSignature();
    }

    public byte[] getRequestMessage() {
        return ((android.security.identity.CredentialDataRequest) real).getRequestMessage();
    }

    public boolean isAllowUsingExhaustedKeys() {
        return ((android.security.identity.CredentialDataRequest) real).isAllowUsingExhaustedKeys();
    }

    public boolean isAllowUsingExpiredKeys() {
        return ((android.security.identity.CredentialDataRequest) real).isAllowUsingExpiredKeys();
    }

    public boolean isIncrementUseCount() {
        return ((android.security.identity.CredentialDataRequest) real).isIncrementUseCount();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.Builder wrap(android.security.identity.CredentialDataRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.security.identity.CredentialDataRequest.Builder getReal() {
            return (android.security.identity.CredentialDataRequest.Builder) real;
        }

        public android.security.identity.CredentialDataRequest.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.security.identity.CredentialDataRequest.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest build() {
            return com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.wrap(((android.security.identity.CredentialDataRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.Builder setAllowUsingExhaustedKeys(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.Builder.wrap(((android.security.identity.CredentialDataRequest.Builder) real).setAllowUsingExhaustedKeys(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.Builder setAllowUsingExpiredKeys(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.Builder.wrap(((android.security.identity.CredentialDataRequest.Builder) real).setAllowUsingExpiredKeys(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.Builder setIncrementUseCount(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.Builder.wrap(((android.security.identity.CredentialDataRequest.Builder) real).setIncrementUseCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.Builder setReaderSignature(byte[] arg0) {
            return com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.Builder.wrap(((android.security.identity.CredentialDataRequest.Builder) real).setReaderSignature(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.Builder setRequestMessage(byte[] arg0) {
            return com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.Builder.wrap(((android.security.identity.CredentialDataRequest.Builder) real).setRequestMessage(arg0));
        }

    }
}
