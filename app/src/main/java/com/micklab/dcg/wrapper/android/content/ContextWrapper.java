// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class ContextWrapper {
    private final android.content.ContextWrapper real;

    public ContextWrapper(android.content.ContextWrapper real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.ContextWrapper wrap(android.content.ContextWrapper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.ContextWrapper(real);
    }

    public android.content.ContextWrapper unwrap() {
        return real;
    }

    public ContextWrapper(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.content.ContextWrapper(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean bindIsolatedService(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1, java.lang.String arg2, java.util.concurrent.Executor arg3, com.micklab.dcg.wrapper.android.content.ServiceConnection arg4) {
        return real.bindIsolatedService(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap());
    }

    public boolean bindService(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.ServiceConnection arg1, int arg2) {
        return real.bindService(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public boolean bindService(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.ServiceConnection arg1, com.micklab.dcg.wrapper.android.content.Context.BindServiceFlags arg2) {
        return real.bindService(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public boolean bindService(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.Context.BindServiceFlags arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.content.ServiceConnection arg3) {
        return real.bindService(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public boolean bindService(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.content.ServiceConnection arg3) {
        return real.bindService(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap());
    }

    public boolean bindServiceAsUser(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.ServiceConnection arg1, int arg2, com.micklab.dcg.wrapper.android.os.UserHandle arg3) {
        return real.bindServiceAsUser(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap());
    }

    public boolean bindServiceAsUser(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.ServiceConnection arg1, com.micklab.dcg.wrapper.android.content.Context.BindServiceFlags arg2, com.micklab.dcg.wrapper.android.os.UserHandle arg3) {
        return real.bindServiceAsUser(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
    }

    public int checkCallingOrSelfPermission(java.lang.String arg0) {
        return real.checkCallingOrSelfPermission(arg0);
    }

    public int checkCallingOrSelfUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1) {
        return real.checkCallingOrSelfUriPermission(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public int checkCallingPermission(java.lang.String arg0) {
        return real.checkCallingPermission(arg0);
    }

    public int checkCallingUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1) {
        return real.checkCallingUriPermission(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public int checkContentUriPermissionFull(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1, int arg2, int arg3) {
        return real.checkContentUriPermissionFull(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

    public int checkPermission(java.lang.String arg0, int arg1, int arg2) {
        return real.checkPermission(arg0, arg1, arg2);
    }

    public int checkSelfPermission(java.lang.String arg0) {
        return real.checkSelfPermission(arg0);
    }

    public int checkUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1, int arg2, int arg3) {
        return real.checkUriPermission(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

    public int checkUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, java.lang.String arg2, int arg3, int arg4, int arg5) {
        return real.checkUriPermission(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5);
    }

    public void clearWallpaper() throws java.io.IOException {
        real.clearWallpaper();
    }

    public com.micklab.dcg.wrapper.android.content.Context createAttributionContext(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.createAttributionContext(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.Context createConfigurationContext(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.createConfigurationContext(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.content.Context createContext(com.micklab.dcg.wrapper.android.content.ContextParams arg0) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.createContext(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.content.Context createContextForSplit(java.lang.String arg0) throws android.content.pm.PackageManager.NameNotFoundException {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.createContextForSplit(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.Context createDeviceContext(int arg0) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.createDeviceContext(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.Context createDeviceProtectedStorageContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.createDeviceProtectedStorageContext());
    }

    public com.micklab.dcg.wrapper.android.content.Context createDisplayContext(com.micklab.dcg.wrapper.android.view.Display arg0) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.createDisplayContext(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.content.Context createPackageContext(java.lang.String arg0, int arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.createPackageContext(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Context createWindowContext(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.createWindowContext(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.content.Context createWindowContext(com.micklab.dcg.wrapper.android.view.Display arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.createWindowContext(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public java.lang.String[] databaseList() {
        return real.databaseList();
    }

    public boolean deleteDatabase(java.lang.String arg0) {
        return real.deleteDatabase(arg0);
    }

    public boolean deleteFile(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContextWrapper#deleteFile(java.lang.String)");
    }

    public boolean deleteSharedPreferences(java.lang.String arg0) {
        return real.deleteSharedPreferences(arg0);
    }

    public void enforceCallingOrSelfPermission(java.lang.String arg0, java.lang.String arg1) {
        real.enforceCallingOrSelfPermission(arg0, arg1);
    }

    public void enforceCallingOrSelfUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1, java.lang.String arg2) {
        real.enforceCallingOrSelfUriPermission(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void enforceCallingPermission(java.lang.String arg0, java.lang.String arg1) {
        real.enforceCallingPermission(arg0, arg1);
    }

    public void enforceCallingUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1, java.lang.String arg2) {
        real.enforceCallingUriPermission(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void enforcePermission(java.lang.String arg0, int arg1, int arg2, java.lang.String arg3) {
        real.enforcePermission(arg0, arg1, arg2, arg3);
    }

    public void enforceUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1, int arg2, int arg3, java.lang.String arg4) {
        real.enforceUriPermission(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4);
    }

    public void enforceUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, java.lang.String arg2, int arg3, int arg4, int arg5, java.lang.String arg6) {
        real.enforceUriPermission(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public java.lang.String[] fileList() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContextWrapper#fileList()");
    }

    public com.micklab.dcg.wrapper.android.content.Context getApplicationContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.getApplicationContext());
    }

    public com.micklab.dcg.wrapper.android.content.pm.ApplicationInfo getApplicationInfo() {
        return com.micklab.dcg.wrapper.android.content.pm.ApplicationInfo.wrap(real.getApplicationInfo());
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetManager getAssets() {
        return com.micklab.dcg.wrapper.android.content.res.AssetManager.wrap(real.getAssets());
    }

    public com.micklab.dcg.wrapper.android.content.AttributionSource getAttributionSource() {
        return com.micklab.dcg.wrapper.android.content.AttributionSource.wrap(real.getAttributionSource());
    }

    public java.lang.String getAttributionTag() {
        return real.getAttributionTag();
    }

    public com.micklab.dcg.wrapper.android.content.Context getBaseContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(real.getBaseContext());
    }

    public java.io.File getCacheDir() {
        return real.getCacheDir();
    }

    public java.lang.ClassLoader getClassLoader() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContextWrapper#getClassLoader()");
    }

    public java.io.File getCodeCacheDir() {
        return real.getCodeCacheDir();
    }

    public com.micklab.dcg.wrapper.android.content.ContentResolver getContentResolver() {
        return com.micklab.dcg.wrapper.android.content.ContentResolver.wrap(real.getContentResolver());
    }

    public java.io.File getDataDir() {
        return real.getDataDir();
    }

    public java.io.File getDatabasePath(java.lang.String arg0) {
        return real.getDatabasePath(arg0);
    }

    public int getDeviceId() {
        return real.getDeviceId();
    }

    public java.io.File getDir(java.lang.String arg0, int arg1) {
        return real.getDir(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.Display getDisplay() {
        return com.micklab.dcg.wrapper.android.view.Display.wrap(real.getDisplay());
    }

    public java.io.File getExternalCacheDir() {
        return real.getExternalCacheDir();
    }

    public java.io.File[] getExternalCacheDirs() {
        return real.getExternalCacheDirs();
    }

    public java.io.File getExternalFilesDir(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContextWrapper#getExternalFilesDir(java.lang.String)");
    }

    public java.io.File[] getExternalFilesDirs(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContextWrapper#getExternalFilesDirs(java.lang.String)");
    }

    public java.io.File[] getExternalMediaDirs() {
        return real.getExternalMediaDirs();
    }

    public java.io.File getFileStreamPath(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContextWrapper#getFileStreamPath(java.lang.String)");
    }

    public java.io.File getFilesDir() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContextWrapper#getFilesDir()");
    }

    public java.util.concurrent.Executor getMainExecutor() {
        return real.getMainExecutor();
    }

    public com.micklab.dcg.wrapper.android.os.Looper getMainLooper() {
        return com.micklab.dcg.wrapper.android.os.Looper.wrap(real.getMainLooper());
    }

    public java.io.File getNoBackupFilesDir() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContextWrapper#getNoBackupFilesDir()");
    }

    public java.io.File getObbDir() {
        return real.getObbDir();
    }

    public java.io.File[] getObbDirs() {
        return real.getObbDirs();
    }

    public java.lang.String getOpPackageName() {
        return real.getOpPackageName();
    }

    public java.lang.String getPackageCodePath() {
        return real.getPackageCodePath();
    }

    public com.micklab.dcg.wrapper.android.content.pm.PackageManager getPackageManager() {
        return com.micklab.dcg.wrapper.android.content.pm.PackageManager.wrap(real.getPackageManager());
    }

    public java.lang.String getPackageName() {
        return real.getPackageName();
    }

    public java.lang.String getPackageResourcePath() {
        return real.getPackageResourcePath();
    }

    public com.micklab.dcg.wrapper.android.content.ContextParams getParams() {
        return com.micklab.dcg.wrapper.android.content.ContextParams.wrap(real.getParams());
    }

    public com.micklab.dcg.wrapper.android.content.res.Resources getResources() {
        return com.micklab.dcg.wrapper.android.content.res.Resources.wrap(real.getResources());
    }

    public com.micklab.dcg.wrapper.android.content.SharedPreferences getSharedPreferences(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.content.SharedPreferences.wrap(real.getSharedPreferences(arg0, arg1));
    }

    public java.lang.Object getSystemService(java.lang.String arg0) {
        return real.getSystemService(arg0);
    }

    public android.content.res.Resources.Theme getTheme() {
        return real.getTheme();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getWallpaper() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getWallpaper());
    }

    public int getWallpaperDesiredMinimumHeight() {
        return real.getWallpaperDesiredMinimumHeight();
    }

    public int getWallpaperDesiredMinimumWidth() {
        return real.getWallpaperDesiredMinimumWidth();
    }

    public void grantUriPermission(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, int arg2) {
        real.grantUriPermission(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public boolean isDeviceProtectedStorage() {
        return real.isDeviceProtectedStorage();
    }

    public boolean isRestricted() {
        return real.isRestricted();
    }

    public boolean isUiContext() {
        return real.isUiContext();
    }

    public boolean moveDatabaseFrom(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) {
        return real.moveDatabaseFrom(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public boolean moveSharedPreferencesFrom(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) {
        return real.moveSharedPreferencesFrom(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public java.io.FileInputStream openFileInput(java.lang.String arg0) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContextWrapper#openFileInput(java.lang.String)");
    }

    public java.io.FileOutputStream openFileOutput(java.lang.String arg0, int arg1) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.ContextWrapper#openFileOutput(java.lang.String,int)");
    }

    public com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.CursorFactory arg2) {
        return com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.wrap(real.openOrCreateDatabase(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.CursorFactory arg2, com.micklab.dcg.wrapper.android.database.DatabaseErrorHandler arg3) {
        return com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.wrap(real.openOrCreateDatabase(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable peekWallpaper() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.peekWallpaper());
    }

    public void registerComponentCallbacks(com.micklab.dcg.wrapper.android.content.ComponentCallbacks arg0) {
        real.registerComponentCallbacks(arg0 == null ? null : arg0.unwrap());
    }

    public void registerDeviceIdChangeListener(java.util.concurrent.Executor arg0, java.util.function.IntConsumer arg1) {
        real.registerDeviceIdChangeListener(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.content.Intent registerReceiver(com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg0, com.micklab.dcg.wrapper.android.content.IntentFilter arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.registerReceiver(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.content.Intent registerReceiver(com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg0, com.micklab.dcg.wrapper.android.content.IntentFilter arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.registerReceiver(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public com.micklab.dcg.wrapper.android.content.Intent registerReceiver(com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg0, com.micklab.dcg.wrapper.android.content.IntentFilter arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Handler arg3) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.registerReceiver(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.content.Intent registerReceiver(com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg0, com.micklab.dcg.wrapper.android.content.IntentFilter arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Handler arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(real.registerReceiver(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4));
    }

    public void removeStickyBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        real.removeStickyBroadcast(arg0 == null ? null : arg0.unwrap());
    }

    public void removeStickyBroadcastAsUser(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1) {
        real.removeStickyBroadcastAsUser(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void revokeUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1) {
        real.revokeUriPermission(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void revokeUriPermission(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, int arg2) {
        real.revokeUriPermission(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void sendBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        real.sendBroadcast(arg0 == null ? null : arg0.unwrap());
    }

    public void sendBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, java.lang.String arg1) {
        real.sendBroadcast(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void sendBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        real.sendBroadcast(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void sendBroadcastAsUser(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1) {
        real.sendBroadcastAsUser(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void sendBroadcastAsUser(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1, java.lang.String arg2) {
        real.sendBroadcastAsUser(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void sendOrderedBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, java.lang.String arg1) {
        real.sendOrderedBroadcast(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void sendOrderedBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        real.sendOrderedBroadcast(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void sendOrderedBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg2, com.micklab.dcg.wrapper.android.os.Handler arg3, int arg4, java.lang.String arg5, com.micklab.dcg.wrapper.android.os.Bundle arg6) {
        real.sendOrderedBroadcast(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4, arg5, arg6 == null ? null : arg6.unwrap());
    }

    public void sendOrderedBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg3, com.micklab.dcg.wrapper.android.os.Handler arg4, int arg5, java.lang.String arg6, com.micklab.dcg.wrapper.android.os.Bundle arg7) {
        real.sendOrderedBroadcast(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5, arg6, arg7 == null ? null : arg7.unwrap());
    }

    public void sendOrderedBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg3, com.micklab.dcg.wrapper.android.os.Handler arg4, int arg5, java.lang.String arg6, com.micklab.dcg.wrapper.android.os.Bundle arg7) {
        real.sendOrderedBroadcast(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5, arg6, arg7 == null ? null : arg7.unwrap());
    }

    public void sendOrderedBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1, java.lang.String arg2, java.lang.String arg3, com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg4, com.micklab.dcg.wrapper.android.os.Handler arg5, java.lang.String arg6, com.micklab.dcg.wrapper.android.os.Bundle arg7, com.micklab.dcg.wrapper.android.os.Bundle arg8) {
        real.sendOrderedBroadcast(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap(), arg6, arg7 == null ? null : arg7.unwrap(), arg8 == null ? null : arg8.unwrap());
    }

    public void sendOrderedBroadcastAsUser(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg3, com.micklab.dcg.wrapper.android.os.Handler arg4, int arg5, java.lang.String arg6, com.micklab.dcg.wrapper.android.os.Bundle arg7) {
        real.sendOrderedBroadcastAsUser(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5, arg6, arg7 == null ? null : arg7.unwrap());
    }

    public void sendStickyBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        real.sendStickyBroadcast(arg0 == null ? null : arg0.unwrap());
    }

    public void sendStickyBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.sendStickyBroadcast(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void sendStickyBroadcastAsUser(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1) {
        real.sendStickyBroadcastAsUser(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void sendStickyOrderedBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg1, com.micklab.dcg.wrapper.android.os.Handler arg2, int arg3, java.lang.String arg4, com.micklab.dcg.wrapper.android.os.Bundle arg5) {
        real.sendStickyOrderedBroadcast(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3, arg4, arg5 == null ? null : arg5.unwrap());
    }

    public void sendStickyOrderedBroadcastAsUser(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1, com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg2, com.micklab.dcg.wrapper.android.os.Handler arg3, int arg4, java.lang.String arg5, com.micklab.dcg.wrapper.android.os.Bundle arg6) {
        real.sendStickyOrderedBroadcastAsUser(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4, arg5, arg6 == null ? null : arg6.unwrap());
    }

    public void setTheme(int arg0) {
        real.setTheme(arg0);
    }

    public void setWallpaper(java.io.InputStream arg0) throws java.io.IOException {
        real.setWallpaper(arg0);
    }

    public void setWallpaper(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) throws java.io.IOException {
        real.setWallpaper(arg0 == null ? null : arg0.unwrap());
    }

    public void startActivities(android.content.Intent[] arg0) {
        real.startActivities(arg0);
    }

    public void startActivities(android.content.Intent[] arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.startActivities(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void startActivity(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        real.startActivity(arg0 == null ? null : arg0.unwrap());
    }

    public void startActivity(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.startActivity(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName startForegroundService(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.startForegroundService(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean startInstrumentation(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return real.startInstrumentation(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void startIntentSender(com.micklab.dcg.wrapper.android.content.IntentSender arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2, int arg3, int arg4) throws android.content.IntentSender.SendIntentException {
        real.startIntentSender(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4);
    }

    public void startIntentSender(com.micklab.dcg.wrapper.android.content.IntentSender arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.os.Bundle arg5) throws android.content.IntentSender.SendIntentException {
        real.startIntentSender(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap());
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName startService(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(real.startService(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean stopService(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return real.stopService(arg0 == null ? null : arg0.unwrap());
    }

    public void unbindService(com.micklab.dcg.wrapper.android.content.ServiceConnection arg0) {
        real.unbindService(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterComponentCallbacks(com.micklab.dcg.wrapper.android.content.ComponentCallbacks arg0) {
        real.unregisterComponentCallbacks(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterDeviceIdChangeListener(java.util.function.IntConsumer arg0) {
        real.unregisterDeviceIdChangeListener(arg0);
    }

    public void unregisterReceiver(com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg0) {
        real.unregisterReceiver(arg0 == null ? null : arg0.unwrap());
    }

    public void updateServiceGroup(com.micklab.dcg.wrapper.android.content.ServiceConnection arg0, int arg1, int arg2) {
        real.updateServiceGroup(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

}
