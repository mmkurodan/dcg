// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.database.sqlite;

public final class SQLiteAbortException {
    private final android.database.sqlite.SQLiteAbortException real;

    public SQLiteAbortException(android.database.sqlite.SQLiteAbortException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.database.sqlite.SQLiteAbortException wrap(android.database.sqlite.SQLiteAbortException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.database.sqlite.SQLiteAbortException(real);
    }

    public android.database.sqlite.SQLiteAbortException unwrap() {
        return real;
    }

    public SQLiteAbortException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteAbortException#android.database.sqlite.SQLiteAbortException()");
    }

    public SQLiteAbortException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.database.sqlite.SQLiteAbortException#android.database.sqlite.SQLiteAbortException(java.lang.String)");
    }

}
