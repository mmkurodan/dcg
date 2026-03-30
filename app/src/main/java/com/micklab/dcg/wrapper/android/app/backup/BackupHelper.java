// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.backup;

public final class BackupHelper {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BackupHelper(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.backup.BackupHelper wrap(android.app.backup.BackupHelper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.backup.BackupHelper(real, (__DcgwBridgeToken) null);
    }

    public android.app.backup.BackupHelper getReal() {
        return (android.app.backup.BackupHelper) real;
    }

    public android.app.backup.BackupHelper unwrap() {
        return getReal();
    }

    public void performBackup(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, com.micklab.dcg.wrapper.android.app.backup.BackupDataOutput arg1, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg2) {
        ((android.app.backup.BackupHelper) real).performBackup(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void restoreEntity(com.micklab.dcg.wrapper.android.app.backup.BackupDataInputStream arg0) {
        ((android.app.backup.BackupHelper) real).restoreEntity(arg0 == null ? null : arg0.getReal());
    }

    public void writeNewStateDescription(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0) {
        ((android.app.backup.BackupHelper) real).writeNewStateDescription(arg0 == null ? null : arg0.getReal());
    }

}
