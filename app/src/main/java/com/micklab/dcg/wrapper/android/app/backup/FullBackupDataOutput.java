// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.backup;

public final class FullBackupDataOutput {
    private final android.app.backup.FullBackupDataOutput real;

    public FullBackupDataOutput(android.app.backup.FullBackupDataOutput real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.backup.FullBackupDataOutput wrap(android.app.backup.FullBackupDataOutput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.backup.FullBackupDataOutput(real);
    }

    public android.app.backup.FullBackupDataOutput unwrap() {
        return real;
    }

    public long getQuota() {
        return real.getQuota();
    }

    public int getTransportFlags() {
        return real.getTransportFlags();
    }

}
