// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.backup;

public final class BackupDataInput {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BackupDataInput(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.backup.BackupDataInput wrap(android.app.backup.BackupDataInput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.backup.BackupDataInput(real, (__DcgwBridgeToken) null);
    }

    public android.app.backup.BackupDataInput getReal() {
        return (android.app.backup.BackupDataInput) real;
    }

    public android.app.backup.BackupDataInput unwrap() {
        return getReal();
    }

    public int getDataSize() {
        return ((android.app.backup.BackupDataInput) real).getDataSize();
    }

    public java.lang.String getKey() {
        return ((android.app.backup.BackupDataInput) real).getKey();
    }

    public int readEntityData(byte[] arg0, int arg1, int arg2) throws java.io.IOException {
        return ((android.app.backup.BackupDataInput) real).readEntityData(arg0, arg1, arg2);
    }

    public boolean readNextHeader() throws java.io.IOException {
        return ((android.app.backup.BackupDataInput) real).readNextHeader();
    }

    public void skipEntityData() throws java.io.IOException {
        ((android.app.backup.BackupDataInput) real).skipEntityData();
    }

}
