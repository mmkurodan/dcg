// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.backup;

public final class BackupDataInputStream {
    private final android.app.backup.BackupDataInputStream real;

    public BackupDataInputStream(android.app.backup.BackupDataInputStream real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.backup.BackupDataInputStream wrap(android.app.backup.BackupDataInputStream real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.backup.BackupDataInputStream(real);
    }

    public android.app.backup.BackupDataInputStream unwrap() {
        return real;
    }

    public java.lang.String getKey() {
        return real.getKey();
    }

    public int read() throws java.io.IOException {
        return real.read();
    }

    public int read(byte[] arg0) throws java.io.IOException {
        return real.read(arg0);
    }

    public int read(byte[] arg0, int arg1, int arg2) throws java.io.IOException {
        return real.read(arg0, arg1, arg2);
    }

    public int size() {
        return real.size();
    }

}
