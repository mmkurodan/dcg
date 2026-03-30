// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.backup;

public final class BackupManager {
    private final android.app.backup.BackupManager real;

    public BackupManager(android.app.backup.BackupManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.backup.BackupManager wrap(android.app.backup.BackupManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.backup.BackupManager(real);
    }

    public android.app.backup.BackupManager unwrap() {
        return real;
    }

    public BackupManager(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.app.backup.BackupManager(arg0 == null ? null : arg0.unwrap()));
    }

    public void dataChanged() {
        real.dataChanged();
    }

    public static void dataChanged(java.lang.String arg0) {
        android.app.backup.BackupManager.dataChanged(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.UserHandle getUserForAncestralSerialNumber(long arg0) {
        return com.micklab.dcg.wrapper.android.os.UserHandle.wrap(real.getUserForAncestralSerialNumber(arg0));
    }

    public int requestRestore(com.micklab.dcg.wrapper.android.app.backup.RestoreObserver arg0) {
        return real.requestRestore(arg0 == null ? null : arg0.unwrap());
    }

}
