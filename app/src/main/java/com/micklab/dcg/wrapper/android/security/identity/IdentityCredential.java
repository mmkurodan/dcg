// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class IdentityCredential {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IdentityCredential(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.IdentityCredential wrap(android.security.identity.IdentityCredential real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.IdentityCredential(real, (__DcgwBridgeToken) null);
    }

    public android.security.identity.IdentityCredential getReal() {
        return (android.security.identity.IdentityCredential) real;
    }

    public android.security.identity.IdentityCredential unwrap() {
        return getReal();
    }

    public java.security.KeyPair createEphemeralKeyPair() {
        return ((android.security.identity.IdentityCredential) real).createEphemeralKeyPair();
    }

    public byte[] decryptMessageFromReader(byte[] arg0) throws android.security.identity.MessageDecryptionException {
        return ((android.security.identity.IdentityCredential) real).decryptMessageFromReader(arg0);
    }

    public byte[] delete(byte[] arg0) {
        return ((android.security.identity.IdentityCredential) real).delete(arg0);
    }

    public byte[] encryptMessageToReader(byte[] arg0) {
        return ((android.security.identity.IdentityCredential) real).encryptMessageToReader(arg0);
    }

    public int[] getAuthenticationDataUsageCount() {
        return ((android.security.identity.IdentityCredential) real).getAuthenticationDataUsageCount();
    }

    public byte[] proveOwnership(byte[] arg0) {
        return ((android.security.identity.IdentityCredential) real).proveOwnership(arg0);
    }

    public void setAllowUsingExhaustedKeys(boolean arg0) {
        ((android.security.identity.IdentityCredential) real).setAllowUsingExhaustedKeys(arg0);
    }

    public void setAllowUsingExpiredKeys(boolean arg0) {
        ((android.security.identity.IdentityCredential) real).setAllowUsingExpiredKeys(arg0);
    }

    public void setAvailableAuthenticationKeys(int arg0, int arg1) {
        ((android.security.identity.IdentityCredential) real).setAvailableAuthenticationKeys(arg0, arg1);
    }

    public void setAvailableAuthenticationKeys(int arg0, int arg1, long arg2) {
        ((android.security.identity.IdentityCredential) real).setAvailableAuthenticationKeys(arg0, arg1, arg2);
    }

    public void setReaderEphemeralPublicKey(java.security.PublicKey arg0) throws java.security.InvalidKeyException {
        ((android.security.identity.IdentityCredential) real).setReaderEphemeralPublicKey(arg0);
    }

    public void storeStaticAuthenticationData(java.security.cert.X509Certificate arg0, byte[] arg1) throws android.security.identity.UnknownAuthenticationKeyException {
        ((android.security.identity.IdentityCredential) real).storeStaticAuthenticationData(arg0, arg1);
    }

    public void storeStaticAuthenticationData(java.security.cert.X509Certificate arg0, java.time.Instant arg1, byte[] arg2) throws android.security.identity.UnknownAuthenticationKeyException {
        ((android.security.identity.IdentityCredential) real).storeStaticAuthenticationData(arg0, arg1, arg2);
    }

    public byte[] update(com.micklab.dcg.wrapper.android.security.identity.PersonalizationData arg0) {
        return ((android.security.identity.IdentityCredential) real).update(arg0 == null ? null : arg0.getReal());
    }

}
