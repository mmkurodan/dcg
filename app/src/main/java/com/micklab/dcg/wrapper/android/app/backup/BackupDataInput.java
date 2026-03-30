// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.backup;

public final class BackupDataInput {
    private final android.app.backup.BackupDataInput real;

    public BackupDataInput(android.app.backup.BackupDataInput real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.backup.BackupDataInput wrap(android.app.backup.BackupDataInput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.backup.BackupDataInput(real);
    }

    public android.app.backup.BackupDataInput unwrap() {
        return real;
    }

    public int getDataSize() {
        return real.getDataSize();
    }

    public java.lang.String getKey() {
        return real.getKey();
    }

    public int readEntityData(byte[] arg0, int arg1, int arg2) throws java.io.IOException {
        return real.readEntityData(arg0, arg1, arg2);
    }

    public boolean readNextHeader() throws java.io.IOException {
        return real.readNextHeader();
    }

    public void skipEntityData() throws java.io.IOException {
        real.skipEntityData();
    }

}
