// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class PresentationSession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PresentationSession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.PresentationSession wrap(android.security.identity.PresentationSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.PresentationSession(real, (__DcgwBridgeToken) null);
    }

    public android.security.identity.PresentationSession getReal() {
        return (android.security.identity.PresentationSession) real;
    }

    public android.security.identity.PresentationSession unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.security.identity.CredentialDataResult getCredentialData(java.lang.String arg0, com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest arg1) throws android.security.identity.EphemeralPublicKeyNotFoundException, android.security.identity.InvalidReaderSignatureException, android.security.identity.InvalidRequestMessageException, android.security.identity.NoAuthenticationKeyAvailableException {
        return com.micklab.dcg.wrapper.android.security.identity.CredentialDataResult.wrap(((android.security.identity.PresentationSession) real).getCredentialData(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public java.security.KeyPair getEphemeralKeyPair() {
        return ((android.security.identity.PresentationSession) real).getEphemeralKeyPair();
    }

    public void setReaderEphemeralPublicKey(java.security.PublicKey arg0) throws java.security.InvalidKeyException {
        ((android.security.identity.PresentationSession) real).setReaderEphemeralPublicKey(arg0);
    }

    public void setSessionTranscript(byte[] arg0) {
        ((android.security.identity.PresentationSession) real).setSessionTranscript(arg0);
    }

}
