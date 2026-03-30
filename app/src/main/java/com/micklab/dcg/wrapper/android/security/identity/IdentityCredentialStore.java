// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class IdentityCredentialStore {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IdentityCredentialStore(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.IdentityCredentialStore wrap(android.security.identity.IdentityCredentialStore real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.IdentityCredentialStore(real, (__DcgwBridgeToken) null);
    }

    public android.security.identity.IdentityCredentialStore getReal() {
        return (android.security.identity.IdentityCredentialStore) real;
    }

    public android.security.identity.IdentityCredentialStore unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.security.identity.WritableIdentityCredential createCredential(java.lang.String arg0, java.lang.String arg1) throws android.security.identity.AlreadyPersonalizedException, android.security.identity.DocTypeNotSupportedException {
        return com.micklab.dcg.wrapper.android.security.identity.WritableIdentityCredential.wrap(((android.security.identity.IdentityCredentialStore) real).createCredential(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.security.identity.PresentationSession createPresentationSession(int arg0) throws android.security.identity.CipherSuiteNotSupportedException {
        return com.micklab.dcg.wrapper.android.security.identity.PresentationSession.wrap(((android.security.identity.IdentityCredentialStore) real).createPresentationSession(arg0));
    }

    public byte[] deleteCredentialByName(java.lang.String arg0) {
        return ((android.security.identity.IdentityCredentialStore) real).deleteCredentialByName(arg0);
    }

    public com.micklab.dcg.wrapper.android.security.identity.IdentityCredential getCredentialByName(java.lang.String arg0, int arg1) throws android.security.identity.CipherSuiteNotSupportedException {
        return com.micklab.dcg.wrapper.android.security.identity.IdentityCredential.wrap(((android.security.identity.IdentityCredentialStore) real).getCredentialByName(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.security.identity.IdentityCredentialStore getDirectAccessInstance(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.security.identity.IdentityCredentialStore.wrap(android.security.identity.IdentityCredentialStore.getDirectAccessInstance(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.security.identity.IdentityCredentialStore getInstance(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.security.identity.IdentityCredentialStore.wrap(android.security.identity.IdentityCredentialStore.getInstance(arg0 == null ? null : arg0.getReal()));
    }

    public java.lang.String[] getSupportedDocTypes() {
        return ((android.security.identity.IdentityCredentialStore) real).getSupportedDocTypes();
    }

    public static final int CIPHERSUITE_ECDHE_HKDF_ECDSA_WITH_AES_256_GCM_SHA256 = android.security.identity.IdentityCredentialStore.CIPHERSUITE_ECDHE_HKDF_ECDSA_WITH_AES_256_GCM_SHA256;

}
