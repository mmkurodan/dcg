// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class WrappedKeyEntry {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WrappedKeyEntry(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.WrappedKeyEntry wrap(android.security.keystore.WrappedKeyEntry real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.WrappedKeyEntry(real, (__DcgwBridgeToken) null);
    }

    public android.security.keystore.WrappedKeyEntry getReal() {
        return (android.security.keystore.WrappedKeyEntry) real;
    }

    public android.security.keystore.WrappedKeyEntry unwrap() {
        return getReal();
    }

    public WrappedKeyEntry(byte[] arg0, java.lang.String arg1, java.lang.String arg2, java.security.spec.AlgorithmParameterSpec arg3) {
        this(new android.security.keystore.WrappedKeyEntry(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public java.security.spec.AlgorithmParameterSpec getAlgorithmParameterSpec() {
        return ((android.security.keystore.WrappedKeyEntry) real).getAlgorithmParameterSpec();
    }

    public java.lang.String getTransformation() {
        return ((android.security.keystore.WrappedKeyEntry) real).getTransformation();
    }

    public byte[] getWrappedKeyBytes() {
        return ((android.security.keystore.WrappedKeyEntry) real).getWrappedKeyBytes();
    }

    public java.lang.String getWrappingKeyAlias() {
        return ((android.security.keystore.WrappedKeyEntry) real).getWrappingKeyAlias();
    }

}
