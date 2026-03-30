// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.usage;

public final class StorageStatsManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StorageStatsManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.usage.StorageStatsManager wrap(android.app.usage.StorageStatsManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.StorageStatsManager(real, (__DcgwBridgeToken) null);
    }

    public android.app.usage.StorageStatsManager getReal() {
        return (android.app.usage.StorageStatsManager) real;
    }

    public android.app.usage.StorageStatsManager unwrap() {
        return getReal();
    }

    public long getFreeBytes(java.util.UUID arg0) throws java.io.IOException {
        return ((android.app.usage.StorageStatsManager) real).getFreeBytes(arg0);
    }

    public long getTotalBytes(java.util.UUID arg0) throws java.io.IOException {
        return ((android.app.usage.StorageStatsManager) real).getTotalBytes(arg0);
    }

    public com.micklab.dcg.wrapper.android.app.usage.ExternalStorageStats queryExternalStatsForUser(java.util.UUID arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.app.usage.ExternalStorageStats.wrap(((android.app.usage.StorageStatsManager) real).queryExternalStatsForUser(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public com.micklab.dcg.wrapper.android.app.usage.StorageStats queryStatsForPackage(java.util.UUID arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.UserHandle arg2) throws java.io.IOException, android.content.pm.PackageManager.NameNotFoundException {
        return com.micklab.dcg.wrapper.android.app.usage.StorageStats.wrap(((android.app.usage.StorageStatsManager) real).queryStatsForPackage(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.app.usage.StorageStats queryStatsForUid(java.util.UUID arg0, int arg1) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.app.usage.StorageStats.wrap(((android.app.usage.StorageStatsManager) real).queryStatsForUid(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.app.usage.StorageStats queryStatsForUser(java.util.UUID arg0, com.micklab.dcg.wrapper.android.os.UserHandle arg1) throws java.io.IOException {
        return com.micklab.dcg.wrapper.android.app.usage.StorageStats.wrap(((android.app.usage.StorageStatsManager) real).queryStatsForUser(arg0, arg1 == null ? null : arg1.getReal()));
    }

}
