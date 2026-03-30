// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class KeyInfo {
    private final android.security.keystore.KeyInfo real;

    public KeyInfo(android.security.keystore.KeyInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.KeyInfo wrap(android.security.keystore.KeyInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.KeyInfo(real);
    }

    public android.security.keystore.KeyInfo unwrap() {
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

    public int getOrigin() {
        return real.getOrigin();
    }

    public int getPurposes() {
        return real.getPurposes();
    }

    public int getRemainingUsageCount() {
        return real.getRemainingUsageCount();
    }

    public int getSecurityLevel() {
        return real.getSecurityLevel();
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

    public boolean isInsideSecureHardware() {
        return real.isInsideSecureHardware();
    }

    public boolean isInvalidatedByBiometricEnrollment() {
        return real.isInvalidatedByBiometricEnrollment();
    }

    public boolean isTrustedUserPresenceRequired() {
        return real.isTrustedUserPresenceRequired();
    }

    public boolean isUserAuthenticationRequired() {
        return real.isUserAuthenticationRequired();
    }

    public boolean isUserAuthenticationRequirementEnforcedBySecureHardware() {
        return real.isUserAuthenticationRequirementEnforcedBySecureHardware();
    }

    public boolean isUserAuthenticationValidWhileOnBody() {
        return real.isUserAuthenticationValidWhileOnBody();
    }

    public boolean isUserConfirmationRequired() {
        return real.isUserConfirmationRequired();
    }

}
