// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class KeyInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private KeyInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.KeyInfo wrap(android.security.keystore.KeyInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.KeyInfo(real, (__DcgwBridgeToken) null);
    }

    public android.security.keystore.KeyInfo getReal() {
        return (android.security.keystore.KeyInfo) real;
    }

    public android.security.keystore.KeyInfo unwrap() {
        return getReal();
    }

    public java.lang.String[] getBlockModes() {
        return ((android.security.keystore.KeyInfo) real).getBlockModes();
    }

    public java.lang.String[] getDigests() {
        return ((android.security.keystore.KeyInfo) real).getDigests();
    }

    public java.lang.String[] getEncryptionPaddings() {
        return ((android.security.keystore.KeyInfo) real).getEncryptionPaddings();
    }

    public int getKeySize() {
        return ((android.security.keystore.KeyInfo) real).getKeySize();
    }

    public java.util.Date getKeyValidityForConsumptionEnd() {
        return ((android.security.keystore.KeyInfo) real).getKeyValidityForConsumptionEnd();
    }

    public java.util.Date getKeyValidityForOriginationEnd() {
        return ((android.security.keystore.KeyInfo) real).getKeyValidityForOriginationEnd();
    }

    public java.util.Date getKeyValidityStart() {
        return ((android.security.keystore.KeyInfo) real).getKeyValidityStart();
    }

    public java.lang.String getKeystoreAlias() {
        return ((android.security.keystore.KeyInfo) real).getKeystoreAlias();
    }

    public int getOrigin() {
        return ((android.security.keystore.KeyInfo) real).getOrigin();
    }

    public int getPurposes() {
        return ((android.security.keystore.KeyInfo) real).getPurposes();
    }

    public int getRemainingUsageCount() {
        return ((android.security.keystore.KeyInfo) real).getRemainingUsageCount();
    }

    public int getSecurityLevel() {
        return ((android.security.keystore.KeyInfo) real).getSecurityLevel();
    }

    public java.lang.String[] getSignaturePaddings() {
        return ((android.security.keystore.KeyInfo) real).getSignaturePaddings();
    }

    public int getUserAuthenticationType() {
        return ((android.security.keystore.KeyInfo) real).getUserAuthenticationType();
    }

    public int getUserAuthenticationValidityDurationSeconds() {
        return ((android.security.keystore.KeyInfo) real).getUserAuthenticationValidityDurationSeconds();
    }

    public boolean isInsideSecureHardware() {
        return ((android.security.keystore.KeyInfo) real).isInsideSecureHardware();
    }

    public boolean isInvalidatedByBiometricEnrollment() {
        return ((android.security.keystore.KeyInfo) real).isInvalidatedByBiometricEnrollment();
    }

    public boolean isTrustedUserPresenceRequired() {
        return ((android.security.keystore.KeyInfo) real).isTrustedUserPresenceRequired();
    }

    public boolean isUserAuthenticationRequired() {
        return ((android.security.keystore.KeyInfo) real).isUserAuthenticationRequired();
    }

    public boolean isUserAuthenticationRequirementEnforcedBySecureHardware() {
        return ((android.security.keystore.KeyInfo) real).isUserAuthenticationRequirementEnforcedBySecureHardware();
    }

    public boolean isUserAuthenticationValidWhileOnBody() {
        return ((android.security.keystore.KeyInfo) real).isUserAuthenticationValidWhileOnBody();
    }

    public boolean isUserConfirmationRequired() {
        return ((android.security.keystore.KeyInfo) real).isUserConfirmationRequired();
    }

}
