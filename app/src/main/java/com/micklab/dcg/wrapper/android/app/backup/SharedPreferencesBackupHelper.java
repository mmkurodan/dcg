// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.backup;

public final class SharedPreferencesBackupHelper {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SharedPreferencesBackupHelper(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.backup.SharedPreferencesBackupHelper wrap(android.app.backup.SharedPreferencesBackupHelper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.backup.SharedPreferencesBackupHelper(real, (__DcgwBridgeToken) null);
    }

    public android.app.backup.SharedPreferencesBackupHelper getReal() {
        return (android.app.backup.SharedPreferencesBackupHelper) real;
    }

    public android.app.backup.SharedPreferencesBackupHelper unwrap() {
        return getReal();
    }

    public SharedPreferencesBackupHelper(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String... arg1) {
        this(new android.app.backup.SharedPreferencesBackupHelper(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public void performBackup(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, com.micklab.dcg.wrapper.android.app.backup.BackupDataOutput arg1, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg2) {
        ((android.app.backup.SharedPreferencesBackupHelper) real).performBackup(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void restoreEntity(com.micklab.dcg.wrapper.android.app.backup.BackupDataInputStream arg0) {
        ((android.app.backup.SharedPreferencesBackupHelper) real).restoreEntity(arg0 == null ? null : arg0.getReal());
    }

    public void writeNewStateDescription(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0) {
        ((android.app.backup.SharedPreferencesBackupHelper) real).writeNewStateDescription(arg0 == null ? null : arg0.getReal());
    }

}
