// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class CredentialDataResult {
    private final android.security.identity.CredentialDataResult real;

    public CredentialDataResult(android.security.identity.CredentialDataResult real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.CredentialDataResult wrap(android.security.identity.CredentialDataResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.CredentialDataResult(real);
    }

    public android.security.identity.CredentialDataResult unwrap() {
        return real;
    }

    public byte[] getDeviceMac() {
        return real.getDeviceMac();
    }

    public byte[] getDeviceNameSpaces() {
        return real.getDeviceNameSpaces();
    }

    public byte[] getDeviceSignature() {
        return real.getDeviceSignature();
    }

    public com.micklab.dcg.wrapper.android.security.identity.CredentialDataResult.Entries getDeviceSignedEntries() {
        return com.micklab.dcg.wrapper.android.security.identity.CredentialDataResult.Entries.wrap(real.getDeviceSignedEntries());
    }

    public com.micklab.dcg.wrapper.android.security.identity.CredentialDataResult.Entries getIssuerSignedEntries() {
        return com.micklab.dcg.wrapper.android.security.identity.CredentialDataResult.Entries.wrap(real.getIssuerSignedEntries());
    }

    public byte[] getStaticAuthenticationData() {
        return real.getStaticAuthenticationData();
    }

    public static final class Entries {
        private final android.security.identity.CredentialDataResult.Entries real;

        public Entries(android.security.identity.CredentialDataResult.Entries real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.security.identity.CredentialDataResult.Entries wrap(android.security.identity.CredentialDataResult.Entries real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.CredentialDataResult.Entries(real);
        }

        public android.security.identity.CredentialDataResult.Entries unwrap() {
            return real;
        }

        public byte[] getEntry(java.lang.String arg0, java.lang.String arg1) {
            return real.getEntry(arg0, arg1);
        }

        public int getStatus(java.lang.String arg0, java.lang.String arg1) {
            return real.getStatus(arg0, arg1);
        }

        public static final int STATUS_NOT_IN_REQUEST_MESSAGE = android.security.identity.CredentialDataResult.Entries.STATUS_NOT_IN_REQUEST_MESSAGE;
        public static final int STATUS_NOT_REQUESTED = android.security.identity.CredentialDataResult.Entries.STATUS_NOT_REQUESTED;
        public static final int STATUS_NO_SUCH_ENTRY = android.security.identity.CredentialDataResult.Entries.STATUS_NO_SUCH_ENTRY;
        public static final int STATUS_OK = android.security.identity.CredentialDataResult.Entries.STATUS_OK;
        public static final int STATUS_READER_AUTHENTICATION_FAILED = android.security.identity.CredentialDataResult.Entries.STATUS_READER_AUTHENTICATION_FAILED;
        public static final int STATUS_USER_AUTHENTICATION_FAILED = android.security.identity.CredentialDataResult.Entries.STATUS_USER_AUTHENTICATION_FAILED;

    }
}
