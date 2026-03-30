// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class Context {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Context(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.Context wrap(android.content.Context real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.Context(real, (__DcgwBridgeToken) null);
    }

    public android.content.Context getReal() {
        return (android.content.Context) real;
    }

    public android.content.Context unwrap() {
        return getReal();
    }

    public boolean bindIsolatedService(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.Context.BindServiceFlags arg1, java.lang.String arg2, java.util.concurrent.Executor arg3, com.micklab.dcg.wrapper.android.content.ServiceConnection arg4) {
        return ((android.content.Context) real).bindIsolatedService(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public boolean bindIsolatedService(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1, java.lang.String arg2, java.util.concurrent.Executor arg3, com.micklab.dcg.wrapper.android.content.ServiceConnection arg4) {
        return ((android.content.Context) real).bindIsolatedService(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4 == null ? null : arg4.getReal());
    }

    public boolean bindService(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.ServiceConnection arg1, int arg2) {
        return ((android.content.Context) real).bindService(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public boolean bindService(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.ServiceConnection arg1, com.micklab.dcg.wrapper.android.content.Context.BindServiceFlags arg2) {
        return ((android.content.Context) real).bindService(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public boolean bindService(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.content.ServiceConnection arg3) {
        return ((android.content.Context) real).bindService(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public boolean bindService(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.Context.BindServiceFlags arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.content.ServiceConnection arg3) {
        return ((android.content.Context) real).bindService(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public boolean bindServiceAsUser(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.ServiceConnection arg1, com.micklab.dcg.wrapper.android.content.Context.BindServiceFlags arg2, com.micklab.dcg.wrapper.android.os.UserHandle arg3) {
        return ((android.content.Context) real).bindServiceAsUser(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public boolean bindServiceAsUser(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.ServiceConnection arg1, int arg2, com.micklab.dcg.wrapper.android.os.UserHandle arg3) {
        return ((android.content.Context) real).bindServiceAsUser(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal());
    }

    public int checkCallingOrSelfPermission(java.lang.String arg0) {
        return ((android.content.Context) real).checkCallingOrSelfPermission(arg0);
    }

    public int checkCallingOrSelfUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1) {
        return ((android.content.Context) real).checkCallingOrSelfUriPermission(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public int checkCallingPermission(java.lang.String arg0) {
        return ((android.content.Context) real).checkCallingPermission(arg0);
    }

    public int checkCallingUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1) {
        return ((android.content.Context) real).checkCallingUriPermission(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public int checkContentUriPermissionFull(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1, int arg2, int arg3) {
        return ((android.content.Context) real).checkContentUriPermissionFull(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public int checkPermission(java.lang.String arg0, int arg1, int arg2) {
        return ((android.content.Context) real).checkPermission(arg0, arg1, arg2);
    }

    public int checkSelfPermission(java.lang.String arg0) {
        return ((android.content.Context) real).checkSelfPermission(arg0);
    }

    public int checkUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1, int arg2, int arg3) {
        return ((android.content.Context) real).checkUriPermission(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public int checkUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, java.lang.String arg2, int arg3, int arg4, int arg5) {
        return ((android.content.Context) real).checkUriPermission(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5);
    }

    public void clearWallpaper() throws java.io.IOException {
        ((android.content.Context) real).clearWallpaper();
    }

    public com.micklab.dcg.wrapper.android.content.Context createAttributionContext(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.Context) real).createAttributionContext(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.Context createConfigurationContext(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.Context) real).createConfigurationContext(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.content.Context createContext(com.micklab.dcg.wrapper.android.content.ContextParams arg0) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.Context) real).createContext(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.content.Context createContextForSplit(java.lang.String arg0) throws android.content.pm.PackageManager.NameNotFoundException {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.Context) real).createContextForSplit(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.Context createDeviceContext(int arg0) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.Context) real).createDeviceContext(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.Context createDeviceProtectedStorageContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.Context) real).createDeviceProtectedStorageContext());
    }

    public com.micklab.dcg.wrapper.android.content.Context createDisplayContext(com.micklab.dcg.wrapper.android.view.Display arg0) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.Context) real).createDisplayContext(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.content.Context createPackageContext(java.lang.String arg0, int arg1) throws android.content.pm.PackageManager.NameNotFoundException {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.Context) real).createPackageContext(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.Context createWindowContext(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.Context) real).createWindowContext(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.content.Context createWindowContext(com.micklab.dcg.wrapper.android.view.Display arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.Context) real).createWindowContext(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()));
    }

    public java.lang.String[] databaseList() {
        return ((android.content.Context) real).databaseList();
    }

    public boolean deleteDatabase(java.lang.String arg0) {
        return ((android.content.Context) real).deleteDatabase(arg0);
    }

    public boolean deleteFile(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.Context#deleteFile(java.lang.String)");
    }

    public boolean deleteSharedPreferences(java.lang.String arg0) {
        return ((android.content.Context) real).deleteSharedPreferences(arg0);
    }

    public void enforceCallingOrSelfPermission(java.lang.String arg0, java.lang.String arg1) {
        ((android.content.Context) real).enforceCallingOrSelfPermission(arg0, arg1);
    }

    public void enforceCallingOrSelfUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1, java.lang.String arg2) {
        ((android.content.Context) real).enforceCallingOrSelfUriPermission(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void enforceCallingPermission(java.lang.String arg0, java.lang.String arg1) {
        ((android.content.Context) real).enforceCallingPermission(arg0, arg1);
    }

    public void enforceCallingUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1, java.lang.String arg2) {
        ((android.content.Context) real).enforceCallingUriPermission(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void enforcePermission(java.lang.String arg0, int arg1, int arg2, java.lang.String arg3) {
        ((android.content.Context) real).enforcePermission(arg0, arg1, arg2, arg3);
    }

    public void enforceUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1, int arg2, int arg3, java.lang.String arg4) {
        ((android.content.Context) real).enforceUriPermission(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4);
    }

    public void enforceUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1, java.lang.String arg2, int arg3, int arg4, int arg5, java.lang.String arg6) {
        ((android.content.Context) real).enforceUriPermission(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public java.lang.String[] fileList() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.Context#fileList()");
    }

    public com.micklab.dcg.wrapper.android.content.Context getApplicationContext() {
        return com.micklab.dcg.wrapper.android.content.Context.wrap(((android.content.Context) real).getApplicationContext());
    }

    public com.micklab.dcg.wrapper.android.content.pm.ApplicationInfo getApplicationInfo() {
        return com.micklab.dcg.wrapper.android.content.pm.ApplicationInfo.wrap(((android.content.Context) real).getApplicationInfo());
    }

    public com.micklab.dcg.wrapper.android.content.res.AssetManager getAssets() {
        return com.micklab.dcg.wrapper.android.content.res.AssetManager.wrap(((android.content.Context) real).getAssets());
    }

    public com.micklab.dcg.wrapper.android.content.AttributionSource getAttributionSource() {
        return com.micklab.dcg.wrapper.android.content.AttributionSource.wrap(((android.content.Context) real).getAttributionSource());
    }

    public java.lang.String getAttributionTag() {
        return ((android.content.Context) real).getAttributionTag();
    }

    public java.io.File getCacheDir() {
        return ((android.content.Context) real).getCacheDir();
    }

    public java.lang.ClassLoader getClassLoader() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.Context#getClassLoader()");
    }

    public java.io.File getCodeCacheDir() {
        return ((android.content.Context) real).getCodeCacheDir();
    }

    public int getColor(int arg0) {
        return ((android.content.Context) real).getColor(arg0);
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getColorStateList(int arg0) {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(((android.content.Context) real).getColorStateList(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.ContentResolver getContentResolver() {
        return com.micklab.dcg.wrapper.android.content.ContentResolver.wrap(((android.content.Context) real).getContentResolver());
    }

    public java.io.File getDataDir() {
        return ((android.content.Context) real).getDataDir();
    }

    public java.io.File getDatabasePath(java.lang.String arg0) {
        return ((android.content.Context) real).getDatabasePath(arg0);
    }

    public int getDeviceId() {
        return ((android.content.Context) real).getDeviceId();
    }

    public java.io.File getDir(java.lang.String arg0, int arg1) {
        return ((android.content.Context) real).getDir(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.Display getDisplay() {
        return com.micklab.dcg.wrapper.android.view.Display.wrap(((android.content.Context) real).getDisplay());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDrawable(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.content.Context) real).getDrawable(arg0));
    }

    public java.io.File getExternalCacheDir() {
        return ((android.content.Context) real).getExternalCacheDir();
    }

    public java.io.File[] getExternalCacheDirs() {
        return ((android.content.Context) real).getExternalCacheDirs();
    }

    public java.io.File getExternalFilesDir(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.Context#getExternalFilesDir(java.lang.String)");
    }

    public java.io.File[] getExternalFilesDirs(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.Context#getExternalFilesDirs(java.lang.String)");
    }

    public java.io.File[] getExternalMediaDirs() {
        return ((android.content.Context) real).getExternalMediaDirs();
    }

    public java.io.File getFileStreamPath(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.Context#getFileStreamPath(java.lang.String)");
    }

    public java.io.File getFilesDir() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.Context#getFilesDir()");
    }

    public java.util.concurrent.Executor getMainExecutor() {
        return ((android.content.Context) real).getMainExecutor();
    }

    public com.micklab.dcg.wrapper.android.os.Looper getMainLooper() {
        return com.micklab.dcg.wrapper.android.os.Looper.wrap(((android.content.Context) real).getMainLooper());
    }

    public java.io.File getNoBackupFilesDir() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.Context#getNoBackupFilesDir()");
    }

    public java.io.File getObbDir() {
        return ((android.content.Context) real).getObbDir();
    }

    public java.io.File[] getObbDirs() {
        return ((android.content.Context) real).getObbDirs();
    }

    public java.lang.String getOpPackageName() {
        return ((android.content.Context) real).getOpPackageName();
    }

    public java.lang.String getPackageCodePath() {
        return ((android.content.Context) real).getPackageCodePath();
    }

    public com.micklab.dcg.wrapper.android.content.pm.PackageManager getPackageManager() {
        return com.micklab.dcg.wrapper.android.content.pm.PackageManager.wrap(((android.content.Context) real).getPackageManager());
    }

    public java.lang.String getPackageName() {
        return ((android.content.Context) real).getPackageName();
    }

    public java.lang.String getPackageResourcePath() {
        return ((android.content.Context) real).getPackageResourcePath();
    }

    public com.micklab.dcg.wrapper.android.content.ContextParams getParams() {
        return com.micklab.dcg.wrapper.android.content.ContextParams.wrap(((android.content.Context) real).getParams());
    }

    public com.micklab.dcg.wrapper.android.content.res.Resources getResources() {
        return com.micklab.dcg.wrapper.android.content.res.Resources.wrap(((android.content.Context) real).getResources());
    }

    public com.micklab.dcg.wrapper.android.content.SharedPreferences getSharedPreferences(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.content.SharedPreferences.wrap(((android.content.Context) real).getSharedPreferences(arg0, arg1));
    }

    public java.lang.String getString(int arg0) {
        return ((android.content.Context) real).getString(arg0);
    }

    public java.lang.String getString(int arg0, java.lang.Object... arg1) {
        return ((android.content.Context) real).getString(arg0, arg1);
    }

    public java.lang.Object getSystemService(java.lang.String arg0) {
        return ((android.content.Context) real).getSystemService(arg0);
    }

    public java.lang.CharSequence getText(int arg0) {
        return ((android.content.Context) real).getText(arg0);
    }

    public android.content.res.Resources.Theme getTheme() {
        return ((android.content.Context) real).getTheme();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getWallpaper() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.content.Context) real).getWallpaper());
    }

    public int getWallpaperDesiredMinimumHeight() {
        return ((android.content.Context) real).getWallpaperDesiredMinimumHeight();
    }

    public int getWallpaperDesiredMinimumWidth() {
        return ((android.content.Context) real).getWallpaperDesiredMinimumWidth();
    }

    public void grantUriPermission(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, int arg2) {
        ((android.content.Context) real).grantUriPermission(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public boolean isDeviceProtectedStorage() {
        return ((android.content.Context) real).isDeviceProtectedStorage();
    }

    public boolean isRestricted() {
        return ((android.content.Context) real).isRestricted();
    }

    public boolean isUiContext() {
        return ((android.content.Context) real).isUiContext();
    }

    public boolean moveDatabaseFrom(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) {
        return ((android.content.Context) real).moveDatabaseFrom(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public boolean moveSharedPreferencesFrom(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) {
        return ((android.content.Context) real).moveSharedPreferencesFrom(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public com.micklab.dcg.wrapper.android.content.res.TypedArray obtainStyledAttributes(int[] arg0) {
        return com.micklab.dcg.wrapper.android.content.res.TypedArray.wrap(((android.content.Context) real).obtainStyledAttributes(arg0));
    }

    public com.micklab.dcg.wrapper.android.content.res.TypedArray obtainStyledAttributes(int arg0, int[] arg1) throws android.content.res.Resources.NotFoundException {
        return com.micklab.dcg.wrapper.android.content.res.TypedArray.wrap(((android.content.Context) real).obtainStyledAttributes(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.content.res.TypedArray obtainStyledAttributes(com.micklab.dcg.wrapper.android.util.AttributeSet arg0, int[] arg1) {
        return com.micklab.dcg.wrapper.android.content.res.TypedArray.wrap(((android.content.Context) real).obtainStyledAttributes(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public com.micklab.dcg.wrapper.android.content.res.TypedArray obtainStyledAttributes(com.micklab.dcg.wrapper.android.util.AttributeSet arg0, int[] arg1, int arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.content.res.TypedArray.wrap(((android.content.Context) real).obtainStyledAttributes(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3));
    }

    public java.io.FileInputStream openFileInput(java.lang.String arg0) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.Context#openFileInput(java.lang.String)");
    }

    public java.io.FileOutputStream openFileOutput(java.lang.String arg0, int arg1) throws java.io.FileNotFoundException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.content.Context#openFileOutput(java.lang.String,int)");
    }

    public com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.CursorFactory arg2) {
        return com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.wrap(((android.content.Context) real).openOrCreateDatabase(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.CursorFactory arg2, com.micklab.dcg.wrapper.android.database.DatabaseErrorHandler arg3) {
        return com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDatabase.wrap(((android.content.Context) real).openOrCreateDatabase(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable peekWallpaper() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.content.Context) real).peekWallpaper());
    }

    public void registerComponentCallbacks(com.micklab.dcg.wrapper.android.content.ComponentCallbacks arg0) {
        ((android.content.Context) real).registerComponentCallbacks(arg0 == null ? null : arg0.getReal());
    }

    public void registerDeviceIdChangeListener(java.util.concurrent.Executor arg0, java.util.function.IntConsumer arg1) {
        ((android.content.Context) real).registerDeviceIdChangeListener(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.content.Intent registerReceiver(com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg0, com.micklab.dcg.wrapper.android.content.IntentFilter arg1) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.content.Context) real).registerReceiver(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.content.Intent registerReceiver(com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg0, com.micklab.dcg.wrapper.android.content.IntentFilter arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.content.Context) real).registerReceiver(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2));
    }

    public com.micklab.dcg.wrapper.android.content.Intent registerReceiver(com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg0, com.micklab.dcg.wrapper.android.content.IntentFilter arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Handler arg3) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.content.Context) real).registerReceiver(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal()));
    }

    public com.micklab.dcg.wrapper.android.content.Intent registerReceiver(com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg0, com.micklab.dcg.wrapper.android.content.IntentFilter arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.os.Handler arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.content.Intent.wrap(((android.content.Context) real).registerReceiver(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4));
    }

    public void removeStickyBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.content.Context) real).removeStickyBroadcast(arg0 == null ? null : arg0.getReal());
    }

    public void removeStickyBroadcastAsUser(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1) {
        ((android.content.Context) real).removeStickyBroadcastAsUser(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void revokeSelfPermissionOnKill(java.lang.String arg0) {
        ((android.content.Context) real).revokeSelfPermissionOnKill(arg0);
    }

    public void revokeUriPermission(com.micklab.dcg.wrapper.android.net.Uri arg0, int arg1) {
        ((android.content.Context) real).revokeUriPermission(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void revokeUriPermission(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, int arg2) {
        ((android.content.Context) real).revokeUriPermission(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void sendBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.content.Context) real).sendBroadcast(arg0 == null ? null : arg0.getReal());
    }

    public void sendBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, java.lang.String arg1) {
        ((android.content.Context) real).sendBroadcast(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void sendBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        ((android.content.Context) real).sendBroadcast(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void sendBroadcastAsUser(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1) {
        ((android.content.Context) real).sendBroadcastAsUser(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void sendBroadcastAsUser(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1, java.lang.String arg2) {
        ((android.content.Context) real).sendBroadcastAsUser(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void sendBroadcastWithMultiplePermissions(com.micklab.dcg.wrapper.android.content.Intent arg0, java.lang.String[] arg1) {
        ((android.content.Context) real).sendBroadcastWithMultiplePermissions(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void sendOrderedBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, java.lang.String arg1) {
        ((android.content.Context) real).sendOrderedBroadcast(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void sendOrderedBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        ((android.content.Context) real).sendOrderedBroadcast(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void sendOrderedBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg2, com.micklab.dcg.wrapper.android.os.Handler arg3, int arg4, java.lang.String arg5, com.micklab.dcg.wrapper.android.os.Bundle arg6) {
        ((android.content.Context) real).sendOrderedBroadcast(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6 == null ? null : arg6.getReal());
    }

    public void sendOrderedBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg3, com.micklab.dcg.wrapper.android.os.Handler arg4, int arg5, java.lang.String arg6, com.micklab.dcg.wrapper.android.os.Bundle arg7) {
        ((android.content.Context) real).sendOrderedBroadcast(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5, arg6, arg7 == null ? null : arg7.getReal());
    }

    public void sendOrderedBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2, com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg3, com.micklab.dcg.wrapper.android.os.Handler arg4, int arg5, java.lang.String arg6, com.micklab.dcg.wrapper.android.os.Bundle arg7) {
        ((android.content.Context) real).sendOrderedBroadcast(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5, arg6, arg7 == null ? null : arg7.getReal());
    }

    public void sendOrderedBroadcastAsUser(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg3, com.micklab.dcg.wrapper.android.os.Handler arg4, int arg5, java.lang.String arg6, com.micklab.dcg.wrapper.android.os.Bundle arg7) {
        ((android.content.Context) real).sendOrderedBroadcastAsUser(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5, arg6, arg7 == null ? null : arg7.getReal());
    }

    public void sendStickyBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.content.Context) real).sendStickyBroadcast(arg0 == null ? null : arg0.getReal());
    }

    public void sendStickyBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.content.Context) real).sendStickyBroadcast(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void sendStickyBroadcastAsUser(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1) {
        ((android.content.Context) real).sendStickyBroadcastAsUser(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void sendStickyOrderedBroadcast(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg1, com.micklab.dcg.wrapper.android.os.Handler arg2, int arg3, java.lang.String arg4, com.micklab.dcg.wrapper.android.os.Bundle arg5) {
        ((android.content.Context) real).sendStickyOrderedBroadcast(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3, arg4, arg5 == null ? null : arg5.getReal());
    }

    public void sendStickyOrderedBroadcastAsUser(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1, com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg2, com.micklab.dcg.wrapper.android.os.Handler arg3, int arg4, java.lang.String arg5, com.micklab.dcg.wrapper.android.os.Bundle arg6) {
        ((android.content.Context) real).sendStickyOrderedBroadcastAsUser(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6 == null ? null : arg6.getReal());
    }

    public void setTheme(int arg0) {
        ((android.content.Context) real).setTheme(arg0);
    }

    public void setWallpaper(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) throws java.io.IOException {
        ((android.content.Context) real).setWallpaper(arg0 == null ? null : arg0.getReal());
    }

    public void setWallpaper(java.io.InputStream arg0) throws java.io.IOException {
        ((android.content.Context) real).setWallpaper(arg0);
    }

    public void startActivities(android.content.Intent[] arg0) {
        ((android.content.Context) real).startActivities(arg0);
    }

    public void startActivities(android.content.Intent[] arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.content.Context) real).startActivities(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void startActivity(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.content.Context) real).startActivity(arg0 == null ? null : arg0.getReal());
    }

    public void startActivity(com.micklab.dcg.wrapper.android.content.Intent arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.content.Context) real).startActivity(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName startForegroundService(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.content.Context) real).startForegroundService(arg0 == null ? null : arg0.getReal()));
    }

    public boolean startInstrumentation(com.micklab.dcg.wrapper.android.content.ComponentName arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return ((android.content.Context) real).startInstrumentation(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void startIntentSender(com.micklab.dcg.wrapper.android.content.IntentSender arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2, int arg3, int arg4) throws android.content.IntentSender.SendIntentException {
        ((android.content.Context) real).startIntentSender(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4);
    }

    public void startIntentSender(com.micklab.dcg.wrapper.android.content.IntentSender arg0, com.micklab.dcg.wrapper.android.content.Intent arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.os.Bundle arg5) throws android.content.IntentSender.SendIntentException {
        ((android.content.Context) real).startIntentSender(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4, arg5 == null ? null : arg5.getReal());
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName startService(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.content.Context) real).startService(arg0 == null ? null : arg0.getReal()));
    }

    public boolean stopService(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return ((android.content.Context) real).stopService(arg0 == null ? null : arg0.getReal());
    }

    public void unbindService(com.micklab.dcg.wrapper.android.content.ServiceConnection arg0) {
        ((android.content.Context) real).unbindService(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterComponentCallbacks(com.micklab.dcg.wrapper.android.content.ComponentCallbacks arg0) {
        ((android.content.Context) real).unregisterComponentCallbacks(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterDeviceIdChangeListener(java.util.function.IntConsumer arg0) {
        ((android.content.Context) real).unregisterDeviceIdChangeListener(arg0);
    }

    public void unregisterReceiver(com.micklab.dcg.wrapper.android.content.BroadcastReceiver arg0) {
        ((android.content.Context) real).unregisterReceiver(arg0 == null ? null : arg0.getReal());
    }

    public void updateServiceGroup(com.micklab.dcg.wrapper.android.content.ServiceConnection arg0, int arg1, int arg2) {
        ((android.content.Context) real).updateServiceGroup(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public static final java.lang.String ACCESSIBILITY_SERVICE = android.content.Context.ACCESSIBILITY_SERVICE;
    public static final java.lang.String ACCOUNT_SERVICE = android.content.Context.ACCOUNT_SERVICE;
    public static final java.lang.String ACTIVITY_SERVICE = android.content.Context.ACTIVITY_SERVICE;
    public static final java.lang.String ALARM_SERVICE = android.content.Context.ALARM_SERVICE;
    public static final java.lang.String APPWIDGET_SERVICE = android.content.Context.APPWIDGET_SERVICE;
    public static final java.lang.String APP_OPS_SERVICE = android.content.Context.APP_OPS_SERVICE;
    public static final java.lang.String APP_SEARCH_SERVICE = android.content.Context.APP_SEARCH_SERVICE;
    public static final java.lang.String AUDIO_SERVICE = android.content.Context.AUDIO_SERVICE;
    public static final java.lang.String BATTERY_SERVICE = android.content.Context.BATTERY_SERVICE;
    public static final int BIND_ABOVE_CLIENT = android.content.Context.BIND_ABOVE_CLIENT;
    public static final int BIND_ADJUST_WITH_ACTIVITY = android.content.Context.BIND_ADJUST_WITH_ACTIVITY;
    public static final int BIND_ALLOW_ACTIVITY_STARTS = android.content.Context.BIND_ALLOW_ACTIVITY_STARTS;
    public static final int BIND_ALLOW_OOM_MANAGEMENT = android.content.Context.BIND_ALLOW_OOM_MANAGEMENT;
    public static final int BIND_AUTO_CREATE = android.content.Context.BIND_AUTO_CREATE;
    public static final int BIND_DEBUG_UNBIND = android.content.Context.BIND_DEBUG_UNBIND;
    public static final int BIND_EXTERNAL_SERVICE = android.content.Context.BIND_EXTERNAL_SERVICE;
    public static final long BIND_EXTERNAL_SERVICE_LONG = android.content.Context.BIND_EXTERNAL_SERVICE_LONG;
    public static final int BIND_IMPORTANT = android.content.Context.BIND_IMPORTANT;
    public static final int BIND_INCLUDE_CAPABILITIES = android.content.Context.BIND_INCLUDE_CAPABILITIES;
    public static final int BIND_NOT_FOREGROUND = android.content.Context.BIND_NOT_FOREGROUND;
    public static final int BIND_NOT_PERCEPTIBLE = android.content.Context.BIND_NOT_PERCEPTIBLE;
    public static final int BIND_PACKAGE_ISOLATED_PROCESS = android.content.Context.BIND_PACKAGE_ISOLATED_PROCESS;
    public static final int BIND_SHARED_ISOLATED_PROCESS = android.content.Context.BIND_SHARED_ISOLATED_PROCESS;
    public static final int BIND_WAIVE_PRIORITY = android.content.Context.BIND_WAIVE_PRIORITY;
    public static final java.lang.String BIOMETRIC_SERVICE = android.content.Context.BIOMETRIC_SERVICE;
    public static final java.lang.String BLOB_STORE_SERVICE = android.content.Context.BLOB_STORE_SERVICE;
    public static final java.lang.String BLUETOOTH_SERVICE = android.content.Context.BLUETOOTH_SERVICE;
    public static final java.lang.String BUGREPORT_SERVICE = android.content.Context.BUGREPORT_SERVICE;
    public static final java.lang.String CAMERA_SERVICE = android.content.Context.CAMERA_SERVICE;
    public static final java.lang.String CAPTIONING_SERVICE = android.content.Context.CAPTIONING_SERVICE;
    public static final java.lang.String CARRIER_CONFIG_SERVICE = android.content.Context.CARRIER_CONFIG_SERVICE;
    public static final java.lang.String CLIPBOARD_SERVICE = android.content.Context.CLIPBOARD_SERVICE;
    public static final java.lang.String COMPANION_DEVICE_SERVICE = android.content.Context.COMPANION_DEVICE_SERVICE;
    public static final java.lang.String CONNECTIVITY_DIAGNOSTICS_SERVICE = android.content.Context.CONNECTIVITY_DIAGNOSTICS_SERVICE;
    public static final java.lang.String CONNECTIVITY_SERVICE = android.content.Context.CONNECTIVITY_SERVICE;
    public static final java.lang.String CONSUMER_IR_SERVICE = android.content.Context.CONSUMER_IR_SERVICE;
    public static final java.lang.String CONTACT_KEYS_SERVICE = android.content.Context.CONTACT_KEYS_SERVICE;
    public static final int CONTEXT_IGNORE_SECURITY = android.content.Context.CONTEXT_IGNORE_SECURITY;
    public static final int CONTEXT_INCLUDE_CODE = android.content.Context.CONTEXT_INCLUDE_CODE;
    public static final int CONTEXT_RESTRICTED = android.content.Context.CONTEXT_RESTRICTED;
    public static final java.lang.String CREDENTIAL_SERVICE = android.content.Context.CREDENTIAL_SERVICE;
    public static final int DEVICE_ID_DEFAULT = android.content.Context.DEVICE_ID_DEFAULT;
    public static final int DEVICE_ID_INVALID = android.content.Context.DEVICE_ID_INVALID;
    public static final java.lang.String DEVICE_LOCK_SERVICE = android.content.Context.DEVICE_LOCK_SERVICE;
    public static final java.lang.String DEVICE_POLICY_SERVICE = android.content.Context.DEVICE_POLICY_SERVICE;
    public static final java.lang.String DISPLAY_HASH_SERVICE = android.content.Context.DISPLAY_HASH_SERVICE;
    public static final java.lang.String DISPLAY_SERVICE = android.content.Context.DISPLAY_SERVICE;
    public static final java.lang.String DOMAIN_VERIFICATION_SERVICE = android.content.Context.DOMAIN_VERIFICATION_SERVICE;
    public static final java.lang.String DOWNLOAD_SERVICE = android.content.Context.DOWNLOAD_SERVICE;
    public static final java.lang.String DROPBOX_SERVICE = android.content.Context.DROPBOX_SERVICE;
    public static final java.lang.String EUICC_SERVICE = android.content.Context.EUICC_SERVICE;
    public static final java.lang.String FINGERPRINT_SERVICE = android.content.Context.FINGERPRINT_SERVICE;
    public static final java.lang.String GAME_SERVICE = android.content.Context.GAME_SERVICE;
    public static final java.lang.String GRAMMATICAL_INFLECTION_SERVICE = android.content.Context.GRAMMATICAL_INFLECTION_SERVICE;
    public static final java.lang.String HARDWARE_PROPERTIES_SERVICE = android.content.Context.HARDWARE_PROPERTIES_SERVICE;
    public static final java.lang.String HEALTHCONNECT_SERVICE = android.content.Context.HEALTHCONNECT_SERVICE;
    public static final java.lang.String INPUT_METHOD_SERVICE = android.content.Context.INPUT_METHOD_SERVICE;
    public static final java.lang.String INPUT_SERVICE = android.content.Context.INPUT_SERVICE;
    public static final java.lang.String IPSEC_SERVICE = android.content.Context.IPSEC_SERVICE;
    public static final java.lang.String JOB_SCHEDULER_SERVICE = android.content.Context.JOB_SCHEDULER_SERVICE;
    public static final java.lang.String KEYGUARD_SERVICE = android.content.Context.KEYGUARD_SERVICE;
    public static final java.lang.String LAUNCHER_APPS_SERVICE = android.content.Context.LAUNCHER_APPS_SERVICE;
    public static final java.lang.String LAYOUT_INFLATER_SERVICE = android.content.Context.LAYOUT_INFLATER_SERVICE;
    public static final java.lang.String LOCALE_SERVICE = android.content.Context.LOCALE_SERVICE;
    public static final java.lang.String LOCATION_SERVICE = android.content.Context.LOCATION_SERVICE;
    public static final java.lang.String MEDIA_COMMUNICATION_SERVICE = android.content.Context.MEDIA_COMMUNICATION_SERVICE;
    public static final java.lang.String MEDIA_METRICS_SERVICE = android.content.Context.MEDIA_METRICS_SERVICE;
    public static final java.lang.String MEDIA_PROJECTION_SERVICE = android.content.Context.MEDIA_PROJECTION_SERVICE;
    public static final java.lang.String MEDIA_ROUTER_SERVICE = android.content.Context.MEDIA_ROUTER_SERVICE;
    public static final java.lang.String MEDIA_SESSION_SERVICE = android.content.Context.MEDIA_SESSION_SERVICE;
    public static final java.lang.String MIDI_SERVICE = android.content.Context.MIDI_SERVICE;
    public static final int MODE_APPEND = android.content.Context.MODE_APPEND;
    public static final int MODE_ENABLE_WRITE_AHEAD_LOGGING = android.content.Context.MODE_ENABLE_WRITE_AHEAD_LOGGING;
    public static final int MODE_MULTI_PROCESS = android.content.Context.MODE_MULTI_PROCESS;
    public static final int MODE_NO_LOCALIZED_COLLATORS = android.content.Context.MODE_NO_LOCALIZED_COLLATORS;
    public static final int MODE_PRIVATE = android.content.Context.MODE_PRIVATE;
    public static final int MODE_WORLD_READABLE = android.content.Context.MODE_WORLD_READABLE;
    public static final int MODE_WORLD_WRITEABLE = android.content.Context.MODE_WORLD_WRITEABLE;
    public static final java.lang.String NFC_SERVICE = android.content.Context.NFC_SERVICE;
    public static final java.lang.String NOTIFICATION_SERVICE = android.content.Context.NOTIFICATION_SERVICE;
    public static final java.lang.String NSD_SERVICE = android.content.Context.NSD_SERVICE;
    public static final java.lang.String OVERLAY_SERVICE = android.content.Context.OVERLAY_SERVICE;
    public static final java.lang.String PEOPLE_SERVICE = android.content.Context.PEOPLE_SERVICE;
    public static final java.lang.String PERFORMANCE_HINT_SERVICE = android.content.Context.PERFORMANCE_HINT_SERVICE;
    public static final java.lang.String PERSISTENT_DATA_BLOCK_SERVICE = android.content.Context.PERSISTENT_DATA_BLOCK_SERVICE;
    public static final java.lang.String POWER_SERVICE = android.content.Context.POWER_SERVICE;
    public static final java.lang.String PRINT_SERVICE = android.content.Context.PRINT_SERVICE;
    public static final java.lang.String PROFILING_SERVICE = android.content.Context.PROFILING_SERVICE;
    public static final int RECEIVER_EXPORTED = android.content.Context.RECEIVER_EXPORTED;
    public static final int RECEIVER_NOT_EXPORTED = android.content.Context.RECEIVER_NOT_EXPORTED;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = android.content.Context.RECEIVER_VISIBLE_TO_INSTANT_APPS;
    public static final java.lang.String RESTRICTIONS_SERVICE = android.content.Context.RESTRICTIONS_SERVICE;
    public static final java.lang.String ROLE_SERVICE = android.content.Context.ROLE_SERVICE;
    public static final java.lang.String SEARCH_SERVICE = android.content.Context.SEARCH_SERVICE;
    public static final java.lang.String SECURITY_STATE_SERVICE = android.content.Context.SECURITY_STATE_SERVICE;
    public static final java.lang.String SENSOR_SERVICE = android.content.Context.SENSOR_SERVICE;
    public static final java.lang.String SHORTCUT_SERVICE = android.content.Context.SHORTCUT_SERVICE;
    public static final java.lang.String STATUS_BAR_SERVICE = android.content.Context.STATUS_BAR_SERVICE;
    public static final java.lang.String STORAGE_SERVICE = android.content.Context.STORAGE_SERVICE;
    public static final java.lang.String STORAGE_STATS_SERVICE = android.content.Context.STORAGE_STATS_SERVICE;
    public static final java.lang.String SYSTEM_HEALTH_SERVICE = android.content.Context.SYSTEM_HEALTH_SERVICE;
    public static final java.lang.String TELECOM_SERVICE = android.content.Context.TELECOM_SERVICE;
    public static final java.lang.String TELEPHONY_IMS_SERVICE = android.content.Context.TELEPHONY_IMS_SERVICE;
    public static final java.lang.String TELEPHONY_SERVICE = android.content.Context.TELEPHONY_SERVICE;
    public static final java.lang.String TELEPHONY_SUBSCRIPTION_SERVICE = android.content.Context.TELEPHONY_SUBSCRIPTION_SERVICE;
    public static final java.lang.String TEXT_CLASSIFICATION_SERVICE = android.content.Context.TEXT_CLASSIFICATION_SERVICE;
    public static final java.lang.String TEXT_SERVICES_MANAGER_SERVICE = android.content.Context.TEXT_SERVICES_MANAGER_SERVICE;
    public static final java.lang.String TV_INPUT_SERVICE = android.content.Context.TV_INPUT_SERVICE;
    public static final java.lang.String TV_INTERACTIVE_APP_SERVICE = android.content.Context.TV_INTERACTIVE_APP_SERVICE;
    public static final java.lang.String UI_MODE_SERVICE = android.content.Context.UI_MODE_SERVICE;
    public static final java.lang.String USAGE_STATS_SERVICE = android.content.Context.USAGE_STATS_SERVICE;
    public static final java.lang.String USB_SERVICE = android.content.Context.USB_SERVICE;
    public static final java.lang.String USER_SERVICE = android.content.Context.USER_SERVICE;
    public static final java.lang.String VIBRATOR_MANAGER_SERVICE = android.content.Context.VIBRATOR_MANAGER_SERVICE;
    public static final java.lang.String VIBRATOR_SERVICE = android.content.Context.VIBRATOR_SERVICE;
    public static final java.lang.String VIRTUAL_DEVICE_SERVICE = android.content.Context.VIRTUAL_DEVICE_SERVICE;
    public static final java.lang.String VPN_MANAGEMENT_SERVICE = android.content.Context.VPN_MANAGEMENT_SERVICE;
    public static final java.lang.String WALLPAPER_SERVICE = android.content.Context.WALLPAPER_SERVICE;
    public static final java.lang.String WIFI_AWARE_SERVICE = android.content.Context.WIFI_AWARE_SERVICE;
    public static final java.lang.String WIFI_P2P_SERVICE = android.content.Context.WIFI_P2P_SERVICE;
    public static final java.lang.String WIFI_RTT_RANGING_SERVICE = android.content.Context.WIFI_RTT_RANGING_SERVICE;
    public static final java.lang.String WIFI_SERVICE = android.content.Context.WIFI_SERVICE;
    public static final java.lang.String WINDOW_SERVICE = android.content.Context.WINDOW_SERVICE;

    public static final class BindServiceFlags {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private BindServiceFlags(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.Context.BindServiceFlags wrap(android.content.Context.BindServiceFlags real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.Context.BindServiceFlags(real, (__DcgwBridgeToken) null);
        }

        public android.content.Context.BindServiceFlags getReal() {
            return (android.content.Context.BindServiceFlags) real;
        }

        public android.content.Context.BindServiceFlags unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.content.Context.BindServiceFlags of(long arg0) {
            return com.micklab.dcg.wrapper.android.content.Context.BindServiceFlags.wrap(android.content.Context.BindServiceFlags.of(arg0));
        }

    }
}
