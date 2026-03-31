// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.backup;

public final class BackupAgent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BackupAgent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.backup.BackupAgent wrap(android.app.backup.BackupAgent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.backup.BackupAgent(real, (__DcgwBridgeToken) null);
    }

    public android.app.backup.BackupAgent getReal() {
        return (android.app.backup.BackupAgent) real;
    }

    public android.app.backup.BackupAgent unwrap() {
        return getReal();
    }

    public void fullBackupFile(java.io.File arg0, com.micklab.dcg.wrapper.android.app.backup.FullBackupDataOutput arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.backup.BackupAgent#fullBackupFile(java.io.File,android.app.backup.FullBackupDataOutput)");
    }

    public void onBackup(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, com.micklab.dcg.wrapper.android.app.backup.BackupDataOutput arg1, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg2) throws java.io.IOException {
        ((android.app.backup.BackupAgent) real).onBackup(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void onCreate() {
        ((android.app.backup.BackupAgent) real).onCreate();
    }

    public void onDestroy() {
        ((android.app.backup.BackupAgent) real).onDestroy();
    }

    public void onFullBackup(com.micklab.dcg.wrapper.android.app.backup.FullBackupDataOutput arg0) throws java.io.IOException {
        ((android.app.backup.BackupAgent) real).onFullBackup(arg0 == null ? null : arg0.getReal());
    }

    public void onQuotaExceeded(long arg0, long arg1) {
        ((android.app.backup.BackupAgent) real).onQuotaExceeded(arg0, arg1);
    }

    public void onRestore(com.micklab.dcg.wrapper.android.app.backup.BackupDataInput arg0, int arg1, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg2) throws java.io.IOException {
        ((android.app.backup.BackupAgent) real).onRestore(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void onRestore(com.micklab.dcg.wrapper.android.app.backup.BackupDataInput arg0, long arg1, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg2) throws java.io.IOException {
        ((android.app.backup.BackupAgent) real).onRestore(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void onRestoreFile(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, long arg1, java.io.File arg2, int arg3, long arg4, long arg5) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.backup.BackupAgent#onRestoreFile(android.os.ParcelFileDescriptor,long,java.io.File,int,long,long)");
    }

    public void onRestoreFinished() {
        ((android.app.backup.BackupAgent) real).onRestoreFinished();
    }

    public static final int FLAG_CLIENT_SIDE_ENCRYPTION_ENABLED = android.app.backup.BackupAgent.FLAG_CLIENT_SIDE_ENCRYPTION_ENABLED;
    public static final int FLAG_DEVICE_TO_DEVICE_TRANSFER = android.app.backup.BackupAgent.FLAG_DEVICE_TO_DEVICE_TRANSFER;
    public static final int TYPE_DIRECTORY = android.app.backup.BackupAgent.TYPE_DIRECTORY;

}
