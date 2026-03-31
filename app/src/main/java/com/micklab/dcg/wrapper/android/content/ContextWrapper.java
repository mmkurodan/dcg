// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ContextWrapper {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ContextWrapper(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ContextWrapper wrap(android.content.ContextWrapper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ContextWrapper(real, (__DcgwBridgeToken) null);
    }

    public android.content.ContextWrapper getReal() {
        return (android.content.ContextWrapper) real;
    }

    public android.content.ContextWrapper unwrap() {
        return getReal();
    }

    public ContextWrapper(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.content.ContextWrapper(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public boolean bindIsolatedService(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1, java.lang.String arg2, java.util.concurrent.Executor arg3, com.micklab.dcg.wrapper.android.content.ServiceConnection arg4) {
        return ((android.content.ContextWrapper) real).bindIsolatedService(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public boolean bindService(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.ServiceConnection arg1, com.micklab.dcg.wrapper.android.content.Context.BindServiceFlags arg2) {
        return ((android.content.ContextWrapper) real).bindService(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public boolean bindService(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.ServiceConnection arg1, int arg2) {
        return ((android.content.ContextWrapper) real).bindService(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public boolean bindService(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.Context.BindServiceFlags arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.content.ServiceConnection arg3) {
        return ((android.content.ContextWrapper) real).bindService(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public boolean bindService(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.content.ServiceConnection arg3) {
        return ((android.content.ContextWrapper) real).bindService(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public boolean bindServiceAsUser(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.ServiceConnection arg1, com.micklab.dcg.wrapper.android.content.Context.BindServiceFlags arg2, com.micklab.dcg.wrapper.android.os.UserHandle arg3) {
        return ((android.content.ContextWrapper) real).bindServiceAsUser(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public boolean bindServiceAsUser(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.ServiceConnection arg1, int arg2, com.micklab.dcg.wrapper.android.os.UserHandle arg3) {
        return ((android.content.ContextWrapper) real).bindServiceAsUser(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public int checkCallingOrSelfPermission(java.lang.String arg0) {
        return ((android.content.ContextWrapper) real).checkCallingOrSelfPermission(arg0);
    }

    public int checkCallingOrSelfUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1) {
        return ((android.content.ContextWrapper) real).checkCallingOrSelfUriPermission(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public int checkCallingPermission(java.lang.String arg0) {
        return ((android.content.ContextWrapper) real).checkCallingPermission(arg0);
    }

    public int checkCallingUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1) {
        return ((android.content.ContextWrapper) real).checkCallingUriPermission(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public int checkContentUriPermissionFull(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1, int arg2, int arg3) {
        return ((android.content.ContextWrapper) real).checkContentUriPermissionFull(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public int checkPermission(java.lang.String arg0, int arg1, int arg2) {
        return ((android.content.ContextWrapper) real).checkPermission(arg0, arg1, arg2);
    }

    public int checkSelfPermission(java.lang.String arg0) {
        return ((android.content.ContextWrapper) real).checkSelfPermission(arg0);
    }

    public int checkUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1, int arg2, int arg3) {
        return ((android.content.ContextWrapper) real).checkUriPermission(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public int checkUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, java.lang.String arg2, int arg3, int arg4, int arg5) {
        return ((android.content.ContextWrapper) real).checkUriPermission(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5);
    }

    public void clearWallpaper() throws java.io.IOException {
        ((android.content.ContextWrapper) real).clearWallpaper();
    }

    public com.micklab.dcg.wrapper.android.content.Context createAttributionContext(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.ContextWrapper) real).createAttributionContext(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.Context createConfigurationContext(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.ContextWrapper) real).createConfigurationContext(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.content.Context createContext(com.micklab.dcg.wrapper.android.content.ContextParams arg0) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.ContextWrapper) real).createContext(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.content.Context createContextForSplit(java.lang.String arg0) throws android.content.pm.PackageManager.NameNotFoundException {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.ContextWrapper) real).createContextForSplit(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.Context createDeviceContext(int arg0) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.ContextWrapper) real).createDeviceContext(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.Context createDeviceProtectedStorageContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.ContextWrapper) real).createDeviceProtectedStorageContext());
    }

    public com.micklab.dcg.wrapper.android.content.Context createDisplayContext(com.micklab.dcg.wrapper.android.view.Display arg0) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.ContextWrapper) real).createDisplayContext(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.content.Context createPackageContext(java.lang.String arg0, int arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.ContextWrapper) real).createPackageContext(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Context createWindowContext(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.ContextWrapper) real).createWindowContext(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.content.Context createWindowContext(com.micklab.dcg.wrapper.android.view.Display arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.ContextWrapper) real).createWindowContext(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()));
    }

    public java.lang.String[] databaseList() {
        return ((android.content.ContextWrapper) real).databaseList();
    }

    public boolean deleteDatabase(java.lang.String arg0) {
        return ((android.content.ContextWrapper) real).deleteDatabase(arg0);
    }

    public boolean deleteFile(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContextWrapper#deleteFile(java.lang.String)");
    }

    public boolean deleteSharedPreferences(java.lang.String arg0) {
        return ((android.content.ContextWrapper) real).deleteSharedPreferences(arg0);
    }

    public void enforceCallingOrSelfPermission(java.lang.String arg0, java.lang.String arg1) {
        ((android.content.ContextWrapper) real).enforceCallingOrSelfPermission(arg0, arg1);
    }

    public void enforceCallingOrSelfUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1, java.lang.String arg2) {
        ((android.content.ContextWrapper) real).enforceCallingOrSelfUriPermission(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void enforceCallingPermission(java.lang.String arg0, java.lang.String arg1) {
        ((android.content.ContextWrapper) real).enforceCallingPermission(arg0, arg1);
    }

    public void enforceCallingUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1, java.lang.String arg2) {
        ((android.content.ContextWrapper) real).enforceCallingUriPermission(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void enforcePermission(java.lang.String arg0, int arg1, int arg2, java.lang.String arg3) {
        ((android.content.ContextWrapper) real).enforcePermission(arg0, arg1, arg2, arg3);
    }

    public void enforceUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1, int arg2, int arg3, java.lang.String arg4) {
        ((android.content.ContextWrapper) real).enforceUriPermission(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4);
    }

    public void enforceUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, java.lang.String arg2, int arg3, int arg4, int arg5, java.lang.String arg6) {
        ((android.content.ContextWrapper) real).enforceUriPermission(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public java.lang.String[] fileList() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContextWrapper#fileList()");
    }

    public com.micklab.dcg.wrapper.android.content.Context getApplicationContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.ContextWrapper) real).getApplicationContext());
    }

    public com.micklab.dcg.wrapper.android.content.pm.ApplicationInfo getApplicationInfo() {
        return com.micklab.dcg.wrapper.android.content.pm.ApplicationInfo.wrap(((android.content.ContextWrapper) real).getApplicationInfo());
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetManager getAssets() {
        return com.micklab.dcg.wrapper.android.content.res.AssetManager.wrap(((android.content.ContextWrapper) real).getAssets());
    }

    public com.micklab.dcg.wrapper.android.content.AttributionSource getAttributionSource() {
        return com.micklab.dcg.wrapper.android.content.AttributionSource.wrap(((android.content.ContextWrapper) real).getAttributionSource());
    }

    public java.lang.String getAttributionTag() {
        return ((android.content.ContextWrapper) real).getAttributionTag();
    }

    public com.micklab.dcg.wrapper.android.content.Context getBaseContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.ContextWrapper) real).getBaseContext());
    }

    public java.io.File getCacheDir() {
        return ((android.content.ContextWrapper) real).getCacheDir();
    }

    public java.lang.ClassLoader getClassLoader() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContextWrapper#getClassLoader()");
    }

    public java.io.File getCodeCacheDir() {
        return ((android.content.ContextWrapper) real).getCodeCacheDir();
    }

    public com.micklab.dcg.wrapper.android.content.ContentResolver getContentResolver() {
        return com.micklab.dcg.wrapper.android.content.ContentResolver.wrap(((android.content.ContextWrapper) real).getContentResolver());
    }

    public java.io.File getDataDir() {
        return ((android.content.ContextWrapper) real).getDataDir();
    }

    public java.io.File getDatabasePath(java.lang.String arg0) {
        return ((android.content.ContextWrapper) real).getDatabasePath(arg0);
    }

    public int getDeviceId() {
        return ((android.content.ContextWrapper) real).getDeviceId();
    }

    public java.io.File getDir(java.lang.String arg0, int arg1) {
        return ((android.content.ContextWrapper) real).getDir(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.Display getDisplay() {
        return com.micklab.dcg.wrapper.android.view.Display.wrap(((android.content.ContextWrapper) real).getDisplay());
    }

    public java.io.File getExternalCacheDir() {
        return ((android.content.ContextWrapper) real).getExternalCacheDir();
    }

    public java.io.File[] getExternalCacheDirs() {
        return ((android.content.ContextWrapper) real).getExternalCacheDirs();
    }

    public java.io.File getExternalFilesDir(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContextWrapper#getExternalFilesDir(java.lang.String)");
    }

    public java.io.File[] getExternalFilesDirs(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContextWrapper#getExternalFilesDirs(java.lang.String)");
    }

    public java.io.File[] getExternalMediaDirs() {
        return ((android.content.ContextWrapper) real).getExternalMediaDirs();
    }

    public java.io.File getFileStreamPath(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContextWrapper#getFileStreamPath(java.lang.String)");
    }

    public java.io.File getFilesDir() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContextWrapper#getFilesDir()");
    }

    public java.util.concurrent.Executor getMainExecutor() {
        return ((android.content.ContextWrapper) real).getMainExecutor();
    }

    public com.micklab.dcg.wrapper.android.os.Looper getMainLooper() {
        return com.micklab.dcg.wrapper.android.os.Looper.wrap(((android.content.ContextWrapper) real).getMainLooper());
    }

    public java.io.File getNoBackupFilesDir() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContextWrapper#getNoBackupFilesDir()");
    }

    public java.io.File getObbDir() {
        return ((android.content.ContextWrapper) real).getObbDir();
    }

    public java.io.File[] getObbDirs() {
        return ((android.content.ContextWrapper) real).getObbDirs();
    }

    public java.lang.String getOpPackageName() {
        return ((android.content.ContextWrapper) real).getOpPackageName();
    }

    public java.lang.String getPackageCodePath() {
        return ((android.content.ContextWrapper) real).getPackageCodePath();
    }

    public com.micklab.dcg.wrapper.android.content.pm.PackageManager getPackageManager() {
        return com.micklab.dcg.wrapper.android.content.pm.PackageManager.wrap(((android.content.ContextWrapper) real).getPackageManager());
    }

    public java.lang.String getPackageName() {
        return ((android.content.ContextWrapper) real).getPackageName();
    }

    public java.lang.String getPackageResourcePath() {
        return ((android.content.ContextWrapper) real).getPackageResourcePath();
    }

    public com.micklab.dcg.wrapper.android.content.ContextParams getParams() {
        return com.micklab.dcg.wrapper.android.content.ContextParams.wrap(((android.content.ContextWrapper) real).getParams());
    }

    public com.micklab.dcg.wrapper.android.content.res.Resources getResources() {
        return com.micklab.dcg.wrapper.android.content.res.Resources.wrap(((android.content.ContextWrapper) real).getResources());
    }

    public com.micklab.dcg.wrapper.android.content.SharedPreferences getSharedPreferences(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.content.SharedPreferences.wrap(((android.content.ContextWrapper) real).getSharedPreferences(arg0, arg1));
    }

    public java.lang.Object getSystemService(java.lang.String arg0) {
        return ((android.content.ContextWrapper) real).getSystemService(arg0);
    }

    public com.micklab.dcg.wrapper.android.content.res.Resources.Theme getTheme() {
        return com.micklab.dcg.wrapper.android.content.res.Resources.Theme.wrap(((android.content.ContextWrapper) real).getTheme());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getWallpaper() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.content.ContextWrapper) real).getWallpaper());
    }

    public int getWallpaperDesiredMinimumHeight() {
        return ((android.content.ContextWrapper) real).getWallpaperDesiredMinimumHeight();
    }

    public int getWallpaperDesiredMinimumWidth() {
        return ((android.content.ContextWrapper) real).getWallpaperDesiredMinimumWidth();
    }

    public void grantUriPermission(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, int arg2) {
        ((android.content.ContextWrapper) real).grantUriPermission(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public boolean isDeviceProtectedStorage() {
        return ((android.content.ContextWrapper) real).isDeviceProtectedStorage();
    }

    public boolean isRestricted() {
        return ((android.content.ContextWrapper) real).isRestricted();
    }

    public boolean isUiContext() {
        return ((android.content.ContextWrapper) real).isUiContext();
    }

    public boolean moveDatabaseFrom(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) {
        return ((android.content.ContextWrapper) real).moveDatabaseFrom(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean moveSharedPreferencesFrom(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) {
        return ((android.content.ContextWrapper) real).moveSharedPreferencesFrom(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public java.io.FileInputStream openFileInput(java.lang.String arg0) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContextWrapper#openFileInput(java.lang.String)");
    }

    public java.io.FileOutputStream openFileOutput(java.lang.String arg0, int arg1) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContextWrapper#openFileOutput(java.lang.String,int)");
    }

    public com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.CursorFactory arg2) {
        return com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.wrap(((android.content.ContextWrapper) real).openOrCreateDatabase(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.CursorFactory arg2, com.micklab.dcg.wrapper.android.database.DatabaseErrorHandler arg3) {
        return com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.wrap(((android.content.ContextWrapper) real).openOrCreateDatabase(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable peekWallpaper() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.content.ContextWrapper) real).peekWallpaper());
    }

    public void registerComponentCallbacks(com.micklab.dcg.wrapper.android.content.ComponentCallbacks arg0) {
        ((android.content.ContextWrapper) real).registerComponentCallbacks(arg0 == null ? null : arg0.getReal());
    }

    public void registerDeviceIdChangeListener(java.util.concurrent.Executor arg0, java.util.function.IntConsumer arg1) {
        ((android.content.ContextWrapper) real).registerDeviceIdChangeListener(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.content.Intent registerReceiver(com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg0, com.micklab.dcg.wrapper.android.content.IntentFilter arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.content.ContextWrapper) real).registerReceiver(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.content.Intent registerReceiver(com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg0, com.micklab.dcg.wrapper.android.content.IntentFilter arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.content.ContextWrapper) real).registerReceiver(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2));
    }

    public com.micklab.dcg.wrapper.android.content.Intent registerReceiver(com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg0, com.micklab.dcg.wrapper.android.content.IntentFilter arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Handler arg3) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.content.ContextWrapper) real).registerReceiver(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal()));
    }

    public com.micklab.dcg.wrapper.android.content.Intent registerReceiver(com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg0, com.micklab.dcg.wrapper.android.content.IntentFilter arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Handler arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.content.ContextWrapper) real).registerReceiver(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4));
    }

    public void removeStickyBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.content.ContextWrapper) real).removeStickyBroadcast(arg0 == null ? null : arg0.getReal());
    }

    public void removeStickyBroadcastAsUser(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1) {
        ((android.content.ContextWrapper) real).removeStickyBroadcastAsUser(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void revokeUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1) {
        ((android.content.ContextWrapper) real).revokeUriPermission(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void revokeUriPermission(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, int arg2) {
        ((android.content.ContextWrapper) real).revokeUriPermission(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void sendBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.content.ContextWrapper) real).sendBroadcast(arg0 == null ? null : arg0.getReal());
    }

    public void sendBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, java.lang.String arg1) {
        ((android.content.ContextWrapper) real).sendBroadcast(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void sendBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        ((android.content.ContextWrapper) real).sendBroadcast(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void sendBroadcastAsUser(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1) {
        ((android.content.ContextWrapper) real).sendBroadcastAsUser(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void sendBroadcastAsUser(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1, java.lang.String arg2) {
        ((android.content.ContextWrapper) real).sendBroadcastAsUser(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void sendOrderedBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, java.lang.String arg1) {
        ((android.content.ContextWrapper) real).sendOrderedBroadcast(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void sendOrderedBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        ((android.content.ContextWrapper) real).sendOrderedBroadcast(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void sendOrderedBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg2, com.micklab.dcg.wrapper.android.os.Handler arg3, int arg4, java.lang.String arg5, com.micklab.dcg.wrapper.android.os.Bundle arg6) {
        ((android.content.ContextWrapper) real).sendOrderedBroadcast(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6 == null ? null : arg6.getReal());
    }

    public void sendOrderedBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg3, com.micklab.dcg.wrapper.android.os.Handler arg4, int arg5, java.lang.String arg6, com.micklab.dcg.wrapper.android.os.Bundle arg7) {
        ((android.content.ContextWrapper) real).sendOrderedBroadcast(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5, arg6, arg7 == null ? null : arg7.getReal());
    }

    public void sendOrderedBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg3, com.micklab.dcg.wrapper.android.os.Handler arg4, int arg5, java.lang.String arg6, com.micklab.dcg.wrapper.android.os.Bundle arg7) {
        ((android.content.ContextWrapper) real).sendOrderedBroadcast(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5, arg6, arg7 == null ? null : arg7.getReal());
    }

    public void sendOrderedBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1, java.lang.String arg2, java.lang.String arg3, com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg4, com.micklab.dcg.wrapper.android.os.Handler arg5, java.lang.String arg6, com.micklab.dcg.wrapper.android.os.Bundle arg7, com.micklab.dcg.wrapper.android.os.Bundle arg8) {
        ((android.content.ContextWrapper) real).sendOrderedBroadcast(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal(), arg6, arg7 == null ? null : arg7.getReal(), arg8 == null ? null : arg8.getReal());
    }

    public void sendOrderedBroadcastAsUser(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg3, com.micklab.dcg.wrapper.android.os.Handler arg4, int arg5, java.lang.String arg6, com.micklab.dcg.wrapper.android.os.Bundle arg7) {
        ((android.content.ContextWrapper) real).sendOrderedBroadcastAsUser(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5, arg6, arg7 == null ? null : arg7.getReal());
    }

    public void sendStickyBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.content.ContextWrapper) real).sendStickyBroadcast(arg0 == null ? null : arg0.getReal());
    }

    public void sendStickyBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.content.ContextWrapper) real).sendStickyBroadcast(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void sendStickyBroadcastAsUser(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1) {
        ((android.content.ContextWrapper) real).sendStickyBroadcastAsUser(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void sendStickyOrderedBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg1, com.micklab.dcg.wrapper.android.os.Handler arg2, int arg3, java.lang.String arg4, com.micklab.dcg.wrapper.android.os.Bundle arg5) {
        ((android.content.ContextWrapper) real).sendStickyOrderedBroadcast(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3, arg4, arg5 == null ? null : arg5.getReal());
    }

    public void sendStickyOrderedBroadcastAsUser(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1, com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg2, com.micklab.dcg.wrapper.android.os.Handler arg3, int arg4, java.lang.String arg5, com.micklab.dcg.wrapper.android.os.Bundle arg6) {
        ((android.content.ContextWrapper) real).sendStickyOrderedBroadcastAsUser(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6 == null ? null : arg6.getReal());
    }

    public void setTheme(int arg0) {
        ((android.content.ContextWrapper) real).setTheme(arg0);
    }

    public void setWallpaper(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) throws java.io.IOException {
        ((android.content.ContextWrapper) real).setWallpaper(arg0 == null ? null : arg0.getReal());
    }

    public void setWallpaper(java.io.InputStream arg0) throws java.io.IOException {
        ((android.content.ContextWrapper) real).setWallpaper(arg0);
    }

    public void startActivities(android.content.Intent[] arg0) {
        ((android.content.ContextWrapper) real).startActivities(arg0);
    }

    public void startActivities(android.content.Intent[] arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.content.ContextWrapper) real).startActivities(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void startActivity(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.content.ContextWrapper) real).startActivity(arg0 == null ? null : arg0.getReal());
    }

    public void startActivity(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.content.ContextWrapper) real).startActivity(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName startForegroundService(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.content.ContextWrapper) real).startForegroundService(arg0 == null ? null : arg0.getReal()));
    }

    public boolean startInstrumentation(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return ((android.content.ContextWrapper) real).startInstrumentation(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void startIntentSender(com.micklab.dcg.wrapper.android.content.IntentSender arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2, int arg3, int arg4) throws android.content.IntentSender.SendIntentException {
        ((android.content.ContextWrapper) real).startIntentSender(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4);
    }

    public void startIntentSender(com.micklab.dcg.wrapper.android.content.IntentSender arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.os.Bundle arg5) throws android.content.IntentSender.SendIntentException {
        ((android.content.ContextWrapper) real).startIntentSender(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4, arg5 == null ? null : arg5.getReal());
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName startService(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.content.ContextWrapper) real).startService(arg0 == null ? null : arg0.getReal()));
    }

    public boolean stopService(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return ((android.content.ContextWrapper) real).stopService(arg0 == null ? null : arg0.getReal());
    }

    public void unbindService(com.micklab.dcg.wrapper.android.content.ServiceConnection arg0) {
        ((android.content.ContextWrapper) real).unbindService(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterComponentCallbacks(com.micklab.dcg.wrapper.android.content.ComponentCallbacks arg0) {
        ((android.content.ContextWrapper) real).unregisterComponentCallbacks(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterDeviceIdChangeListener(java.util.function.IntConsumer arg0) {
        ((android.content.ContextWrapper) real).unregisterDeviceIdChangeListener(arg0);
    }

    public void unregisterReceiver(com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg0) {
        ((android.content.ContextWrapper) real).unregisterReceiver(arg0 == null ? null : arg0.getReal());
    }

    public void updateServiceGroup(com.micklab.dcg.wrapper.android.content.ServiceConnection arg0, int arg1, int arg2) {
        ((android.content.ContextWrapper) real).updateServiceGroup(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

}
