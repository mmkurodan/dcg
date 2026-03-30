// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.backup;

public final class FileBackupHelper {
    private final android.app.backup.FileBackupHelper real;

    public FileBackupHelper(android.app.backup.FileBackupHelper real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.backup.FileBackupHelper wrap(android.app.backup.FileBackupHelper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.backup.FileBackupHelper(real);
    }

    public android.app.backup.FileBackupHelper unwrap() {
        return real;
    }

    public FileBackupHelper(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String... arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.app.backup.FileBackupHelper#android.app.backup.FileBackupHelper(android.content.Context,[Ljava.lang.String;)");
    }

    public void performBackup(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, com.micklab.dcg.wrapper.android.app.backup.BackupDataOutput arg1, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg2) {
        real.performBackup(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void restoreEntity(com.micklab.dcg.wrapper.android.app.backup.BackupDataInputStream arg0) {
        real.restoreEntity(arg0 == null ? null : arg0.unwrap());
    }

    public void writeNewStateDescription(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0) {
        real.writeNewStateDescription(arg0 == null ? null : arg0.unwrap());
    }

}
