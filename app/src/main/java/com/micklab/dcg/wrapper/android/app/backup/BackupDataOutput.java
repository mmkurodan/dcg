// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.backup;

public final class BackupDataOutput {
    private final android.app.backup.BackupDataOutput real;

    public BackupDataOutput(android.app.backup.BackupDataOutput real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.backup.BackupDataOutput wrap(android.app.backup.BackupDataOutput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.backup.BackupDataOutput(real);
    }

    public android.app.backup.BackupDataOutput unwrap() {
        return real;
    }

    public long getQuota() {
        return real.getQuota();
    }

    public int getTransportFlags() {
        return real.getTransportFlags();
    }

    public int writeEntityData(byte[] arg0, int arg1) throws java.io.IOException {
        return real.writeEntityData(arg0, arg1);
    }

    public int writeEntityHeader(java.lang.String arg0, int arg1) throws java.io.IOException {
        return real.writeEntityHeader(arg0, arg1);
    }

}
