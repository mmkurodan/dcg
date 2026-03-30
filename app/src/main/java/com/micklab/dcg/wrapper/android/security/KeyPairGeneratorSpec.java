// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class KeyPairGeneratorSpec {
    private final android.security.KeyPairGeneratorSpec real;

    public KeyPairGeneratorSpec(android.security.KeyPairGeneratorSpec real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec wrap(android.security.KeyPairGeneratorSpec real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec(real);
    }

    public android.security.KeyPairGeneratorSpec unwrap() {
        return real;
    }

    public java.security.spec.AlgorithmParameterSpec getAlgorithmParameterSpec() {
        return real.getAlgorithmParameterSpec();
    }

    public com.micklab.dcg.wrapper.android.content.Context getContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.getContext());
    }

    public java.util.Date getEndDate() {
        return real.getEndDate();
    }

    public int getKeySize() {
        return real.getKeySize();
    }

    public java.lang.String getKeyType() {
        return real.getKeyType();
    }

    public java.lang.String getKeystoreAlias() {
        return real.getKeystoreAlias();
    }

    public java.math.BigInteger getSerialNumber() {
        return real.getSerialNumber();
    }

    public java.util.Date getStartDate() {
        return real.getStartDate();
    }

    public javax.security.auth.x500.X500Principal getSubjectDN() {
        return real.getSubjectDN();
    }

    public boolean isEncryptionRequired() {
        return real.isEncryptionRequired();
    }

    public static final class Builder {
        private final android.security.KeyPairGeneratorSpec.Builder real;

        public Builder(android.security.KeyPairGeneratorSpec.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder wrap(android.security.KeyPairGeneratorSpec.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder(real);
        }

        public android.security.KeyPairGeneratorSpec.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.content.Context arg0) {
            this(new android.security.KeyPairGeneratorSpec.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec build() {
            return com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder setAlgorithmParameterSpec(java.security.spec.AlgorithmParameterSpec arg0) {
            return com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder.wrap(real.setAlgorithmParameterSpec(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder setAlias(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder.wrap(real.setAlias(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder setEncryptionRequired() {
            return com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder.wrap(real.setEncryptionRequired());
        }

        public com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder setEndDate(java.util.Date arg0) {
            return com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder.wrap(real.setEndDate(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder setKeySize(int arg0) {
            return com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder.wrap(real.setKeySize(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder setKeyType(java.lang.String arg0) throws java.security.NoSuchAlgorithmException {
            return com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder.wrap(real.setKeyType(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder setSerialNumber(java.math.BigInteger arg0) {
            return com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder.wrap(real.setSerialNumber(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder setStartDate(java.util.Date arg0) {
            return com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder.wrap(real.setStartDate(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder setSubject(javax.security.auth.x500.X500Principal arg0) {
            return com.micklab.dcg.wrapper.android.security.KeyPairGeneratorSpec.Builder.wrap(real.setSubject(arg0));
        }

    }
}
