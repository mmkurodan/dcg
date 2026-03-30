// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.backup;

public final class BackupDataInputStream {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BackupDataInputStream(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.backup.BackupDataInputStream wrap(android.app.backup.BackupDataInputStream real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.backup.BackupDataInputStream(real, (__DcgwBridgeToken) null);
    }

    public android.app.backup.BackupDataInputStream getReal() {
        return (android.app.backup.BackupDataInputStream) real;
    }

    public android.app.backup.BackupDataInputStream unwrap() {
        return getReal();
    }

    public java.lang.String getKey() {
        return ((android.app.backup.BackupDataInputStream) real).getKey();
    }

    public int read() throws java.io.IOException {
        return ((android.app.backup.BackupDataInputStream) real).read();
    }

    public int read(byte[] arg0) throws java.io.IOException {
        return ((android.app.backup.BackupDataInputStream) real).read(arg0);
    }

    public int read(byte[] arg0, int arg1, int arg2) throws java.io.IOException {
        return ((android.app.backup.BackupDataInputStream) real).read(arg0, arg1, arg2);
    }

    public int size() {
        return ((android.app.backup.BackupDataInputStream) real).size();
    }

}
