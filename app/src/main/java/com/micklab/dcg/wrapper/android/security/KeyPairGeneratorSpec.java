// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class KeyPairGeneratorSpec {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private KeyPairGeneratorSpec(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec wrap(android.security.KeyPairGeneratorSpec real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec(real, (__DcgwBridgeToken) null);
    }

    public android.security.KeyPairGeneratorSpec getReal() {
        return (android.security.KeyPairGeneratorSpec) real;
    }

    public android.security.KeyPairGeneratorSpec unwrap() {
        return getReal();
    }

    public java.security.spec.AlgorithmParameterSpec getAlgorithmParameterSpec() {
        return ((android.security.KeyPairGeneratorSpec) real).getAlgorithmParameterSpec();
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.security.KeyPairGeneratorSpec) real).getContext());
    }

    public java.util.Date getEndDate() {
        return ((android.security.KeyPairGeneratorSpec) real).getEndDate();
    }

    public int getKeySize() {
        return ((android.security.KeyPairGeneratorSpec) real).getKeySize();
    }

    public java.lang.String getKeyType() {
        return ((android.security.KeyPairGeneratorSpec) real).getKeyType();
    }

    public java.lang.String getKeystoreAlias() {
        return ((android.security.KeyPairGeneratorSpec) real).getKeystoreAlias();
    }

    public java.math.BigInteger getSerialNumber() {
        return ((android.security.KeyPairGeneratorSpec) real).getSerialNumber();
    }

    public java.util.Date getStartDate() {
        return ((android.security.KeyPairGeneratorSpec) real).getStartDate();
    }

    public javax.security.auth.x500.X500Principal getSubjectDN() {
        return ((android.security.KeyPairGeneratorSpec) real).getSubjectDN();
    }

    public boolean isEncryptionRequired() {
        return ((android.security.KeyPairGeneratorSpec) real).isEncryptionRequired();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder wrap(android.security.KeyPairGeneratorSpec.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.security.KeyPairGeneratorSpec.Builder getReal() {
            return (android.security.KeyPairGeneratorSpec.Builder) real;
        }

        public android.security.KeyPairGeneratorSpec.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.content.Context arg0) {
            this(new android.security.KeyPairGeneratorSpec.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec build() {
            return com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.wrap(((android.security.KeyPairGeneratorSpec.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder setAlgorithmParameterSpec(java.security.spec.AlgorithmParameterSpec arg0) {
            return com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder.wrap(((android.security.KeyPairGeneratorSpec.Builder) real).setAlgorithmParameterSpec(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder setAlias(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder.wrap(((android.security.KeyPairGeneratorSpec.Builder) real).setAlias(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder setEncryptionRequired() {
            return com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder.wrap(((android.security.KeyPairGeneratorSpec.Builder) real).setEncryptionRequired());
        }

        public com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder setEndDate(java.util.Date arg0) {
            return com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder.wrap(((android.security.KeyPairGeneratorSpec.Builder) real).setEndDate(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder setKeySize(int arg0) {
            return com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder.wrap(((android.security.KeyPairGeneratorSpec.Builder) real).setKeySize(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder setKeyType(java.lang.String arg0) throws java.security.NoSuchAlgorithmException {
            return com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder.wrap(((android.security.KeyPairGeneratorSpec.Builder) real).setKeyType(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder setSerialNumber(java.math.BigInteger arg0) {
            return com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder.wrap(((android.security.KeyPairGeneratorSpec.Builder) real).setSerialNumber(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder setStartDate(java.util.Date arg0) {
            return com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder.wrap(((android.security.KeyPairGeneratorSpec.Builder) real).setStartDate(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder setSubject(javax.security.auth.x500.X500Principal arg0) {
            return com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder.wrap(((android.security.KeyPairGeneratorSpec.Builder) real).setSubject(arg0));
        }

    }
}
