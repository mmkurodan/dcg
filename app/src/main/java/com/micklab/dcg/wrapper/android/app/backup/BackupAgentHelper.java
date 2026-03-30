// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.backup;

public final class BackupAgentHelper {
    private final android.app.backup.BackupAgentHelper real;

    public BackupAgentHelper(android.app.backup.BackupAgentHelper real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.backup.BackupAgentHelper wrap(android.app.backup.BackupAgentHelper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.backup.BackupAgentHelper(real);
    }

    public android.app.backup.BackupAgentHelper unwrap() {
        return real;
    }

    public BackupAgentHelper() {
        this(new android.app.backup.BackupAgentHelper());
    }

    public void addHelper(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.backup.BackupHelper arg1) {
        real.addHelper(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void onBackup(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, com.micklab.dcg.wrapper.android.app.backup.BackupDataOutput arg1, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg2) throws java.io.IOException {
        real.onBackup(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void onRestore(com.micklab.dcg.wrapper.android.app.backup.BackupDataInput arg0, int arg1, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg2) throws java.io.IOException {
        real.onRestore(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

}
