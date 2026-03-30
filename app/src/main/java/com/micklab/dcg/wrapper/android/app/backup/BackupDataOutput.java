// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.backup;

public final class BackupDataOutput {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BackupDataOutput(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.backup.BackupDataOutput wrap(android.app.backup.BackupDataOutput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.backup.BackupDataOutput(real, (__DcgwBridgeToken) null);
    }

    public android.app.backup.BackupDataOutput getReal() {
        return (android.app.backup.BackupDataOutput) real;
    }

    public android.app.backup.BackupDataOutput unwrap() {
        return getReal();
    }

    public long getQuota() {
        return ((android.app.backup.BackupDataOutput) real).getQuota();
    }

    public int getTransportFlags() {
        return ((android.app.backup.BackupDataOutput) real).getTransportFlags();
    }

    public int writeEntityData(byte[] arg0, int arg1) throws java.io.IOException {
        return ((android.app.backup.BackupDataOutput) real).writeEntityData(arg0, arg1);
    }

    public int writeEntityHeader(java.lang.String arg0, int arg1) throws java.io.IOException {
        return ((android.app.backup.BackupDataOutput) real).writeEntityHeader(arg0, arg1);
    }

}
