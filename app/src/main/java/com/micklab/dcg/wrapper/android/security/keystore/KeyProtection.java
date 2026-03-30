// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class KeyProtection {
    private final android.security.keystore.KeyProtection real;

    public KeyProtection(android.security.keystore.KeyProtection real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.KeyProtection wrap(android.security.keystore.KeyProtection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.KeyProtection(real);
    }

    public android.security.keystore.KeyProtection unwrap() {
        return real;
    }

    public java.lang.String[] getBlockModes() {
        return real.getBlockModes();
    }

    public java.lang.String[] getDigests() {
        return real.getDigests();
    }

    public java.lang.String[] getEncryptionPaddings() {
        return real.getEncryptionPaddings();
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
        private final android.security.keystore.KeyProtection.Builder real;

        public Builder(android.security.keystore.KeyProtection.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder wrap(android.security.keystore.KeyProtection.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder(real);
        }

        public android.security.keystore.KeyProtection.Builder unwrap() {
            return real;
        }

        public Builder(int arg0) {
            this(new android.security.keystore.KeyProtection.Builder(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection build() {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setBlockModes(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(real.setBlockModes(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setDigests(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(real.setDigests(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setEncryptionPaddings(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(real.setEncryptionPaddings(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setInvalidatedByBiometricEnrollment(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(real.setInvalidatedByBiometricEnrollment(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setIsStrongBoxBacked(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(real.setIsStrongBoxBacked(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setKeyValidityEnd(java.util.Date arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(real.setKeyValidityEnd(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setKeyValidityForConsumptionEnd(java.util.Date arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(real.setKeyValidityForConsumptionEnd(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setKeyValidityForOriginationEnd(java.util.Date arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(real.setKeyValidityForOriginationEnd(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setKeyValidityStart(java.util.Date arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(real.setKeyValidityStart(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setMaxUsageCount(int arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(real.setMaxUsageCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setMgf1Digests(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(real.setMgf1Digests(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setRandomizedEncryptionRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(real.setRandomizedEncryptionRequired(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setSignaturePaddings(java.lang.String... arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(real.setSignaturePaddings(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setUnlockedDeviceRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(real.setUnlockedDeviceRequired(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setUserAuthenticationParameters(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(real.setUserAuthenticationParameters(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setUserAuthenticationRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(real.setUserAuthenticationRequired(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setUserAuthenticationValidWhileOnBody(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(real.setUserAuthenticationValidWhileOnBody(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setUserAuthenticationValidityDurationSeconds(int arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(real.setUserAuthenticationValidityDurationSeconds(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setUserConfirmationRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(real.setUserConfirmationRequired(arg0));
        }

        public com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder setUserPresenceRequired(boolean arg0) {
            return com.micklab.dcg.wrapper.android.security.keystore.KeyProtection.Builder.wrap(real.setUserPresenceRequired(arg0));
        }

    }
}
