// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class Environment {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Environment(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.Environment wrap(android.os.Environment real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.Environment(real, (__DcgwBridgeToken) null);
    }

    public android.os.Environment getReal() {
        return (android.os.Environment) real;
    }

    public android.os.Environment unwrap() {
        return getReal();
    }

    public Environment() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Environment#android.os.Environment()");
    }

    public static java.io.File getDataDirectory() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Environment#getDataDirectory()");
    }

    public static java.io.File getDownloadCacheDirectory() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Environment#getDownloadCacheDirectory()");
    }

    public static java.io.File getExternalStorageDirectory() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Environment#getExternalStorageDirectory()");
    }

    public static java.io.File getExternalStoragePublicDirectory(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Environment#getExternalStoragePublicDirectory(java.lang.String)");
    }

    public static java.lang.String getExternalStorageState() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Environment#getExternalStorageState()");
    }

    public static java.lang.String getExternalStorageState(java.io.File arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Environment#getExternalStorageState(java.io.File)");
    }

    public static java.io.File getRootDirectory() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Environment#getRootDirectory()");
    }

    public static java.io.File getStorageDirectory() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Environment#getStorageDirectory()");
    }

    public static java.lang.String getStorageState(java.io.File arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Environment#getStorageState(java.io.File)");
    }

    public static boolean isExternalStorageEmulated() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Environment#isExternalStorageEmulated()");
    }

    public static boolean isExternalStorageEmulated(java.io.File arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Environment#isExternalStorageEmulated(java.io.File)");
    }

    public static boolean isExternalStorageLegacy() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Environment#isExternalStorageLegacy()");
    }

    public static boolean isExternalStorageLegacy(java.io.File arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Environment#isExternalStorageLegacy(java.io.File)");
    }

    public static boolean isExternalStorageManager() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Environment#isExternalStorageManager()");
    }

    public static boolean isExternalStorageManager(java.io.File arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Environment#isExternalStorageManager(java.io.File)");
    }

    public static boolean isExternalStorageRemovable() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Environment#isExternalStorageRemovable()");
    }

    public static boolean isExternalStorageRemovable(java.io.File arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.Environment#isExternalStorageRemovable(java.io.File)");
    }


}
