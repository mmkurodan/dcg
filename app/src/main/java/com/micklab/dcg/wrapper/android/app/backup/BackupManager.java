// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.backup;

public final class BackupManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BackupManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.backup.BackupManager wrap(android.app.backup.BackupManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.backup.BackupManager(real, (__DcgwBridgeToken) null);
    }

    public android.app.backup.BackupManager getReal() {
        return (android.app.backup.BackupManager) real;
    }

    public android.app.backup.BackupManager unwrap() {
        return getReal();
    }

    public BackupManager(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.app.backup.BackupManager(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public void dataChanged() {
        ((android.app.backup.BackupManager) real).dataChanged();
    }

    public static void dataChanged(java.lang.String arg0) {
        android.app.backup.BackupManager.dataChanged(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.UserHandle getUserForAncestralSerialNumber(long arg0) {
        return com.micklab.dcg.wrapper.android.os.UserHandle.wrap(((android.app.backup.BackupManager) real).getUserForAncestralSerialNumber(arg0));
    }

    public int requestRestore(com.micklab.dcg.wrapper.android.app.backup.RestoreObserver arg0) {
        return ((android.app.backup.BackupManager) real).requestRestore(arg0 == null ? null : arg0.getReal());
    }

}
