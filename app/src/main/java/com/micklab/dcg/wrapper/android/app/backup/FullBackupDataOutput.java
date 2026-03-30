// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.backup;

public final class FullBackupDataOutput {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FullBackupDataOutput(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.backup.FullBackupDataOutput wrap(android.app.backup.FullBackupDataOutput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.backup.FullBackupDataOutput(real, (__DcgwBridgeToken) null);
    }

    public android.app.backup.FullBackupDataOutput getReal() {
        return (android.app.backup.FullBackupDataOutput) real;
    }

    public android.app.backup.FullBackupDataOutput unwrap() {
        return getReal();
    }

    public long getQuota() {
        return ((android.app.backup.FullBackupDataOutput) real).getQuota();
    }

    public int getTransportFlags() {
        return ((android.app.backup.FullBackupDataOutput) real).getTransportFlags();
    }

}
