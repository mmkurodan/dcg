// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.crypto.hpke;

public final class HpkeSpi {
    private final android.crypto.hpke.HpkeSpi real;

    public HpkeSpi(android.crypto.hpke.HpkeSpi real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.crypto.hpke.HpkeSpi wrap(android.crypto.hpke.HpkeSpi real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.crypto.hpke.HpkeSpi(real);
    }

    public android.crypto.hpke.HpkeSpi unwrap() {
        return real;
    }

    public byte[] engineExport(int arg0, byte[] arg1) {
        return real.engineExport(arg0, arg1);
    }

    public void engineInitRecipient(byte[] arg0, java.security.PrivateKey arg1, byte[] arg2, java.security.PublicKey arg3, byte[] arg4, byte[] arg5) throws java.security.InvalidKeyException {
        real.engineInitRecipient(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void engineInitSender(java.security.PublicKey arg0, byte[] arg1, java.security.PrivateKey arg2, byte[] arg3, byte[] arg4) throws java.security.InvalidKeyException {
        real.engineInitSender(arg0, arg1, arg2, arg3, arg4);
    }

    public void engineInitSenderWithSeed(java.security.PublicKey arg0, byte[] arg1, java.security.PrivateKey arg2, byte[] arg3, byte[] arg4, byte[] arg5) throws java.security.InvalidKeyException {
        real.engineInitSenderWithSeed(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public byte[] engineOpen(byte[] arg0, byte[] arg1) throws java.security.GeneralSecurityException {
        return real.engineOpen(arg0, arg1);
    }

    public byte[] engineSeal(byte[] arg0, byte[] arg1) {
        return real.engineSeal(arg0, arg1);
    }

    public byte[] getEncapsulated() {
        return real.getEncapsulated();
    }

}
