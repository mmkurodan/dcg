// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class KeyGenParameterSpec {
    private final android.security.keystore.KeyGenParameterSpec real;

    public KeyGenParameterSpec(android.security.keystore.KeyGenParameterSpec real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec wrap(android.security.keystore.KeyGenParameterSpec real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec(real);
    }

    public android.security.keystore.KeyGenParameterSpec unwrap() {
        return real;
    }

    public java.security.spec.AlgorithmParameterSpec getAlgorithmParameterSpec() {
        return real.getAlgorithmParameterSpec();
    }

    public java.lang.String getAttestKeyAlias() {
        return real.getAttestKeyAlias();
    }

    public byte[] getAttestationChallenge() {
        return real.getAttestationChallenge();
    }

    public java.lang.String[] getBlockModes() {
        return real.getBlockModes();
    }

    public java.util.Date getCertificateNotAfter() {
        return real.getCertificateNotAfter();
    }

    public java.util.Date getCertificateNotBefore() {
        return real.getCertificateNotBefore();
    }

    public java.math.BigInteger getCertificateSerialNumber() {
        return real.getCertificateSerialNumber();
    }

    public javax.security.auth.x500.X500Principal getCertificateSubject() {
        return real.getCertificateSubject();
    }

    public java.lang.String[] getDigests() {
        return real.getDigests();
    }

    public java.lang.String[] getEncryptionPaddings() {
        return real.getEncryptionPaddings();
    }

    public int getKeySize() {
        return real.getKeySize();
    }

    public java.util.Date getKeyValidityForConsumptionEnd() {
        return real.getKeyValidityForConsumptionEnd();
    }

    public java.util.Date getKeyValidityForOriginationEnd() {
        return real.getKeyValidityForOriginationEnd();
    }

    public java.util.Date getKeyValidityStart() {
        return real.getKeyValidityStart();
    }

    public java.lang.String getKeystoreAlias() {
        return real.getKeystoreAlias();
    }

    public int getMaxUsageCount() {
        return real.getMaxUsageCount();
    }

    public int getPurposes() {
        return real.getPurposes();
    }

    public java.lang.String[] getSignaturePaddings() {
        return real.getSignaturePaddings();
    }

    public int getUserAuthenticationType() {
        return real.getUserAuthenticationType();
    }

    public int getUserAuthenticationValidityDurationSeconds() {
        return real.getUserAuthenticationValidityDurationSeconds();
    }

    public boolean isDevicePropertiesAttestationIncluded() {
        return real.isDevicePropertiesAttestationIncluded();
    }

    public boolean isDigestsSpecified() {
        return real.isDigestsSpecified();
    }

    public boolean isInvalidatedByBiometricEnrollment() {
        return real.isInvalidatedByBiometricEnrollment();
    }

    public boolean isMgf1DigestsSpecified() {
        return real.isMgf1DigestsSpecified();
    }

    public boolean isRandomizedEncryptionRequired() {
        return real.isRandomizedEncryptionRequired();
    }

    public boolean isStrongBoxBacked() {
        return real.isStrongBoxBacked();
    }

    public boolean isUnlockedDeviceRequired() {
        return real.isUnlockedDeviceRequired();
    }

    public boolean isUserAuthenticationRequired() {
        return real.isUserAuthenticationRequired();
    }

    public boolean isUserAuthenticationValidWhileOnBody() {
        return real.isUserAuthenticationValidWhileOnBody();
    }

    public boolean isUserConfirmationRequired() {
        return real.isUserConfirmationRequired();
    }

    public boolean isUserPresenceRequired() {
        return real.isUserPresenceRequired();
    }

    public static final class Builder {
        private final android.security.keystore.KeyGenParameterSpec.Builder real;

        public Builder(android.security.keystore.KeyGenParameterSpec.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder wrap(android.security.keystore.KeyGenParameterSpec.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder(real);
        }

        public android.security.keystore.KeyGenParameterSpec.Builder unwrap() {
            return real;
        }

        public Builder(java.lang.String arg0, int arg1) {
            this(new android.security.keystore.KeyGenParameterSpec.Builder(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec build() {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setAlgorithmParameterSpec(java.security.spec.AlgorithmParameterSpec arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setAlgorithmParameterSpec(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setAttestKeyAlias(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setAttestKeyAlias(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setAttestationChallenge(byte[] arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setAttestationChallenge(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setBlockModes(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setBlockModes(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setCertificateNotAfter(java.util.Date arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setCertificateNotAfter(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setCertificateNotBefore(java.util.Date arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setCertificateNotBefore(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setCertificateSerialNumber(java.math.BigInteger arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setCertificateSerialNumber(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setCertificateSubject(javax.security.auth.x500.X500Principal arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setCertificateSubject(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setDevicePropertiesAttestationIncluded(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setDevicePropertiesAttestationIncluded(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setDigests(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setDigests(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setEncryptionPaddings(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setEncryptionPaddings(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setInvalidatedByBiometricEnrollment(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setInvalidatedByBiometricEnrollment(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setIsStrongBoxBacked(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setIsStrongBoxBacked(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setKeySize(int arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setKeySize(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setKeyValidityEnd(java.util.Date arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setKeyValidityEnd(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setKeyValidityForConsumptionEnd(java.util.Date arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setKeyValidityForConsumptionEnd(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setKeyValidityForOriginationEnd(java.util.Date arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setKeyValidityForOriginationEnd(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setKeyValidityStart(java.util.Date arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setKeyValidityStart(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setMaxUsageCount(int arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setMaxUsageCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setMgf1Digests(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setMgf1Digests(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setRandomizedEncryptionRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setRandomizedEncryptionRequired(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setSignaturePaddings(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setSignaturePaddings(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setUnlockedDeviceRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setUnlockedDeviceRequired(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setUserAuthenticationParameters(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setUserAuthenticationParameters(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setUserAuthenticationRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setUserAuthenticationRequired(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setUserAuthenticationValidWhileOnBody(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setUserAuthenticationValidWhileOnBody(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setUserAuthenticationValidityDurationSeconds(int arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setUserAuthenticationValidityDurationSeconds(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setUserConfirmationRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setUserConfirmationRequired(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setUserPresenceRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(real.setUserPresenceRequired(arg0));
        }

    }
}
