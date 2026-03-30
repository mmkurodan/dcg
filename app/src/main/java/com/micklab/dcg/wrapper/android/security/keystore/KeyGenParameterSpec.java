// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class KeyGenParameterSpec {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private KeyGenParameterSpec(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec wrap(android.security.keystore.KeyGenParameterSpec real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec(real, (__DcgwBridgeToken) null);
    }

    public android.security.keystore.KeyGenParameterSpec getReal() {
        return (android.security.keystore.KeyGenParameterSpec) real;
    }

    public android.security.keystore.KeyGenParameterSpec unwrap() {
        return getReal();
    }

    public java.security.spec.AlgorithmParameterSpec getAlgorithmParameterSpec() {
        return ((android.security.keystore.KeyGenParameterSpec) real).getAlgorithmParameterSpec();
    }

    public java.lang.String getAttestKeyAlias() {
        return ((android.security.keystore.KeyGenParameterSpec) real).getAttestKeyAlias();
    }

    public byte[] getAttestationChallenge() {
        return ((android.security.keystore.KeyGenParameterSpec) real).getAttestationChallenge();
    }

    public java.lang.String[] getBlockModes() {
        return ((android.security.keystore.KeyGenParameterSpec) real).getBlockModes();
    }

    public java.util.Date getCertificateNotAfter() {
        return ((android.security.keystore.KeyGenParameterSpec) real).getCertificateNotAfter();
    }

    public java.util.Date getCertificateNotBefore() {
        return ((android.security.keystore.KeyGenParameterSpec) real).getCertificateNotBefore();
    }

    public java.math.BigInteger getCertificateSerialNumber() {
        return ((android.security.keystore.KeyGenParameterSpec) real).getCertificateSerialNumber();
    }

    public javax.security.auth.x500.X500Principal getCertificateSubject() {
        return ((android.security.keystore.KeyGenParameterSpec) real).getCertificateSubject();
    }

    public java.lang.String[] getDigests() {
        return ((android.security.keystore.KeyGenParameterSpec) real).getDigests();
    }

    public java.lang.String[] getEncryptionPaddings() {
        return ((android.security.keystore.KeyGenParameterSpec) real).getEncryptionPaddings();
    }

    public int getKeySize() {
        return ((android.security.keystore.KeyGenParameterSpec) real).getKeySize();
    }

    public java.util.Date getKeyValidityForConsumptionEnd() {
        return ((android.security.keystore.KeyGenParameterSpec) real).getKeyValidityForConsumptionEnd();
    }

    public java.util.Date getKeyValidityForOriginationEnd() {
        return ((android.security.keystore.KeyGenParameterSpec) real).getKeyValidityForOriginationEnd();
    }

    public java.util.Date getKeyValidityStart() {
        return ((android.security.keystore.KeyGenParameterSpec) real).getKeyValidityStart();
    }

    public java.lang.String getKeystoreAlias() {
        return ((android.security.keystore.KeyGenParameterSpec) real).getKeystoreAlias();
    }

    public int getMaxUsageCount() {
        return ((android.security.keystore.KeyGenParameterSpec) real).getMaxUsageCount();
    }

    public int getPurposes() {
        return ((android.security.keystore.KeyGenParameterSpec) real).getPurposes();
    }

    public java.lang.String[] getSignaturePaddings() {
        return ((android.security.keystore.KeyGenParameterSpec) real).getSignaturePaddings();
    }

    public int getUserAuthenticationType() {
        return ((android.security.keystore.KeyGenParameterSpec) real).getUserAuthenticationType();
    }

    public int getUserAuthenticationValidityDurationSeconds() {
        return ((android.security.keystore.KeyGenParameterSpec) real).getUserAuthenticationValidityDurationSeconds();
    }

    public boolean isDevicePropertiesAttestationIncluded() {
        return ((android.security.keystore.KeyGenParameterSpec) real).isDevicePropertiesAttestationIncluded();
    }

    public boolean isDigestsSpecified() {
        return ((android.security.keystore.KeyGenParameterSpec) real).isDigestsSpecified();
    }

    public boolean isInvalidatedByBiometricEnrollment() {
        return ((android.security.keystore.KeyGenParameterSpec) real).isInvalidatedByBiometricEnrollment();
    }

    public boolean isMgf1DigestsSpecified() {
        return ((android.security.keystore.KeyGenParameterSpec) real).isMgf1DigestsSpecified();
    }

    public boolean isRandomizedEncryptionRequired() {
        return ((android.security.keystore.KeyGenParameterSpec) real).isRandomizedEncryptionRequired();
    }

    public boolean isStrongBoxBacked() {
        return ((android.security.keystore.KeyGenParameterSpec) real).isStrongBoxBacked();
    }

    public boolean isUnlockedDeviceRequired() {
        return ((android.security.keystore.KeyGenParameterSpec) real).isUnlockedDeviceRequired();
    }

    public boolean isUserAuthenticationRequired() {
        return ((android.security.keystore.KeyGenParameterSpec) real).isUserAuthenticationRequired();
    }

    public boolean isUserAuthenticationValidWhileOnBody() {
        return ((android.security.keystore.KeyGenParameterSpec) real).isUserAuthenticationValidWhileOnBody();
    }

    public boolean isUserConfirmationRequired() {
        return ((android.security.keystore.KeyGenParameterSpec) real).isUserConfirmationRequired();
    }

    public boolean isUserPresenceRequired() {
        return ((android.security.keystore.KeyGenParameterSpec) real).isUserPresenceRequired();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder wrap(android.security.keystore.KeyGenParameterSpec.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.security.keystore.KeyGenParameterSpec.Builder getReal() {
            return (android.security.keystore.KeyGenParameterSpec.Builder) real;
        }

        public android.security.keystore.KeyGenParameterSpec.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.String arg0, int arg1) {
            this(new android.security.keystore.KeyGenParameterSpec.Builder(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec build() {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setAlgorithmParameterSpec(java.security.spec.AlgorithmParameterSpec arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setAlgorithmParameterSpec(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setAttestKeyAlias(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setAttestKeyAlias(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setAttestationChallenge(byte[] arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setAttestationChallenge(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setBlockModes(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setBlockModes(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setCertificateNotAfter(java.util.Date arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setCertificateNotAfter(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setCertificateNotBefore(java.util.Date arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setCertificateNotBefore(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setCertificateSerialNumber(java.math.BigInteger arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setCertificateSerialNumber(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setCertificateSubject(javax.security.auth.x500.X500Principal arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setCertificateSubject(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setDevicePropertiesAttestationIncluded(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setDevicePropertiesAttestationIncluded(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setDigests(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setDigests(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setEncryptionPaddings(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setEncryptionPaddings(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setInvalidatedByBiometricEnrollment(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setInvalidatedByBiometricEnrollment(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setIsStrongBoxBacked(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setIsStrongBoxBacked(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setKeySize(int arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setKeySize(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setKeyValidityEnd(java.util.Date arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setKeyValidityEnd(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setKeyValidityForConsumptionEnd(java.util.Date arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setKeyValidityForConsumptionEnd(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setKeyValidityForOriginationEnd(java.util.Date arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setKeyValidityForOriginationEnd(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setKeyValidityStart(java.util.Date arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setKeyValidityStart(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setMaxUsageCount(int arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setMaxUsageCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setMgf1Digests(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setMgf1Digests(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setRandomizedEncryptionRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setRandomizedEncryptionRequired(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setSignaturePaddings(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setSignaturePaddings(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setUnlockedDeviceRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setUnlockedDeviceRequired(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setUserAuthenticationParameters(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setUserAuthenticationParameters(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setUserAuthenticationRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setUserAuthenticationRequired(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setUserAuthenticationValidWhileOnBody(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setUserAuthenticationValidWhileOnBody(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setUserAuthenticationValidityDurationSeconds(int arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setUserAuthenticationValidityDurationSeconds(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setUserConfirmationRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setUserConfirmationRequired(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder setUserPresenceRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec.Builder.wrap(((android.security.keystore.KeyGenParameterSpec.Builder) real).setUserPresenceRequired(arg0));
        }

    }
}
