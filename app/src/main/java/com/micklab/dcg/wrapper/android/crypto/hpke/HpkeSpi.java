// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.crypto.hpke;

public final class HpkeSpi {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private HpkeSpi(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.crypto.hpke.HpkeSpi wrap(android.crypto.hpke.HpkeSpi real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.crypto.hpke.HpkeSpi(real, (__DcgwBridgeToken) null);
    }

    public android.crypto.hpke.HpkeSpi getReal() {
        return (android.crypto.hpke.HpkeSpi) real;
    }

    public android.crypto.hpke.HpkeSpi unwrap() {
        return getReal();
    }

    public byte[] engineExport(int arg0, byte[] arg1) {
        return ((android.crypto.hpke.HpkeSpi) real).engineExport(arg0, arg1);
    }

    public void engineInitRecipient(byte[] arg0, java.security.PrivateKey arg1, byte[] arg2, java.security.PublicKey arg3, byte[] arg4, byte[] arg5) throws java.security.InvalidKeyException {
        ((android.crypto.hpke.HpkeSpi) real).engineInitRecipient(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void engineInitSender(java.security.PublicKey arg0, byte[] arg1, java.security.PrivateKey arg2, byte[] arg3, byte[] arg4) throws java.security.InvalidKeyException {
        ((android.crypto.hpke.HpkeSpi) real).engineInitSender(arg0, arg1, arg2, arg3, arg4);
    }

    public void engineInitSenderWithSeed(java.security.PublicKey arg0, byte[] arg1, java.security.PrivateKey arg2, byte[] arg3, byte[] arg4, byte[] arg5) throws java.security.InvalidKeyException {
        ((android.crypto.hpke.HpkeSpi) real).engineInitSenderWithSeed(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public byte[] engineOpen(byte[] arg0, byte[] arg1) throws java.security.GeneralSecurityException {
        return ((android.crypto.hpke.HpkeSpi) real).engineOpen(arg0, arg1);
    }

    public byte[] engineSeal(byte[] arg0, byte[] arg1) {
        return ((android.crypto.hpke.HpkeSpi) real).engineSeal(arg0, arg1);
    }

    public byte[] getEncapsulated() {
        return ((android.crypto.hpke.HpkeSpi) real).getEncapsulated();
    }

}
