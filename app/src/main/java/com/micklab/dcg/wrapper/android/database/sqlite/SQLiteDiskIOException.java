// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteDiskIOException {
    private final android.database.sqlite.SQLiteDiskIOException real;

    public SQLiteDiskIOException(android.database.sqlite.SQLiteDiskIOException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDiskIOException wrap(android.database.sqlite.SQLiteDiskIOException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteDiskIOException(real);
    }

    public android.database.sqlite.SQLiteDiskIOException unwrap() {
        return real;
    }

    public SQLiteDiskIOException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDiskIOException#android.database.sqlite.SQLiteDiskIOException()");
    }

    public SQLiteDiskIOException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteDiskIOException#android.database.sqlite.SQLiteDiskIOException(java.lang.String)");
    }

}
