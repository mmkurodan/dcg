// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class KeyProtection {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private KeyProtection(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.KeyProtection wrap(android.security.keystore.KeyProtection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.KeyProtection(real, (__DcgwBridgeToken) null);
    }

    public android.security.keystore.KeyProtection getReal() {
        return (android.security.keystore.KeyProtection) real;
    }

    public android.security.keystore.KeyProtection unwrap() {
        return getReal();
    }

    public java.lang.String[] getBlockModes() {
        return ((android.security.keystore.KeyProtection) real).getBlockModes();
    }

    public java.lang.String[] getDigests() {
        return ((android.security.keystore.KeyProtection) real).getDigests();
    }

    public java.lang.String[] getEncryptionPaddings() {
        return ((android.security.keystore.KeyProtection) real).getEncryptionPaddings();
    }

    public java.util.Date getKeyValidityForConsumptionEnd() {
        return ((android.security.keystore.KeyProtection) real).getKeyValidityForConsumptionEnd();
    }

    public java.util.Date getKeyValidityForOriginationEnd() {
        return ((android.security.keystore.KeyProtection) real).getKeyValidityForOriginationEnd();
    }

    public java.util.Date getKeyValidityStart() {
        return ((android.security.keystore.KeyProtection) real).getKeyValidityStart();
    }

    public int getMaxUsageCount() {
        return ((android.security.keystore.KeyProtection) real).getMaxUsageCount();
    }

    public int getPurposes() {
        return ((android.security.keystore.KeyProtection) real).getPurposes();
    }

    public java.lang.String[] getSignaturePaddings() {
        return ((android.security.keystore.KeyProtection) real).getSignaturePaddings();
    }

    public int getUserAuthenticationType() {
        return ((android.security.keystore.KeyProtection) real).getUserAuthenticationType();
    }

    public int getUserAuthenticationValidityDurationSeconds() {
        return ((android.security.keystore.KeyProtection) real).getUserAuthenticationValidityDurationSeconds();
    }

    public boolean isDigestsSpecified() {
        return ((android.security.keystore.KeyProtection) real).isDigestsSpecified();
    }

    public boolean isInvalidatedByBiometricEnrollment() {
        return ((android.security.keystore.KeyProtection) real).isInvalidatedByBiometricEnrollment();
    }

    public boolean isMgf1DigestsSpecified() {
        return ((android.security.keystore.KeyProtection) real).isMgf1DigestsSpecified();
    }

    public boolean isRandomizedEncryptionRequired() {
        return ((android.security.keystore.KeyProtection) real).isRandomizedEncryptionRequired();
    }

    public boolean isUnlockedDeviceRequired() {
        return ((android.security.keystore.KeyProtection) real).isUnlockedDeviceRequired();
    }

    public boolean isUserAuthenticationRequired() {
        return ((android.security.keystore.KeyProtection) real).isUserAuthenticationRequired();
    }

    public boolean isUserAuthenticationValidWhileOnBody() {
        return ((android.security.keystore.KeyProtection) real).isUserAuthenticationValidWhileOnBody();
    }

    public boolean isUserConfirmationRequired() {
        return ((android.security.keystore.KeyProtection) real).isUserConfirmationRequired();
    }

    public boolean isUserPresenceRequired() {
        return ((android.security.keystore.KeyProtection) real).isUserPresenceRequired();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder wrap(android.security.keystore.KeyProtection.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.security.keystore.KeyProtection.Builder getReal() {
            return (android.security.keystore.KeyProtection.Builder) real;
        }

        public android.security.keystore.KeyProtection.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0) {
            this(new android.security.keystore.KeyProtection.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection build() {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.wrap(((android.security.keystore.KeyProtection.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setBlockModes(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(((android.security.keystore.KeyProtection.Builder) real).setBlockModes(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setDigests(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(((android.security.keystore.KeyProtection.Builder) real).setDigests(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setEncryptionPaddings(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(((android.security.keystore.KeyProtection.Builder) real).setEncryptionPaddings(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setInvalidatedByBiometricEnrollment(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(((android.security.keystore.KeyProtection.Builder) real).setInvalidatedByBiometricEnrollment(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setIsStrongBoxBacked(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(((android.security.keystore.KeyProtection.Builder) real).setIsStrongBoxBacked(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setKeyValidityEnd(java.util.Date arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(((android.security.keystore.KeyProtection.Builder) real).setKeyValidityEnd(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setKeyValidityForConsumptionEnd(java.util.Date arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(((android.security.keystore.KeyProtection.Builder) real).setKeyValidityForConsumptionEnd(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setKeyValidityForOriginationEnd(java.util.Date arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(((android.security.keystore.KeyProtection.Builder) real).setKeyValidityForOriginationEnd(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setKeyValidityStart(java.util.Date arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(((android.security.keystore.KeyProtection.Builder) real).setKeyValidityStart(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setMaxUsageCount(int arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(((android.security.keystore.KeyProtection.Builder) real).setMaxUsageCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setMgf1Digests(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(((android.security.keystore.KeyProtection.Builder) real).setMgf1Digests(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setRandomizedEncryptionRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(((android.security.keystore.KeyProtection.Builder) real).setRandomizedEncryptionRequired(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setSignaturePaddings(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(((android.security.keystore.KeyProtection.Builder) real).setSignaturePaddings(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setUnlockedDeviceRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(((android.security.keystore.KeyProtection.Builder) real).setUnlockedDeviceRequired(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setUserAuthenticationParameters(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(((android.security.keystore.KeyProtection.Builder) real).setUserAuthenticationParameters(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setUserAuthenticationRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(((android.security.keystore.KeyProtection.Builder) real).setUserAuthenticationRequired(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setUserAuthenticationValidWhileOnBody(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(((android.security.keystore.KeyProtection.Builder) real).setUserAuthenticationValidWhileOnBody(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setUserAuthenticationValidityDurationSeconds(int arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(((android.security.keystore.KeyProtection.Builder) real).setUserAuthenticationValidityDurationSeconds(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setUserConfirmationRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(((android.security.keystore.KeyProtection.Builder) real).setUserConfirmationRequired(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setUserPresenceRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(((android.security.keystore.KeyProtection.Builder) real).setUserPresenceRequired(arg0));
        }

    }
}
