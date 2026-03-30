// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class IdentityCredentialStore {
    private final android.security.identity.IdentityCredentialStore real;

    public IdentityCredentialStore(android.security.identity.IdentityCredentialStore real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.IdentityCredentialStore wrap(android.security.identity.IdentityCredentialStore real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.IdentityCredentialStore(real);
    }

    public android.security.identity.IdentityCredentialStore unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.security.identity.WritableIdentityCredential createCredential(java.lang.String arg0, java.lang.String arg1) throws android.security.identity.AlreadyPersonalizedException, android.security.identity.DocTypeNotSupportedException {
        return com.micklab.dcg.wrapper.android.security.identity.WritableIdentityCredential.wrap(real.createCredential(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.security.identity.PresentationSession createPresentationSession(int arg0) throws android.security.identity.CipherSuiteNotSupportedException {
        return com.micklab.dcg.wrapper.android.security.identity.PresentationSession.wrap(real.createPresentationSession(arg0));
    }

    public byte[] deleteCredentialByName(java.lang.String arg0) {
        return real.deleteCredentialByName(arg0);
    }

    public com.micklab.dcg.wrapper.android.security.identity.IdentityCredential getCredentialByName(java.lang.String arg0, int arg1) throws android.security.identity.CipherSuiteNotSupportedException {
        return com.micklab.dcg.wrapper.android.security.identity.IdentityCredential.wrap(real.getCredentialByName(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.security.identity.IdentityCredentialStore getDirectAccessInstance(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.security.identity.IdentityCredentialStore.wrap(android.security.identity.IdentityCredentialStore.getDirectAccessInstance(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.security.identity.IdentityCredentialStore getInstance(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.security.identity.IdentityCredentialStore.wrap(android.security.identity.IdentityCredentialStore.getInstance(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.String[] getSupportedDocTypes() {
        return real.getSupportedDocTypes();
    }

    public static final int CIPHERSUITE_ECDHE_HKDF_ECDSA_WITH_AES_256_GCM_SHA256 = android.security.identity.IdentityCredentialStore.CIPHERSUITE_ECDHE_HKDF_ECDSA_WITH_AES_256_GCM_SHA256;

}
