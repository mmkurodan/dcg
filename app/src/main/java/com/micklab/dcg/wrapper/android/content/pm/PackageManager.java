// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.pm;

public final class PackageManager {
    private final android.content.pm.PackageManager real;

    public PackageManager(android.content.pm.PackageManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.pm.PackageManager wrap(android.content.pm.PackageManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.PackageManager(real);
    }

    public android.content.pm.PackageManager unwrap() {
        return real;
    }

    public void addPackageToPreferred(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#addPackageToPreferred(java.lang.String)");
    }

    public boolean addPermission(com.micklab.dcg.wrapper.android.content.pm.PermissionInfo arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#addPermission(android.content.pm.PermissionInfo)");
    }

    public boolean addPermissionAsync(com.micklab.dcg.wrapper.android.content.pm.PermissionInfo arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#addPermissionAsync(android.content.pm.PermissionInfo)");
    }

    public void addPreferredActivity(com.micklab.dcg.wrapper.android.content.IntentFilter arg0, int arg1, android.content.ComponentName[] arg2, com.micklab.dcg.wrapper.android.content.ComponentName arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#addPreferredActivity(android.content.IntentFilter,int,[Landroid.content.ComponentName;,android.content.ComponentName)");
    }

    public boolean addWhitelistedRestrictedPermission(java.lang.String arg0, java.lang.String arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#addWhitelistedRestrictedPermission(java.lang.String,java.lang.String,int)");
    }

    public boolean canPackageQuery(java.lang.String arg0, java.lang.String arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#canPackageQuery(java.lang.String,java.lang.String)");
    }

    public boolean[] canPackageQuery(java.lang.String arg0, java.lang.String[] arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#canPackageQuery(java.lang.String,[Ljava.lang.String;)");
    }

    public boolean canRequestPackageInstalls() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#canRequestPackageInstalls()");
    }

    public java.lang.String[] canonicalToCurrentPackageNames(java.lang.String[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#canonicalToCurrentPackageNames([Ljava.lang.String;)");
    }

    public int checkPermission(java.lang.String arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#checkPermission(java.lang.String,java.lang.String)");
    }

    public int checkSignatures(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#checkSignatures(int,int)");
    }

    public int checkSignatures(java.lang.String arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#checkSignatures(java.lang.String,java.lang.String)");
    }

    public void clearInstantAppCookie() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#clearInstantAppCookie()");
    }

    public void clearPackagePreferredActivities(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#clearPackagePreferredActivities(java.lang.String)");
    }

    public java.lang.String[] currentToCanonicalPackageNames(java.lang.String[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#currentToCanonicalPackageNames([Ljava.lang.String;)");
    }

    public void extendVerificationTimeout(int arg0, int arg1, long arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#extendVerificationTimeout(int,int,long)");
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getActivityBanner(com.micklab.dcg.wrapper.android.content.Intent arg0) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getActivityBanner(android.content.Intent)");
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getActivityBanner(com.micklab.dcg.wrapper.android.content.ComponentName arg0) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getActivityBanner(android.content.ComponentName)");
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getActivityIcon(com.micklab.dcg.wrapper.android.content.Intent arg0) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getActivityIcon(android.content.Intent)");
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getActivityIcon(com.micklab.dcg.wrapper.android.content.ComponentName arg0) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getActivityIcon(android.content.ComponentName)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.ActivityInfo getActivityInfo(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getActivityInfo(android.content.ComponentName,int)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.ActivityInfo getActivityInfo(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.content.pm.PackageManager.ComponentInfoFlags arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getActivityInfo(android.content.ComponentName,android.content.pm.PackageManager$ComponentInfoFlags)");
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getActivityLogo(com.micklab.dcg.wrapper.android.content.ComponentName arg0) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getActivityLogo(android.content.ComponentName)");
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getActivityLogo(com.micklab.dcg.wrapper.android.content.Intent arg0) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getActivityLogo(android.content.Intent)");
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getApplicationBanner(java.lang.String arg0) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getApplicationBanner(java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getApplicationBanner(com.micklab.dcg.wrapper.android.content.pm.ApplicationInfo arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getApplicationBanner(android.content.pm.ApplicationInfo)");
    }

    public int getApplicationEnabledSetting(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getApplicationEnabledSetting(java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getApplicationIcon(com.micklab.dcg.wrapper.android.content.pm.ApplicationInfo arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getApplicationIcon(android.content.pm.ApplicationInfo)");
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getApplicationIcon(java.lang.String arg0) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getApplicationIcon(java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.pm.PackageManager.ApplicationInfoFlags arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getApplicationInfo(java.lang.String,android.content.pm.PackageManager$ApplicationInfoFlags)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String arg0, int arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getApplicationInfo(java.lang.String,int)");
    }

    public java.lang.CharSequence getApplicationLabel(com.micklab.dcg.wrapper.android.content.pm.ApplicationInfo arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getApplicationLabel(android.content.pm.ApplicationInfo)");
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getApplicationLogo(com.micklab.dcg.wrapper.android.content.pm.ApplicationInfo arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getApplicationLogo(android.content.pm.ApplicationInfo)");
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getApplicationLogo(java.lang.String arg0) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getApplicationLogo(java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.ArchivedPackageInfo getArchivedPackage(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getArchivedPackage(java.lang.String)");
    }

    public java.lang.CharSequence getBackgroundPermissionOptionLabel() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getBackgroundPermissionOptionLabel()");
    }

    public com.micklab.dcg.wrapper.android.content.pm.ChangedPackages getChangedPackages(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getChangedPackages(int)");
    }

    public int getComponentEnabledSetting(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getComponentEnabledSetting(android.content.ComponentName)");
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDefaultActivityIcon() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getDefaultActivityIcon()");
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDrawable(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.content.pm.ApplicationInfo arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getDrawable(java.lang.String,int,android.content.pm.ApplicationInfo)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.InstallSourceInfo getInstallSourceInfo(java.lang.String arg0) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getInstallSourceInfo(java.lang.String)");
    }

    public java.lang.String getInstallerPackageName(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getInstallerPackageName(java.lang.String)");
    }

    public byte[] getInstantAppCookie() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getInstantAppCookie()");
    }

    public int getInstantAppCookieMaxBytes() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getInstantAppCookieMaxBytes()");
    }

    public com.micklab.dcg.wrapper.android.content.pm.InstrumentationInfo getInstrumentationInfo(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getInstrumentationInfo(android.content.ComponentName,int)");
    }

    public com.micklab.dcg.wrapper.android.content.Intent getLaunchIntentForPackage(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getLaunchIntentForPackage(java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.content.IntentSender getLaunchIntentSenderForPackage(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getLaunchIntentSenderForPackage(java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.content.Intent getLeanbackLaunchIntentForPackage(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getLeanbackLaunchIntentForPackage(java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.ModuleInfo getModuleInfo(java.lang.String arg0, int arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getModuleInfo(java.lang.String,int)");
    }

    public java.lang.String getNameForUid(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getNameForUid(int)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.PackageInfo getPackageArchiveInfo(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.pm.PackageManager.PackageInfoFlags arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getPackageArchiveInfo(java.lang.String,android.content.pm.PackageManager$PackageInfoFlags)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.PackageInfo getPackageArchiveInfo(java.lang.String arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getPackageArchiveInfo(java.lang.String,int)");
    }

    public int[] getPackageGids(java.lang.String arg0) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getPackageGids(java.lang.String)");
    }

    public int[] getPackageGids(java.lang.String arg0, int arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getPackageGids(java.lang.String,int)");
    }

    public int[] getPackageGids(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.pm.PackageManager.PackageInfoFlags arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getPackageGids(java.lang.String,android.content.pm.PackageManager$PackageInfoFlags)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.PackageInfo getPackageInfo(java.lang.String arg0, int arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getPackageInfo(java.lang.String,int)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.PackageInfo getPackageInfo(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.pm.PackageManager.PackageInfoFlags arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getPackageInfo(java.lang.String,android.content.pm.PackageManager$PackageInfoFlags)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.PackageInfo getPackageInfo(com.micklab.dcg.wrapper.android.content.pm.VersionedPackage arg0, int arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getPackageInfo(android.content.pm.VersionedPackage,int)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.PackageInfo getPackageInfo(com.micklab.dcg.wrapper.android.content.pm.VersionedPackage arg0, com.micklab.dcg.wrapper.android.content.pm.PackageManager.PackageInfoFlags arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getPackageInfo(android.content.pm.VersionedPackage,android.content.pm.PackageManager$PackageInfoFlags)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.PackageInstaller getPackageInstaller() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getPackageInstaller()");
    }

    public int getPackageUid(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.pm.PackageManager.PackageInfoFlags arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getPackageUid(java.lang.String,android.content.pm.PackageManager$PackageInfoFlags)");
    }

    public int getPackageUid(java.lang.String arg0, int arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getPackageUid(java.lang.String,int)");
    }

    public java.lang.String[] getPackagesForUid(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getPackagesForUid(int)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String arg0, int arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getPermissionGroupInfo(java.lang.String,int)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.PermissionInfo getPermissionInfo(java.lang.String arg0, int arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getPermissionInfo(java.lang.String,int)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.PackageManager.Property getProperty(java.lang.String arg0, java.lang.String arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getProperty(java.lang.String,java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.PackageManager.Property getProperty(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getProperty(java.lang.String,android.content.ComponentName)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.ProviderInfo getProviderInfo(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.content.pm.PackageManager.ComponentInfoFlags arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getProviderInfo(android.content.ComponentName,android.content.pm.PackageManager$ComponentInfoFlags)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.ProviderInfo getProviderInfo(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getProviderInfo(android.content.ComponentName,int)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.ActivityInfo getReceiverInfo(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getReceiverInfo(android.content.ComponentName,int)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.ActivityInfo getReceiverInfo(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.content.pm.PackageManager.ComponentInfoFlags arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getReceiverInfo(android.content.ComponentName,android.content.pm.PackageManager$ComponentInfoFlags)");
    }

    public com.micklab.dcg.wrapper.android.content.res.Resources getResourcesForActivity(com.micklab.dcg.wrapper.android.content.ComponentName arg0) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getResourcesForActivity(android.content.ComponentName)");
    }

    public com.micklab.dcg.wrapper.android.content.res.Resources getResourcesForApplication(com.micklab.dcg.wrapper.android.content.pm.ApplicationInfo arg0) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getResourcesForApplication(android.content.pm.ApplicationInfo)");
    }

    public com.micklab.dcg.wrapper.android.content.res.Resources getResourcesForApplication(java.lang.String arg0) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getResourcesForApplication(java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.content.res.Resources getResourcesForApplication(com.micklab.dcg.wrapper.android.content.pm.ApplicationInfo arg0, com.micklab.dcg.wrapper.android.content.res.Configuration arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getResourcesForApplication(android.content.pm.ApplicationInfo,android.content.res.Configuration)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.ServiceInfo getServiceInfo(com.micklab.dcg.wrapper.android.content.ComponentName arg0, com.micklab.dcg.wrapper.android.content.pm.PackageManager.ComponentInfoFlags arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getServiceInfo(android.content.ComponentName,android.content.pm.PackageManager$ComponentInfoFlags)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.ServiceInfo getServiceInfo(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getServiceInfo(android.content.ComponentName,int)");
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getSuspendedPackageAppExtras() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getSuspendedPackageAppExtras()");
    }

    public boolean getSyntheticAppDetailsActivityEnabled(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getSyntheticAppDetailsActivityEnabled(java.lang.String)");
    }

    public android.content.pm.FeatureInfo[] getSystemAvailableFeatures() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getSystemAvailableFeatures()");
    }

    public java.lang.String[] getSystemSharedLibraryNames() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getSystemSharedLibraryNames()");
    }

    public int getTargetSdkVersion(java.lang.String arg0) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getTargetSdkVersion(java.lang.String)");
    }

    public java.lang.CharSequence getText(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.content.pm.ApplicationInfo arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getText(java.lang.String,int,android.content.pm.ApplicationInfo)");
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getUserBadgedDrawableForDensity(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2, int arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getUserBadgedDrawableForDensity(android.graphics.drawable.Drawable,android.os.UserHandle,android.graphics.Rect,int)");
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getUserBadgedIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getUserBadgedIcon(android.graphics.drawable.Drawable,android.os.UserHandle)");
    }

    public java.lang.CharSequence getUserBadgedLabel(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getUserBadgedLabel(java.lang.CharSequence,android.os.UserHandle)");
    }

    public com.micklab.dcg.wrapper.android.content.res.XmlResourceParser getXml(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.content.pm.ApplicationInfo arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#getXml(java.lang.String,int,android.content.pm.ApplicationInfo)");
    }

    public boolean hasSigningCertificate(java.lang.String arg0, byte[] arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#hasSigningCertificate(java.lang.String,[B,int)");
    }

    public boolean hasSigningCertificate(int arg0, byte[] arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#hasSigningCertificate(int,[B,int)");
    }

    public boolean hasSystemFeature(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#hasSystemFeature(java.lang.String)");
    }

    public boolean hasSystemFeature(java.lang.String arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#hasSystemFeature(java.lang.String,int)");
    }

    public boolean isAppArchivable(java.lang.String arg0) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#isAppArchivable(java.lang.String)");
    }

    public boolean isAutoRevokeWhitelisted() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#isAutoRevokeWhitelisted()");
    }

    public boolean isAutoRevokeWhitelisted(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#isAutoRevokeWhitelisted(java.lang.String)");
    }

    public boolean isDefaultApplicationIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#isDefaultApplicationIcon(android.graphics.drawable.Drawable)");
    }

    public boolean isDeviceUpgrading() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#isDeviceUpgrading()");
    }

    public boolean isInstantApp() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#isInstantApp()");
    }

    public boolean isInstantApp(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#isInstantApp(java.lang.String)");
    }

    public boolean isPackageStopped(java.lang.String arg0) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#isPackageStopped(java.lang.String)");
    }

    public boolean isPackageSuspended() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#isPackageSuspended()");
    }

    public boolean isPackageSuspended(java.lang.String arg0) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#isPackageSuspended(java.lang.String)");
    }

    public boolean isPermissionRevokedByPolicy(java.lang.String arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#isPermissionRevokedByPolicy(java.lang.String,java.lang.String)");
    }

    public boolean isSafeMode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#isSafeMode()");
    }

    public void relinquishUpdateOwnership(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#relinquishUpdateOwnership(java.lang.String)");
    }

    public void removePackageFromPreferred(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#removePackageFromPreferred(java.lang.String)");
    }

    public void removePermission(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#removePermission(java.lang.String)");
    }

    public boolean removeWhitelistedRestrictedPermission(java.lang.String arg0, java.lang.String arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#removeWhitelistedRestrictedPermission(java.lang.String,java.lang.String,int)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.ResolveInfo resolveActivity(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#resolveActivity(android.content.Intent,int)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.ResolveInfo resolveActivity(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.pm.PackageManager.ResolveInfoFlags arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#resolveActivity(android.content.Intent,android.content.pm.PackageManager$ResolveInfoFlags)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.ProviderInfo resolveContentProvider(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.pm.PackageManager.ComponentInfoFlags arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#resolveContentProvider(java.lang.String,android.content.pm.PackageManager$ComponentInfoFlags)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.ProviderInfo resolveContentProvider(java.lang.String arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#resolveContentProvider(java.lang.String,int)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.ResolveInfo resolveService(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.pm.PackageManager.ResolveInfoFlags arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#resolveService(android.content.Intent,android.content.pm.PackageManager$ResolveInfoFlags)");
    }

    public com.micklab.dcg.wrapper.android.content.pm.ResolveInfo resolveService(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#resolveService(android.content.Intent,int)");
    }

    public void setApplicationCategoryHint(java.lang.String arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#setApplicationCategoryHint(java.lang.String,int)");
    }

    public void setApplicationEnabledSetting(java.lang.String arg0, int arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#setApplicationEnabledSetting(java.lang.String,int,int)");
    }

    public boolean setAutoRevokeWhitelisted(java.lang.String arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#setAutoRevokeWhitelisted(java.lang.String,boolean)");
    }

    public void setComponentEnabledSetting(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#setComponentEnabledSetting(android.content.ComponentName,int,int)");
    }

    public void setInstallerPackageName(java.lang.String arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#setInstallerPackageName(java.lang.String,java.lang.String)");
    }

    public void updateInstantAppCookie(byte[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#updateInstantAppCookie([B)");
    }

    public void verifyPendingInstall(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager#verifyPendingInstall(int,int)");
    }


    public static final class ApplicationInfoFlags {
        private final android.content.pm.PackageManager.ApplicationInfoFlags real;

        public ApplicationInfoFlags(android.content.pm.PackageManager.ApplicationInfoFlags real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.pm.PackageManager.ApplicationInfoFlags wrap(android.content.pm.PackageManager.ApplicationInfoFlags real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.PackageManager.ApplicationInfoFlags(real);
        }

        public android.content.pm.PackageManager.ApplicationInfoFlags unwrap() {
            return real;
        }

        public long getValue() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$ApplicationInfoFlags#getValue()");
        }

        public static com.micklab.dcg.wrapper.android.content.pm.PackageManager.ApplicationInfoFlags of(long arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$ApplicationInfoFlags#of(long)");
        }

    }
    public static final class ComponentEnabledSetting {
        private final android.content.pm.PackageManager.ComponentEnabledSetting real;

        public ComponentEnabledSetting(android.content.pm.PackageManager.ComponentEnabledSetting real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.pm.PackageManager.ComponentEnabledSetting wrap(android.content.pm.PackageManager.ComponentEnabledSetting real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.PackageManager.ComponentEnabledSetting(real);
        }

        public android.content.pm.PackageManager.ComponentEnabledSetting unwrap() {
            return real;
        }

        public ComponentEnabledSetting(com.micklab.dcg.wrapper.android.content.ComponentName arg0, int arg1, int arg2) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$ComponentEnabledSetting#android.content.pm.PackageManager$ComponentEnabledSetting(android.content.ComponentName,int,int)");
        }

        public int describeContents() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$ComponentEnabledSetting#describeContents()");
        }

        public com.micklab.dcg.wrapper.android.content.ComponentName getComponentName() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$ComponentEnabledSetting#getComponentName()");
        }

        public int getEnabledFlags() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$ComponentEnabledSetting#getEnabledFlags()");
        }

        public int getEnabledState() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$ComponentEnabledSetting#getEnabledState()");
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$ComponentEnabledSetting#writeToParcel(android.os.Parcel,int)");
        }


    }
    public static final class ComponentInfoFlags {
        private final android.content.pm.PackageManager.ComponentInfoFlags real;

        public ComponentInfoFlags(android.content.pm.PackageManager.ComponentInfoFlags real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.pm.PackageManager.ComponentInfoFlags wrap(android.content.pm.PackageManager.ComponentInfoFlags real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.PackageManager.ComponentInfoFlags(real);
        }

        public android.content.pm.PackageManager.ComponentInfoFlags unwrap() {
            return real;
        }

        public long getValue() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$ComponentInfoFlags#getValue()");
        }

        public static com.micklab.dcg.wrapper.android.content.pm.PackageManager.ComponentInfoFlags of(long arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$ComponentInfoFlags#of(long)");
        }

    }
    public static final class NameNotFoundException {
        private final android.content.pm.PackageManager.NameNotFoundException real;

        public NameNotFoundException(android.content.pm.PackageManager.NameNotFoundException real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.pm.PackageManager.NameNotFoundException wrap(android.content.pm.PackageManager.NameNotFoundException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.PackageManager.NameNotFoundException(real);
        }

        public android.content.pm.PackageManager.NameNotFoundException unwrap() {
            return real;
        }

        public NameNotFoundException() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$NameNotFoundException#android.content.pm.PackageManager$NameNotFoundException()");
        }

        public NameNotFoundException(java.lang.String arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$NameNotFoundException#android.content.pm.PackageManager$NameNotFoundException(java.lang.String)");
        }

    }
    public static final class OnChecksumsReadyListener {
        private final android.content.pm.PackageManager.OnChecksumsReadyListener real;

        public OnChecksumsReadyListener(android.content.pm.PackageManager.OnChecksumsReadyListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.pm.PackageManager.OnChecksumsReadyListener wrap(android.content.pm.PackageManager.OnChecksumsReadyListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.PackageManager.OnChecksumsReadyListener(real);
        }

        public android.content.pm.PackageManager.OnChecksumsReadyListener unwrap() {
            return real;
        }

    }
    public static final class PackageInfoFlags {
        private final android.content.pm.PackageManager.PackageInfoFlags real;

        public PackageInfoFlags(android.content.pm.PackageManager.PackageInfoFlags real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.pm.PackageManager.PackageInfoFlags wrap(android.content.pm.PackageManager.PackageInfoFlags real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.PackageManager.PackageInfoFlags(real);
        }

        public android.content.pm.PackageManager.PackageInfoFlags unwrap() {
            return real;
        }

        public long getValue() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$PackageInfoFlags#getValue()");
        }

        public static com.micklab.dcg.wrapper.android.content.pm.PackageManager.PackageInfoFlags of(long arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$PackageInfoFlags#of(long)");
        }

    }
    public static final class Property {
        private final android.content.pm.PackageManager.Property real;

        public Property(android.content.pm.PackageManager.Property real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.pm.PackageManager.Property wrap(android.content.pm.PackageManager.Property real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.PackageManager.Property(real);
        }

        public android.content.pm.PackageManager.Property unwrap() {
            return real;
        }

        public int describeContents() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$Property#describeContents()");
        }

        public boolean getBoolean() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$Property#getBoolean()");
        }

        public java.lang.String getClassName() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$Property#getClassName()");
        }

        public float getFloat() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$Property#getFloat()");
        }

        public int getInteger() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$Property#getInteger()");
        }

        public java.lang.String getName() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$Property#getName()");
        }

        public java.lang.String getPackageName() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$Property#getPackageName()");
        }

        public int getResourceId() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$Property#getResourceId()");
        }

        public java.lang.String getString() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$Property#getString()");
        }

        public boolean isBoolean() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$Property#isBoolean()");
        }

        public boolean isFloat() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$Property#isFloat()");
        }

        public boolean isInteger() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$Property#isInteger()");
        }

        public boolean isResourceId() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$Property#isResourceId()");
        }

        public boolean isString() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$Property#isString()");
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$Property#writeToParcel(android.os.Parcel,int)");
        }


    }
    public static final class ResolveInfoFlags {
        private final android.content.pm.PackageManager.ResolveInfoFlags real;

        public ResolveInfoFlags(android.content.pm.PackageManager.ResolveInfoFlags real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.pm.PackageManager.ResolveInfoFlags wrap(android.content.pm.PackageManager.ResolveInfoFlags real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.pm.PackageManager.ResolveInfoFlags(real);
        }

        public android.content.pm.PackageManager.ResolveInfoFlags unwrap() {
            return real;
        }

        public long getValue() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$ResolveInfoFlags#getValue()");
        }

        public static com.micklab.dcg.wrapper.android.content.pm.PackageManager.ResolveInfoFlags of(long arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.pm.PackageManager$ResolveInfoFlags#of(long)");
        }

    }
}
