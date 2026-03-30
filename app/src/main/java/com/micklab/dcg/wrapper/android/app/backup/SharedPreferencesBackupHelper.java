// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.backup;

public final class SharedPreferencesBackupHelper {
    private final android.app.backup.SharedPreferencesBackupHelper real;

    public SharedPreferencesBackupHelper(android.app.backup.SharedPreferencesBackupHelper real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.backup.SharedPreferencesBackupHelper wrap(android.app.backup.SharedPreferencesBackupHelper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.backup.SharedPreferencesBackupHelper(real);
    }

    public android.app.backup.SharedPreferencesBackupHelper unwrap() {
        return real;
    }

    public SharedPreferencesBackupHelper(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String... arg1) {
        this(new android.app.backup.SharedPreferencesBackupHelper(arg0 == null ? null : arg0.unwrap(), arg1));
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
