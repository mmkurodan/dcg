// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class WrappedKeyEntry {
    private final android.security.keystore.WrappedKeyEntry real;

    public WrappedKeyEntry(android.security.keystore.WrappedKeyEntry real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.WrappedKeyEntry wrap(android.security.keystore.WrappedKeyEntry real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.WrappedKeyEntry(real);
    }

    public android.security.keystore.WrappedKeyEntry unwrap() {
        return real;
    }

    public WrappedKeyEntry(byte[] arg0, java.lang.String arg1, java.lang.String arg2, java.security.spec.AlgorithmParameterSpec arg3) {
        this(new android.security.keystore.WrappedKeyEntry(arg0, arg1, arg2, arg3));
    }

    public java.security.spec.AlgorithmParameterSpec getAlgorithmParameterSpec() {
        return real.getAlgorithmParameterSpec();
    }

    public java.lang.String getTransformation() {
        return real.getTransformation();
    }

    public byte[] getWrappedKeyBytes() {
        return real.getWrappedKeyBytes();
    }

    public java.lang.String getWrappingKeyAlias() {
        return real.getWrappingKeyAlias();
    }

}
