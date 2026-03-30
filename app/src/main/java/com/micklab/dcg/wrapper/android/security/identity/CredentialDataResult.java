// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class CredentialDataResult {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CredentialDataResult(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.CredentialDataResult wrap(android.security.identity.CredentialDataResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.CredentialDataResult(real, (__DcgwBridgeToken) null);
    }

    public android.security.identity.CredentialDataResult getReal() {
        return (android.security.identity.CredentialDataResult) real;
    }

    public android.security.identity.CredentialDataResult unwrap() {
        return getReal();
    }

    public byte[] getDeviceMac() {
        return ((android.security.identity.CredentialDataResult) real).getDeviceMac();
    }

    public byte[] getDeviceNameSpaces() {
        return ((android.security.identity.CredentialDataResult) real).getDeviceNameSpaces();
    }

    public byte[] getDeviceSignature() {
        return ((android.security.identity.CredentialDataResult) real).getDeviceSignature();
    }

    public com.micklab.dcg.wrapper.android.security.identity.CredentialDataResult.Entries getDeviceSignedEntries() {
        return com.micklab.dcg.wrapper.android.security.identity.CredentialDataResult.Entries.wrap(((android.security.identity.CredentialDataResult) real).getDeviceSignedEntries());
    }

    public com.micklab.dcg.wrapper.android.security.identity.CredentialDataResult.Entries getIssuerSignedEntries() {
        return com.micklab.dcg.wrapper.android.security.identity.CredentialDataResult.Entries.wrap(((android.security.identity.CredentialDataResult) real).getIssuerSignedEntries());
    }

    public byte[] getStaticAuthenticationData() {
        return ((android.security.identity.CredentialDataResult) real).getStaticAuthenticationData();
    }

    public static final class Entries {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Entries(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.security.identity.CredentialDataResult.Entries wrap(android.security.identity.CredentialDataResult.Entries real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.CredentialDataResult.Entries(real, (__DcgwBridgeToken) null);
        }

        public android.security.identity.CredentialDataResult.Entries getReal() {
            return (android.security.identity.CredentialDataResult.Entries) real;
        }

        public android.security.identity.CredentialDataResult.Entries unwrap() {
            return getReal();
        }

        public byte[] getEntry(java.lang.String arg0, java.lang.String arg1) {
            return ((android.security.identity.CredentialDataResult.Entries) real).getEntry(arg0, arg1);
        }

        public int getStatus(java.lang.String arg0, java.lang.String arg1) {
            return ((android.security.identity.CredentialDataResult.Entries) real).getStatus(arg0, arg1);
        }

        public static final int STATUS_NOT_IN_REQUEST_MESSAGE = android.security.identity.CredentialDataResult.Entries.STATUS_NOT_IN_REQUEST_MESSAGE;
        public static final int STATUS_NOT_REQUESTED = android.security.identity.CredentialDataResult.Entries.STATUS_NOT_REQUESTED;
        public static final int STATUS_NO_SUCH_ENTRY = android.security.identity.CredentialDataResult.Entries.STATUS_NO_SUCH_ENTRY;
        public static final int STATUS_OK = android.security.identity.CredentialDataResult.Entries.STATUS_OK;
        public static final int STATUS_READER_AUTHENTICATION_FAILED = android.security.identity.CredentialDataResult.Entries.STATUS_READER_AUTHENTICATION_FAILED;
        public static final int STATUS_USER_AUTHENTICATION_FAILED = android.security.identity.CredentialDataResult.Entries.STATUS_USER_AUTHENTICATION_FAILED;

    }
}
