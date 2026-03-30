// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class PresentationSession {
    private final android.security.identity.PresentationSession real;

    public PresentationSession(android.security.identity.PresentationSession real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.PresentationSession wrap(android.security.identity.PresentationSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.PresentationSession(real);
    }

    public android.security.identity.PresentationSession unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.security.identity.CredentialDataResult getCredentialData(java.lang.String arg0, com.micklab.dcg.wrapper.android.security.identity.CredentialDataRequest arg1) throws android.security.identity.EphemeralPublicKeyNotFoundException, android.security.identity.InvalidReaderSignatureException, android.security.identity.InvalidRequestMessageException, android.security.identity.NoAuthenticationKeyAvailableException {
        return com.micklab.dcg.wrapper.android.security.identity.CredentialDataResult.wrap(real.getCredentialData(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public java.security.KeyPair getEphemeralKeyPair() {
        return real.getEphemeralKeyPair();
    }

    public void setReaderEphemeralPublicKey(java.security.PublicKey arg0) throws java.security.InvalidKeyException {
        real.setReaderEphemeralPublicKey(arg0);
    }

    public void setSessionTranscript(byte[] arg0) {
        real.setSessionTranscript(arg0);
    }

}
