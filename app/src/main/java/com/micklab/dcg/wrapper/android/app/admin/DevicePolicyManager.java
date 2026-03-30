// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.admin;

public final class DevicePolicyManager {
    private final android.app.admin.DevicePolicyManager real;

    public DevicePolicyManager(android.app.admin.DevicePolicyManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.admin.DevicePolicyManager wrap(android.app.admin.DevicePolicyManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.DevicePolicyManager(real);
    }

    public android.app.admin.DevicePolicyManager unwrap() {
        return real;
    }

    public void acknowledgeDeviceCompliant() {
        real.acknowledgeDeviceCompliant();
    }

    public void addCrossProfileIntentFilter(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.content.IntentFilter arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#addCrossProfileIntentFilter(android.content.ComponentName,android.content.IntentFilter,int)");
    }

    public boolean addCrossProfileWidgetProvider(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#addCrossProfileWidgetProvider(android.content.ComponentName,java.lang.String)");
    }

    public int addOverrideApn(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.telephony.data.ApnSetting arg1) {
        return real.addOverrideApn(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void addPersistentPreferredActivity(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.content.IntentFilter arg1, com.micklab.dcg.wrapper.android.content.ComponentName arg2) {
        real.addPersistentPreferredActivity(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void addUserRestriction(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) {
        real.addUserRestriction(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void addUserRestrictionGlobally(java.lang.String arg0) {
        real.addUserRestrictionGlobally(arg0);
    }

    public boolean bindDeviceAdminServiceAsUser(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.content.ServiceConnection arg2, com.micklab.dcg.wrapper.android.content.Context.BindServiceFlags arg3, com.micklab.dcg.wrapper.android.os.UserHandle arg4) {
        return real.bindDeviceAdminServiceAsUser(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap());
    }

    public boolean bindDeviceAdminServiceAsUser(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, com.micklab.dcg.wrapper.android.content.ServiceConnection arg2, int arg3, com.micklab.dcg.wrapper.android.os.UserHandle arg4) {
        return real.bindDeviceAdminServiceAsUser(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3, arg4 == null ? null : arg4.unwrap());
    }

    public boolean canAdminGrantSensorsPermissions() {
        return real.canAdminGrantSensorsPermissions();
    }

    public boolean canUsbDataSignalingBeDisabled() {
        return real.canUsbDataSignalingBeDisabled();
    }

    public void clearApplicationUserData(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.app.admin.DevicePolicyManager.OnClearApplicationUserDataListener arg3) {
        real.clearApplicationUserData(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public void clearCrossProfileIntentFilters(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#clearCrossProfileIntentFilters(android.content.ComponentName)");
    }

    public void clearDeviceOwnerApp(java.lang.String arg0) {
        real.clearDeviceOwnerApp(arg0);
    }

    public void clearPackagePersistentPreferredActivities(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) {
        real.clearPackagePersistentPreferredActivities(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void clearProfileOwner(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#clearProfileOwner(android.content.ComponentName)");
    }

    public boolean clearResetPasswordToken(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.clearResetPasswordToken(arg0 == null ? null : arg0.unwrap());
    }

    public void clearUserRestriction(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) {
        real.clearUserRestriction(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public com.micklab.dcg.wrapper.android.content.Intent createAdminSupportIntent(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.createAdminSupportIntent(arg0));
    }

    public com.micklab.dcg.wrapper.android.os.UserHandle createAndManageUser(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.ComponentName arg2, com.micklab.dcg.wrapper.android.os.PersistableBundle arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.os.UserHandle.wrap(real.createAndManageUser(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4));
    }

    public int enableSystemApp(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.content.Intent arg1) {
        return real.enableSystemApp(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void enableSystemApp(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) {
        real.enableSystemApp(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public com.micklab.dcg.wrapper.android.security.AttestedKeyPair generateKeyPair(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.security.keystore.KeyGenParameterSpec arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.security.AttestedKeyPair.wrap(real.generateKeyPair(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3));
    }

    public java.lang.String[] getAccountTypesWithManagementDisabled() {
        return real.getAccountTypesWithManagementDisabled();
    }

    public java.lang.String getAlwaysOnVpnPackage(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getAlwaysOnVpnPackage(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getApplicationRestrictions(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getApplicationRestrictions(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public java.lang.String getApplicationRestrictionsManagingPackage(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getApplicationRestrictionsManagingPackage(arg0 == null ? null : arg0.unwrap());
    }

    public boolean getAutoTimeEnabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getAutoTimeEnabled(arg0 == null ? null : arg0.unwrap());
    }

    public boolean getAutoTimeRequired() {
        return real.getAutoTimeRequired();
    }

    public boolean getAutoTimeZoneEnabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getAutoTimeZoneEnabled(arg0 == null ? null : arg0.unwrap());
    }

    public boolean getBluetoothContactSharingDisabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getBluetoothContactSharingDisabled(arg0 == null ? null : arg0.unwrap());
    }

    public boolean getCameraDisabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getCameraDisabled(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String getCertInstallerPackage(com.micklab.dcg.wrapper.android.content.ComponentName arg0) throws java.lang.SecurityException {
        return real.getCertInstallerPackage(arg0 == null ? null : arg0.unwrap());
    }

    public int getContentProtectionPolicy(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getContentProtectionPolicy(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.app.admin.PackagePolicy getCredentialManagerPolicy() {
        return com.micklab.dcg.wrapper.android.app.admin.PackagePolicy.wrap(real.getCredentialManagerPolicy());
    }

    public boolean getCrossProfileCallerIdDisabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#getCrossProfileCallerIdDisabled(android.content.ComponentName)");
    }

    public boolean getCrossProfileContactsSearchDisabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#getCrossProfileContactsSearchDisabled(android.content.ComponentName)");
    }

    public int getCurrentFailedPasswordAttempts() {
        return real.getCurrentFailedPasswordAttempts();
    }

    public java.lang.CharSequence getDeviceOwnerLockScreenInfo() {
        return real.getDeviceOwnerLockScreenInfo();
    }

    public java.lang.String getDevicePolicyManagementRoleHolderPackage() {
        return real.getDevicePolicyManagementRoleHolderPackage();
    }

    public java.lang.CharSequence getEndUserSessionMessage(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getEndUserSessionMessage(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String getEnrollmentSpecificId() {
        return real.getEnrollmentSpecificId();
    }

    public com.micklab.dcg.wrapper.android.app.admin.FactoryResetProtectionPolicy getFactoryResetProtectionPolicy(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return com.micklab.dcg.wrapper.android.app.admin.FactoryResetProtectionPolicy.wrap(real.getFactoryResetProtectionPolicy(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.String getGlobalPrivateDnsHost(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getGlobalPrivateDnsHost(arg0 == null ? null : arg0.unwrap());
    }

    public int getGlobalPrivateDnsMode(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getGlobalPrivateDnsMode(arg0 == null ? null : arg0.unwrap());
    }

    public int getKeyguardDisabledFeatures(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getKeyguardDisabledFeatures(arg0 == null ? null : arg0.unwrap());
    }

    public int getLockTaskFeatures(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getLockTaskFeatures(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String[] getLockTaskPackages(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getLockTaskPackages(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.CharSequence getLongSupportMessage(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getLongSupportMessage(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.app.admin.PackagePolicy getManagedProfileCallerIdAccessPolicy() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#getManagedProfileCallerIdAccessPolicy()");
    }

    public com.micklab.dcg.wrapper.android.app.admin.PackagePolicy getManagedProfileContactsAccessPolicy() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#getManagedProfileContactsAccessPolicy()");
    }

    public long getManagedProfileMaximumTimeOff(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#getManagedProfileMaximumTimeOff(android.content.ComponentName)");
    }

    public com.micklab.dcg.wrapper.android.app.admin.ManagedSubscriptionsPolicy getManagedSubscriptionsPolicy() {
        return com.micklab.dcg.wrapper.android.app.admin.ManagedSubscriptionsPolicy.wrap(real.getManagedSubscriptionsPolicy());
    }

    public int getMaximumFailedPasswordsForWipe(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getMaximumFailedPasswordsForWipe(arg0 == null ? null : arg0.unwrap());
    }

    public long getMaximumTimeToLock(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getMaximumTimeToLock(arg0 == null ? null : arg0.unwrap());
    }

    public int getMinimumRequiredWifiSecurityLevel() {
        return real.getMinimumRequiredWifiSecurityLevel();
    }

    public int getMtePolicy() {
        return real.getMtePolicy();
    }

    public int getNearbyAppStreamingPolicy() {
        return real.getNearbyAppStreamingPolicy();
    }

    public int getNearbyNotificationStreamingPolicy() {
        return real.getNearbyNotificationStreamingPolicy();
    }

    public int getOrganizationColor(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getOrganizationColor(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.CharSequence getOrganizationName(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getOrganizationName(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.app.admin.DevicePolicyManager getParentProfileInstance(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#getParentProfileInstance(android.content.ComponentName)");
    }

    public int getPasswordComplexity() {
        return real.getPasswordComplexity();
    }

    public long getPasswordExpiration(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getPasswordExpiration(arg0 == null ? null : arg0.unwrap());
    }

    public long getPasswordExpirationTimeout(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getPasswordExpirationTimeout(arg0 == null ? null : arg0.unwrap());
    }

    public int getPasswordHistoryLength(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getPasswordHistoryLength(arg0 == null ? null : arg0.unwrap());
    }

    public int getPasswordMaximumLength(int arg0) {
        return real.getPasswordMaximumLength(arg0);
    }

    public int getPasswordMinimumLength(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getPasswordMinimumLength(arg0 == null ? null : arg0.unwrap());
    }

    public int getPasswordMinimumLetters(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getPasswordMinimumLetters(arg0 == null ? null : arg0.unwrap());
    }

    public int getPasswordMinimumLowerCase(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getPasswordMinimumLowerCase(arg0 == null ? null : arg0.unwrap());
    }

    public int getPasswordMinimumNonLetter(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getPasswordMinimumNonLetter(arg0 == null ? null : arg0.unwrap());
    }

    public int getPasswordMinimumNumeric(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getPasswordMinimumNumeric(arg0 == null ? null : arg0.unwrap());
    }

    public int getPasswordMinimumSymbols(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getPasswordMinimumSymbols(arg0 == null ? null : arg0.unwrap());
    }

    public int getPasswordMinimumUpperCase(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getPasswordMinimumUpperCase(arg0 == null ? null : arg0.unwrap());
    }

    public int getPasswordQuality(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getPasswordQuality(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.app.admin.SystemUpdateInfo getPendingSystemUpdate(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return com.micklab.dcg.wrapper.android.app.admin.SystemUpdateInfo.wrap(real.getPendingSystemUpdate(arg0 == null ? null : arg0.unwrap()));
    }

    public int getPermissionGrantState(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1, java.lang.String arg2) {
        return real.getPermissionGrantState(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public int getPermissionPolicy(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getPermissionPolicy(arg0 == null ? null : arg0.unwrap());
    }

    public int getPersonalAppsSuspendedReasons(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getPersonalAppsSuspendedReasons(arg0 == null ? null : arg0.unwrap());
    }

    public int getRequiredPasswordComplexity() {
        return real.getRequiredPasswordComplexity();
    }

    public long getRequiredStrongAuthTimeout(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getRequiredStrongAuthTimeout(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.app.admin.DevicePolicyResourcesManager getResources() {
        return com.micklab.dcg.wrapper.android.app.admin.DevicePolicyResourcesManager.wrap(real.getResources());
    }

    public boolean getScreenCaptureDisabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getScreenCaptureDisabled(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.CharSequence getShortSupportMessage(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getShortSupportMessage(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.CharSequence getStartUserSessionMessage(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getStartUserSessionMessage(arg0 == null ? null : arg0.unwrap());
    }

    public boolean getStorageEncryption(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getStorageEncryption(arg0 == null ? null : arg0.unwrap());
    }

    public int getStorageEncryptionStatus() {
        return real.getStorageEncryptionStatus();
    }

    public com.micklab.dcg.wrapper.android.app.admin.SystemUpdatePolicy getSystemUpdatePolicy() {
        return com.micklab.dcg.wrapper.android.app.admin.SystemUpdatePolicy.wrap(real.getSystemUpdatePolicy());
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getTransferOwnershipBundle() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(real.getTransferOwnershipBundle());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getUserRestrictions(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getUserRestrictions(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getUserRestrictionsGlobally() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getUserRestrictionsGlobally());
    }

    public java.lang.String getWifiMacAddress(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.getWifiMacAddress(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.app.admin.WifiSsidPolicy getWifiSsidPolicy() {
        return com.micklab.dcg.wrapper.android.app.admin.WifiSsidPolicy.wrap(real.getWifiSsidPolicy());
    }

    public boolean grantKeyPairToApp(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1, java.lang.String arg2) {
        return real.grantKeyPairToApp(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public boolean grantKeyPairToWifiAuth(java.lang.String arg0) {
        return real.grantKeyPairToWifiAuth(arg0);
    }

    public boolean hasCaCertInstalled(com.micklab.dcg.wrapper.android.content.ComponentName arg0, byte[] arg1) {
        return real.hasCaCertInstalled(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean hasGrantedPolicy(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1) {
        return real.hasGrantedPolicy(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean hasKeyPair(java.lang.String arg0) {
        return real.hasKeyPair(arg0);
    }

    public boolean hasLockdownAdminConfiguredNetworks(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#hasLockdownAdminConfiguredNetworks(android.content.ComponentName)");
    }

    public boolean installCaCert(com.micklab.dcg.wrapper.android.content.ComponentName arg0, byte[] arg1) {
        return real.installCaCert(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean installExistingPackage(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) {
        return real.installExistingPackage(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean installKeyPair(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.security.PrivateKey arg1, java.security.cert.Certificate arg2, java.lang.String arg3) {
        return real.installKeyPair(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

    public boolean installKeyPair(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.security.PrivateKey arg1, java.security.cert.Certificate[] arg2, java.lang.String arg3, boolean arg4) {
        return real.installKeyPair(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4);
    }

    public boolean installKeyPair(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.security.PrivateKey arg1, java.security.cert.Certificate[] arg2, java.lang.String arg3, int arg4) {
        return real.installKeyPair(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4);
    }

    public void installSystemUpdate(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.app.admin.DevicePolicyManager.InstallSystemUpdateCallback arg3) {
        real.installSystemUpdate(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public boolean isActivePasswordSufficient() {
        return real.isActivePasswordSufficient();
    }

    public boolean isActivePasswordSufficientForDeviceRequirement() {
        return real.isActivePasswordSufficientForDeviceRequirement();
    }

    public boolean isAdminActive(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.isAdminActive(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isAffiliatedUser() {
        return real.isAffiliatedUser();
    }

    public boolean isAlwaysOnVpnLockdownEnabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.isAlwaysOnVpnLockdownEnabled(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isApplicationHidden(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) {
        return real.isApplicationHidden(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean isBackupServiceEnabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.isBackupServiceEnabled(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isCallerApplicationRestrictionsManagingPackage() {
        return real.isCallerApplicationRestrictionsManagingPackage();
    }

    public boolean isCommonCriteriaModeEnabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.isCommonCriteriaModeEnabled(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isComplianceAcknowledgementRequired() {
        return real.isComplianceAcknowledgementRequired();
    }

    public boolean isDeviceFinanced() {
        return real.isDeviceFinanced();
    }

    public boolean isDeviceIdAttestationSupported() {
        return real.isDeviceIdAttestationSupported();
    }

    public boolean isDeviceOwnerApp(java.lang.String arg0) {
        return real.isDeviceOwnerApp(arg0);
    }

    public boolean isEphemeralUser(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.isEphemeralUser(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isKeyPairGrantedToWifiAuth(java.lang.String arg0) {
        return real.isKeyPairGrantedToWifiAuth(arg0);
    }

    public boolean isLockTaskPermitted(java.lang.String arg0) {
        return real.isLockTaskPermitted(arg0);
    }

    public boolean isLogoutEnabled() {
        return real.isLogoutEnabled();
    }

    public boolean isManagedProfile(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#isManagedProfile(android.content.ComponentName)");
    }

    public boolean isMasterVolumeMuted(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.isMasterVolumeMuted(arg0 == null ? null : arg0.unwrap());
    }

    public static boolean isMtePolicyEnforced() {
        return android.app.admin.DevicePolicyManager.isMtePolicyEnforced();
    }

    public boolean isNetworkLoggingEnabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#isNetworkLoggingEnabled(android.content.ComponentName)");
    }

    public boolean isOrganizationOwnedDeviceWithManagedProfile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#isOrganizationOwnedDeviceWithManagedProfile()");
    }

    public boolean isOverrideApnEnabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.isOverrideApnEnabled(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isPackageSuspended(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        return real.isPackageSuspended(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean isPreferentialNetworkServiceEnabled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#isPreferentialNetworkServiceEnabled()");
    }

    public boolean isProfileOwnerApp(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#isProfileOwnerApp(java.lang.String)");
    }

    public boolean isProvisioningAllowed(java.lang.String arg0) {
        return real.isProvisioningAllowed(arg0);
    }

    public boolean isResetPasswordTokenActive(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.isResetPasswordTokenActive(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isSafeOperation(int arg0) {
        return real.isSafeOperation(arg0);
    }

    public boolean isSecurityLoggingEnabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.isSecurityLoggingEnabled(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isStatusBarDisabled() {
        return real.isStatusBarDisabled();
    }

    public boolean isUninstallBlocked(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) {
        return real.isUninstallBlocked(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean isUniqueDeviceAttestationSupported() {
        return real.isUniqueDeviceAttestationSupported();
    }

    public boolean isUsbDataSignalingEnabled() {
        return real.isUsbDataSignalingEnabled();
    }

    public boolean isUsingUnifiedPassword(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.isUsingUnifiedPassword(arg0 == null ? null : arg0.unwrap());
    }

    public void lockNow() {
        real.lockNow();
    }

    public void lockNow(int arg0) {
        real.lockNow(arg0);
    }

    public int logoutUser(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.logoutUser(arg0 == null ? null : arg0.unwrap());
    }

    public void reboot(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        real.reboot(arg0 == null ? null : arg0.unwrap());
    }

    public void removeActiveAdmin(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        real.removeActiveAdmin(arg0 == null ? null : arg0.unwrap());
    }

    public boolean removeCrossProfileWidgetProvider(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#removeCrossProfileWidgetProvider(android.content.ComponentName,java.lang.String)");
    }

    public boolean removeKeyPair(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) {
        return real.removeKeyPair(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean removeOverrideApn(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1) {
        return real.removeOverrideApn(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean removeUser(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1) {
        return real.removeUser(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean requestBugreport(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.requestBugreport(arg0 == null ? null : arg0.unwrap());
    }

    public boolean resetPassword(java.lang.String arg0, int arg1) {
        return real.resetPassword(arg0, arg1);
    }

    public boolean resetPasswordWithToken(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1, byte[] arg2, int arg3) {
        return real.resetPasswordWithToken(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

    public boolean revokeKeyPairFromApp(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1, java.lang.String arg2) {
        return real.revokeKeyPairFromApp(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public boolean revokeKeyPairFromWifiAuth(java.lang.String arg0) {
        return real.revokeKeyPairFromWifiAuth(arg0);
    }

    public void setAccountManagementDisabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1, boolean arg2) {
        real.setAccountManagementDisabled(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void setAlwaysOnVpnPackage(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1, boolean arg2) throws android.content.pm.PackageManager.NameNotFoundException {
        real.setAlwaysOnVpnPackage(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public boolean setApplicationHidden(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1, boolean arg2) {
        return real.setApplicationHidden(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void setApplicationRestrictions(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        real.setApplicationRestrictions(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void setApplicationRestrictionsManagingPackage(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        real.setApplicationRestrictionsManagingPackage(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setAutoTimeEnabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0, boolean arg1) {
        real.setAutoTimeEnabled(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setAutoTimeRequired(com.micklab.dcg.wrapper.android.content.ComponentName arg0, boolean arg1) {
        real.setAutoTimeRequired(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setAutoTimeZoneEnabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0, boolean arg1) {
        real.setAutoTimeZoneEnabled(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setBackupServiceEnabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0, boolean arg1) {
        real.setBackupServiceEnabled(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setBluetoothContactSharingDisabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0, boolean arg1) {
        real.setBluetoothContactSharingDisabled(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setCameraDisabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0, boolean arg1) {
        real.setCameraDisabled(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setCertInstallerPackage(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) throws java.lang.SecurityException {
        real.setCertInstallerPackage(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setCommonCriteriaModeEnabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0, boolean arg1) {
        real.setCommonCriteriaModeEnabled(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setConfiguredNetworksLockdownState(com.micklab.dcg.wrapper.android.content.ComponentName arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#setConfiguredNetworksLockdownState(android.content.ComponentName,boolean)");
    }

    public void setContentProtectionPolicy(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1) {
        real.setContentProtectionPolicy(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setCredentialManagerPolicy(com.micklab.dcg.wrapper.android.app.admin.PackagePolicy arg0) {
        real.setCredentialManagerPolicy(arg0 == null ? null : arg0.unwrap());
    }

    public void setCrossProfileCallerIdDisabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#setCrossProfileCallerIdDisabled(android.content.ComponentName,boolean)");
    }

    public void setCrossProfileContactsSearchDisabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#setCrossProfileContactsSearchDisabled(android.content.ComponentName,boolean)");
    }

    public void setDefaultDialerApplication(java.lang.String arg0) {
        real.setDefaultDialerApplication(arg0);
    }

    public void setDefaultSmsApplication(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) {
        real.setDefaultSmsApplication(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setDeviceOwnerLockScreenInfo(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.CharSequence arg1) {
        real.setDeviceOwnerLockScreenInfo(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setEndUserSessionMessage(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.CharSequence arg1) {
        real.setEndUserSessionMessage(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setFactoryResetProtectionPolicy(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.app.admin.FactoryResetProtectionPolicy arg1) {
        real.setFactoryResetProtectionPolicy(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public int setGlobalPrivateDnsModeOpportunistic(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        return real.setGlobalPrivateDnsModeOpportunistic(arg0 == null ? null : arg0.unwrap());
    }

    public int setGlobalPrivateDnsModeSpecifiedHost(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) {
        return real.setGlobalPrivateDnsModeSpecifiedHost(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setGlobalSetting(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1, java.lang.String arg2) {
        real.setGlobalSetting(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public boolean setKeyguardDisabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0, boolean arg1) {
        return real.setKeyguardDisabled(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setKeyguardDisabledFeatures(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1) {
        real.setKeyguardDisabledFeatures(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setLocationEnabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0, boolean arg1) {
        real.setLocationEnabled(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setLockTaskFeatures(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1) {
        real.setLockTaskFeatures(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setLockTaskPackages(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String[] arg1) throws java.lang.SecurityException {
        real.setLockTaskPackages(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setLogoutEnabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0, boolean arg1) {
        real.setLogoutEnabled(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setLongSupportMessage(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.CharSequence arg1) {
        real.setLongSupportMessage(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setManagedProfileCallerIdAccessPolicy(com.micklab.dcg.wrapper.android.app.admin.PackagePolicy arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#setManagedProfileCallerIdAccessPolicy(android.app.admin.PackagePolicy)");
    }

    public void setManagedProfileContactsAccessPolicy(com.micklab.dcg.wrapper.android.app.admin.PackagePolicy arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#setManagedProfileContactsAccessPolicy(android.app.admin.PackagePolicy)");
    }

    public void setManagedProfileMaximumTimeOff(com.micklab.dcg.wrapper.android.content.ComponentName arg0, long arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#setManagedProfileMaximumTimeOff(android.content.ComponentName,long)");
    }

    public void setManagedSubscriptionsPolicy(com.micklab.dcg.wrapper.android.app.admin.ManagedSubscriptionsPolicy arg0) {
        real.setManagedSubscriptionsPolicy(arg0 == null ? null : arg0.unwrap());
    }

    public void setMasterVolumeMuted(com.micklab.dcg.wrapper.android.content.ComponentName arg0, boolean arg1) {
        real.setMasterVolumeMuted(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setMaximumFailedPasswordsForWipe(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1) {
        real.setMaximumFailedPasswordsForWipe(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setMaximumTimeToLock(com.micklab.dcg.wrapper.android.content.ComponentName arg0, long arg1) {
        real.setMaximumTimeToLock(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setMinimumRequiredWifiSecurityLevel(int arg0) {
        real.setMinimumRequiredWifiSecurityLevel(arg0);
    }

    public void setMtePolicy(int arg0) {
        real.setMtePolicy(arg0);
    }

    public void setNearbyAppStreamingPolicy(int arg0) {
        real.setNearbyAppStreamingPolicy(arg0);
    }

    public void setNearbyNotificationStreamingPolicy(int arg0) {
        real.setNearbyNotificationStreamingPolicy(arg0);
    }

    public void setNetworkLoggingEnabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#setNetworkLoggingEnabled(android.content.ComponentName,boolean)");
    }

    public void setOrganizationColor(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1) {
        real.setOrganizationColor(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setOrganizationId(java.lang.String arg0) {
        real.setOrganizationId(arg0);
    }

    public void setOrganizationName(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.CharSequence arg1) {
        real.setOrganizationName(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setOverrideApnsEnabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0, boolean arg1) {
        real.setOverrideApnsEnabled(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public java.lang.String[] setPackagesSuspended(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String[] arg1, boolean arg2) {
        return real.setPackagesSuspended(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void setPasswordExpirationTimeout(com.micklab.dcg.wrapper.android.content.ComponentName arg0, long arg1) {
        real.setPasswordExpirationTimeout(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setPasswordHistoryLength(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1) {
        real.setPasswordHistoryLength(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setPasswordMinimumLength(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1) {
        real.setPasswordMinimumLength(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setPasswordMinimumLetters(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1) {
        real.setPasswordMinimumLetters(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setPasswordMinimumLowerCase(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1) {
        real.setPasswordMinimumLowerCase(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setPasswordMinimumNonLetter(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1) {
        real.setPasswordMinimumNonLetter(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setPasswordMinimumNumeric(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1) {
        real.setPasswordMinimumNumeric(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setPasswordMinimumSymbols(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1) {
        real.setPasswordMinimumSymbols(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setPasswordMinimumUpperCase(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1) {
        real.setPasswordMinimumUpperCase(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setPasswordQuality(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1) {
        real.setPasswordQuality(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean setPermissionGrantState(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1, java.lang.String arg2, int arg3) {
        return real.setPermissionGrantState(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

    public void setPermissionPolicy(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1) {
        real.setPermissionPolicy(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setPersonalAppsSuspended(com.micklab.dcg.wrapper.android.content.ComponentName arg0, boolean arg1) {
        real.setPersonalAppsSuspended(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setPreferentialNetworkServiceEnabled(boolean arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#setPreferentialNetworkServiceEnabled(boolean)");
    }

    public void setProfileEnabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#setProfileEnabled(android.content.ComponentName)");
    }

    public void setProfileName(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.admin.DevicePolicyManager#setProfileName(android.content.ComponentName,java.lang.String)");
    }

    public void setRecommendedGlobalProxy(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.net.ProxyInfo arg1) {
        real.setRecommendedGlobalProxy(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setRequiredPasswordComplexity(int arg0) {
        real.setRequiredPasswordComplexity(arg0);
    }

    public void setRequiredStrongAuthTimeout(com.micklab.dcg.wrapper.android.content.ComponentName arg0, long arg1) {
        real.setRequiredStrongAuthTimeout(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean setResetPasswordToken(com.micklab.dcg.wrapper.android.content.ComponentName arg0, byte[] arg1) {
        return real.setResetPasswordToken(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setRestrictionsProvider(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1) {
        real.setRestrictionsProvider(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setScreenCaptureDisabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0, boolean arg1) {
        real.setScreenCaptureDisabled(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setSecureSetting(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1, java.lang.String arg2) {
        real.setSecureSetting(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void setSecurityLoggingEnabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0, boolean arg1) {
        real.setSecurityLoggingEnabled(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setShortSupportMessage(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.CharSequence arg1) {
        real.setShortSupportMessage(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setStartUserSessionMessage(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.CharSequence arg1) {
        real.setStartUserSessionMessage(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean setStatusBarDisabled(com.micklab.dcg.wrapper.android.content.ComponentName arg0, boolean arg1) {
        return real.setStatusBarDisabled(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public int setStorageEncryption(com.micklab.dcg.wrapper.android.content.ComponentName arg0, boolean arg1) {
        return real.setStorageEncryption(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setSystemSetting(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1, java.lang.String arg2) {
        real.setSystemSetting(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void setSystemUpdatePolicy(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.app.admin.SystemUpdatePolicy arg1) {
        real.setSystemUpdatePolicy(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean setTime(com.micklab.dcg.wrapper.android.content.ComponentName arg0, long arg1) {
        return real.setTime(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean setTimeZone(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1) {
        return real.setTimeZone(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setTrustAgentConfiguration(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1, com.micklab.dcg.wrapper.android.os.PersistableBundle arg2) {
        real.setTrustAgentConfiguration(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void setUninstallBlocked(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1, boolean arg2) {
        real.setUninstallBlocked(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void setUsbDataSignalingEnabled(boolean arg0) {
        real.setUsbDataSignalingEnabled(arg0);
    }

    public void setUserIcon(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1) {
        real.setUserIcon(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setWifiSsidPolicy(com.micklab.dcg.wrapper.android.app.admin.WifiSsidPolicy arg0) {
        real.setWifiSsidPolicy(arg0 == null ? null : arg0.unwrap());
    }

    public int startUserInBackground(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1) {
        return real.startUserInBackground(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public int stopUser(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1) {
        return real.stopUser(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean switchUser(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1) {
        return real.switchUser(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void transferOwnership(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1, com.micklab.dcg.wrapper.android.os.PersistableBundle arg2) {
        real.transferOwnership(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void uninstallAllUserCaCerts(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        real.uninstallAllUserCaCerts(arg0 == null ? null : arg0.unwrap());
    }

    public void uninstallCaCert(com.micklab.dcg.wrapper.android.content.ComponentName arg0, byte[] arg1) {
        real.uninstallCaCert(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean updateOverrideApn(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1, com.micklab.dcg.wrapper.android.telephony.data.ApnSetting arg2) {
        return real.updateOverrideApn(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void wipeData(int arg0) {
        real.wipeData(arg0);
    }

    public void wipeData(int arg0, java.lang.CharSequence arg1) {
        real.wipeData(arg0, arg1);
    }

    public void wipeDevice(int arg0) {
        real.wipeDevice(arg0);
    }

    public static final java.lang.String ACTION_ADD_DEVICE_ADMIN = android.app.admin.DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN;
    public static final java.lang.String ACTION_ADMIN_POLICY_COMPLIANCE = android.app.admin.DevicePolicyManager.ACTION_ADMIN_POLICY_COMPLIANCE;
    public static final java.lang.String ACTION_APPLICATION_DELEGATION_SCOPES_CHANGED = android.app.admin.DevicePolicyManager.ACTION_APPLICATION_DELEGATION_SCOPES_CHANGED;
    public static final java.lang.String ACTION_CHECK_POLICY_COMPLIANCE = android.app.admin.DevicePolicyManager.ACTION_CHECK_POLICY_COMPLIANCE;
    public static final java.lang.String ACTION_DEVICE_ADMIN_SERVICE = android.app.admin.DevicePolicyManager.ACTION_DEVICE_ADMIN_SERVICE;
    public static final java.lang.String ACTION_DEVICE_FINANCING_STATE_CHANGED = android.app.admin.DevicePolicyManager.ACTION_DEVICE_FINANCING_STATE_CHANGED;
    public static final java.lang.String ACTION_DEVICE_OWNER_CHANGED = android.app.admin.DevicePolicyManager.ACTION_DEVICE_OWNER_CHANGED;
    public static final java.lang.String ACTION_DEVICE_POLICY_RESOURCE_UPDATED = android.app.admin.DevicePolicyManager.ACTION_DEVICE_POLICY_RESOURCE_UPDATED;
    public static final java.lang.String ACTION_GET_PROVISIONING_MODE = android.app.admin.DevicePolicyManager.ACTION_GET_PROVISIONING_MODE;
    public static final java.lang.String ACTION_PROVISIONING_SUCCESSFUL = android.app.admin.DevicePolicyManager.ACTION_PROVISIONING_SUCCESSFUL;
    public static final java.lang.String ACTION_PROVISION_MANAGED_DEVICE = android.app.admin.DevicePolicyManager.ACTION_PROVISION_MANAGED_DEVICE;
    public static final java.lang.String ACTION_SET_NEW_PASSWORD = android.app.admin.DevicePolicyManager.ACTION_SET_NEW_PASSWORD;
    public static final java.lang.String ACTION_START_ENCRYPTION = android.app.admin.DevicePolicyManager.ACTION_START_ENCRYPTION;
    public static final java.lang.String ACTION_SYSTEM_UPDATE_POLICY_CHANGED = android.app.admin.DevicePolicyManager.ACTION_SYSTEM_UPDATE_POLICY_CHANGED;
    public static final int CONTENT_PROTECTION_DISABLED = android.app.admin.DevicePolicyManager.CONTENT_PROTECTION_DISABLED;
    public static final int CONTENT_PROTECTION_ENABLED = android.app.admin.DevicePolicyManager.CONTENT_PROTECTION_ENABLED;
    public static final int CONTENT_PROTECTION_NOT_CONTROLLED_BY_POLICY = android.app.admin.DevicePolicyManager.CONTENT_PROTECTION_NOT_CONTROLLED_BY_POLICY;
    public static final java.lang.String DELEGATION_APP_RESTRICTIONS = android.app.admin.DevicePolicyManager.DELEGATION_APP_RESTRICTIONS;
    public static final java.lang.String DELEGATION_BLOCK_UNINSTALL = android.app.admin.DevicePolicyManager.DELEGATION_BLOCK_UNINSTALL;
    public static final java.lang.String DELEGATION_CERT_INSTALL = android.app.admin.DevicePolicyManager.DELEGATION_CERT_INSTALL;
    public static final java.lang.String DELEGATION_CERT_SELECTION = android.app.admin.DevicePolicyManager.DELEGATION_CERT_SELECTION;
    public static final java.lang.String DELEGATION_ENABLE_SYSTEM_APP = android.app.admin.DevicePolicyManager.DELEGATION_ENABLE_SYSTEM_APP;
    public static final java.lang.String DELEGATION_INSTALL_EXISTING_PACKAGE = android.app.admin.DevicePolicyManager.DELEGATION_INSTALL_EXISTING_PACKAGE;
    public static final java.lang.String DELEGATION_KEEP_UNINSTALLED_PACKAGES = android.app.admin.DevicePolicyManager.DELEGATION_KEEP_UNINSTALLED_PACKAGES;
    public static final java.lang.String DELEGATION_PACKAGE_ACCESS = android.app.admin.DevicePolicyManager.DELEGATION_PACKAGE_ACCESS;
    public static final java.lang.String DELEGATION_PERMISSION_GRANT = android.app.admin.DevicePolicyManager.DELEGATION_PERMISSION_GRANT;
    public static final java.lang.String DELEGATION_SECURITY_LOGGING = android.app.admin.DevicePolicyManager.DELEGATION_SECURITY_LOGGING;
    public static final int ENCRYPTION_STATUS_ACTIVATING = android.app.admin.DevicePolicyManager.ENCRYPTION_STATUS_ACTIVATING;
    public static final int ENCRYPTION_STATUS_ACTIVE = android.app.admin.DevicePolicyManager.ENCRYPTION_STATUS_ACTIVE;
    public static final int ENCRYPTION_STATUS_ACTIVE_DEFAULT_KEY = android.app.admin.DevicePolicyManager.ENCRYPTION_STATUS_ACTIVE_DEFAULT_KEY;
    public static final int ENCRYPTION_STATUS_ACTIVE_PER_USER = android.app.admin.DevicePolicyManager.ENCRYPTION_STATUS_ACTIVE_PER_USER;
    public static final int ENCRYPTION_STATUS_INACTIVE = android.app.admin.DevicePolicyManager.ENCRYPTION_STATUS_INACTIVE;
    public static final int ENCRYPTION_STATUS_UNSUPPORTED = android.app.admin.DevicePolicyManager.ENCRYPTION_STATUS_UNSUPPORTED;
    public static final java.lang.String EXTRA_ADD_EXPLANATION = android.app.admin.DevicePolicyManager.EXTRA_ADD_EXPLANATION;
    public static final java.lang.String EXTRA_DELEGATION_SCOPES = android.app.admin.DevicePolicyManager.EXTRA_DELEGATION_SCOPES;
    public static final java.lang.String EXTRA_DEVICE_ADMIN = android.app.admin.DevicePolicyManager.EXTRA_DEVICE_ADMIN;
    public static final java.lang.String EXTRA_DEVICE_PASSWORD_REQUIREMENT_ONLY = android.app.admin.DevicePolicyManager.EXTRA_DEVICE_PASSWORD_REQUIREMENT_ONLY;
    public static final java.lang.String EXTRA_PASSWORD_COMPLEXITY = android.app.admin.DevicePolicyManager.EXTRA_PASSWORD_COMPLEXITY;
    public static final java.lang.String EXTRA_PROVISIONING_ACCOUNT_TO_MIGRATE = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_ACCOUNT_TO_MIGRATE;
    public static final java.lang.String EXTRA_PROVISIONING_ADMIN_EXTRAS_BUNDLE = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_ADMIN_EXTRAS_BUNDLE;
    public static final java.lang.String EXTRA_PROVISIONING_ALLOWED_PROVISIONING_MODES = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_ALLOWED_PROVISIONING_MODES;
    public static final java.lang.String EXTRA_PROVISIONING_ALLOW_OFFLINE = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_ALLOW_OFFLINE;
    public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_COMPONENT_NAME = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_DEVICE_ADMIN_COMPONENT_NAME;
    public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_MINIMUM_VERSION_CODE = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_DEVICE_ADMIN_MINIMUM_VERSION_CODE;
    public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_CHECKSUM = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_CHECKSUM;
    public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_COOKIE_HEADER = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_COOKIE_HEADER;
    public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_LOCATION = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_LOCATION;
    public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_NAME = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_DEVICE_ADMIN_PACKAGE_NAME;
    public static final java.lang.String EXTRA_PROVISIONING_DEVICE_ADMIN_SIGNATURE_CHECKSUM = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_DEVICE_ADMIN_SIGNATURE_CHECKSUM;
    public static final java.lang.String EXTRA_PROVISIONING_DISCLAIMERS = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_DISCLAIMERS;
    public static final java.lang.String EXTRA_PROVISIONING_DISCLAIMER_CONTENT = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_DISCLAIMER_CONTENT;
    public static final java.lang.String EXTRA_PROVISIONING_DISCLAIMER_HEADER = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_DISCLAIMER_HEADER;
    public static final java.lang.String EXTRA_PROVISIONING_EMAIL_ADDRESS = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_EMAIL_ADDRESS;
    public static final java.lang.String EXTRA_PROVISIONING_IMEI = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_IMEI;
    public static final java.lang.String EXTRA_PROVISIONING_KEEP_ACCOUNT_ON_MIGRATION = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_KEEP_ACCOUNT_ON_MIGRATION;
    public static final java.lang.String EXTRA_PROVISIONING_KEEP_SCREEN_ON = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_KEEP_SCREEN_ON;
    public static final java.lang.String EXTRA_PROVISIONING_LEAVE_ALL_SYSTEM_APPS_ENABLED = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_LEAVE_ALL_SYSTEM_APPS_ENABLED;
    public static final java.lang.String EXTRA_PROVISIONING_LOCALE = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_LOCALE;
    public static final java.lang.String EXTRA_PROVISIONING_LOCAL_TIME = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_LOCAL_TIME;
    public static final java.lang.String EXTRA_PROVISIONING_LOGO_URI = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_LOGO_URI;
    public static final java.lang.String EXTRA_PROVISIONING_MAIN_COLOR = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_MAIN_COLOR;
    public static final java.lang.String EXTRA_PROVISIONING_MODE = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_MODE;
    public static final java.lang.String EXTRA_PROVISIONING_SENSORS_PERMISSION_GRANT_OPT_OUT = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_SENSORS_PERMISSION_GRANT_OPT_OUT;
    public static final java.lang.String EXTRA_PROVISIONING_SERIAL_NUMBER = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_SERIAL_NUMBER;
    public static final java.lang.String EXTRA_PROVISIONING_SHOULD_LAUNCH_RESULT_INTENT = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_SHOULD_LAUNCH_RESULT_INTENT;
    public static final java.lang.String EXTRA_PROVISIONING_SKIP_EDUCATION_SCREENS = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_SKIP_EDUCATION_SCREENS;
    public static final java.lang.String EXTRA_PROVISIONING_SKIP_ENCRYPTION = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_SKIP_ENCRYPTION;
    public static final java.lang.String EXTRA_PROVISIONING_SKIP_USER_CONSENT = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_SKIP_USER_CONSENT;
    public static final java.lang.String EXTRA_PROVISIONING_TIME_ZONE = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_TIME_ZONE;
    public static final java.lang.String EXTRA_PROVISIONING_USE_MOBILE_DATA = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_USE_MOBILE_DATA;
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_ANONYMOUS_IDENTITY = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_WIFI_ANONYMOUS_IDENTITY;
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_CA_CERTIFICATE = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_WIFI_CA_CERTIFICATE;
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_DOMAIN = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_WIFI_DOMAIN;
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_EAP_METHOD = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_WIFI_EAP_METHOD;
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_HIDDEN = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_WIFI_HIDDEN;
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_IDENTITY = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_WIFI_IDENTITY;
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_PAC_URL = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_WIFI_PAC_URL;
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_PASSWORD = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_WIFI_PASSWORD;
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_PHASE2_AUTH = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_WIFI_PHASE2_AUTH;
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_PROXY_BYPASS = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_WIFI_PROXY_BYPASS;
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_PROXY_HOST = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_WIFI_PROXY_HOST;
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_PROXY_PORT = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_WIFI_PROXY_PORT;
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_SECURITY_TYPE = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_WIFI_SECURITY_TYPE;
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_SSID = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_WIFI_SSID;
    public static final java.lang.String EXTRA_PROVISIONING_WIFI_USER_CERTIFICATE = android.app.admin.DevicePolicyManager.EXTRA_PROVISIONING_WIFI_USER_CERTIFICATE;
    public static final java.lang.String EXTRA_RESOURCE_IDS = android.app.admin.DevicePolicyManager.EXTRA_RESOURCE_IDS;
    public static final java.lang.String EXTRA_RESOURCE_TYPE = android.app.admin.DevicePolicyManager.EXTRA_RESOURCE_TYPE;
    public static final int EXTRA_RESOURCE_TYPE_DRAWABLE = android.app.admin.DevicePolicyManager.EXTRA_RESOURCE_TYPE_DRAWABLE;
    public static final int EXTRA_RESOURCE_TYPE_STRING = android.app.admin.DevicePolicyManager.EXTRA_RESOURCE_TYPE_STRING;
    public static final java.lang.String EXTRA_RESULT_LAUNCH_INTENT = android.app.admin.DevicePolicyManager.EXTRA_RESULT_LAUNCH_INTENT;
    public static final int FLAG_EVICT_CREDENTIAL_ENCRYPTION_KEY = android.app.admin.DevicePolicyManager.FLAG_EVICT_CREDENTIAL_ENCRYPTION_KEY;
    public static final int FLAG_MANAGED_CAN_ACCESS_PARENT = android.app.admin.DevicePolicyManager.FLAG_MANAGED_CAN_ACCESS_PARENT;
    public static final int FLAG_PARENT_CAN_ACCESS_MANAGED = android.app.admin.DevicePolicyManager.FLAG_PARENT_CAN_ACCESS_MANAGED;
    public static final int ID_TYPE_BASE_INFO = android.app.admin.DevicePolicyManager.ID_TYPE_BASE_INFO;
    public static final int ID_TYPE_IMEI = android.app.admin.DevicePolicyManager.ID_TYPE_IMEI;
    public static final int ID_TYPE_INDIVIDUAL_ATTESTATION = android.app.admin.DevicePolicyManager.ID_TYPE_INDIVIDUAL_ATTESTATION;
    public static final int ID_TYPE_MEID = android.app.admin.DevicePolicyManager.ID_TYPE_MEID;
    public static final int ID_TYPE_SERIAL = android.app.admin.DevicePolicyManager.ID_TYPE_SERIAL;
    public static final int INSTALLKEY_REQUEST_CREDENTIALS_ACCESS = android.app.admin.DevicePolicyManager.INSTALLKEY_REQUEST_CREDENTIALS_ACCESS;
    public static final int INSTALLKEY_SET_USER_SELECTABLE = android.app.admin.DevicePolicyManager.INSTALLKEY_SET_USER_SELECTABLE;
    public static final int KEYGUARD_DISABLE_BIOMETRICS = android.app.admin.DevicePolicyManager.KEYGUARD_DISABLE_BIOMETRICS;
    public static final int KEYGUARD_DISABLE_FACE = android.app.admin.DevicePolicyManager.KEYGUARD_DISABLE_FACE;
    public static final int KEYGUARD_DISABLE_FEATURES_ALL = android.app.admin.DevicePolicyManager.KEYGUARD_DISABLE_FEATURES_ALL;
    public static final int KEYGUARD_DISABLE_FEATURES_NONE = android.app.admin.DevicePolicyManager.KEYGUARD_DISABLE_FEATURES_NONE;
    public static final int KEYGUARD_DISABLE_FINGERPRINT = android.app.admin.DevicePolicyManager.KEYGUARD_DISABLE_FINGERPRINT;
    public static final int KEYGUARD_DISABLE_IRIS = android.app.admin.DevicePolicyManager.KEYGUARD_DISABLE_IRIS;
    public static final int KEYGUARD_DISABLE_REMOTE_INPUT = android.app.admin.DevicePolicyManager.KEYGUARD_DISABLE_REMOTE_INPUT;
    public static final int KEYGUARD_DISABLE_SECURE_CAMERA = android.app.admin.DevicePolicyManager.KEYGUARD_DISABLE_SECURE_CAMERA;
    public static final int KEYGUARD_DISABLE_SECURE_NOTIFICATIONS = android.app.admin.DevicePolicyManager.KEYGUARD_DISABLE_SECURE_NOTIFICATIONS;
    public static final int KEYGUARD_DISABLE_SHORTCUTS_ALL = android.app.admin.DevicePolicyManager.KEYGUARD_DISABLE_SHORTCUTS_ALL;
    public static final int KEYGUARD_DISABLE_TRUST_AGENTS = android.app.admin.DevicePolicyManager.KEYGUARD_DISABLE_TRUST_AGENTS;
    public static final int KEYGUARD_DISABLE_UNREDACTED_NOTIFICATIONS = android.app.admin.DevicePolicyManager.KEYGUARD_DISABLE_UNREDACTED_NOTIFICATIONS;
    public static final int KEYGUARD_DISABLE_WIDGETS_ALL = android.app.admin.DevicePolicyManager.KEYGUARD_DISABLE_WIDGETS_ALL;
    public static final int LEAVE_ALL_SYSTEM_APPS_ENABLED = android.app.admin.DevicePolicyManager.LEAVE_ALL_SYSTEM_APPS_ENABLED;
    public static final int LOCK_TASK_FEATURE_BLOCK_ACTIVITY_START_IN_TASK = android.app.admin.DevicePolicyManager.LOCK_TASK_FEATURE_BLOCK_ACTIVITY_START_IN_TASK;
    public static final int LOCK_TASK_FEATURE_GLOBAL_ACTIONS = android.app.admin.DevicePolicyManager.LOCK_TASK_FEATURE_GLOBAL_ACTIONS;
    public static final int LOCK_TASK_FEATURE_HOME = android.app.admin.DevicePolicyManager.LOCK_TASK_FEATURE_HOME;
    public static final int LOCK_TASK_FEATURE_KEYGUARD = android.app.admin.DevicePolicyManager.LOCK_TASK_FEATURE_KEYGUARD;
    public static final int LOCK_TASK_FEATURE_NONE = android.app.admin.DevicePolicyManager.LOCK_TASK_FEATURE_NONE;
    public static final int LOCK_TASK_FEATURE_NOTIFICATIONS = android.app.admin.DevicePolicyManager.LOCK_TASK_FEATURE_NOTIFICATIONS;
    public static final int LOCK_TASK_FEATURE_OVERVIEW = android.app.admin.DevicePolicyManager.LOCK_TASK_FEATURE_OVERVIEW;
    public static final int LOCK_TASK_FEATURE_SYSTEM_INFO = android.app.admin.DevicePolicyManager.LOCK_TASK_FEATURE_SYSTEM_INFO;
    public static final int MAKE_USER_EPHEMERAL = android.app.admin.DevicePolicyManager.MAKE_USER_EPHEMERAL;
    public static final java.lang.String MIME_TYPE_PROVISIONING_NFC = android.app.admin.DevicePolicyManager.MIME_TYPE_PROVISIONING_NFC;
    public static final int MTE_DISABLED = android.app.admin.DevicePolicyManager.MTE_DISABLED;
    public static final int MTE_ENABLED = android.app.admin.DevicePolicyManager.MTE_ENABLED;
    public static final int MTE_NOT_CONTROLLED_BY_POLICY = android.app.admin.DevicePolicyManager.MTE_NOT_CONTROLLED_BY_POLICY;
    public static final int NEARBY_STREAMING_DISABLED = android.app.admin.DevicePolicyManager.NEARBY_STREAMING_DISABLED;
    public static final int NEARBY_STREAMING_ENABLED = android.app.admin.DevicePolicyManager.NEARBY_STREAMING_ENABLED;
    public static final int NEARBY_STREAMING_NOT_CONTROLLED_BY_POLICY = android.app.admin.DevicePolicyManager.NEARBY_STREAMING_NOT_CONTROLLED_BY_POLICY;
    public static final int NEARBY_STREAMING_SAME_MANAGED_ACCOUNT_ONLY = android.app.admin.DevicePolicyManager.NEARBY_STREAMING_SAME_MANAGED_ACCOUNT_ONLY;
    public static final int OPERATION_SAFETY_REASON_DRIVING_DISTRACTION = android.app.admin.DevicePolicyManager.OPERATION_SAFETY_REASON_DRIVING_DISTRACTION;
    public static final int PASSWORD_COMPLEXITY_HIGH = android.app.admin.DevicePolicyManager.PASSWORD_COMPLEXITY_HIGH;
    public static final int PASSWORD_COMPLEXITY_LOW = android.app.admin.DevicePolicyManager.PASSWORD_COMPLEXITY_LOW;
    public static final int PASSWORD_COMPLEXITY_MEDIUM = android.app.admin.DevicePolicyManager.PASSWORD_COMPLEXITY_MEDIUM;
    public static final int PASSWORD_COMPLEXITY_NONE = android.app.admin.DevicePolicyManager.PASSWORD_COMPLEXITY_NONE;
    public static final int PASSWORD_QUALITY_ALPHABETIC = android.app.admin.DevicePolicyManager.PASSWORD_QUALITY_ALPHABETIC;
    public static final int PASSWORD_QUALITY_ALPHANUMERIC = android.app.admin.DevicePolicyManager.PASSWORD_QUALITY_ALPHANUMERIC;
    public static final int PASSWORD_QUALITY_BIOMETRIC_WEAK = android.app.admin.DevicePolicyManager.PASSWORD_QUALITY_BIOMETRIC_WEAK;
    public static final int PASSWORD_QUALITY_COMPLEX = android.app.admin.DevicePolicyManager.PASSWORD_QUALITY_COMPLEX;
    public static final int PASSWORD_QUALITY_NUMERIC = android.app.admin.DevicePolicyManager.PASSWORD_QUALITY_NUMERIC;
    public static final int PASSWORD_QUALITY_NUMERIC_COMPLEX = android.app.admin.DevicePolicyManager.PASSWORD_QUALITY_NUMERIC_COMPLEX;
    public static final int PASSWORD_QUALITY_SOMETHING = android.app.admin.DevicePolicyManager.PASSWORD_QUALITY_SOMETHING;
    public static final int PASSWORD_QUALITY_UNSPECIFIED = android.app.admin.DevicePolicyManager.PASSWORD_QUALITY_UNSPECIFIED;
    public static final int PERMISSION_GRANT_STATE_DEFAULT = android.app.admin.DevicePolicyManager.PERMISSION_GRANT_STATE_DEFAULT;
    public static final int PERMISSION_GRANT_STATE_DENIED = android.app.admin.DevicePolicyManager.PERMISSION_GRANT_STATE_DENIED;
    public static final int PERMISSION_GRANT_STATE_GRANTED = android.app.admin.DevicePolicyManager.PERMISSION_GRANT_STATE_GRANTED;
    public static final int PERMISSION_POLICY_AUTO_DENY = android.app.admin.DevicePolicyManager.PERMISSION_POLICY_AUTO_DENY;
    public static final int PERMISSION_POLICY_AUTO_GRANT = android.app.admin.DevicePolicyManager.PERMISSION_POLICY_AUTO_GRANT;
    public static final int PERMISSION_POLICY_PROMPT = android.app.admin.DevicePolicyManager.PERMISSION_POLICY_PROMPT;
    public static final int PERSONAL_APPS_NOT_SUSPENDED = android.app.admin.DevicePolicyManager.PERSONAL_APPS_NOT_SUSPENDED;
    public static final int PERSONAL_APPS_SUSPENDED_EXPLICITLY = android.app.admin.DevicePolicyManager.PERSONAL_APPS_SUSPENDED_EXPLICITLY;
    public static final java.lang.String POLICY_DISABLE_CAMERA = android.app.admin.DevicePolicyManager.POLICY_DISABLE_CAMERA;
    public static final java.lang.String POLICY_DISABLE_SCREEN_CAPTURE = android.app.admin.DevicePolicyManager.POLICY_DISABLE_SCREEN_CAPTURE;
    public static final int PRIVATE_DNS_MODE_OFF = android.app.admin.DevicePolicyManager.PRIVATE_DNS_MODE_OFF;
    public static final int PRIVATE_DNS_MODE_OPPORTUNISTIC = android.app.admin.DevicePolicyManager.PRIVATE_DNS_MODE_OPPORTUNISTIC;
    public static final int PRIVATE_DNS_MODE_PROVIDER_HOSTNAME = android.app.admin.DevicePolicyManager.PRIVATE_DNS_MODE_PROVIDER_HOSTNAME;
    public static final int PRIVATE_DNS_MODE_UNKNOWN = android.app.admin.DevicePolicyManager.PRIVATE_DNS_MODE_UNKNOWN;
    public static final int PRIVATE_DNS_SET_ERROR_FAILURE_SETTING = android.app.admin.DevicePolicyManager.PRIVATE_DNS_SET_ERROR_FAILURE_SETTING;
    public static final int PRIVATE_DNS_SET_ERROR_HOST_NOT_SERVING = android.app.admin.DevicePolicyManager.PRIVATE_DNS_SET_ERROR_HOST_NOT_SERVING;
    public static final int PRIVATE_DNS_SET_NO_ERROR = android.app.admin.DevicePolicyManager.PRIVATE_DNS_SET_NO_ERROR;
    public static final int PROVISIONING_MODE_FULLY_MANAGED_DEVICE = android.app.admin.DevicePolicyManager.PROVISIONING_MODE_FULLY_MANAGED_DEVICE;
    public static final int RESET_PASSWORD_DO_NOT_ASK_CREDENTIALS_ON_BOOT = android.app.admin.DevicePolicyManager.RESET_PASSWORD_DO_NOT_ASK_CREDENTIALS_ON_BOOT;
    public static final int RESET_PASSWORD_REQUIRE_ENTRY = android.app.admin.DevicePolicyManager.RESET_PASSWORD_REQUIRE_ENTRY;
    public static final int SKIP_SETUP_WIZARD = android.app.admin.DevicePolicyManager.SKIP_SETUP_WIZARD;
    public static final int WIFI_SECURITY_ENTERPRISE_192 = android.app.admin.DevicePolicyManager.WIFI_SECURITY_ENTERPRISE_192;
    public static final int WIFI_SECURITY_ENTERPRISE_EAP = android.app.admin.DevicePolicyManager.WIFI_SECURITY_ENTERPRISE_EAP;
    public static final int WIFI_SECURITY_OPEN = android.app.admin.DevicePolicyManager.WIFI_SECURITY_OPEN;
    public static final int WIFI_SECURITY_PERSONAL = android.app.admin.DevicePolicyManager.WIFI_SECURITY_PERSONAL;
    public static final int WIPE_EUICC = android.app.admin.DevicePolicyManager.WIPE_EUICC;
    public static final int WIPE_EXTERNAL_STORAGE = android.app.admin.DevicePolicyManager.WIPE_EXTERNAL_STORAGE;
    public static final int WIPE_RESET_PROTECTION_DATA = android.app.admin.DevicePolicyManager.WIPE_RESET_PROTECTION_DATA;
    public static final int WIPE_SILENTLY = android.app.admin.DevicePolicyManager.WIPE_SILENTLY;

    public static final class InstallSystemUpdateCallback {
        private final android.app.admin.DevicePolicyManager.InstallSystemUpdateCallback real;

        public InstallSystemUpdateCallback(android.app.admin.DevicePolicyManager.InstallSystemUpdateCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.admin.DevicePolicyManager.InstallSystemUpdateCallback wrap(android.app.admin.DevicePolicyManager.InstallSystemUpdateCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.DevicePolicyManager.InstallSystemUpdateCallback(real);
        }

        public android.app.admin.DevicePolicyManager.InstallSystemUpdateCallback unwrap() {
            return real;
        }

        public void onInstallUpdateError(int arg0, java.lang.String arg1) {
            real.onInstallUpdateError(arg0, arg1);
        }

        public static final int UPDATE_ERROR_BATTERY_LOW = android.app.admin.DevicePolicyManager.InstallSystemUpdateCallback.UPDATE_ERROR_BATTERY_LOW;
        public static final int UPDATE_ERROR_INCORRECT_OS_VERSION = android.app.admin.DevicePolicyManager.InstallSystemUpdateCallback.UPDATE_ERROR_INCORRECT_OS_VERSION;
        public static final int UPDATE_ERROR_UNKNOWN = android.app.admin.DevicePolicyManager.InstallSystemUpdateCallback.UPDATE_ERROR_UNKNOWN;

    }
    public static final class OnClearApplicationUserDataListener {
        private final android.app.admin.DevicePolicyManager.OnClearApplicationUserDataListener real;

        public OnClearApplicationUserDataListener(android.app.admin.DevicePolicyManager.OnClearApplicationUserDataListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.app.admin.DevicePolicyManager.OnClearApplicationUserDataListener wrap(android.app.admin.DevicePolicyManager.OnClearApplicationUserDataListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.app.admin.DevicePolicyManager.OnClearApplicationUserDataListener(real);
        }

        public android.app.admin.DevicePolicyManager.OnClearApplicationUserDataListener unwrap() {
            return real;
        }

        public void onApplicationUserDataCleared(java.lang.String arg0, boolean arg1) {
            real.onApplicationUserDataCleared(arg0, arg1);
        }

    }
}
