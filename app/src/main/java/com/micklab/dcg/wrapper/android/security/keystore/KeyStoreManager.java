// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class KeyStoreManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private KeyStoreManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.KeyStoreManager wrap(android.security.keystore.KeyStoreManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.KeyStoreManager(real, (__DcgwBridgeToken) null);
    }

    public android.security.keystore.KeyStoreManager getReal() {
        return (android.security.keystore.KeyStoreManager) real;
    }

    public android.security.keystore.KeyStoreManager unwrap() {
        return getReal();
    }

    public java.security.Key getGrantedKeyFromId(long arg0) throws android.security.keystore.KeyPermanentlyInvalidatedException, java.security.UnrecoverableKeyException {
        return ((android.security.keystore.KeyStoreManager) real).getGrantedKeyFromId(arg0);
    }

    public java.security.KeyPair getGrantedKeyPairFromId(long arg0) throws android.security.keystore.KeyPermanentlyInvalidatedException, java.security.UnrecoverableKeyException {
        return ((android.security.keystore.KeyStoreManager) real).getGrantedKeyPairFromId(arg0);
    }

    public byte[] getSupplementaryAttestationInfo(int arg0) throws android.security.KeyStoreException {
        return ((android.security.keystore.KeyStoreManager) real).getSupplementaryAttestationInfo(arg0);
    }

    public long grantKeyAccess(java.lang.String arg0, int arg1) throws android.security.KeyStoreException, java.security.UnrecoverableKeyException {
        return ((android.security.keystore.KeyStoreManager) real).grantKeyAccess(arg0, arg1);
    }

    public void revokeKeyAccess(java.lang.String arg0, int arg1) throws android.security.KeyStoreException, java.security.UnrecoverableKeyException {
        ((android.security.keystore.KeyStoreManager) real).revokeKeyAccess(arg0, arg1);
    }

    public static final int MODULE_HASH = android.security.keystore.KeyStoreManager.MODULE_HASH;

}
