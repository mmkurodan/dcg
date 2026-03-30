// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class CredentialDataRequest {
    private final android.security.identity.CredentialDataRequest real;

    public CredentialDataRequest(android.security.identity.CredentialDataRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest wrap(android.security.identity.CredentialDataRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest(real);
    }

    public android.security.identity.CredentialDataRequest unwrap() {
        return real;
    }

    public byte[] getReaderSignature() {
        return real.getReaderSignature();
    }

    public byte[] getRequestMessage() {
        return real.getRequestMessage();
    }

    public boolean isAllowUsingExhaustedKeys() {
        return real.isAllowUsingExhaustedKeys();
    }

    public boolean isAllowUsingExpiredKeys() {
        return real.isAllowUsingExpiredKeys();
    }

    public boolean isIncrementUseCount() {
        return real.isIncrementUseCount();
    }

    public static final class Builder {
        private final android.security.identity.CredentialDataRequest.Builder real;

        public Builder(android.security.identity.CredentialDataRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.Builder wrap(android.security.identity.CredentialDataRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.Builder(real);
        }

        public android.security.identity.CredentialDataRequest.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.security.identity.CredentialDataRequest.Builder());
        }

        public com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest build() {
            return com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.Builder setAllowUsingExhaustedKeys(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.Builder.wrap(real.setAllowUsingExhaustedKeys(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.Builder setAllowUsingExpiredKeys(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.Builder.wrap(real.setAllowUsingExpiredKeys(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.Builder setIncrementUseCount(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.Builder.wrap(real.setIncrementUseCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.Builder setReaderSignature(byte[] arg0) {
            return com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.Builder.wrap(real.setReaderSignature(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.Builder setRequestMessage(byte[] arg0) {
            return com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest.Builder.wrap(real.setRequestMessage(arg0));
        }

    }
}
