// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.backup;

public final class BackupAgent {
    private final android.app.backup.BackupAgent real;

    public BackupAgent(android.app.backup.BackupAgent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.backup.BackupAgent wrap(android.app.backup.BackupAgent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.backup.BackupAgent(real);
    }

    public android.app.backup.BackupAgent unwrap() {
        return real;
    }

    public void fullBackupFile(java.io.File arg0, com.micklab.dcg.wrapper.android.app.backup.FullBackupDataOutput arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.backup.BackupAgent#fullBackupFile(java.io.File,android.app.backup.FullBackupDataOutput)");
    }

    public void onBackup(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, com.micklab.dcg.wrapper.android.app.backup.BackupDataOutput arg1, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg2) throws java.io.IOException {
        real.onBackup(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void onCreate() {
        real.onCreate();
    }

    public void onDestroy() {
        real.onDestroy();
    }

    public void onFullBackup(com.micklab.dcg.wrapper.android.app.backup.FullBackupDataOutput arg0) throws java.io.IOException {
        real.onFullBackup(arg0 == null ? null : arg0.unwrap());
    }

    public void onQuotaExceeded(long arg0, long arg1) {
        real.onQuotaExceeded(arg0, arg1);
    }

    public void onRestore(com.micklab.dcg.wrapper.android.app.backup.BackupDataInput arg0, long arg1, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg2) throws java.io.IOException {
        real.onRestore(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void onRestore(com.micklab.dcg.wrapper.android.app.backup.BackupDataInput arg0, int arg1, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg2) throws java.io.IOException {
        real.onRestore(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void onRestoreFile(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, long arg1, java.io.File arg2, int arg3, long arg4, long arg5) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.backup.BackupAgent#onRestoreFile(android.os.ParcelFileDescriptor,long,java.io.File,int,long,long)");
    }

    public void onRestoreFinished() {
        real.onRestoreFinished();
    }

    public static final int FLAG_CLIENT_SIDE_ENCRYPTION_ENABLED = android.app.backup.BackupAgent.FLAG_CLIENT_SIDE_ENCRYPTION_ENABLED;
    public static final int FLAG_DEVICE_TO_DEVICE_TRANSFER = android.app.backup.BackupAgent.FLAG_DEVICE_TO_DEVICE_TRANSFER;
    public static final int TYPE_DIRECTORY = android.app.backup.BackupAgent.TYPE_DIRECTORY;

}
