// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.backup;

public final class BackupAgentHelper {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BackupAgentHelper(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.backup.BackupAgentHelper wrap(android.app.backup.BackupAgentHelper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.backup.BackupAgentHelper(real, (__DcgwBridgeToken) null);
    }

    public android.app.backup.BackupAgentHelper getReal() {
        return (android.app.backup.BackupAgentHelper) real;
    }

    public android.app.backup.BackupAgentHelper unwrap() {
        return getReal();
    }

    public BackupAgentHelper() {
        this(new android.app.backup.BackupAgentHelper(), (__DcgwBridgeToken) null);
    }

    public void addHelper(java.lang.String arg0, com.micklab.dcg.wrapper.android.app.backup.BackupHelper arg1) {
        ((android.app.backup.BackupAgentHelper) real).addHelper(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void onBackup(com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg0, com.micklab.dcg.wrapper.android.app.backup.BackupDataOutput arg1, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg2) throws java.io.IOException {
        ((android.app.backup.BackupAgentHelper) real).onBackup(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void onRestore(com.micklab.dcg.wrapper.android.app.backup.BackupDataInput arg0, int arg1, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg2) throws java.io.IOException {
        ((android.app.backup.BackupAgentHelper) real).onRestore(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

}
